package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureMainHudHide.class */
public class ProcedureMainHudHide extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMainHudHide(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 342);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return false;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
            if (entityPlayer.func_70003_b(2, "") && !entityPlayer.getEntityData().func_74767_n("LingQiFly")) {
                return false;
            }
            return true;
        }
        return false;
    }
}
