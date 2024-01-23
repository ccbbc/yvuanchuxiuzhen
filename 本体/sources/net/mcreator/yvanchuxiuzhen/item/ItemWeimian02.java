package net.mcreator.yvanchuxiuzhen.item;

import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.mcreator.yvanchuxiuzhen.world.WorldWeimian02;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemWeimian02.class */
public class ItemWeimian02 extends Item {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:weimian02")
    public static final Item block = null;

    public ItemWeimian02() {
        this.field_77777_bU = 1;
        func_77656_e(64);
        func_77637_a(TabFenlei01.tab);
    }

    public EnumActionResult func_180614_a(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        BlockPos pos2 = pos.func_177972_a(facing);
        ItemStack itemstack = entity.func_184586_b(hand);
        if (!entity.func_175151_a(pos2, facing, itemstack)) {
            return EnumActionResult.FAIL;
        }
        if (world.func_175623_d(pos2)) {
            WorldWeimian02.portal.portalSpawn(world, pos2);
        }
        itemstack.func_77972_a(1, entity);
        return EnumActionResult.SUCCESS;
    }
}
