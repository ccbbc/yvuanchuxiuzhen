package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoLimit3.class */
public class ProcedureDanYaoLimit3 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoLimit3(ElementsYvanchuliandanMod instance) {
        super(instance, 444);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_33") != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoLimit3$2] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoLimit3$3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoLimit3$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoLimit3.executeProcedure(java.util.Map):void");
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
