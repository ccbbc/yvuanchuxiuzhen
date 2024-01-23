package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi1;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi10;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi2;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi3;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi4;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi5;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi6;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi7;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi8;
import net.mcreator.yuanchuzhushou.item.ItemTiZhi9;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureTiZhi.class */
public class ProcedureTiZhi extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureTiZhi(ElementsYuanchuzhushouMod instance) {
        super(instance, 82);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi1.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "平庸之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 0.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi2.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "三阳之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 1.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi3.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "龙吟之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 2.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi4.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "锻金之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 3.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi5.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "木灵之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 4.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi6.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "水灵之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 5.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi7.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "火灵之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 6.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi8.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "土灵之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 7.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi9.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "炎灵之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 8.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemTiZhi10.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74778_a("TiZhi", "元磁之体");
            entityLivingBase.getEntityData().func_74780_a("TiZhiNum", 10.0d);
        }
        itemstack.func_190918_g(1);
    }
}
