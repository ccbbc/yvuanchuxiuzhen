package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu06;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianNiangDrink06.class */
public class ProcedureXianNiangDrink06 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianNiangDrink06(ElementsYvanchuliandanMod instance) {
        super(instance, 712);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("NiangJiu6") < 1.0d && entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entityLivingBase.getEntityData().func_74780_a("DanYaoBreach2", 0.03d);
            entityLivingBase.getEntityData().func_74780_a("境界突破附加概率", entityLivingBase.getEntityData().func_74769_h("DanYaoBreach1") + entityLivingBase.getEntityData().func_74769_h("DanYaoBreach2") + entityLivingBase.getEntityData().func_74769_h("DanYaoBreach3"));
            entityLivingBase.getEntityData().func_74757_a("境界概率更新", true);
        }
        if (entityLivingBase.getEntityData().func_74769_h("JiuLinShi06") == 0.0d) {
            entityLivingBase.getEntityData().func_74780_a("MagicDefense", entityLivingBase.getEntityData().func_74769_h("MagicDefense") + 75.0d);
            entityLivingBase.getEntityData().func_74780_a("MagicDefenseTemp", entityLivingBase.getEntityData().func_74769_h("MagicDefenseTemp") + 75.0d);
            entityLivingBase.getEntityData().func_74757_a("JiuLinShi", true);
            entityLivingBase.getEntityData().func_74780_a("JiuLinShi06", 3600.0d);
        }
        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") + 750.0d);
        entityLivingBase.getEntityData().func_74780_a("NiangJiu6", entityLivingBase.getEntityData().func_74769_h("NiangJiu6") + 1.0d);
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70691_i(87.0f);
        }
        if (entityLivingBase instanceof EntityPlayer) {
            ItemStack _setstack = new ItemStack(ItemJiuJu06.block, 1);
            _setstack.func_190920_e(1);
            ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack);
        }
    }
}
