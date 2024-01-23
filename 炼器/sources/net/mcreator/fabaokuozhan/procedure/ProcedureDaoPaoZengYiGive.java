package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureDaoPaoZengYiGive.class */
public class ProcedureDaoPaoZengYiGive extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDaoPaoZengYiGive(ElementsFabaokuozhanMod instance) {
        super(instance, 405);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0454  */
    /* JADX WARN: Type inference failed for: r0v136, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$7] */
    /* JADX WARN: Type inference failed for: r0v216, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$5] */
    /* JADX WARN: Type inference failed for: r0v296, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$3] */
    /* JADX WARN: Type inference failed for: r0v376, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$1] */
    /* JADX WARN: Type inference failed for: r2v116, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$6] */
    /* JADX WARN: Type inference failed for: r2v143, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$4] */
    /* JADX WARN: Type inference failed for: r2v174, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$2] */
    /* JADX WARN: Type inference failed for: r2v85, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive$8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 2511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoZengYiGive.executeProcedure(java.util.Map):void");
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

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
