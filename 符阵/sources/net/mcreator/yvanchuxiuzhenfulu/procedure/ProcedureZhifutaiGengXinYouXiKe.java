package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhifutaiGengXinYouXiKe.class */
public class ProcedureZhifutaiGengXinYouXiKe extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhifutaiGengXinYouXiKe(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 297);
    }

    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$18] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$1] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$2] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$3] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$5] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$7] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$9] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$11] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$13] */
    /* JADX WARN: Type inference failed for: r1v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$16] */
    /* JADX WARN: Type inference failed for: r2v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$15] */
    /* JADX WARN: Type inference failed for: r2v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$14] */
    /* JADX WARN: Type inference failed for: r2v36, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$12] */
    /* JADX WARN: Type inference failed for: r2v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$10] */
    /* JADX WARN: Type inference failed for: r2v46, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$8] */
    /* JADX WARN: Type inference failed for: r2v75, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$17] */
    /* JADX WARN: Type inference failed for: r2v80, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$6] */
    /* JADX WARN: Type inference failed for: r2v93, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$4] */
    /* JADX WARN: Type inference failed for: r3v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe$20] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "kaishi") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") > 0.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.3
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "法宝")) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("cishu", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.4
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "cishu") + 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureHuaFuJieSuan.executeProcedure($_dependencies);
                return;
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.5
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "leixing") == 101.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("概率", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.6
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "概率") + 30.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "leixing") == 102.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("概率", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.8
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "概率") + 23.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "leixing") == 103.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("概率", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.10
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "概率") + 16.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "leixing") == 104.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("概率", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.12
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "概率") + 9.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "leixing") == 105.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("概率", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.14
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "概率") + 2.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
            } else if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("概率", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.15
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "概率") + 32.0d);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (new Random().nextInt(100) <= new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率")) {
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("cishu", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.17
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "cishu") + 1.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("entity", entity);
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", world);
                ProcedureHuaFuJieSuan.executeProcedure($_dependencies2);
                return;
            }
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.18
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("yuanchumr") == 0 && !world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.19
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return world;
                    }

                    public MinecraftServer func_184102_h() {
                        return world.func_73046_m();
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
                }, "tellraw " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhifutaiGengXinYouXiKe.20
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + " [{\"text\":\"很不幸本次画符失败了~\",\"color\":\"aqua\",\"bold\":true,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
            }
        }
    }
}
