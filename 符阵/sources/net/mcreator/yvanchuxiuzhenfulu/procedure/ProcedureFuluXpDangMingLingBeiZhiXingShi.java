package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFuluXpDangMingLingBeiZhiXingShi.class */
public class ProcedureFuluXpDangMingLingBeiZhiXingShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFuluXpDangMingLingBeiZhiXingShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 453);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$1] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$40] */
    /* JADX WARN: Type inference failed for: r0v123, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$2] */
    /* JADX WARN: Type inference failed for: r0v126, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$9] */
    /* JADX WARN: Type inference failed for: r0v129, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$16] */
    /* JADX WARN: Type inference failed for: r0v132, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$23] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$30] */
    /* JADX WARN: Type inference failed for: r0v147, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$33] */
    /* JADX WARN: Type inference failed for: r0v163, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$26] */
    /* JADX WARN: Type inference failed for: r0v179, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$19] */
    /* JADX WARN: Type inference failed for: r0v195, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$12] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$37] */
    /* JADX WARN: Type inference failed for: r0v224, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$5] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$44] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$51] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$58] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$65] */
    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$68] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$61] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$54] */
    /* JADX WARN: Type inference failed for: r0v93, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$47] */
    /* JADX WARN: Type inference failed for: r3v101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$35] */
    /* JADX WARN: Type inference failed for: r3v106, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$24] */
    /* JADX WARN: Type inference failed for: r3v118, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$28] */
    /* JADX WARN: Type inference failed for: r3v123, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$17] */
    /* JADX WARN: Type inference failed for: r3v135, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$21] */
    /* JADX WARN: Type inference failed for: r3v140, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$10] */
    /* JADX WARN: Type inference failed for: r3v15, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$70] */
    /* JADX WARN: Type inference failed for: r3v152, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$14] */
    /* JADX WARN: Type inference failed for: r3v157, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$3] */
    /* JADX WARN: Type inference failed for: r3v169, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$7] */
    /* JADX WARN: Type inference failed for: r3v20, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$59] */
    /* JADX WARN: Type inference failed for: r3v3, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$66] */
    /* JADX WARN: Type inference failed for: r3v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$63] */
    /* JADX WARN: Type inference failed for: r3v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$52] */
    /* JADX WARN: Type inference failed for: r3v49, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$56] */
    /* JADX WARN: Type inference failed for: r3v54, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$45] */
    /* JADX WARN: Type inference failed for: r3v66, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$49] */
    /* JADX WARN: Type inference failed for: r3v71, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$38] */
    /* JADX WARN: Type inference failed for: r3v83, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$42] */
    /* JADX WARN: Type inference failed for: r3v89, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$31] */
    /* JADX WARN: Type inference failed for: r4v1, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$67] */
    /* JADX WARN: Type inference failed for: r4v10, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$64] */
    /* JADX WARN: Type inference failed for: r4v13, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$53] */
    /* JADX WARN: Type inference failed for: r4v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$57] */
    /* JADX WARN: Type inference failed for: r4v19, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$46] */
    /* JADX WARN: Type inference failed for: r4v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$50] */
    /* JADX WARN: Type inference failed for: r4v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$39] */
    /* JADX WARN: Type inference failed for: r4v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$43] */
    /* JADX WARN: Type inference failed for: r4v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$32] */
    /* JADX WARN: Type inference failed for: r4v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$36] */
    /* JADX WARN: Type inference failed for: r4v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$25] */
    /* JADX WARN: Type inference failed for: r4v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$71] */
    /* JADX WARN: Type inference failed for: r4v40, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$29] */
    /* JADX WARN: Type inference failed for: r4v43, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$18] */
    /* JADX WARN: Type inference failed for: r4v46, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$22] */
    /* JADX WARN: Type inference failed for: r4v49, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$11] */
    /* JADX WARN: Type inference failed for: r4v52, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$15] */
    /* JADX WARN: Type inference failed for: r4v55, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$4] */
    /* JADX WARN: Type inference failed for: r4v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$8] */
    /* JADX WARN: Type inference failed for: r4v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi$60] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("经验开关") >= 1) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.2
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("fulu")) {
                entityPlayer.getEntityData().func_74780_a("FuLuXp", entityPlayer.getEntityData().func_74769_h("FuLuXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.3
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.4
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.5
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.6
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"符箓制作成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.7
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.8
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点符箓经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.9
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("liandan")) {
                entityPlayer.getEntityData().func_74780_a("LianDanXp", entityPlayer.getEntityData().func_74769_h("LianDanXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.10
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.11
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.12
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.13
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"丹药炼制成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.14
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.15
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点炼丹经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.16
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("lianqi")) {
                entityPlayer.getEntityData().func_74780_a("LianQiXp", entityPlayer.getEntityData().func_74769_h("LianQiXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.17
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.18
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.19
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.20
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"法宝炼制成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.21
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.22
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点炼器经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.23
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("zhenfa")) {
                entityPlayer.getEntityData().func_74780_a("ZhenFaXp", entityPlayer.getEntityData().func_74769_h("ZhenFaXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.24
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.25
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.26
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.27
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"阵法制作成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.28
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.29
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点阵法经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.30
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("niangjiu")) {
                entityPlayer.getEntityData().func_74780_a("NiangJiuXp", entityPlayer.getEntityData().func_74769_h("NiangJiuXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.31
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.32
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.33
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.34
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"酿酒完成获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.35
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.36
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点酿酒经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("未知命令!"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("经验开关");
                if (_so == null) {
                    _so = _sc.func_96535_a("经验开关", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(0);
            }
        } else if (entityPlayer.func_70003_b(4, "")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.37
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("fulu")) {
                entityPlayer.getEntityData().func_74780_a("FuLuXp", entityPlayer.getEntityData().func_74769_h("FuLuXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.38
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.39
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.40
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.41
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"符箓制作成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.42
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.43
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点符箓经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.44
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("liandan")) {
                entityPlayer.getEntityData().func_74780_a("LianDanXp", entityPlayer.getEntityData().func_74769_h("LianDanXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.45
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.46
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.47
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.48
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"丹药炼制成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.49
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.50
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点炼丹经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.51
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("lianqi")) {
                entityPlayer.getEntityData().func_74780_a("LianQiXp", entityPlayer.getEntityData().func_74769_h("LianQiXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.52
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.53
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.54
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.55
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"法宝炼制成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.56
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.57
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点炼器经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.58
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("zhenfa")) {
                entityPlayer.getEntityData().func_74780_a("ZhenFaXp", entityPlayer.getEntityData().func_74769_h("ZhenFaXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.59
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.60
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.61
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.62
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"阵法制作成功获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.63
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.64
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点阵法经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.65
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("niangjiu")) {
                entityPlayer.getEntityData().func_74780_a("NiangJiuXp", entityPlayer.getEntityData().func_74769_h("NiangJiuXp") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.66
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.67
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.68
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("yuanchumr") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.69
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"酿酒完成获得" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.70
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuluXpDangMingLingBeiZhiXingShi.71
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + "点酿酒经验\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("未知命令!"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("你无权使用该命令"), false);
        }
    }
}
