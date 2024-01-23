package by.ts.fanrenxiuxian.eventhandler;

import by.ts.fanrenxiuxian.FRUtils;
import by.ts.fanrenxiuxian.packet.EntityDataPacket;
import by.ts.fanrenxiuxian.packet.PacketHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/eventhandler/PlayerEventHandler.class */
public class PlayerEventHandler {
    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        event.getOriginal();
        EntityPlayerMP entityPlayer = event.getEntityPlayer();
        PacketHandler.CHANNEL.sendTo(new EntityDataPacket(FRUtils.getCustomEntityData(entityPlayer), entityPlayer.func_145782_y()), entityPlayer);
    }
}
