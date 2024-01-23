package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaAdd29.class */
public class ProcedureGongFaAdd29 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaAdd29(ElementsYvanchujiguanMod instance) {
        super(instance, 139);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74778_a("功法顺序暂存", "29");
        if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 1.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 20.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 1.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 2.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("尚未到达练气期，无法进一步修炼功法"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 2.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 20.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 10.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 3.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 3.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 20.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 4.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 4.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 80.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 20.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 5.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("尚未到达筑基期，无法进一步修炼功法"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 5.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 80.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 6.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 6.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 80.0d);
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + 4.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 7.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 7.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 200.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 60.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 8.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("尚未到达结丹期，无法进一步修炼功法"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 8.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 200.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 9.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 9.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 200.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 6.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 10.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 10.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 800.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 180.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 11.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("尚未到达元婴期，无法进一步修炼功法"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 11.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 520.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 12.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 12.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 520.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 32.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 13.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 13.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 2500.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 108.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax29", entityPlayer.getEntityData().func_74769_h("HealthMax") * 0.03d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + entityPlayer.getEntityData().func_74769_h("HealthMax29"));
                entityPlayer.getEntityData().func_74780_a("Attack29", entityPlayer.getEntityData().func_74769_h("Attack") * 0.03d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + entityPlayer.getEntityData().func_74769_h("Attack29"));
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 14.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("《" + entityPlayer.getEntityData().func_74779_i("GongFaShow") + "》已彻底领悟，仙道更进一步了！"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("尚未到达化神期，无法进一步修炼功法"), false);
            }
        }
    }
}
