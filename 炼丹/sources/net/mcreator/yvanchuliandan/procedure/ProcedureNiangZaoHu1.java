package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureNiangZaoHu1.class */
public class ProcedureNiangZaoHu1 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureNiangZaoHu1(ElementsYvanchuliandanMod instance) {
        super(instance, 691);
    }

    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$2] */
    /* JADX WARN: Type inference failed for: r0v115, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$3] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$1] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$7] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$8] */
    /* JADX WARN: Type inference failed for: r1v17, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$10] */
    /* JADX WARN: Type inference failed for: r2v11, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$11] */
    /* JADX WARN: Type inference failed for: r2v52, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$9] */
    /* JADX WARN: Type inference failed for: r3v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$18] */
    /* JADX WARN: Type inference failed for: r3v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$15] */
    /* JADX WARN: Type inference failed for: r3v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$13] */
    /* JADX WARN: Type inference failed for: r3v54, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$5] */
    /* JADX WARN: Type inference failed for: r4v22, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$16] */
    /* JADX WARN: Type inference failed for: r4v40, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1$6] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "开始") && !new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.2
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "结算")) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "YuanJiang") > 0.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.4
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
                    }, "tellraw " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.5
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + " [{\"text\":\"开始酿造剩余时间[" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Time")) + "]秒\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74757_a("开始", true);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.7
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "开始")) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "Time") > 0.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("Time", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.9
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Time") - 1.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
            } else if (new Random().nextInt(100) < new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率") + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "酿造等级")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.12
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.13
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.14
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.15
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp niangjiu " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.16
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "经验")) + "\",CustomNameVisible:0b}");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74757_a("开始", false);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74757_a("结算", true);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            } else {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.17
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
                    }, "tellraw " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangZaoHu1.18
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + " [{\"text\":\"酿造失败啦~\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74757_a("开始", false);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("YuanJiang", 0.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
            }
        }
    }
}
