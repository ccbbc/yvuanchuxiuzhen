package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi01;
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
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfaxiaoguo01.class */
public class ProcedureZhenfaxiaoguo01 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfaxiaoguo01(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 207);
    }

    /* JADX WARN: Type inference failed for: r0v193, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$2] */
    /* JADX WARN: Type inference failed for: r0v198, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$6] */
    /* JADX WARN: Type inference failed for: r0v201, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$8] */
    /* JADX WARN: Type inference failed for: r0v204, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$10] */
    /* JADX WARN: Type inference failed for: r0v207, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$12] */
    /* JADX WARN: Type inference failed for: r0v210, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$14] */
    /* JADX WARN: Type inference failed for: r0v213, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$16] */
    /* JADX WARN: Type inference failed for: r0v216, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$18] */
    /* JADX WARN: Type inference failed for: r0v219, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$20] */
    /* JADX WARN: Type inference failed for: r0v222, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$22] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$25] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$26] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$30] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$32] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$34] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$36] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$38] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$40] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$42] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$44] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$46] */
    /* JADX WARN: Type inference failed for: r2v155, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$4] */
    /* JADX WARN: Type inference failed for: r2v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$28] */
    /* JADX WARN: Type inference failed for: r2v83, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$3] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$27] */
    /* JADX WARN: Type inference failed for: r4v118, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$5] */
    /* JADX WARN: Type inference failed for: r4v55, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01$29] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("裂空阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.3
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
                    _tileEntity.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "power") - (5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.5
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 1.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.7
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 2.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.9
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 3.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.11
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 4.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.13
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 5.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.15
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 6.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.17
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 7.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.19
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.20
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 8.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.21
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.22
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") >= 9.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.23
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
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.24
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
                }, "execute @e[rm=0,r=15] ~ ~ ~ yaoji02");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, x + 0.5d, y + 0.5d, z + 0.5d, 100, 5.0d, 0.0d, 5.0d, 0.0d, new int[0]);
            }
            if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c()) {
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
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.25
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("熔岩阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.26
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.27
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
                    _tileEntity3.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.28
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "power") - (5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.29
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.30
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 1.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.31
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.32
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 2.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.33
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.34
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 3.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.35
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 4.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.37
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.38
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 5.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.39
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.40
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 6.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.41
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.42
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 7.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.43
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.44
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 8.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.45
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.46
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") >= 9.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.47
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
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo01.48
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
                }, "execute @e[rm=0,r=15] ~ ~ ~ yaoji03");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.LAVA, x + 0.5d, y + 0.5d, z + 0.5d, 100, 1.0d, 10.0d, 1.0d, 0.0d, new int[0]);
            }
            if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c()) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                    IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74778_a("zhenfamingcheng", "0");
                    }
                    worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.VILLAGER_ANGRY, x + 0.5d, y, z + 0.5d, 20, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
                }
            }
        }
    }
}
