package org.spongepowered.asm.service;

import java.net.URL;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/IClassProvider.class */
public interface IClassProvider {
    @Deprecated
    URL[] getClassPath();

    Class<?> findClass(String str) throws ClassNotFoundException;

    Class<?> findClass(String str, boolean z) throws ClassNotFoundException;

    Class<?> findAgentClass(String str, boolean z) throws ClassNotFoundException;
}
