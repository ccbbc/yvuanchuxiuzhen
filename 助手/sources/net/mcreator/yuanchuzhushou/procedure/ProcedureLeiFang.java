package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureLeiFang.class */
public class ProcedureLeiFang extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureLeiFang(ElementsYuanchuzhushouMod instance) {
        super(instance, 35);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("ThunderDefense", entityPlayer.getEntityData().func_74769_h("工具数值"));
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("已将雷电防御数值设置为[" + entityPlayer.getEntityData().func_74769_h("工具数值") + "]"), false);
        }
    }
}
