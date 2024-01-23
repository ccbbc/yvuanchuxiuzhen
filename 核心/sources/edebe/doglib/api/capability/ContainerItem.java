package edebe.doglib.api.capability;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.NonNullList;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/capability/ContainerItem.class */
public class ContainerItem implements IContainerItem {
    private Map<Integer, NonNullList<ItemStack>> itemPages = new HashMap();

    /* renamed from: serializeNBT */
    public NBTTagCompound m1serializeNBT() {
        NBTTagList pages = new NBTTagList();
        for (Integer num : this.itemPages.keySet()) {
            int pageIndex = num.intValue();
            NBTTagCompound page = new NBTTagCompound();
            page.func_74774_a("PageIndex", (byte) pageIndex);
            NonNullList<ItemStack> list = this.itemPages.get(Integer.valueOf(pageIndex));
            page.func_74768_a("PageSize", list.size());
            ItemStackHelper.func_191282_a(page, list);
            pages.func_74742_a(page);
        }
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.func_74782_a("Pages", pages);
        return nbt;
    }

    public void deserializeNBT(NBTTagCompound nbt) {
        Map<Integer, NonNullList<ItemStack>> itemPages = new HashMap<>();
        NBTTagList pages = nbt.func_150295_c("Pages", 10);
        for (int count = 0; count < pages.func_74745_c(); count++) {
            NBTTagCompound page = pages.func_150305_b(count);
            int pageIndex = page.func_74771_c("PageIndex") & 255;
            int pageSize = page.func_74762_e("PageSize") & Integer.MAX_VALUE;
            NonNullList<ItemStack> list = NonNullList.func_191197_a(pageSize, ItemStack.field_190927_a);
            ItemStackHelper.func_191283_b(page, list);
            itemPages.put(Integer.valueOf(pageIndex), list);
        }
        this.itemPages = itemPages;
    }

    @Override // edebe.doglib.api.capability.IContainerItem
    public NonNullList<ItemStack> getPageItemList(int page) {
        return this.itemPages.containsKey(Integer.valueOf(page)) ? this.itemPages.get(Integer.valueOf(page)) : NonNullList.func_191197_a(1, ItemStack.field_190927_a);
    }

    @Override // edebe.doglib.api.capability.IContainerItem
    public void setPageItemList(int page, NonNullList<ItemStack> itemList) {
        this.itemPages.put(Integer.valueOf(page), itemList);
    }

    @Override // edebe.doglib.api.capability.IContainerItem
    public Map<Integer, NonNullList<ItemStack>> getItemPages() {
        return this.itemPages;
    }

    @Override // edebe.doglib.api.capability.IContainerItem
    public void setItemPages(Map<Integer, NonNullList<ItemStack>> itemPages) {
        this.itemPages = itemPages;
    }
}
