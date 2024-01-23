package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCaoYao502;
import net.mcreator.yvanchuliandan.item.ItemCaoYao901;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1001;
import net.mcreator.yvanchuliandan.item.ItemJiuFang04;
import net.mcreator.yvanchuliandan.item.ItemJiuFang05;
import net.mcreator.yvanchuliandan.item.ItemQingLi;
import net.mcreator.yvanchuliandan.item.ItemYuanJiang04;
import net.mcreator.yvanchuliandan.item.ItemYuanJiang05;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureNiangJiuPeiFang4.class */
public class ProcedureNiangJiuPeiFang4 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureNiangJiuPeiFang4(ElementsYvanchuliandanMod instance) {
        super(instance, 697);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$10] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$13] */
    /* JADX WARN: Type inference failed for: r0v106, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$14] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$15] */
    /* JADX WARN: Type inference failed for: r0v111, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$16] */
    /* JADX WARN: Type inference failed for: r0v114, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$17] */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$4] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$5] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$6] */
    /* JADX WARN: Type inference failed for: r0v191, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$11] */
    /* JADX WARN: Type inference failed for: r0v194, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$12] */
    /* JADX WARN: Type inference failed for: r0v196, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$2] */
    /* JADX WARN: Type inference failed for: r0v199, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$3] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$7] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$8] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$1] */
    /* JADX WARN: Type inference failed for: r1v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$9] */
    /* JADX WARN: Type inference failed for: r1v67, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4$18] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if (entityPlayerMP.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
            if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.1
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
            }.getItemStack(4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.2
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
            }.getItemStack(4).func_77973_b() == new ItemStack(ItemYuanJiang04.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.3
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
            }.getAmount(4) < 64)) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.4
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
            }.getItemStack(3).func_77973_b() == new ItemStack(ItemJiuFang04.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.5
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
            }.getItemStack(0).func_77973_b() == new ItemStack(ItemCaoYao901.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.6
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
            }.getAmount(0) >= 5 && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.7
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
            }.getItemStack(1).func_77973_b() == new ItemStack(ItemCaoyao1001.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.8
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
            }.getAmount(1) >= 5) {
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
                            ((Slot) ((Map) invobj2).get(1)).func_75209_a(5);
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
                            ItemStack _setstack = new ItemStack(ItemYuanJiang04.block, 1);
                            _setstack.func_190920_e(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.9
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
            if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.10
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier5 = entityPlayerMP.field_71070_bA;
                        if (supplier5 instanceof Supplier) {
                            Object invobj5 = supplier5.get();
                            if (invobj5 instanceof Map) {
                                return ((Slot) ((Map) invobj5).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.11
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier5 = entityPlayerMP.field_71070_bA;
                        if (supplier5 instanceof Supplier) {
                            Object invobj5 = supplier5.get();
                            if (invobj5 instanceof Map) {
                                return ((Slot) ((Map) invobj5).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(4).func_77973_b() == new ItemStack(ItemYuanJiang05.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.12
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
            }.getAmount(4) < 64)) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.13
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier5 = entityPlayerMP.field_71070_bA;
                        if (supplier5 instanceof Supplier) {
                            Object invobj5 = supplier5.get();
                            if (invobj5 instanceof Map) {
                                return ((Slot) ((Map) invobj5).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(3).func_77973_b() == new ItemStack(ItemJiuFang05.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.14
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier5 = entityPlayerMP.field_71070_bA;
                        if (supplier5 instanceof Supplier) {
                            Object invobj5 = supplier5.get();
                            if (invobj5 instanceof Map) {
                                return ((Slot) ((Map) invobj5).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(0).func_77973_b() == new ItemStack(ItemQingLi.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.15
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
            }.getAmount(0) >= 2 && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.16
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayerMP instanceof EntityPlayerMP) {
                        Supplier supplier5 = entityPlayerMP.field_71070_bA;
                        if (supplier5 instanceof Supplier) {
                            Object invobj5 = supplier5.get();
                            if (invobj5 instanceof Map) {
                                return ((Slot) ((Map) invobj5).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(1).func_77973_b() == new ItemStack(ItemCaoYao502.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.17
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
            }.getAmount(1) >= 3) {
                entityPlayerMP.getEntityData().func_74757_a("酿酒错误", false);
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier5 = entityPlayerMP.field_71070_bA;
                    if (supplier5 instanceof Supplier) {
                        Object invobj5 = supplier5.get();
                        if (invobj5 instanceof Map) {
                            ((Slot) ((Map) invobj5).get(0)).func_75209_a(2);
                            supplier5.func_75142_b();
                        }
                    }
                }
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier6 = entityPlayerMP.field_71070_bA;
                    if (supplier6 instanceof Supplier) {
                        Object invobj6 = supplier6.get();
                        if (invobj6 instanceof Map) {
                            ((Slot) ((Map) invobj6).get(1)).func_75209_a(3);
                            supplier6.func_75142_b();
                        }
                    }
                }
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier7 = entityPlayerMP.field_71070_bA;
                    if (supplier7 instanceof Supplier) {
                        Object invobj7 = supplier7.get();
                        if (invobj7 instanceof Map) {
                            ((Slot) ((Map) invobj7).get(2)).func_75209_a(1);
                            supplier7.func_75142_b();
                        }
                    }
                }
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier8 = entityPlayerMP.field_71070_bA;
                    if (supplier8 instanceof Supplier) {
                        Object invobj8 = supplier8.get();
                        if (invobj8 instanceof Map) {
                            ItemStack _setstack2 = new ItemStack(ItemYuanJiang05.block, 1);
                            _setstack2.func_190920_e(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang4.18
                                public int getAmount(int sltid) {
                                    ItemStack stack;
                                    if (entityPlayerMP instanceof EntityPlayerMP) {
                                        Supplier supplier9 = entityPlayerMP.field_71070_bA;
                                        if (supplier9 instanceof Supplier) {
                                            Object invobj9 = supplier9.get();
                                            if ((invobj9 instanceof Map) && (stack = ((Slot) ((Map) invobj9).get(Integer.valueOf(sltid))).func_75211_c()) != null) {
                                                return stack.func_190916_E();
                                            }
                                            return 0;
                                        }
                                        return 0;
                                    }
                                    return 0;
                                }
                            }.getAmount(4) + 1);
                            ((Slot) ((Map) invobj8).get(4)).func_75215_d(_setstack2);
                            supplier8.func_75142_b();
                        }
                    }
                }
            }
        }
    }
}
