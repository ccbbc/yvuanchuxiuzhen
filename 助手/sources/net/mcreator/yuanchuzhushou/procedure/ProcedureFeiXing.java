package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureFeiXing.class */
public class ProcedureFeiXing extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureFeiXing(ElementsYuanchuzhushouMod instance) {
        super(instance, 55);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (!entityPlayer.getEntityData().func_74767_n("LingQiFly")) {
            entityPlayer.getEntityData().func_74757_a("LingQiFly", true);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已开启灵力飞行，请注意灵气消耗，旁观者时莫掉了下去"), false);
            }
            if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
                entityPlayer.getEntityData().func_74757_a("Fly", false);
            }
        } else if (entityPlayer.getEntityData().func_74767_n("LingQiFly")) {
            entityPlayer.getEntityData().func_74757_a("LingQiFly", false);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已关闭灵力飞行，请注意生存游玩时无法正常灵力飞行的问题"), false);
            }
            if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
                entityPlayer.getEntityData().func_74757_a("Fly", true);
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71075_bZ.field_75100_b = entityPlayer.getEntityData().func_74767_n("LingQiFly");
                    entityPlayer.func_71016_p();
                }
            }
        }
    }
}
