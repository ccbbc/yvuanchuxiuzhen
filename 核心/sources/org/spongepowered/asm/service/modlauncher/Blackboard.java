package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.Launcher;
import cpw.mods.modlauncher.api.TypesafeMap;
import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/modlauncher/Blackboard.class */
public class Blackboard implements IGlobalPropertyService {
    private final Map<String, IPropertyKey> keys = new HashMap();
    private final TypesafeMap blackboard = Launcher.INSTANCE.blackboard();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/modlauncher/Blackboard$Key.class */
    public class Key<V> implements IPropertyKey {
        final TypesafeMap.Key<V> key;

        public Key(TypesafeMap owner, String name, Class<V> clazz) {
            this.key = TypesafeMap.Key.getOrCreate(owner, name, clazz);
        }
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public IPropertyKey resolveKey(String name) {
        return this.keys.computeIfAbsent(name, key -> {
            return new Key(this.blackboard, key, Object.class);
        });
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public <T> T getProperty(IPropertyKey key) {
        return (T) getProperty(key, null);
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public void setProperty(IPropertyKey key, Object value) {
        this.blackboard.computeIfAbsent(((Key) key).key, k -> {
            return value;
        });
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public String getPropertyString(IPropertyKey key, String defaultValue) {
        return (String) getProperty(key, defaultValue);
    }

    @Override // org.spongepowered.asm.service.IGlobalPropertyService
    public <T> T getProperty(IPropertyKey key, T defaultValue) {
        return (T) this.blackboard.get(((Key) key).key).orElse(defaultValue);
    }
}
