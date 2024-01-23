package org.spongepowered.asm.service.mojang;

import net.minecraft.launchwrapper.Launch;
import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/mojang/Blackboard.class */
public class Blackboard implements IGlobalPropertyService {

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/mojang/Blackboard$Key.class */
    class Key implements IPropertyKey {
        private final String key;

        Key(String key) {
            this.key = key;
        }

        public String toString() {
            return this.key;
        }
    }

    public Blackboard() {
        Launch.classLoader.hashCode();
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public IPropertyKey resolveKey(String name) {
        return new Key(name);
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public final <T> T getProperty(IPropertyKey key) {
        return (T) Launch.blackboard.get(key.toString());
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public final void setProperty(IPropertyKey key, Object value) {
        Launch.blackboard.put(key.toString(), value);
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public final <T> T getProperty(IPropertyKey key, T defaultValue) {
        T t = (T) Launch.blackboard.get(key.toString());
        return t != null ? t : defaultValue;
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public final String getPropertyString(IPropertyKey key, String defaultValue) {
        Object value = Launch.blackboard.get(key.toString());
        return value != null ? value.toString() : defaultValue;
    }
}
