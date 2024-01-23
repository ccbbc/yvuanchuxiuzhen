package by.ts.fanrenxiuxian.packet;

import by.ts.fanrenxiuxian.FanRenXiuXianMod;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/packet/EntityDataPacket.class */
public class EntityDataPacket implements IMessage {
    private NBTTagCompound entityData;
    private int entityId;

    public EntityDataPacket() {
    }

    public EntityDataPacket(NBTTagCompound entityData, int entityId) {
        this.entityData = entityData;
        this.entityId = entityId;
    }

    public void toBytes(ByteBuf buf) {
        PacketBuffer packet = new PacketBuffer(buf);
        packet.func_150786_a(this.entityData);
        packet.writeInt(this.entityId);
    }

    public void fromBytes(ByteBuf buf) {
        PacketBuffer packet = new PacketBuffer(buf);
        try {
            this.entityData = packet.func_150793_b();
            this.entityId = packet.readInt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/packet/EntityDataPacket$Handler.class */
    public static class Handler implements IMessageHandler<EntityDataPacket, IMessage> {
        public IMessage onMessage(EntityDataPacket message, MessageContext ctx) {
            Minecraft mc = Minecraft.func_71410_x();
            mc.func_152344_a(() -> {
                Entity entity = mc.field_71441_e.func_73045_a(message.entityId);
                if (entity != null) {
                    entity.getEntityData().func_179237_a(message.entityData);
                } else {
                    FanRenXiuXianMod.logger.error("在同步实体时，没有获取到entityId为" + message.entityId + "的实体。");
                }
            });
            return null;
        }
    }
}
