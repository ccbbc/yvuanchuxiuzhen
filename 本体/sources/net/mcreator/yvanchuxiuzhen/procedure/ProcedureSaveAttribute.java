package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSaveAttribute.class */
public class ProcedureSaveAttribute extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSaveAttribute(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 305);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSaveAttribute$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("死亡");
            if (_so == null) {
                _so = _sc.func_96535_a("死亡", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(1);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc2 = entityPlayer.func_96123_co();
            ScoreObjective _so2 = _sc2.func_96518_b("HealthMax");
            if (_so2 == null) {
                _so2 = _sc2.func_96535_a("HealthMax", ScoreCriteria.field_96641_b);
            }
            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
            _scr2.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("HealthMax") - entityPlayer.getEntityData().func_74769_h("HealthMaxTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("HealthMaxTemp", 0.0d);
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSaveAttribute.1
            public int getScore(String score) {
                Scoreboard _sc3;
                ScoreObjective _so3;
                if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                    return _scr3.func_96652_c();
                }
                return 0;
            }
        }.getScore("已重伤") == 0) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc3 = entityPlayer.func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("Attack");
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("Attack", ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                _scr3.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("Attack") - entityPlayer.getEntityData().func_74769_h("AttackTemp")));
            }
            entityPlayer.getEntityData().func_74780_a("AttackTemp", 0.0d);
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc4 = entityPlayer.func_96123_co();
                ScoreObjective _so4 = _sc4.func_96518_b("MagicAttack");
                if (_so4 == null) {
                    _so4 = _sc4.func_96535_a("MagicAttack", ScoreCriteria.field_96641_b);
                }
                Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
                _scr4.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("MagicAttack") - entityPlayer.getEntityData().func_74769_h("MagicAttackTemp")));
            }
            entityPlayer.getEntityData().func_74780_a("MagicAttackTemp", 0.0d);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc5 = entityPlayer.func_96123_co();
            ScoreObjective _so5 = _sc5.func_96518_b("ThunderAttack");
            if (_so5 == null) {
                _so5 = _sc5.func_96535_a("ThunderAttack", ScoreCriteria.field_96641_b);
            }
            Score _scr5 = _sc5.func_96529_a(entityPlayer.func_146103_bH().getName(), _so5);
            _scr5.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("ThunderAttack") - entityPlayer.getEntityData().func_74769_h("ThunderAttackTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("ThunderAttackTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc6 = entityPlayer.func_96123_co();
            ScoreObjective _so6 = _sc6.func_96518_b("FireAttack");
            if (_so6 == null) {
                _so6 = _sc6.func_96535_a("FireAttack", ScoreCriteria.field_96641_b);
            }
            Score _scr6 = _sc6.func_96529_a(entityPlayer.func_146103_bH().getName(), _so6);
            _scr6.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("FireAttack") - entityPlayer.getEntityData().func_74769_h("FireAttackTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("FireAttackTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc7 = entityPlayer.func_96123_co();
            ScoreObjective _so7 = _sc7.func_96518_b("PoisonAttack");
            if (_so7 == null) {
                _so7 = _sc7.func_96535_a("PoisonAttack", ScoreCriteria.field_96641_b);
            }
            Score _scr7 = _sc7.func_96529_a(entityPlayer.func_146103_bH().getName(), _so7);
            _scr7.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("PoisonAttack") - entityPlayer.getEntityData().func_74769_h("PoisonAttackTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("PoisonAttackTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc8 = entityPlayer.func_96123_co();
            ScoreObjective _so8 = _sc8.func_96518_b("MagicDefense");
            if (_so8 == null) {
                _so8 = _sc8.func_96535_a("MagicDefense", ScoreCriteria.field_96641_b);
            }
            Score _scr8 = _sc8.func_96529_a(entityPlayer.func_146103_bH().getName(), _so8);
            _scr8.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("MagicDefense") - entityPlayer.getEntityData().func_74769_h("MagicDefenseTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("MagicDefenseTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc9 = entityPlayer.func_96123_co();
            ScoreObjective _so9 = _sc9.func_96518_b("ThunderDefense");
            if (_so9 == null) {
                _so9 = _sc9.func_96535_a("ThunderDefense", ScoreCriteria.field_96641_b);
            }
            Score _scr9 = _sc9.func_96529_a(entityPlayer.func_146103_bH().getName(), _so9);
            _scr9.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("ThunderDefense") - entityPlayer.getEntityData().func_74769_h("ThunderDefenseTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("ThunderDefenseTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc10 = entityPlayer.func_96123_co();
            ScoreObjective _so10 = _sc10.func_96518_b("FireDefense");
            if (_so10 == null) {
                _so10 = _sc10.func_96535_a("FireDefense", ScoreCriteria.field_96641_b);
            }
            Score _scr10 = _sc10.func_96529_a(entityPlayer.func_146103_bH().getName(), _so10);
            _scr10.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("FireDefense") - entityPlayer.getEntityData().func_74769_h("FireDefenseTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("FireDefenseTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc11 = entityPlayer.func_96123_co();
            ScoreObjective _so11 = _sc11.func_96518_b("PoisonDefense");
            if (_so11 == null) {
                _so11 = _sc11.func_96535_a("PoisonDefense", ScoreCriteria.field_96641_b);
            }
            Score _scr11 = _sc11.func_96529_a(entityPlayer.func_146103_bH().getName(), _so11);
            _scr11.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("PoisonDefense") - entityPlayer.getEntityData().func_74769_h("PoisonDefenseTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("PoisonDefenseTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc12 = entityPlayer.func_96123_co();
            ScoreObjective _so12 = _sc12.func_96518_b("Defense");
            if (_so12 == null) {
                _so12 = _sc12.func_96535_a("Defense", ScoreCriteria.field_96641_b);
            }
            Score _scr12 = _sc12.func_96529_a(entityPlayer.func_146103_bH().getName(), _so12);
            _scr12.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("Defense") - entityPlayer.getEntityData().func_74769_h("DefenseTemp")));
        }
        entityPlayer.getEntityData().func_74780_a("DefenseTemp", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc13 = entityPlayer.func_96123_co();
            ScoreObjective _so13 = _sc13.func_96518_b("YuanShenUp");
            if (_so13 == null) {
                _so13 = _sc13.func_96535_a("YuanShenUp", ScoreCriteria.field_96641_b);
            }
            Score _scr13 = _sc13.func_96529_a(entityPlayer.func_146103_bH().getName(), _so13);
            _scr13.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("YuanShenUp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc14 = entityPlayer.func_96123_co();
            ScoreObjective _so14 = _sc14.func_96518_b("YuanYingUp");
            if (_so14 == null) {
                _so14 = _sc14.func_96535_a("YuanYingUp", ScoreCriteria.field_96641_b);
            }
            Score _scr14 = _sc14.func_96529_a(entityPlayer.func_146103_bH().getName(), _so14);
            _scr14.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("YuanYingUp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc15 = entityPlayer.func_96123_co();
            ScoreObjective _so15 = _sc15.func_96518_b("DaoLing");
            if (_so15 == null) {
                _so15 = _sc15.func_96535_a("DaoLing", ScoreCriteria.field_96641_b);
            }
            Score _scr15 = _sc15.func_96529_a(entityPlayer.func_146103_bH().getName(), _so15);
            _scr15.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DaoLing"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc16 = entityPlayer.func_96123_co();
            ScoreObjective _so16 = _sc16.func_96518_b("ShouYuan");
            if (_so16 == null) {
                _so16 = _sc16.func_96535_a("ShouYuan", ScoreCriteria.field_96641_b);
            }
            Score _scr16 = _sc16.func_96529_a(entityPlayer.func_146103_bH().getName(), _so16);
            _scr16.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ShouYuan"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc17 = entityPlayer.func_96123_co();
            ScoreObjective _so17 = _sc17.func_96518_b("GongFa");
            if (_so17 == null) {
                _so17 = _sc17.func_96535_a("GongFa", ScoreCriteria.field_96641_b);
            }
            Score _scr17 = _sc17.func_96529_a(entityPlayer.func_146103_bH().getName(), _so17);
            _scr17.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("GongFa"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc18 = entityPlayer.func_96123_co();
            ScoreObjective _so18 = _sc18.func_96518_b("GongFaShow");
            if (_so18 == null) {
                _so18 = _sc18.func_96535_a("GongFaShow", ScoreCriteria.field_96641_b);
            }
            Score _scr18 = _sc18.func_96529_a(entityPlayer.func_146103_bH().getName(), _so18);
            _scr18.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("GongFaShow"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc19 = entityPlayer.func_96123_co();
            ScoreObjective _so19 = _sc19.func_96518_b("Base");
            if (_so19 == null) {
                _so19 = _sc19.func_96535_a("Base", ScoreCriteria.field_96641_b);
            }
            Score _scr19 = _sc19.func_96529_a(entityPlayer.func_146103_bH().getName(), _so19);
            _scr19.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("Base"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc20 = entityPlayer.func_96123_co();
            ScoreObjective _so20 = _sc20.func_96518_b("ShaQi");
            if (_so20 == null) {
                _so20 = _sc20.func_96535_a("ShaQi", ScoreCriteria.field_96641_b);
            }
            Score _scr20 = _sc20.func_96529_a(entityPlayer.func_146103_bH().getName(), _so20);
            _scr20.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ShaQi"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc21 = entityPlayer.func_96123_co();
            ScoreObjective _so21 = _sc21.func_96518_b("LingYuZhi");
            if (_so21 == null) {
                _so21 = _sc21.func_96535_a("LingYuZhi", ScoreCriteria.field_96641_b);
            }
            Score _scr21 = _sc21.func_96529_a(entityPlayer.func_146103_bH().getName(), _so21);
            _scr21.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LingYuZhi"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc22 = entityPlayer.func_96123_co();
            ScoreObjective _so22 = _sc22.func_96518_b("灵裕值增加计时");
            if (_so22 == null) {
                _so22 = _sc22.func_96535_a("灵裕值增加计时", ScoreCriteria.field_96641_b);
            }
            Score _scr22 = _sc22.func_96529_a(entityPlayer.func_146103_bH().getName(), _so22);
            _scr22.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("灵裕值增加计时"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc23 = entityPlayer.func_96123_co();
            ScoreObjective _so23 = _sc23.func_96518_b("BaseMax");
            if (_so23 == null) {
                _so23 = _sc23.func_96535_a("BaseMax", ScoreCriteria.field_96641_b);
            }
            Score _scr23 = _sc23.func_96529_a(entityPlayer.func_146103_bH().getName(), _so23);
            _scr23.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("BaseMax"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc24 = entityPlayer.func_96123_co();
            ScoreObjective _so24 = _sc24.func_96518_b("Power");
            if (_so24 == null) {
                _so24 = _sc24.func_96535_a("Power", ScoreCriteria.field_96641_b);
            }
            Score _scr24 = _sc24.func_96529_a(entityPlayer.func_146103_bH().getName(), _so24);
            _scr24.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("Power"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc25 = entityPlayer.func_96123_co();
            ScoreObjective _so25 = _sc25.func_96518_b("PowerReply");
            if (_so25 == null) {
                _so25 = _sc25.func_96535_a("PowerReply", ScoreCriteria.field_96641_b);
            }
            Score _scr25 = _sc25.func_96529_a(entityPlayer.func_146103_bH().getName(), _so25);
            _scr25.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("PowerReply"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc26 = entityPlayer.func_96123_co();
            ScoreObjective _so26 = _sc26.func_96518_b("PowerMax");
            if (_so26 == null) {
                _so26 = _sc26.func_96535_a("PowerMax", ScoreCriteria.field_96641_b);
            }
            Score _scr26 = _sc26.func_96529_a(entityPlayer.func_146103_bH().getName(), _so26);
            _scr26.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("PowerMax"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc27 = entityPlayer.func_96123_co();
            ScoreObjective _so27 = _sc27.func_96518_b("JingJieNum");
            if (_so27 == null) {
                _so27 = _sc27.func_96535_a("JingJieNum", ScoreCriteria.field_96641_b);
            }
            Score _scr27 = _sc27.func_96529_a(entityPlayer.func_146103_bH().getName(), _so27);
            _scr27.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("JingJieNum"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc28 = entityPlayer.func_96123_co();
            ScoreObjective _so28 = _sc28.func_96518_b("XiaoJingJieNum");
            if (_so28 == null) {
                _so28 = _sc28.func_96535_a("XiaoJingJieNum", ScoreCriteria.field_96641_b);
            }
            Score _scr28 = _sc28.func_96529_a(entityPlayer.func_146103_bH().getName(), _so28);
            _scr28.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc29 = entityPlayer.func_96123_co();
            ScoreObjective _so29 = _sc29.func_96518_b("XiaoJingJieNumS");
            if (_so29 == null) {
                _so29 = _sc29.func_96535_a("XiaoJingJieNumS", ScoreCriteria.field_96641_b);
            }
            Score _scr29 = _sc29.func_96529_a(entityPlayer.func_146103_bH().getName(), _so29);
            _scr29.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("XiaoJingJieNumSave"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc30 = entityPlayer.func_96123_co();
            ScoreObjective _so30 = _sc30.func_96518_b("LayerNum");
            if (_so30 == null) {
                _so30 = _sc30.func_96535_a("LayerNum", ScoreCriteria.field_96641_b);
            }
            Score _scr30 = _sc30.func_96529_a(entityPlayer.func_146103_bH().getName(), _so30);
            _scr30.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LayerNum"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc31 = entityPlayer.func_96123_co();
            ScoreObjective _so31 = _sc31.func_96518_b("LingGenNum");
            if (_so31 == null) {
                _so31 = _sc31.func_96535_a("LingGenNum", ScoreCriteria.field_96641_b);
            }
            Score _scr31 = _sc31.func_96529_a(entityPlayer.func_146103_bH().getName(), _so31);
            _scr31.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LingGenNum"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc32 = entityPlayer.func_96123_co();
            ScoreObjective _so32 = _sc32.func_96518_b("TiZhiNum");
            if (_so32 == null) {
                _so32 = _sc32.func_96535_a("TiZhiNum", ScoreCriteria.field_96641_b);
            }
            Score _scr32 = _sc32.func_96529_a(entityPlayer.func_146103_bH().getName(), _so32);
            _scr32.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("TiZhiNum"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc33 = entityPlayer.func_96123_co();
            ScoreObjective _so33 = _sc33.func_96518_b("LianQi");
            if (_so33 == null) {
                _so33 = _sc33.func_96535_a("LianQi", ScoreCriteria.field_96641_b);
            }
            Score _scr33 = _sc33.func_96529_a(entityPlayer.func_146103_bH().getName(), _so33);
            _scr33.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LianQi"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc34 = entityPlayer.func_96123_co();
            ScoreObjective _so34 = _sc34.func_96518_b("LianQiXp");
            if (_so34 == null) {
                _so34 = _sc34.func_96535_a("LianQiXp", ScoreCriteria.field_96641_b);
            }
            Score _scr34 = _sc34.func_96529_a(entityPlayer.func_146103_bH().getName(), _so34);
            _scr34.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LianQiXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc35 = entityPlayer.func_96123_co();
            ScoreObjective _so35 = _sc35.func_96518_b("LianDan");
            if (_so35 == null) {
                _so35 = _sc35.func_96535_a("LianDan", ScoreCriteria.field_96641_b);
            }
            Score _scr35 = _sc35.func_96529_a(entityPlayer.func_146103_bH().getName(), _so35);
            _scr35.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LianDan"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc36 = entityPlayer.func_96123_co();
            ScoreObjective _so36 = _sc36.func_96518_b("LianDanXp");
            if (_so36 == null) {
                _so36 = _sc36.func_96535_a("LianDanXp", ScoreCriteria.field_96641_b);
            }
            Score _scr36 = _sc36.func_96529_a(entityPlayer.func_146103_bH().getName(), _so36);
            _scr36.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("LianDanXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc37 = entityPlayer.func_96123_co();
            ScoreObjective _so37 = _sc37.func_96518_b("FuLu");
            if (_so37 == null) {
                _so37 = _sc37.func_96535_a("FuLu", ScoreCriteria.field_96641_b);
            }
            Score _scr37 = _sc37.func_96529_a(entityPlayer.func_146103_bH().getName(), _so37);
            _scr37.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("FuLu"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc38 = entityPlayer.func_96123_co();
            ScoreObjective _so38 = _sc38.func_96518_b("FuLuXp");
            if (_so38 == null) {
                _so38 = _sc38.func_96535_a("FuLuXp", ScoreCriteria.field_96641_b);
            }
            Score _scr38 = _sc38.func_96529_a(entityPlayer.func_146103_bH().getName(), _so38);
            _scr38.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("FuLuXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc39 = entityPlayer.func_96123_co();
            ScoreObjective _so39 = _sc39.func_96518_b("ZhiLi");
            if (_so39 == null) {
                _so39 = _sc39.func_96535_a("ZhiLi", ScoreCriteria.field_96641_b);
            }
            Score _scr39 = _sc39.func_96529_a(entityPlayer.func_146103_bH().getName(), _so39);
            _scr39.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ZhiLi"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc40 = entityPlayer.func_96123_co();
            ScoreObjective _so40 = _sc40.func_96518_b("ZhiLiXp");
            if (_so40 == null) {
                _so40 = _sc40.func_96535_a("ZhiLiXp", ScoreCriteria.field_96641_b);
            }
            Score _scr40 = _sc40.func_96529_a(entityPlayer.func_146103_bH().getName(), _so40);
            _scr40.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ZhiLiXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc41 = entityPlayer.func_96123_co();
            ScoreObjective _so41 = _sc41.func_96518_b("突破失败增加概率");
            if (_so41 == null) {
                _so41 = _sc41.func_96535_a("突破失败增加概率", ScoreCriteria.field_96641_b);
            }
            Score _scr41 = _sc41.func_96529_a(entityPlayer.func_146103_bH().getName(), _so41);
            _scr41.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("突破失败增加概率"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc42 = entityPlayer.func_96123_co();
            ScoreObjective _so42 = _sc42.func_96518_b("功法增加概率");
            if (_so42 == null) {
                _so42 = _sc42.func_96535_a("功法增加概率", ScoreCriteria.field_96641_b);
            }
            Score _scr42 = _sc42.func_96529_a(entityPlayer.func_146103_bH().getName(), _so42);
            _scr42.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("功法增加概率"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc43 = entityPlayer.func_96123_co();
            ScoreObjective _so43 = _sc43.func_96518_b("境界突破附加概率");
            if (_so43 == null) {
                _so43 = _sc43.func_96535_a("境界突破附加概率", ScoreCriteria.field_96641_b);
            }
            Score _scr43 = _sc43.func_96529_a(entityPlayer.func_146103_bH().getName(), _so43);
            _scr43.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("境界突破附加概率"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc44 = entityPlayer.func_96123_co();
            ScoreObjective _so44 = _sc44.func_96518_b("TuPoGaiLv");
            if (_so44 == null) {
                _so44 = _sc44.func_96535_a("TuPoGaiLv", ScoreCriteria.field_96641_b);
            }
            Score _scr44 = _sc44.func_96529_a(entityPlayer.func_146103_bH().getName(), _so44);
            _scr44.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("TuPoGaiLv"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc45 = entityPlayer.func_96123_co();
            ScoreObjective _so45 = _sc45.func_96518_b("ZhenFa");
            if (_so45 == null) {
                _so45 = _sc45.func_96535_a("ZhenFa", ScoreCriteria.field_96641_b);
            }
            Score _scr45 = _sc45.func_96529_a(entityPlayer.func_146103_bH().getName(), _so45);
            _scr45.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ZhenFa"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc46 = entityPlayer.func_96123_co();
            ScoreObjective _so46 = _sc46.func_96518_b("ZhenFaXp");
            if (_so46 == null) {
                _so46 = _sc46.func_96535_a("ZhenFaXp", ScoreCriteria.field_96641_b);
            }
            Score _scr46 = _sc46.func_96529_a(entityPlayer.func_146103_bH().getName(), _so46);
            _scr46.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ZhenFaXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc47 = entityPlayer.func_96123_co();
            ScoreObjective _so47 = _sc47.func_96518_b("SouXun");
            if (_so47 == null) {
                _so47 = _sc47.func_96535_a("SouXun", ScoreCriteria.field_96641_b);
            }
            Score _scr47 = _sc47.func_96529_a(entityPlayer.func_146103_bH().getName(), _so47);
            _scr47.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXun"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc48 = entityPlayer.func_96123_co();
            ScoreObjective _so48 = _sc48.func_96518_b("SouXunXp");
            if (_so48 == null) {
                _so48 = _sc48.func_96535_a("SouXunXp", ScoreCriteria.field_96641_b);
            }
            Score _scr48 = _sc48.func_96529_a(entityPlayer.func_146103_bH().getName(), _so48);
            _scr48.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXunXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc49 = entityPlayer.func_96123_co();
            ScoreObjective _so49 = _sc49.func_96518_b("ZhongZhi");
            if (_so49 == null) {
                _so49 = _sc49.func_96535_a("ZhongZhi", ScoreCriteria.field_96641_b);
            }
            Score _scr49 = _sc49.func_96529_a(entityPlayer.func_146103_bH().getName(), _so49);
            _scr49.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXun"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc50 = entityPlayer.func_96123_co();
            ScoreObjective _so50 = _sc50.func_96518_b("ZhongZhiXp");
            if (_so50 == null) {
                _so50 = _sc50.func_96535_a("ZhongZhiXp", ScoreCriteria.field_96641_b);
            }
            Score _scr50 = _sc50.func_96529_a(entityPlayer.func_146103_bH().getName(), _so50);
            _scr50.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXunXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc51 = entityPlayer.func_96123_co();
            ScoreObjective _so51 = _sc51.func_96518_b("CaiShi");
            if (_so51 == null) {
                _so51 = _sc51.func_96535_a("CaiShi", ScoreCriteria.field_96641_b);
            }
            Score _scr51 = _sc51.func_96529_a(entityPlayer.func_146103_bH().getName(), _so51);
            _scr51.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXun"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc52 = entityPlayer.func_96123_co();
            ScoreObjective _so52 = _sc52.func_96518_b("CaiShiXp");
            if (_so52 == null) {
                _so52 = _sc52.func_96535_a("CaiShiXp", ScoreCriteria.field_96641_b);
            }
            Score _scr52 = _sc52.func_96529_a(entityPlayer.func_146103_bH().getName(), _so52);
            _scr52.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXun"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc53 = entityPlayer.func_96123_co();
            ScoreObjective _so53 = _sc53.func_96518_b("NiangJiu");
            if (_so53 == null) {
                _so53 = _sc53.func_96535_a("NiangJiu", ScoreCriteria.field_96641_b);
            }
            Score _scr53 = _sc53.func_96529_a(entityPlayer.func_146103_bH().getName(), _so53);
            _scr53.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXun"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc54 = entityPlayer.func_96123_co();
            ScoreObjective _so54 = _sc54.func_96518_b("NiangJiuXp");
            if (_so54 == null) {
                _so54 = _sc54.func_96535_a("NiangJiuXp", ScoreCriteria.field_96641_b);
            }
            Score _scr54 = _sc54.func_96529_a(entityPlayer.func_146103_bH().getName(), _so54);
            _scr54.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("SouXun"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc55 = entityPlayer.func_96123_co();
            ScoreObjective _so55 = _sc55.func_96518_b("YuanCi");
            if (_so55 == null) {
                _so55 = _sc55.func_96535_a("YuanCi", ScoreCriteria.field_96641_b);
            }
            Score _scr55 = _sc55.func_96529_a(entityPlayer.func_146103_bH().getName(), _so55);
            _scr55.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("YuanCi"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc56 = entityPlayer.func_96123_co();
            ScoreObjective _so56 = _sc56.func_96518_b("ShaQiAddMax");
            if (_so56 == null) {
                _so56 = _sc56.func_96535_a("ShaQiAddMax", ScoreCriteria.field_96641_b);
            }
            Score _scr56 = _sc56.func_96529_a(entityPlayer.func_146103_bH().getName(), _so56);
            _scr56.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ShaQiAddMax"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc57 = entityPlayer.func_96123_co();
            ScoreObjective _so57 = _sc57.func_96518_b("ShenShi");
            if (_so57 == null) {
                _so57 = _sc57.func_96535_a("ShenShi", ScoreCriteria.field_96641_b);
            }
            Score _scr57 = _sc57.func_96529_a(entityPlayer.func_146103_bH().getName(), _so57);
            _scr57.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("ShenShi"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc58 = entityPlayer.func_96123_co();
            ScoreObjective _so58 = _sc58.func_96518_b("XingShangXp");
            if (_so58 == null) {
                _so58 = _sc58.func_96535_a("XingShangXp", ScoreCriteria.field_96641_b);
            }
            Score _scr58 = _sc58.func_96529_a(entityPlayer.func_146103_bH().getName(), _so58);
            _scr58.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("XingShangXp"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc59 = entityPlayer.func_96123_co();
            ScoreObjective _so59 = _sc59.func_96518_b("XingShang");
            if (_so59 == null) {
                _so59 = _sc59.func_96535_a("XingShang", ScoreCriteria.field_96641_b);
            }
            Score _scr59 = _sc59.func_96529_a(entityPlayer.func_146103_bH().getName(), _so59);
            _scr59.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("XingShang"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc60 = entityPlayer.func_96123_co();
            ScoreObjective _so60 = _sc60.func_96518_b("JingPaiYuan");
            if (_so60 == null) {
                _so60 = _sc60.func_96535_a("JingPaiYuan", ScoreCriteria.field_96641_b);
            }
            Score _scr60 = _sc60.func_96529_a(entityPlayer.func_146103_bH().getName(), _so60);
            _scr60.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("JingPaiYuan"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc61 = entityPlayer.func_96123_co();
            ScoreObjective _so61 = _sc61.func_96518_b("DanYaoBreach1");
            if (_so61 == null) {
                _so61 = _sc61.func_96535_a("DanYaoBreach1", ScoreCriteria.field_96641_b);
            }
            Score _scr61 = _sc61.func_96529_a(entityPlayer.func_146103_bH().getName(), _so61);
            _scr61.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DanYaoBreach1"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc62 = entityPlayer.func_96123_co();
            ScoreObjective _so62 = _sc62.func_96518_b("DanYaoBreach2");
            if (_so62 == null) {
                _so62 = _sc62.func_96535_a("DanYaoBreach2", ScoreCriteria.field_96641_b);
            }
            Score _scr62 = _sc62.func_96529_a(entityPlayer.func_146103_bH().getName(), _so62);
            _scr62.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DanYaoBreach2"));
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc63 = entityPlayer.func_96123_co();
            ScoreObjective _so63 = _sc63.func_96518_b("DanYaoBreach3");
            if (_so63 == null) {
                _so63 = _sc63.func_96535_a("DanYaoBreach3", ScoreCriteria.field_96641_b);
            }
            Score _scr63 = _sc63.func_96529_a(entityPlayer.func_146103_bH().getName(), _so63);
            _scr63.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DanYaoBreach3"));
        }
        if (entityPlayer.getEntityData().func_74767_n("JinLingGen") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc64 = entityPlayer.func_96123_co();
            ScoreObjective _so64 = _sc64.func_96518_b("JinLingGen");
            if (_so64 == null) {
                _so64 = _sc64.func_96535_a("JinLingGen", ScoreCriteria.field_96641_b);
            }
            Score _scr64 = _sc64.func_96529_a(entityPlayer.func_146103_bH().getName(), _so64);
            _scr64.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74767_n("ShuiLingGen") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc65 = entityPlayer.func_96123_co();
            ScoreObjective _so65 = _sc65.func_96518_b("ShuiLingGen");
            if (_so65 == null) {
                _so65 = _sc65.func_96535_a("ShuiLingGen", ScoreCriteria.field_96641_b);
            }
            Score _scr65 = _sc65.func_96529_a(entityPlayer.func_146103_bH().getName(), _so65);
            _scr65.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74767_n("MuLingGen") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc66 = entityPlayer.func_96123_co();
            ScoreObjective _so66 = _sc66.func_96518_b("MuLingGen");
            if (_so66 == null) {
                _so66 = _sc66.func_96535_a("MuLingGen", ScoreCriteria.field_96641_b);
            }
            Score _scr66 = _sc66.func_96529_a(entityPlayer.func_146103_bH().getName(), _so66);
            _scr66.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74767_n("HuoLingGen") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc67 = entityPlayer.func_96123_co();
            ScoreObjective _so67 = _sc67.func_96518_b("HuoLingGen");
            if (_so67 == null) {
                _so67 = _sc67.func_96535_a("HuoLingGen", ScoreCriteria.field_96641_b);
            }
            Score _scr67 = _sc67.func_96529_a(entityPlayer.func_146103_bH().getName(), _so67);
            _scr67.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74767_n("TuLingGen") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc68 = entityPlayer.func_96123_co();
            ScoreObjective _so68 = _sc68.func_96518_b("TuLingGen");
            if (_so68 == null) {
                _so68 = _sc68.func_96535_a("TuLingGen", ScoreCriteria.field_96641_b);
            }
            Score _scr68 = _sc68.func_96529_a(entityPlayer.func_146103_bH().getName(), _so68);
            _scr68.func_96647_c(1);
        }
        if (entityPlayer.getEntityData().func_74779_i("XiaoJingJie").equals("初期")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc69 = entityPlayer.func_96123_co();
                ScoreObjective _so69 = _sc69.func_96518_b("小境界");
                if (_so69 == null) {
                    _so69 = _sc69.func_96535_a("小境界", ScoreCriteria.field_96641_b);
                }
                Score _scr69 = _sc69.func_96529_a(entityPlayer.func_146103_bH().getName(), _so69);
                _scr69.func_96647_c(1);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("XiaoJingJie").equals("中期")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc70 = entityPlayer.func_96123_co();
                ScoreObjective _so70 = _sc70.func_96518_b("小境界");
                if (_so70 == null) {
                    _so70 = _sc70.func_96535_a("小境界", ScoreCriteria.field_96641_b);
                }
                Score _scr70 = _sc70.func_96529_a(entityPlayer.func_146103_bH().getName(), _so70);
                _scr70.func_96647_c(2);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("XiaoJingJie").equals("后期")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc71 = entityPlayer.func_96123_co();
                ScoreObjective _so71 = _sc71.func_96518_b("小境界");
                if (_so71 == null) {
                    _so71 = _sc71.func_96535_a("小境界", ScoreCriteria.field_96641_b);
                }
                Score _scr71 = _sc71.func_96529_a(entityPlayer.func_146103_bH().getName(), _so71);
                _scr71.func_96647_c(3);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("XiaoJingJie").equals("圆满")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc72 = entityPlayer.func_96123_co();
                ScoreObjective _so72 = _sc72.func_96518_b("小境界");
                if (_so72 == null) {
                    _so72 = _sc72.func_96535_a("小境界", ScoreCriteria.field_96641_b);
                }
                Score _scr72 = _sc72.func_96529_a(entityPlayer.func_146103_bH().getName(), _so72);
                _scr72.func_96647_c(4);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("XiaoJingJie").equals("无上")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc73 = entityPlayer.func_96123_co();
                ScoreObjective _so73 = _sc73.func_96518_b("小境界");
                if (_so73 == null) {
                    _so73 = _sc73.func_96535_a("小境界", ScoreCriteria.field_96641_b);
                }
                Score _scr73 = _sc73.func_96529_a(entityPlayer.func_146103_bH().getName(), _so73);
                _scr73.func_96647_c(5);
            }
        } else if (entityPlayer.getEntityData().func_74779_i("XiaoJingJie").equals("无极")) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc74 = entityPlayer.func_96123_co();
                ScoreObjective _so74 = _sc74.func_96518_b("小境界");
                if (_so74 == null) {
                    _so74 = _sc74.func_96535_a("小境界", ScoreCriteria.field_96641_b);
                }
                Score _scr74 = _sc74.func_96529_a(entityPlayer.func_146103_bH().getName(), _so74);
                _scr74.func_96647_c(6);
            }
        } else if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc75 = entityPlayer.func_96123_co();
            ScoreObjective _so75 = _sc75.func_96518_b("小境界");
            if (_so75 == null) {
                _so75 = _sc75.func_96535_a("小境界", ScoreCriteria.field_96641_b);
            }
            Score _scr75 = _sc75.func_96529_a(entityPlayer.func_146103_bH().getName(), _so75);
            _scr75.func_96647_c(0);
        }
        entityPlayer.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
        for (int index0 = 0; index0 < 30; index0++) {
            entityPlayer.getEntityData().func_74780_a("功法顺序暂存", entityPlayer.getEntityData().func_74769_h("功法顺序暂存") + 1.0d);
            entityPlayer.getEntityData().func_74778_a("功法名暂存", "GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("功法顺序暂存")));
            entityPlayer.getEntityData().func_74778_a("功法熟练度名暂存", "GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("功法顺序暂存")) + "Num");
            entityPlayer.getEntityData().func_74778_a("酿酒名暂存", "NiangJiu" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("功法顺序暂存")));
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc76 = entityPlayer.func_96123_co();
                ScoreObjective _so76 = _sc76.func_96518_b(entityPlayer.getEntityData().func_74779_i("功法名暂存"));
                if (_so76 == null) {
                    _so76 = _sc76.func_96535_a(entityPlayer.getEntityData().func_74779_i("功法名暂存"), ScoreCriteria.field_96641_b);
                }
                Score _scr76 = _sc76.func_96529_a(entityPlayer.func_146103_bH().getName(), _so76);
                _scr76.func_96647_c((int) entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("功法名暂存")));
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc77 = entityPlayer.func_96123_co();
                ScoreObjective _so77 = _sc77.func_96518_b(entityPlayer.getEntityData().func_74779_i("功法熟练度名暂存"));
                if (_so77 == null) {
                    _so77 = _sc77.func_96535_a(entityPlayer.getEntityData().func_74779_i("功法熟练度名暂存"), ScoreCriteria.field_96641_b);
                }
                Score _scr77 = _sc77.func_96529_a(entityPlayer.func_146103_bH().getName(), _so77);
                _scr77.func_96647_c((int) entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("功法熟练度名暂存")));
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc78 = entityPlayer.func_96123_co();
                ScoreObjective _so78 = _sc78.func_96518_b(entityPlayer.getEntityData().func_74779_i("酿酒名暂存"));
                if (_so78 == null) {
                    _so78 = _sc78.func_96535_a(entityPlayer.getEntityData().func_74779_i("酿酒名暂存"), ScoreCriteria.field_96641_b);
                }
                Score _scr78 = _sc78.func_96529_a(entityPlayer.func_146103_bH().getName(), _so78);
                _scr78.func_96647_c((int) entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("酿酒名暂存")));
            }
        }
        entityPlayer.getEntityData().func_74780_a("无极培元buff顺序", 0.0d);
        for (int index1 = 0; index1 < 13; index1++) {
            entityPlayer.getEntityData().func_74780_a("无极培元buff顺序", entityPlayer.getEntityData().func_74769_h("无极培元buff顺序") + 1.0d);
            entityPlayer.getEntityData().func_74778_a("无极培元buff", "BuffAdd" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("无极培元buff顺序")));
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc79 = entityPlayer.func_96123_co();
                ScoreObjective _so79 = _sc79.func_96518_b(entityPlayer.getEntityData().func_74779_i("无极培元buff"));
                if (_so79 == null) {
                    _so79 = _sc79.func_96535_a(entityPlayer.getEntityData().func_74779_i("无极培元buff"), ScoreCriteria.field_96641_b);
                }
                Score _scr79 = _sc79.func_96529_a(entityPlayer.func_146103_bH().getName(), _so79);
                _scr79.func_96647_c((int) entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("无极培元buff")));
            }
        }
        entityPlayer.getEntityData().func_74780_a("无极培元buff顺序", 0.0d);
        entityPlayer.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc80 = entityPlayer.func_96123_co();
            ScoreObjective _so80 = _sc80.func_96518_b("GongFa3000");
            if (_so80 == null) {
                _so80 = _sc80.func_96535_a("GongFa3000", ScoreCriteria.field_96641_b);
            }
            Score _scr80 = _sc80.func_96529_a(entityPlayer.func_146103_bH().getName(), _so80);
            _scr80.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("GongFa3000"));
        }
        $_dependencies.put("entity", entityPlayer);
        ProcedureGongFaXianShiBaoCun.executeProcedure($_dependencies);
    }
}
