package net.mcreator.yvanchuyaoshou.world.structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureJiegou2801OnStructureInstanceGenerated;
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

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/world/structure/StructureJiegou2801.class */
public class StructureJiegou2801 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public StructureJiegou2801(ElementsYvanchuyaoshouMod instance) {
        super(instance, 124);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        Template template;
        boolean dimensionCriteria = false;
        if (dimID == 0) {
            dimensionCriteria = true;
        }
        if (dimensionCriteria && random.nextInt(1000000) + 1 <= 40000) {
            int count = random.nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = i2 + random.nextInt(16) + 8;
                int k = k2 + random.nextInt(16) + 8;
                int height = 255;
                if (0 != 0) {
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
                boolean biomeCriteria = false;
                Biome biome = world.func_180494_b(new BlockPos(i, j, k));
                if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("yvanchuyaoshou:shengtai15"))) {
                    biomeCriteria = true;
                }
                if (biomeCriteria) {
                    if (world.field_72995_K || (template = ((WorldServer) world).func_184163_y().func_186237_a(world.func_73046_m(), new ResourceLocation(YvanchuyaoshouMod.MODID, "jiegou2801"))) == null) {
                        return;
                    }
                    Rotation rotation = Rotation.values()[random.nextInt(3)];
                    Mirror mirror = Mirror.values()[random.nextInt(2)];
                    BlockPos spawnTo = new BlockPos(i, j + 2, k);
                    IBlockState iblockstate = world.func_180495_p(spawnTo);
                    world.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                    template.func_186260_a(world, spawnTo, new PlacementSettings().func_186220_a(rotation).func_186214_a(mirror).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                    int x = spawnTo.func_177958_n();
                    int y = spawnTo.func_177956_o();
                    int z = spawnTo.func_177952_p();
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureJiegou2801OnStructureInstanceGenerated.executeProcedure($_dependencies);
                }
            }
        }
    }
}
