package org.spongepowered.asm.mixin.extensibility;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/extensibility/IRemapper.class */
public interface IRemapper {
    String mapMethodName(String str, String str2, String str3);

    String mapFieldName(String str, String str2, String str3);

    String map(String str);

    String unmap(String str);

    String mapDesc(String str);

    String unmapDesc(String str);
}
