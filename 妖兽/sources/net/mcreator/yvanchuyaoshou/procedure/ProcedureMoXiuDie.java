package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.item.ItemChuWuDai02;
import net.mcreator.yvanchuyaoshou.item.ItemChuWuDai04;
import net.mcreator.yvanchuyaoshou.item.ItemChuWuDai06;
import net.mcreator.yvanchuyaoshou.item.ItemChuWuDai08;
import net.mcreator.yvanchuyaoshou.item.ItemChuWuDai10;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureMoXiuDie.class */
public class ProcedureMoXiuDie extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMoXiuDie(ElementsYvanchuyaoshouMod instance) {
        super(instance, 263);
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
        if (entity.func_145748_c_().func_150260_c().contains("炼气")) {
            if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn = new EntityItem(world, x, y + 1, z, new ItemStack(ItemChuWuDai02.block, 1));
                    entityToSpawn.func_174867_a(10);
                    world.func_72838_d(entityToSpawn);
                }
            } else if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureSanXiuDie.executeProcedure($_dependencies);
            }
        } else if (entity.func_145748_c_().func_150260_c().contains("筑基")) {
            if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn2 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemChuWuDai04.block, 1));
                    entityToSpawn2.func_174867_a(10);
                    world.func_72838_d(entityToSpawn2);
                }
            } else if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureSanXiuDie.executeProcedure($_dependencies);
            }
        } else if (entity.func_145748_c_().func_150260_c().contains("结丹")) {
            if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn3 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemChuWuDai06.block, 1));
                    entityToSpawn3.func_174867_a(10);
                    world.func_72838_d(entityToSpawn3);
                }
            } else if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureSanXiuDie.executeProcedure($_dependencies);
            }
        } else if (entity.func_145748_c_().func_150260_c().contains("元婴")) {
            if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn4 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemChuWuDai08.block, 1));
                    entityToSpawn4.func_174867_a(10);
                    world.func_72838_d(entityToSpawn4);
                }
            } else if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureSanXiuDie.executeProcedure($_dependencies);
            }
        } else if (entity.func_145748_c_().func_150260_c().contains("化神")) {
            if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn5 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemChuWuDai10.block, 1));
                    entityToSpawn5.func_174867_a(10);
                    world.func_72838_d(entityToSpawn5);
                }
            } else if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("SouXun") * 0.05d)) {
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureSanXiuDie.executeProcedure($_dependencies);
            }
        }
    }
}
