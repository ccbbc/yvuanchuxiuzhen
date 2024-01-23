package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0502;
import net.mcreator.yvanchuyaoshou.potion.PotionCaientity1502;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYingXiaoShouJi.class */
public class ProcedureYingXiaoShouJi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYingXiaoShouJi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu0502.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70690_d(new PotionEffect(PotionCaientity1502.potion, 300, 0, true, true));
        }
        $_dependencies.put("entity", entityLivingBase);
        ProcedureShouJiNbt.executeProcedure($_dependencies);
    }
}
