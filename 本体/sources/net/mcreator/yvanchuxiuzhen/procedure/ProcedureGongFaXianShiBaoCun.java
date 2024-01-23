package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureGongFaXianShiBaoCun.class */
public class ProcedureGongFaXianShiBaoCun extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaXianShiBaoCun(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 352);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("GongFa");
            if (_so == null) {
                _so = _sc.func_96535_a("GongFa", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("GongFa"));
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow1").equals("长春功")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc2 = entityPlayer.func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("GongFaShow1");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("GongFaShow1", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                _scr2.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow1").equals("金刚功")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc3 = entityPlayer.func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("GongFaShow1");
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("GongFaShow1", ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                _scr3.func_96647_c(2);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow1").equals("上善诀")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc4 = entityPlayer.func_96123_co();
                ScoreObjective _so4 = _sc4.func_96518_b("GongFaShow1");
                if (_so4 == null) {
                    _so4 = _sc4.func_96535_a("GongFaShow1", ScoreCriteria.field_96641_b);
                }
                Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
                _scr4.func_96647_c(3);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow1").equals("烈火诀")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc5 = entityPlayer.func_96123_co();
                ScoreObjective _so5 = _sc5.func_96518_b("GongFaShow1");
                if (_so5 == null) {
                    _so5 = _sc5.func_96535_a("GongFaShow1", ScoreCriteria.field_96641_b);
                }
                Score _scr5 = _sc5.func_96529_a(entityPlayer.func_146103_bH().getName(), _so5);
                _scr5.func_96647_c(4);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow1").equals("地蕴功")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc6 = entityPlayer.func_96123_co();
                ScoreObjective _so6 = _sc6.func_96518_b("GongFaShow1");
                if (_so6 == null) {
                    _so6 = _sc6.func_96535_a("GongFaShow1", ScoreCriteria.field_96641_b);
                }
                Score _scr6 = _sc6.func_96529_a(entityPlayer.func_146103_bH().getName(), _so6);
                _scr6.func_96647_c(5);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow1").equals("悟灵诀") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc7 = entityPlayer.func_96123_co();
            ScoreObjective _so7 = _sc7.func_96518_b("GongFaShow1");
            if (_so7 == null) {
                _so7 = _sc7.func_96535_a("GongFaShow1", ScoreCriteria.field_96641_b);
            }
            Score _scr7 = _sc7.func_96529_a(entityPlayer.func_146103_bH().getName(), _so7);
            _scr7.func_96647_c(6);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow2").equals("青元剑诀上部") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc8 = entityPlayer.func_96123_co();
            ScoreObjective _so8 = _sc8.func_96518_b("GongFaShow2");
            if (_so8 == null) {
                _so8 = _sc8.func_96535_a("GongFaShow2", ScoreCriteria.field_96641_b);
            }
            Score _scr8 = _sc8.func_96529_a(entityPlayer.func_146103_bH().getName(), _so8);
            _scr8.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow3").equals("三转重元功") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc9 = entityPlayer.func_96123_co();
            ScoreObjective _so9 = _sc9.func_96518_b("GongFaShow3");
            if (_so9 == null) {
                _so9 = _sc9.func_96535_a("GongFaShow3", ScoreCriteria.field_96641_b);
            }
            Score _scr9 = _sc9.func_96529_a(entityPlayer.func_146103_bH().getName(), _so9);
            _scr9.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow4").equals("逆情断天大法") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc10 = entityPlayer.func_96123_co();
            ScoreObjective _so10 = _sc10.func_96518_b("GongFaShow4");
            if (_so10 == null) {
                _so10 = _sc10.func_96535_a("GongFaShow4", ScoreCriteria.field_96641_b);
            }
            Score _scr10 = _sc10.func_96529_a(entityPlayer.func_146103_bH().getName(), _so10);
            _scr10.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow5").equals("玄阴大法") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc11 = entityPlayer.func_96123_co();
            ScoreObjective _so11 = _sc11.func_96518_b("GongFaShow5");
            if (_so11 == null) {
                _so11 = _sc11.func_96535_a("GongFaShow5", ScoreCriteria.field_96641_b);
            }
            Score _scr11 = _sc11.func_96529_a(entityPlayer.func_146103_bH().getName(), _so11);
            _scr11.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow6").equals("玉丹功") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc12 = entityPlayer.func_96123_co();
            ScoreObjective _so12 = _sc12.func_96518_b("GongFaShow6");
            if (_so12 == null) {
                _so12 = _sc12.func_96535_a("GongFaShow6", ScoreCriteria.field_96641_b);
            }
            Score _scr12 = _sc12.func_96529_a(entityPlayer.func_146103_bH().getName(), _so12);
            _scr12.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow7").equals("六极真魔功") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc13 = entityPlayer.func_96123_co();
            ScoreObjective _so13 = _sc13.func_96518_b("GongFaShow7");
            if (_so13 == null) {
                _so13 = _sc13.func_96535_a("GongFaShow7", ScoreCriteria.field_96641_b);
            }
            Score _scr13 = _sc13.func_96529_a(entityPlayer.func_146103_bH().getName(), _so13);
            _scr13.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow8").equals("万象森林")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc14 = entityPlayer.func_96123_co();
                ScoreObjective _so14 = _sc14.func_96518_b("GongFaShow8");
                if (_so14 == null) {
                    _so14 = _sc14.func_96535_a("GongFaShow8", ScoreCriteria.field_96641_b);
                }
                Score _scr14 = _sc14.func_96529_a(entityPlayer.func_146103_bH().getName(), _so14);
                _scr14.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow8").equals("金真功")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc15 = entityPlayer.func_96123_co();
                ScoreObjective _so15 = _sc15.func_96518_b("GongFaShow8");
                if (_so15 == null) {
                    _so15 = _sc15.func_96535_a("GongFaShow8", ScoreCriteria.field_96641_b);
                }
                Score _scr15 = _sc15.func_96529_a(entityPlayer.func_146103_bH().getName(), _so15);
                _scr15.func_96647_c(2);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow8").equals("玄冰诀")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc16 = entityPlayer.func_96123_co();
                ScoreObjective _so16 = _sc16.func_96518_b("GongFaShow8");
                if (_so16 == null) {
                    _so16 = _sc16.func_96535_a("GongFaShow8", ScoreCriteria.field_96641_b);
                }
                Score _scr16 = _sc16.func_96529_a(entityPlayer.func_146103_bH().getName(), _so16);
                _scr16.func_96647_c(3);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow8").equals("焚火诀")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc17 = entityPlayer.func_96123_co();
                ScoreObjective _so17 = _sc17.func_96518_b("GongFaShow8");
                if (_so17 == null) {
                    _so17 = _sc17.func_96535_a("GongFaShow8", ScoreCriteria.field_96641_b);
                }
                Score _scr17 = _sc17.func_96529_a(entityPlayer.func_146103_bH().getName(), _so17);
                _scr17.func_96647_c(4);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow8").equals("灵暝诀")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc18 = entityPlayer.func_96123_co();
                ScoreObjective _so18 = _sc18.func_96518_b("GongFaShow8");
                if (_so18 == null) {
                    _so18 = _sc18.func_96535_a("GongFaShow8", ScoreCriteria.field_96641_b);
                }
                Score _scr18 = _sc18.func_96529_a(entityPlayer.func_146103_bH().getName(), _so18);
                _scr18.func_96647_c(5);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow8").equals("元磁神光") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc19 = entityPlayer.func_96123_co();
            ScoreObjective _so19 = _sc19.func_96518_b("GongFaShow8");
            if (_so19 == null) {
                _so19 = _sc19.func_96535_a("GongFaShow8", ScoreCriteria.field_96641_b);
            }
            Score _scr19 = _sc19.func_96529_a(entityPlayer.func_146103_bH().getName(), _so19);
            _scr19.func_96647_c(6);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow9").equals("玄天炼火诀") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc20 = entityPlayer.func_96123_co();
            ScoreObjective _so20 = _sc20.func_96518_b("GongFaShow9");
            if (_so20 == null) {
                _so20 = _sc20.func_96535_a("GongFaShow9", ScoreCriteria.field_96641_b);
            }
            Score _scr20 = _sc20.func_96529_a(entityPlayer.func_146103_bH().getName(), _so20);
            _scr20.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow10").equals("辟邪电光")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc21 = entityPlayer.func_96123_co();
                ScoreObjective _so21 = _sc21.func_96518_b("GongFaShow10");
                if (_so21 == null) {
                    _so21 = _sc21.func_96535_a("GongFaShow10", ScoreCriteria.field_96641_b);
                }
                Score _scr21 = _sc21.func_96529_a(entityPlayer.func_146103_bH().getName(), _so21);
                _scr21.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow10").equals("五毒神功") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc22 = entityPlayer.func_96123_co();
            ScoreObjective _so22 = _sc22.func_96518_b("GongFaShow10");
            if (_so22 == null) {
                _so22 = _sc22.func_96535_a("GongFaShow10", ScoreCriteria.field_96641_b);
            }
            Score _scr22 = _sc22.func_96529_a(entityPlayer.func_146103_bH().getName(), _so22);
            _scr22.func_96647_c(2);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow11").equals("紫罗玄功")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc23 = entityPlayer.func_96123_co();
                ScoreObjective _so23 = _sc23.func_96518_b("GongFaShow11");
                if (_so23 == null) {
                    _so23 = _sc23.func_96535_a("GongFaShow11", ScoreCriteria.field_96641_b);
                }
                Score _scr23 = _sc23.func_96529_a(entityPlayer.func_146103_bH().getName(), _so23);
                _scr23.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow11").equals("天刹真魔功") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc24 = entityPlayer.func_96123_co();
            ScoreObjective _so24 = _sc24.func_96518_b("GongFaShow11");
            if (_so24 == null) {
                _so24 = _sc24.func_96535_a("GongFaShow11", ScoreCriteria.field_96641_b);
            }
            Score _scr24 = _sc24.func_96529_a(entityPlayer.func_146103_bH().getName(), _so24);
            _scr24.func_96647_c(2);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow12").equals("金刚经") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc25 = entityPlayer.func_96123_co();
            ScoreObjective _so25 = _sc25.func_96518_b("GongFaShow12");
            if (_so25 == null) {
                _so25 = _sc25.func_96535_a("GongFaShow12", ScoreCriteria.field_96641_b);
            }
            Score _scr25 = _sc25.func_96529_a(entityPlayer.func_146103_bH().getName(), _so25);
            _scr25.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow13").equals("浩然正气诀")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc26 = entityPlayer.func_96123_co();
                ScoreObjective _so26 = _sc26.func_96518_b("GongFaShow13");
                if (_so26 == null) {
                    _so26 = _sc26.func_96535_a("GongFaShow13", ScoreCriteria.field_96641_b);
                }
                Score _scr26 = _sc26.func_96529_a(entityPlayer.func_146103_bH().getName(), _so26);
                _scr26.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow13").equals("上古魔功") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc27 = entityPlayer.func_96123_co();
            ScoreObjective _so27 = _sc27.func_96518_b("GongFaShow13");
            if (_so27 == null) {
                _so27 = _sc27.func_96535_a("GongFaShow13", ScoreCriteria.field_96641_b);
            }
            Score _scr27 = _sc27.func_96529_a(entityPlayer.func_146103_bH().getName(), _so27);
            _scr27.func_96647_c(2);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow14").equals("太白剑诀")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc28 = entityPlayer.func_96123_co();
                ScoreObjective _so28 = _sc28.func_96518_b("GongFaShow14");
                if (_so28 == null) {
                    _so28 = _sc28.func_96535_a("GongFaShow14", ScoreCriteria.field_96641_b);
                }
                Score _scr28 = _sc28.func_96529_a(entityPlayer.func_146103_bH().getName(), _so28);
                _scr28.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow14").equals("血车真诀") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc29 = entityPlayer.func_96123_co();
            ScoreObjective _so29 = _sc29.func_96518_b("GongFaShow14");
            if (_so29 == null) {
                _so29 = _sc29.func_96535_a("GongFaShow14", ScoreCriteria.field_96641_b);
            }
            Score _scr29 = _sc29.func_96529_a(entityPlayer.func_146103_bH().getName(), _so29);
            _scr29.func_96647_c(2);
        }
        if (entityPlayer.getEntityData().func_74779_i("GongFaShow15").equals("阴阳合欢功")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc30 = entityPlayer.func_96123_co();
                ScoreObjective _so30 = _sc30.func_96518_b("GongFaShow15");
                if (_so30 == null) {
                    _so30 = _sc30.func_96535_a("GongFaShow15", ScoreCriteria.field_96641_b);
                }
                Score _scr30 = _sc30.func_96529_a(entityPlayer.func_146103_bH().getName(), _so30);
                _scr30.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("GongFaShow15").equals("双剑九龙诀") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc31 = entityPlayer.func_96123_co();
            ScoreObjective _so31 = _sc31.func_96518_b("GongFaShow15");
            if (_so31 == null) {
                _so31 = _sc31.func_96535_a("GongFaShow15", ScoreCriteria.field_96641_b);
            }
            Score _scr31 = _sc31.func_96529_a(entityPlayer.func_146103_bH().getName(), _so31);
            _scr31.func_96647_c(2);
        }
    }
}
