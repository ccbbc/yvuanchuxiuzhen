package net.mcreator.yvanchuxiuzhenfulu.procedure;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu2901UpdateTick.class */
public class ProcedureFulu2901UpdateTick extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu2901UpdateTick(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 141);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick$1] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick$6] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick$11] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick$16] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick$21] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick$22] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.1
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.NORTH) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.2
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
                }, "execute @e[dx=20,dy=20,dz=-40] ~ ~ ~ nfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.3
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
                }, "execute @e[dx=20,dy=-20,dz=-40] ~ ~ ~ nfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.4
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
                }, "execute @e[dx=-20,dy=20,dz=-40] ~ ~ ~ nfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.5
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
                }, "execute @e[dx=-20,dy=-20,dz=-40] ~ ~ ~ nfangxiang");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.6
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.SOUTH) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.7
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
                }, "execute @e[dx=20,dy=20,dz=40] ~ ~ ~ sfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.8
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
                }, "execute @e[dx=20,dy=-20,dz=40] ~ ~ ~ sfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.9
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
                }, "execute @e[dx=-20,dy=20,dz=40] ~ ~ ~ sfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.10
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
                }, "execute @e[dx=-20,dy=-20,dz=40] ~ ~ ~ sfangxiang");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.11
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.EAST) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.12
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
                }, "execute @e[dx=20,dy=20,dz=40] ~ ~ ~ efangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.13
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
                }, "execute @e[dx=20,dy=-20,dz=40] ~ ~ ~ efangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.14
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
                }, "execute @e[dx=20,dy=20,dz=-40] ~ ~ ~ efangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.15
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
                }, "execute @e[dx=20,dy=-20,dz=-40] ~ ~ ~ efangxiang");
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.16
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.WEST) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.17
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
                }, "execute @e[dx=-20,dy=20,dz=40] ~ ~ ~ wfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.18
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
                }, "execute @e[dx=-20,dy=-20,dz=40] ~ ~ ~ wfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.19
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
                }, "execute @e[dx=-20,dy=20,dz=-40] ~ ~ ~ wfangxiang");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.20
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
                }, "execute @e[dx=-20,dy=-20,dz=-40] ~ ~ ~ wfangxiang");
            }
        } else if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.21
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.UP || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.22
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.DOWN) && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2901UpdateTick.23
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
            }, "execute @e[rm=0,r=40] ~ ~ ~ zfangxiang");
        }
    }
}
