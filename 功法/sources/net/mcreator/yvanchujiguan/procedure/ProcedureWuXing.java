package net.mcreator.yvanchujiguan.procedure;

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
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureWuXing.class */
public class ProcedureWuXing extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureWuXing(ElementsYvanchujiguanMod instance) {
        super(instance, 170);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("SCJRSJDWX") == 1.0d && entity.getEntityData().func_74769_h("计时器") >= 30.0d) {
            double Sing = new Random().nextInt(11) + 1;
            if (Sing == 1.0d) {
                entity.getEntityData().func_74780_a("WuXing", 5.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", -0.5d);
            } else if (Sing == 2.0d) {
                entity.getEntityData().func_74780_a("WuXing", 6.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", -0.4d);
            } else if (Sing == 3.0d) {
                entity.getEntityData().func_74780_a("WuXing", 7.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", -0.3d);
            } else if (Sing == 4.0d) {
                entity.getEntityData().func_74780_a("WuXing", 8.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", -0.2d);
            } else if (Sing == 5.0d) {
                entity.getEntityData().func_74780_a("WuXing", 9.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", -0.1d);
            } else if (Sing == 6.0d) {
                entity.getEntityData().func_74780_a("WuXing", 10.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", 0.0d);
            } else if (Sing == 7.0d) {
                entity.getEntityData().func_74780_a("WuXing", 11.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", 0.1d);
            } else if (Sing == 8.0d) {
                entity.getEntityData().func_74780_a("WuXing", 12.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", 0.2d);
            } else if (Sing == 9.0d) {
                entity.getEntityData().func_74780_a("WuXing", 13.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", 0.3d);
            } else if (Sing == 10.0d) {
                entity.getEntityData().func_74780_a("WuXing", 14.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", 0.4d);
            } else if (Sing == 11.0d) {
                entity.getEntityData().func_74780_a("WuXing", 15.0d);
                entity.getEntityData().func_74780_a("WuXingBianLiang", 0.5d);
            }
            entity.getEntityData().func_74780_a("SCJRSJDWX", 2.0d);
        }
        if (entity.getEntityData().func_74769_h("WuXing") < 5.0d && entity.getEntityData().func_74769_h("WuXing") >= 0.0d) {
            entity.getEntityData().func_74780_a("WuXingBianLiang", 0.5d - ((5.0d - entity.getEntityData().func_74769_h("WuXing")) * 0.1d));
        } else if (entity.getEntityData().func_74769_h("WuXing") < 0.0d) {
            entity.getEntityData().func_74780_a("WuXing", 0.0d);
        }
        if (entity.getEntityData().func_74769_h("WuXing") > 15.0d && entity.getEntityData().func_74769_h("WuXing") <= 20.0d) {
            entity.getEntityData().func_74780_a("WuXingBianLiang", 0.5d + ((entity.getEntityData().func_74769_h("WuXing") - 15.0d) * 0.1d));
        } else if (entity.getEntityData().func_74769_h("WuXing") > 20.0d) {
            entity.getEntityData().func_74780_a("WuXing", 20.0d);
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
