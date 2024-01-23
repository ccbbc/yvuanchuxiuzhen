package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGongShow5.class */
public class ProcedureSanGongShow5 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGongShow5(ElementsYvanchujiguanMod instance) {
        super(instance, 223);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa33") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa33") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa33", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa33Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa33") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa33") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 2.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa33") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 7.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 2.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa33") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 7.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 20.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa33") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 61.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 20.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa33", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa33Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow5", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa20") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa20") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa20", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa20Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa20") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa20") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa20") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 3.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa20") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 19.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 3.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa20") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 73.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 3.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa20", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa20Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow5", "");
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
