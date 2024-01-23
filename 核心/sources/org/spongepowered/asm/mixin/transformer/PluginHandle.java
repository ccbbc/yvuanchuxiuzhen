package org.spongepowered.asm.mixin.transformer;

import com.google.common.base.Strings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.throwables.CompanionPluginError;
import org.spongepowered.asm.service.IMixinService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/PluginHandle.class */
public class PluginHandle {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final MixinConfig parent;
    private final IMixinConfigPlugin plugin;
    private CompatibilityMode mode = CompatibilityMode.NORMAL;
    private Method mdPreApply;
    private Method mdPostApply;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/PluginHandle$CompatibilityMode.class */
    public enum CompatibilityMode {
        NORMAL,
        COMPATIBLE,
        FAILED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PluginHandle(MixinConfig parent, IMixinService service, String pluginClassName) {
        IMixinConfigPlugin plugin = null;
        if (!Strings.isNullOrEmpty(pluginClassName)) {
            try {
                Class<?> pluginClass = service.getClassProvider().findClass(pluginClassName, true);
                plugin = (IMixinConfigPlugin) pluginClass.newInstance();
            } catch (Throwable th) {
                logger.error("Error loading companion plugin class [{}] for mixin config [{}]. The plugin may be out of date: {}:{}", new Object[]{pluginClassName, parent, th.getClass().getSimpleName(), th.getMessage(), th});
                plugin = null;
            }
        }
        this.parent = parent;
        this.plugin = plugin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IMixinConfigPlugin get() {
        return this.plugin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isAvailable() {
        return this.plugin != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onLoad(String mixinPackage) {
        if (this.plugin != null) {
            this.plugin.onLoad(mixinPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getRefMapperConfig() {
        if (this.plugin != null) {
            return this.plugin.getRefMapperConfig();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> getMixins() {
        if (this.plugin != null) {
            return this.plugin.getMixins();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldApplyMixin(String targetName, String className) {
        return this.plugin == null || this.plugin.shouldApplyMixin(targetName, className);
    }

    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, MixinInfo mixinInfo) {
        if (this.plugin == null) {
            return;
        }
        if (this.mode == CompatibilityMode.FAILED) {
            throw new IllegalStateException("Companion plugin failure for [" + this.parent + "] plugin [" + this.plugin.getClass() + "]");
        }
        if (this.mode == CompatibilityMode.COMPATIBLE) {
            try {
                applyLegacy(this.mdPreApply, targetClassName, targetClass, mixinClassName, mixinInfo);
                return;
            } catch (Exception ex) {
                this.mode = CompatibilityMode.FAILED;
                throw ex;
            }
        }
        try {
            this.plugin.preApply(targetClassName, targetClass, mixinClassName, mixinInfo);
        } catch (AbstractMethodError e) {
            this.mode = CompatibilityMode.COMPATIBLE;
            initReflection();
            preApply(targetClassName, targetClass, mixinClassName, mixinInfo);
        }
    }

    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, MixinInfo mixinInfo) {
        if (this.plugin == null) {
            return;
        }
        if (this.mode == CompatibilityMode.FAILED) {
            throw new IllegalStateException("Companion plugin failure for [" + this.parent + "] plugin [" + this.plugin.getClass() + "]");
        }
        if (this.mode == CompatibilityMode.COMPATIBLE) {
            try {
                applyLegacy(this.mdPostApply, targetClassName, targetClass, mixinClassName, mixinInfo);
                return;
            } catch (Exception ex) {
                this.mode = CompatibilityMode.FAILED;
                throw ex;
            }
        }
        try {
            this.plugin.postApply(targetClassName, targetClass, mixinClassName, mixinInfo);
        } catch (AbstractMethodError e) {
            this.mode = CompatibilityMode.COMPATIBLE;
            initReflection();
            postApply(targetClassName, targetClass, mixinClassName, mixinInfo);
        }
    }

    private void initReflection() {
        if (this.mdPreApply != null) {
            return;
        }
        try {
            Class<?> pluginClass = this.plugin.getClass();
            this.mdPreApply = pluginClass.getMethod("preApply", String.class, org.spongepowered.asm.lib.tree.ClassNode.class, String.class, IMixinInfo.class);
            this.mdPostApply = pluginClass.getMethod("postApply", String.class, org.spongepowered.asm.lib.tree.ClassNode.class, String.class, IMixinInfo.class);
        } catch (Throwable th) {
            logger.catching(th);
        }
    }

    private void applyLegacy(Method method, String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        try {
            method.invoke(this.plugin, targetClassName, new org.spongepowered.asm.lib.tree.ClassNode(targetClass), mixinClassName, mixinInfo);
        } catch (IllegalAccessException ex) {
            throw new CompanionPluginError(apiError("Fallback failed [" + ex.getMessage() + "]"), ex);
        } catch (IllegalArgumentException ex2) {
            throw new CompanionPluginError(apiError("Fallback failed [" + ex2.getMessage() + "]"), ex2);
        } catch (LinkageError err) {
            throw new CompanionPluginError(apiError("Accessing [" + err.getMessage() + "]"), err);
        } catch (InvocationTargetException ex3) {
            Throwable th = ex3.getCause() != null ? ex3.getCause() : ex3;
            throw new CompanionPluginError(apiError("Fallback failed [" + th.getMessage() + "]"), th);
        }
    }

    private String apiError(String message) {
        return String.format("Companion plugin attempted to use a deprected API in [%s] plugin [%s]: %s", this.parent, this.plugin.getClass().getName(), message);
    }
}
