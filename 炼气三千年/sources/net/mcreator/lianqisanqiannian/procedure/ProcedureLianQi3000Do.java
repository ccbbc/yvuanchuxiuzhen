package net.mcreator.lianqisanqiannian.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureLianQi3000Do.class */
public class ProcedureLianQi3000Do extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureLianQi3000Do(ElementsLianqisanqiannianMod instance) {
        super(instance, 15);
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLianQi3000Do$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        Object world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74767_n("纯钧攻击冷却")) {
            entityPlayer.getEntityData().func_74780_a("纯钧攻击冷却计时", entityPlayer.getEntityData().func_74769_h("纯钧攻击冷却计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("纯钧攻击冷却计时") >= 10.0d) {
                entityPlayer.getEntityData().func_74757_a("纯钧攻击冷却", false);
                entityPlayer.getEntityData().func_74780_a("纯钧攻击冷却计时", 0.0d);
            }
        }
        if (entityPlayer.getEntityData().func_74767_n("战斗状态")) {
            entityPlayer.getEntityData().func_74780_a("战斗状态计时", entityPlayer.getEntityData().func_74769_h("战斗状态计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("战斗状态计时") >= 1200.0d) {
                entityPlayer.getEntityData().func_74757_a("战斗状态", false);
                entityPlayer.getEntityData().func_74780_a("战斗状态计时", 0.0d);
            }
        }
        if (!entityPlayer.getEntityData().func_74767_n("战斗状态") && entityPlayer.getEntityData().func_74767_n("残血保护")) {
            entityPlayer.getEntityData().func_74780_a("残血保护计时", entityPlayer.getEntityData().func_74769_h("残血保护计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("残血保护计时") >= 1200.0d) {
                entityPlayer.getEntityData().func_74757_a("残血保护", false);
                entityPlayer.getEntityData().func_74780_a("残血保护计时", 0.0d);
            }
        }
        entityPlayer.getEntityData().func_74780_a("纯钧对话循环", entityPlayer.getEntityData().func_74769_h("纯钧对话循环") + 1.0d);
        if (entityPlayer.getEntityData().func_74779_i("TiZhi").contains("天妒之体") && entityPlayer.func_70089_S()) {
            entityPlayer.getEntityData().func_74780_a("天妒体计时1", entityPlayer.getEntityData().func_74769_h("天妒体计时1") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("天妒体计时1") >= 20.0d) {
                entityPlayer.getEntityData().func_74780_a("天妒体计时1", 0.0d);
                entityPlayer.getEntityData().func_74757_a("TuPoLimit", true);
                if (new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLianQi3000Do.1
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("TianDuReset") != 1) {
                    entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 30.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") + 7.0d);
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + 5.0d);
                    entityPlayer.getEntityData().func_74757_a("血量回复", true);
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc = entityPlayer.func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("TianDuReset");
                        if (_so == null) {
                            _so = _sc.func_96535_a("TianDuReset", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        _scr.func_96647_c(1);
                    }
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa") == 3000.0d) {
                    entityPlayer.getEntityData().func_74757_a("伪令使用者1", true);
                    entityPlayer.getEntityData().func_74757_a("伪令使用者2", true);
                    Map<String, Object> $_dependencies = new HashMap<>();
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureBuffAdd.executeProcedure($_dependencies);
                    entityPlayer.getEntityData().func_74780_a("丹药名暂存数", 6.0d);
                    for (int index0 = 0; index0 < 10; index0++) {
                        entityPlayer.getEntityData().func_74780_a("丹药名暂存数", entityPlayer.getEntityData().func_74769_h("丹药名暂存数") + 1.0d);
                        if (entityPlayer instanceof EntityPlayer) {
                            Scoreboard _sc2 = entityPlayer.func_96123_co();
                            ScoreObjective _so2 = _sc2.func_96518_b("danyao" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("丹药名暂存数")));
                            if (_so2 == null) {
                                _so2 = _sc2.func_96535_a("danyao" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("丹药名暂存数")), ScoreCriteria.field_96641_b);
                            }
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            _scr2.func_96647_c(0);
                        }
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc3 = entityPlayer.func_96123_co();
                        ScoreObjective _so3 = _sc3.func_96518_b("danyao06");
                        if (_so3 == null) {
                            _so3 = _sc3.func_96535_a("danyao06", ScoreCriteria.field_96641_b);
                        }
                        Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                        _scr3.func_96647_c(0);
                    }
                }
            }
        }
        Map<String, Object> $_dependencies2 = new HashMap<>();
        $_dependencies2.put("entity", entityPlayer);
        ProcedureLqsqnDo.executeProcedure($_dependencies2);
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

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
