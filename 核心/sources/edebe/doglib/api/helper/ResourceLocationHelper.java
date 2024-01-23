package edebe.doglib.api.helper;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/ResourceLocationHelper.class */
public interface ResourceLocationHelper {
    static ModelResourceLocation createModelResourceLocation(ResourceLocation resourceLocation) {
        return new ModelResourceLocation(resourceLocation.toString());
    }

    static ModelResourceLocation createModelResourceLocation(String modid, String path) {
        return new ModelResourceLocation(modid + ":" + path);
    }
}
