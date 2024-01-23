package edebe.doglib.api.helper;

import net.minecraft.util.ResourceLocation;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/ItemHelper.class */
public interface ItemHelper {
    static String createUnlocalizedName(ResourceLocation resourceLocation) {
        return createUnlocalizedName(resourceLocation.func_110624_b(), resourceLocation.func_110623_a());
    }

    static String createUnlocalizedName(String modid, String name) {
        return "item." + modid + "." + name;
    }
}
