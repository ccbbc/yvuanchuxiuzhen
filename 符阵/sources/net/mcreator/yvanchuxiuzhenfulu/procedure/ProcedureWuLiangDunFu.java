package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureWuLiangDunFu.class */
public class ProcedureWuLiangDunFu extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureWuLiangDunFu(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 570);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("DunFuPanDing") == 0.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("无量盾符发动"), false);
            }
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense"));
            entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense"));
            entityPlayer.getEntityData().func_74780_a("DefenseTemp", 54.0d);
            entityPlayer.getEntityData().func_74780_a("MagicDefenseTemp", 54.0d);
            entityPlayer.getEntityData().func_74780_a("DunFuJiShi", 100.0d);
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + entityPlayer.getEntityData().func_74769_h("DefenseTemp"));
            entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") + entityPlayer.getEntityData().func_74769_h("MagicDefenseTemp"));
            entityPlayer.getEntityData().func_74780_a("DunFuPanDing", 1.0d);
        }
        entityPlayer.getEntityData().func_74780_a("DunFuJiShi", entityPlayer.getEntityData().func_74769_h("DunFuJiShi") - 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("DunFuJiShi") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - entityPlayer.getEntityData().func_74769_h("DefenseTemp"));
            entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") - entityPlayer.getEntityData().func_74769_h("MagicDefenseTemp"));
            entityPlayer.getEntityData().func_74780_a("DunFuJiShi", 100.0d);
            entityPlayer.getEntityData().func_74780_a("DunFuPanDing", 0.0d);
        }
    }
}
