package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenModVariables;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSoulGrassDestruction.class */
public class ProcedureSoulGrassDestruction extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSoulGrassDestruction(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 494);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!YvanchuxiuzhenModVariables.MapVariables.get(world).FirstJoinWorld) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(Item.func_111206_d("yvanchuliandan:yaochu"), 1).func_77973_b() && Math.random() <= 0.01d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:thunder_repelling_charm"), 1));
                    entityToSpawn.func_174867_a(10);
                    world.func_72838_d(entityToSpawn);
                }
                YvanchuxiuzhenModVariables.MapVariables.get(world).FirstJoinWorld = true;
                YvanchuxiuzhenModVariables.MapVariables.get(world).syncData(world);
            }
        }
    }
}
