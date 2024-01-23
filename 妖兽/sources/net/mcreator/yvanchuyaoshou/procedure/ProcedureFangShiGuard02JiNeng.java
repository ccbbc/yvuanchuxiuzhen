package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityFangShiGuard02;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureFangShiGuard02JiNeng.class */
public class ProcedureFangShiGuard02JiNeng extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFangShiGuard02JiNeng(ElementsYvanchuyaoshouMod instance) {
        super(instance, 369);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        if (sourceentity instanceof EntityFangShiGuard02.EntityCustom) {
            if (sourceentity.getEntityData().func_74767_n("DefenseGainOn")) {
                sourceentity.getEntityData().func_74757_a("DefenseGainOn", false);
                sourceentity.getEntityData().func_74780_a("Attack", 96.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("技能触发"), false);
                }
            }
            if (sourceentity.getEntityData().func_74769_h("DefenseGainNum") >= 3.0d) {
                sourceentity.getEntityData().func_74757_a("DefenseGainOn", true);
                sourceentity.getEntityData().func_74780_a("DefenseGainNum", 0.0d);
                sourceentity.getEntityData().func_74780_a("Attack", 192.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("下一次攻击触发技能"), false);
                    return;
                }
                return;
            }
            sourceentity.getEntityData().func_74780_a("DefenseGainNum", sourceentity.getEntityData().func_74769_h("DefenseGainNum") + 1.0d);
        }
    }
}
