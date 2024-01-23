package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockHongSongShuMiao2;
import net.mcreator.yvanchuliandan.block.BlockLingTaoShuMiao2;
import net.mcreator.yvanchuliandan.block.BlockQingLiShuMiao2;
import net.mcreator.yvanchuliandan.item.ItemHongSongShuMiao;
import net.mcreator.yvanchuliandan.item.ItemLingTaoShuMiao;
import net.mcreator.yvanchuliandan.item.ItemQingLiShuMiao;
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
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureGuoShuFangZhi.class */
public class ProcedureGuoShuFangZhi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureGuoShuFangZhi(ElementsYvanchuliandanMod instance) {
        super(instance, 762);
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
        if ((world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150349_c.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150346_d.func_176203_a(0).func_177230_c()) && world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            if (itemstack.func_77973_b() == new ItemStack(ItemLingTaoShuMiao.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockLingTaoShuMiao2.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemQingLiShuMiao.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockQingLiShuMiao2.block.func_176223_P(), 3);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemHongSongShuMiao.block, 1).func_77973_b()) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockHongSongShuMiao2.block.func_176223_P(), 3);
            }
            world.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("block.grass.place")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
            if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
                itemstack.func_190918_g(1);
            }
        }
    }
}
