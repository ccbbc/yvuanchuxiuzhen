package org.spongepowered.asm.service;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/IGlobalPropertyService.class */
public interface IGlobalPropertyService {
    IPropertyKey resolveKey(String str);

    <T> T getProperty(IPropertyKey iPropertyKey);

    void setProperty(IPropertyKey iPropertyKey, Object obj);

    <T> T getProperty(IPropertyKey iPropertyKey, T t);

    String getPropertyString(IPropertyKey iPropertyKey, String str);
}
