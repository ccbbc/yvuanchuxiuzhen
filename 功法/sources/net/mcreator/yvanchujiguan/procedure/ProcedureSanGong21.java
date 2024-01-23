package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGong21.class */
public class ProcedureSanGong21 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGong21(ElementsYvanchujiguanMod instance) {
        super(instance, 174);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 2.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 5.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 5.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 30.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 5.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 6.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 30.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 7.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 110.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 8.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 13.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 110.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 9.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 19.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 110.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 10.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 43.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 110.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 11.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 290.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 43.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 12.0d) {
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 470.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 43.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 13.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 114.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 53.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 470.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa21") == 14.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 114.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 53.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - (1550.0d + entityPlayer.getEntityData().func_74769_h("HealthMax21")));
            entityPlayer.getEntityData().func_74780_a("GongFa21", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa21Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        }
    }
}
