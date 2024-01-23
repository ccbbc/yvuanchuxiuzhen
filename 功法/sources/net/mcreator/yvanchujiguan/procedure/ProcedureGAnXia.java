package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGAnXia.class */
public class ProcedureGAnXia extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGAnXia(ElementsYvanchujiguanMod instance) {
        super(instance, 260);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GHuanCun") == 0.0d && entityPlayer.getEntityData().func_74769_h("XiuLian") == 1.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("闭关开始"), false);
            }
            entityPlayer.getEntityData().func_74780_a("GHuanCun", 1.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("GHuanCun") == 1.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("闭关结束"), false);
            }
            entityPlayer.getEntityData().func_74780_a("GHuanCun", 0.0d);
        }
    }
}
