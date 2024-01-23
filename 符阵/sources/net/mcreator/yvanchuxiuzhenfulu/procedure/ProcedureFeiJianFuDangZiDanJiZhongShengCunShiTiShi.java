package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFeiJianFuDangZiDanJiZhongShengCunShiTiShi.class */
public class ProcedureFeiJianFuDangZiDanJiZhongShengCunShiTiShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFeiJianFuDangZiDanJiZhongShengCunShiTiShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 281);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.func_70097_a(DamageSource.field_76377_j, 30.0f);
    }
}
