package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuFang02;
import net.mcreator.yvanchuliandan.item.ItemYuanJiang02;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureNiangJiuPeiFang2.class */
public class ProcedureNiangJiuPeiFang2 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureNiangJiuPeiFang2(ElementsYvanchuliandanMod instance) {
        super(instance, 695);
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$2] */
    /* JADX WARN: Type inference failed for: r0v106, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$3] */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$4] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$5] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$6] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$7] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$8] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$1] */
    /* JADX WARN: Type inference failed for: r1v27, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if (entityPlayerMP.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.1
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
            }.getItemStack(4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.2
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
            }.getItemStack(4).func_77973_b() == new ItemStack(ItemYuanJiang02.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.3
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
            }.getAmount(4) < 64)) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.4
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
            }.getItemStack(3).func_77973_b() == new ItemStack(ItemJiuFang02.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.5
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
            }.getItemStack(0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:tao_zi") && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.6
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
            }.getAmount(0) >= 2 && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.7
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
            }.getItemStack(1).func_77973_b() == new ItemStack(Blocks.field_150432_aD, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.8
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
                            ((Slot) ((Map) invobj).get(0)).func_75209_a(2);
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
                            ItemStack _setstack = new ItemStack(ItemYuanJiang02.block, 1);
                            _setstack.func_190920_e(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang2.9
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
