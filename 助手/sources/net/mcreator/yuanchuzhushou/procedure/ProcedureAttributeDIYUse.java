package net.mcreator.yuanchuzhushou.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureAttributeDIYUse.class */
public class ProcedureAttributeDIYUse extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureAttributeDIYUse(ElementsYuanchuzhushouMod instance) {
        super(instance, 94);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entityPlayer.getEntityData().func_74780_a(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("NbtType") : "", (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("Num") : -1.0d) + entityPlayer.getEntityData().func_74769_h(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("NbtType") : ""));
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("使用了一个物品获取了<§a" + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("Num") : -1.0d) + "§f>点[§b" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("属性") : "") + "§f]"), false);
        }
        itemstack.func_190918_g(1);
    }
}
