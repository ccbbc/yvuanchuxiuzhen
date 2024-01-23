package edebe.doglib.api.helper;

import javax.annotation.Nullable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/CapabilityHelper.class */
public interface CapabilityHelper {
    /* JADX WARN: Multi-variable type inference failed */
    static <T> T getItemCapability(ItemStack stack, Capability<T> capability, T instance, @Nullable EnumFacing facing) {
        T itemCapability = stack.hasCapability(capability, facing) ? stack.getCapability(capability, facing) : instance;
        return itemCapability;
    }
}
