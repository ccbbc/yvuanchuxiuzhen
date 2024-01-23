package net.mcreator.yuanchujianzhu.procedure;

import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureShouHuangShangHaiBuffDo.class */
public class ProcedureShouHuangShangHaiBuffDo extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureShouHuangShangHaiBuffDo(ElementsYuanchujianzhuMod instance) {
        super(instance, 165);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuyaoshou:breaking_cone"), 1))) {
            if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) && !entityPlayer.getEntityData().func_74767_n("兽皇伤害") && entityPlayer.getEntityData().func_74769_h("Defense") < 106.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") <= 4.0d) {
                entityPlayer.func_70097_a(DamageSource.field_76380_i, 106.0f);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("阵阵兽吼扭曲了空间！对你持续造成106物理伤害"), false);
                }
                entityPlayer.getEntityData().func_74757_a("兽皇伤害", true);
            }
            entityPlayer.getEntityData().func_74780_a("兽皇伤害计时", entityPlayer.getEntityData().func_74769_h("兽皇伤害计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("兽皇伤害计时") >= 20.0d) {
                entityPlayer.getEntityData().func_74757_a("兽皇伤害", false);
                entityPlayer.getEntityData().func_74780_a("兽皇伤害计时", 0.0d);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§a你进入了敌对阵法，但破阵锥为你破除了阵法伤害!"), true);
        }
    }
}
