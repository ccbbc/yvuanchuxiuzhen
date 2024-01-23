package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao24MobIsHitWithTool.class */
public class ProcedureFabao24MobIsHitWithTool extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao24MobIsHitWithTool(ElementsFabaokuozhanMod instance) {
        super(instance, 219);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if ((itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("wudaoyizhan")) && !entity.getEntityData().func_74767_n("diaotou")) {
            entity.getEntityData().func_74757_a("diaotou", true);
            if ((entity instanceof EntitySkeleton) && !world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x + 0.5d, y, z + 0.5d, new ItemStack(Blocks.field_150465_bP, 1, 0));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
            if ((entity instanceof EntityZombie) && !world.field_72995_K) {
                EntityItem entityToSpawn2 = new EntityItem(world, x + 0.5d, y, z + 0.5d, new ItemStack(Blocks.field_150465_bP, 1, 2));
                entityToSpawn2.func_174867_a(10);
                world.func_72838_d(entityToSpawn2);
            }
            if ((entity instanceof EntityWitherSkeleton) && !world.field_72995_K) {
                EntityItem entityToSpawn3 = new EntityItem(world, x + 0.5d, y, z + 0.5d, new ItemStack(Blocks.field_150465_bP, 1, 1));
                entityToSpawn3.func_174867_a(10);
                world.func_72838_d(entityToSpawn3);
            }
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("wudaoyizhan", false);
        }
    }
}
