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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureInfiniteBagUpdate.class */
public class ProcedureInfiniteBagUpdate extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureInfiniteBagUpdate(ElementsInfiniteStorageMod instance) {
        super(instance, 25);
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$8] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$5] */
    /* JADX WARN: Type inference failed for: r2v22, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$6] */
    /* JADX WARN: Type inference failed for: r2v31, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$4] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$2] */
    /* JADX WARN: Type inference failed for: r3v19, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$7] */
    /* JADX WARN: Type inference failed for: r3v6, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if ((entityPlayerMP instanceof EntityPlayer) && (((EntityPlayer) entityPlayerMP).field_71070_bA instanceof GuiInfiniteBagGui.GuiContainerMod) && !entityPlayerMP.getEntityData().func_74779_i("SaveItemStack" + new DecimalFormat("0").format(entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage"))).equals("")) {
            entityPlayerMP.getEntityData().func_74780_a("SlotNum", 0.0d);
            for (int index0 = 0; index0 < 54; index0++) {
                entityPlayerMP.getEntityData().func_74778_a("ItemStackTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.1
                    String string;
                    String[] value;
                    String indexvalue;

                    {
                        this.string = entityPlayerMP.getEntityData().func_74779_i("SaveItemStack" + new DecimalFormat("0").format(entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage")));
                        this.value = this.string.split("   ");
                        this.indexvalue = this.value[(int) entityPlayerMP.getEntityData().func_74769_h("SlotNum")];
                    }

                    String getString() {
                        String s = this.indexvalue;
                        return s;
                    }
                }.getString());
                entityPlayerMP.getEntityData().func_74780_a("ItemStackNumTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.2
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.3
                    String string;
                    String[] value;
                    String indexvalue;

                    {
                        this.string = entityPlayerMP.getEntityData().func_74779_i("SaveItemStackNum" + new DecimalFormat("0").format(entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage")));
                        this.value = this.string.split("   ");
                        this.indexvalue = this.value[(int) entityPlayerMP.getEntityData().func_74769_h("SlotNum")];
                    }

                    String getString() {
                        String s = this.indexvalue;
                        return s;
                    }
                }.getString()));
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier = entityPlayerMP.field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            ItemStack _setstack = new ItemStack(Item.func_111206_d(entityPlayerMP.getEntityData().func_74779_i("ItemStackTemp")), 1);
                            _setstack.func_190920_e((int) entityPlayerMP.getEntityData().func_74769_h("ItemStackNumTemp"));
                            ((Slot) ((Map) invobj).get(Integer.valueOf((int) entityPlayerMP.getEntityData().func_74769_h("SlotNum")))).func_75215_d(_setstack);
                            supplier.func_75142_b();
                        }
                    }
                }
                if (!entityPlayerMP.getEntityData().func_74779_i("SaveItemStackNbt" + new DecimalFormat("0").format(entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage"))).equals("")) {
                    entityPlayerMP.getEntityData().func_74778_a("ItemStackNbtTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.4
                        String string;
                        String[] value;
                        String indexvalue;

                        {
                            this.string = entityPlayerMP.getEntityData().func_74779_i("SaveItemStackNbt" + new DecimalFormat("0").format(entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage")));
                            this.value = this.string.split("   ");
                            this.indexvalue = this.value[(int) entityPlayerMP.getEntityData().func_74769_h("SlotNum")];
                        }

                        String getString() {
                            String s = this.indexvalue;
                            return s;
                        }
                    }.getString());
                }
                if (!entityPlayerMP.getEntityData().func_74779_i("ItemStackNbtTemp").equals("-1")) {
                    NBTTagCompound itemNbtTag = null;
                    try {
                        itemNbtTag = JsonToNBT.func_180713_a(entityPlayerMP.getEntityData().func_74779_i("ItemStackNbtTemp"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ItemStack _stack = new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.5
                        public ItemStack getItemStack(int sltid) {
                            if (entityPlayerMP instanceof EntityPlayerMP) {
                                Supplier supplier2 = entityPlayerMP.field_71070_bA;
                                if (supplier2 instanceof Supplier) {
                                    Object invobj2 = supplier2.get();
                                    if (invobj2 instanceof Map) {
                                        return ((Slot) ((Map) invobj2).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack((int) entityPlayerMP.getEntityData().func_74769_h("SlotNum"));
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    _stack.func_77982_d(itemNbtTag);
                }
                if (!entityPlayerMP.getEntityData().func_74779_i("SaveItemStackMeta" + new DecimalFormat("0").format(entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage"))).equals("")) {
                    entityPlayerMP.getEntityData().func_74780_a("ItemStackMetaTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.6
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e2) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.7
                        String string;
                        String[] value;
                        String indexvalue;

                        {
                            this.string = entityPlayerMP.getEntityData().func_74779_i("SaveItemStackMeta" + new DecimalFormat("0").format(entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage")));
                            this.value = this.string.split("   ");
                            this.indexvalue = this.value[(int) entityPlayerMP.getEntityData().func_74769_h("SlotNum")];
                        }

                        String getString() {
                            String s = this.indexvalue;
                            return s;
                        }
                    }.getString()));
                    if (entityPlayerMP.getEntityData().func_74769_h("ItemStackMetaTemp") != 0.0d) {
                        new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagUpdate.8
                            public ItemStack getItemStack(int sltid) {
                                if (entityPlayerMP instanceof EntityPlayerMP) {
                                    Supplier supplier2 = entityPlayerMP.field_71070_bA;
                                    if (supplier2 instanceof Supplier) {
                                        Object invobj2 = supplier2.get();
                                        if (invobj2 instanceof Map) {
                                            return ((Slot) ((Map) invobj2).get(Integer.valueOf(sltid))).func_75211_c();
                                        }
                                    }
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack((int) entityPlayerMP.getEntityData().func_74769_h("SlotNum")).func_77964_b((int) entityPlayerMP.getEntityData().func_74769_h("ItemStackMetaTemp"));
                    }
                }
                entityPlayerMP.getEntityData().func_74780_a("SlotNum", entityPlayerMP.getEntityData().func_74769_h("SlotNum") + 1.0d);
            }
        }
    }
}
