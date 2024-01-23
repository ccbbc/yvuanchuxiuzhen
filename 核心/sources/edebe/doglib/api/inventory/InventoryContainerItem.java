package edebe.doglib.api.inventory;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.IInventoryChangedListener;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/inventory/InventoryContainerItem.class */
public class InventoryContainerItem implements IInventory {
    private String inventoryTitle;
    private final int slotsCount;
    private final NonNullList<ItemStack> inventoryContents;
    private List<IInventoryChangedListener> changeListeners;
    private boolean hasCustomName;

    public InventoryContainerItem(String inventoryTitle, boolean hasCustomName, int slotsCount, NonNullList<ItemStack> inventoryContents) {
        this.inventoryTitle = inventoryTitle;
        this.hasCustomName = hasCustomName;
        this.slotsCount = slotsCount;
        this.inventoryContents = inventoryContents;
    }

    @SideOnly(Side.CLIENT)
    public InventoryContainerItem(ITextComponent inventoryTitle, boolean hasCustomName, int slotsCount, NonNullList<ItemStack> inventoryContents) {
        this(inventoryTitle.func_150260_c(), hasCustomName, slotsCount, inventoryContents);
    }

    @SideOnly(Side.CLIENT)
    public InventoryContainerItem(ITextComponent inventoryTitle, int slotsCount, NonNullList<ItemStack> inventoryContents) {
        this(inventoryTitle, true, slotsCount, inventoryContents);
    }

    public void addInventoryChangeListener(IInventoryChangedListener p_addInventoryChangeListener_1_) {
        if (this.changeListeners == null) {
            this.changeListeners = Lists.newArrayList();
        }
        this.changeListeners.add(p_addInventoryChangeListener_1_);
    }

    public void removeInventoryChangeListener(IInventoryChangedListener p_removeInventoryChangeListener_1_) {
        this.changeListeners.remove(p_removeInventoryChangeListener_1_);
    }

    public ItemStack func_70301_a(int p_getStackInSlot_1_) {
        return (p_getStackInSlot_1_ < 0 || p_getStackInSlot_1_ >= this.inventoryContents.size()) ? ItemStack.field_190927_a : (ItemStack) this.inventoryContents.get(p_getStackInSlot_1_);
    }

    public ItemStack func_70298_a(int p_decrStackSize_1_, int p_decrStackSize_2_) {
        ItemStack lvt_3_1_ = ItemStackHelper.func_188382_a(this.inventoryContents, p_decrStackSize_1_, p_decrStackSize_2_);
        if (!lvt_3_1_.func_190926_b()) {
            func_70296_d();
        }
        return lvt_3_1_;
    }

    public ItemStack addItem(ItemStack p_addItem_1_) {
        ItemStack lvt_2_1_ = p_addItem_1_.func_77946_l();
        for (int lvt_3_1_ = 0; lvt_3_1_ < this.slotsCount; lvt_3_1_++) {
            ItemStack lvt_4_1_ = func_70301_a(lvt_3_1_);
            if (lvt_4_1_.func_190926_b()) {
                func_70299_a(lvt_3_1_, lvt_2_1_);
                func_70296_d();
                return ItemStack.field_190927_a;
            }
            if (ItemStack.func_179545_c(lvt_4_1_, lvt_2_1_)) {
                int lvt_5_1_ = Math.min(func_70297_j_(), lvt_4_1_.func_77976_d());
                int lvt_6_1_ = Math.min(lvt_2_1_.func_190916_E(), lvt_5_1_ - lvt_4_1_.func_190916_E());
                if (lvt_6_1_ > 0) {
                    lvt_4_1_.func_190917_f(lvt_6_1_);
                    lvt_2_1_.func_190918_g(lvt_6_1_);
                    if (lvt_2_1_.func_190926_b()) {
                        func_70296_d();
                        return ItemStack.field_190927_a;
                    }
                } else {
                    continue;
                }
            }
        }
        if (lvt_2_1_.func_190916_E() != p_addItem_1_.func_190916_E()) {
            func_70296_d();
        }
        return lvt_2_1_;
    }

    public ItemStack func_70304_b(int p_removeStackFromSlot_1_) {
        ItemStack lvt_2_1_ = (ItemStack) this.inventoryContents.get(p_removeStackFromSlot_1_);
        if (lvt_2_1_.func_190926_b()) {
            return ItemStack.field_190927_a;
        }
        this.inventoryContents.set(p_removeStackFromSlot_1_, ItemStack.field_190927_a);
        return lvt_2_1_;
    }

    public void func_70299_a(int p_setInventorySlotContents_1_, ItemStack p_setInventorySlotContents_2_) {
        this.inventoryContents.set(p_setInventorySlotContents_1_, p_setInventorySlotContents_2_);
        if (!p_setInventorySlotContents_2_.func_190926_b() && p_setInventorySlotContents_2_.func_190916_E() > func_70297_j_()) {
            p_setInventorySlotContents_2_.func_190920_e(func_70297_j_());
        }
        func_70296_d();
    }

    public int func_70302_i_() {
        return this.slotsCount;
    }

    public boolean func_191420_l() {
        Iterator<ItemStack> var1 = this.inventoryContents.iterator();
        while (var1.hasNext()) {
            ItemStack lvt_2_1_ = var1.next();
            if (!lvt_2_1_.func_190926_b()) {
                return false;
            }
        }
        return true;
    }

    public String func_70005_c_() {
        return this.inventoryTitle;
    }

    public boolean func_145818_k_() {
        return this.hasCustomName;
    }

    public void setCustomName(String p_setCustomName_1_) {
        this.hasCustomName = true;
        this.inventoryTitle = p_setCustomName_1_;
    }

    public ITextComponent func_145748_c_() {
        return func_145818_k_() ? new TextComponentString(func_70005_c_()) : new TextComponentTranslation(func_70005_c_(), new Object[0]);
    }

    public int func_70297_j_() {
        return 64;
    }

    public void func_70296_d() {
        if (this.changeListeners != null) {
            for (IInventoryChangedListener changeListener : this.changeListeners) {
                changeListener.func_76316_a(this);
            }
        }
    }

    public boolean func_70300_a(EntityPlayer p_isUsableByPlayer_1_) {
        return true;
    }

    public void func_174889_b(EntityPlayer p_openInventory_1_) {
    }

    public void func_174886_c(EntityPlayer p_closeInventory_1_) {
    }

    public boolean func_94041_b(int p_isItemValidForSlot_1_, ItemStack p_isItemValidForSlot_2_) {
        return true;
    }

    public int func_174887_a_(int p_getField_1_) {
        return 0;
    }

    public void func_174885_b(int p_setField_1_, int p_setField_2_) {
    }

    public int func_174890_g() {
        return 0;
    }

    public void func_174888_l() {
        this.inventoryContents.clear();
    }
}
