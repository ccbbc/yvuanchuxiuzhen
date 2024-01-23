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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureAttributeBack2.class */
public class ProcedureAttributeBack2 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureAttributeBack2(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 298);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$8] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$9] */
    /* JADX WARN: Type inference failed for: r0v105, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$10] */
    /* JADX WARN: Type inference failed for: r0v107, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$11] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$12] */
    /* JADX WARN: Type inference failed for: r0v146, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$3] */
    /* JADX WARN: Type inference failed for: r0v292, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$6] */
    /* JADX WARN: Type inference failed for: r0v99, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$7] */
    /* JADX WARN: Type inference failed for: r3v110, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$4] */
    /* JADX WARN: Type inference failed for: r3v21, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$1] */
    /* JADX WARN: Type inference failed for: r4v14, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$2] */
    /* JADX WARN: Type inference failed for: r4v36, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 1.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "三阳之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 2.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "龙吟之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 3.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "锻金之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 4.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "木灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 5.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "水灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 6.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "火灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 7.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "土灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 8.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "炎灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 9.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "五行之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 10.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "元磁之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 11.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "天妒之体");
        } else {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "平庸之体");
        }
        entityPlayer.getEntityData().func_74778_a("境界名暂时存储", "炼气筑基结丹元婴化神炼虚合体大乘真仙金仙道祖");
        entityPlayer.getEntityData().func_74778_a("数字暂时存储", "一二三四五六七八九");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 0.0d) {
            entityPlayer.getEntityData().func_74778_a("JingJie", "凡人");
        } else {
            entityPlayer.getEntityData().func_74778_a("JingJie", entityPlayer.getEntityData().func_74779_i("境界名暂时存储").substring((int) ((entityPlayer.getEntityData().func_74769_h("JingJieNum") * 2.0d) - 2.0d), (int) (entityPlayer.getEntityData().func_74769_h("JingJieNum") * 2.0d)));
        }
        entityPlayer.getEntityData().func_74778_a("LayerNumTemp", new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("LayerNum")));
        entityPlayer.getEntityData().func_74778_a("LayerNumTemp1", "");
        entityPlayer.getEntityData().func_74778_a("LayerNumTemp2", "");
        entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", "");
        entityPlayer.getEntityData().func_74778_a("数字暂存", "一二三四五六七八九");
        entityPlayer.getEntityData().func_74780_a("文本顺序", 0.0d);
        entityPlayer.getEntityData().func_74780_a("层数文本长度", entityPlayer.getEntityData().func_74779_i("LayerNumTemp").length());
        for (int index0 = 0; index0 < entityPlayer.getEntityData().func_74779_i("LayerNumTemp").length(); index0++) {
            entityPlayer.getEntityData().func_74780_a("文本顺序", entityPlayer.getEntityData().func_74769_h("文本顺序") + 1.0d);
            entityPlayer.getEntityData().func_74778_a("LayerNumTemp1", entityPlayer.getEntityData().func_74779_i("LayerNumTemp").substring(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.1
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("文本顺序") - 1.0d)), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.2
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("文本顺序")))));
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.3
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(entityPlayer.getEntityData().func_74779_i("LayerNumTemp1")) != 0) {
                entityPlayer.getEntityData().func_74778_a("LayerNumTemp2", entityPlayer.getEntityData().func_74779_i("数字暂存").substring(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.4
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(entityPlayer.getEntityData().func_74779_i("LayerNumTemp1")) - 1, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.5
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(entityPlayer.getEntityData().func_74779_i("LayerNumTemp1"))));
            }
            if (entityPlayer.getEntityData().func_74769_h("文本顺序") <= entityPlayer.getEntityData().func_74769_h("层数文本长度") - 1.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.6
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(entityPlayer.getEntityData().func_74779_i("LayerNumTemp1")) == 0) {
                entityPlayer.getEntityData().func_74778_a("LayerNumTemp2", "零");
            }
            entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "" + entityPlayer.getEntityData().func_74779_i("LayerNumTemp2"));
            if (entityPlayer.getEntityData().func_74769_h("层数文本长度") == 2.0d) {
                if (entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").substring(0, 1).equals("一")) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", "十");
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                }
            } else if (entityPlayer.getEntityData().func_74769_h("层数文本长度") == 3.0d) {
                if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 2.0d) {
                    if (!entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").substring(2, 3).equals("零")) {
                        entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 3.0d && entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").substring(2, 3).equals("零") && entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").length() == 3) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", "一百");
                }
            } else if (entityPlayer.getEntityData().func_74769_h("层数文本长度") == 4.0d) {
                if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "千");
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 2.0d) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                    if (!entityPlayer.getEntityData().func_74779_i("层数名暂存2").substring(2, 3).equals("零")) {
                        entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 3.0d && !entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").substring(4, 5).equals("零")) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                }
            } else if (entityPlayer.getEntityData().func_74769_h("层数文本长度") == 5.0d) {
                if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "万");
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 2.0d) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "千");
                    if (!entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").substring(2, 3).equals("零")) {
                        entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 3.0d) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                    if (!entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").substring(4, 5).equals("零")) {
                        entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("文本顺序") == 4.0d && !entityPlayer.getEntityData().func_74779_i("LayerNumTemp3").substring(6, 7).equals("零")) {
                    entityPlayer.getEntityData().func_74778_a("LayerNumTemp3", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                }
            }
            entityPlayer.getEntityData().func_74778_a("LayerNumTemp1", "");
            entityPlayer.getEntityData().func_74778_a("LayerNumTemp2", "");
        }
        entityPlayer.getEntityData().func_74778_a("Layer", entityPlayer.getEntityData().func_74779_i("LayerNumTemp3") + "层");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.7
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("小境界") == 1) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "初期");
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.8
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("小境界") == 2) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "中期");
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.9
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("小境界") == 3) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "后期");
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.10
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("小境界") == 4) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "圆满");
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.11
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("小境界") == 5) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "无上");
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack2.12
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("小境界") == 6) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "无极");
        } else {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "凡体");
        }
        entityPlayer.getEntityData().func_74757_a("TuPoLimit", false);
        entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("死亡");
            if (_so == null) {
                _so = _sc.func_96535_a("死亡", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(0);
        }
    }
}
