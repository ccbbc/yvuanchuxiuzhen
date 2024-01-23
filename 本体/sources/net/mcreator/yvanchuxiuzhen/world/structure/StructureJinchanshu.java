package net.mcreator.yvanchuxiuzhen.world.structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.block.BlockFangkuai001;
import net.mcreator.yvanchuxiuzhen.world.WorldWeimian02;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/structure/StructureJinchanshu.class */
public class StructureJinchanshu extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public StructureJinchanshu(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 252);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        Template template;
        boolean dimensionCriteria = false;
        boolean isNetherType = false;
        if (dimID == WorldWeimian02.DIMID) {
            dimensionCriteria = true;
            isNetherType = false;
        }
        if (dimensionCriteria && random.nextInt(1000000) + 1 <= 100000) {
            int count = random.nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = i2 + random.nextInt(16) + 8;
                int k = k2 + random.nextInt(16) + 8;
                int height = 255;
                if (isNetherType) {
                    boolean notpassed = true;
                    while (height > 0) {
                        if (notpassed && (world.func_175623_d(new BlockPos(i, height, k)) || !world.func_180495_p(new BlockPos(i, height, k)).func_177230_c().func_149688_o(world.func_180495_p(new BlockPos(i, height, k))).func_76230_c())) {
                            notpassed = false;
                        } else if (!notpassed && !world.func_175623_d(new BlockPos(i, height, k)) && world.func_180495_p(new BlockPos(i, height, k)).func_177230_c().func_149688_o(world.func_180495_p(new BlockPos(i, height, k))).func_76230_c()) {
                            break;
                        }
                        height--;
                    }
                } else {
                    while (height > 0 && (world.func_175623_d(new BlockPos(i, height, k)) || !world.func_180495_p(new BlockPos(i, height, k)).func_177230_c().func_149688_o(world.func_180495_p(new BlockPos(i, height, k))).func_76230_c())) {
                        height--;
                    }
                }
                int j = height - 1;
                IBlockState blockAt = world.func_180495_p(new BlockPos(i, j + 1, k));
                boolean blockCriteria = false;
                IBlockState require = BlockFangkuai001.block.func_176223_P();
                if (blockAt.func_177230_c() == require.func_177230_c()) {
                    blockCriteria = true;
                }
                if (blockCriteria) {
                    if (world.field_72995_K || (template = ((WorldServer) world).func_184163_y().func_186237_a(world.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jinchanshu"))) == null) {
                        return;
                    }
                    Rotation rotation = Rotation.NONE;
                    Mirror mirror = Mirror.NONE;
                    BlockPos spawnTo = new BlockPos(i, j + 2, k);
                    IBlockState iblockstate = world.func_180495_p(spawnTo);
                    world.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                    template.func_186260_a(world, spawnTo, new PlacementSettings().func_186220_a(rotation).func_186214_a(mirror).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                }
            }
        }
    }
}
