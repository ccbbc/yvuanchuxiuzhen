package org.spongepowered.asm.mixin.injection.selectors;

import java.util.ArrayList;
import java.util.List;
import org.spongepowered.asm.mixin.injection.struct.InvalidMemberDescriptorException;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.refmap.IReferenceMapper;
import org.spongepowered.asm.util.asm.ElementNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/selectors/TargetSelector.class */
public final class TargetSelector {

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/selectors/TargetSelector$Result.class */
    public static class Result<TNode> {
        public final TNode exactMatch;
        public final List<TNode> candidates;

        Result(TNode exactMatch, List<TNode> candidates) {
            this.exactMatch = exactMatch;
            this.candidates = candidates;
        }

        public TNode getSingleResult(boolean strict) {
            int resultCount = this.candidates.size();
            if (this.exactMatch != null) {
                return this.exactMatch;
            }
            if (resultCount == 1 || !strict) {
                return this.candidates.get(0);
            }
            throw new IllegalStateException((resultCount == 0 ? "No" : "Multiple") + " candidates were found");
        }
    }

    private TargetSelector() {
    }

    public static ITargetSelector parseAndValidate(String string) throws InvalidMemberDescriptorException {
        return parse(string, null, null).validate();
    }

    public static ITargetSelector parseAndValidate(String string, IMixinContext context) throws InvalidMemberDescriptorException {
        return parse(string, context.getReferenceMapper(), context.getClassRef()).validate();
    }

    public static ITargetSelector parse(String string) {
        return parse(string, null, null);
    }

    public static ITargetSelector parse(String string, IMixinContext context) {
        return parse(string, context.getReferenceMapper(), context.getClassRef());
    }

    public static String parseName(String name, IMixinContext context) {
        ITargetSelector selector = parse(name, context);
        if (!(selector instanceof ITargetSelectorByName)) {
            return name;
        }
        String mappedName = ((ITargetSelectorByName) selector).getName();
        return mappedName != null ? mappedName : name;
    }

    private static ITargetSelector parse(String input, IReferenceMapper refMapper, String mixinClass) {
        return MemberInfo.parse(input, refMapper, mixinClass);
    }

    public static <TNode> Result<TNode> run(ITargetSelector target, List<ElementNode<TNode>> nodes) {
        List<TNode> candidates = new ArrayList<>();
        return new Result<>(runSelector(target, nodes, candidates), candidates);
    }

    public static <TNode> Result<TNode> run(Iterable<ITargetSelector> targets, List<ElementNode<TNode>> nodes) {
        Object obj = null;
        List<TNode> candidates = new ArrayList<>();
        for (ITargetSelector target : targets) {
            Object runSelector = runSelector(target, nodes, candidates);
            if (obj == null) {
                obj = runSelector;
            }
        }
        return new Result<>(obj, candidates);
    }

    private static <TNode> TNode runSelector(ITargetSelector target, List<ElementNode<TNode>> nodes, List<TNode> candidates) {
        TNode exactMatch = null;
        for (ElementNode<TNode> element : nodes) {
            MatchResult match = target.match(element);
            if (match.isMatch()) {
                TNode node = element.get();
                if (!candidates.contains(node)) {
                    candidates.add(node);
                }
                if (exactMatch == null && match.isExactMatch()) {
                    exactMatch = node;
                }
            }
        }
        return exactMatch;
    }
}
