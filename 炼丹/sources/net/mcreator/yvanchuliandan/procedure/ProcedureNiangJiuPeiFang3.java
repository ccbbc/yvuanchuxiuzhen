package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCaiLiao01;
import net.mcreator.yvanchuliandan.item.ItemCaiLiao03;
import net.mcreator.yvanchuliandan.item.ItemJiuFang03;
import net.mcreator.yvanchuliandan.item.ItemYuanJiang03;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureNiangJiuPeiFang3.class */
public class ProcedureNiangJiuPeiFang3 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureNiangJiuPeiFang3(ElementsYvanchuliandanMod instance) {
        super(instance, 696);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$2] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$3] */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$4] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$5] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$6] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$7] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$8] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$1] */
    /* JADX WARN: Type inference failed for: r1v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if (entityPlayerMP.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
            if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.1
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
                        if (supplier instanceof Supplier) {
                            Object invobj = supplier.get();
                            if (invobj instanceof Map) {
                                return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.2
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
                        if (supplier instanceof Supplier) {
                            Object invobj = supplier.get();
                            if (invobj instanceof Map) {
                                return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(4).func_77973_b() == new ItemStack(ItemYuanJiang03.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.3
                public int getAmount(int sltid) {
                    ItemStack stack;
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
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
            }.getAmount(4) < 64)) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.4
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
                        if (supplier instanceof Supplier) {
                            Object invobj = supplier.get();
                            if (invobj instanceof Map) {
                                return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(3).func_77973_b() == new ItemStack(ItemJiuFang03.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.5
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
                        if (supplier instanceof Supplier) {
                            Object invobj = supplier.get();
                            if (invobj instanceof Map) {
                                return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(0).func_77973_b() == new ItemStack(ItemCaiLiao01.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.6
                public int getAmount(int sltid) {
                    ItemStack stack;
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
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
            }.getAmount(0) >= 5 && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.7
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
                        if (supplier instanceof Supplier) {
                            Object invobj = supplier.get();
                            if (invobj instanceof Map) {
                                return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(1).func_77973_b() == new ItemStack(ItemCaiLiao03.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.8
                public int getAmount(int sltid) {
                    ItemStack stack;
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayerMP.field_71070_bA;
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
            }.getAmount(1) >= 3) {
                entityPlayerMP.getEntityData().func_74757_a("酿酒错误", false);
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier = entityPlayerMP.field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            ((Slot) ((Map) invobj).get(0)).func_75209_a(5);
                            supplier.func_75142_b();
                        }
                    }
                }
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier2 = entityPlayerMP.field_71070_bA;
                    if (supplier2 instanceof Supplier) {
                        Object invobj2 = supplier2.get();
                        if (invobj2 instanceof Map) {
                            ((Slot) ((Map) invobj2).get(1)).func_75209_a(3);
                            supplier2.func_75142_b();
                        }
                    }
                }
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier3 = entityPlayerMP.field_71070_bA;
                    if (supplier3 instanceof Supplier) {
                        Object invobj3 = supplier3.get();
                        if (invobj3 instanceof Map) {
                            ((Slot) ((Map) invobj3).get(2)).func_75209_a(1);
                            supplier3.func_75142_b();
                        }
                    }
                }
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier4 = entityPlayerMP.field_71070_bA;
                    if (supplier4 instanceof Supplier) {
                        Object invobj4 = supplier4.get();
                        if (invobj4 instanceof Map) {
                            ItemStack _setstack = new ItemStack(ItemYuanJiang03.block, 1);
                            _setstack.func_190920_e(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang3.9
                                public int getAmount(int sltid) {
                                    ItemStack stack;
                                    if (entityPlayerMP instanceof EntityPlayerMP) {
                                        Supplier supplier5 = entityPlayerMP.field_71070_bA;
                                        if (supplier5 instanceof Supplier) {
                                            Object invobj5 = supplier5.get();
                                            if ((invobj5 instanceof Map) && (stack = ((Slot) ((Map) invobj5).get(Integer.valueOf(sltid))).func_75211_c()) != null) {
                                                return stack.func_190916_E();
                                            }
                                            return 0;
                                        }
                                        return 0;
                                    }
                                    return 0;
                                }
                            }.getAmount(4) + 1);
                            ((Slot) ((Map) invobj4).get(4)).func_75215_d(_setstack);
                            supplier4.func_75142_b();
                        }
                    }
                }
            }
        }
    }
}
