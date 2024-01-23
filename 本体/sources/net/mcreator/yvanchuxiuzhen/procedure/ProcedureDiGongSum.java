package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenModVariables;
import net.mcreator.yvanchuxiuzhen.world.WorldWeimian01;
import net.mcreator.yvanchuxiuzhen.world.WorldWeimian02;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureDiGongSum.class */
public class ProcedureDiGongSum extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDiGongSum(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 373);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ((Integer) dependencies.get("x")).intValue();
        ((Integer) dependencies.get("y")).intValue();
        ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entity instanceof EntityPlayer) {
            if (entity.field_71093_bK == WorldWeimian01.DIMID && !YvanchuxiuzhenModVariables.MapVariables.get(world).DiGongSum) {
                $_dependencies.put("world", world);
                $_dependencies.put("x", 0);
                $_dependencies.put("y", 80);
                $_dependencies.put("z", 0);
                ProcedureDiGongJianZhuSum.executeProcedure($_dependencies);
                YvanchuxiuzhenModVariables.MapVariables.get(world).DiGongSum = true;
                YvanchuxiuzhenModVariables.MapVariables.get(world).syncData(world);
            }
            if (entity.field_71093_bK == WorldWeimian02.DIMID && !YvanchuxiuzhenModVariables.MapVariables.get(world).TianGongSum) {
                $_dependencies.put("world", world);
                $_dependencies.put("x", 0);
                $_dependencies.put("y", 80);
                $_dependencies.put("z", 0);
                ProcedureTianGongSum.executeProcedure($_dependencies);
                YvanchuxiuzhenModVariables.MapVariables.get(world).TianGongSum = true;
                YvanchuxiuzhenModVariables.MapVariables.get(world).syncData(world);
            }
        }
    }

    @SubscribeEvent
    public void onEntityJoin(EntityJoinWorldEvent event) {
        Object world = event.getWorld();
        Entity entity = event.getEntity();
        int i = (int) entity.field_70165_t;
        int j = (int) entity.field_70163_u;
        int k = (int) entity.field_70161_v;
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
