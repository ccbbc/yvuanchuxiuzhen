package edebe.doglib.api.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/network/SlotChangedMessage.class */
public class SlotChangedMessage implements IMessage {
    private int slotIndex;
    private int changeType;
    private int metadata;
    private int x;
    private int y;
    private int z;

    public SlotChangedMessage() {
    }

    public SlotChangedMessage(int slotIndex, int changeType, int metadata, int x, int y, int z) {
        this.slotIndex = slotIndex;
        this.changeType = changeType;
        this.metadata = metadata;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.slotIndex);
        buffer.writeInt(this.changeType);
        buffer.writeInt(this.metadata);
        buffer.writeInt(this.x);
        buffer.writeInt(this.y);
        buffer.writeInt(this.z);
    }

    public void fromBytes(ByteBuf buffer) {
        this.slotIndex = buffer.readInt();
        this.changeType = buffer.readInt();
        this.metadata = buffer.readInt();
        this.x = buffer.readInt();
        this.y = buffer.readInt();
        this.z = buffer.readInt();
    }

    public int getSlotIndex() {
        return this.slotIndex;
    }

    public int getChangeType() {
        return this.changeType;
    }

    public int getMetadata() {
        return this.metadata;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }
}
