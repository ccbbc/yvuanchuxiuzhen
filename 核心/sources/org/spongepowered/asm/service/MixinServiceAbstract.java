package org.spongepowered.asm.service;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.launch.platform.IMixinPlatformAgent;
import org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.IConsumer;
import org.spongepowered.asm.util.ReEntranceLock;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/MixinServiceAbstract.class */
public abstract class MixinServiceAbstract implements IMixinService {
    protected static final String LAUNCH_PACKAGE = "org.spongepowered.asm.launch.";
    protected static final String MIXIN_PACKAGE = "org.spongepowered.asm.mixin.";
    protected static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    protected final ReEntranceLock lock = new ReEntranceLock(1);
    private List<IMixinPlatformServiceAgent> serviceAgents;
    private String sideName;

    @Override // org.spongepowered.asm.service.IMixinService
    public void prepare() {
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public MixinEnvironment.Phase getInitialPhase() {
        return MixinEnvironment.Phase.PREINIT;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public MixinEnvironment.CompatibilityLevel getMinCompatibilityLevel() {
        return null;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public MixinEnvironment.CompatibilityLevel getMaxCompatibilityLevel() {
        return null;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public void beginPhase() {
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public void checkEnv(Object bootSource) {
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public void init() {
        for (IMixinPlatformServiceAgent agent : getServiceAgents()) {
            agent.init();
        }
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public ReEntranceLock getReEntranceLock() {
        return this.lock;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public Collection<IContainerHandle> getMixinContainers() {
        ImmutableList.Builder<IContainerHandle> list = ImmutableList.builder();
        getContainersFromAgents(list);
        return list.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void getContainersFromAgents(ImmutableList.Builder<IContainerHandle> list) {
        for (IMixinPlatformServiceAgent agent : getServiceAgents()) {
            Collection<IContainerHandle> containers = agent.getMixinContainers();
            if (containers != null) {
                list.addAll(containers);
            }
        }
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public final String getSideName() {
        String side;
        if (this.sideName != null) {
            return this.sideName;
        }
        for (IMixinPlatformServiceAgent agent : getServiceAgents()) {
            try {
                side = agent.getSideName();
            } catch (Exception ex) {
                logger.catching(ex);
            }
            if (side != null) {
                this.sideName = side;
                return side;
            }
            continue;
        }
        return Constants.SIDE_UNKNOWN;
    }

    private List<IMixinPlatformServiceAgent> getServiceAgents() {
        if (this.serviceAgents != null) {
            return this.serviceAgents;
        }
        this.serviceAgents = new ArrayList();
        for (String agentClassName : getPlatformAgents()) {
            try {
                IMixinPlatformAgent agent = (IMixinPlatformAgent) getClassProvider().findClass(agentClassName, false).newInstance();
                if (agent instanceof IMixinPlatformServiceAgent) {
                    this.serviceAgents.add((IMixinPlatformServiceAgent) agent);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return this.serviceAgents;
    }

    @Deprecated
    public void wire(MixinEnvironment.Phase phase, IConsumer<MixinEnvironment.Phase> phaseConsumer) {
        for (IMixinPlatformServiceAgent agent : getServiceAgents()) {
            agent.wire(phase, phaseConsumer);
        }
    }

    @Deprecated
    public void unwire() {
        for (IMixinPlatformServiceAgent agent : getServiceAgents()) {
            agent.unwire();
        }
    }
}
