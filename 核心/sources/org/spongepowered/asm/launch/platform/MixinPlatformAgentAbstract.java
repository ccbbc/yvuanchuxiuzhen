package org.spongepowered.asm.launch.platform;

import java.lang.reflect.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.launch.platform.IMixinPlatformAgent;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.util.IConsumer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinPlatformAgentAbstract.class */
public abstract class MixinPlatformAgentAbstract implements IMixinPlatformAgent {
    protected static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    protected MixinPlatformManager manager;
    protected IContainerHandle handle;

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager manager, IContainerHandle handle) {
        this.manager = manager;
        this.handle = handle;
        return IMixinPlatformAgent.AcceptResult.ACCEPTED;
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public String getPhaseProvider() {
        return null;
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public void prepare() {
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public void initPrimaryContainer() {
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public void inject() {
    }

    public String toString() {
        return String.format("PlatformAgent[%s:%s]", getClass().getSimpleName(), this.handle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String invokeStringMethod(ClassLoader classLoader, String className, String methodName) {
        try {
            Class<?> clazz = Class.forName(className, false, classLoader);
            Method method = clazz.getDeclaredMethod(methodName, new Class[0]);
            return ((Enum) method.invoke(null, new Object[0])).name();
        } catch (Exception e) {
            return null;
        }
    }

    @Deprecated
    public void wire(MixinEnvironment.Phase phase, IConsumer<MixinEnvironment.Phase> phaseConsumer) {
    }

    @Deprecated
    public void unwire() {
    }
}
