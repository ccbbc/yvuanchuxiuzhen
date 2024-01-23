package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan04;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan05;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan06;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan14;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan15;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan16;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureYiHuoHe02RightClickDo.class */
public class ProcedureYiHuoHe02RightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYiHuoHe02RightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 293);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (Math.random() <= 0.2d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemHuoyan04.block, 1));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
        } else if (Math.random() <= 0.2d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn2 = new EntityItem(world, x, y, z, new ItemStack(ItemHuoyan14.block, 1));
                entityToSpawn2.func_174867_a(10);
                world.func_72838_d(entityToSpawn2);
            }
        } else if (Math.random() <= 0.1d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn3 = new EntityItem(world, x, y, z, new ItemStack(ItemHuoyan05.block, 1));
                entityToSpawn3.func_174867_a(10);
                world.func_72838_d(entityToSpawn3);
            }
        } else if (Math.random() <= 0.1d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn4 = new EntityItem(world, x, y, z, new ItemStack(ItemHuoyan15.block, 1));
                entityToSpawn4.func_174867_a(10);
                world.func_72838_d(entityToSpawn4);
            }
        } else if (Math.random() <= 0.05d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn5 = new EntityItem(world, x, y, z, new ItemStack(ItemHuoyan06.block, 1));
                entityToSpawn5.func_174867_a(10);
                world.func_72838_d(entityToSpawn5);
            }
        } else if (Math.random() <= 0.05d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn6 = new EntityItem(world, x, y, z, new ItemStack(ItemHuoyan16.block, 1));
                entityToSpawn6.func_174867_a(10);
                world.func_72838_d(entityToSpawn6);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("打开了异火盒，但是空空如也"), false);
        }
        itemstack.func_190918_g(1);
    }
}
