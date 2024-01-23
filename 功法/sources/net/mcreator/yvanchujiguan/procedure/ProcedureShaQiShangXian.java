package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureShaQiShangXian.class */
public class ProcedureShaQiShangXian extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShaQiShangXian(ElementsYvanchujiguanMod instance) {
        super(instance, 261);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 200.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 200.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.1
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 300.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 300.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.2
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 500.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 500.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.3
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 1000.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 1000.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.4
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 2000.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 2000.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") == 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.5
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 300.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 300.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.6
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 450.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 450.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.7
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 700.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 700.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.8
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 1600.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 1600.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.9
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") < 2800.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 2800.0d && entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", entityPlayer.getEntityData().func_74769_h("SiWangJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") == 60.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("煞气反噬！若无法降低煞气，恐怕时日仅剩这最后的五分钟了。"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("SiWangJiShi") >= 6000.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiShangXian.10
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
                    }, "kill " + entityPlayer.func_145748_c_().func_150260_c());
                }
                entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
            }
        }
        if (entityPlayer.getEntityData().func_74767_n("YuanShenUp") || entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
            entityPlayer.getEntityData().func_74780_a("SiWangJiShi", 0.0d);
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

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
