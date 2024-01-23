package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoSect.class */
public class ProcedureDanYaoSect extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoSect(ElementsYvanchuliandanMod instance) {
        super(instance, 953);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("宗门丹药级别") > 0.0d) {
            if (entityPlayer.getEntityData().func_74769_h("DanYaoSect" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("宗门丹药级别"))) <= 0.0d) {
                entityPlayer.getEntityData().func_74780_a("DanYaoSect" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("宗门丹药级别")), 1.0d);
                entityPlayer.getEntityData().func_74780_a(entityPlayer.getEntityData().func_74779_i("宗门丹药数值类型"), entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("宗门丹药数值类型")) + entityPlayer.getEntityData().func_74769_h("宗门丹药数值"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("当前类型丹药已达服用次数上限,下次服用同境界散修/宗门特供丹药时,无药效"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前类型丹药已达服用次数上限,本次服用同境界散修/宗门特供丹药,无药效"), false);
            }
        }
    }
}
