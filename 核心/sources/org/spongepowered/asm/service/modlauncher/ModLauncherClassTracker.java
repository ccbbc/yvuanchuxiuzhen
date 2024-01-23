package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.serviceapi.ILaunchPluginService;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.IClassProcessor;
import org.spongepowered.asm.launch.Phases;
import org.spongepowered.asm.service.IClassTracker;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/modlauncher/ModLauncherClassTracker.class */
public class ModLauncherClassTracker implements IClassProcessor, IClassTracker {
    private final Set<String> invalidClasses = new HashSet();
    private final Set<String> loadedClasses = new HashSet();

    @Override // org.spongepowered.asm.service.IClassTracker
    public void registerInvalidClass(String className) {
        synchronized (this.invalidClasses) {
            this.invalidClasses.add(className);
        }
    }

    @Override // org.spongepowered.asm.service.IClassTracker
    public boolean isClassLoaded(String className) {
        boolean contains;
        synchronized (this.loadedClasses) {
            contains = this.loadedClasses.contains(className);
        }
        return contains;
    }

    @Override // org.spongepowered.asm.service.IClassTracker
    public String getClassRestrictions(String className) {
        return "";
    }

    @Override // org.spongepowered.asm.launch.IClassProcessor
    public EnumSet<ILaunchPluginService.Phase> handlesClass(Type classType, boolean isEmpty, String reason) {
        String name = classType.getClassName();
        synchronized (this.invalidClasses) {
            if (this.invalidClasses.contains(name)) {
                throw new NoClassDefFoundError(String.format("%s is invalid", name));
            }
        }
        return Phases.AFTER_ONLY;
    }

    @Override // org.spongepowered.asm.launch.IClassProcessor
    public boolean processClass(ILaunchPluginService.Phase phase, ClassNode classNode, Type classType, String reason) {
        if ("classloading".equals(reason)) {
            synchronized (this.loadedClasses) {
                this.loadedClasses.add(classType.getClassName());
            }
            return false;
        }
        return false;
    }
}
