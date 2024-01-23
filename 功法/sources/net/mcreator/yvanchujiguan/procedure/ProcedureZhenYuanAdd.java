package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureZhenYuanAdd.class */
public class ProcedureZhenYuanAdd extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhenYuanAdd(ElementsYvanchujiguanMod instance) {
        super(instance, 258);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [net.mcreator.yvanchujiguan.procedure.ProcedureZhenYuanAdd$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if ((entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 1.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 2.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 3.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") <= 5.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
            entityPlayer.getEntityData().func_74780_a("真元增加计时", entityPlayer.getEntityData().func_74769_h("真元增加计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("真元增加计时") >= 4.0d) {
                entityPlayer.getEntityData().func_74780_a("真元增加计时", 0.0d);
                entityPlayer.getEntityData().func_74780_a("真元增加数", 1.0d);
            }
        } else if ((entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 1.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 2.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 3.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") >= 5.0d) {
            entityPlayer.getEntityData().func_74780_a("真元增加计时", entityPlayer.getEntityData().func_74769_h("真元增加计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("真元增加计时") >= 4.0d) {
                entityPlayer.getEntityData().func_74780_a("真元增加计时", 0.0d);
                entityPlayer.getEntityData().func_74780_a("真元增加数", 1.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 4.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 5.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 6.0d) {
            entityPlayer.getEntityData().func_74780_a("真元增加计时", entityPlayer.getEntityData().func_74769_h("真元增加计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("真元增加计时") >= 2.0d) {
                entityPlayer.getEntityData().func_74780_a("真元增加计时", 0.0d);
                entityPlayer.getEntityData().func_74780_a("真元增加数", 1.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 7.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 8.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 9.0d) {
            entityPlayer.getEntityData().func_74780_a("真元增加数", 2.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 10.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 11.0d || entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 12.0d) {
            entityPlayer.getEntityData().func_74780_a("真元增加数", 6.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 13.0d && !entityPlayer.getEntityData().func_74779_i("GongFaShow").equals("元磁神功")) {
            entityPlayer.getEntityData().func_74780_a("真元增加数", 18.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("MeditationTime") > 1.0d) {
            entityPlayer.getEntityData().func_74780_a("真元增加数", entityPlayer.getEntityData().func_74769_h("真元增加数") * 10.0d);
        }
        entityPlayer.getEntityData().func_74780_a("真元增加数", entityPlayer.getEntityData().func_74769_h("真元增加数") * (1.0d + entityPlayer.getEntityData().func_74769_h("ZiZhiBianLiang")));
        if (entityPlayer.getEntityData().func_74769_h("YaoXingZanCun") != 0.0d && entityPlayer.getEntityData().func_74769_h("XiuLian") == 1.0d && entityPlayer.getEntityData().func_74769_h("GHuanCun") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("真元增加数", entityPlayer.getEntityData().func_74769_h("真元增加数") * 10.0d);
            entityPlayer.getEntityData().func_74780_a("YaoXingZanCun", entityPlayer.getEntityData().func_74769_h("YaoXingZanCun") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("YXtime", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("药性已消耗"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GHuanCun") == 1.0d && entityPlayer.getEntityData().func_74769_h("YaoXingZanCun") == 0.0d && entityPlayer.getEntityData().func_74769_h("XiuLian") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("GHuanCun", 0.0d);
            entityPlayer.getEntityData().func_74780_a("真元增加数", entityPlayer.getEntityData().func_74769_h("真元增加数") * 1.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("药性残留已消耗殆尽，闭关无法增加真元获取速度，已结束闭关"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GHuanCun") == 1.0d && entityPlayer.getEntityData().func_74769_h("XiuLian") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("GHuanCun", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("药性的吸收需在蒲团上进行"), false);
            }
        }
        entityPlayer.getEntityData().func_74780_a("SectGain1", entityPlayer.getEntityData().func_74769_h("SectGain") + entityPlayer.getEntityData().func_74769_h("SectGain2") + (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureZhenYuanAdd.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("SectGain3") * 0.01d));
        entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + entityPlayer.getEntityData().func_74769_h("真元增加数"));
        entityPlayer.getEntityData().func_74780_a("SectGain2", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("SectGain3");
            if (_so == null) {
                _so = _sc.func_96535_a("SectGain3", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(0);
        }
    }
}
