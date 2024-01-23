package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
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
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureSiWangZhiXing.class */
public class ProcedureSiWangZhiXing extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureSiWangZhiXing(ElementsYuanchuzhushouMod instance) {
        super(instance, 28);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangZhiXing$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangZhiXing.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("RiskFunction") == 1) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("siwangconfirm");
                if (_so == null) {
                    _so = _sc.func_96535_a("siwangconfirm", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(1);
            }
            if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangZhiXing.2
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityPlayer.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityPlayer.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityPlayer.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityPlayer;
                    }
                }, "scoreboard players set @a[r=30] siwangconfirm 1");
            }
            if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureSiWangZhiXing.3
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityPlayer.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityPlayer.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityPlayer.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityPlayer;
                    }
                }, "execute @e[r=30] ~ ~ ~ siwang " + entityPlayer.func_145748_c_().func_150260_c());
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("红色按钮已被禁用,如想启用请将配置文件中RiskFunction的属性设置为true"), false);
        }
    }
}
