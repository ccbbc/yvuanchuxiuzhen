package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureZhuQueHuanDangZiDanJiZhongFangKuaiShi.class */
public class ProcedureZhuQueHuanDangZiDanJiZhongFangKuaiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhuQueHuanDangZiDanJiZhongFangKuaiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 477);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer.func_180495_p(new BlockPos(0, 0, 0)).func_177230_c() == Blocks.field_150378_br.func_176223_P().func_177230_c()) {
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, x, y, z, 5.0f, false);
            }
        } else if (!((World) worldServer).field_72995_K) {
            worldServer.func_72876_a((Entity) null, x, y, z, 5.0f, true);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.FLAME, x + 0.5d, y + 0.5d, z + 0.5d, 100, 2.0d, 2.0d, 2.0d, 1.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, x + 0.5d, y + 0.5d, z + 0.5d, 40, 2.0d, 2.0d, 2.0d, 1.0d, new int[0]);
        }
        if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
            ICommandManager func_71187_D = worldServer.func_73046_m().func_71187_D();
            ICommandSender iCommandSender = new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureZhuQueHuanDangZiDanJiZhongFangKuaiShi.1
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
            };
            StringBuilder append = new StringBuilder().append("summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=10] ~ ~ ~ shanghaiya ");
            DecimalFormat decimalFormat = new DecimalFormat("0");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("威能伤害");
            } else {
                d = -1.0d;
            }
            func_71187_D.func_71556_a(iCommandSender, append.append(decimalFormat.format(d)).append("").append("\",CustomNameVisible:0b}").toString());
        }
    }
}
