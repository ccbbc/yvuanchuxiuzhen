package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
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

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaZhuDong1.class */
public class ProcedureGongFaZhuDong1 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaZhuDong1(ElementsYvanchujiguanMod instance) {
        super(instance, 124);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("GongFaZhuDong1") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("功法主动1冷却3分") == 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 480.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaZhuDong1.1
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
                        }, "tp " + entityPlayer.func_145748_c_().func_150260_c() + " " + entityPlayer.getEntityData().func_74779_i("DaoLv"));
                    }
                    if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaZhuDong1.2
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
                        }, "execute @p ~ ~ ~ tp " + entityPlayer.func_145748_c_().func_150260_c() + " " + entityPlayer.getEntityData().func_74779_i("DaoLv"));
                    }
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("已传送至道侣身边。"), false);
                    }
                    entityPlayer.getEntityData().func_74780_a("GongFaZhuDong1", 1.0d);
                    entityPlayer.getEntityData().func_74780_a("功法主动1冷却3分", 3600.0d);
                    if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaZhuDong1.3
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
                        }, "execute @e[name=" + entityPlayer.getEntityData().func_74779_i("DaoLv") + "] ~ ~ ~ wifigongfa gongfa1lengque");
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("你的灵力不足"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("技能冷却中 " + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("功法主动1冷却3分") / 20.0d) + "秒"), false);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("GongFaZhuDong2") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("Power") >= 360.0d && entityPlayer.getEntityData().func_74769_h("Base") >= 36.0d) {
                if (entityPlayer.getEntityData().func_74769_h("功法主动2冷却一分") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 360.0d);
                    entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") - 36.0d);
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc = entityPlayer.func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("法攻暂计");
                        if (_so == null) {
                            _so = _sc.func_96535_a("法攻暂计", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        _scr.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("MagicAttack") * (-0.5d)));
                    }
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") * 0.5d);
                    entityPlayer.getEntityData().func_74780_a("功法主动2冷却一分", 1200.0d);
                    entityPlayer.getEntityData().func_74780_a("功法主动2持续12s", 240.0d);
                    if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaZhuDong1.4
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
                        }, "execute @e[name=" + entityPlayer.getEntityData().func_74779_i("DaoLv") + "] ~ ~ ~ wifigongfa gongfazhudong2");
                    }
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("已开启双剑合璧技能，持续12s。"), false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("技能冷却中 " + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("功法主动2冷却一分") / 20.0d) + "秒"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("你的灵力或真元不足够催发。"), false);
            }
        }
    }
}
