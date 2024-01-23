package net.mcreator.yuanchujianzhu.world.structure;

import java.util.Random;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.YuanchujianzhuMod;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/world/structure/StructureCangShuGe.class */
public class StructureCangShuGe extends ElementsYuanchujianzhuMod.ModElement {
    public StructureCangShuGe(ElementsYuanchujianzhuMod instance) {
        super(instance, 231);
    }

    @Override // net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod.ModElement
    public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        Template template;
        boolean dimensionCriteria = false;
        if (dimID == 0) {
            dimensionCriteria = true;
        }
        if (dimensionCriteria && random.nextInt(1000000) + 1 <= 1000) {
            int count = random.nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = i2 + random.nextInt(16) + 8;
                int k = k2 + random.nextInt(16) + 8;
                int height = 255;
                if (0 != 0) {
                    boolean notpassed = true;
                    while (height > 0) {
                        if (notpassed && world.func_175623_d(new BlockPos(i, height, k))) {
                            notpassed = false;
                        } else if (!notpassed && !world.func_175623_d(new BlockPos(i, height, k))) {
                            break;
                        }
                        height--;
                    }
                } else {
                    while (height > 0 && world.func_175623_d(new BlockPos(i, height, k))) {
                        height--;
                    }
                }
                int j = height - 1;
                boolean biomeCriteria = false;
                Biome biome = world.func_180494_b(new BlockPos(i, j, k));
                if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("plains"))) {
                    biomeCriteria = true;
                }
                if (biomeCriteria) {
                    if (world.field_72995_K || (template = ((WorldServer) world).func_184163_y().func_186237_a(world.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "cang_shu_ge"))) == null) {
                        return;
                    }
                    Rotation rotation = Rotation.values()[random.nextInt(3)];
                    Mirror mirror = Mirror.values()[random.nextInt(2)];
                    BlockPos spawnTo = new BlockPos(i, j + 2, k);
                    IBlockState iblockstate = world.func_180495_p(spawnTo);
                    world.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                    template.func_186260_a(world, spawnTo, new PlacementSettings().func_186220_a(rotation).func_186214_a(mirror).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                }
            }
        }
    }
}
