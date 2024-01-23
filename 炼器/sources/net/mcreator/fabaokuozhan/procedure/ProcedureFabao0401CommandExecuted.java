package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao04;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao0401CommandExecuted.class */
public class ProcedureFabao0401CommandExecuted extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao0401CommandExecuted(ElementsFabaokuozhanMod instance) {
        super(instance, 242);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemFabao04.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemFabao04.block, 1).func_77973_b() && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70606_j((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) - 2.0f);
            }
        }
    }
}
