package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemLianqijinxing;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianqi01UpdateTick.class */
public class ProcedureLianqi01UpdateTick extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianqi01UpdateTick(ElementsFabaokuozhanMod instance) {
        super(instance, 156);
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$8] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$11] */
    /* JADX WARN: Type inference failed for: r0v112, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$12] */
    /* JADX WARN: Type inference failed for: r0v115, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$14] */
    /* JADX WARN: Type inference failed for: r0v118, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$16] */
    /* JADX WARN: Type inference failed for: r0v121, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$18] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$1] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$3] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$4] */
    /* JADX WARN: Type inference failed for: r0v271, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$5] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$6] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$7] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$24] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$26] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$29] */
    /* JADX WARN: Type inference failed for: r0v91, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$25] */
    /* JADX WARN: Type inference failed for: r1v104, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$21] */
    /* JADX WARN: Type inference failed for: r1v42, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$27] */
    /* JADX WARN: Type inference failed for: r2v131, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$9] */
    /* JADX WARN: Type inference failed for: r2v44, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$28] */
    /* JADX WARN: Type inference failed for: r3v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$20] */
    /* JADX WARN: Type inference failed for: r3v45, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$19] */
    /* JADX WARN: Type inference failed for: r3v50, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$17] */
    /* JADX WARN: Type inference failed for: r3v55, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$15] */
    /* JADX WARN: Type inference failed for: r3v70, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$23] */
    /* JADX WARN: Type inference failed for: r3v78, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$13] */
    /* JADX WARN: Type inference failed for: r3v83, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick$10] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        TileEntityLockableLoot func_175625_s;
        TileEntityLockableLoot func_175625_s2;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "kaishi")) {
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, x + 0.5d, y + 1, z + 0.5d, 10, 0.4d, 1.0d, 0.4d, 0.0d, new int[0]);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s3 = worldServer.func_175625_s(pos);
                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                        return func_175625_s3.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 7).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && (func_175625_s2 = worldServer.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack = new ItemStack(ItemLianqijinxing.block, 1);
                _setstack.func_190920_e(1);
                func_175625_s2.func_70299_a(7, _setstack);
            }
        } else if (!new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.3
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "kaishi") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s3 = worldServer.func_175625_s(pos);
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    return func_175625_s3.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 7).func_77973_b() == new ItemStack(ItemLianqijinxing.block, 1).func_77973_b() && (func_175625_s = worldServer.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s instanceof TileEntityLockableLoot)) {
            ItemStack _setstack2 = new ItemStack(Blocks.field_150350_a, 1);
            _setstack2.func_190920_e(1);
            func_175625_s.func_70299_a(7, _setstack2);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") > 0.0d && worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_185904_a() == Material.field_151581_o) {
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, x + 0.5d, y - 0.2d, z + 0.5d, 20, 0.4d, 0.2d, 0.4d, 0.0d, new int[0]);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") > 0.0d && worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_185904_a() != Material.field_151581_o && !((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("huoyan", 0.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") > 0.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.8
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "kaishi")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("炼制时间", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制时间") + 1.0d);
                }
                worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("剩余炼制时间", (60.0d - new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.10
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制时间")) / 2.0d);
                }
                worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "炼制时间") >= 60.0d) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.12
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "leixing") == 33.0d) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                        IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("炼制概率", 30.0d + (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.13
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "lianqi") * 5.0d));
                        }
                        worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.14
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "leixing") == 34.0d) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                        IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74780_a("炼制概率", 25.0d + (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.15
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "lianqi") * 5.0d));
                        }
                        worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.16
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "leixing") == 35.0d) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = worldServer.func_175625_s(_bp6);
                        IBlockState _bs6 = worldServer.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("炼制概率", 20.0d + (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.17
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "lianqi") * 5.0d));
                        }
                        worldServer.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.18
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "leixing") == 36.0d) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp7 = new BlockPos(x, y, z);
                        TileEntity _tileEntity7 = worldServer.func_175625_s(_bp7);
                        IBlockState _bs7 = worldServer.func_180495_p(_bp7);
                        if (_tileEntity7 != null) {
                            _tileEntity7.getTileData().func_74780_a("炼制概率", 15.0d + (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.19
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "lianqi") * 5.0d));
                        }
                        worldServer.func_184138_a(_bp7, _bs7, _bs7, 3);
                    }
                } else if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = worldServer.func_175625_s(_bp8);
                    IBlockState _bs8 = worldServer.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("炼制概率", 49.0d + (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.20
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "lianqi") * 5.0d));
                    }
                    worldServer.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (new Random().nextInt(100) <= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.21
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "炼制概率")) {
                    $_dependencies.put("world", worldServer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    ProcedureLianqijiesuan02.executeProcedure($_dependencies);
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp9 = new BlockPos(x, y, z);
                        TileEntity _tileEntity9 = worldServer.func_175625_s(_bp9);
                        IBlockState _bs9 = worldServer.func_180495_p(_bp9);
                        if (_tileEntity9 != null) {
                            _tileEntity9.getTileData().func_74780_a("炼制时间", 0.0d);
                        }
                        worldServer.func_184138_a(_bp9, _bs9, _bs9, 3);
                    }
                } else {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.22
                            public String func_70005_c_() {
                                return "";
                            }

                            public boolean func_70003_b(int permission, String command) {
                                return true;
                            }

                            public World func_130014_f_() {
                                return worldServer;
                            }

                            public MinecraftServer func_184102_h() {
                                return worldServer.func_73046_m();
                            }

                            public boolean func_174792_t_() {
                                return false;
                            }

                            public BlockPos func_180425_c() {
                                return new BlockPos(x, y, z);
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x, y, z);
                            }
                        }, "tellraw " + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.23
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "炼制者") + " [{\"text\":\"很不幸本次炼制失败了~\",\"color\":\"aqua\",\"bold\":true,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                    }
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp10 = new BlockPos(x, y, z);
                        TileEntity _tileEntity10 = worldServer.func_175625_s(_bp10);
                        IBlockState _bs10 = worldServer.func_180495_p(_bp10);
                        if (_tileEntity10 != null) {
                            _tileEntity10.getTileData().func_74780_a("炼制时间", 0.0d);
                        }
                        worldServer.func_184138_a(_bp10, _bs10, _bs10, 3);
                    }
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp11 = new BlockPos(x, y, z);
                        TileEntity _tileEntity11 = worldServer.func_175625_s(_bp11);
                        IBlockState _bs11 = worldServer.func_180495_p(_bp11);
                        if (_tileEntity11 != null) {
                            _tileEntity11.getTileData().func_74757_a("kaishi", false);
                        }
                        worldServer.func_184138_a(_bp11, _bs11, _bs11, 3);
                    }
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp12 = new BlockPos(x, y, z);
                        TileEntity _tileEntity12 = worldServer.func_175625_s(_bp12);
                        IBlockState _bs12 = worldServer.func_180495_p(_bp12);
                        if (_tileEntity12 != null) {
                            _tileEntity12.getTileData().func_74780_a("leixing", 0.0d);
                        }
                        worldServer.func_184138_a(_bp12, _bs12, _bs12, 3);
                    }
                }
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.24
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 2.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.25
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s3 = worldServer.func_175625_s(pos);
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    return func_175625_s3.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            $_dependencies.put("world", worldServer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLianqijiesuan02.executeProcedure($_dependencies);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.26
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") > new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.27
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") && !((World) worldServer).field_72995_K) {
            BlockPos _bp13 = new BlockPos(x, y, z);
            TileEntity _tileEntity13 = worldServer.func_175625_s(_bp13);
            IBlockState _bs13 = worldServer.func_180495_p(_bp13);
            if (_tileEntity13 != null) {
                _tileEntity13.getTileData().func_74780_a("要来力", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.28
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "要来力") + 1.0d);
            }
            worldServer.func_184138_a(_bp13, _bs13, _bs13, 3);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01UpdateTick.29
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "要来力") >= 10.0d) {
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, x, y, z, 1.0f, true);
            }
            worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c().func_176226_b(worldServer, new BlockPos(x, y, z), worldServer.func_180495_p(new BlockPos(x, y, z)), 1);
            worldServer.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
