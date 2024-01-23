package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu07;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianNiangDrink07.class */
public class ProcedureXianNiangDrink07 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianNiangDrink07(ElementsYvanchuliandanMod instance) {
        super(instance, 713);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("NiangJiu7") < 1.0d) {
            entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") + 50.0d);
            if (entityPlayer.getEntityData().func_74767_n("MuLingGen")) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 3000.0d);
            } else if (new Random().nextInt(4) == 0) {
                entityPlayer.getEntityData().func_74757_a("MuLingGen", true);
                entityPlayer.getEntityData().func_74778_a("LingGen", entityPlayer.getEntityData().func_74779_i("LingGen") + "木");
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已获取到了木灵根"), false);
                }
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JiuLinShi07") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + 75.0d);
            entityPlayer.getEntityData().func_74780_a("DefenseTemp", entityPlayer.getEntityData().func_74769_h("DefenseTemp") + 75.0d);
            entityPlayer.getEntityData().func_74757_a("JiuLinShi", true);
            entityPlayer.getEntityData().func_74780_a("JiuLinShi07", 3600.0d);
        }
        entityPlayer.getEntityData().func_74780_a("NiangJiu7", entityPlayer.getEntityData().func_74769_h("NiangJiu7") + 1.0d);
        if (entityPlayer instanceof EntityLivingBase) {
            ((EntityLivingBase) entityPlayer).func_70691_i(137.0f);
        }
        if (entityPlayer instanceof EntityPlayer) {
            ItemStack _setstack = new ItemStack(ItemJiuJu07.block, 1);
            _setstack.func_190920_e(1);
            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
        }
    }
}
