package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFangkuai10203;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockTaoShuMiao;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockXueTaoMuMiao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemTaoShuMiao1;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemWenYuMuShuMiao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemXueTaoMuShuMiao;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureTaoShuMiao1DangYouJianDianJiFangKuaiShi.class */
public class ProcedureTaoShuMiao1DangYouJianDianJiFangKuaiShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureTaoShuMiao1DangYouJianDianJiFangKuaiShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 486);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150349_c.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150346_d.func_176203_a(0).func_177230_c()) {
            if (itemstack.func_77973_b() == new ItemStack(ItemWenYuMuShuMiao.block, 1).func_77973_b()) {
                if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || (world.func_180495_p(new BlockPos(x, y + 1, z)).func_185904_a() == Material.field_151585_k && world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() != BlockFangkuai10203.block.func_176223_P().func_177230_c())) {
                    world.func_180501_a(new BlockPos(x, y + 1, z), BlockFangkuai10203.block.func_176223_P(), 3);
                    itemstack.func_190918_g(1);
                }
            } else if (itemstack.func_77973_b() == new ItemStack(ItemTaoShuMiao1.block, 1).func_77973_b() && (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || (world.func_180495_p(new BlockPos(x, y + 1, z)).func_185904_a() == Material.field_151585_k && world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() != BlockTaoShuMiao.block.func_176223_P().func_177230_c()))) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockTaoShuMiao.block.func_176223_P(), 3);
                itemstack.func_190918_g(1);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemXueTaoMuShuMiao.block, 1).func_77973_b()) {
                if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || (world.func_180495_p(new BlockPos(x, y + 1, z)).func_185904_a() == Material.field_151585_k && world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() != BlockXueTaoMuMiao.block.func_176223_P().func_177230_c())) {
                    world.func_180501_a(new BlockPos(x, y + 1, z), BlockXueTaoMuMiao.block.func_176223_P(), 3);
                    itemstack.func_190918_g(1);
                }
            }
        }
    }
}
