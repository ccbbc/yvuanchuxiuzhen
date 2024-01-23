package org.spongepowered.asm.launch.platform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.launch.platform.IMixinPlatformAgent;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.service.MixinService;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinContainer.class */
public class MixinContainer {
    private static final List<String> agentClasses = new ArrayList();
    private static final Logger logger;
    private final IContainerHandle handle;
    private final List<IMixinPlatformAgent> agents = new ArrayList();

    static {
        GlobalProperties.put(GlobalProperties.Keys.AGENTS, agentClasses);
        for (String agent : MixinService.getService().getPlatformAgents()) {
            agentClasses.add(agent);
        }
        agentClasses.add("org.spongepowered.asm.launch.platform.MixinPlatformAgentDefault");
        logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    }

    public MixinContainer(MixinPlatformManager manager, IContainerHandle handle) {
        String simpleName;
        IMixinPlatformAgent agent;
        IMixinPlatformAgent.AcceptResult acceptAction;
        this.handle = handle;
        Iterator<String> iter = agentClasses.iterator();
        while (iter.hasNext()) {
            String agentClass = iter.next();
            try {
                Class<?> cls = Class.forName(agentClass);
                simpleName = cls.getSimpleName();
                logger.debug("Instancing new {} for {}", new Object[]{simpleName, this.handle});
                agent = (IMixinPlatformAgent) cls.newInstance();
                acceptAction = agent.accept(manager, this.handle);
            } catch (InstantiationException ex) {
                Throwable cause = ex.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            } catch (ReflectiveOperationException ex2) {
                logger.catching(ex2);
            }
            if (acceptAction == IMixinPlatformAgent.AcceptResult.ACCEPTED) {
                this.agents.add(agent);
            } else if (acceptAction == IMixinPlatformAgent.AcceptResult.INVALID) {
                iter.remove();
            }
            logger.debug("{} {} container {}", new Object[]{simpleName, acceptAction.name().toLowerCase(), this.handle});
        }
    }

    public IContainerHandle getDescriptor() {
        return this.handle;
    }

    public Collection<String> getPhaseProviders() {
        List<String> phaseProviders = new ArrayList<>();
        for (IMixinPlatformAgent agent : this.agents) {
            String phaseProvider = agent.getPhaseProvider();
            if (phaseProvider != null) {
                phaseProviders.add(phaseProvider);
            }
        }
        return phaseProviders;
    }

    public void prepare() {
        for (IMixinPlatformAgent agent : this.agents) {
            logger.debug("Processing prepare() for {}", new Object[]{agent});
            agent.prepare();
        }
    }

    public void initPrimaryContainer() {
        for (IMixinPlatformAgent agent : this.agents) {
            logger.debug("Processing launch tasks for {}", new Object[]{agent});
            agent.initPrimaryContainer();
        }
    }

    public void inject() {
        for (IMixinPlatformAgent agent : this.agents) {
            logger.debug("Processing inject() for {}", new Object[]{agent});
            agent.inject();
        }
    }
}
