package edebe.doglib.api.network;

import edebe.doglib.api.helper.EnumHandHelper;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/network/ContainerItemSlotChangedMessage.class */
public class ContainerItemSlotChangedMessage implements IMessage {
    private int slotIndex;
    private int changeType;
    private int metadata;
    private EnumHand hand;

    public ContainerItemSlotChangedMessage() {
    }

    public ContainerItemSlotChangedMessage(int slotIndex, int changeType, int metadata, EnumHand hand) {
        this.slotIndex = slotIndex;
        this.changeType = changeType;
        this.metadata = metadata;
        this.hand = hand;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.slotIndex);
        buffer.writeInt(this.changeType);
        buffer.writeInt(this.metadata);
        buffer.writeInt(EnumHandHelper.getIDFromHand(this.hand));
    }

    public void fromBytes(ByteBuf buffer) {
        this.slotIndex = buffer.readInt();
        this.changeType = buffer.readInt();
        this.metadata = buffer.readInt();
        this.hand = EnumHandHelper.getHandFromID(buffer.readInt());
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

    public EnumHand getHand() {
        return this.hand;
    }
}
