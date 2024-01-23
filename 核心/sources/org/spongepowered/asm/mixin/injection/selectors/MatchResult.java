package org.spongepowered.asm.mixin.injection.selectors;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/selectors/MatchResult.class */
public enum MatchResult {
    NONE,
    WEAK,
    MATCH,
    EXACT_MATCH;

    public boolean isAtLeast(MatchResult other) {
        return other == null || other.ordinal() <= ordinal();
    }

    public boolean isMatch() {
        return ordinal() >= MATCH.ordinal();
    }

    public boolean isExactMatch() {
        return this == EXACT_MATCH;
    }
}
