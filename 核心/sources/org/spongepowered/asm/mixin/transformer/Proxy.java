package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.launchwrapper.IClassTransformer;
import org.apache.logging.log4j.LogManager;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.service.ILegacyClassTransformer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/Proxy.class */
public final class Proxy implements IClassTransformer, ILegacyClassTransformer {
    private static List<Proxy> proxies = new ArrayList();
    private static MixinTransformer transformer = new MixinTransformer();
    private boolean isActive;

    public Proxy() {
        this.isActive = true;
        for (Proxy proxy : proxies) {
            proxy.isActive = false;
        }
        proxies.add(this);
        LogManager.getLogger(MixinLaunchPlugin.NAME).debug("Adding new mixin transformer proxy #{}", new Object[]{Integer.valueOf(proxies.size())});
    }

    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        if (this.isActive) {
            return transformer.transformClassBytes(name, transformedName, basicClass);
        }
        return basicClass;
    }

    @Override // org.spongepowered.asm.service.ITransformer
    public String getName() {
        return getClass().getName();
    }

    @Override // org.spongepowered.asm.service.ITransformer
    public boolean isDelegationExcluded() {
        return true;
    }

    @Override // org.spongepowered.asm.service.ILegacyClassTransformer, org.spongepowered.asm.mixin.transformer.IMixinTransformer
    public byte[] transformClassBytes(String name, String transformedName, byte[] basicClass) {
        if (this.isActive) {
            return transformer.transformClassBytes(name, transformedName, basicClass);
        }
        return basicClass;
    }
}
