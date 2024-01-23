package org.spongepowered.asm.mixin.transformer;

import cpw.mods.modlauncher.serviceapi.ILaunchPluginService;
import java.util.EnumSet;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.IClassProcessor;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.launch.Phases;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.asm.service.ISyntheticClassRegistry;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinTransformationHandler.class */
public class MixinTransformationHandler implements IClassProcessor {
    private final Object initialisationLock = new Object();
    private MixinTransformer transformer;
    private ISyntheticClassRegistry registry;

    @Override // org.spongepowered.asm.launch.IClassProcessor
    public EnumSet<ILaunchPluginService.Phase> handlesClass(Type classType, boolean isEmpty, String reason) {
        if (!isEmpty) {
            return Phases.AFTER_ONLY;
        }
        if (this.registry == null) {
            return null;
        }
        ISyntheticClassInfo syntheticClass = this.registry.findSyntheticClass(classType.getClassName());
        if (syntheticClass != null) {
            return Phases.AFTER_ONLY;
        }
        return null;
    }

    @Override // org.spongepowered.asm.launch.IClassProcessor
    public synchronized boolean processClass(ILaunchPluginService.Phase phase, ClassNode classNode, Type classType, String reason) {
        MixinTransformer transformer;
        if (phase == ILaunchPluginService.Phase.BEFORE) {
            return false;
        }
        if (this.transformer == null) {
            synchronized (this.initialisationLock) {
                transformer = this.transformer;
                if (transformer == null) {
                    MixinTransformer mixinTransformer = new MixinTransformer();
                    this.transformer = mixinTransformer;
                    transformer = mixinTransformer;
                    this.registry = transformer.getExtensions().getSyntheticClassRegistry();
                }
            }
        } else {
            transformer = this.transformer;
        }
        if (MixinLaunchPlugin.NAME.equals(reason)) {
            return false;
        }
        MixinEnvironment environment = MixinEnvironment.getCurrentEnvironment();
        ISyntheticClassInfo syntheticClass = this.registry.findSyntheticClass(classType.getClassName());
        if (syntheticClass != null) {
            return transformer.generateClass(environment, classType.getClassName(), classNode);
        }
        if ("computing_frames".equals(reason)) {
            return transformer.computeFramesForClass(environment, classType.getClassName(), classNode);
        }
        return transformer.transformClass(environment, classType.getClassName(), classNode);
    }
}
