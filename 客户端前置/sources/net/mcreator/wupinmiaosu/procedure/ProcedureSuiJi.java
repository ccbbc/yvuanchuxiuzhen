package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureSuiJi.class */
public class ProcedureSuiJi extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureSuiJi(ElementsWupinmiaosuMod instance) {
        super(instance, 86);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("yuanchuchoose");
            if (_so == null) {
                _so = _sc.func_96535_a("yuanchuchoose", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(1);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc2 = entityPlayer.func_96123_co();
            ScoreObjective _so2 = _sc2.func_96518_b("GongFaReduce");
            if (_so2 == null) {
                _so2 = _sc2.func_96535_a("GongFaReduce", ScoreCriteria.field_96641_b);
            }
            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
            _scr2.func_96647_c(1);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc3 = entityPlayer.func_96123_co();
            ScoreObjective _so3 = _sc3.func_96518_b("MoShiNum");
            if (_so3 == null) {
                _so3 = _sc3.func_96535_a("MoShiNum", ScoreCriteria.field_96641_b);
            }
            Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
            _scr3.func_96647_c(5);
        }
    }
}
