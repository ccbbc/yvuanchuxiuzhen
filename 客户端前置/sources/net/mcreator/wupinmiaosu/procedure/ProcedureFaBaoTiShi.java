package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFaBaoTiShi.class */
public class ProcedureFaBaoTiShi extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFaBaoTiShi(ElementsWupinmiaosuMod instance) {
        super(instance, 104);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [net.mcreator.wupinmiaosu.procedure.ProcedureFaBaoTiShi$2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.wupinmiaosu.procedure.ProcedureFaBaoTiShi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureFaBaoTiShi.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("MoShiNum") == 1 || new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureFaBaoTiShi.2
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("MoShiNum") == 2) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§a已启用小绿瓶、驱雷策电符、破阵锥的主动能力"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§4非简单与普通模式已禁用小绿瓶、驱雷策电符、破阵锥的主动能力"), false);
        }
    }
}
