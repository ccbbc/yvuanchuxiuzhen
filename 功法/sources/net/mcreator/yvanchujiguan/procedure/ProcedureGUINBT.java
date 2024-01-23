package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGUINBT.class */
public class ProcedureGUINBT extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGUINBT(ElementsYvanchujiguanMod instance) {
        super(instance, 240);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ("_1_2_3_4_5_6_8_21_23_24_28_29_30_31_".contains("_" + itemstack.func_77973_b().getRegistryName().toString().substring(22, itemstack.func_77973_b().getRegistryName().toString().length()) + "_") && !entity.getEntityData().func_74779_i("GongFa名暂存").equals(itemstack.func_77973_b().getRegistryName().toString().substring(22, itemstack.func_77973_b().getRegistryName().toString().length()))) {
            entity.getEntityData().func_74778_a("GongFa名暂存", itemstack.func_77973_b().getRegistryName().toString().substring(22, itemstack.func_77973_b().getRegistryName().toString().length()));
            double a = 3.0d;
            for (int index0 = 0; index0 < 19; index0++) {
                entity.getEntityData().func_74778_a("GongFaGui" + new DecimalFormat("0").format(a), " ");
                a += 1.0d;
            }
            $_dependencies.put("entity", entity);
            ProcedureGongFaNbtSet.executeProcedure($_dependencies);
        }
    }
}
