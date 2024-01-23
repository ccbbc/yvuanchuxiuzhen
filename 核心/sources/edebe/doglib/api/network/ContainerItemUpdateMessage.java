package edebe.doglib.api.network;

import edebe.doglib.api.capability.ContainerItem;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import java.io.IOException;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/network/ContainerItemUpdateMessage.class */
public class ContainerItemUpdateMessage implements IMessage {
    private ContainerItem inventory;

    public ContainerItemUpdateMessage(ContainerItem inventory) {
        this.inventory = inventory;
    }

    private ContainerItemUpdateMessage() {
    }

    public void toBytes(ByteBuf buffer) {
        try {
            CompressedStreamTools.func_74800_a(this.inventory.m1serializeNBT(), new ByteBufOutputStream(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fromBytes(ByteBuf buffer) {
        try {
            this.inventory.deserializeNBT(CompressedStreamTools.func_152456_a(new ByteBufInputStream(buffer), new NBTSizeTracker(2097152L)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ContainerItem getInventory() {
        return this.inventory;
    }
}
