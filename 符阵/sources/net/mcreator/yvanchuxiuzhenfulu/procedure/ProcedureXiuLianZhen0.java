package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenFa1;
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
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureXiuLianZhen0.class */
public class ProcedureXiuLianZhen0 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureXiuLianZhen0(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 377);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        Template template;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        worldServer.func_180501_a(new BlockPos(x, y + 1, z), BlockZhenFa1.block.func_176223_P(), 3);
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y + 1, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("阵法", 8.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y + 1, z);
            TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
            IBlockState _bs2 = worldServer.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("阵法时间1", 1024.0d);
            }
            worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "taiji1"))) != null) {
            BlockPos spawnTo = new BlockPos(x - 12, y, z - 12);
            IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
            worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
            template.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
    }
}
