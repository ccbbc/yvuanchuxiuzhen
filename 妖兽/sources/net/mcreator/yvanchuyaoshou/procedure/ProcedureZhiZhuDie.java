package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityXueYuZhiZhu;
import net.mcreator.yvanchuyaoshou.item.ItemBloodChalcedony;
import net.mcreator.yvanchuyaoshou.item.ItemBloodJadeLimbSt;
import net.mcreator.yvanchuyaoshou.item.ItemYaodan0202;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureZhiZhuDie.class */
public class ProcedureZhiZhuDie extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhiZhuDie(ElementsYvanchuyaoshouMod instance) {
        super(instance, 373);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entity instanceof EntityXueYuZhiZhu.EntityCustom) {
            if (Math.random() <= 0.5d && !world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemYaodan0202.block, 1));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
            if (Math.random() <= 0.5d && !world.field_72995_K) {
                EntityItem entityToSpawn2 = new EntityItem(world, x, y, z, new ItemStack(ItemBloodChalcedony.block, 1));
                entityToSpawn2.func_174867_a(10);
                world.func_72838_d(entityToSpawn2);
            }
            if (Math.random() <= 0.5d) {
                for (int index0 = 0; index0 < 8; index0++) {
                    if (!world.field_72995_K) {
                        EntityItem entityToSpawn3 = new EntityItem(world, x, y, z, new ItemStack(ItemBloodJadeLimbSt.block, 1));
                        entityToSpawn3.func_174867_a(10);
                        world.func_72838_d(entityToSpawn3);
                    }
                }
            }
        }
    }
}
