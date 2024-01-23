package org.spongepowered.asm.service.mojang;

import net.minecraft.launchwrapper.Launch;
import org.spongepowered.asm.service.IMixinServiceBootstrap;
import org.spongepowered.asm.service.ServiceInitialisationException;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/mojang/MixinServiceLaunchWrapperBootstrap.class */
public class MixinServiceLaunchWrapperBootstrap implements IMixinServiceBootstrap {
    private static final String SERVICE_PACKAGE = "org.spongepowered.asm.service.";
    private static final String MIXIN_UTIL_PACKAGE = "org.spongepowered.asm.util.";
    private static final String LEGACY_ASM_PACKAGE = "org.spongepowered.asm.lib.";
    private static final String ASM_PACKAGE = "org.objectweb.asm.";
    private static final String MIXIN_PACKAGE = "org.spongepowered.asm.mixin.";

    @Override // org.spongepowered.asm.service.IMixinServiceBootstrap
    public String getName() {
        return "LaunchWrapper";
    }

    @Override // org.spongepowered.asm.service.IMixinServiceBootstrap
    public String getServiceClassName() {
        return "org.spongepowered.asm.service.mojang.MixinServiceLaunchWrapper";
    }

    @Override // org.spongepowered.asm.service.IMixinServiceBootstrap
    public void bootstrap() {
        try {
            Launch.classLoader.hashCode();
            Launch.classLoader.addClassLoaderExclusion(SERVICE_PACKAGE);
            Launch.classLoader.addClassLoaderExclusion(ASM_PACKAGE);
            Launch.classLoader.addClassLoaderExclusion(LEGACY_ASM_PACKAGE);
            Launch.classLoader.addClassLoaderExclusion(MIXIN_PACKAGE);
            Launch.classLoader.addClassLoaderExclusion(MIXIN_UTIL_PACKAGE);
        } catch (Throwable th) {
            throw new ServiceInitialisationException(getName() + " is not available");
        }
    }
}
