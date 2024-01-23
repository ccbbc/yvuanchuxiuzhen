package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureZhuJueMoShi.class */
public class ProcedureZhuJueMoShi extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureZhuJueMoShi(ElementsWupinmiaosuMod instance) {
        super(instance, 83);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74757_a("JinLingGen", false);
        entityPlayer.getEntityData().func_74757_a("MuLingGen", false);
        entityPlayer.getEntityData().func_74757_a("ShuiLingGen", false);
        entityPlayer.getEntityData().func_74757_a("HuoLingGen", false);
        entityPlayer.getEntityData().func_74757_a("TuLingGen", false);
        entityPlayer.getEntityData().func_74778_a("LingGen", "");
        entityPlayer.getEntityData().func_74780_a("LingGenNum", 0.0d);
        entityPlayer.getEntityData().func_74780_a("随机值", 3.0d);
        for (int index0 = 0; index0 < 20; index0++) {
            if (!entityPlayer.getEntityData().func_74767_n("JinLingGen")) {
                if (Math.random() < 0.25d) {
                    entityPlayer.getEntityData().func_74757_a("JinLingGen", true);
                    entityPlayer.getEntityData().func_74778_a("LingGen", entityPlayer.getEntityData().func_74779_i("LingGen") + "金");
                    entityPlayer.getEntityData().func_74780_a("LingGenNum", entityPlayer.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                }
                if (entityPlayer.getEntityData().func_74769_h("LingGenNum") >= entityPlayer.getEntityData().func_74769_h("随机值")) {
                    break;
                }
            }
            if (!entityPlayer.getEntityData().func_74767_n("MuLingGen")) {
                if (Math.random() < 0.25d) {
                    entityPlayer.getEntityData().func_74757_a("MuLingGen", true);
                    entityPlayer.getEntityData().func_74778_a("LingGen", entityPlayer.getEntityData().func_74779_i("LingGen") + "木");
                    entityPlayer.getEntityData().func_74780_a("LingGenNum", entityPlayer.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                }
                if (entityPlayer.getEntityData().func_74769_h("LingGenNum") >= entityPlayer.getEntityData().func_74769_h("随机值")) {
                    break;
                }
            }
            if (!entityPlayer.getEntityData().func_74767_n("ShuiLingGen")) {
                if (Math.random() < 0.25d) {
                    entityPlayer.getEntityData().func_74757_a("ShuiLingGen", true);
                    entityPlayer.getEntityData().func_74778_a("LingGen", entityPlayer.getEntityData().func_74779_i("LingGen") + "水");
                    entityPlayer.getEntityData().func_74780_a("LingGenNum", entityPlayer.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                }
                if (entityPlayer.getEntityData().func_74769_h("LingGenNum") >= entityPlayer.getEntityData().func_74769_h("随机值")) {
                    break;
                }
            }
            if (!entityPlayer.getEntityData().func_74767_n("HuoLingGen")) {
                if (Math.random() < 0.25d) {
                    entityPlayer.getEntityData().func_74757_a("HuoLingGen", true);
                    entityPlayer.getEntityData().func_74778_a("LingGen", entityPlayer.getEntityData().func_74779_i("LingGen") + "火");
                    entityPlayer.getEntityData().func_74780_a("LingGenNum", entityPlayer.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                }
                if (entityPlayer.getEntityData().func_74769_h("LingGenNum") >= entityPlayer.getEntityData().func_74769_h("随机值")) {
                    break;
                }
            }
            if (!entityPlayer.getEntityData().func_74767_n("TuLingGen")) {
                if (Math.random() < 0.25d) {
                    entityPlayer.getEntityData().func_74757_a("TuLingGen", true);
                    entityPlayer.getEntityData().func_74778_a("LingGen", entityPlayer.getEntityData().func_74779_i("LingGen") + "土");
                    entityPlayer.getEntityData().func_74780_a("LingGenNum", entityPlayer.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                }
                if (entityPlayer.getEntityData().func_74769_h("LingGenNum") >= entityPlayer.getEntityData().func_74769_h("随机值")) {
                    break;
                }
            }
        }
        entityPlayer.getEntityData().func_74778_a("TiZhi", "三阳之体");
        entityPlayer.getEntityData().func_74780_a("TiZhiNum", 1.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("yuanchuchoose");
            if (_so == null) {
                _so = _sc.func_96535_a("yuanchuchoose", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(1);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc2 = entityPlayer.func_96123_co();
            ScoreObjective _so2 = _sc2.func_96518_b("GongFaReduce");
            if (_so2 == null) {
                _so2 = _sc2.func_96535_a("GongFaReduce", ScoreCriteria.field_96641_b);
            }
            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
            _scr2.func_96647_c(1);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc3 = entityPlayer.func_96123_co();
            ScoreObjective _so3 = _sc3.func_96518_b("MoShiNum");
            if (_so3 == null) {
                _so3 = _sc3.func_96535_a("MoShiNum", ScoreCriteria.field_96641_b);
            }
            Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
            _scr3.func_96647_c(2);
        }
    }
}
