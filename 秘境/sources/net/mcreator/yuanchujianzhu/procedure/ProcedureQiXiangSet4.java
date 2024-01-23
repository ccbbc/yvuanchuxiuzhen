package net.mcreator.yuanchujianzhu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureQiXiangSet4.class */
public class ProcedureQiXiangSet4 extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureQiXiangSet4(ElementsYuanchujianzhuMod instance) {
        super(instance, 206);
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$1] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$2] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$3] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$8] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$13] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$18] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$23] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$28] */
    /* JADX WARN: Type inference failed for: r0v84, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$33] */
    /* JADX WARN: Type inference failed for: r2v100, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$27] */
    /* JADX WARN: Type inference failed for: r2v105, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$26] */
    /* JADX WARN: Type inference failed for: r2v129, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$22] */
    /* JADX WARN: Type inference failed for: r2v134, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$21] */
    /* JADX WARN: Type inference failed for: r2v158, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$17] */
    /* JADX WARN: Type inference failed for: r2v163, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$16] */
    /* JADX WARN: Type inference failed for: r2v187, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$12] */
    /* JADX WARN: Type inference failed for: r2v192, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$11] */
    /* JADX WARN: Type inference failed for: r2v216, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$7] */
    /* JADX WARN: Type inference failed for: r2v221, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$6] */
    /* JADX WARN: Type inference failed for: r2v47, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$36] */
    /* JADX WARN: Type inference failed for: r2v71, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$32] */
    /* JADX WARN: Type inference failed for: r2v76, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$31] */
    /* JADX WARN: Type inference failed for: r4v105, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$5] */
    /* JADX WARN: Type inference failed for: r4v18, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$35] */
    /* JADX WARN: Type inference failed for: r4v32, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$30] */
    /* JADX WARN: Type inference failed for: r4v46, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$25] */
    /* JADX WARN: Type inference failed for: r4v60, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$20] */
    /* JADX WARN: Type inference failed for: r4v74, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$15] */
    /* JADX WARN: Type inference failed for: r4v88, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4$10] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Object entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        Map<String, Object> $_dependencies = new HashMap<>();
        $_dependencies.put("world", world);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureSetBlockLingGen.executeProcedure($_dependencies);
        Map<String, Object> $_dependencies2 = new HashMap<>();
        $_dependencies2.put("entity", entity);
        $_dependencies2.put("world", world);
        $_dependencies2.put("x", Integer.valueOf(x));
        $_dependencies2.put("y", Integer.valueOf(y));
        $_dependencies2.put("z", Integer.valueOf(z));
        ProcedureOpenGuiTiaoJian.executeProcedure($_dependencies2);
        if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "打开") && !new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.2
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "初始化")) {
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.4
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:caientity0101 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.6
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
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.7
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
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.9
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.10
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:cailiao14 " + (new Random().nextInt(2) + 1) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.11
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.14
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.15
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:caientity0201 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.16
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.17
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.19
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.20
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:cailiao17 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.21
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.22
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.23
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.24
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.25
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:cailiao16 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.27
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.29
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.30
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:cailiao36 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.31
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.32
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.33
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.34
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.35
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:fabao0701 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiXiangSet4.36
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74757_a("初始化", true);
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
        }
    }
}
