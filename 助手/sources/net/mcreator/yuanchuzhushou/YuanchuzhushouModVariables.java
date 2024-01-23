package net.mcreator.yuanchuzhushou;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/YuanchuzhushouModVariables.class */
public class YuanchuzhushouModVariables {

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/YuanchuzhushouModVariables$MapVariables.class */
    public static class MapVariables extends WorldSavedData {
        public static final String DATA_NAME = "yuanchuzhushou_mapvars";

        public MapVariables() {
            super(DATA_NAME);
        }

        public MapVariables(String s) {
            super(s);
        }

        public void func_76184_a(NBTTagCompound nbt) {
        }

        public NBTTagCompound func_189551_b(NBTTagCompound nbt) {
            return nbt;
        }

        public void syncData(World world) {
            func_76185_a();
            if (world.field_72995_K) {
                YuanchuzhushouMod.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(0, this));
            } else {
                YuanchuzhushouMod.PACKET_HANDLER.sendToAll(new WorldSavedDataSyncMessage(0, this));
            }
        }

        public static MapVariables get(World world) {
            MapVariables instance = (MapVariables) world.func_175693_T().func_75742_a(MapVariables.class, DATA_NAME);
            if (instance == null) {
                instance = new MapVariables();
                world.func_175693_T().func_75745_a(DATA_NAME, instance);
            }
            return instance;
        }
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/YuanchuzhushouModVariables$WorldVariables.class */
    public static class WorldVariables extends WorldSavedData {
        public static final String DATA_NAME = "yuanchuzhushou_worldvars";

        public WorldVariables() {
            super(DATA_NAME);
        }

        public WorldVariables(String s) {
            super(s);
        }

        public void func_76184_a(NBTTagCompound nbt) {
        }

        public NBTTagCompound func_189551_b(NBTTagCompound nbt) {
            return nbt;
        }

        public void syncData(World world) {
            func_76185_a();
            if (world.field_72995_K) {
                YuanchuzhushouMod.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(1, this));
            } else {
                YuanchuzhushouMod.PACKET_HANDLER.sendToDimension(new WorldSavedDataSyncMessage(1, this), world.field_73011_w.getDimension());
            }
        }

        public static WorldVariables get(World world) {
            WorldVariables instance = (WorldVariables) world.getPerWorldStorage().func_75742_a(WorldVariables.class, DATA_NAME);
            if (instance == null) {
                instance = new WorldVariables();
                world.getPerWorldStorage().func_75745_a(DATA_NAME, instance);
            }
            return instance;
        }
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/YuanchuzhushouModVariables$WorldSavedDataSyncMessageHandler.class */
    public static class WorldSavedDataSyncMessageHandler implements IMessageHandler<WorldSavedDataSyncMessage, IMessage> {
        public IMessage onMessage(WorldSavedDataSyncMessage message, MessageContext context) {
            if (context.side == Side.SERVER) {
                context.getServerHandler().field_147369_b.func_71121_q().func_152344_a(() -> {
                    syncData(message, context, context.getServerHandler().field_147369_b.field_70170_p);
                });
                return null;
            }
            Minecraft.func_71410_x().func_152344_a(() -> {
                syncData(message, context, Minecraft.func_71410_x().field_71439_g.field_70170_p);
            });
            return null;
        }

        private void syncData(WorldSavedDataSyncMessage message, MessageContext context, World world) {
            if (context.side == Side.SERVER) {
                message.data.func_76185_a();
                if (message.type == 0) {
                    YuanchuzhushouMod.PACKET_HANDLER.sendToAll(message);
                } else {
                    YuanchuzhushouMod.PACKET_HANDLER.sendToDimension(message, world.field_73011_w.getDimension());
                }
            }
            if (message.type == 0) {
                world.func_175693_T().func_75745_a(MapVariables.DATA_NAME, message.data);
            } else {
                world.getPerWorldStorage().func_75745_a(WorldVariables.DATA_NAME, message.data);
            }
        }
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/YuanchuzhushouModVariables$WorldSavedDataSyncMessage.class */
    public static class WorldSavedDataSyncMessage implements IMessage {
        public int type;
        public WorldSavedData data;

        public WorldSavedDataSyncMessage() {
        }

        public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
            this.type = type;
            this.data = data;
        }

        public void toBytes(ByteBuf buf) {
            buf.writeInt(this.type);
            ByteBufUtils.writeTag(buf, this.data.func_189551_b(new NBTTagCompound()));
        }

        public void fromBytes(ByteBuf buf) {
            this.type = buf.readInt();
            if (this.type == 0) {
                this.data = new MapVariables();
            } else {
                this.data = new WorldVariables();
            }
            this.data.func_76184_a(ByteBufUtils.readTag(buf));
        }
    }
}
