package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.YuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.gui.GuiJianZhu;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedurePingTai.class */
public class ProcedurePingTai extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedurePingTai(ElementsYuanchuzhushouMod instance) {
        super(instance, 51);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yuanchuzhushou.procedure.ProcedurePingTai$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedurePingTai.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("RiskFunction") == 1) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.openGui(YuanchuzhushouMod.instance, GuiJianZhu.GUIID, world, x, y, z);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("红色按钮已被禁用,如想启用请将配置文件中RiskFunction的属性设置为true"), false);
        }
    }
}
