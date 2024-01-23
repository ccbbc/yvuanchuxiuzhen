package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGongShow1.class */
public class ProcedureSanGongShow1 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGongShow1(ElementsYvanchujiguanMod instance) {
        super(instance, 219);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa32") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa32") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa32", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa32Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa32") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("ShenShi", entityPlayer.getEntityData().func_74769_h("ShenShi") - 18.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa32") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("ShenShi", entityPlayer.getEntityData().func_74769_h("ShenShi") - 54.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa32") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("ShenShi", entityPlayer.getEntityData().func_74769_h("ShenShi") - 154.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa32") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("ShenShi", entityPlayer.getEntityData().func_74769_h("ShenShi") - 454.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa32") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("ShenShi", entityPlayer.getEntityData().func_74769_h("ShenShi") - 1454.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa32", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa32Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow1", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa17") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa17") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa17", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa17Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa17") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("ThunderAttack", entityPlayer.getEntityData().func_74769_h("ThunderAttack") - 2.0d);
                    entityPlayer.getEntityData().func_74780_a("ThunderDefense", entityPlayer.getEntityData().func_74769_h("ThunderDefense") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa17") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("ThunderAttack", entityPlayer.getEntityData().func_74769_h("ThunderAttack") - 6.0d);
                    entityPlayer.getEntityData().func_74780_a("ThunderDefense", entityPlayer.getEntityData().func_74769_h("ThunderDefense") - 3.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa17") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("ThunderAttack", entityPlayer.getEntityData().func_74769_h("ThunderAttack") - 18.0d);
                    entityPlayer.getEntityData().func_74780_a("ThunderDefense", entityPlayer.getEntityData().func_74769_h("ThunderDefense") - 9.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa17") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("ThunderAttack", entityPlayer.getEntityData().func_74769_h("ThunderAttack") - 54.0d);
                    entityPlayer.getEntityData().func_74780_a("ThunderDefense", entityPlayer.getEntityData().func_74769_h("ThunderDefense") - 27.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa17") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("ThunderAttack", entityPlayer.getEntityData().func_74769_h("ThunderAttack") - 270.0d);
                    entityPlayer.getEntityData().func_74780_a("ThunderDefense", entityPlayer.getEntityData().func_74769_h("ThunderDefense") - 135.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa17", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa17Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow1", "");
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
