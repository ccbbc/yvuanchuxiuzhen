package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockFabao1301;
import net.mcreator.fabaokuozhan.block.BlockFabao1302;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao13BulletHitsBlock.class */
public class ProcedureFabao13BulletHitsBlock extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao13BulletHitsBlock(ElementsFabaokuozhanMod instance) {
        super(instance, 136);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (Math.random() < 0.5d) {
            if (world.func_180495_p(new BlockPos(x, y + 5, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
                world.func_180501_a(new BlockPos(x, y + 5, z), BlockFabao1301.block.func_176223_P(), 3);
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y + 5, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("shanghai", (entity.getEntityData().func_74769_h("MagicAttack") * 0.5d) + 123.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y + 5, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74778_a("所有者", entity.func_145748_c_().func_150260_c());
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y + 4, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
                world.func_180501_a(new BlockPos(x, y + 4, z), BlockFabao1301.block.func_176223_P(), 3);
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y + 4, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("shanghai", (entity.getEntityData().func_74769_h("MagicAttack") * 0.5d) + 123.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y + 4, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74778_a("所有者", entity.func_145748_c_().func_150260_c());
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y + 3, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
                world.func_180501_a(new BlockPos(x, y + 3, z), BlockFabao1301.block.func_176223_P(), 3);
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y + 3, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("shanghai", (entity.getEntityData().func_74769_h("MagicAttack") * 0.5d) + 123.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y + 3, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74778_a("所有者", entity.func_145748_c_().func_150260_c());
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 5, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y + 5, z), BlockFabao1302.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y + 5, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("shanghai", (entity.getEntityData().func_74769_h("MagicAttack") * 0.5d) + 123.0d);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y + 5, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74778_a("所有者", entity.func_145748_c_().func_150260_c());
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 4, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y + 4, z), BlockFabao1302.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y + 4, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("shanghai", (entity.getEntityData().func_74769_h("MagicAttack") * 0.5d) + 123.0d);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y + 4, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74778_a("所有者", entity.func_145748_c_().func_150260_c());
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
        } else if (world.func_180495_p(new BlockPos(x, y + 3, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y + 3, z), BlockFabao1302.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y + 3, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("shanghai", (entity.getEntityData().func_74769_h("MagicAttack") * 0.5d) + 123.0d);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y + 3, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74778_a("所有者", entity.func_145748_c_().func_150260_c());
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
        }
    }
}
