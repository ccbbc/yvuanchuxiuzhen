package org.spongepowered.asm.launch;

import cpw.mods.modlauncher.serviceapi.ILaunchPluginService;
import java.util.EnumSet;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/IClassProcessor.class */
public interface IClassProcessor {
    EnumSet<ILaunchPluginService.Phase> handlesClass(Type type, boolean z, String str);

    boolean processClass(ILaunchPluginService.Phase phase, ClassNode classNode, Type type, String str);
}
