package net.mcreator.yvanchuyaoshou.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSumReset.class */
public class ProcedureShiTiSumReset extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSumReset(ElementsYvanchuyaoshouMod instance) {
        super(instance, 341);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$4] */
    /* JADX WARN: Type inference failed for: r2v32, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$9] */
    /* JADX WARN: Type inference failed for: r2v35, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$6] */
    /* JADX WARN: Type inference failed for: r2v38, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$8] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$10] */
    /* JADX WARN: Type inference failed for: r6v0, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$3] */
    /* JADX WARN: Type inference failed for: r6v23, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$5] */
    /* JADX WARN: Type inference failed for: r6v26, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$1] */
    /* JADX WARN: Type inference failed for: r6v3, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset$7] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        World world = (World) dependencies.get("world");
        entity.getEntityData().func_74780_a("生成坐标X", 0.0d);
        entity.getEntityData().func_74780_a("生成坐标Y", 0.0d);
        entity.getEntityData().func_74780_a("生成坐标Z", 0.0d);
        if (Math.random() <= 0.5d) {
            entity.getEntityData().func_74780_a("生成坐标X", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.2
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entity.field_70165_t + (22 - new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SumLimit4")) + (Math.random() * 10.0d))));
        } else {
            entity.getEntityData().func_74780_a("生成坐标X", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.4
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format((entity.field_70165_t - (22 - new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.3
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SumLimit4"))) - (Math.random() * 10.0d))));
        }
        if (Math.random() <= 0.5d) {
            entity.getEntityData().func_74780_a("生成坐标Z", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.6
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entity.field_70161_v + (22 - new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.5
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SumLimit4")) + (Math.random() * 10.0d))));
        } else {
            entity.getEntityData().func_74780_a("生成坐标Z", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.8
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format((entity.field_70161_v - (22 - new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.7
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SumLimit4"))) - (Math.random() * 10.0d))));
        }
        if (Math.random() <= 0.7d) {
            entity.getEntityData().func_74780_a("生成坐标Y", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.9
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entity.field_70163_u + (Math.random() * 10.0d))));
        } else {
            entity.getEntityData().func_74780_a("生成坐标Y", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSumReset.10
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entity.field_70163_u - (Math.random() * 10.0d))));
        }
        if (entity.getEntityData().func_74769_h("生成坐标Y") <= 160.0d) {
            for (int index0 = 0; index0 < 160 && world.func_175623_d(new BlockPos((int) entity.getEntityData().func_74769_h("生成坐标X"), (int) (entity.getEntityData().func_74769_h("生成坐标Y") - 2.0d), (int) entity.getEntityData().func_74769_h("生成坐标Z"))); index0++) {
                entity.getEntityData().func_74780_a("生成坐标Y", entity.getEntityData().func_74769_h("生成坐标Y") - 1.0d);
            }
            if (world.func_175678_i(new BlockPos((int) entity.getEntityData().func_74769_h("生成坐标X"), (int) entity.getEntityData().func_74769_h("生成坐标Y"), (int) entity.getEntityData().func_74769_h("生成坐标Z")))) {
                entity.getEntityData().func_74757_a("实体生成处露天", true);
            }
            if (world.func_175671_l(new BlockPos((int) entity.getEntityData().func_74769_h("生成坐标X"), (int) entity.getEntityData().func_74769_h("生成坐标Y"), (int) entity.getEntityData().func_74769_h("生成坐标Z"))) <= 5) {
                entity.getEntityData().func_74757_a("实体生成处黑暗", true);
            }
            entity.getEntityData().func_74780_a("生成空气检测", 0.0d);
            for (int index1 = 0; index1 < 2; index1++) {
                if (world.func_175623_d(new BlockPos((int) entity.getEntityData().func_74769_h("生成坐标X"), (int) (entity.getEntityData().func_74769_h("生成坐标Y") + entity.getEntityData().func_74769_h("生成空气检测")), (int) entity.getEntityData().func_74769_h("生成坐标Z"))) && world.func_175623_d(new BlockPos((int) (entity.getEntityData().func_74769_h("生成坐标X") + 1.0d), (int) (entity.getEntityData().func_74769_h("生成坐标Y") + entity.getEntityData().func_74769_h("生成空气检测")), (int) entity.getEntityData().func_74769_h("生成坐标Z"))) && world.func_175623_d(new BlockPos((int) (entity.getEntityData().func_74769_h("生成坐标X") - 1.0d), (int) (entity.getEntityData().func_74769_h("生成坐标Y") + entity.getEntityData().func_74769_h("生成空气检测")), (int) entity.getEntityData().func_74769_h("生成坐标Z"))) && world.func_175623_d(new BlockPos((int) entity.getEntityData().func_74769_h("生成坐标X"), (int) (entity.getEntityData().func_74769_h("生成坐标Y") + entity.getEntityData().func_74769_h("生成空气检测")), (int) (entity.getEntityData().func_74769_h("生成坐标Z") - 1.0d))) && world.func_175623_d(new BlockPos((int) entity.getEntityData().func_74769_h("生成坐标X"), (int) (entity.getEntityData().func_74769_h("生成坐标Y") + entity.getEntityData().func_74769_h("生成空气检测")), (int) (entity.getEntityData().func_74769_h("生成坐标Z") + 1.0d)))) {
                    entity.getEntityData().func_74780_a("生成空气检测", entity.getEntityData().func_74769_h("生成空气检测") + 1.0d);
                    if (entity.getEntityData().func_74769_h("生成空气检测") >= 2.0d) {
                        entity.getEntityData().func_74757_a("实体允许生成", true);
                    }
                }
            }
        }
    }
}
