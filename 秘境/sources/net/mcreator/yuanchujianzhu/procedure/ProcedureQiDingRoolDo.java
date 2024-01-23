package net.mcreator.yuanchujianzhu.procedure;

import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.block.BlockDongFuShangHai1;
import net.mcreator.yuanchujianzhu.block.BlockDongFuShangHai2;
import net.mcreator.yuanchujianzhu.block.BlockDongFuShangHai3;
import net.mcreator.yuanchujianzhu.block.BlockDongFuShangHai4;
import net.mcreator.yuanchujianzhu.block.BlockDongFuShangHai5;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang1;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang2;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang4;
import net.mcreator.yuanchujianzhu.block.BlockQiXiang5;
import net.mcreator.yuanchujianzhu.block.BlockQixiang3;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureQiDingRoolDo.class */
public class ProcedureQiDingRoolDo extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureQiDingRoolDo(ElementsYuanchujianzhuMod instance) {
        super(instance, 186);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (Math.random() <= 0.5d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiDingRoolDo.1
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
                }, "setblock ~ ~ ~ fabaokuozhan:lianqi01");
            }
            world.func_180501_a(new BlockPos(x - 1, y + 5, z), BlockDongFuShangHai1.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x - 1, y + 5, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74757_a("器房", true);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            world.func_180501_a(new BlockPos(x - 5, y + 1, z - 5), BlockQiXiang1.block.func_176223_P(), 3);
        } else if (Math.random() <= 0.5d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiDingRoolDo.2
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
                }, "setblock ~ ~ ~ fabaokuozhan:lianqi02");
            }
            world.func_180501_a(new BlockPos(x - 1, y + 5, z), BlockDongFuShangHai2.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x - 1, y + 5, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74757_a("器房", true);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            world.func_180501_a(new BlockPos(x - 5, y + 1, z - 5), BlockQiXiang2.block.func_176223_P(), 3);
        } else if (Math.random() <= 0.5d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiDingRoolDo.3
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
                }, "setblock ~ ~ ~ fabaokuozhan:lianqi03");
            }
            world.func_180501_a(new BlockPos(x - 1, y + 5, z), BlockDongFuShangHai3.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x - 1, y + 5, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74757_a("器房", true);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            world.func_180501_a(new BlockPos(x - 5, y + 1, z - 5), BlockQixiang3.block.func_176223_P(), 3);
        } else if (Math.random() <= 0.5d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiDingRoolDo.4
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
                }, "setblock ~ ~ ~ fabaokuozhan:lianqi04");
            }
            world.func_180501_a(new BlockPos(x - 1, y + 5, z), BlockDongFuShangHai4.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x - 1, y + 5, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74757_a("器房", true);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            world.func_180501_a(new BlockPos(x - 5, y + 1, z - 5), BlockQiXiang4.block.func_176223_P(), 3);
        } else if (Math.random() <= 0.5d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiDingRoolDo.5
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
                }, "setblock ~ ~ ~ fabaokuozhan:lianqi05");
            }
            world.func_180501_a(new BlockPos(x - 1, y + 5, z), BlockDongFuShangHai5.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x - 1, y + 5, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74757_a("器房", true);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            world.func_180501_a(new BlockPos(x - 5, y + 1, z - 5), BlockQiXiang5.block.func_176223_P(), 3);
        } else {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureQiDingRoolDo.6
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
                }, "setblock ~ ~ ~ fabaokuozhan:lianqi01");
            }
            world.func_180501_a(new BlockPos(x - 1, y + 5, z), BlockDongFuShangHai1.block.func_176223_P(), 3);
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x - 1, y + 5, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74757_a("器房", true);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            world.func_180501_a(new BlockPos(x - 5, y + 1, z - 5), BlockQiXiang1.block.func_176223_P(), 3);
        }
    }
}
