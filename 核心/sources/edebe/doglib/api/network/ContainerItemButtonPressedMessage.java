package edebe.doglib.api.network;

import edebe.doglib.api.helper.EnumHandHelper;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/network/ContainerItemButtonPressedMessage.class */
public class ContainerItemButtonPressedMessage implements IMessage {
    private int buttonIndex;
    private EnumHand hand;

    public ContainerItemButtonPressedMessage() {
    }

    public ContainerItemButtonPressedMessage(int buttonIndex, EnumHand hand) {
        this.buttonIndex = buttonIndex;
        this.hand = hand;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.buttonIndex);
        buffer.writeInt(EnumHandHelper.getIDFromHand(this.hand));
    }

    public void fromBytes(ByteBuf buffer) {
        this.buttonIndex = buffer.readInt();
        this.hand = EnumHandHelper.getHandFromID(buffer.readInt());
    }

    public int getButtonIndex() {
        return this.buttonIndex;
    }

    public EnumHand getHand() {
        return this.hand;
    }
}
