package by.ts.fanrenxiuxian.eventhandler;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/eventhandler/RenderGameOverlayEventHandler.class */
public class RenderGameOverlayEventHandler {
    public static final ImmutableList<Integer> caHuLi = ImmutableList.of(6, 7, 8, 9);

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onRenGaOvLa(RenderGameOverlayEvent event) {
        EntityPlayerSP player;
        if (caHuLi.contains(Integer.valueOf(event.getType().ordinal()))) {
            event.setCanceled(true);
        } else if (event.getType().ordinal() == 13 && (player = Minecraft.func_71410_x().field_71439_g) != null && player.getEntityData().func_74769_h("XiuLian") >= 1.0d) {
            event.setCanceled(true);
        }
    }
}
