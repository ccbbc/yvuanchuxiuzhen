package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureYuJianYouJian28.class */
public class ProcedureYuJianYouJian28 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYuJianYouJian28(ElementsFabaokuozhanMod instance) {
        super(instance, 413);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("电光之心:击败[四阶]雷原巨鳄获得"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("折骨钢:矿石开采"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("寒潭精铁:特殊地形生成"), false);
        }
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
        }
    }
}
