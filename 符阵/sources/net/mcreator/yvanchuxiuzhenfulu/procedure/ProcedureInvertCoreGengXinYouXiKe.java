package net.mcreator.yvanchuxiuzhenfulu.procedure;

import com.google.common.base.Predicate;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureInvertCoreGengXinYouXiKe.class */
public class ProcedureInvertCoreGengXinYouXiKe extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureInvertCoreGengXinYouXiKe(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 563);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$1] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$2] */
    /* JADX WARN: Type inference failed for: r1v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$4] */
    /* JADX WARN: Type inference failed for: r2v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$3] */
    /* JADX WARN: Type inference failed for: r4v5, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$7] */
    /* JADX WARN: Type inference failed for: r4v9, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$8] */
    /* JADX WARN: Type inference failed for: r5v18, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$9] */
    /* JADX WARN: Type inference failed for: r5v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "启动")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "time") > 0.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("time", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "time") - 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                List<Entity> _entfound = (List) world.func_175647_a(Entity.class, new AxisAlignedBB(x - 15.0d, y - 15.0d, z - 15.0d, x + 15.0d, y + 15.0d, z + 15.0d), (Predicate) null).stream().sorted(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.4
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparing(_entcnd -> {
                            return Double.valueOf(_entcnd.func_70092_e(_x, _y, _z));
                        });
                    }
                }.compareDistOf(x, y, z)).collect(Collectors.toList());
                for (Entity entity : _entfound) {
                    if ((entity instanceof EntityPlayer) && !entity.field_70170_p.field_72995_K) {
                        ((EntityPlayer) entity).func_146105_b(new TextComponentString("§6此地阵法造诣较高,一时间无法离开此地,还请道友留在这里" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.5
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "time")) + "秒吧,时间结束自会送你离开"), true);
                    }
                }
                return;
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.6
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
                }, "tp @a[r=30] " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.7
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "x") + (new Random().nextInt(13) - 6)) + " " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.8
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "y")) + " " + new DecimalFormat("0").format((new Random().nextInt(13) - 6) + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.9
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "z")));
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureInvertCoreGengXinYouXiKe.10
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
                }, "fill 15 253 -15 -15 223 15 air");
            }
        }
    }
}
