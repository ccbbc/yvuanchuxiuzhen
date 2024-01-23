package org.spongepowered.asm.mixin.transformer;

import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.IClassGenerator;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.perf.Profiler;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinClassGenerator.class */
public class MixinClassGenerator {
    static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final Extensions extensions;
    private final Profiler profiler = MixinEnvironment.getProfiler();
    private final IMixinAuditTrail auditTrail = MixinService.getService().getAuditTrail();

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixinClassGenerator(MixinEnvironment environment, Extensions extensions) {
        this.extensions = extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean generateClass(MixinEnvironment environment, String name, ClassNode classNode) {
        if (name == null) {
            logger.warn("MixinClassGenerator tried to generate a class with no name!");
            return false;
        }
        for (IClassGenerator generator : this.extensions.getGenerators()) {
            Profiler.Section genTimer = this.profiler.begin("generator", generator.getClass().getSimpleName().toLowerCase(Locale.ROOT));
            boolean success = generator.generate(name, classNode);
            genTimer.end();
            if (success) {
                if (this.auditTrail != null) {
                    this.auditTrail.onGenerate(name, generator.getName());
                }
                this.extensions.export(environment, name.replace('.', '/'), false, classNode);
                return true;
            }
        }
        return false;
    }
}
