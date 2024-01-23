package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFangZhi.class */
public class ProcedureZhenFangZhi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFangZhi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 384);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0381, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemMiZongZhen.block, 1).func_77973_b()) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0448, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemTianHuZhen.block, 1).func_77973_b()) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemLuoLeiZhen.block, 1).func_77973_b()) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x050f, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemJinJueZhen.block, 1).func_77973_b()) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05d6, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemXiuLianZhen.block, 1).func_77973_b()) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x069d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemDaXiuLianZhen.block, 1).func_77973_b()) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0764, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemYuanShuiZhen.block, 1).func_77973_b()) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x082b, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemWeiHuoZhen.block, 1).func_77973_b()) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x08f2, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemXinDingZhen.block, 1).func_77973_b()) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x09b9, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemWanXiangZhen.block, 1).func_77973_b()) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0a80, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemYiYiShuiJianZhen.block, 1).func_77973_b()) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0b47, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemChiHunLianYuZhen.block, 1).func_77973_b()) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemLieKongZhen.block, 1).func_77973_b()) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f3, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemChenHuizhen.block, 1).func_77973_b()) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ba, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemHuiLingZhen.block, 1).func_77973_b()) goto L376;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 3209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFangZhi.executeProcedure(java.util.Map):void");
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

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
