package edebe.core;

import java.util.Map;
import javax.annotation.Nullable;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.Name("EdebeCoreMod")
/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/core/EdebeCoreModPlugin.class */
public class EdebeCoreModPlugin implements IFMLLoadingPlugin {
    public static final Logger LOGGER = LogManager.getLogger("EdebeCoreMod");

    static {
        LOGGER.info("EdebeCoreMod Initializing...");
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.edebecoremod.json");
    }

    public String[] getASMTransformerClass() {
        return new String[0];
    }

    public String getModContainerClass() {
        return null;
    }

    @Nullable
    public String getSetupClass() {
        return null;
    }

    public void injectData(Map<String, Object> map) {
    }

    public String getAccessTransformerClass() {
        return null;
    }
}
