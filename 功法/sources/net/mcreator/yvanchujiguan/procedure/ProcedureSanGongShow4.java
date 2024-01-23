package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGongShow4.class */
public class ProcedureSanGongShow4 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGongShow4(ElementsYvanchujiguanMod instance) {
        super(instance, 222);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa13") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa13") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa13", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa13Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa13") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa13") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa13") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 6.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa13") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 19.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 6.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa13") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 79.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 60.0d);
                    entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") - 160.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa13", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa13Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow4", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa12") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa12") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa12", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa12Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa12") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa12") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 2.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa12") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 2.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 6.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa12") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 10.0d);
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 20.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 6.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa12") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 550.0d);
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 20.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 6.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa12", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa12Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow4", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa14") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa14") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa14", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa14Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa14") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa14") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa14") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 6.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa14") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 24.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa14") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 55.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 24.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa14", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa14Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow4", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa15") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa15") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa15", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa15Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa15") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa15") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 3.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa15") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 9.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa15") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 27.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa15") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 70.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa15", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa15Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow4", "");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换功法成功，你感受到天地灵力从身体中的流逝"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa16") > 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa16") == 1.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa16", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa16Num", 0.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa16") == 2.0d) {
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa16") == 3.0d) {
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 1.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") - 2.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa16") == 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 7.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") - 2.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa16") == 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 13.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") - 2.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("GongFa16") == 6.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") - 56.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 13.0d);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa16", 0.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa16Num", 0.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow4", "");
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
