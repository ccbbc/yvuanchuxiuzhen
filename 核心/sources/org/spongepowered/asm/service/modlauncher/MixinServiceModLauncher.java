package org.spongepowered.asm.service.modlauncher;

import com.google.common.collect.ImmutableList;
import cpw.mods.modlauncher.Launcher;
import cpw.mods.modlauncher.api.ITransformationService;
import java.io.InputStream;
import java.util.Collection;
import org.spongepowered.asm.launch.IClassProcessor;
import org.spongepowered.asm.launch.platform.container.ContainerHandleModLauncher;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.MixinTransformationHandler;
import org.spongepowered.asm.service.IClassBytecodeProvider;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.IClassTracker;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.ITransformerProvider;
import org.spongepowered.asm.service.MixinServiceAbstract;
import org.spongepowered.asm.util.IConsumer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/modlauncher/MixinServiceModLauncher.class */
public class MixinServiceModLauncher extends MixinServiceAbstract {
    private static final String MODLAUNCHER_SPECIFICATION_VERSION = "4.0";
    private IClassProvider classProvider;
    private IClassBytecodeProvider bytecodeProvider;
    private MixinTransformationHandler transformationHandler;
    private ModLauncherClassTracker classTracker;
    private ModLauncherAuditTrail auditTrail;
    private IConsumer<MixinEnvironment.Phase> phaseConsumer;
    private volatile boolean initialised;
    private ContainerHandleModLauncher rootContainer = new ContainerHandleModLauncher(getName());

    public void onInit(IClassBytecodeProvider bytecodeProvider) {
        if (this.initialised) {
            throw new IllegalStateException("Already initialised");
        }
        this.initialised = true;
        this.bytecodeProvider = bytecodeProvider;
    }

    public void onStartup() {
        this.phaseConsumer.accept(MixinEnvironment.Phase.DEFAULT);
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract
    public void wire(MixinEnvironment.Phase phase, IConsumer<MixinEnvironment.Phase> phaseConsumer) {
        super.wire(phase, phaseConsumer);
        this.phaseConsumer = phaseConsumer;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public String getName() {
        return "ModLauncher";
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public MixinEnvironment.CompatibilityLevel getMinCompatibilityLevel() {
        return MixinEnvironment.CompatibilityLevel.JAVA_8;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public boolean isValid() {
        try {
            Launcher.INSTANCE.hashCode();
            Package pkg = ITransformationService.class.getPackage();
            if (!pkg.isCompatibleWith(MODLAUNCHER_SPECIFICATION_VERSION)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IClassProvider getClassProvider() {
        if (this.classProvider == null) {
            this.classProvider = new ModLauncherClassProvider();
        }
        return this.classProvider;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IClassBytecodeProvider getBytecodeProvider() {
        if (this.bytecodeProvider == null) {
            throw new IllegalStateException("Service initialisation incomplete");
        }
        return this.bytecodeProvider;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public ITransformerProvider getTransformerProvider() {
        return null;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IClassTracker getClassTracker() {
        if (this.classTracker == null) {
            this.classTracker = new ModLauncherClassTracker();
        }
        return this.classTracker;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IMixinAuditTrail getAuditTrail() {
        if (this.auditTrail == null) {
            this.auditTrail = new ModLauncherAuditTrail();
        }
        return this.auditTrail;
    }

    private IClassProcessor getTransformationHandler() {
        if (this.transformationHandler == null) {
            this.transformationHandler = new MixinTransformationHandler();
        }
        return this.transformationHandler;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public Collection<String> getPlatformAgents() {
        return ImmutableList.of("org.spongepowered.asm.launch.platform.MixinPlatformAgentMinecraftForge");
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public ContainerHandleModLauncher getPrimaryContainer() {
        return this.rootContainer;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public InputStream getResourceAsStream(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
    }

    public Collection<IClassProcessor> getProcessors() {
        return ImmutableList.of(getTransformationHandler(), (IClassProcessor) getClassTracker());
    }
}
