package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureXiuLianIng.class */
public class ProcedureXiuLianIng extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureXiuLianIng(ElementsLianqisanqiannianMod instance) {
        super(instance, 20);
    }

    /* JADX WARN: Type inference failed for: r0v137, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureXiuLianIng$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        entityPlayer.getEntityData().func_74780_a("XiuLian", 0.0d);
        entityPlayer.getEntityData().func_74780_a("修炼计时", 0.0d);
        entityPlayer.getEntityData().func_74780_a("修炼计时2", entityPlayer.getEntityData().func_74769_h("修炼计时2") + 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("修炼计时2") >= 60.0d) {
            entityPlayer.getEntityData().func_74780_a("修炼计时2", 0.0d);
            if (entityPlayer.getEntityData().func_74769_h("LingYuZhi") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
                    if (entityPlayer.getEntityData().func_74769_h("BaseMax") > 0.0d && entityPlayer.getEntityData().func_74769_h("Base") < entityPlayer.getEntityData().func_74769_h("BaseMax")) {
                        if (entityPlayer.getEntityData().func_74769_h("MeditationTime") > 0.0d) {
                            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 10.0d);
                        } else {
                            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 1.0d);
                        }
                        if (entityPlayer.getEntityData().func_74769_h("Base") >= entityPlayer.getEntityData().func_74769_h("BaseMax") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("真元已满，吐纳不再增加真元。"), false);
                        }
                    }
                    if (entityPlayer.getEntityData().func_74769_h("PowerMax") > 0.0d && entityPlayer.getEntityData().func_74769_h("Power") < entityPlayer.getEntityData().func_74769_h("PowerMax")) {
                        if (entityPlayer.getEntityData().func_74769_h("MeditationTime") > 0.0d) {
                            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") + (entityPlayer.getEntityData().func_74769_h("PowerMax") * 0.1d));
                        } else {
                            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") + (entityPlayer.getEntityData().func_74769_h("PowerMax") * 0.01d));
                        }
                        if (entityPlayer.getEntityData().func_74769_h("Power") >= entityPlayer.getEntityData().func_74769_h("PowerMax") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("灵力已恢复，吐纳不再增加灵力。"), false);
                        }
                    }
                }
                if (entityPlayer.func_70089_S()) {
                    if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) < (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f)) {
                        if (entityPlayer.getEntityData().func_74769_h("MeditationTime") > 0.0d) {
                            if (entityPlayer instanceof EntityLivingBase) {
                                ((EntityLivingBase) entityPlayer).func_70691_i((float) ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f) * 0.1d));
                            }
                        } else if (entityPlayer instanceof EntityLivingBase) {
                            ((EntityLivingBase) entityPlayer).func_70691_i((float) ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f) * 0.01d));
                        }
                    }
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureXiuLianIng.1
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LayerNumTemp") != entityPlayer.getEntityData().func_74769_h("LayerNum")) {
                    Map<String, Object> $_dependencies = new HashMap<>();
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureGongFaAdd.executeProcedure($_dependencies);
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc = entityPlayer.func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("LayerNumTemp");
                        if (_so == null) {
                            _so = _sc.func_96535_a("LayerNumTemp", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        _scr.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LayerNum"));
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("入门计时", entityPlayer.getEntityData().func_74769_h("入门计时") + 1.0d);
                    if (entityPlayer.getEntityData().func_74769_h("入门计时") == 3.0d) {
                        entityPlayer.getEntityData().func_74757_a("突破", true);
                        entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 10.0d);
                        entityPlayer.getEntityData().func_74780_a("GongFa3000", entityPlayer.getEntityData().func_74769_h("GongFa3000") + 1.0d);
                        if (entityPlayer instanceof EntityPlayer) {
                            Scoreboard _sc2 = entityPlayer.func_96123_co();
                            ScoreObjective _so2 = _sc2.func_96518_b("LayerNumTemp");
                            if (_so2 == null) {
                                _so2 = _sc2.func_96535_a("LayerNumTemp", ScoreCriteria.field_96641_b);
                            }
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            _scr2.func_96647_c(1);
                        }
                    }
                }
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("entity", entityPlayer);
                ProcedureXiuLianTiShi.executeProcedure($_dependencies2);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString(entityPlayer.getEntityData().func_74779_i("修炼提示")), true);
                }
                entityPlayer.getEntityData().func_74778_a("功法层数显示", "");
                entityPlayer.getEntityData().func_74778_a("修炼提示", "");
                entityPlayer.getEntityData().func_74780_a("法攻增加数", 0.0d);
                entityPlayer.getEntityData().func_74780_a("寿元增加数", 0.0d);
                entityPlayer.getEntityData().func_74780_a("BuffAdd", 0.0d);
                entityPlayer.getEntityData().func_74780_a("真元增加数", 0.0d);
                entityPlayer.getEntityData().func_74780_a("血量增加数", 0.0d);
                entityPlayer.getEntityData().func_74780_a("法防增加数", 0.0d);
                entityPlayer.getEntityData().func_74780_a("物防增加数", 0.0d);
                entityPlayer.getEntityData().func_74780_a("灵气最大值增加数", 0.0d);
                entityPlayer.getEntityData().func_74780_a("灵气恢复速度增加数", 0.0d);
                if (entityPlayer.getEntityData().func_74769_h("MeditationTime") > 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("LingYuZhi", entityPlayer.getEntityData().func_74769_h("LingYuZhi") - 10.0d);
                } else {
                    entityPlayer.getEntityData().func_74780_a("LingYuZhi", entityPlayer.getEntityData().func_74769_h("LingYuZhi") - 1.0d);
                }
                if (entityPlayer.getEntityData().func_74769_h("LingYuZhi") <= 0.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("附近天地灵气已匮乏，已无法继续吐纳与修炼功法。需要等待天地灵气(灵裕值)的恢复才可继续修炼。"), true);
                }
            }
        }
    }
}
