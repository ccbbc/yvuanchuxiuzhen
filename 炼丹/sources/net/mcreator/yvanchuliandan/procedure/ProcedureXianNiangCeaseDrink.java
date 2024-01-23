package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianNiangCeaseDrink.class */
public class ProcedureXianNiangCeaseDrink extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianNiangCeaseDrink(ElementsYvanchuliandanMod instance) {
        super(instance, 706);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02fb, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:xian_niang_02") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03a3, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:xian_niang_03") != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:qing_li") != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x044b, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:xian_niang_04") != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04f3, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:xian_niang_05") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x059b, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:xian_niang_06") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:tao_zi") != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:chi_song_zi") != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0255, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:xian_niang_01") != false) goto L208;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            Method dump skipped, instructions count: 1701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuliandan.procedure.ProcedureXianNiangCeaseDrink.executeProcedure(java.util.Map):void");
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
