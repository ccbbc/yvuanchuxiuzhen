package net.mcreator.yuanchuzhushou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
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

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureSiWangDangMingLingBeiZhiXingShi.class */
public class ProcedureSiWangDangMingLingBeiZhiXingShi extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureSiWangDangMingLingBeiZhiXingShi(ElementsYuanchuzhushouMod instance) {
        super(instance, 27);
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi$2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi$1] */
    /* JADX WARN: Type inference failed for: r3v10, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi$8] */
    /* JADX WARN: Type inference failed for: r3v25, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (!entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            if (entityLivingBase instanceof EntityPlayer) {
                if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.2
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("siwangconfirm") > 0) {
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70606_j(0.0f);
                    }
                    if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.3
                            public String func_70005_c_() {
                                return "";
                            }

                            public boolean func_70003_b(int permission, String command) {
                                return true;
                            }

                            public World func_130014_f_() {
                                return entityLivingBase.field_70170_p;
                            }

                            public MinecraftServer func_184102_h() {
                                return entityLivingBase.field_70170_p.func_73046_m();
                            }

                            public boolean func_174792_t_() {
                                return false;
                            }

                            public BlockPos func_180425_c() {
                                return entityLivingBase.func_180425_c();
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                            }

                            public Entity func_174793_f() {
                                return entityLivingBase;
                            }
                        }, "/gamerule showDeathMessages false");
                    }
                    if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.4
                            public String func_70005_c_() {
                                return "";
                            }

                            public boolean func_70003_b(int permission, String command) {
                                return true;
                            }

                            public World func_130014_f_() {
                                return entityLivingBase.field_70170_p;
                            }

                            public MinecraftServer func_184102_h() {
                                return entityLivingBase.field_70170_p.func_73046_m();
                            }

                            public boolean func_174792_t_() {
                                return false;
                            }

                            public BlockPos func_180425_c() {
                                return entityLivingBase.func_180425_c();
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                            }

                            public Entity func_174793_f() {
                                return entityLivingBase;
                            }
                        }, "tellraw @a [{\"text\":\"" + entityLivingBase.func_145748_c_().func_150260_c() + "被" + new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.5
                            public String getText() {
                                String param = (String) cmdparams.get("0");
                                if (param != null) {
                                    return param;
                                }
                                return "";
                            }
                        }.getText() + "执行处决!\",\"color\":\"red\",\"bold\":true,\"italic\":true,\"underlined\":true,\"strikethrough\":false,\"obfuscated\":false}]");
                    }
                    if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.6
                            public String func_70005_c_() {
                                return "";
                            }

                            public boolean func_70003_b(int permission, String command) {
                                return true;
                            }

                            public World func_130014_f_() {
                                return entityLivingBase.field_70170_p;
                            }

                            public MinecraftServer func_184102_h() {
                                return entityLivingBase.field_70170_p.func_73046_m();
                            }

                            public boolean func_174792_t_() {
                                return false;
                            }

                            public BlockPos func_180425_c() {
                                return entityLivingBase.func_180425_c();
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                            }

                            public Entity func_174793_f() {
                                return entityLivingBase;
                            }
                        }, "/gamerule showDeathMessages true");
                    }
                    if (entityLivingBase instanceof EntityPlayer) {
                        Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("siwangconfirm");
                        if (_so == null) {
                            _so = _sc.func_96535_a("siwangconfirm", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                        _scr.func_96647_c(0);
                    }
                } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§4管理员已禁止主动使用该命令！"), false);
                }
            } else if (!(entityLivingBase instanceof EntityItem)) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70606_j(0.0f);
                }
                if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.7
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityLivingBase.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityLivingBase.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityLivingBase.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityLivingBase;
                        }
                    }, "tellraw @a [{\"text\":\"" + entityLivingBase.func_145748_c_().func_150260_c() + "被" + new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangDangMingLingBeiZhiXingShi.8
                        public String getText() {
                            String param = (String) cmdparams.get("0");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText() + "执行处决!\",\"color\":\"red\",\"bold\":true,\"italic\":true,\"underlined\":true,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            }
        }
    }
}
