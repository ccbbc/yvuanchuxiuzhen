package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHunDunJianShiFu;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureHunDunJianShiFuDangZiDanJiZhongFangKuaiShi.class */
public class ProcedureHunDunJianShiFuDangZiDanJiZhongFangKuaiShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureHunDunJianShiFuDangZiDanJiZhongFangKuaiShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 310);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemHunDunJianShiFu.block, 1));
            entityToSpawn.func_174867_a(10);
            world.func_72838_d(entityToSpawn);
        }
    }
}
