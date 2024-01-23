package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureHj.class */
public class ProcedureHj extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHj(ElementsYvanchujiguanMod instance) {
        super(instance, 149);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [net.mcreator.yvanchujiguan.procedure.ProcedureHj$2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [net.mcreator.yvanchujiguan.procedure.ProcedureHj$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("功法熟练度"), entity.getEntityData().func_74769_h(entity.getEntityData().func_74779_i("功法熟练度")) + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureHj.2
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0.00").format(100 / new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureHj.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFaReduce"))));
    }
}
