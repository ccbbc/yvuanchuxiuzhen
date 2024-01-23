package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemJinGuBang;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureJinGuBang1.class */
public class ProcedureJinGuBang1 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJinGuBang1(ElementsFabaokuozhanMod instance) {
        super(instance, 425);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJinGuBang.block, 1).func_77973_b()) {
            if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                entityLivingBase.getEntityData().func_74780_a("金箍棒威能", 600.0d);
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 1200);
                }
                if (itemstack.func_96631_a(100, new Random(), (EntityPlayerMP) null)) {
                    itemstack.func_190918_g(1);
                    itemstack.func_77964_b(0);
                }
            } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("化神期以下修士无法使用"), true);
            }
        }
    }
}
