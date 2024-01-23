package org.spongepowered.asm.mixin.extensibility;

import java.util.List;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/extensibility/IMixinInfo.class */
public interface IMixinInfo {
    IMixinConfig getConfig();

    String getName();

    String getClassName();

    String getClassRef();

    byte[] getClassBytes();

    boolean isDetachedSuper();

    ClassNode getClassNode(int i);

    List<String> getTargetClasses();

    int getPriority();

    MixinEnvironment.Phase getPhase();
}
