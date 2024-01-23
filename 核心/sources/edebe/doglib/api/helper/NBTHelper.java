package edebe.doglib.api.helper;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/NBTHelper.class */
public interface NBTHelper {
    static NBTTagCompound getCompoundTag(ItemStack stack) {
        if (!stack.func_77942_o()) {
            stack.func_77982_d(new NBTTagCompound());
        }
        return stack.func_77978_p();
    }
}
