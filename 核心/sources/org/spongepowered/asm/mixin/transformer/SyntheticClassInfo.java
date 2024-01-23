package org.spongepowered.asm.mixin.transformer;

import com.google.common.base.Preconditions;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.service.ISyntheticClassInfo;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/SyntheticClassInfo.class */
public abstract class SyntheticClassInfo implements ISyntheticClassInfo {
    protected final IMixinInfo mixin;
    protected final String name;

    /* JADX INFO: Access modifiers changed from: protected */
    public SyntheticClassInfo(IMixinInfo mixin, String name) {
        Preconditions.checkNotNull(mixin, "parent");
        Preconditions.checkNotNull(name, "name");
        this.mixin = mixin;
        this.name = name.replace('.', '/');
    }

    @Override // org.spongepowered.asm.service.ISyntheticClassInfo
    public final IMixinInfo getMixin() {
        return this.mixin;
    }

    @Override // org.spongepowered.asm.service.ISyntheticClassInfo
    public String getName() {
        return this.name;
    }

    @Override // org.spongepowered.asm.service.ISyntheticClassInfo
    public String getClassName() {
        return this.name.replace('/', '.');
    }
}
