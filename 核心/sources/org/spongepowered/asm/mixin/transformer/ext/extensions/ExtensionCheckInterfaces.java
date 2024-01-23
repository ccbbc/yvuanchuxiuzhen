package org.spongepowered.asm.mixin.transformer.ext.extensions;

import com.google.common.base.Charsets;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.io.Files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.SignaturePrinter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ext/extensions/ExtensionCheckInterfaces.class */
public class ExtensionCheckInterfaces implements IExtension {
    private static final String AUDIT_DIR = "audit";
    private static final String IMPL_REPORT_FILENAME = "mixin_implementation_report";
    private static final String IMPL_REPORT_CSV_FILENAME = "mixin_implementation_report.csv";
    private static final String IMPL_REPORT_TXT_FILENAME = "mixin_implementation_report.txt";
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final File csv;
    private final File report;
    private final Multimap<ClassInfo, ClassInfo.Method> interfaceMethods = HashMultimap.create();
    private boolean strict;

    public ExtensionCheckInterfaces() {
        File debugOutputFolder = new File(Constants.DEBUG_OUTPUT_DIR, AUDIT_DIR);
        debugOutputFolder.mkdirs();
        this.csv = new File(debugOutputFolder, IMPL_REPORT_CSV_FILENAME);
        this.report = new File(debugOutputFolder, IMPL_REPORT_TXT_FILENAME);
        this.csv.getParentFile().mkdirs();
        try {
            Files.write("Class,Method,Signature,Interface\n", this.csv, Charsets.ISO_8859_1);
        } catch (IOException e) {
        }
        try {
            String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            Files.write("Mixin Implementation Report generated on " + dateTime + "\n", this.report, Charsets.ISO_8859_1);
        } catch (IOException e2) {
        }
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public boolean checkActive(MixinEnvironment environment) {
        this.strict = environment.getOption(MixinEnvironment.Option.CHECK_IMPLEMENTS_STRICT);
        return environment.getOption(MixinEnvironment.Option.CHECK_IMPLEMENTS);
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public void preApply(ITargetClassContext context) {
        ClassInfo targetClassInfo = context.getClassInfo();
        for (ClassInfo.Method m : targetClassInfo.getInterfaceMethods(false)) {
            this.interfaceMethods.put(targetClassInfo, m);
        }
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public void postApply(ITargetClassContext context) {
        ClassInfo targetClassInfo = context.getClassInfo();
        if (targetClassInfo.isAbstract() && !this.strict) {
            logger.info("{} is skipping abstract target {}", new Object[]{getClass().getSimpleName(), context});
            return;
        }
        String className = targetClassInfo.getName().replace('/', '.');
        int missingMethodCount = 0;
        PrettyPrinter printer = new PrettyPrinter();
        printer.add("Class: %s", className).hr();
        printer.add("%-32s %-47s  %s", "Return Type", "Missing Method", "From Interface").hr();
        Set<ClassInfo.Method> interfaceMethods = targetClassInfo.getInterfaceMethods(true);
        Set<ClassInfo.Method> implementedMethods = new HashSet<>(targetClassInfo.getSuperClass().getInterfaceMethods(true));
        implementedMethods.addAll(this.interfaceMethods.removeAll(targetClassInfo));
        for (ClassInfo.Method method : interfaceMethods) {
            ClassInfo.Method found = targetClassInfo.findMethodInHierarchy(method.getName(), method.getDesc(), ClassInfo.SearchType.ALL_CLASSES, ClassInfo.Traversal.ALL);
            if (found == null || found.isAbstract()) {
                if (!implementedMethods.contains(method)) {
                    if (missingMethodCount > 0) {
                        printer.add();
                    }
                    SignaturePrinter signaturePrinter = new SignaturePrinter(method.getName(), method.getDesc()).setModifiers("");
                    String iface = method.getOwner().getName().replace('/', '.');
                    missingMethodCount++;
                    printer.add("%-32s%s", signaturePrinter.getReturnType(), signaturePrinter);
                    printer.add("%-80s  %s", "", iface);
                    appendToCSVReport(className, method, iface);
                }
            }
        }
        if (missingMethodCount > 0) {
            printer.hr().add("%82s%s: %d", "", "Total unimplemented", Integer.valueOf(missingMethodCount));
            printer.print(System.err);
            appendToTextReport(printer);
        }
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public void export(MixinEnvironment env, String name, boolean force, ClassNode classNode) {
    }

    private void appendToCSVReport(String className, ClassInfo.Method method, String iface) {
        try {
            Files.append(String.format("%s,%s,%s,%s\n", className, method.getName(), method.getDesc(), iface), this.csv, Charsets.ISO_8859_1);
        } catch (IOException e) {
        }
    }

    private void appendToTextReport(PrettyPrinter printer) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(this.report, true);
            PrintStream stream = new PrintStream(fos);
            stream.print("\n");
            printer.print(stream);
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    logger.catching(ex);
                }
            }
        } catch (Exception e) {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex2) {
                    logger.catching(ex2);
                }
            }
        } catch (Throwable th) {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex3) {
                    logger.catching(ex3);
                }
            }
            throw th;
        }
    }
}
