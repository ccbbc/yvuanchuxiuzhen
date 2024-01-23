package net.mcreator.yuanchujianzhu.procedure;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureLingQuanCheck.class */
public class ProcedureLingQuanCheck extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureLingQuanCheck(ElementsYuanchujianzhuMod instance) {
        super(instance, 269);
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureLingQuanCheck$2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureLingQuanCheck$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        List<Entity> _entfound = (List) worldServer.func_175647_a(Entity.class, new AxisAlignedBB(x - 7.5d, y - 7.5d, z - 7.5d, x + 7.5d, y + 7.5d, z + 7.5d), (Predicate) null).stream().sorted(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureLingQuanCheck.1
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparing(_entcnd -> {
                    return Double.valueOf(_entcnd.func_70092_e(_x, _y, _z));
                });
            }
        }.compareDistOf(x, y, z)).collect(Collectors.toList());
        for (final Entity entity : _entfound) {
            if (entity.func_70090_H() && (entity instanceof EntityPlayer) && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureLingQuanCheck.2
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("灵泉增益") != 1) {
                entity.getEntityData().func_74780_a("FanRenXiuXian50", entity.getEntityData().func_74769_h("FanRenXiuXian50") + 1.0d);
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.CLOUD, x, y, z, 50, 3.0d, 1.0d, 3.0d, 0.1d, new int[0]);
                }
                if ((entity instanceof EntityPlayer) && !entity.field_70170_p.field_72995_K) {
                    ((EntityPlayer) entity).func_146105_b(new TextComponentString("一股力量缓缓涌入体内..."), true);
                }
                if (entity.getEntityData().func_74769_h("FanRenXiuXian50") >= 60.0d) {
                    if (entity instanceof EntityPlayer) {
                        Scoreboard _sc = ((EntityPlayer) entity).func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("灵泉增益");
                        if (_so == null) {
                            _so = _sc.func_96535_a("灵泉增益", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so);
                        _scr.func_96647_c(1);
                    }
                    entity.getEntityData().func_74780_a("FanRenXiuXian50", 0.0d);
                    entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 16.0d);
                    entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 16.0d);
                    entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 160.0d);
                    entity.getEntityData().func_74780_a("PowerMax", entity.getEntityData().func_74769_h("PowerMax") + 280.0d);
                    entity.getEntityData().func_74780_a("PowerReply", entity.getEntityData().func_74769_h("PowerReply") + 2.0d);
                    entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 8.0d);
                    if ((entity instanceof EntityPlayer) && !entity.field_70170_p.field_72995_K) {
                        ((EntityPlayer) entity).func_146105_b(new TextComponentString("灵泉洗髓，体质大增！"), false);
                    }
                }
            }
        }
    }
}
