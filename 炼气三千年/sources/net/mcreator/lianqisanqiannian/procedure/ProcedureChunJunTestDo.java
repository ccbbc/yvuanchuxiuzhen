package net.mcreator.lianqisanqiannian.procedure;

import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureChunJunTestDo.class */
public class ProcedureChunJunTestDo extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureChunJunTestDo(ElementsLianqisanqiannianMod instance) {
        super(instance, 19);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74778_a("TiZhi", "天妒之体");
        entityPlayer.getEntityData().func_74780_a("TiZhiNum", 11.0d);
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("已设置"), false);
        }
        entityPlayer.getEntityData().func_74757_a("JinLingGen", true);
        entityPlayer.getEntityData().func_74757_a("ShuiLingGen", true);
        entityPlayer.getEntityData().func_74757_a("MuLingGen", true);
        entityPlayer.getEntityData().func_74757_a("HuoLingGen", true);
        entityPlayer.getEntityData().func_74757_a("TuLingGen", true);
        entityPlayer.getEntityData().func_74780_a("LingGenNum", 5.0d);
        entityPlayer.getEntityData().func_74778_a("LingGen", "金木水火土");
    }
}
