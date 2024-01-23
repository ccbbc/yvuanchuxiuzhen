package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
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
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfaxiaoguo03.class */
public class ProcedureZhenfaxiaoguo03 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfaxiaoguo03(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 224);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$2] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$6] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$8] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$10] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$12] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$14] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$16] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$18] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$20] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$22] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$3] */
    /* JADX WARN: Type inference failed for: r2v78, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$4] */
    /* JADX WARN: Type inference failed for: r4v60, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("禁绝阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.3
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
                    _tileEntity.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "power") - (5.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.5
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 1.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.7
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 2.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.9
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 3.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.11
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 4.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.13
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 5.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.15
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 6.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.17
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 7.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.19
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.20
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") == 8.0d) {
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.21
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
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.22
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") >= 9.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.23
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
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguo03.24
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
                }, "execute @e[rm=0,r=15] ~ ~ ~ yaoji08");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.CRIT_MAGIC, x + 0.5d, y + 0.5d, z + 0.5d, 200, 5.0d, 2.0d, 5.0d, 0.0d, new int[0]);
            }
            if (worldServer.func_180495_p(new BlockPos(x + 1, y, z)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y, z + 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y, z - 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi04.block.func_176223_P().func_177230_c()) {
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
    }
}
