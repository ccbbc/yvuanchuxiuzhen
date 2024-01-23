package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGongShow2.class */
public class ProcedureSanGongShow2 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGongShow2(ElementsYvanchujiguanMod instance) {
        super(instance, 220);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa7") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa7") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa7", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa7Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa7") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa7") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa7", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa7Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa7") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 7.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa7") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 25.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa7") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 79.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa7", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa7Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow2", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa9") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa9") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa9", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa9Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa9") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa9") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 3.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa9") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa9", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa9Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa9") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 3.0d);
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 180.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa9") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 57.0d);
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 180.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa9", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa9Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow2", "");
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
