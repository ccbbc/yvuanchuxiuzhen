package org.spongepowered.asm.service;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/IClassTracker.class */
public interface IClassTracker {
    void registerInvalidClass(String str);

    boolean isClassLoaded(String str);

    String getClassRestrictions(String str);
}
