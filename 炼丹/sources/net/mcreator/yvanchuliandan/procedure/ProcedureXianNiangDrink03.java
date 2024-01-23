package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu02;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianNiangDrink03.class */
public class ProcedureXianNiangDrink03 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianNiangDrink03(ElementsYvanchuliandanMod instance) {
        super(instance, 709);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("NiangJiu3") < 1.0d) {
            entityPlayer.getEntityData().func_74780_a("ShaQi", entityPlayer.getEntityData().func_74769_h("ShaQi") + 300.0d);
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("DanYaoBreach2", 0.1d);
                entityPlayer.getEntityData().func_74780_a("境界突破附加概率", entityPlayer.getEntityData().func_74769_h("DanYaoBreach1") + entityPlayer.getEntityData().func_74769_h("DanYaoBreach2") + entityPlayer.getEntityData().func_74769_h("DanYaoBreach3"));
                entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JiuLinShi03") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 10.0d);
            entityPlayer.getEntityData().func_74780_a("AttackTemp", entityPlayer.getEntityData().func_74769_h("AttackTemp") + 10.0d);
            entityPlayer.getEntityData().func_74757_a("JiuLinShi", true);
            entityPlayer.getEntityData().func_74780_a("JiuLinShi03", 2400.0d);
        }
        entityPlayer.getEntityData().func_74780_a("NiangJiu3", entityPlayer.getEntityData().func_74769_h("NiangJiu3") + 1.0d);
        if (entityPlayer instanceof EntityPlayer) {
            ItemStack _setstack = new ItemStack(ItemJiuJu02.block, 1);
            _setstack.func_190920_e(1);
            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
        }
    }
}
