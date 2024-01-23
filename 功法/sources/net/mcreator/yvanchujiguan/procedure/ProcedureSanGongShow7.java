package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGongShow7.class */
public class ProcedureSanGongShow7 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGongShow7(ElementsYvanchujiguanMod instance) {
        super(instance, 225);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa22") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa22") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa22", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa22Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa22") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 5.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa22") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 15.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa22") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 45.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa22") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 135.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa22") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 305.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa22", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa22Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow7", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("你没有修炼中的功法供你切换"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("切换功法需打坐时进行"), false);
        }
    }
}
