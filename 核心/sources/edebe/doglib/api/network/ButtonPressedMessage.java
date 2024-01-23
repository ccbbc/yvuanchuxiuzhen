package edebe.doglib.api.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/network/ButtonPressedMessage.class */
public class ButtonPressedMessage implements IMessage {
    private int buttonIndex;
    private int x;
    private int y;
    private int z;

    public ButtonPressedMessage() {
    }

    public ButtonPressedMessage(int buttonIndex, int x, int y, int z) {
        this.buttonIndex = buttonIndex;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.buttonIndex);
        buffer.writeInt(this.x);
        buffer.writeInt(this.y);
        buffer.writeInt(this.z);
    }

    public void fromBytes(ByteBuf buffer) {
        this.buttonIndex = buffer.readInt();
        this.x = buffer.readInt();
        this.y = buffer.readInt();
        this.z = buffer.readInt();
    }

    public int getButtonIndex() {
        return this.buttonIndex;
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
