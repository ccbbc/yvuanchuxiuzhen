package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
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

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureJingjiecmddo.class */
public class ProcedureJingjiecmddo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJingjiecmddo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 318);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$2] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$4] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$5] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$7] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$3] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$6] */
    /* JADX WARN: Type inference failed for: r1v16, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$8] */
    /* JADX WARN: Type inference failed for: r3v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$11] */
    /* JADX WARN: Type inference failed for: r3v6, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo$10] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (entityPlayer.func_70003_b(4, "")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.1
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("help")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("指令使用格式: /jingjie [玩家id/选择器] [大境界数]"), false);
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("1为炼气2为筑基以此类推直至道祖为11"), false);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.2
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("") && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.3
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("指令使用格式: /jingjie [玩家id/选择器] [大境界数]"), false);
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("0为凡人 1为炼气以此类推直至道祖为11"), false);
                }
            } else if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.4
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("")) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.5
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.6
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()) > 0 && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.7
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.8
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()) <= 11) {
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc = entityPlayer.func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("JingJieUpdate");
                        if (_so == null) {
                            _so = _sc.func_96535_a("JingJieUpdate", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        _scr.func_96647_c(0);
                    }
                    if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.9
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
                        }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.10
                            public String getText() {
                                String param = (String) cmdparams.get("0");
                                if (param != null) {
                                    return param;
                                }
                                return "";
                            }
                        }.getText() + " JingJieUpdate " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingjiecmddo.11
                            public String getText() {
                                String param = (String) cmdparams.get("1");
                                if (param != null) {
                                    return param;
                                }
                                return "";
                            }
                        }.getText());
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("未知境界，请输入数字1-11"), false);
                }
            }
        }
    }
}
