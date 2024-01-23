package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureTuPoGaiLv.class */
public class ProcedureTuPoGaiLv extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureTuPoGaiLv(ElementsYuanchuzhushouMod instance) {
        super(instance, 52);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("工具数值") <= 100.0d) {
            entityPlayer.getEntityData().func_74780_a("境界突破附加概率", entityPlayer.getEntityData().func_74769_h("工具数值") / 100.0d);
            entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已将突破概率设置为[" + entityPlayer.getEntityData().func_74769_h("工具数值") + "%]"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("突破概率最高为100%"), false);
        }
    }
}
