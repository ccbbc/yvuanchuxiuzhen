package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureZiZhi.class */
public class ProcedureZiZhi extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZiZhi(ElementsYvanchujiguanMod instance) {
        super(instance, 259);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("SCJRSJDZZ") == 1.0d) {
            entity.getEntityData().func_74780_a("计时器", entity.getEntityData().func_74769_h("计时器") + 1.0d);
            if (entity.getEntityData().func_74769_h("计时器") >= 30.0d) {
                double m = new Random().nextInt(6) + 1;
                if (m == 1.0d) {
                    entity.getEntityData().func_74780_a("ZiZhi", 25.0d);
                    entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.0d);
                } else if (m == 2.0d) {
                    entity.getEntityData().func_74780_a("ZiZhi", 26.0d);
                    entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.02d);
                } else if (m == 3.0d) {
                    entity.getEntityData().func_74780_a("ZiZhi", 27.0d);
                    entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.04d);
                } else if (m == 4.0d) {
                    entity.getEntityData().func_74780_a("ZiZhi", 28.0d);
                    entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.06d);
                } else if (m == 5.0d) {
                    entity.getEntityData().func_74780_a("ZiZhi", 29.0d);
                    entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.08d);
                } else if (m == 6.0d) {
                    entity.getEntityData().func_74780_a("ZiZhi", 30.0d);
                    entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.1d);
                }
                entity.getEntityData().func_74780_a("LingGenZanCun", 0.0d);
                for (int index0 = 0; index0 < 5; index0++) {
                    entity.getEntityData().func_74780_a("LingGenZanCun" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("LingGenZanCun")), 0.0d);
                    entity.getEntityData().func_74780_a("LingGenZanCun", 1.0d + entity.getEntityData().func_74769_h("LingGenZanCun"));
                }
                if (entity.getEntityData().func_74767_n("JinLingGen")) {
                    entity.getEntityData().func_74780_a("LingGenZanCun1", 1.0d);
                }
                if (entity.getEntityData().func_74767_n("MuLingGen")) {
                    entity.getEntityData().func_74780_a("LingGenZanCun2", 1.0d);
                }
                if (entity.getEntityData().func_74767_n("ShuiLingGen")) {
                    entity.getEntityData().func_74780_a("LingGenZanCun3", 1.0d);
                }
                if (entity.getEntityData().func_74767_n("HuoLingGen")) {
                    entity.getEntityData().func_74780_a("LingGenZanCun4", 1.0d);
                }
                if (entity.getEntityData().func_74767_n("TuLingGen")) {
                    entity.getEntityData().func_74780_a("LingGenZanCun5", 1.0d);
                }
                entity.getEntityData().func_74780_a("ZongJi", (((((entity.getEntityData().func_74769_h("LingGenZanCun2") + entity.getEntityData().func_74769_h("LingGenZanCun3")) + entity.getEntityData().func_74769_h("LingGenZanCun4")) + entity.getEntityData().func_74769_h("LingGenZanCun1")) + entity.getEntityData().func_74769_h("LingGenZanCun5")) - 1.0d) * 3.0d);
                entity.getEntityData().func_74780_a("ZiZhi", entity.getEntityData().func_74769_h("ZiZhi") - entity.getEntityData().func_74769_h("ZongJi"));
                entity.getEntityData().func_74780_a("SCJRSJDZZ", 2.0d);
                if (entity.getEntityData().func_74769_h("ZiZhi") < 25.0d && entity.getEntityData().func_74769_h("ZiZhi") >= 0.0d) {
                    entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.0d - ((25.0d - entity.getEntityData().func_74769_h("ZiZhi")) * 0.02d));
                }
            }
        }
        if (entity.getEntityData().func_74769_h("ZiZhi") < 0.0d) {
            entity.getEntityData().func_74780_a("ZiZhi", 0.0d);
        }
        if (entity.getEntityData().func_74769_h("ZiZhi") >= 25.0d && entity.getEntityData().func_74769_h("ZiZhi") <= 50.0d) {
            entity.getEntityData().func_74780_a("ZiZhiBianLiang", 0.0d + ((entity.getEntityData().func_74769_h("ZiZhi") - 25.0d) * 0.02d));
        } else if (entity.getEntityData().func_74769_h("ZiZhi") > 50.0d) {
            entity.getEntityData().func_74780_a("ZiZhi", 50.0d);
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
