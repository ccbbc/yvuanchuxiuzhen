package net.mcreator.yuanchujianzhu.procedure;

import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.block.BlockBaoXiang01;
import net.mcreator.yuanchujianzhu.block.BlockBaoXiang02;
import net.mcreator.yuanchujianzhu.block.BlockBaoXiang03;
import net.mcreator.yuanchujianzhu.block.BlockBaoXiang04;
import net.mcreator.yuanchujianzhu.block.BlockBaoXiang05;
import net.mcreator.yuanchujianzhu.block.BlockDanXiang1;
import net.mcreator.yuanchujianzhu.block.BlockDanXiang2;
import net.mcreator.yuanchujianzhu.block.BlockDanXiang3;
import net.mcreator.yuanchujianzhu.block.BlockDanXiang4;
import net.mcreator.yuanchujianzhu.block.BlockDanXiang5;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang1;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang2;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang4;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang5;
import net.mcreator.yuanchujianzhu.block.BlockQixiang3;
import net.mcreator.yuanchujianzhu.block.BlockYaoShouBaoXiang04;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureTreasureChestLevel.class */
public class ProcedureTreasureChestLevel extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureTreasureChestLevel(ElementsYuanchujianzhuMod instance) {
        super(instance, 265);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockBaoXiang01.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("TreasureChestLevel", 1.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockBaoXiang02.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("TreasureChestLevel", 2.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockBaoXiang03.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("TreasureChestLevel", 3.0d);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockBaoXiang04.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp4 = new BlockPos(x, y, z);
            TileEntity _tileEntity4 = world.func_175625_s(_bp4);
            IBlockState _bs4 = world.func_180495_p(_bp4);
            if (_tileEntity4 != null) {
                _tileEntity4.getTileData().func_74780_a("TreasureChestLevel", 4.0d);
            }
            world.func_184138_a(_bp4, _bs4, _bs4, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockBaoXiang05.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74780_a("TreasureChestLevel", 5.0d);
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockDanXiang1.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp6 = new BlockPos(x, y, z);
            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
            IBlockState _bs6 = world.func_180495_p(_bp6);
            if (_tileEntity6 != null) {
                _tileEntity6.getTileData().func_74780_a("TreasureChestLevel", 1.0d);
            }
            world.func_184138_a(_bp6, _bs6, _bs6, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockDanXiang2.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp7 = new BlockPos(x, y, z);
            TileEntity _tileEntity7 = world.func_175625_s(_bp7);
            IBlockState _bs7 = world.func_180495_p(_bp7);
            if (_tileEntity7 != null) {
                _tileEntity7.getTileData().func_74780_a("TreasureChestLevel", 2.0d);
            }
            world.func_184138_a(_bp7, _bs7, _bs7, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockDanXiang3.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp8 = new BlockPos(x, y, z);
            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
            IBlockState _bs8 = world.func_180495_p(_bp8);
            if (_tileEntity8 != null) {
                _tileEntity8.getTileData().func_74780_a("TreasureChestLevel", 3.0d);
            }
            world.func_184138_a(_bp8, _bs8, _bs8, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockDanXiang4.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp9 = new BlockPos(x, y, z);
            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
            IBlockState _bs9 = world.func_180495_p(_bp9);
            if (_tileEntity9 != null) {
                _tileEntity9.getTileData().func_74780_a("TreasureChestLevel", 4.0d);
            }
            world.func_184138_a(_bp9, _bs9, _bs9, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockDanXiang5.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp10 = new BlockPos(x, y, z);
            TileEntity _tileEntity10 = world.func_175625_s(_bp10);
            IBlockState _bs10 = world.func_180495_p(_bp10);
            if (_tileEntity10 != null) {
                _tileEntity10.getTileData().func_74780_a("TreasureChestLevel", 5.0d);
            }
            world.func_184138_a(_bp10, _bs10, _bs10, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockQiXiang1.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp11 = new BlockPos(x, y, z);
            TileEntity _tileEntity11 = world.func_175625_s(_bp11);
            IBlockState _bs11 = world.func_180495_p(_bp11);
            if (_tileEntity11 != null) {
                _tileEntity11.getTileData().func_74780_a("TreasureChestLevel", 1.0d);
            }
            world.func_184138_a(_bp11, _bs11, _bs11, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockQiXiang2.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp12 = new BlockPos(x, y, z);
            TileEntity _tileEntity12 = world.func_175625_s(_bp12);
            IBlockState _bs12 = world.func_180495_p(_bp12);
            if (_tileEntity12 != null) {
                _tileEntity12.getTileData().func_74780_a("TreasureChestLevel", 2.0d);
            }
            world.func_184138_a(_bp12, _bs12, _bs12, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockQixiang3.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp13 = new BlockPos(x, y, z);
            TileEntity _tileEntity13 = world.func_175625_s(_bp13);
            IBlockState _bs13 = world.func_180495_p(_bp13);
            if (_tileEntity13 != null) {
                _tileEntity13.getTileData().func_74780_a("TreasureChestLevel", 3.0d);
            }
            world.func_184138_a(_bp13, _bs13, _bs13, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockQiXiang4.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp14 = new BlockPos(x, y, z);
            TileEntity _tileEntity14 = world.func_175625_s(_bp14);
            IBlockState _bs14 = world.func_180495_p(_bp14);
            if (_tileEntity14 != null) {
                _tileEntity14.getTileData().func_74780_a("TreasureChestLevel", 4.0d);
            }
            world.func_184138_a(_bp14, _bs14, _bs14, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockYaoShouBaoXiang04.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp15 = new BlockPos(x, y, z);
            TileEntity _tileEntity15 = world.func_175625_s(_bp15);
            IBlockState _bs15 = world.func_180495_p(_bp15);
            if (_tileEntity15 != null) {
                _tileEntity15.getTileData().func_74780_a("TreasureChestLevel", 4.0d);
            }
            world.func_184138_a(_bp15, _bs15, _bs15, 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockQiXiang5.block.func_176223_P().func_177230_c() && !world.field_72995_K) {
            BlockPos _bp16 = new BlockPos(x, y, z);
            TileEntity _tileEntity16 = world.func_175625_s(_bp16);
            IBlockState _bs16 = world.func_180495_p(_bp16);
            if (_tileEntity16 != null) {
                _tileEntity16.getTileData().func_74780_a("TreasureChestLevel", 5.0d);
            }
            world.func_184138_a(_bp16, _bs16, _bs16, 3);
        }
    }
}
