package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu03;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianNiangDrink02.class */
public class ProcedureXianNiangDrink02 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianNiangDrink02(ElementsYvanchuliandanMod instance) {
        super(instance, 708);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("NiangJiu2") < 2.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 90.0d);
            entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") + 1.0d);
            entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") + 5.0d);
        }
        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") + 60.0d);
        entityPlayer.getEntityData().func_74780_a("NiangJiu2", entityPlayer.getEntityData().func_74769_h("NiangJiu2") + 1.0d);
        if (entityPlayer instanceof EntityPlayer) {
            ItemStack _setstack = new ItemStack(ItemJiuJu03.block, 1);
            _setstack.func_190920_e(1);
            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
        }
    }
}
