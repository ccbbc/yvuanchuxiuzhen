package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaAdd30.class */
public class ProcedureGongFaAdd30 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaAdd30(ElementsYvanchujiguanMod instance) {
        super(instance, 140);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74778_a("功法顺序暂存", "30");
        if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 1.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 20.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 1.0d);
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
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") + 80.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 3.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 3.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 20.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 4.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 4.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 80.0d);
                entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") + 2.0d);
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
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 6.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 6.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 80.0d);
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") + 320.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 7.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 7.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 200.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 6.0d);
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
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") + 480.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 9.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 9.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 200.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 12.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 10.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 10.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 800.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 18.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 11.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("尚未到达元婴期，无法进一步修炼功法"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 11.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 800.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 18.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 12.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 12.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 800.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 36.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 13.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("突破功法层数！"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存")) == 13.0d && entityPlayer.getEntityData().func_74769_h("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num") >= entityPlayer.getEntityData().func_74769_h("单层进度最大值")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 4000.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 108.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack30", entityPlayer.getEntityData().func_74769_h("MagicAttack") * 0.03d);
                entityPlayer.getEntityData().func_74780_a("PowerMax30", entityPlayer.getEntityData().func_74769_h("PowerMax") * 0.03d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + entityPlayer.getEntityData().func_74769_h("MagicAttack30"));
                entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") + entityPlayer.getEntityData().func_74769_h("PowerMax30"));
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存"), 14.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa" + entityPlayer.getEntityData().func_74779_i("功法顺序暂存") + "Num", 0.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("《" + entityPlayer.getEntityData().func_74779_i("功法显示") + "》已彻底领悟，仙道更进一步了！"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("尚未到达化神期，无法进一步修炼功法"), false);
            }
        }
    }
}
