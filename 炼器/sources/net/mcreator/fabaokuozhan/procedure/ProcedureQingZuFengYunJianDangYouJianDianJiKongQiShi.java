package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureQingZuFengYunJianDangYouJianDianJiKongQiShi.class */
public class ProcedureQingZuFengYunJianDangYouJianDianJiKongQiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQingZuFengYunJianDangYouJianDianJiKongQiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 481);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("结丹期以下修士无法使用"), false);
                return;
            }
            return;
        }
        if (entityPlayer.getEntityData().func_74769_h("Power") >= (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d)) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("本命阶段") : -1.0d) != 0.0d) {
                if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("绑定者") : "").equals(entityPlayer.func_189512_bd())) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("本命法宝的所有者不是你,你无法使用"), false);
                        return;
                    }
                    return;
                }
            }
            entityPlayer.getEntityData().func_74780_a("QingFengTime", 60.0d);
            entityPlayer.getEntityData().func_74780_a("QingFengDamage", (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d) + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("威能伤害") : -1.0d));
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d));
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 160);
            }
            if (itemstack.func_96631_a(30, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("灵力不足无法使用"), false);
        }
    }
}
