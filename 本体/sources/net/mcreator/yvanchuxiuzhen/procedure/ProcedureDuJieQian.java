package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureDuJieQian.class */
public class ProcedureDuJieQian extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDuJieQian(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 315);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else {
                $_dependencies.put("entity", entityPlayer);
                ProcedureBreach.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else {
                $_dependencies.put("entity", entityPlayer);
                ProcedureBreach.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else {
                $_dependencies.put("entity", entityPlayer);
                ProcedureBreach.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 115.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 35.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 160.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 35.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else {
                $_dependencies.put("entity", entityPlayer);
                ProcedureBreach.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 255.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 35.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 350.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 35.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 500.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 35.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else {
                $_dependencies.put("entity", entityPlayer);
                ProcedureBreach.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 6.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 750.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 35.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 1500.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 35.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 2000.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 0.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 7.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 3000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 4000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 5000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 8.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 6000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 7000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 8000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 9.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 437500.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 875000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 1750000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 10.0d) {
            entityPlayer.getEntityData().func_74780_a("扣除真元", entityPlayer.getEntityData().func_74769_h("BaseMax") / 5.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 1515000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 3030000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 6060000.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74757_a("进行概率突破", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("灵根数量") < 5.0d) {
            entityPlayer.getEntityData().func_74757_a("突破限制", false);
            entityPlayer.getEntityData().func_74780_a("境界突破概率", 0.0d);
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") - 1.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("因法则限制，需五行灵根齐全，方可突破炼虚"), false);
            }
        } else if (entityPlayer.getEntityData().func_74767_n("进行概率突破")) {
            if (Math.random() <= entityPlayer.getEntityData().func_74769_h("TuPoGaiLv") + entityPlayer.getEntityData().func_74769_h("境界突破附加概率") + entityPlayer.getEntityData().func_74769_h("功法概率增加")) {
                if (entityPlayer.getEntityData().func_74769_h("LeiJieAttack") > 0.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("逆天而行，天雷摧之！"), false);
                    }
                    entityPlayer.getEntityData().func_74757_a("LeiJie", true);
                } else {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureJingJieName.executeProcedure($_dependencies);
                    entityPlayer.getEntityData().func_74780_a("境界突破附加概率", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureTuPoShiBaiGaiLvAdd.executeProcedure($_dependencies);
                }
            } else {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") - entityPlayer.getEntityData().func_74769_h("扣除真元"));
                entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") - entityPlayer.getEntityData().func_74769_h("JingJieNum"));
                entityPlayer.getEntityData().func_74780_a("扣除真元", 0.0d);
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureDuJieQian.1
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
                    }, "title @s title {\"text\":\"§c§l突破失败\"}");
                }
                entityPlayer.getEntityData().func_74757_a("突破限制", false);
                entityPlayer.getEntityData().func_74780_a("境界突破附加概率", 0.0d);
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureTuPoShiBaiGaiLvAdd.executeProcedure($_dependencies);
            }
        } else {
            $_dependencies.put("entity", entityPlayer);
            ProcedureJingJieName.executeProcedure($_dependencies);
            entityPlayer.getEntityData().func_74757_a("突破限制", false);
        }
        entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
    }
}
