package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockLingTu;
import net.mcreator.yvanchuliandan.block.BlockZhongZi10101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi1101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi11101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi12101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi13101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi15101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi16101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi17101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi18101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi19101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi20101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi2101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi21101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi22101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi23101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi24101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi25101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi26101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi3101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi4101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi5101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi6101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi7101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi8101;
import net.mcreator.yvanchuliandan.block.BlockZhongZi9101;
import net.mcreator.yvanchuliandan.block.BlockZhongZiHuangLongGuo1;
import net.mcreator.yvanchuliandan.block.BlockZhongZiJinHeLan1;
import net.mcreator.yvanchuliandan.block.BlockZhongZiJuLingCao1;
import net.mcreator.yvanchuliandan.block.BlockZhongZiQingYinHua1;
import net.mcreator.yvanchuliandan.block.BlockZhongZiYunLinHua1;
import net.mcreator.yvanchuliandan.item.ItemZhongZi101;
import net.mcreator.yvanchuliandan.item.ItemZhongZi11;
import net.mcreator.yvanchuliandan.item.ItemZhongZi1111;
import net.mcreator.yvanchuliandan.item.ItemZhongZi121;
import net.mcreator.yvanchuliandan.item.ItemZhongZi131;
import net.mcreator.yvanchuliandan.item.ItemZhongZi151;
import net.mcreator.yvanchuliandan.item.ItemZhongZi161;
import net.mcreator.yvanchuliandan.item.ItemZhongZi171;
import net.mcreator.yvanchuliandan.item.ItemZhongZi181;
import net.mcreator.yvanchuliandan.item.ItemZhongZi191;
import net.mcreator.yvanchuliandan.item.ItemZhongZi201;
import net.mcreator.yvanchuliandan.item.ItemZhongZi21;
import net.mcreator.yvanchuliandan.item.ItemZhongZi211;
import net.mcreator.yvanchuliandan.item.ItemZhongZi221;
import net.mcreator.yvanchuliandan.item.ItemZhongZi231;
import net.mcreator.yvanchuliandan.item.ItemZhongZi241;
import net.mcreator.yvanchuliandan.item.ItemZhongZi251;
import net.mcreator.yvanchuliandan.item.ItemZhongZi261;
import net.mcreator.yvanchuliandan.item.ItemZhongZi31;
import net.mcreator.yvanchuliandan.item.ItemZhongZi41;
import net.mcreator.yvanchuliandan.item.ItemZhongZi51;
import net.mcreator.yvanchuliandan.item.ItemZhongZi61;
import net.mcreator.yvanchuliandan.item.ItemZhongZi71;
import net.mcreator.yvanchuliandan.item.ItemZhongZi81;
import net.mcreator.yvanchuliandan.item.ItemZhongZi91;
import net.mcreator.yvanchuliandan.item.ItemZhongZiHuangLongGuo;
import net.mcreator.yvanchuliandan.item.ItemZhongZiJinHeLan;
import net.mcreator.yvanchuliandan.item.ItemZhongZiJuLingCao;
import net.mcreator.yvanchuliandan.item.ItemZhongZiQingYinHua;
import net.mcreator.yvanchuliandan.item.ItemZhongZiYunLinHua;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureZhongZi111.class */
public class ProcedureZhongZi111 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureZhongZi111(ElementsYvanchuliandanMod instance) {
        super(instance, 556);
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
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLingTu.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi11.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi1101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi21.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi2101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi31.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi3101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi41.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi4101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi51.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi5101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi61.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi6101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi71.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi7101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi81.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi8101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi91.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi9101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi101.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi10101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi1111.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi11101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi121.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi12101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi151.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi15101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi161.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi16101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi181.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi18101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi211.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi21101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi221.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi22101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi231.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi23101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi241.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi24101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi251.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi25101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZiHuangLongGuo.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZiHuangLongGuo1.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZiJinHeLan.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZiJinHeLan1.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi261.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi26101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi131.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi13101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi171.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi17101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi191.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi19101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZi201.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZi20101.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZiJuLingCao.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZiJuLingCao1.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZiQingYinHua.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZiQingYinHua1.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemZhongZiYunLinHua.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockZhongZiYunLinHua1.block.func_176223_P(), 3);
            }
            world.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("block.grass.place")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
            if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
                itemstack.func_190918_g(1);
            }
        }
    }
}
