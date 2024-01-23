package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.mcreator.yvanchujiguan.entity.EntityPutuan;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedurePutuan01RightClickedOnBlock.class */
public class ProcedurePutuan01RightClickedOnBlock extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePutuan01RightClickedOnBlock(ElementsYvanchujiguanMod instance) {
        super(instance, 39);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityPutuan.EntityCustom entityCustom;
        if (dependencies.get("direction") == null || dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EnumFacing direction = (EnumFacing) dependencies.get("direction");
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (direction == EnumFacing.UP) {
            if (!world.field_72995_K && (entityCustom = new EntityPutuan.EntityCustom(world)) != null) {
                entityCustom.func_70012_b(x + 0.5d, y + 1, z + 0.5d, world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                world.func_72838_d(entityCustom);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
        }
    }
}
