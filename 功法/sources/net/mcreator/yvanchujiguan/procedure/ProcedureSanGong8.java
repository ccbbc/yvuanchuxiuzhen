package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGong8.class */
public class ProcedureSanGong8 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGong8(ElementsYvanchujiguanMod instance) {
        super(instance, 172);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 2.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 30.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 5.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 30.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 6.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 50.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 7.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 90.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 8.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 150.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 9.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 480.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 150.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 10.0d) {
            entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 4.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 480.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 150.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 11.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 21.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 150.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 480.0d);
            entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 4.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 12.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 330.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 480.0d);
            entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 4.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 21.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 13.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 680.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 480.0d);
            entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 4.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 21.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa8") == 14.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 680.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 480.0d);
            entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 4.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 129.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - entityPlayer.getEntityData().func_74769_h("MagicAttack8"));
            entityPlayer.getEntityData().func_74780_a("GongFa8", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa8Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        }
    }
}
