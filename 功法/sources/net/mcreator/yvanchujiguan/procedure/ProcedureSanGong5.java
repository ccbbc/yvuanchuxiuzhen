package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGong5.class */
public class ProcedureSanGong5 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGong5(ElementsYvanchujiguanMod instance) {
        super(instance, 184);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFa5") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("GongFa5", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa5Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa5") == 2.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 5.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa5", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa5Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa5") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 5.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa5", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa5Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa5") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa5", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa5Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        }
    }
}
