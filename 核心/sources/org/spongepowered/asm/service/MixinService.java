package org.spongepowered.asm.service;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinLaunchPlugin;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/MixinService.class */
public final class MixinService {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private static MixinService instance;
    private ServiceLoader<IMixinServiceBootstrap> bootstrapServiceLoader;
    private ServiceLoader<IMixinService> serviceLoader;
    private IGlobalPropertyService propertyService;
    private final Set<String> bootedServices = new HashSet();
    private IMixinService service = null;

    private MixinService() {
        runBootServices();
    }

    private void runBootServices() {
        this.bootstrapServiceLoader = ServiceLoader.load(IMixinServiceBootstrap.class, getClass().getClassLoader());
        Iterator<IMixinServiceBootstrap> iter = this.bootstrapServiceLoader.iterator();
        while (iter.hasNext()) {
            try {
                IMixinServiceBootstrap bootService = iter.next();
                bootService.bootstrap();
                this.bootedServices.add(bootService.getServiceClassName());
            } catch (ServiceInitialisationException ex) {
                logger.debug("Mixin bootstrap service {} is not available: {}", new Object[]{ex.getStackTrace()[0].getClassName(), ex.getMessage()});
            } catch (Throwable th) {
                logger.debug("Catching {}:{} initialising service", new Object[]{th.getClass().getName(), th.getMessage(), th});
            }
        }
    }

    private static MixinService getInstance() {
        if (instance == null) {
            instance = new MixinService();
        }
        return instance;
    }

    public static void boot() {
        getInstance();
    }

    public static IMixinService getService() {
        return getInstance().getServiceInstance();
    }

    private synchronized IMixinService getServiceInstance() {
        if (this.service == null) {
            this.service = initService();
        }
        return this.service;
    }

    private IMixinService initService() {
        IMixinService service;
        this.serviceLoader = ServiceLoader.load(IMixinService.class, getClass().getClassLoader());
        Iterator<IMixinService> iter = this.serviceLoader.iterator();
        List<String> badServices = new ArrayList<>();
        int brokenServiceCount = 0;
        while (iter.hasNext()) {
            try {
                service = iter.next();
                if (this.bootedServices.contains(service.getClass().getName())) {
                    logger.debug("MixinService [{}] was successfully booted in {}", new Object[]{service.getName(), getClass().getClassLoader()});
                }
            } catch (ServiceConfigurationError e) {
                brokenServiceCount++;
            } catch (Throwable th) {
                String faultingClassName = th.getStackTrace()[0].getClassName();
                logger.debug("MixinService [{}] failed initialisation: {}", new Object[]{faultingClassName, th.getMessage()});
                int pos = faultingClassName.lastIndexOf(46);
                Object[] objArr = new Object[1];
                objArr[0] = pos < 0 ? faultingClassName : faultingClassName.substring(pos + 1);
                badServices.add(String.format("ERROR[%s]", objArr));
            }
            if (service.isValid()) {
                return service;
            }
            logger.debug("MixinService [{}] is not valid", new Object[]{service.getName()});
            badServices.add(String.format("INVALID[%s]", service.getName()));
        }
        String brokenServiceNote = brokenServiceCount == 0 ? "" : " and " + brokenServiceCount + " other invalid services.";
        throw new ServiceNotAvailableError("No mixin host service is available. Services: " + Joiner.on(", ").join(badServices) + brokenServiceNote);
    }

    public static IGlobalPropertyService getGlobalPropertyService() {
        return getInstance().getGlobalPropertyServiceInstance();
    }

    private IGlobalPropertyService getGlobalPropertyServiceInstance() {
        if (this.propertyService == null) {
            this.propertyService = initPropertyService();
        }
        return this.propertyService;
    }

    private IGlobalPropertyService initPropertyService() {
        ServiceLoader<IGlobalPropertyService> serviceLoader = ServiceLoader.load(IGlobalPropertyService.class, getClass().getClassLoader());
        Iterator<IGlobalPropertyService> iter = serviceLoader.iterator();
        while (iter.hasNext()) {
            try {
                IGlobalPropertyService service = iter.next();
                return service;
            } catch (ServiceConfigurationError e) {
            } catch (Throwable th) {
            }
        }
        throw new ServiceNotAvailableError("No mixin global property service is available");
    }
}
