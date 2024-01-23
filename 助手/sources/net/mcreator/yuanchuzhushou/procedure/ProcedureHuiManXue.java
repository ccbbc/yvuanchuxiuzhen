package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureHuiManXue.class */
public class ProcedureHuiManXue extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureHuiManXue(ElementsYuanchuzhushouMod instance) {
        super(instance, 24);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70606_j(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
        }
        entityLivingBase.getEntityData().func_74780_a("快捷使用编号", 1.0d);
        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已回满气血"), false);
        }
    }
}
