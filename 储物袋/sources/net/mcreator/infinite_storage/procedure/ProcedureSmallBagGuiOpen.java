package net.mcreator.infinite_storage.procedure;

import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.mcreator.infinite_storage.InfiniteStorageMod;
import net.mcreator.infinite_storage.gui.GuiSmallBagGui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureSmallBagGuiOpen.class */
public class ProcedureSmallBagGuiOpen extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureSmallBagGuiOpen(ElementsInfiniteStorageMod instance) {
        super(instance, 13);
    }

    /* JADX WARN: Type inference failed for: r0v143, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$8] */
    /* JADX WARN: Type inference failed for: r0v175, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$5] */
    /* JADX WARN: Type inference failed for: r2v33, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$6] */
    /* JADX WARN: Type inference failed for: r2v43, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$2] */
    /* JADX WARN: Type inference failed for: r3v10, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$7] */
    /* JADX WARN: Type inference failed for: r3v5, types: [net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        String str;
        String str2;
        String str3;
        String str4;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        String str5;
        String str6;
        double d6;
        double d7;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityLivingBase.getEntityData().func_74769_h("ShenShi") >= 24.0d && entityLivingBase.getEntityData().func_74769_h("Power") >= 5.0d) {
            entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 5.0d);
            if (!(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("_bag")) {
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).openGui(InfiniteStorageMod.instance, GuiSmallBagGui.GUIID, world, x, y, z);
                }
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    str = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStack");
                } else {
                    str = "";
                }
                if (!str.equals("")) {
                    ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    _stack.func_77978_p().func_74780_a("SlotNum", 0.0d);
                    for (int index0 = 0; index0 < 27; index0++) {
                        ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack2.func_77942_o()) {
                            _stack2.func_77982_d(new NBTTagCompound());
                        }
                        _stack2.func_77978_p().func_74778_a("ItemStackTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.1
                            String string;
                            String[] value;
                            String indexvalue;

                            {
                                String str7;
                                double d8;
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    str7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStack");
                                } else {
                                    str7 = "";
                                }
                                this.string = str7;
                                this.value = this.string.split("   ");
                                String[] strArr = this.value;
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                                } else {
                                    d8 = -1.0d;
                                }
                                this.indexvalue = strArr[(int) d8];
                            }

                            String getString() {
                                String s = this.indexvalue;
                                return s;
                            }
                        }.getString());
                        ItemStack _stack3 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack3.func_77942_o()) {
                            _stack3.func_77982_d(new NBTTagCompound());
                        }
                        _stack3.func_77978_p().func_74780_a("ItemStackNumTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.2
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.3
                            String string;
                            String[] value;
                            String indexvalue;

                            {
                                String str7;
                                double d8;
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    str7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackNum");
                                } else {
                                    str7 = "";
                                }
                                this.string = str7;
                                this.value = this.string.split("   ");
                                String[] strArr = this.value;
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                                } else {
                                    d8 = -1.0d;
                                }
                                this.indexvalue = strArr[(int) d8];
                            }

                            String getString() {
                                String s = this.indexvalue;
                                return s;
                            }
                        }.getString()));
                        if (entityLivingBase instanceof EntityPlayerMP) {
                            Supplier supplier = ((EntityPlayerMP) entityLivingBase).field_71070_bA;
                            if (supplier instanceof Supplier) {
                                Object invobj = supplier.get();
                                if (invobj instanceof Map) {
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        str6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("ItemStackTemp");
                                    } else {
                                        str6 = "";
                                    }
                                    ItemStack _setstack = new ItemStack(Item.func_111206_d(str6), 1);
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("ItemStackNumTemp");
                                    } else {
                                        d6 = -1.0d;
                                    }
                                    _setstack.func_190920_e((int) d6);
                                    Map map = (Map) invobj;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                                    } else {
                                        d7 = -1.0d;
                                    }
                                    ((Slot) map.get(Integer.valueOf((int) d7))).func_75215_d(_setstack);
                                    supplier.func_75142_b();
                                }
                            }
                        }
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            str2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackNbt");
                        } else {
                            str2 = "";
                        }
                        if (!str2.equals("")) {
                            ItemStack _stack4 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                            if (!_stack4.func_77942_o()) {
                                _stack4.func_77982_d(new NBTTagCompound());
                            }
                            _stack4.func_77978_p().func_74778_a("ItemStackNbtTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.4
                                String string;
                                String[] value;
                                String indexvalue;

                                {
                                    String str7;
                                    double d8;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        str7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackNbt");
                                    } else {
                                        str7 = "";
                                    }
                                    this.string = str7;
                                    this.value = this.string.split("   ");
                                    String[] strArr = this.value;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                                    } else {
                                        d8 = -1.0d;
                                    }
                                    this.indexvalue = strArr[(int) d8];
                                }

                                String getString() {
                                    String s = this.indexvalue;
                                    return s;
                                }
                            }.getString());
                        }
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            str3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("ItemStackNbtTemp");
                        } else {
                            str3 = "";
                        }
                        if (!str3.equals("-1")) {
                            NBTTagCompound itemNbtTag = null;
                            try {
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    str5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("ItemStackNbtTemp");
                                } else {
                                    str5 = "";
                                }
                                itemNbtTag = JsonToNBT.func_180713_a(str5);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            ?? r0 = new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.5
                                public ItemStack getItemStack(int sltid) {
                                    if (entityLivingBase instanceof EntityPlayerMP) {
                                        Supplier supplier2 = entityLivingBase.field_71070_bA;
                                        if (supplier2 instanceof Supplier) {
                                            Object invobj2 = supplier2.get();
                                            if (invobj2 instanceof Map) {
                                                return ((Slot) ((Map) invobj2).get(Integer.valueOf(sltid))).func_75211_c();
                                            }
                                        }
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            };
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                            } else {
                                d5 = -1.0d;
                            }
                            ItemStack _stack5 = r0.getItemStack((int) d5);
                            if (!_stack5.func_77942_o()) {
                                _stack5.func_77982_d(new NBTTagCompound());
                            }
                            _stack5.func_77982_d(itemNbtTag);
                        }
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            str4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackMeta");
                        } else {
                            str4 = "";
                        }
                        if (!str4.equals("")) {
                            ItemStack _stack6 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                            if (!_stack6.func_77942_o()) {
                                _stack6.func_77982_d(new NBTTagCompound());
                            }
                            _stack6.func_77978_p().func_74780_a("ItemStackMetaTemp", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.6
                                int convert(String s) {
                                    try {
                                        return Integer.parseInt(s.trim());
                                    } catch (Exception e2) {
                                        return 0;
                                    }
                                }
                            }.convert(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.7
                                String string;
                                String[] value;
                                String indexvalue;

                                {
                                    String str7;
                                    double d8;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        str7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("SaveItemStackMeta");
                                    } else {
                                        str7 = "";
                                    }
                                    this.string = str7;
                                    this.value = this.string.split("   ");
                                    String[] strArr = this.value;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                                    } else {
                                        d8 = -1.0d;
                                    }
                                    this.indexvalue = strArr[(int) d8];
                                }

                                String getString() {
                                    String s = this.indexvalue;
                                    return s;
                                }
                            }.getString()));
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("ItemStackMetaTemp");
                            } else {
                                d2 = -1.0d;
                            }
                            if (d2 != 0.0d) {
                                ?? r02 = new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureSmallBagGuiOpen.8
                                    public ItemStack getItemStack(int sltid) {
                                        if (entityLivingBase instanceof EntityPlayerMP) {
                                            Supplier supplier2 = entityLivingBase.field_71070_bA;
                                            if (supplier2 instanceof Supplier) {
                                                Object invobj2 = supplier2.get();
                                                if (invobj2 instanceof Map) {
                                                    return ((Slot) ((Map) invobj2).get(Integer.valueOf(sltid))).func_75211_c();
                                                }
                                            }
                                        }
                                        return ItemStack.field_190927_a;
                                    }
                                };
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                                } else {
                                    d3 = -1.0d;
                                }
                                ItemStack itemStack = r02.getItemStack((int) d3);
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("ItemStackMetaTemp");
                                } else {
                                    d4 = -1.0d;
                                }
                                itemStack.func_77964_b((int) d4);
                            }
                        }
                        ItemStack _stack7 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack7.func_77942_o()) {
                            _stack7.func_77982_d(new NBTTagCompound());
                        }
                        NBTTagCompound func_77978_p = _stack7.func_77978_p();
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SlotNum");
                        } else {
                            d = -1.0d;
                        }
                        func_77978_p.func_74780_a("SlotNum", d + 1.0d);
                    }
                }
            }
        } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§4§l你的神识或灵力不足以支撑你打开此储物袋"), true);
        }
    }
}
