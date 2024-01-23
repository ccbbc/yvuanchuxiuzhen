package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureDaoPaoZengYiYaoShuiXiaoGuoChiXuShiMeiKeFaSheng.class */
public class ProcedureDaoPaoZengYiYaoShuiXiaoGuoChiXuShiMeiKeFaSheng extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDaoPaoZengYiYaoShuiXiaoGuoChiXuShiMeiKeFaSheng(ElementsFabaokuozhanMod instance) {
        super(instance, 385);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        entityLivingBase.getEntityData().func_74780_a("道袍1回复tick", entityLivingBase.getEntityData().func_74769_h("道袍1回复tick") + 1.0d);
        if (entityLivingBase.getEntityData().func_74769_h("道袍1回复tick") >= 20.0d) {
            entityLivingBase.getEntityData().func_74780_a("道袍1回复tick", 0.0d);
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70606_j((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) + 1.0f);
            }
        }
    }
}
