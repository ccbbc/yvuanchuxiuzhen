package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeHuanZongBuff2Do.class */
public class ProcedureHeHuanZongBuff2Do extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeHuanZongBuff2Do(ElementsYvanchuyaoshouMod instance) {
        super(instance, 313);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.func_145748_c_().func_150260_c().contains("合欢宗")) {
            return;
        }
        if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
            if (!entityPlayer.getEntityData().func_74767_n("合欢宗2")) {
                if (entityPlayer instanceof EntityLivingBase) {
                    ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 40, 1));
                }
                entityPlayer.func_70097_a(DamageSource.field_76380_i, 924.0f);
                entityPlayer.getEntityData().func_74757_a("合欢宗2", true);
                entityPlayer.getEntityData().func_74757_a("魔修撞击", true);
            }
            entityPlayer.getEntityData().func_74780_a("合欢宗2计时", entityPlayer.getEntityData().func_74769_h("合欢宗2计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("合欢宗2计时") >= 20.0d) {
                entityPlayer.getEntityData().func_74757_a("合欢宗2", false);
                entityPlayer.getEntityData().func_74757_a("魔修撞击", false);
                entityPlayer.getEntityData().func_74780_a("合欢宗2计时", 0.0d);
            }
        }
    }
}
