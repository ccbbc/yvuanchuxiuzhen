package net.mcreator.yuanchujianzhu.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureQiFangShangHaiDo4.class */
public class ProcedureQiFangShangHaiDo4 extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureQiFangShangHaiDo4(ElementsYuanchujianzhuMod instance) {
        super(instance, 226);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuyaoshou:breaking_cone"), 1))) {
            if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) && !entityPlayer.getEntityData().func_74767_n("器房伤害4") && entityPlayer.getEntityData().func_74769_h("MagicDefense") < 106.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") <= 4.0d) {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 106.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("你遭受器房结界侵噬气血，受到" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("BeMagicAttack")) + "法术伤害"), false);
                }
                entityPlayer.getEntityData().func_74757_a("器房伤害4", true);
            }
            entityPlayer.getEntityData().func_74780_a("器房伤害计时4", entityPlayer.getEntityData().func_74769_h("器房伤害计时4") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("器房伤害计时4") >= 20.0d) {
                entityPlayer.getEntityData().func_74757_a("器房伤害4", false);
                entityPlayer.getEntityData().func_74780_a("器房伤害计时4", 0.0d);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§a你进入了敌对阵法，但破阵锥为你破除了阵法伤害!"), true);
        }
    }
}
