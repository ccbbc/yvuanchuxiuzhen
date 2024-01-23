package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockLiandan0101;
import net.mcreator.yvanchuliandan.block.BlockLiandan0102;
import net.mcreator.yvanchuliandan.block.BlockLiandan0201;
import net.mcreator.yvanchuliandan.block.BlockLiandan0202;
import net.mcreator.yvanchuliandan.block.BlockLiandan0301;
import net.mcreator.yvanchuliandan.block.BlockLiandan0302;
import net.mcreator.yvanchuliandan.block.BlockLiandan0401;
import net.mcreator.yvanchuliandan.block.BlockLiandan0402;
import net.mcreator.yvanchuliandan.block.BlockLiandan0501;
import net.mcreator.yvanchuliandan.block.BlockLiandan0502;
import net.mcreator.yvanchuliandan.block.BlockLiandan0601;
import net.mcreator.yvanchuliandan.block.BlockLiandan0602;
import net.mcreator.yvanchuliandan.block.BlockLiandan0701;
import net.mcreator.yvanchuliandan.block.BlockLiandan0702;
import net.mcreator.yvanchuliandan.block.BlockLiandan0801;
import net.mcreator.yvanchuliandan.block.BlockLiandan0802;
import net.mcreator.yvanchuliandan.block.BlockLiandan0901;
import net.mcreator.yvanchuliandan.block.BlockLiandan0902;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLiandan0101BlockAdded.class */
public class ProcedureLiandan0101BlockAdded extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureLiandan0101BlockAdded(ElementsYvanchuliandanMod instance) {
        super(instance, 269);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0102.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0101.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("danluLEVEL", 1.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74778_a("级别", "一");
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0202.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0201.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("danluLEVEL", 2.0d);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74778_a("级别", "二");
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0302.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0301.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("danluLEVEL", 3.0d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74778_a("级别", "三");
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0402.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0401.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("danluLEVEL", 4.0d);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74778_a("级别", "四");
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0502.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0501.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("danluLEVEL", 5.0d);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74778_a("级别", "五");
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0602.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0601.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("danluLEVEL", 6.0d);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74778_a("级别", "六");
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0702.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0701.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("danluLEVEL", 7.0d);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74778_a("级别", "七");
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0802.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0801.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp15 = new BlockPos(x, y, z);
                TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                IBlockState _bs15 = world.func_180495_p(_bp15);
                if (_tileEntity15 != null) {
                    _tileEntity15.getTileData().func_74780_a("danluLEVEL", 8.0d);
                }
                world.func_184138_a(_bp15, _bs15, _bs15, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74778_a("级别", "八");
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockLiandan0902.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLiandan0901.block.func_176223_P().func_177230_c()) {
            if (!world.field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                IBlockState _bs17 = world.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74780_a("danluLEVEL", 9.0d);
                }
                world.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                IBlockState _bs18 = world.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74778_a("级别", "九");
                }
                world.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
        }
        if (!new ItemStack(world.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c()).func_77973_b().getRegistryName().toString().contains("huoyan") && !world.field_72995_K) {
            BlockPos _bp19 = new BlockPos(x, y, z);
            TileEntity _tileEntity19 = world.func_175625_s(_bp19);
            IBlockState _bs19 = world.func_180495_p(_bp19);
            if (_tileEntity19 != null) {
                _tileEntity19.getTileData().func_74780_a("huoyan", 0.0d);
            }
            world.func_184138_a(_bp19, _bs19, _bs19, 3);
        }
    }
}
