package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFa30Yiwang.class */
public class ProcedureGongFa30Yiwang extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFa30Yiwang(ElementsYvanchujiguanMod instance) {
        super(instance, 120);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchujiguan.procedure.ProcedureGongFa30Yiwang$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFa30Yiwang.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("GongFa29Yiwang") == 1) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.6d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 2.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 1.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 3.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 1.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 4.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 4.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 2.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 4.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 8.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 5.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 2.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 12.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 8.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 6.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 3.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 12.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 8.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 240.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 7.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 3.0d);
                entityPlayer.getEntityData().func_74780_a("GongFaZhuDong1", 0.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 12.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 32.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 240.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 8.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 4.0d);
                entityPlayer.getEntityData().func_74780_a("GongFaZhuDong1", 0.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 12.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 32.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 960.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 9.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 4.0d);
                entityPlayer.getEntityData().func_74780_a("GongFaZhuDong1", 0.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 84.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 32.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 960.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa29") == 10.0d) {
                entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") * 0.5d);
                entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") - 5.0d);
                entityPlayer.getEntityData().func_74780_a("GongFaZhuDong1", 0.0d);
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 516.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 32.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") - 960.0d);
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("GongFa29Yiwang");
                if (_so == null) {
                    _so = _sc.func_96535_a("GongFa29Yiwang", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(0);
            }
            entityPlayer.getEntityData().func_74780_a("GongFa29Num", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GongFa29", 0.0d);
            entityPlayer.getEntityData().func_74778_a("GongFaShow", "");
            entityPlayer.getEntityData().func_74778_a("DaoLv", "");
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
