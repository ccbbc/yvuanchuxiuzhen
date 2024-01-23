package by.ts.fanrenxiuxian.packet;

import by.ts.fanrenxiuxian.FanRenXiuXianMod;
import by.ts.fanrenxiuxian.packet.EntityDataPacket;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/packet/PacketHandler.class */
public class PacketHandler {
    public static int id = 0;
    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(FanRenXiuXianMod.MODID);

    public static void init() {
        SimpleNetworkWrapper simpleNetworkWrapper = CHANNEL;
        int i = id;
        id = i + 1;
        simpleNetworkWrapper.registerMessage(EntityDataPacket.Handler.class, EntityDataPacket.class, i, Side.CLIENT);
    }
}
