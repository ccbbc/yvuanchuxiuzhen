package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureTestItem1Do.class */
public class ProcedureTestItem1Do extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTestItem1Do(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 321);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("境界突破附加概率", entityPlayer.getEntityData().func_74769_h("境界突破附加概率") + 0.1d);
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("境界突破总概率： " + new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h("境界突破概率") + entityPlayer.getEntityData().func_74769_h("境界突破附加概率")) * 100.0d) + "%"), false);
        }
        entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
    }
}
