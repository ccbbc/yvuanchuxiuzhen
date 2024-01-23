package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaZhuDong2Num0.class */
public class ProcedureGongFaZhuDong2Num0 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaZhuDong2Num0(ElementsYvanchujiguanMod instance) {
        super(instance, 126);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("法攻暂计");
            if (_so == null) {
                _so = _sc.func_96535_a("法攻暂计", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("MagicAttact") * 0.3d));
        }
        entityPlayer.getEntityData().func_74780_a("MagicAttact", entityPlayer.getEntityData().func_74769_h("MagicAttact") * 1.3d);
        entityPlayer.getEntityData().func_74780_a("功法主动2持续12s", 240.0d);
    }
}
