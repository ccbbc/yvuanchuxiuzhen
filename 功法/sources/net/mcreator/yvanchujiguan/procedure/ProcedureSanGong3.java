package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGong3.class */
public class ProcedureSanGong3 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGong3(ElementsYvanchujiguanMod instance) {
        super(instance, 182);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFa3") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("GongFa3", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa3Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa3") == 2.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 5.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa3", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa3Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa3") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 5.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa3", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa3Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa3") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa3", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa3Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        }
    }
}
