package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureFoodUse1.class */
public class ProcedureFoodUse1 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFoodUse1(ElementsYvanchuyaoshouMod instance) {
        super(instance, 382);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("DanYaoBreach3", 0.5d);
            entityPlayer.getEntityData().func_74780_a("境界突破附加概率", entityPlayer.getEntityData().func_74769_h("DanYaoBreach1") + entityPlayer.getEntityData().func_74769_h("DanYaoBreach2") + entityPlayer.getEntityData().func_74769_h("DanYaoBreach3"));
            entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("BaseMax"));
            itemstack.func_190918_g(1);
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("此物已于你无用"), false);
        }
    }
}
