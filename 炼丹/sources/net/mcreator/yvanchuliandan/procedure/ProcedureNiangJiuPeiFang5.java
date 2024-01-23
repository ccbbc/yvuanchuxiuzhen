package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCaiLiao13;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1002;
import net.mcreator.yvanchuliandan.item.ItemChiSongZi;
import net.mcreator.yvanchuliandan.item.ItemJiuFang06;
import net.mcreator.yvanchuliandan.item.ItemJiuFang07;
import net.mcreator.yvanchuliandan.item.ItemYuanJiang06;
import net.mcreator.yvanchuliandan.item.ItemYuanJiang07;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureNiangJiuPeiFang5.class */
public class ProcedureNiangJiuPeiFang5 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureNiangJiuPeiFang5(ElementsYvanchuliandanMod instance) {
        super(instance, 698);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$10] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$13] */
    /* JADX WARN: Type inference failed for: r0v106, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$14] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$15] */
    /* JADX WARN: Type inference failed for: r0v111, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$16] */
    /* JADX WARN: Type inference failed for: r0v117, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$17] */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$4] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$5] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$6] */
    /* JADX WARN: Type inference failed for: r0v194, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$11] */
    /* JADX WARN: Type inference failed for: r0v197, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$12] */
    /* JADX WARN: Type inference failed for: r0v199, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$2] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$7] */
    /* JADX WARN: Type inference failed for: r0v202, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$3] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$8] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$1] */
    /* JADX WARN: Type inference failed for: r1v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$9] */
    /* JADX WARN: Type inference failed for: r1v66, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5$18] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if (entityPlayerMP.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
            if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.1
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
            }.getItemStack(4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.2
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
            }.getItemStack(4).func_77973_b() == new ItemStack(ItemYuanJiang06.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.3
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
            }.getAmount(4) < 64)) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.4
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
            }.getItemStack(3).func_77973_b() == new ItemStack(ItemJiuFang06.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.5
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
            }.getItemStack(0).func_77973_b() == new ItemStack(ItemCaiLiao13.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.6
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
            }.getAmount(0) >= 5 && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.7
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
            }.getItemStack(1).func_77973_b() == new ItemStack(ItemCaoYao1002.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.8
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
            }.getAmount(1) >= 7) {
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
                            ((Slot) ((Map) invobj2).get(1)).func_75209_a(7);
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
                            ItemStack _setstack = new ItemStack(ItemYuanJiang06.block, 1);
                            _setstack.func_190920_e(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.9
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
            if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.10
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
            }.getItemStack(4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.11
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
            }.getItemStack(4).func_77973_b() == new ItemStack(ItemYuanJiang07.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.12
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
            }.getAmount(4) < 64)) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.13
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
            }.getItemStack(3).func_77973_b() == new ItemStack(ItemJiuFang07.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.14
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
            }.getItemStack(0).func_77973_b() == new ItemStack(ItemChiSongZi.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.15
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
            }.getAmount(0) >= 3 && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.16
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
            }.getItemStack(1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:bi_hai_ling_yuan") && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.17
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
                            ((Slot) ((Map) invobj5).get(0)).func_75209_a(3);
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
                            ItemStack _setstack2 = new ItemStack(ItemYuanJiang07.block, 1);
                            _setstack2.func_190920_e(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang5.18
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
