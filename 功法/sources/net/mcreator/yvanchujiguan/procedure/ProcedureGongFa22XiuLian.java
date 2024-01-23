package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFa22XiuLian.class */
public class ProcedureGongFa22XiuLian extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFa22XiuLian(ElementsYvanchujiguanMod instance) {
        super(instance, 128);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFa") == 22.0d) {
            if (entityPlayer.getEntityData().func_74769_h("ShaQi") >= 3.0d) {
                entityPlayer.getEntityData().func_74780_a("ShaQi", entityPlayer.getEntityData().func_74769_h("ShaQi") - 3.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("煞气减少3点"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("功法进阶缓却") == 0.0d) {
                entityPlayer.getEntityData().func_74780_a("ShaQi", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("你已经没有煞气了"), false);
                }
                entityPlayer.getEntityData().func_74780_a("功法进阶缓却", 200.0d);
            }
        }
    }
}
