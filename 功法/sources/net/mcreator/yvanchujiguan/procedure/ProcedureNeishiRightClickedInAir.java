package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureNeishiRightClickedInAir.class */
public class ProcedureNeishiRightClickedInAir extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureNeishiRightClickedInAir(ElementsYvanchujiguanMod instance) {
        super(instance, 36);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("XiuLian") == 1.0d || (entityPlayer.getEntityData().func_74769_h("GongFa") == 3000.0d && entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d)) {
            if (!entityPlayer.getEntityData().func_74767_n("MeditationTimeOn")) {
                if (entityPlayer.getEntityData().func_74769_h("ShouYuan") >= 1.0d) {
                    entityPlayer.getEntityData().func_74757_a("MeditationTimeOn", true);
                    if (entityPlayer.getEntityData().func_74769_h("MeditationTime") < 1.0d) {
                        entityPlayer.getEntityData().func_74780_a("MeditationTime", 240.0d);
                        entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") - 1.0d);
                        entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") + 1.0d);
                    }
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("开始闭关时间飞逝"), false);
                        return;
                    }
                    return;
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("道友时日无多已无力闭关矣"), false);
                    return;
                } else {
                    return;
                }
            }
            entityPlayer.getEntityData().func_74757_a("MeditationTimeOn", false);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("结束闭关"), false);
            }
        }
    }
}
