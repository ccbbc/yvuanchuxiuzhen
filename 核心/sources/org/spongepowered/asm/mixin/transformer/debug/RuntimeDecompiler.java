package org.spongepowered.asm.mixin.transformer.debug;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;
import com.google.common.io.MoreFiles;
import com.google.common.io.RecursiveDeleteOption;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.jar.Manifest;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.java.decompiler.main.Fernflower;
import org.jetbrains.java.decompiler.main.extern.IBytecodeProvider;
import org.jetbrains.java.decompiler.main.extern.IFernflowerLogger;
import org.jetbrains.java.decompiler.main.extern.IResultSaver;
import org.jetbrains.java.decompiler.util.InterpreterUtil;
import org.spongepowered.asm.mixin.transformer.ext.IDecompiler;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/debug/RuntimeDecompiler.class */
public class RuntimeDecompiler extends IFernflowerLogger implements IDecompiler, IResultSaver {
    private static final Level[] SEVERITY_LEVELS = {Level.TRACE, Level.INFO, Level.WARN, Level.ERROR};
    private final File outputPath;
    private final Map<String, Object> options = ImmutableMap.builder().put("din", "0").put("rbr", "0").put("dgs", "1").put("asc", "1").put("den", "1").put("hdc", "1").put("ind", "    ").build();
    protected final Logger logger = LogManager.getLogger("fernflower");

    public RuntimeDecompiler(File outputPath) {
        this.outputPath = outputPath;
        if (this.outputPath.exists()) {
            try {
                MoreFiles.deleteRecursively(this.outputPath.toPath(), new RecursiveDeleteOption[]{RecursiveDeleteOption.ALLOW_INSECURE});
            } catch (IOException ex) {
                this.logger.debug("Error cleaning output directory: {}", new Object[]{ex.getMessage()});
            }
        }
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IDecompiler
    public void decompile(File file) {
        try {
            Fernflower fernflower = new Fernflower(new IBytecodeProvider() { // from class: org.spongepowered.asm.mixin.transformer.debug.RuntimeDecompiler.1
                private byte[] byteCode;

                public byte[] getBytecode(String externalPath, String internalPath) throws IOException {
                    if (this.byteCode == null) {
                        this.byteCode = InterpreterUtil.getBytes(new File(externalPath));
                    }
                    return this.byteCode;
                }
            }, this, this.options, this);
            fernflower.getStructContext().addSpace(file, true);
            fernflower.decompileContext();
        } catch (Throwable th) {
            this.logger.warn("Decompilation error while processing {}", new Object[]{file.getName()});
        }
    }

    public void saveFolder(String path) {
    }

    public void saveClassFile(String path, String qualifiedName, String entryName, String content, int[] mapping) {
        File file = new File(this.outputPath, qualifiedName + ".java");
        file.getParentFile().mkdirs();
        try {
            this.logger.info("Writing {}", new Object[]{file.getAbsolutePath()});
            Files.write(content, file, Charsets.UTF_8);
        } catch (IOException ex) {
            writeMessage("Cannot write source file " + file, ex);
        }
    }

    public void startReadingClass(String className) {
        this.logger.info("Decompiling {}", new Object[]{className});
    }

    public void writeMessage(String message, IFernflowerLogger.Severity severity) {
        this.logger.log(SEVERITY_LEVELS[severity.ordinal()], message);
    }

    public void writeMessage(String message, Throwable t) {
        this.logger.warn("{} {}: {}", new Object[]{message, t.getClass().getSimpleName(), t.getMessage()});
    }

    public void writeMessage(String message, IFernflowerLogger.Severity severity, Throwable t) {
        this.logger.log(SEVERITY_LEVELS[severity.ordinal()], message, t);
    }

    public void copyFile(String source, String path, String entryName) {
    }

    public void createArchive(String path, String archiveName, Manifest manifest) {
    }

    public void saveDirEntry(String path, String archiveName, String entryName) {
    }

    public void copyEntry(String source, String path, String archiveName, String entry) {
    }

    public void saveClassEntry(String path, String archiveName, String qualifiedName, String entryName, String content) {
    }

    public void closeArchive(String path, String archiveName) {
    }
}
