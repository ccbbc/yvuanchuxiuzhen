package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu05;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianNiangDrink05.class */
public class ProcedureXianNiangDrink05 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianNiangDrink05(ElementsYvanchuliandanMod instance) {
        super(instance, 711);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("NiangJiu5") < 1.0d) {
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") + 1440.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 18.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("JiuLinShi05") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 25.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttackTemp", entityPlayer.getEntityData().func_74769_h("MagicAttackTemp") + 25.0d);
            entityPlayer.getEntityData().func_74757_a("JiuLinShi", true);
            entityPlayer.getEntityData().func_74780_a("JiuLinShi05", 2400.0d);
        }
        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") + 300.0d);
        entityPlayer.getEntityData().func_74780_a("NiangJiu5", entityPlayer.getEntityData().func_74769_h("NiangJiu5") + 1.0d);
        if (entityPlayer instanceof EntityPlayer) {
            ItemStack _setstack = new ItemStack(ItemJiuJu05.block, 1);
            _setstack.func_190920_e(1);
            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
        }
    }
}
