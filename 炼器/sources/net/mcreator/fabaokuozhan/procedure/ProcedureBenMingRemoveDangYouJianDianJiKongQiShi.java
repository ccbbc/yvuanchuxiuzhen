package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBenMingRemoveDangYouJianDianJiKongQiShi.class */
public class ProcedureBenMingRemoveDangYouJianDianJiKongQiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBenMingRemoveDangYouJianDianJiKongQiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 516);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        double NumberCycles = 0.0d;
        entity.getEntityData().func_74778_a("临时UID", "");
        for (int index0 = 0; index0 < 16; index0++) {
            NumberCycles += 1.0d;
            entity.getEntityData().func_74780_a("BenMingUID2", new Random().nextInt(61) + 1);
            entity.getEntityData().func_74778_a("临时UID", entity.getEntityData().func_74779_i("临时UID") + "" + "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring((int) entity.getEntityData().func_74769_h("BenMingUID2"), (int) (entity.getEntityData().func_74769_h("BenMingUID2") + 1.0d)));
            if (new DecimalFormat("0.0").format(NumberCycles / 4.0d).contains(".0") && NumberCycles < 16.0d) {
                entity.getEntityData().func_74778_a("临时UID", entity.getEntityData().func_74779_i("临时UID") + "-");
            }
        }
        entity.getEntityData().func_74778_a("ChaTan1", entity.getEntityData().func_74779_i("临时UID"));
    }
}
