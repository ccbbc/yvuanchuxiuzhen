package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureTuPoIng.class */
public class ProcedureTuPoIng extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureTuPoIng(ElementsLianqisanqiannianMod instance) {
        super(instance, 21);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureTuPoIng$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFa") == 3000.0d) {
            if (entityPlayer.getEntityData().func_74767_n("突破") && entityPlayer.getEntityData().func_74769_h("LayerNum") == 999.0d) {
                entityPlayer.getEntityData().func_74757_a("突破", false);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("天地间，冥冥之中有一股力量限制了境界进程"), false);
                }
            }
            if (entityPlayer.getEntityData().func_74767_n("突破") && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureTuPoIng.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("已重伤") == 0 && entityPlayer.getEntityData().func_74769_h("BaseMax") > 0.0d && entityPlayer.getEntityData().func_74769_h("Base") >= entityPlayer.getEntityData().func_74769_h("BaseMax")) {
                if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) >= (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f) && entityPlayer.getEntityData().func_74769_h("Power") >= entityPlayer.getEntityData().func_74769_h("PowerMax")) {
                    if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 0.0d || ((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71075_bZ.field_75098_d)) {
                        Map<String, Object> $_dependencies = new HashMap<>();
                        $_dependencies.put("entity", entityPlayer);
                        ProcedureJingJieTuPo.executeProcedure($_dependencies);
                        entityPlayer.getEntityData().func_74757_a("突破", false);
                        return;
                    } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
                        if (Math.random() <= 0.5d) {
                            Map<String, Object> $_dependencies2 = new HashMap<>();
                            $_dependencies2.put("entity", entityPlayer);
                            ProcedureJingJieTuPo.executeProcedure($_dependencies2);
                        }
                        entityPlayer.getEntityData().func_74757_a("突破", false);
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (entityPlayer.getEntityData().func_74767_n("突破")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("真元、气血、灵气三者中有未满者或元神出窍导致目前暂时无法突破"), false);
                }
                entityPlayer.getEntityData().func_74757_a("突破", false);
            }
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

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
