package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureTreasureCollection2.class */
public class ProcedureTreasureCollection2 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureTreasureCollection2(ElementsYvanchuliandanMod instance) {
        super(instance, 912);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$1] */
    /* JADX WARN: Type inference failed for: r1v22, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$20] */
    /* JADX WARN: Type inference failed for: r1v30, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$19] */
    /* JADX WARN: Type inference failed for: r1v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$18] */
    /* JADX WARN: Type inference failed for: r1v46, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$17] */
    /* JADX WARN: Type inference failed for: r1v54, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$16] */
    /* JADX WARN: Type inference failed for: r1v62, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$15] */
    /* JADX WARN: Type inference failed for: r1v87, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$14] */
    /* JADX WARN: Type inference failed for: r2v1, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$2] */
    /* JADX WARN: Type inference failed for: r2v13, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$8] */
    /* JADX WARN: Type inference failed for: r2v17, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$10] */
    /* JADX WARN: Type inference failed for: r2v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$12] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$4] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$6] */
    /* JADX WARN: Type inference failed for: r4v1, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$3] */
    /* JADX WARN: Type inference failed for: r4v11, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$7] */
    /* JADX WARN: Type inference failed for: r4v16, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$9] */
    /* JADX WARN: Type inference failed for: r4v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$11] */
    /* JADX WARN: Type inference failed for: r4v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$13] */
    /* JADX WARN: Type inference failed for: r4v6, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureTwo") == 0) {
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("TreasureNum11");
                if (_so == null) {
                    _so = _sc.func_96535_a("TreasureNum11", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                _scr.func_96647_c((int) (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc2 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("TreasureNum12");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("TreasureNum12", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so2);
                _scr2.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("Attack"));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc3 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("TreasureNum13");
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("TreasureNum13", ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so3);
                _scr3.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("MagicAttack"));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc4 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so4 = _sc4.func_96518_b("TreasureNum14");
                if (_so4 == null) {
                    _so4 = _sc4.func_96535_a("TreasureNum14", ScoreCriteria.field_96641_b);
                }
                Score _scr4 = _sc4.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so4);
                _scr4.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("FireAttack"));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc5 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so5 = _sc5.func_96518_b("TreasureNum15");
                if (_so5 == null) {
                    _so5 = _sc5.func_96535_a("TreasureNum15", ScoreCriteria.field_96641_b);
                }
                Score _scr5 = _sc5.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so5);
                _scr5.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("ThunderAttack"));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc6 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so6 = _sc6.func_96518_b("TreasureNum16");
                if (_so6 == null) {
                    _so6 = _sc6.func_96535_a("TreasureNum16", ScoreCriteria.field_96641_b);
                }
                Score _scr6 = _sc6.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so6);
                _scr6.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("PoisonAttack"));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc7 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so7 = _sc7.func_96518_b("TreasureNum17");
                if (_so7 == null) {
                    _so7 = _sc7.func_96535_a("TreasureNum17", ScoreCriteria.field_96641_b);
                }
                Score _scr7 = _sc7.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so7);
                _scr7.func_96647_c(0);
            }
        }
        entityLivingBase.getEntityData().func_74780_a("HealthMax", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.2
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum11") * (1.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.3
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum1") * 0.01d)));
        entityLivingBase.getEntityData().func_74780_a("Attack", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.4
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum12") * (1.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.5
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum2") * 0.01d)));
        entityLivingBase.getEntityData().func_74780_a("MagicAttack", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.6
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum13") * (1.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.7
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum3") * 0.01d)));
        entityLivingBase.getEntityData().func_74780_a("FireAttack", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.8
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum14") * (1.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.9
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum4") * 0.01d)));
        entityLivingBase.getEntityData().func_74780_a("ThunderAttack", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.10
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum15") * (1.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.11
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum5") * 0.01d)));
        entityLivingBase.getEntityData().func_74780_a("PoisonAttack", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.12
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum16") * (1.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.13
            public int getScore(String score) {
                Scoreboard _sc8;
                ScoreObjective _so8;
                if ((entityLivingBase instanceof EntityPlayer) && (_so8 = (_sc8 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr8 = _sc8.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so8);
                    return _scr8.func_96652_c();
                }
                return 0;
            }
        }.getScore("TreasureNum6") * 0.01d)));
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc8 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so8 = _sc8.func_96518_b("TreasureNum21");
            if (_so8 == null) {
                _so8 = _sc8.func_96535_a("TreasureNum21", ScoreCriteria.field_96641_b);
            }
            Score _scr8 = _sc8.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so8);
            _scr8.func_96647_c((int) (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc9 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so9 = _sc9.func_96518_b("TreasureNum22");
            if (_so9 == null) {
                _so9 = _sc9.func_96535_a("TreasureNum22", ScoreCriteria.field_96641_b);
            }
            Score _scr9 = _sc9.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so9);
            _scr9.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("Attack"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc10 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so10 = _sc10.func_96518_b("TreasureNum23");
            if (_so10 == null) {
                _so10 = _sc10.func_96535_a("TreasureNum23", ScoreCriteria.field_96641_b);
            }
            Score _scr10 = _sc10.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so10);
            _scr10.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("MagicAttack"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc11 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so11 = _sc11.func_96518_b("TreasureNum24");
            if (_so11 == null) {
                _so11 = _sc11.func_96535_a("TreasureNum24", ScoreCriteria.field_96641_b);
            }
            Score _scr11 = _sc11.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so11);
            _scr11.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("FireAttack"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc12 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so12 = _sc12.func_96518_b("TreasureNum25");
            if (_so12 == null) {
                _so12 = _sc12.func_96535_a("TreasureNum25", ScoreCriteria.field_96641_b);
            }
            Score _scr12 = _sc12.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so12);
            _scr12.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("ThunderAttack"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc13 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so13 = _sc13.func_96518_b("TreasureNum26");
            if (_so13 == null) {
                _so13 = _sc13.func_96535_a("TreasureNum26", ScoreCriteria.field_96641_b);
            }
            Score _scr13 = _sc13.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so13);
            _scr13.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("PoisonAttack"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc14 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so14 = _sc14.func_96518_b("TreasureNum27");
            if (_so14 == null) {
                _so14 = _sc14.func_96535_a("TreasureNum27", ScoreCriteria.field_96641_b);
            }
            Score _scr14 = _sc14.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so14);
            _scr14.func_96647_c(0);
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc15 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so15 = _sc15.func_96518_b("TreasureTwo");
            if (_so15 == null) {
                _so15 = _sc15.func_96535_a("TreasureTwo", ScoreCriteria.field_96641_b);
            }
            Score _scr15 = _sc15.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so15);
            _scr15.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.14
                public int getScore(String score) {
                    Scoreboard _sc16;
                    ScoreObjective _so16;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so16 = (_sc16 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr16 = _sc16.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so16);
                        return _scr16.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("TreasureOne"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc16 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so16 = _sc16.func_96518_b("SectNumTwo");
            if (_so16 == null) {
                _so16 = _sc16.func_96535_a("SectNumTwo", ScoreCriteria.field_96641_b);
            }
            Score _scr16 = _sc16.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so16);
            _scr16.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("SectNumOne"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc17 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so17 = _sc17.func_96518_b("GainOn");
            if (_so17 == null) {
                _so17 = _sc17.func_96535_a("GainOn", ScoreCriteria.field_96641_b);
            }
            Score _scr17 = _sc17.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so17);
            _scr17.func_96647_c(1);
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc18 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so18 = _sc18.func_96518_b("TreasureNum31");
            if (_so18 == null) {
                _so18 = _sc18.func_96535_a("TreasureNum31", ScoreCriteria.field_96641_b);
            }
            Score _scr18 = _sc18.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so18);
            _scr18.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.15
                public int getScore(String score) {
                    Scoreboard _sc19;
                    ScoreObjective _so19;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so19 = (_sc19 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr19 = _sc19.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so19);
                        return _scr19.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("TreasureNum1"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc19 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so19 = _sc19.func_96518_b("TreasureNum32");
            if (_so19 == null) {
                _so19 = _sc19.func_96535_a("TreasureNum32", ScoreCriteria.field_96641_b);
            }
            Score _scr19 = _sc19.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so19);
            _scr19.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.16
                public int getScore(String score) {
                    Scoreboard _sc20;
                    ScoreObjective _so20;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so20 = (_sc20 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr20 = _sc20.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so20);
                        return _scr20.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("TreasureNum2"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc20 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so20 = _sc20.func_96518_b("TreasureNum33");
            if (_so20 == null) {
                _so20 = _sc20.func_96535_a("TreasureNum33", ScoreCriteria.field_96641_b);
            }
            Score _scr20 = _sc20.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so20);
            _scr20.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.17
                public int getScore(String score) {
                    Scoreboard _sc21;
                    ScoreObjective _so21;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so21 = (_sc21 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr21 = _sc21.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so21);
                        return _scr21.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("TreasureNum3"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc21 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so21 = _sc21.func_96518_b("TreasureNum34");
            if (_so21 == null) {
                _so21 = _sc21.func_96535_a("TreasureNum34", ScoreCriteria.field_96641_b);
            }
            Score _scr21 = _sc21.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so21);
            _scr21.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.18
                public int getScore(String score) {
                    Scoreboard _sc22;
                    ScoreObjective _so22;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so22 = (_sc22 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr22 = _sc22.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so22);
                        return _scr22.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("TreasureNum4"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc22 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so22 = _sc22.func_96518_b("TreasureNum35");
            if (_so22 == null) {
                _so22 = _sc22.func_96535_a("TreasureNum35", ScoreCriteria.field_96641_b);
            }
            Score _scr22 = _sc22.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so22);
            _scr22.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.19
                public int getScore(String score) {
                    Scoreboard _sc23;
                    ScoreObjective _so23;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so23 = (_sc23 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr23 = _sc23.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so23);
                        return _scr23.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("TreasureNum5"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc23 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so23 = _sc23.func_96518_b("TreasureNum36");
            if (_so23 == null) {
                _so23 = _sc23.func_96535_a("TreasureNum36", ScoreCriteria.field_96641_b);
            }
            Score _scr23 = _sc23.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so23);
            _scr23.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTreasureCollection2.20
                public int getScore(String score) {
                    Scoreboard _sc24;
                    ScoreObjective _so24;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so24 = (_sc24 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr24 = _sc24.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so24);
                        return _scr24.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("TreasureNum6"));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc24 = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so24 = _sc24.func_96518_b("TreasureNum37");
            if (_so24 == null) {
                _so24 = _sc24.func_96535_a("TreasureNum37", ScoreCriteria.field_96641_b);
            }
            Score _scr24 = _sc24.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so24);
            _scr24.func_96647_c(0);
        }
    }
}
