package net.mcreator.infinite_storage.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.mcreator.infinite_storage.gui.GuiInfiniteBagGui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureInfiniteBagGuiClose.class */
public class ProcedureInfiniteBagGuiClose extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureInfiniteBagGuiClose(ElementsInfiniteStorageMod instance) {
        super(instance, 23);
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose$1] */
    /* JADX WARN: Type inference failed for: r3v54, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose$3] */
    /* JADX WARN: Type inference failed for: r3v71, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose$5] */
    /* JADX WARN: Type inference failed for: r3v78, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose$4] */
    /* JADX WARN: Type inference failed for: r4v26, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if ((entityPlayer instanceof EntityPlayer) && (entityPlayer.field_71070_bA instanceof GuiInfiniteBagGui.GuiContainerMod)) {
            entityPlayer.getEntityData().func_74780_a("InfiniteBagTipClear", 0.0d);
            entityPlayer.getEntityData().func_74778_a("SaveItemStack" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), "");
            entityPlayer.getEntityData().func_74778_a("SaveItemStackNum" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), "");
            entityPlayer.getEntityData().func_74778_a("SaveItemStackNbt" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), "");
            entityPlayer.getEntityData().func_74778_a("SaveItemStackMeta" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), "");
            entityPlayer.getEntityData().func_74780_a("SlotNum", 0.0d);
            for (int index0 = 0; index0 < 54; index0++) {
                entityPlayer.getEntityData().func_74778_a("SaveItemStack" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), entityPlayer.getEntityData().func_74779_i("SaveItemStack" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage"))) + "" + new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose.1
                    public ItemStack getItemStack(int sltid) {
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier = entityPlayer.field_71070_bA;
                            if (supplier instanceof Supplier) {
                                Object invobj = supplier.get();
                                if (invobj instanceof Map) {
                                    return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                }
                            }
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack((int) entityPlayer.getEntityData().func_74769_h("SlotNum")).func_77973_b().getRegistryName().toString() + "   ");
                entityPlayer.getEntityData().func_74778_a("SaveItemStackNum" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), entityPlayer.getEntityData().func_74779_i("SaveItemStackNum" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage"))) + "" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose.2
                    public int getAmount(int sltid) {
                        ItemStack stack;
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier = entityPlayer.field_71070_bA;
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
                }.getAmount((int) entityPlayer.getEntityData().func_74769_h("SlotNum"))) + "   ");
                entityPlayer.getEntityData().func_74778_a("SaveItemStackNbt" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), entityPlayer.getEntityData().func_74779_i("SaveItemStackNbt" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage"))) + "" + (new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose.3
                    public ItemStack getItemStack(int sltid) {
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier = entityPlayer.field_71070_bA;
                            if (supplier instanceof Supplier) {
                                Object invobj = supplier.get();
                                if (invobj instanceof Map) {
                                    return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                }
                            }
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack((int) entityPlayer.getEntityData().func_74769_h("SlotNum")).func_77942_o() ? new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose.4
                    public ItemStack getItemStack(int sltid) {
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier = entityPlayer.field_71070_bA;
                            if (supplier instanceof Supplier) {
                                Object invobj = supplier.get();
                                if (invobj instanceof Map) {
                                    return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                }
                            }
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack((int) entityPlayer.getEntityData().func_74769_h("SlotNum")).func_77978_p() : -1) + "   ");
                entityPlayer.getEntityData().func_74778_a("SaveItemStackMeta" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage")), entityPlayer.getEntityData().func_74779_i("SaveItemStackMeta" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("InfiniteBagPage"))) + "" + new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose.5
                    public ItemStack getItemStack(int sltid) {
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier = entityPlayer.field_71070_bA;
                            if (supplier instanceof Supplier) {
                                Object invobj = supplier.get();
                                if (invobj instanceof Map) {
                                    return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                }
                            }
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack((int) entityPlayer.getEntityData().func_74769_h("SlotNum")).func_77960_j() + "   ");
                entityPlayer.getEntityData().func_74780_a("SlotNum", entityPlayer.getEntityData().func_74769_h("SlotNum") + 1.0d);
            }
        }
    }
}
