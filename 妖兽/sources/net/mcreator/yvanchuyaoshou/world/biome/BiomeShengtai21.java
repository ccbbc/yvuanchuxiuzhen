package net.mcreator.yvanchuyaoshou.world.biome;

import java.util.Iterator;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.block.BlockFangkuai106;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu01;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/world/biome/BiomeShengtai21.class */
public class BiomeShengtai21 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:shengtai21")
    public static final BiomeGenCustom biome = null;

    public BiomeShengtai21(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu01.ENTITYID);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.biomes.add(() -> {
            return new BiomeGenCustom();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void init(FMLInitializationEvent event) {
        BiomeManager.addSpawnBiome(biome);
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/world/biome/BiomeShengtai21$BiomeGenCustom.class */
    public static class BiomeGenCustom extends Biome {
        public BiomeGenCustom() {
            super(new Biome.BiomeProperties("飞升之地").func_185395_b(0.2f).func_185398_c(0.0f).func_185402_a(-10329241).func_185400_d(0.0f).func_185410_a(1.0f));
            setRegistryName("shengtai21");
            this.field_76752_A = Blocks.field_150349_c.func_176223_P();
            this.field_76753_B = Blocks.field_150348_b.func_176203_a(0);
            this.field_76760_I.field_76832_z = 1;
            this.field_76760_I.field_76802_A = 4;
            this.field_76760_I.field_76803_B = 4;
            this.field_76760_I.field_76798_D = 0;
            this.field_76760_I.field_76807_J = 0;
            this.field_76760_I.field_76799_E = 0;
            this.field_76760_I.field_76800_F = 0;
            this.field_76760_I.field_76805_H = 0;
            this.field_76760_I.field_76801_G = 0;
            this.field_76761_J.clear();
            this.field_76762_K.clear();
            this.field_76755_L.clear();
            this.field_82914_M.clear();
        }

        @SideOnly(Side.CLIENT)
        public int func_180627_b(BlockPos pos) {
            return -9003648;
        }

        @SideOnly(Side.CLIENT)
        public int func_180625_c(BlockPos pos) {
            return -9003648;
        }

        @SideOnly(Side.CLIENT)
        public int func_76731_a(float currentTemperature) {
            return -6843770;
        }

        public WorldGenAbstractTree func_150567_a(Random rand) {
            return new CustomTree();
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/world/biome/BiomeShengtai21$CustomTree.class */
    static class CustomTree extends WorldGenAbstractTree {
        CustomTree() {
            super(false);
        }

        public boolean func_180709_b(World world, Random rand, BlockPos position) {
            int height = rand.nextInt(5) + 100;
            boolean spawnTree = true;
            if (position.func_177956_o() >= 1 && position.func_177956_o() + height + 1 <= world.func_72800_K()) {
                for (int j = position.func_177956_o(); j <= position.func_177956_o() + 1 + height; j++) {
                    int k = 1;
                    if (j == position.func_177956_o()) {
                        k = 0;
                    }
                    if (j >= (position.func_177956_o() + height) - 1) {
                        k = 2;
                    }
                    for (int px = position.func_177958_n() - k; px <= position.func_177958_n() + k && spawnTree; px++) {
                        for (int pz = position.func_177952_p() - k; pz <= position.func_177952_p() + k && spawnTree; pz++) {
                            if (j >= 0 && j < world.func_72800_K()) {
                                if (!isReplaceable(world, new BlockPos(px, j, pz))) {
                                    spawnTree = false;
                                }
                            } else {
                                spawnTree = false;
                            }
                        }
                    }
                }
                if (!spawnTree) {
                    return false;
                }
                Block ground = world.func_180495_p(position.func_177982_a(0, -1, 0)).func_177230_c();
                Block ground2 = world.func_180495_p(position.func_177982_a(0, -2, 0)).func_177230_c();
                if (ground == Blocks.field_150349_c.func_176223_P().func_177230_c() || ground == Blocks.field_150348_b.func_176203_a(0).func_177230_c()) {
                    if (ground2 != Blocks.field_150349_c.func_176223_P().func_177230_c() && ground2 != Blocks.field_150348_b.func_176203_a(0).func_177230_c()) {
                        return false;
                    }
                    world.func_180495_p(position.func_177977_b());
                    if (position.func_177956_o() < (world.func_72800_K() - height) - 1) {
                        world.func_180501_a(position.func_177977_b(), Blocks.field_150348_b.func_176203_a(0), 2);
                        for (int genh = (position.func_177956_o() - 3) + height; genh <= position.func_177956_o() + height; genh++) {
                            int i4 = genh - (position.func_177956_o() + height);
                            int j1 = (int) (1.0d - (i4 * 0.5d));
                            for (int k1 = position.func_177958_n() - j1; k1 <= position.func_177958_n() + j1; k1++) {
                                for (int i2 = position.func_177952_p() - j1; i2 <= position.func_177952_p() + j1; i2++) {
                                    int j2 = i2 - position.func_177952_p();
                                    if (Math.abs(position.func_177958_n()) != j1 || Math.abs(j2) != j1 || (rand.nextInt(2) != 0 && i4 != 0)) {
                                        BlockPos blockpos = new BlockPos(k1, genh, i2);
                                        IBlockState state = world.func_180495_p(blockpos);
                                        if (state.func_177230_c().isAir(state, world, blockpos) || state.func_177230_c().isLeaves(state, world, blockpos) || state.func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || state.func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
                                            func_175903_a(world, blockpos, Blocks.field_150350_a.func_176223_P());
                                        }
                                    }
                                }
                            }
                        }
                        for (int genh2 = 0; genh2 < height; genh2++) {
                            BlockPos genhPos = position.func_177981_b(genh2);
                            IBlockState state2 = world.func_180495_p(genhPos);
                            if (state2.func_177230_c().isAir(state2, world, genhPos) || state2.func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || state2.func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
                                func_175903_a(world, position.func_177981_b(genh2), BlockFangkuai106.block.func_176223_P());
                                if (genh2 > 0) {
                                    if (rand.nextInt(3) > 0 && world.func_175623_d(position.func_177982_a(-1, genh2, 0))) {
                                        func_175903_a(world, position.func_177982_a(-1, genh2, 0), Blocks.field_150350_a.func_176223_P());
                                    }
                                    if (rand.nextInt(3) > 0 && world.func_175623_d(position.func_177982_a(1, genh2, 0))) {
                                        func_175903_a(world, position.func_177982_a(1, genh2, 0), Blocks.field_150350_a.func_176223_P());
                                    }
                                    if (rand.nextInt(3) > 0 && world.func_175623_d(position.func_177982_a(0, genh2, -1))) {
                                        func_175903_a(world, position.func_177982_a(0, genh2, -1), Blocks.field_150350_a.func_176223_P());
                                    }
                                    if (rand.nextInt(3) > 0 && world.func_175623_d(position.func_177982_a(0, genh2, 1))) {
                                        func_175903_a(world, position.func_177982_a(0, genh2, 1), Blocks.field_150350_a.func_176223_P());
                                    }
                                }
                            }
                        }
                        for (int genh3 = (position.func_177956_o() - 3) + height; genh3 <= position.func_177956_o() + height; genh3++) {
                            int k4 = (int) (1.0d - ((genh3 - (position.func_177956_o() + height)) * 0.5d));
                            for (int genx = position.func_177958_n() - k4; genx <= position.func_177958_n() + k4; genx++) {
                                for (int genz = position.func_177952_p() - k4; genz <= position.func_177952_p() + k4; genz++) {
                                    BlockPos bpos = new BlockPos(genx, genh3, genz);
                                    IBlockState state3 = world.func_180495_p(bpos);
                                    if (state3.func_177230_c().isLeaves(state3, world, bpos) || state3.func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
                                        BlockPos blockpos1 = bpos.func_177968_d();
                                        BlockPos blockpos2 = bpos.func_177976_e();
                                        BlockPos blockpos3 = bpos.func_177974_f();
                                        BlockPos blockpos4 = bpos.func_177978_c();
                                        if (rand.nextInt(4) == 0 && world.func_175623_d(blockpos2)) {
                                            addVines(world, blockpos2);
                                        }
                                        if (rand.nextInt(4) == 0 && world.func_175623_d(blockpos3)) {
                                            addVines(world, blockpos3);
                                        }
                                        if (rand.nextInt(4) == 0 && world.func_175623_d(blockpos4)) {
                                            addVines(world, blockpos4);
                                        }
                                        if (rand.nextInt(4) == 0 && world.func_175623_d(blockpos1)) {
                                            addVines(world, blockpos1);
                                        }
                                    }
                                }
                            }
                        }
                        if (rand.nextInt(4) == 0 && height > 5) {
                            for (int hlevel = 0; hlevel < 2; hlevel++) {
                                Iterator it = EnumFacing.Plane.HORIZONTAL.iterator();
                                while (it.hasNext()) {
                                    EnumFacing enumfacing = (EnumFacing) it.next();
                                    if (rand.nextInt(4 - hlevel) == 0) {
                                        EnumFacing enumfacing1 = enumfacing.func_176734_d();
                                        func_175903_a(world, position.func_177982_a(enumfacing1.func_82601_c(), (height - 5) + hlevel, enumfacing1.func_82599_e()), Blocks.field_150350_a.func_176223_P());
                                    }
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        private void addVines(World world, BlockPos pos) {
            func_175903_a(world, pos, Blocks.field_150350_a.func_176223_P());
            BlockPos blockpos = pos.func_177977_b();
            for (int i = 5; world.func_175623_d(blockpos) && i > 0; i--) {
                func_175903_a(world, blockpos, Blocks.field_150350_a.func_176223_P());
                blockpos = blockpos.func_177977_b();
            }
        }

        protected boolean func_150523_a(Block blockType) {
            return blockType.func_176223_P().func_185904_a() == Material.field_151579_a || blockType == BlockFangkuai106.block.func_176223_P().func_177230_c() || blockType == Blocks.field_150350_a.func_176223_P().func_177230_c() || blockType == Blocks.field_150349_c.func_176223_P().func_177230_c() || blockType == Blocks.field_150348_b.func_176203_a(0).func_177230_c();
        }

        protected void func_175921_a(World world, BlockPos pos) {
            if (world.func_180495_p(pos).func_177230_c() != Blocks.field_150348_b.func_176203_a(0).func_177230_c()) {
                func_175903_a(world, pos, Blocks.field_150348_b.func_176203_a(0));
            }
        }

        public boolean isReplaceable(World world, BlockPos pos) {
            IBlockState state = world.func_180495_p(pos);
            return state.func_177230_c().isAir(state, world, pos) || func_150523_a(state.func_177230_c()) || state.func_177230_c().func_176200_f(world, pos);
        }
    }
}
