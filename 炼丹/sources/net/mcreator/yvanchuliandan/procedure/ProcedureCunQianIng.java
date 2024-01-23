package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui11;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureCunQianIng.class */
public class ProcedureCunQianIng extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureCunQianIng(ElementsYvanchuliandanMod instance) {
        super(instance, 767);
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$22] */
    /* JADX WARN: Type inference failed for: r0v116, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$19] */
    /* JADX WARN: Type inference failed for: r0v128, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$16] */
    /* JADX WARN: Type inference failed for: r0v157, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$13] */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$1] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$3] */
    /* JADX WARN: Type inference failed for: r0v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$5] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$7] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$9] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$11] */
    /* JADX WARN: Type inference failed for: r0v72, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$12] */
    /* JADX WARN: Type inference failed for: r0v78, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$15] */
    /* JADX WARN: Type inference failed for: r0v84, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$18] */
    /* JADX WARN: Type inference failed for: r0v90, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$21] */
    /* JADX WARN: Type inference failed for: r3v77, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$10] */
    /* JADX WARN: Type inference failed for: r3v82, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$8] */
    /* JADX WARN: Type inference failed for: r3v87, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$6] */
    /* JADX WARN: Type inference failed for: r3v92, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$4] */
    /* JADX WARN: Type inference failed for: r3v97, types: [net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (((entityPlayer instanceof EntityPlayer) && (entityPlayer.field_71070_bA instanceof GuiFangShiGui.GuiContainerMod)) || ((entityPlayer instanceof EntityPlayer) && (entityPlayer.field_71070_bA instanceof GuiFangShiGui11.GuiContainerMod))) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.1
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
            }.getItemStack(0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03")) {
                entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.2
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
                }.getAmount(0));
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier = ((EntityPlayerMP) entityPlayer).field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            ((Slot) ((Map) invobj).get(0)).func_75215_d(ItemStack.field_190927_a);
                            supplier.func_75142_b();
                        }
                    }
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.3
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayer instanceof EntityPlayerMP) {
                        Supplier supplier2 = entityPlayer.field_71070_bA;
                        if (supplier2 instanceof Supplier) {
                            Object invobj2 = supplier2.get();
                            if (invobj2 instanceof Map) {
                                return ((Slot) ((Map) invobj2).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05")) {
                entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.4
                    public int getAmount(int sltid) {
                        ItemStack stack;
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier2 = entityPlayer.field_71070_bA;
                            if (supplier2 instanceof Supplier) {
                                Object invobj2 = supplier2.get();
                                if ((invobj2 instanceof Map) && (stack = ((Slot) ((Map) invobj2).get(Integer.valueOf(sltid))).func_75211_c()) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                            return 0;
                        }
                        return 0;
                    }
                }.getAmount(0) * 100));
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier2 = ((EntityPlayerMP) entityPlayer).field_71070_bA;
                    if (supplier2 instanceof Supplier) {
                        Object invobj2 = supplier2.get();
                        if (invobj2 instanceof Map) {
                            ((Slot) ((Map) invobj2).get(0)).func_75215_d(ItemStack.field_190927_a);
                            supplier2.func_75142_b();
                        }
                    }
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.5
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayer instanceof EntityPlayerMP) {
                        Supplier supplier3 = entityPlayer.field_71070_bA;
                        if (supplier3 instanceof Supplier) {
                            Object invobj3 = supplier3.get();
                            if (invobj3 instanceof Map) {
                                return ((Slot) ((Map) invobj3).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_1")) {
                entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.6
                    public int getAmount(int sltid) {
                        ItemStack stack;
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier3 = entityPlayer.field_71070_bA;
                            if (supplier3 instanceof Supplier) {
                                Object invobj3 = supplier3.get();
                                if ((invobj3 instanceof Map) && (stack = ((Slot) ((Map) invobj3).get(Integer.valueOf(sltid))).func_75211_c()) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                            return 0;
                        }
                        return 0;
                    }
                }.getAmount(0) * 9));
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier3 = ((EntityPlayerMP) entityPlayer).field_71070_bA;
                    if (supplier3 instanceof Supplier) {
                        Object invobj3 = supplier3.get();
                        if (invobj3 instanceof Map) {
                            ((Slot) ((Map) invobj3).get(0)).func_75215_d(ItemStack.field_190927_a);
                            supplier3.func_75142_b();
                        }
                    }
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.7
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayer instanceof EntityPlayerMP) {
                        Supplier supplier4 = entityPlayer.field_71070_bA;
                        if (supplier4 instanceof Supplier) {
                            Object invobj4 = supplier4.get();
                            if (invobj4 instanceof Map) {
                                return ((Slot) ((Map) invobj4).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_2")) {
                entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.8
                    public int getAmount(int sltid) {
                        ItemStack stack;
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier4 = entityPlayer.field_71070_bA;
                            if (supplier4 instanceof Supplier) {
                                Object invobj4 = supplier4.get();
                                if ((invobj4 instanceof Map) && (stack = ((Slot) ((Map) invobj4).get(Integer.valueOf(sltid))).func_75211_c()) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                            return 0;
                        }
                        return 0;
                    }
                }.getAmount(0) * 900));
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier4 = ((EntityPlayerMP) entityPlayer).field_71070_bA;
                    if (supplier4 instanceof Supplier) {
                        Object invobj4 = supplier4.get();
                        if (invobj4 instanceof Map) {
                            ((Slot) ((Map) invobj4).get(0)).func_75215_d(ItemStack.field_190927_a);
                            supplier4.func_75142_b();
                        }
                    }
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.9
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayer instanceof EntityPlayerMP) {
                        Supplier supplier5 = entityPlayer.field_71070_bA;
                        if (supplier5 instanceof Supplier) {
                            Object invobj5 = supplier5.get();
                            if (invobj5 instanceof Map) {
                                return ((Slot) ((Map) invobj5).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(0).func_77973_b().getRegistryName().toString().equals(" yvanchuyaoshou:blood_jade_limb_st")) {
                entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.10
                    public int getAmount(int sltid) {
                        ItemStack stack;
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier5 = entityPlayer.field_71070_bA;
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
                }.getAmount(0) * 30));
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier5 = ((EntityPlayerMP) entityPlayer).field_71070_bA;
                    if (supplier5 instanceof Supplier) {
                        Object invobj5 = supplier5.get();
                        if (invobj5 instanceof Map) {
                            ((Slot) ((Map) invobj5).get(0)).func_75215_d(ItemStack.field_190927_a);
                            supplier5.func_75142_b();
                        }
                    }
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.11
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayer instanceof EntityPlayerMP) {
                        Supplier supplier6 = entityPlayer.field_71070_bA;
                        if (supplier6 instanceof Supplier) {
                            Object invobj6 = supplier6.get();
                            if (invobj6 instanceof Map) {
                                return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:san_xian_voucher")) {
                if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.12
                    public ItemStack getItemStack(int sltid) {
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier6 = entityPlayer.field_71070_bA;
                            if (supplier6 instanceof Supplier) {
                                Object invobj6 = supplier6.get();
                                if (invobj6 instanceof Map) {
                                    return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                }
                            }
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(0).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.13
                    public ItemStack getItemStack(int sltid) {
                        if (entityPlayer instanceof EntityPlayerMP) {
                            Supplier supplier6 = entityPlayer.field_71070_bA;
                            if (supplier6 instanceof Supplier) {
                                Object invobj6 = supplier6.get();
                                if (invobj6 instanceof Map) {
                                    return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                }
                            }
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(0).func_77978_p().func_74769_h("级别") : -1.0d) != 2.0d) {
                    if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.15
                        public ItemStack getItemStack(int sltid) {
                            if (entityPlayer instanceof EntityPlayerMP) {
                                Supplier supplier6 = entityPlayer.field_71070_bA;
                                if (supplier6 instanceof Supplier) {
                                    Object invobj6 = supplier6.get();
                                    if (invobj6 instanceof Map) {
                                        return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(0).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.16
                        public ItemStack getItemStack(int sltid) {
                            if (entityPlayer instanceof EntityPlayerMP) {
                                Supplier supplier6 = entityPlayer.field_71070_bA;
                                if (supplier6 instanceof Supplier) {
                                    Object invobj6 = supplier6.get();
                                    if (invobj6 instanceof Map) {
                                        return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(0).func_77978_p().func_74769_h("级别") : -1.0d) != 3.0d) {
                        if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.18
                            public ItemStack getItemStack(int sltid) {
                                if (entityPlayer instanceof EntityPlayerMP) {
                                    Supplier supplier6 = entityPlayer.field_71070_bA;
                                    if (supplier6 instanceof Supplier) {
                                        Object invobj6 = supplier6.get();
                                        if (invobj6 instanceof Map) {
                                            return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                        }
                                    }
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(0).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.19
                            public ItemStack getItemStack(int sltid) {
                                if (entityPlayer instanceof EntityPlayerMP) {
                                    Supplier supplier6 = entityPlayer.field_71070_bA;
                                    if (supplier6 instanceof Supplier) {
                                        Object invobj6 = supplier6.get();
                                        if (invobj6 instanceof Map) {
                                            return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                        }
                                    }
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(0).func_77978_p().func_74769_h("级别") : -1.0d) == 4.0d) {
                            if (!world.field_72995_K && world.func_73046_m() != null) {
                                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.20
                                    public String func_70005_c_() {
                                        return "";
                                    }

                                    public boolean func_70003_b(int permission, String command) {
                                        return true;
                                    }

                                    public World func_130014_f_() {
                                        return world;
                                    }

                                    public MinecraftServer func_184102_h() {
                                        return world.func_73046_m();
                                    }

                                    public boolean func_174792_t_() {
                                        return false;
                                    }

                                    public BlockPos func_180425_c() {
                                        return new BlockPos(x, y, z);
                                    }

                                    public Vec3d func_174791_d() {
                                        return new Vec3d(x, y, z);
                                    }
                                }, "give " + entityPlayer.func_189512_bd() + " yvanchuliandan:dan_yao_sect_2 1 0 {\"级别\":4.0d,\"数值\":12.0d,\"数值类型\":\"Attack\",display:{Name:\"§d§l上脉丸\"}}");
                            }
                        } else {
                            if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.21
                                public ItemStack getItemStack(int sltid) {
                                    if (entityPlayer instanceof EntityPlayerMP) {
                                        Supplier supplier6 = entityPlayer.field_71070_bA;
                                        if (supplier6 instanceof Supplier) {
                                            Object invobj6 = supplier6.get();
                                            if (invobj6 instanceof Map) {
                                                return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                            }
                                        }
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(0).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.22
                                public ItemStack getItemStack(int sltid) {
                                    if (entityPlayer instanceof EntityPlayerMP) {
                                        Supplier supplier6 = entityPlayer.field_71070_bA;
                                        if (supplier6 instanceof Supplier) {
                                            Object invobj6 = supplier6.get();
                                            if (invobj6 instanceof Map) {
                                                return ((Slot) ((Map) invobj6).get(Integer.valueOf(sltid))).func_75211_c();
                                            }
                                        }
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(0).func_77978_p().func_74769_h("级别") : -1.0d) == 5.0d && !world.field_72995_K && world.func_73046_m() != null) {
                                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.23
                                    public String func_70005_c_() {
                                        return "";
                                    }

                                    public boolean func_70003_b(int permission, String command) {
                                        return true;
                                    }

                                    public World func_130014_f_() {
                                        return world;
                                    }

                                    public MinecraftServer func_184102_h() {
                                        return world.func_73046_m();
                                    }

                                    public boolean func_174792_t_() {
                                        return false;
                                    }

                                    public BlockPos func_180425_c() {
                                        return new BlockPos(x, y, z);
                                    }

                                    public Vec3d func_174791_d() {
                                        return new Vec3d(x, y, z);
                                    }
                                }, "give " + entityPlayer.func_189512_bd() + " yvanchuliandan:dan_yao_sect_2 1 0 {\"级别\":5.0d,\"数值\":36.0d,\"数值类型\":\"Attack\",display:{Name:\"§6§l活魄丹\"}}");
                            }
                        }
                    } else if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.17
                            public String func_70005_c_() {
                                return "";
                            }

                            public boolean func_70003_b(int permission, String command) {
                                return true;
                            }

                            public World func_130014_f_() {
                                return world;
                            }

                            public MinecraftServer func_184102_h() {
                                return world.func_73046_m();
                            }

                            public boolean func_174792_t_() {
                                return false;
                            }

                            public BlockPos func_180425_c() {
                                return new BlockPos(x, y, z);
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x, y, z);
                            }
                        }, "give " + entityPlayer.func_189512_bd() + " yvanchuliandan:dan_yao_sect_2 1 0 {\"级别\":3.0d,\"数值\":4.0d,\"数值类型\":\"Attack\",display:{Name:\"§6§l紫阳丹\"}}");
                    }
                } else if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCunQianIng.14
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "give " + entityPlayer.func_189512_bd() + " yvanchuliandan:dan_yao_sect_2 1 0 {\"级别\":2.0d,\"数值\":2.0d,\"数值类型\":\"Attack\",display:{Name:\"§d§l百年凝聚丹\"}}");
                }
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier6 = ((EntityPlayerMP) entityPlayer).field_71070_bA;
                    if (supplier6 instanceof Supplier) {
                        Object invobj6 = supplier6.get();
                        if (invobj6 instanceof Map) {
                            ((Slot) ((Map) invobj6).get(0)).func_75215_d(ItemStack.field_190927_a);
                            supplier6.func_75142_b();
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
