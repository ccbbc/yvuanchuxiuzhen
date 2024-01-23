package net.mcreator.yvanchuxiuzhen;

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

/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/YvanchuxiuzhenModVariables.class */
public class YvanchuxiuzhenModVariables {

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/YvanchuxiuzhenModVariables$MapVariables.class */
    public static class MapVariables extends WorldSavedData {
        public static final String DATA_NAME = "yvanchuxiuzhen_mapvars";
        public double liucheng;
        public boolean jiegou09;
        public boolean firefirefire;
        public boolean NotServer;
        public boolean sumDoor;
        public boolean DiGongSum;
        public boolean TianGongSum;
        public boolean tiangongmen;
        public boolean difumen;
        public boolean FirstJoinWorld;
        public String JoinForce;
        public double Magnification;

        public MapVariables() {
            super(DATA_NAME);
            this.liucheng = 0.0d;
            this.jiegou09 = false;
            this.firefirefire = false;
            this.NotServer = false;
            this.sumDoor = false;
            this.DiGongSum = false;
            this.TianGongSum = false;
            this.tiangongmen = false;
            this.difumen = false;
            this.FirstJoinWorld = false;
            this.JoinForce = "";
            this.Magnification = 0.0d;
        }

        public MapVariables(String s) {
            super(s);
            this.liucheng = 0.0d;
            this.jiegou09 = false;
            this.firefirefire = false;
            this.NotServer = false;
            this.sumDoor = false;
            this.DiGongSum = false;
            this.TianGongSum = false;
            this.tiangongmen = false;
            this.difumen = false;
            this.FirstJoinWorld = false;
            this.JoinForce = "";
            this.Magnification = 0.0d;
        }

        public void func_76184_a(NBTTagCompound nbt) {
            this.liucheng = nbt.func_74769_h("liucheng");
            this.jiegou09 = nbt.func_74767_n("jiegou09");
            this.firefirefire = nbt.func_74767_n("firefirefire");
            this.NotServer = nbt.func_74767_n("NotServer");
            this.sumDoor = nbt.func_74767_n("sumDoor");
            this.DiGongSum = nbt.func_74767_n("DiGongSum");
            this.TianGongSum = nbt.func_74767_n("TianGongSum");
            this.tiangongmen = nbt.func_74767_n("tiangongmen");
            this.difumen = nbt.func_74767_n("difumen");
            this.FirstJoinWorld = nbt.func_74767_n("FirstJoinWorld");
            this.JoinForce = nbt.func_74779_i("JoinForce");
            this.Magnification = nbt.func_74769_h("Magnification");
        }

        public NBTTagCompound func_189551_b(NBTTagCompound nbt) {
            nbt.func_74780_a("liucheng", this.liucheng);
            nbt.func_74757_a("jiegou09", this.jiegou09);
            nbt.func_74757_a("firefirefire", this.firefirefire);
            nbt.func_74757_a("NotServer", this.NotServer);
            nbt.func_74757_a("sumDoor", this.sumDoor);
            nbt.func_74757_a("DiGongSum", this.DiGongSum);
            nbt.func_74757_a("TianGongSum", this.TianGongSum);
            nbt.func_74757_a("tiangongmen", this.tiangongmen);
            nbt.func_74757_a("difumen", this.difumen);
            nbt.func_74757_a("FirstJoinWorld", this.FirstJoinWorld);
            nbt.func_74778_a("JoinForce", this.JoinForce);
            nbt.func_74780_a("Magnification", this.Magnification);
            return nbt;
        }

        public void syncData(World world) {
            func_76185_a();
            if (world.field_72995_K) {
                YvanchuxiuzhenMod.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(0, this));
            } else {
                YvanchuxiuzhenMod.PACKET_HANDLER.sendToAll(new WorldSavedDataSyncMessage(0, this));
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

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/YvanchuxiuzhenModVariables$WorldVariables.class */
    public static class WorldVariables extends WorldSavedData {
        public static final String DATA_NAME = "yvanchuxiuzhen_worldvars";

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
                YvanchuxiuzhenMod.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(1, this));
            } else {
                YvanchuxiuzhenMod.PACKET_HANDLER.sendToDimension(new WorldSavedDataSyncMessage(1, this), world.field_73011_w.getDimension());
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

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/YvanchuxiuzhenModVariables$WorldSavedDataSyncMessageHandler.class */
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
                    YvanchuxiuzhenMod.PACKET_HANDLER.sendToAll(message);
                } else {
                    YvanchuxiuzhenMod.PACKET_HANDLER.sendToDimension(message, world.field_73011_w.getDimension());
                }
            }
            if (message.type == 0) {
                world.func_175693_T().func_75745_a(MapVariables.DATA_NAME, message.data);
            } else {
                world.getPerWorldStorage().func_75745_a(WorldVariables.DATA_NAME, message.data);
            }
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/YvanchuxiuzhenModVariables$WorldSavedDataSyncMessage.class */
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
