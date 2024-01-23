package net.mcreator.yuanchujianzhu.procedure;

import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureYingBingShangHaiBuffDo.class */
public class ProcedureYingBingShangHaiBuffDo extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureYingBingShangHaiBuffDo(ElementsYuanchujianzhuMod instance) {
        super(instance, 161);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuyaoshou:breaking_cone"), 1))) {
            if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) && !entityPlayer.getEntityData().func_74767_n("阴兵伤害") && entityPlayer.getEntityData().func_74769_h("MagicDefense") < 106.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") <= 4.0d) {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 106.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("鬼潮扑面而来，对你持续造成106法术伤害，此地不宜久留"), false);
                }
                entityPlayer.getEntityData().func_74757_a("阴兵伤害", true);
            }
            entityPlayer.getEntityData().func_74780_a("阴兵伤害计时", entityPlayer.getEntityData().func_74769_h("阴兵伤害计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("阴兵伤害计时") >= 20.0d) {
                entityPlayer.getEntityData().func_74757_a("阴兵伤害", false);
                entityPlayer.getEntityData().func_74780_a("阴兵伤害计时", 0.0d);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§a你进入了敌对阵法，但破阵锥为你破除了阵法伤害!"), true);
        }
    }
}
