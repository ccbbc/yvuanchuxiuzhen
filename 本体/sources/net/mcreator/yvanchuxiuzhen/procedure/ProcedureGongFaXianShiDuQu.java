package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureGongFaXianShiDuQu.class */
public class ProcedureGongFaXianShiDuQu extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaXianShiDuQu(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 353);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$37] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$39] */
    /* JADX WARN: Type inference failed for: r0v105, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$41] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$42] */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$7] */
    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$43] */
    /* JADX WARN: Type inference failed for: r0v115, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$45] */
    /* JADX WARN: Type inference failed for: r0v119, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$46] */
    /* JADX WARN: Type inference failed for: r0v123, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$47] */
    /* JADX WARN: Type inference failed for: r0v125, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$49] */
    /* JADX WARN: Type inference failed for: r0v127, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$51] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$9] */
    /* JADX WARN: Type inference failed for: r0v131, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$52] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$53] */
    /* JADX WARN: Type inference failed for: r0v137, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$55] */
    /* JADX WARN: Type inference failed for: r0v141, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$56] */
    /* JADX WARN: Type inference failed for: r0v145, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$57] */
    /* JADX WARN: Type inference failed for: r0v147, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$59] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$11] */
    /* JADX WARN: Type inference failed for: r0v151, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$60] */
    /* JADX WARN: Type inference failed for: r0v157, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$58] */
    /* JADX WARN: Type inference failed for: r0v163, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$54] */
    /* JADX WARN: Type inference failed for: r0v169, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$50] */
    /* JADX WARN: Type inference failed for: r0v175, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$48] */
    /* JADX WARN: Type inference failed for: r0v181, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$44] */
    /* JADX WARN: Type inference failed for: r0v187, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$40] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$12] */
    /* JADX WARN: Type inference failed for: r0v193, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$38] */
    /* JADX WARN: Type inference failed for: r0v199, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$26] */
    /* JADX WARN: Type inference failed for: r0v205, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$24] */
    /* JADX WARN: Type inference failed for: r0v211, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$22] */
    /* JADX WARN: Type inference failed for: r0v217, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$20] */
    /* JADX WARN: Type inference failed for: r0v223, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$18] */
    /* JADX WARN: Type inference failed for: r0v229, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$16] */
    /* JADX WARN: Type inference failed for: r0v235, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$14] */
    /* JADX WARN: Type inference failed for: r0v241, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$2] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$10] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$8] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$6] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$4] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$13] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$15] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$1] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$17] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$19] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$21] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$23] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$25] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$27] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$29] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$31] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$33] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$35] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$3] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$36] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$34] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$32] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$5] */
    /* JADX WARN: Type inference failed for: r0v91, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$30] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu$28] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow1") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow1", "长春功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.2
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 1) {
                entity.getEntityData().func_74778_a("GongFaShow", "长春功");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.3
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow1") == 2) {
            entity.getEntityData().func_74778_a("GongFaShow1", "金刚功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.4
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 2) {
                entity.getEntityData().func_74778_a("GongFaShow", "金刚功");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.5
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow1") == 3) {
            entity.getEntityData().func_74778_a("GongFaShow1", "上善诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.6
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 3) {
                entity.getEntityData().func_74778_a("GongFaShow", "上善诀");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.7
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow1") == 4) {
            entity.getEntityData().func_74778_a("GongFaShow1", "烈火诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.8
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 4) {
                entity.getEntityData().func_74778_a("GongFaShow", "烈火诀");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.9
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow1") == 5) {
            entity.getEntityData().func_74778_a("GongFaShow1", "地蕴功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.10
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 5) {
                entity.getEntityData().func_74778_a("GongFaShow", "地蕴功");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.11
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow1") == 6) {
            entity.getEntityData().func_74778_a("GongFaShow1", "悟灵诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.12
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 6) {
                entity.getEntityData().func_74778_a("GongFaShow", "悟灵诀");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.13
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow2") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow2", "青元剑诀上部");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.14
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 7) {
                entity.getEntityData().func_74778_a("GongFaShow", "青元剑诀上部");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.15
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow3") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow3", "三转重元功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.16
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 8) {
                entity.getEntityData().func_74778_a("GongFaShow", "三转重元功");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.17
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow4") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow4", "逆情断天大法");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.18
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 9) {
                entity.getEntityData().func_74778_a("GongFaShow", "逆情断天大法");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.19
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow5") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow5", "玄阴大法");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.20
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 10) {
                entity.getEntityData().func_74778_a("GongFaShow", "玄阴大法");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.21
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow6") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow6", "玉丹功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.22
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 11) {
                entity.getEntityData().func_74778_a("GongFaShow", "玉丹功");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.23
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow7") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow7", "六极真魔功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.24
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 12) {
                entity.getEntityData().func_74778_a("GongFaShow", "六极真魔功");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.25
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow8") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow8", "万象森林");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.26
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 13) {
                entity.getEntityData().func_74778_a("GongFaShow", "万象森林");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.27
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow8") == 2) {
            entity.getEntityData().func_74778_a("GongFaShow8", "金真功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.28
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 14) {
                entity.getEntityData().func_74778_a("GongFaShow", "金真功");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.29
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow8") == 3) {
            entity.getEntityData().func_74778_a("GongFaShow8", "玄冰诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.30
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 15) {
                entity.getEntityData().func_74778_a("GongFaShow", "玄冰诀");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.31
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow8") == 4) {
            entity.getEntityData().func_74778_a("GongFaShow8", "焚火诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.32
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 16) {
                entity.getEntityData().func_74778_a("GongFaShow", "焚火诀");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.33
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow8") == 5) {
            entity.getEntityData().func_74778_a("GongFaShow8", "灵暝诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.34
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 17) {
                entity.getEntityData().func_74778_a("GongFaShow", "灵暝诀");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.35
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow8") == 6) {
            entity.getEntityData().func_74778_a("GongFaShow8", "元磁神光");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.36
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 18) {
                entity.getEntityData().func_74778_a("GongFaShow", "元磁神光");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.37
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow9") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow9", "玄天炼火诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.38
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 19) {
                entity.getEntityData().func_74778_a("GongFaShow", "玄天炼火诀");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.39
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow10") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow10", "辟邪电光");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.40
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 20) {
                entity.getEntityData().func_74778_a("GongFaShow", "辟邪电光");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.41
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow10") == 2) {
            entity.getEntityData().func_74778_a("GongFaShow10", "五毒神功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.42
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 21) {
                entity.getEntityData().func_74778_a("GongFaShow", "五毒神功");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.43
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow11") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow11", "紫罗玄功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.44
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 22) {
                entity.getEntityData().func_74778_a("GongFaShow", "紫罗玄功");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.45
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow11") == 2) {
            entity.getEntityData().func_74778_a("GongFaShow11", "天刹真魔功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.46
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 23) {
                entity.getEntityData().func_74778_a("GongFaShow", "天刹真魔功");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.47
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow12") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow12", "金刚经");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.48
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 24) {
                entity.getEntityData().func_74778_a("GongFaShow", "金刚经");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.49
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow13") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow13", "浩然正气诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.50
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 25) {
                entity.getEntityData().func_74778_a("GongFaShow", "浩然正气诀");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.51
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow13") == 2) {
            entity.getEntityData().func_74778_a("GongFaShow13", "上古魔功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.52
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 26) {
                entity.getEntityData().func_74778_a("GongFaShow", "上古魔功");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.53
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow14") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow14", "太白剑诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.54
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 27) {
                entity.getEntityData().func_74778_a("GongFaShow", "太白剑诀");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.55
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow14") == 2) {
            entity.getEntityData().func_74778_a("GongFaShow14", "血车真诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.56
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 28) {
                entity.getEntityData().func_74778_a("GongFaShow", "血车真诀");
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.57
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow15") == 1) {
            entity.getEntityData().func_74778_a("GongFaShow15", "阴阳合欢功");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.58
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 29) {
                entity.getEntityData().func_74778_a("GongFaShow", "阴阳合欢功");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.59
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaShow15") == 2) {
            entity.getEntityData().func_74778_a("GongFaShow15", "双剑九龙诀");
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGongFaXianShiDuQu.60
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("GongFa") == 30) {
                entity.getEntityData().func_74778_a("GongFaShow", "双剑九龙诀");
            }
        }
    }
}
