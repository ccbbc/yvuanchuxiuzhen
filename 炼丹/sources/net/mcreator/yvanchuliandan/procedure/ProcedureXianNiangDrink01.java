package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu01;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianNiangDrink01.class */
public class ProcedureXianNiangDrink01 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianNiangDrink01(ElementsYvanchuliandanMod instance) {
        super(instance, 707);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("NiangJiu1") < 3.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 30.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("JiuLinShi01") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttackTemp", entityPlayer.getEntityData().func_74769_h("MagicAttackTemp") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 2.0d);
            entityPlayer.getEntityData().func_74757_a("JiuLinShi", true);
            entityPlayer.getEntityData().func_74780_a("JiuLinShi01", 2400.0d);
        }
        entityPlayer.getEntityData().func_74780_a("NiangJiu1", entityPlayer.getEntityData().func_74769_h("NiangJiu1") + 1.0d);
        if (entityPlayer instanceof EntityPlayer) {
            ItemStack _setstack = new ItemStack(ItemJiuJu01.block, 1);
            _setstack.func_190920_e(1);
            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
        }
    }
}
