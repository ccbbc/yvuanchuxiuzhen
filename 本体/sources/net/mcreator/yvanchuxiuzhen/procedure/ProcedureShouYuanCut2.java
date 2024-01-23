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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShouYuanCut2.class */
public class ProcedureShouYuanCut2 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShouYuanCut2(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 300);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShouYuanCut2$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShouYuanCut2.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("已重伤") < 1) {
            if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 1.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 15.0d);
                entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 2.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 80.0d);
                entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 2.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 3.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 400.0d);
                entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 3.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 4.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 1280.0d);
                entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 4.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 5.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 5120.0d);
                entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 5.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 6.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 6.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 40960.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 7.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 7.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 163840.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 8.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 8.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 655360.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 9.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 9.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 2621440.0d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 10.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 10.0d);
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 1.048576E7d);
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 11.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 11.0d);
                entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 1.0d);
            }
        }
    }
}
