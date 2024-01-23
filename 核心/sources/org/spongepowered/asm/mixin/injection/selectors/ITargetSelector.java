package org.spongepowered.asm.mixin.injection.selectors;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.util.asm.ElementNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/selectors/ITargetSelector.class */
public interface ITargetSelector {
    ITargetSelector next();

    ITargetSelector configure(String... strArr);

    ITargetSelector validate() throws InvalidSelectorException;

    ITargetSelector attach(IMixinContext iMixinContext) throws InvalidSelectorException;

    int getMatchCount();

    <TNode> MatchResult match(ElementNode<TNode> elementNode);

    MatchResult match(AbstractInsnNode abstractInsnNode);
}
