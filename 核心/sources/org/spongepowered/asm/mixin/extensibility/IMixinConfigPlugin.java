package org.spongepowered.asm.mixin.extensibility;

import java.util.List;
import java.util.Set;
import org.objectweb.asm.tree.ClassNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/extensibility/IMixinConfigPlugin.class */
public interface IMixinConfigPlugin {
    void onLoad(String str);

    String getRefMapperConfig();

    boolean shouldApplyMixin(String str, String str2);

    void acceptTargets(Set<String> set, Set<String> set2);

    List<String> getMixins();

    void preApply(String str, ClassNode classNode, String str2, IMixinInfo iMixinInfo);

    void postApply(String str, ClassNode classNode, String str2, IMixinInfo iMixinInfo);
}
