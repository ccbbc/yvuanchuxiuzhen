package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao0301;
import net.mcreator.fabaokuozhan.item.ItemFabao0302;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao0301DangYouJianDianJiKongQiShi.class */
public class ProcedureFabao0301DangYouJianDianJiKongQiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao0301DangYouJianDianJiKongQiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 304);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0301.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0302.block, 1).func_77973_b()) {
                entityLivingBase.func_70634_a(((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177952_p());
                entityLivingBase.getEntityData().func_74780_a("BeMagicAttack", entityLivingBase.getEntityData().func_74769_h("BeMagicAttack") + ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.07d) + entityLivingBase.getEntityData().func_74769_h("MagicDefense"));
                entityLivingBase.getEntityData().func_74780_a("石峰拳套计时", 140.0d);
                entityLivingBase.getEntityData().func_74780_a("Defense", entityLivingBase.getEntityData().func_74769_h("Defense") + 29.0d);
                entityLivingBase.getEntityData().func_74780_a("DefenseTemp", entityLivingBase.getEntityData().func_74769_h("DefenseTemp") + 29.0d);
                entityLivingBase.getEntityData().func_74780_a("MagicDefense", entityLivingBase.getEntityData().func_74769_h("MagicDefense") + 29.0d);
                entityLivingBase.getEntityData().func_74780_a("MagicDefenseTemp", entityLivingBase.getEntityData().func_74769_h("MagicDefenseTemp") + 29.0d);
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 180);
                }
                ItemStack _ist = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (_ist.func_96631_a(40, new Random(), (EntityPlayerMP) null)) {
                    _ist.func_190918_g(1);
                    _ist.func_77964_b(0);
                }
                ItemStack _ist2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                if (_ist2.func_96631_a(40, new Random(), (EntityPlayerMP) null)) {
                    _ist2.func_190918_g(1);
                    _ist2.func_77964_b(0);
                    return;
                }
                return;
            }
        }
        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("拳套未佩戴齐全，无法使用技能"), false);
        }
    }
}
