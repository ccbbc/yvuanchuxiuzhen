package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGongShow6.class */
public class ProcedureSanGongShow6 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGongShow6(ElementsYvanchujiguanMod instance) {
        super(instance, 224);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa25") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa25") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa25", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa25Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa25") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa25") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa25") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 9.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa25") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 27.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa25") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 81.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa25", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa25Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow6", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa26") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa26") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa26", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa26Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa26") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa26") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 3.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa26") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 9.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa26") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 27.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa26") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 81.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa26", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa26Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow6", "");
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
