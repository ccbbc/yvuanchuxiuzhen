package net.mcreator.infinite_storage.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.mcreator.infinite_storage.gui.GuiBigBagGui;
import net.mcreator.infinite_storage.item.ItemBigBag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureBigBagGuiClose.class */
public class ProcedureBigBagGuiClose extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureBigBagGuiClose(ElementsInfiniteStorageMod instance) {
        super(instance, 21);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose$1] */
    /* JADX WARN: Type inference failed for: r3v39, types: [net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose$3] */
    /* JADX WARN: Type inference failed for: r3v56, types: [net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose$5] */
    /* JADX WARN: Type inference failed for: r3v73, types: [net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose$4] */
    /* JADX WARN: Type inference failed for: r4v4, types: [net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        String str;
        String str2;
        String str3;
        String str4;
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityPlayer) && (((EntityPlayer) entityLivingBase).field_71070_bA instanceof GuiBigBagGui.GuiContainerMod)) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemBigBag.block, 1).func_77973_b()) {
                ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74778_a("SaveItemStack", "");
                ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                _stack2.func_77978_p().func_74778_a("SaveItemStackNum", "");
                ItemStack _stack3 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74778_a("SaveItemStackNbt", "");
                ItemStack _stack4 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                _stack4.func_77978_p().func_74778_a("SaveItemStackMeta", "");
                for (int i = 0; i < 54; i++) {
                    ItemStack _stack5 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack5.func_77942_o()) {
                        _stack5.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p = _stack5.func_77978_p();
                    StringBuilder sb = new StringBuilder();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        str = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStack");
                    } else {
                        str = "";
                    }
                    func_77978_p.func_74778_a("SaveItemStack", sb.append(str).append("").append(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose.1
                        public ItemStack getItemStack(int sltid) {
                            if (entityLivingBase instanceof EntityPlayerMP) {
                                Supplier supplier = entityLivingBase.field_71070_bA;
                                if (supplier instanceof Supplier) {
                                    Object invobj = supplier.get();
                                    if (invobj instanceof Map) {
                                        return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(i).func_77973_b().getRegistryName().toString()).append("").append("   ").toString());
                    ItemStack _stack6 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack6.func_77942_o()) {
                        _stack6.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p2 = _stack6.func_77978_p();
                    StringBuilder sb2 = new StringBuilder();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        str2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackNum");
                    } else {
                        str2 = "";
                    }
                    func_77978_p2.func_74778_a("SaveItemStackNum", sb2.append(str2).append("").append(new DecimalFormat("0").format(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose.2
                        public int getAmount(int sltid) {
                            ItemStack stack;
                            if (entityLivingBase instanceof EntityPlayerMP) {
                                Supplier supplier = entityLivingBase.field_71070_bA;
                                if (supplier instanceof Supplier) {
                                    Object invobj = supplier.get();
                                    if ((invobj instanceof Map) && (stack = ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c()) != null) {
                                        return stack.func_190916_E();
                                    }
                                    return 0;
                                }
                                return 0;
                            }
                            return 0;
                        }
                    }.getAmount(i))).append("").append("   ").toString());
                    ItemStack _stack7 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack7.func_77942_o()) {
                        _stack7.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p3 = _stack7.func_77978_p();
                    StringBuilder sb3 = new StringBuilder();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        str3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackNbt");
                    } else {
                        str3 = "";
                    }
                    func_77978_p3.func_74778_a("SaveItemStackNbt", sb3.append(str3).append("").append(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose.3
                        public ItemStack getItemStack(int sltid) {
                            if (entityLivingBase instanceof EntityPlayerMP) {
                                Supplier supplier = entityLivingBase.field_71070_bA;
                                if (supplier instanceof Supplier) {
                                    Object invobj = supplier.get();
                                    if (invobj instanceof Map) {
                                        return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(i).func_77942_o() ? new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose.4
                        public ItemStack getItemStack(int sltid) {
                            if (entityLivingBase instanceof EntityPlayerMP) {
                                Supplier supplier = entityLivingBase.field_71070_bA;
                                if (supplier instanceof Supplier) {
                                    Object invobj = supplier.get();
                                    if (invobj instanceof Map) {
                                        return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(i).func_77978_p() : -1).append("").append("   ").toString());
                    ItemStack _stack8 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack8.func_77942_o()) {
                        _stack8.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p4 = _stack8.func_77978_p();
                    StringBuilder sb4 = new StringBuilder();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        str4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackMeta");
                    } else {
                        str4 = "";
                    }
                    func_77978_p4.func_74778_a("SaveItemStackMeta", sb4.append(str4).append("").append(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiClose.5
                        public ItemStack getItemStack(int sltid) {
                            if (entityLivingBase instanceof EntityPlayerMP) {
                                Supplier supplier = entityLivingBase.field_71070_bA;
                                if (supplier instanceof Supplier) {
                                    Object invobj = supplier.get();
                                    if (invobj instanceof Map) {
                                        return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(i).func_77960_j()).append("").append("   ").toString());
                }
            }
        }
    }
}
