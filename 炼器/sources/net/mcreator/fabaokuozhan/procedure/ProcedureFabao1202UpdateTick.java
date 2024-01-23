package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao1202UpdateTick.class */
public class ProcedureFabao1202UpdateTick extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao1202UpdateTick(ElementsFabaokuozhanMod instance) {
        super(instance, 132);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick$3] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick$7] */
    /* JADX WARN: Type inference failed for: r2v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r2v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick$1] */
    /* JADX WARN: Type inference failed for: r3v13, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick$6] */
    /* JADX WARN: Type inference failed for: r4v7, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x + 0.5d, y, z + 0.5d, 50, 4.0d, 1.0d, 4.0d, 0.0d, new int[0]);
        }
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("tick", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "tick") + 1.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
            IBlockState _bs2 = worldServer.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("tick2", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "tick2") + 1.0d);
            }
            worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "tick2") >= 2.0d) {
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick.4
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
                        return new BlockPos(x, y, z);
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x, y, z);
                    }
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=7] ~ ~ ~ shanghaiyc " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "伤害")) + " " + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick.6
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + "\",CustomNameVisible:0b}");
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("tick2", 0.0d);
                }
                worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1202UpdateTick.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "tick") >= 18.0d) {
            worldServer.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
