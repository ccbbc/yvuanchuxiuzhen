package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureJinGuBangBeiDong1.class */
public class ProcedureJinGuBangBeiDong1 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJinGuBangBeiDong1(ElementsFabaokuozhanMod instance) {
        super(instance, 424);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) && !entityPlayer.getEntityData().func_74767_n("金箍棒伤害")) {
            entityPlayer.getEntityData().func_74780_a("BeFireAttack", 260.0d);
            entityPlayer.getEntityData().func_74757_a("金箍棒伤害", true);
        }
        entityPlayer.getEntityData().func_74780_a("金箍棒伤害计时", entityPlayer.getEntityData().func_74769_h("金箍棒伤害计时") + 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("金箍棒伤害计时") >= 20.0d) {
            entityPlayer.getEntityData().func_74780_a("金箍棒伤害计时", 0.0d);
            entityPlayer.getEntityData().func_74757_a("金箍棒伤害", false);
        }
    }
}
