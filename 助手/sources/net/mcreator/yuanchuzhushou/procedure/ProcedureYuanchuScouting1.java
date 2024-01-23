package net.mcreator.yuanchuzhushou.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureYuanchuScouting1.class */
public class ProcedureYuanchuScouting1 extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureYuanchuScouting1(ElementsYuanchuzhushouMod instance) {
        super(instance, 58);
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$1] */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$4] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$7] */
    /* JADX WARN: Type inference failed for: r2v11, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$13] */
    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$8] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$9] */
    /* JADX WARN: Type inference failed for: r2v8, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$11] */
    /* JADX WARN: Type inference failed for: r3v13, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$10] */
    /* JADX WARN: Type inference failed for: r3v5, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$12] */
    /* JADX WARN: Type inference failed for: r3v50, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$3] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1$14] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("admin")) {
            if (entityPlayer.func_70003_b(4, "")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.2
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @a[name=" + new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.3
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText() + "] ~ ~ ~ yuanchuscouting read " + entityPlayer.func_145748_c_().func_150260_c() + "\",CustomNameVisible:0b}");
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("我都加了admin的前缀了你怎么还觉得你没权限可以用~"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.4
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("read") && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.5
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
            }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @a[name=" + new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.6
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + "] ~ ~ ~ yuanchuscouting return " + entityPlayer.func_145748_c_().func_150260_c() + " " + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("HealthMax")) + " " + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("BaseMax")) + " " + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("PowerMax")) + " \",CustomNameVisible:0b}");
        }
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.7
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("return")) {
            entityPlayer.getEntityData().func_74778_a("ChaTanID", new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.8
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText());
            entityPlayer.getEntityData().func_74780_a("HealthMax1", new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.9
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.10
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()));
            entityPlayer.getEntityData().func_74780_a("BaseMax1", new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.11
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.12
                public String getText() {
                    String param = (String) cmdparams.get("3");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()));
            entityPlayer.getEntityData().func_74780_a("PowerMax1", new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.13
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureYuanchuScouting1.14
                public String getText() {
                    String param = (String) cmdparams.get("4");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()));
        }
    }
}
