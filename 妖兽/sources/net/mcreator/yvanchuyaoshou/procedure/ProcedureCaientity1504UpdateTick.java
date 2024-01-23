package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.block.BlockCaientity1503;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu04;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao02;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureCaientity1504UpdateTick.class */
public class ProcedureCaientity1504UpdateTick extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaientity1504UpdateTick(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu04.ENTITYID);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1504UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r2v14, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1504UpdateTick$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityYingXiao02.EntityCustom entityCustom;
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
                _tileEntity.getTileData().func_74780_a("jishi", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1504UpdateTick.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "jishi") + 1.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.VILLAGER_HAPPY, x, y, z, 10, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
        }
        if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1504UpdateTick.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "jishi") >= 60.0d) {
            if (!((World) worldServer).field_72995_K && (entityCustom = new EntityYingXiao02.EntityCustom(worldServer)) != null) {
                entityCustom.func_70012_b(x, y + 2, z, ((World) worldServer).field_73012_v.nextFloat() * 360.0f, 0.0f);
                worldServer.func_72838_d(entityCustom);
            }
            worldServer.func_180501_a(new BlockPos(x, y, z), BlockCaientity1503.block.func_176223_P(), 3);
        }
    }
}
