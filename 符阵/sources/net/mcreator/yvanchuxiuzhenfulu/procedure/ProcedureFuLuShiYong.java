package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFuLuShiYong.class */
public class ProcedureFuLuShiYong extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFuLuShiYong(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 290);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ba, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemYinShenFu.block, 1).func_77973_b()) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0381, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu2401.block, 1).func_77973_b()) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0448, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemZhaoMingFu.block, 1).func_77973_b()) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu02.block, 1).func_77973_b()) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x050f, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemHuoDanFu.block, 1).func_77973_b()) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05d6, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu26.block, 1).func_77973_b()) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x069d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemHuDunFu.block, 1).func_77973_b()) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0764, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu05.block, 1).func_77973_b()) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x082b, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu11.block, 1).func_77973_b()) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x08f2, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu25.block, 1).func_77973_b()) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x09b9, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu08.block, 1).func_77973_b()) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0a80, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiXingFu.block, 1).func_77973_b()) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0b47, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiJianFu.block, 1).func_77973_b()) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0c0e, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemJuFengFu.block, 1).func_77973_b()) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012c, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu03.block, 1).func_77973_b()) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0cd5, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemTieJiaFu.block, 1).func_77973_b()) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0d9c, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu13.block, 1).func_77973_b()) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0e63, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemRanShanFu.block, 1).func_77973_b()) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0f2a, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiZhenBao.block, 1).func_77973_b()) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x1068, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemLeiJiFuBao.block, 1).func_77973_b()) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x1130, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemWuLiangDunFuBao.block, 1).func_77973_b()) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x11f8, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiFuBao.block, 1).func_77973_b()) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x12c0, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu18.block, 1).func_77973_b()) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x1388, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemLiuHuoFu.block, 1).func_77973_b()) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f3, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu04.block, 1).func_77973_b()) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x1450, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu16.block, 1).func_77973_b()) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x1518, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b() == new net.minecraft.item.ItemStack(net.mcreator.yvanchuxiuzhenfulu.item.ItemHunDunJianShiFu.block, 1).func_77973_b()) goto L314;
     */
    /* JADX WARN: Type inference failed for: r0v841, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuLuShiYong$1] */
    /* JADX WARN: Type inference failed for: r0v843, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuLuShiYong$2] */
    /* JADX WARN: Type inference failed for: r0v845, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuLuShiYong$3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 5857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuLuShiYong.executeProcedure(java.util.Map):void");
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
