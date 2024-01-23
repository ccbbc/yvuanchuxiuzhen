package org.spongepowered.asm.launch.platform;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.connect.IMixinConnector;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.MixinService;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinConnectorManager.class */
public class MixinConnectorManager {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final Set<String> connectorClasses = new LinkedHashSet();
    private final List<IMixinConnector> connectors = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addConnector(String connectorClass) {
        this.connectorClasses.add(connectorClass);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void inject() {
        loadConnectors();
        initConnectors();
    }

    void loadConnectors() {
        IClassProvider classProvider = MixinService.getService().getClassProvider();
        for (String connectorClassName : this.connectorClasses) {
            try {
                Class<?> clazz = classProvider.findClass(connectorClassName);
                if (!IMixinConnector.class.isAssignableFrom(clazz)) {
                    logger.error("Mixin Connector [" + connectorClassName + "] does not implement IMixinConnector");
                } else {
                    try {
                        IMixinConnector connector = (IMixinConnector) clazz.newInstance();
                        this.connectors.add(connector);
                        logger.info("Successfully loaded Mixin Connector [" + connectorClassName + "]");
                    } catch (ReflectiveOperationException ex) {
                        logger.warn("Error loading Mixin Connector [" + connectorClassName + "]", ex);
                    }
                }
            } catch (ClassNotFoundException ex2) {
                logger.catching(ex2);
            }
        }
        this.connectorClasses.clear();
    }

    void initConnectors() {
        for (IMixinConnector connector : this.connectors) {
            try {
                connector.connect();
            } catch (Exception ex) {
                logger.warn("Error initialising Mixin Connector [" + connector.getClass().getName() + "]", ex);
            }
        }
    }
}
