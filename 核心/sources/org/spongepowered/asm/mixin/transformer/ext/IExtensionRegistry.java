package org.spongepowered.asm.mixin.transformer.ext;

import java.util.List;
import org.spongepowered.asm.service.ISyntheticClassRegistry;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ext/IExtensionRegistry.class */
public interface IExtensionRegistry {
    List<IExtension> getExtensions();

    List<IExtension> getActiveExtensions();

    <T extends IExtension> T getExtension(Class<? extends IExtension> cls);

    ISyntheticClassRegistry getSyntheticClassRegistry();
}
