package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao1301UpdateTick.class */
public class ProcedureFabao1301UpdateTick extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao1301UpdateTick(ElementsFabaokuozhanMod instance) {
        super(instance, 137);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick$4] */
    /* JADX WARN: Type inference failed for: r2v8, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick$5] */
    /* JADX WARN: Type inference failed for: r3v27, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick$3] */
    /* JADX WARN: Type inference failed for: r4v25, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() != Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.CRIT, x + 0.5d, y, z + 0.5d, 20, 1.0d, 0.0d, 1.0d, 0.5d, new int[0]);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick.1
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=7] ~ ~ ~ shanghaiy " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "shanghai")) + " " + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick.3
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + "\",CustomNameVisible:0b}");
            }
            worldServer.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("fabaokuozhan:fabao0501")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
            worldServer.func_175698_g(new BlockPos(x, y, z));
        } else if (worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            worldServer.func_180501_a(new BlockPos(x, y - 1, z), worldServer.func_180495_p(new BlockPos(x, y, z)), 3);
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp = new BlockPos(x, y - 1, z);
                TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                IBlockState _bs = worldServer.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("shanghai", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "shanghai"));
                }
                worldServer.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y - 1, z);
                TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74778_a("所有者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick.5
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者"));
                }
                worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            worldServer.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
