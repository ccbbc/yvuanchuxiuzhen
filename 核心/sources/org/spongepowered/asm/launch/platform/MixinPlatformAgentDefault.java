package org.spongepowered.asm.launch.platform;

import org.spongepowered.asm.util.Constants;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinPlatformAgentDefault.class */
public class MixinPlatformAgentDefault extends MixinPlatformAgentAbstract {
    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public void prepare() {
        String[] split;
        String[] split2;
        String compatibilityLevel = this.handle.getAttribute(Constants.ManifestAttributes.COMPATIBILITY);
        if (compatibilityLevel != null) {
            this.manager.setCompatibilityLevel(compatibilityLevel);
        }
        String mixinConfigs = this.handle.getAttribute(Constants.ManifestAttributes.MIXINCONFIGS);
        if (mixinConfigs != null) {
            for (String config : mixinConfigs.split(",")) {
                this.manager.addConfig(config.trim());
            }
        }
        String tokenProviders = this.handle.getAttribute(Constants.ManifestAttributes.TOKENPROVIDERS);
        if (tokenProviders != null) {
            for (String provider : tokenProviders.split(",")) {
                this.manager.addTokenProvider(provider.trim());
            }
        }
        String connectorClass = this.handle.getAttribute(Constants.ManifestAttributes.MIXINCONNECTOR);
        if (connectorClass != null) {
            this.manager.addConnector(connectorClass.trim());
        }
    }
}
