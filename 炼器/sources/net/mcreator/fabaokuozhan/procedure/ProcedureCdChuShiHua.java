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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCdChuShiHua.class */
public class ProcedureCdChuShiHua extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCdChuShiHua(ElementsFabaokuozhanMod instance) {
        super(instance, 292);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x03df, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x056c, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0631, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x06f6, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x07bb, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0880, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0943, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0a08, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184614_ca() : net.minecraft.item.ItemStack.field_190927_a).func_77978_p().func_74767_n("初始化") == false) goto L395;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 3166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.fabaokuozhan.procedure.ProcedureCdChuShiHua.executeProcedure(java.util.Map):void");
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
