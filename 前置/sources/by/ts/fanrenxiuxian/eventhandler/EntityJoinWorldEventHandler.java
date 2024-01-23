package by.ts.fanrenxiuxian.eventhandler;

import by.ts.fanrenxiuxian.FRUtils;
import by.ts.fanrenxiuxian.packet.EntityDataPacket;
import by.ts.fanrenxiuxian.packet.PacketHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/eventhandler/EntityJoinWorldEventHandler.class */
public class EntityJoinWorldEventHandler {
    @SubscribeEvent
    public static void onRenGaOvLa(EntityJoinWorldEvent event) {
        EntityPlayerMP entity = event.getEntity();
        if (entity != null && (entity instanceof EntityPlayer) && !((Entity) entity).field_70170_p.field_72995_K) {
            EntityPlayerMP entityPlayerMP = (EntityPlayer) entity;
            PacketHandler.CHANNEL.sendTo(new EntityDataPacket(FRUtils.getCustomEntityData(entityPlayerMP), entityPlayerMP.func_145782_y()), entityPlayerMP);
        }
    }
}
