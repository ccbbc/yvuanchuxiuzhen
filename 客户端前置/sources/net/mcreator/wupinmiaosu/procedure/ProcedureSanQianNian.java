package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureSanQianNian.class */
public class ProcedureSanQianNian extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureSanQianNian(ElementsWupinmiaosuMod instance) {
        super(instance, 96);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        entityPlayer.getEntityData().func_74778_a("TiZhi", "天妒之体");
        entityPlayer.getEntityData().func_74780_a("TiZhiNum", 11.0d);
        entityPlayer.getEntityData().func_74757_a("JinLingGen", true);
        entityPlayer.getEntityData().func_74757_a("ShuiLingGen", true);
        entityPlayer.getEntityData().func_74757_a("MuLingGen", true);
        entityPlayer.getEntityData().func_74757_a("HuoLingGen", true);
        entityPlayer.getEntityData().func_74757_a("TuLingGen", true);
        entityPlayer.getEntityData().func_74780_a("LingGenNum", 5.0d);
        entityPlayer.getEntityData().func_74778_a("LingGen", "金木水火土");
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureSanQianNian.1
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
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"lianqisanqiannian:chun_jun_jian\",Count:1b,Damage:0s}}");
        }
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureSanQianNian.2
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
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"lianqisanqiannian:gong_fa\",Count:1b,Damage:0s}}");
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("yuanchuchoose");
            if (_so == null) {
                _so = _sc.func_96535_a("yuanchuchoose", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(1);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc2 = entityPlayer.func_96123_co();
            ScoreObjective _so2 = _sc2.func_96518_b("gongfabeilv");
            if (_so2 == null) {
                _so2 = _sc2.func_96535_a("gongfabeilv", ScoreCriteria.field_96641_b);
            }
            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
            _scr2.func_96647_c(5);
        }
    }
}
