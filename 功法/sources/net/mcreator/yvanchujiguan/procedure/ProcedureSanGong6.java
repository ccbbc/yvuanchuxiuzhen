package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGong6.class */
public class ProcedureSanGong6 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGong6(ElementsYvanchujiguanMod instance) {
        super(instance, 160);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 2.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 4.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 5.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 5.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 6.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")), false);
            }
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 9.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 7.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 17.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 8.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 17.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 9.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 25.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 10.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 49.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 11.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 49.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 1440.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 12.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 67.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 1440.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 13.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 7.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 54.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 139.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 1440.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa6") == 14.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 54.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 1440.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - (347.0d + entityPlayer.getEntityData().func_74769_h("MagicAttack6")));
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - (7.0d + entityPlayer.getEntityData().func_74769_h("Defense6")));
            entityPlayer.getEntityData().func_74780_a("GongFa6", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa6Num", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("散功成功，你感受到天地灵力从身体中的流逝"), false);
            }
        }
    }
}
