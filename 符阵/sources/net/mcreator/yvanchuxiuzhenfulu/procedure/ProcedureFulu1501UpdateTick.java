package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu1501UpdateTick.class */
public class ProcedureFulu1501UpdateTick extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu1501UpdateTick(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 100);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick$3] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick$4] */
    /* JADX WARN: Type inference failed for: r2v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        Template template;
        Template template2;
        Template template3;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("fulu15", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "fulu15") + 1.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "fulu15") == 1.0d) {
            if (!((World) worldServer).field_72995_K && (template3 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu1501"))) != null) {
                BlockPos spawnTo = new BlockPos(x - 10, y - 32, z - 10);
                IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
                worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                template3.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "fulu15") == 2.0d) {
            if (!((World) worldServer).field_72995_K && (template2 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu1502"))) != null) {
                BlockPos spawnTo2 = new BlockPos(x - 16, y - 32, z - 16);
                IBlockState iblockstate2 = worldServer.func_180495_p(spawnTo2);
                worldServer.func_184138_a(spawnTo2, iblockstate2, iblockstate2, 3);
                template2.func_186260_a(worldServer, spawnTo2, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1501UpdateTick.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "fulu15") == 3.0d) {
            if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu1503"))) != null) {
                BlockPos spawnTo3 = new BlockPos(x - 16, y - 32, z - 16);
                IBlockState iblockstate3 = worldServer.func_180495_p(spawnTo3);
                worldServer.func_184138_a(spawnTo3, iblockstate3, iblockstate3, 3);
                template.func_186260_a(worldServer, spawnTo3, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            worldServer.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
