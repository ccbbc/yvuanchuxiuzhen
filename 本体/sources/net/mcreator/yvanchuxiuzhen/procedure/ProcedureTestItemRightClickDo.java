package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureTestItemRightClickDo.class */
public class ProcedureTestItemRightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTestItemRightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 274);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entityPlayer.getEntityData().func_74780_a("TiZhiNum", entityPlayer.getEntityData().func_74769_h("TiZhiNum") + 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 1.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "三阳之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 2.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "龙吟之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 3.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "锻金之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 4.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "木灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 5.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "水灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 6.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "火灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 7.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "土灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 8.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "炎灵之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 9.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "五行之体");
        } else if (entityPlayer.getEntityData().func_74769_h("TiZhiNum") >= 10.0d) {
            entityPlayer.getEntityData().func_74778_a("TiZhi", "平庸之体");
            entityPlayer.getEntityData().func_74780_a("体质位置", 0.0d);
        }
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 20);
        }
    }
}
