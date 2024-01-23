package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureHuaFu.class */
public class ProcedureHuaFu extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureHuaFu(ElementsYuanchuzhushouMod instance) {
        super(instance, 20);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("工具数值") < 10.0d) {
            entityPlayer.getEntityData().func_74780_a("FuLu", entityPlayer.getEntityData().func_74769_h("工具数值"));
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已将画符数值设置为[" + entityPlayer.getEntityData().func_74769_h("工具数值") + "]"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("画符最高为九级"), false);
        }
    }
}
