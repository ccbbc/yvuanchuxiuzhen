package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureMuLingGen.class */
public class ProcedureMuLingGen extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureMuLingGen(ElementsYuanchuzhushouMod instance) {
        super(instance, 44);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (!entityPlayer.getEntityData().func_74767_n("MuLingGen")) {
            entityPlayer.getEntityData().func_74757_a("MuLingGen", true);
            entityPlayer.getEntityData().func_74780_a("LingGenNum", entityPlayer.getEntityData().func_74769_h("LingGenNum") + 1.0d);
            entityPlayer.getEntityData().func_74778_a("LingGen", entityPlayer.getEntityData().func_74779_i("LingGen") + "木");
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已获取到木灵根"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("已拥有木灵根无法再次获取"), false);
        }
    }
}
