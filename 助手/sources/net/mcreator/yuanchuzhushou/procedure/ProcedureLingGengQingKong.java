package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureLingGengQingKong.class */
public class ProcedureLingGengQingKong extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureLingGengQingKong(ElementsYuanchuzhushouMod instance) {
        super(instance, 42);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("LingGenNum", 0.0d);
        entityPlayer.getEntityData().func_74757_a("JinLingGen", false);
        entityPlayer.getEntityData().func_74757_a("MuLingGen", false);
        entityPlayer.getEntityData().func_74757_a("ShuiLingGen", false);
        entityPlayer.getEntityData().func_74757_a("HuoLingGen", false);
        entityPlayer.getEntityData().func_74757_a("TuLingGen", false);
        entityPlayer.getEntityData().func_74778_a("LingGen", "");
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("已重置你的灵根"), false);
        }
    }
}
