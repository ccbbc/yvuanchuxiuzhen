package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao1201;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureMianyiduwuCommandExecuted.class */
public class ProcedureMianyiduwuCommandExecuted extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMianyiduwuCommandExecuted(ElementsFabaokuozhanMod instance) {
        super(instance, 134);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [net.mcreator.fabaokuozhan.procedure.ProcedureMianyiduwuCommandExecuted$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [net.mcreator.fabaokuozhan.procedure.ProcedureMianyiduwuCommandExecuted$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemFabao1201.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemFabao1201.block, 1).func_77973_b() && !(entityLivingBase instanceof EntityItem)) {
                entityLivingBase.func_70097_a(DamageSource.field_76376_m, new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureMianyiduwuCommandExecuted.1
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureMianyiduwuCommandExecuted.2
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
            }
        }
    }
}
