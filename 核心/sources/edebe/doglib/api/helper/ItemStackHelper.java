package edebe.doglib.api.helper;

import net.minecraft.item.ItemStack;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/ItemStackHelper.class */
public interface ItemStackHelper {
    static void setItemFireResistant(ItemStack stack, boolean fireResistant) {
        NBTHelper.getCompoundTag(stack).func_74757_a("FireResistant", fireResistant);
    }

    static boolean isItemFireResistant(ItemStack stack) {
        return NBTHelper.getCompoundTag(stack).func_74767_n("FireResistant");
    }
}
