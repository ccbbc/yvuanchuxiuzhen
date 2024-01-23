package org.spongepowered.asm.launch;

import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;
import org.spongepowered.asm.service.MixinService;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/GlobalProperties.class */
public final class GlobalProperties {
    private static IGlobalPropertyService service;

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/GlobalProperties$Keys.class */
    public static final class Keys {
        public static final Keys INIT = of("mixin.initialised");
        public static final Keys AGENTS = of("mixin.agents");
        public static final Keys CONFIGS = of("mixin.configs");
        public static final Keys PLATFORM_MANAGER = of("mixin.platform");
        public static final Keys FML_LOAD_CORE_MOD = of("mixin.launch.fml.loadcoremodmethod");
        public static final Keys FML_GET_REPARSEABLE_COREMODS = of("mixin.launch.fml.reparseablecoremodsmethod");
        public static final Keys FML_CORE_MOD_MANAGER = of("mixin.launch.fml.coremodmanagerclass");
        public static final Keys FML_GET_IGNORED_MODS = of("mixin.launch.fml.ignoredmodsmethod");
        private static Map<String, Keys> keys;
        private final String name;
        private IPropertyKey key;

        private Keys(String name) {
            this.name = name;
        }

        IPropertyKey resolve(IGlobalPropertyService service) {
            if (this.key != null) {
                return this.key;
            }
            if (service == null) {
                return null;
            }
            IPropertyKey resolveKey = service.resolveKey(this.name);
            this.key = resolveKey;
            return resolveKey;
        }

        public static Keys of(String name) {
            if (keys == null) {
                keys = new HashMap();
            }
            Keys key = keys.get(name);
            if (key == null) {
                key = new Keys(name);
                keys.put(name, key);
            }
            return key;
        }
    }

    private GlobalProperties() {
    }

    private static IGlobalPropertyService getService() {
        if (service == null) {
            service = MixinService.getGlobalPropertyService();
        }
        return service;
    }

    public static <T> T get(Keys key) {
        IGlobalPropertyService service2 = getService();
        return (T) service2.getProperty(key.resolve(service2));
    }

    public static void put(Keys key, Object value) {
        IGlobalPropertyService service2 = getService();
        service2.setProperty(key.resolve(service2), value);
    }

    public static <T> T get(Keys key, T defaultValue) {
        IGlobalPropertyService service2 = getService();
        return (T) service2.getProperty(key.resolve(service2), defaultValue);
    }

    public static String getString(Keys key, String defaultValue) {
        IGlobalPropertyService service2 = getService();
        return service2.getPropertyString(key.resolve(service2), defaultValue);
    }
}
