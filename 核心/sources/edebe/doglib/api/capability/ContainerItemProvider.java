package edebe.doglib.api.capability;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/capability/ContainerItemProvider.class */
public class ContainerItemProvider implements ICapabilitySerializable<NBTTagCompound> {
    private ContainerItem container;

    private IContainerItem getContainerItem() {
        if (this.container == null) {
            this.container = new ContainerItem();
        }
        return this.container;
    }

    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing enumFacing) {
        return capability == DogLibCapabilities.CAPABILITY_CONTAINER_ITEM;
    }

    @Nullable
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing enumFacing) {
        if (capability == DogLibCapabilities.CAPABILITY_CONTAINER_ITEM) {
            return (T) getContainerItem();
        }
        return null;
    }

    /* renamed from: serializeNBT */
    public NBTTagCompound m2serializeNBT() {
        return getContainerItem().serializeNBT();
    }

    public void deserializeNBT(NBTTagCompound nbt) {
        getContainerItem().deserializeNBT(nbt);
    }
}
