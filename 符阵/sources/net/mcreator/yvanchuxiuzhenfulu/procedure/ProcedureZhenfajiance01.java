package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi01;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi02;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi03;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfajiance01.class */
public class ProcedureZhenfajiance01 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfajiance01(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 178);
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01$6] */
    /* JADX WARN: Type inference failed for: r0v155, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01$5] */
    /* JADX WARN: Type inference failed for: r0v194, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01$4] */
    /* JADX WARN: Type inference failed for: r0v233, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01$3] */
    /* JADX WARN: Type inference failed for: r0v260, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01$2] */
    /* JADX WARN: Type inference failed for: r0v287, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01$1] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01$7] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer.func_180495_p(new BlockPos(x + 2, y, z)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y, z + 2)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y, z - 2)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                IBlockState _bs = worldServer.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74778_a("zhenfamingcheng", "聚灵阵");
                }
                worldServer.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
            }
        }
        if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() == BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01.2
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74778_a("zhenfamingcheng", "补元阵");
                }
                worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
            }
        }
        if (worldServer.func_180495_p(new BlockPos(x + 2, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z - 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z + 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01.3
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74778_a("zhenfamingcheng", "落雷阵");
                }
                worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
            }
        }
        if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z + 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z + 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z - 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z - 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01.4
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74778_a("zhenfamingcheng", "熔岩阵");
                }
                worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
            }
        }
        if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z - 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z + 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z - 1)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z + 2)).func_177230_c() == BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01.5
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74778_a("zhenfamingcheng", "裂空阵");
                }
                worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
            }
        }
        if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z + 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z + 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z + 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z - 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z - 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z - 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z - 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01.6
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = worldServer.func_175625_s(_bp6);
                IBlockState _bs6 = worldServer.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74778_a("zhenfamingcheng", "晨辉阵");
                }
                worldServer.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
            }
        }
        if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z + 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z + 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y, z - 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y, z - 2)).func_177230_c() == BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfajiance01.7
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = worldServer.func_175625_s(_bp7);
                IBlockState _bs7 = worldServer.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74778_a("zhenfamingcheng", "回灵阵");
                }
                worldServer.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
            }
        }
    }
}
