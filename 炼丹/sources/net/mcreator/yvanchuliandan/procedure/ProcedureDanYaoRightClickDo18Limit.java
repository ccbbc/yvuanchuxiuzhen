package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.util.EnumActionResult;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoRightClickDo18Limit.class */
public class ProcedureDanYaoRightClickDo18Limit extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoRightClickDo18Limit(ElementsYvanchuliandanMod instance) {
        super(instance, 332);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("event") != null) {
            Object _obj = dependencies.get("event");
            if (_obj instanceof PlayerInteractEvent) {
                dependencies.put("itemstack", ((PlayerInteractEvent) _obj).getItemStack());
            }
        }
        if (ProcedureRightClick.executeProcedure(dependencies).func_188397_a() == EnumActionResult.FAIL && dependencies.get("event") != null) {
            Object _obj2 = dependencies.get("event");
            if (_obj2 instanceof Event) {
                Event _evt = (Event) _obj2;
                if (_evt.isCancelable()) {
                    _evt.setCanceled(true);
                }
            }
        }
    }

    @SubscribeEvent
    public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Object entity = event.getEntityPlayer();
        int i = event.getPos().func_177958_n();
        int j = event.getPos().func_177956_o();
        int k = event.getPos().func_177952_p();
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
