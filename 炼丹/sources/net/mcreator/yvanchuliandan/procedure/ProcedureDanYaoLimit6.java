package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoLimit6.class */
public class ProcedureDanYaoLimit6 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoLimit6(ElementsYvanchuliandanMod instance) {
        super(instance, 553);
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x0d29, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("dan_yao_spoils_01") != false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d07  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0d8b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0df7  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 3603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoLimit6.executeProcedure(java.util.Map):void");
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
