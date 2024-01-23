package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureBreakingconeUse.class */
public class ProcedureBreakingconeUse extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBreakingconeUse(ElementsYvanchuyaoshouMod instance) {
        super(instance, 384);
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse$1] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse$2] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("MoShiNum") == 1 || new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse.2
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("MoShiNum") == 2 || new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse.3
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("ActiveCapability") == 1) {
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse.4
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=5] ~ ~ ~ shanghai m 7100 " + entityPlayer.func_145748_c_().func_150260_c() + "\",CustomNameVisible:0b}");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, x, y, z, 500, 5.0d, 5.0d, 5.0d, 0.1d, new int[0]);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 540);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§4已禁用非简单和普通模式下玩家使用主动能力"), false);
        }
    }
}
