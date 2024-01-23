package net.mcreator.yuanchujianzhu.procedure;

import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureDongFuShangHai4Do.class */
public class ProcedureDongFuShangHai4Do extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureDongFuShangHai4Do(ElementsYuanchujianzhuMod instance) {
        super(instance, 150);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do$2] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do$3] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do$5] */
    /* JADX WARN: Type inference failed for: r2v22, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("计时", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "计时") + 1.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "计时") >= 20.0d) {
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.3
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "丹房")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.4
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
                    }, "effect @a[r=12,m=!3,type=!item] yuanchujianzhu:dan_fang_shang_hai_4 1 1 true");
                }
            } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.5
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "器房")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.6
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
                    }, "effect @a[r=12,m=!3,type=!item] yuanchujianzhu:qi_fang_shang_hai_4 1 1 true");
                }
            } else if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.7
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
                }, "effect @a[r=12,m=!3,type=!item] yuanchujianzhu:dong_fu_shang_hai_buff_4 1 1 true");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHai4Do.8
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
                }, "effect @a[r=28,m=!3,type=!item] yuanchujianzhu:dong_fu_ti_shi_4 1 1 true");
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("计时", 0.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        }
    }
}
