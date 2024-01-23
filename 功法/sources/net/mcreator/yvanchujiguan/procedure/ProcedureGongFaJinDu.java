package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
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
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaJinDu.class */
public class ProcedureGongFaJinDu extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaJinDu(ElementsYvanchujiguanMod instance) {
        super(instance, 77);
    }

    /* JADX WARN: Type inference failed for: r0v271, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$26] */
    /* JADX WARN: Type inference failed for: r0v279, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$27] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$3] */
    /* JADX WARN: Type inference failed for: r2v106, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$8] */
    /* JADX WARN: Type inference failed for: r2v129, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$25] */
    /* JADX WARN: Type inference failed for: r2v132, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$24] */
    /* JADX WARN: Type inference failed for: r2v135, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$23] */
    /* JADX WARN: Type inference failed for: r2v138, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$22] */
    /* JADX WARN: Type inference failed for: r2v151, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$21] */
    /* JADX WARN: Type inference failed for: r2v172, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$7] */
    /* JADX WARN: Type inference failed for: r2v175, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$6] */
    /* JADX WARN: Type inference failed for: r2v188, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$5] */
    /* JADX WARN: Type inference failed for: r2v206, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$4] */
    /* JADX WARN: Type inference failed for: r2v60, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$20] */
    /* JADX WARN: Type inference failed for: r2v63, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$19] */
    /* JADX WARN: Type inference failed for: r2v66, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$18] */
    /* JADX WARN: Type inference failed for: r2v69, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$17] */
    /* JADX WARN: Type inference failed for: r2v72, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$16] */
    /* JADX WARN: Type inference failed for: r2v75, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$15] */
    /* JADX WARN: Type inference failed for: r2v78, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$14] */
    /* JADX WARN: Type inference failed for: r2v81, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$13] */
    /* JADX WARN: Type inference failed for: r2v84, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$12] */
    /* JADX WARN: Type inference failed for: r2v87, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$11] */
    /* JADX WARN: Type inference failed for: r2v90, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$10] */
    /* JADX WARN: Type inference failed for: r2v93, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("已重伤") > 0 && entityPlayer.getEntityData().func_74769_h("JingJieNum") <= 0.0d && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("已重伤");
            if (_so == null) {
                _so = _sc.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(0);
        }
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.2
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaReduce") == 1) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率") - 0.8d);
        }
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.3
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore("gongfabeilv") != 0) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.4
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("gongfabeilv") * 0.01d);
        }
        if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 1.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 12.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 21.0d) && entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if (entityPlayer.getEntityData().func_74769_h("体质位置") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 2.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 6.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 13.0d) && entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 3.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 8.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 14.0d) && entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 5.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 5.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 4.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 15.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 31.0d) && entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 6.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 6.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 5.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 23.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 16.0d) && entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 7.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 7.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 4.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 15.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 31.0d) && entityPlayer.getEntityData().func_74769_h("体质位置") == 8.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.9d);
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 8.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.9d);
        } else if (entityPlayer.getEntityData().func_74767_n("JinLingGen") && entityPlayer.getEntityData().func_74767_n("MuLingGen") && entityPlayer.getEntityData().func_74767_n("ShuiLingGen") && entityPlayer.getEntityData().func_74767_n("HuoLingGen") && entityPlayer.getEntityData().func_74767_n("TuLingGen") && entityPlayer.getEntityData().func_74769_h("GongFa") == 28.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.85d);
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 1.0d);
        } else {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 1.0d);
        }
        entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率") - entityPlayer.getEntityData().func_74769_h("WuXingBianLiang"));
        if (entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率") < 0.01d) {
            entityPlayer.getEntityData().func_74780_a("单层进度最大值倍率", 0.01d);
        }
        if (entityPlayer.getEntityData().func_74769_h("GongFa") <= 5.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.5
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(1200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.6
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(1200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.7
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(1200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            }
            entityPlayer.getEntityData().func_74778_a("功法层数显示", new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa")))));
            entityPlayer.getEntityData().func_74778_a("功法层数进度显示", new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("功法熟练度")) / entityPlayer.getEntityData().func_74769_h("单层进度最大值")) * 100.0d));
            if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) >= 4.0d) {
                entityPlayer.getEntityData().func_74778_a("功法层数显示", "圆满");
                entityPlayer.getEntityData().func_74778_a("功法层数进度显示", "100");
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa") == 6.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 8.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 31.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 21.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 23.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 24.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 29.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 28.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 30.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.8
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(1200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.9
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(1200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.10
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(1200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 4.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.11
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(2400.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 5.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.12
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(2400.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 6.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.13
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(2400.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 7.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.14
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(4800.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 8.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.15
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(4800.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 9.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.16
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(4800.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 10.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.17
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(9600.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 11.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.18
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(9600.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 12.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.19
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(9600.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 13.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.20
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(19200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            }
            entityPlayer.getEntityData().func_74778_a("功法层数显示", new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa")))));
            entityPlayer.getEntityData().func_74778_a("功法层数进度显示", new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("功法熟练度")) / entityPlayer.getEntityData().func_74769_h("单层进度最大值")) * 100.0d));
            if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) >= 14.0d) {
                entityPlayer.getEntityData().func_74778_a("功法层数显示", "圆满");
                entityPlayer.getEntityData().func_74778_a("功法层数进度显示", "100");
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa") == 32.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 7.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 9.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 11.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 10.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 12.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 13.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 14.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 25.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 26.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 15.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 16.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 18.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 19.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 20.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 33.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 22.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 17.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.21
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(1200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.22
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(2400.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.23
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(4800.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 4.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.24
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(9600.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) == 5.0d) {
                entityPlayer.getEntityData().func_74780_a("单层进度最大值", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.25
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(19200.0d * entityPlayer.getEntityData().func_74769_h("单层进度最大值倍率"))));
            }
            entityPlayer.getEntityData().func_74778_a("功法层数显示", new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa")))));
            entityPlayer.getEntityData().func_74778_a("功法层数进度显示", new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("功法熟练度")) / entityPlayer.getEntityData().func_74769_h("单层进度最大值")) * 100.0d));
            if (entityPlayer.getEntityData().func_74769_h("GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa"))) >= 6.0d) {
                entityPlayer.getEntityData().func_74778_a("功法层数显示", "圆满");
                entityPlayer.getEntityData().func_74778_a("功法层数进度显示", "100");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.26
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(entityPlayer.getEntityData().func_74779_i("功法层数进度显示")) >= 100) {
            entityPlayer.getEntityData().func_74778_a("功法层数进度显示", "100");
            if (entityPlayer.getEntityData().func_74779_i("功法层数进度显示").equals("100") && new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFaJinDu.27
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("已重伤") > 0 && entityPlayer.getEntityData().func_74769_h("功法进阶缓却") == 0.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("当前过于虚弱，无法承受功法进阶"), false);
                }
                entityPlayer.getEntityData().func_74780_a("功法进阶缓却", 200.0d);
            }
        }
    }
}
