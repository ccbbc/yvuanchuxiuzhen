package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.Launcher;
import org.spongepowered.asm.service.IMixinServiceBootstrap;
import org.spongepowered.asm.service.ServiceInitialisationException;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/modlauncher/MixinServiceModLauncherBootstrap.class */
public class MixinServiceModLauncherBootstrap implements IMixinServiceBootstrap {
    @Override // org.spongepowered.asm.service.IMixinServiceBootstrap
    public String getName() {
        return "ModLauncher";
    }

    @Override // org.spongepowered.asm.service.IMixinServiceBootstrap
    public String getServiceClassName() {
        return "org.spongepowered.asm.service.modlauncher.MixinServiceModLauncher";
    }

    @Override // org.spongepowered.asm.service.IMixinServiceBootstrap
    public void bootstrap() {
        try {
            Launcher.INSTANCE.hashCode();
        } catch (Throwable th) {
            throw new ServiceInitialisationException(getName() + " is not available");
        }
    }
}
