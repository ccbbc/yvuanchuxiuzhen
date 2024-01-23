package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi03;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi04;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfaxiaoguo02.class */
public class ProcedureZhenfaxiaoguo02 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfaxiaoguo02(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 217);
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$30] */
    /* JADX WARN: Type inference failed for: r0v114, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$34] */
    /* JADX WARN: Type inference failed for: r0v117, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$36] */
    /* JADX WARN: Type inference failed for: r0v120, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$38] */
    /* JADX WARN: Type inference failed for: r0v123, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$40] */
    /* JADX WARN: Type inference failed for: r0v126, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$42] */
    /* JADX WARN: Type inference failed for: r0v129, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$44] */
    /* JADX WARN: Type inference failed for: r0v132, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$46] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$48] */
    /* JADX WARN: Type inference failed for: r0v138, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$50] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$29] */
    /* JADX WARN: Type inference failed for: r0v273, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$2] */
    /* JADX WARN: Type inference failed for: r0v278, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$6] */
    /* JADX WARN: Type inference failed for: r0v281, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$8] */
    /* JADX WARN: Type inference failed for: r0v284, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$10] */
    /* JADX WARN: Type inference failed for: r0v287, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$12] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$55] */
    /* JADX WARN: Type inference failed for: r0v290, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$14] */
    /* JADX WARN: Type inference failed for: r0v293, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$16] */
    /* JADX WARN: Type inference failed for: r0v296, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$18] */
    /* JADX WARN: Type inference failed for: r0v299, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$20] */
    /* JADX WARN: Type inference failed for: r0v302, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$22] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$56] */
    /* JADX WARN: Type inference failed for: r2v113, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$32] */
    /* JADX WARN: Type inference failed for: r2v119, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$3] */
    /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$57] */
    /* JADX WARN: Type inference failed for: r2v187, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$4] */
    /* JADX WARN: Type inference failed for: r2v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$58] */
    /* JADX WARN: Type inference failed for: r2v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$31] */
    /* JADX WARN: Type inference failed for: r4v101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$33] */
    /* JADX WARN: Type inference failed for: r4v156, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$5] */
    /* JADX WARN: Type inference failed for: r4v46, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$59] */
    /* JADX WARN: Type inference failed for: r5v122, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$25] */
    /* JADX WARN: Type inference failed for: r5v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$61] */
    /* JADX WARN: Type inference failed for: r6v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$62] */
    /* JADX WARN: Type inference failed for: r6v18, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$63] */
    /* JADX WARN: Type inference failed for: r6v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$53] */
    /* JADX WARN: Type inference failed for: r6v73, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$26] */
    /* JADX WARN: Type inference failed for: r6v75, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$27] */
    /* JADX WARN: Type inference failed for: r8v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$54] */
    /* JADX WARN: Type inference failed for: r8v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$28] */
    /* JADX WARN: Type inference failed for: r8v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02$64] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("晨辉阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "qianghua")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                IBlockState _bs = worldServer.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "power") - (5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua")));
                }
                worldServer.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 1.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.7
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua01");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 2.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.9
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua02");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 3.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.11
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua03");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 4.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.13
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua04");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 5.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.15
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua05");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 6.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.17
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua06");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 7.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.19
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua07");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.20
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 8.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.21
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua08");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.22
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") >= 9.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.23
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
                        return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                    }
                }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua09");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.24
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
                        return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                    }
                }, "execute @e[rm=0,r=15] ~ ~ ~ yaoji04");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.VILLAGER_HAPPY, x + 0.5d, y + 0.5d, z + 0.5d, (int) (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.25
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.26
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua")), new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.27
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") / 3.0d, 0.0d, new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.28
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") / 3.0d, 0.0d, new int[0]);
            }
            if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c()) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                    IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74778_a("zhenfamingcheng", "");
                    }
                    worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.VILLAGER_ANGRY, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.29
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("回灵阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.30
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.31
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "qianghua")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.32
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "power") - (5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.33
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua")));
                }
                worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.34
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 1.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.35
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua01");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 2.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.37
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua02");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.38
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 3.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.39
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua03");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.40
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 4.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.41
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua04");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.42
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 5.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.43
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua05");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.44
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 6.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.45
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua06");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.46
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 7.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.47
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua07");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.48
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 8.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.49
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua08");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.50
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") >= 9.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.51
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
                        return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                    }
                }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua09");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.52
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
                        return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                    }
                }, "execute @e[rm=0,r=15] ~ ~ ~ yaoji05");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y + 0.5d, z + 0.5d, 100, new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.53
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") / 3.0d, 0.0d, new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.54
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") / 3.0d, 0.0d, new int[0]);
            }
            if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi03.block.func_176223_P().func_177230_c()) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                    IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74778_a("zhenfamingcheng", "");
                    }
                    worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.VILLAGER_ANGRY, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.55
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("迷踪阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.56
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.57
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "qianghua")) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.58
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "power") - (5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.59
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua")));
                }
                worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.60
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
                        return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                    }
                }, "execute @e[rm=0,r=10] ~ ~ ~ yaoji06");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x + 0.5d, y + 0.5d, z + 0.5d, (int) (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.61
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.62
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua")), new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.63
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") / 3.0d, 3.0d, new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo02.64
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") / 3.0d, 0.0d, new int[0]);
            }
            if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c()) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = worldServer.func_175625_s(_bp6);
                    IBlockState _bs6 = worldServer.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74778_a("zhenfamingcheng", "");
                    }
                    worldServer.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.VILLAGER_ANGRY, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
                }
            }
        }
    }
}
