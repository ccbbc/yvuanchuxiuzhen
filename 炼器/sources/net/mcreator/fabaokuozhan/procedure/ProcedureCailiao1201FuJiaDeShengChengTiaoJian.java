package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCailiao1201FuJiaDeShengChengTiaoJian.class */
public class ProcedureCailiao1201FuJiaDeShengChengTiaoJian extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCailiao1201FuJiaDeShengChengTiaoJian(ElementsFabaokuozhanMod instance) {
        super(instance, 280);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (Math.random() < 0.1d) {
            return true;
        }
        return false;
    }
}
