package org.spongepowered.asm.service.modlauncher;

import cpw.mods.gross.Java9ClassLoaderUtil;
import cpw.mods.modlauncher.Launcher;
import java.net.URL;
import org.spongepowered.asm.service.IClassProvider;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/modlauncher/ModLauncherClassProvider.class */
class ModLauncherClassProvider implements IClassProvider {
    @Override // org.spongepowered.asm.service.IClassProvider
    @Deprecated
    public URL[] getClassPath() {
        return Java9ClassLoaderUtil.getSystemClassPathURLs();
    }

    @Override // org.spongepowered.asm.service.IClassProvider
    public Class<?> findClass(String name) throws ClassNotFoundException {
        return Class.forName(name, true, Thread.currentThread().getContextClassLoader());
    }

    @Override // org.spongepowered.asm.service.IClassProvider
    public Class<?> findClass(String name, boolean initialize) throws ClassNotFoundException {
        return Class.forName(name, initialize, Thread.currentThread().getContextClassLoader());
    }

    @Override // org.spongepowered.asm.service.IClassProvider
    public Class<?> findAgentClass(String name, boolean initialize) throws ClassNotFoundException {
        return Class.forName(name, initialize, Launcher.class.getClassLoader());
    }
}
