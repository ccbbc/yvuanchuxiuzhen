package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.block.BlockCaientity1504;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu05;
import net.mcreator.yvanchuyaoshou.item.ItemCaientity1501;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureCaientity1503OnBlockRightClicked.class */
public class ProcedureCaientity1503OnBlockRightClicked extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaientity1503OnBlockRightClicked(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu05.ENTITYID);
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
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemCaientity1501.block, 1).func_77973_b()) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
            world.func_180501_a(new BlockPos(x, y, z), BlockCaientity1504.block.func_176223_P(), 3);
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemCaientity1501.block, 1).func_77973_b()) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
            world.func_180501_a(new BlockPos(x, y, z), BlockCaientity1504.block.func_176223_P(), 3);
        }
    }
}
