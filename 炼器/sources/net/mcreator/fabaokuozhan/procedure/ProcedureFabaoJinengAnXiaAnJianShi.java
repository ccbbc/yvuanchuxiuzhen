package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao0301;
import net.mcreator.fabaokuozhan.item.ItemFabao0302;
import net.mcreator.fabaokuozhan.item.ItemFabao1401;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabaoJinengAnXiaAnJianShi.class */
public class ProcedureFabaoJinengAnXiaAnJianShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabaoJinengAnXiaAnJianShi(ElementsFabaokuozhanMod instance) {
        super(instance, 283);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0302.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0301.block, 1).func_77973_b()) {
                entityLivingBase.func_70634_a(((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177952_p());
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("冲拳!"), false);
                    return;
                }
                return;
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemFabao1401.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemFabao1401.block, 1).func_77973_b()) {
                return;
            }
        }
        entityLivingBase.func_70634_a(((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177958_n() - 10, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177952_p() + 10);
        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("后撤步!"), false);
        }
    }
}
