package net.mcreator.yuanchujianzhu.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureCangShuBaoXiangSet.class */
public class ProcedureCangShuBaoXiangSet extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureCangShuBaoXiangSet(ElementsYuanchujianzhuMod instance) {
        super(instance, 230);
    }

    /* JADX WARN: Type inference failed for: r0v138, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$48] */
    /* JADX WARN: Type inference failed for: r0v141, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$49] */
    /* JADX WARN: Type inference failed for: r0v144, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$53] */
    /* JADX WARN: Type inference failed for: r0v194, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$37] */
    /* JADX WARN: Type inference failed for: r0v197, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$38] */
    /* JADX WARN: Type inference failed for: r0v200, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$42] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$1] */
    /* JADX WARN: Type inference failed for: r0v250, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$31] */
    /* JADX WARN: Type inference failed for: r0v281, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$25] */
    /* JADX WARN: Type inference failed for: r0v312, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$19] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$6] */
    /* JADX WARN: Type inference failed for: r0v343, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$13] */
    /* JADX WARN: Type inference failed for: r0v374, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$7] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$12] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$18] */
    /* JADX WARN: Type inference failed for: r0v48, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$24] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$30] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$36] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$47] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$58] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$59] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$60] */
    /* JADX WARN: Type inference failed for: r0v88, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$64] */
    /* JADX WARN: Type inference failed for: r2v103, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$56] */
    /* JADX WARN: Type inference failed for: r2v127, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$52] */
    /* JADX WARN: Type inference failed for: r2v151, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$46] */
    /* JADX WARN: Type inference failed for: r2v165, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$45] */
    /* JADX WARN: Type inference failed for: r2v189, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$41] */
    /* JADX WARN: Type inference failed for: r2v213, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$35] */
    /* JADX WARN: Type inference failed for: r2v221, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$34] */
    /* JADX WARN: Type inference failed for: r2v245, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$29] */
    /* JADX WARN: Type inference failed for: r2v253, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$28] */
    /* JADX WARN: Type inference failed for: r2v277, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$23] */
    /* JADX WARN: Type inference failed for: r2v285, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$22] */
    /* JADX WARN: Type inference failed for: r2v309, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$17] */
    /* JADX WARN: Type inference failed for: r2v317, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$16] */
    /* JADX WARN: Type inference failed for: r2v341, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$11] */
    /* JADX WARN: Type inference failed for: r2v349, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$10] */
    /* JADX WARN: Type inference failed for: r2v378, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$5] */
    /* JADX WARN: Type inference failed for: r2v383, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$4] */
    /* JADX WARN: Type inference failed for: r2v41, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$67] */
    /* JADX WARN: Type inference failed for: r2v65, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$63] */
    /* JADX WARN: Type inference failed for: r2v89, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$57] */
    /* JADX WARN: Type inference failed for: r4v112, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$27] */
    /* JADX WARN: Type inference failed for: r4v127, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$21] */
    /* JADX WARN: Type inference failed for: r4v142, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$15] */
    /* JADX WARN: Type inference failed for: r4v157, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$9] */
    /* JADX WARN: Type inference failed for: r4v173, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$3] */
    /* JADX WARN: Type inference failed for: r4v21, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$66] */
    /* JADX WARN: Type inference failed for: r4v30, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$62] */
    /* JADX WARN: Type inference failed for: r4v47, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$55] */
    /* JADX WARN: Type inference failed for: r4v56, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$51] */
    /* JADX WARN: Type inference failed for: r4v73, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$44] */
    /* JADX WARN: Type inference failed for: r4v82, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$40] */
    /* JADX WARN: Type inference failed for: r4v97, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet$33] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "初始化")) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.2
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.3
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_32 1 0");
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("随机数", new Random().nextInt(80));
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 9.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.8
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_1 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.10
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 19.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.14
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.15
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_2 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.16
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.17
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.19
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 29.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.20
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.21
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_3 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.22
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.23
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.24
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.25
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 39.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.26
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.27
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_4 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.28
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.29
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.30
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.31
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 49.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.32
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.33
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_5 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.34
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.35
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.37
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 59.0d) {
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.38
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "随机数") <= 54.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.39
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
                        }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.40
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_12 1 0");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp14 = new BlockPos(x, y, z);
                        TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                        IBlockState _bs14 = world.func_180495_p(_bp14);
                        if (_tileEntity14 != null) {
                            _tileEntity14.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.41
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                        }
                        world.func_184138_a(_bp14, _bs14, _bs14, 3);
                    }
                } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.42
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "随机数") > 54.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.43
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
                        }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.44
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_15 1 0");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp15 = new BlockPos(x, y, z);
                        TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                        IBlockState _bs15 = world.func_180495_p(_bp15);
                        if (_tileEntity15 != null) {
                            _tileEntity15.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.45
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                        }
                        world.func_184138_a(_bp15, _bs15, _bs15, 3);
                    }
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.46
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.47
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.48
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 69.0d) {
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.49
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "随机数") <= 64.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.50
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
                        }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.51
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_13 1 0");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp17 = new BlockPos(x, y, z);
                        TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                        IBlockState _bs17 = world.func_180495_p(_bp17);
                        if (_tileEntity17 != null) {
                            _tileEntity17.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.52
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                        }
                        world.func_184138_a(_bp17, _bs17, _bs17, 3);
                    }
                } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.53
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "随机数") > 64.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.54
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
                        }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.55
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_16 1 0");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp18 = new BlockPos(x, y, z);
                        TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                        IBlockState _bs18 = world.func_180495_p(_bp18);
                        if (_tileEntity18 != null) {
                            _tileEntity18.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.56
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                        }
                        world.func_184138_a(_bp18, _bs18, _bs18, 3);
                    }
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.57
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.58
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 2.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.59
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机数") <= 79.0d) {
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.60
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "随机数") <= 74.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.61
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
                        }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.62
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_14 1 0");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp20 = new BlockPos(x, y, z);
                        TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                        IBlockState _bs20 = world.func_180495_p(_bp20);
                        if (_tileEntity20 != null) {
                            _tileEntity20.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.63
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                        }
                        world.func_184138_a(_bp20, _bs20, _bs20, 3);
                    }
                } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.64
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "随机数") > 74.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.65
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
                        }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.66
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_22 1 0");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp21 = new BlockPos(x, y, z);
                        TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                        IBlockState _bs21 = world.func_180495_p(_bp21);
                        if (_tileEntity21 != null) {
                            _tileEntity21.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureCangShuBaoXiangSet.67
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                        }
                        world.func_184138_a(_bp21, _bs21, _bs21, 3);
                    }
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp22 = new BlockPos(x, y, z);
                TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                IBlockState _bs22 = world.func_180495_p(_bp22);
                if (_tileEntity22 != null) {
                    _tileEntity22.getTileData().func_74757_a("初始化", true);
                }
                world.func_184138_a(_bp22, _bs22, _bs22, 3);
            }
        }
    }
}
