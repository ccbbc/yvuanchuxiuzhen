package edebe.doglib.api.capability;

import java.util.Map;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.util.INBTSerializable;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/capability/IContainerItem.class */
public interface IContainerItem extends INBTSerializable<NBTTagCompound> {
    NonNullList<ItemStack> getPageItemList(int i);

    void setPageItemList(int i, NonNullList<ItemStack> nonNullList);

    Map<Integer, NonNullList<ItemStack>> getItemPages();

    void setItemPages(Map<Integer, NonNullList<ItemStack>> map);

    default NonNullList<ItemStack> getItemList() {
        return getPageItemList(0);
    }

    default void setItemList(NonNullList<ItemStack> itemList) {
        setPageItemList(0, itemList);
    }
}
