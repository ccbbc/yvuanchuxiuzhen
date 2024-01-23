package org.spongepowered.asm.launch;

import cpw.mods.modlauncher.serviceapi.ILaunchPluginService;
import java.util.EnumSet;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/Phases.class */
public final class Phases {
    public static final EnumSet<ILaunchPluginService.Phase> NONE = EnumSet.noneOf(ILaunchPluginService.Phase.class);
    public static final EnumSet<ILaunchPluginService.Phase> BEFORE_ONLY = EnumSet.of(ILaunchPluginService.Phase.BEFORE);
    public static final EnumSet<ILaunchPluginService.Phase> AFTER_ONLY = EnumSet.of(ILaunchPluginService.Phase.AFTER);

    private Phases() {
    }
}
