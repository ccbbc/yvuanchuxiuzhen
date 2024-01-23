package net.mcreator.fabaokuozhan.gui;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.FabaokuozhanMod;
import net.mcreator.fabaokuozhan.procedure.ProcedureBenMingYuCuiLianGuiOpen;
import net.mcreator.fabaokuozhan.procedure.ProcedureLianQiQieHuan;
import net.mcreator.fabaokuozhan.procedure.ProcedureLianqijingyan;
import net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiLianQiGui2.class */
public class GuiLianQiGui2 extends ElementsFabaokuozhanMod.ModElement {
    public static int GUIID = 28;
    public static HashMap guistate = new HashMap();
    static Map<String, Object> $_dependencies = new HashMap();

    public GuiLianQiGui2(ElementsFabaokuozhanMod instance) {
        super(instance, 564);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        this.elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        this.elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiLianQiGui2$GuiContainerMod.class */
    public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
        private IInventory internal;
        private World world;
        private EntityPlayer entity;
        private int x;
        private int y;
        private int z;
        private Map<Integer, Slot> customSlots = new HashMap();

        public GuiContainerMod(World world, int x, int y, int z, EntityPlayer player) {
            this.world = world;
            this.entity = player;
            this.x = x;
            this.y = y;
            this.z = z;
            this.internal = new InventoryBasic("", true, 8);
            IInventory func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s instanceof IInventory) {
                this.internal = func_175625_s;
            }
            this.customSlots.put(0, func_75146_a(new Slot(this.internal, 0, 9, 28) { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.1
            }));
            this.customSlots.put(1, func_75146_a(new Slot(this.internal, 1, 9, 52) { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.2
            }));
            this.customSlots.put(2, func_75146_a(new Slot(this.internal, 2, 33, 28) { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.3
            }));
            this.customSlots.put(3, func_75146_a(new Slot(this.internal, 3, 33, 52) { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.4
            }));
            this.customSlots.put(4, func_75146_a(new Slot(this.internal, 4, 77, 28) { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.5
            }));
            this.customSlots.put(6, func_75146_a(new Slot(this.internal, 6, 133, 28) { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.6
                public ItemStack func_190901_a(EntityPlayer entity, ItemStack stack) {
                    ItemStack retval = super.func_190901_a(entity, stack);
                    GuiContainerMod.this.slotChanged(6, 1, 0);
                    return retval;
                }

                public void func_75220_a(ItemStack a, ItemStack b) {
                    super.func_75220_a(a, b);
                    GuiContainerMod.this.slotChanged(6, 2, b.func_190916_E() - a.func_190916_E());
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(7, func_75146_a(new Slot(this.internal, 7, 133, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.7
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public ItemStack func_190901_a(EntityPlayer entity, ItemStack stack) {
                    ItemStack retval = super.func_190901_a(entity, stack);
                    GuiContainerMod.this.slotChanged(7, 1, 0);
                    return retval;
                }

                public void func_75220_a(ItemStack a, ItemStack b) {
                    super.func_75220_a(a, b);
                    GuiContainerMod.this.slotChanged(7, 2, b.func_190916_E() - a.func_190916_E());
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            for (int si = 0; si < 3; si++) {
                for (int sj = 0; sj < 9; sj++) {
                    func_75146_a(new Slot(player.field_71071_by, sj + ((si + 1) * 9), 8 + (sj * 18), 84 + (si * 18)));
                }
            }
            for (int si2 = 0; si2 < 9; si2++) {
                func_75146_a(new Slot(player.field_71071_by, si2, 8 + (si2 * 18), 142));
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.function.Supplier
        public Map<Integer, Slot> get() {
            return this.customSlots;
        }

        public boolean func_75145_c(EntityPlayer player) {
            return this.internal.func_70300_a(player);
        }

        public ItemStack func_82846_b(EntityPlayer playerIn, int index) {
            ItemStack itemstack = ItemStack.field_190927_a;
            Slot slot = (Slot) this.field_75151_b.get(index);
            if (slot != null && slot.func_75216_d()) {
                ItemStack itemstack1 = slot.func_75211_c();
                itemstack = itemstack1.func_77946_l();
                if (index < 7) {
                    if (!func_75135_a(itemstack1, 7, this.field_75151_b.size(), true)) {
                        return ItemStack.field_190927_a;
                    }
                    slot.func_75220_a(itemstack1, itemstack);
                } else if (!func_75135_a(itemstack1, 0, 7, false)) {
                    if (index < 34) {
                        if (!func_75135_a(itemstack1, 34, this.field_75151_b.size(), true)) {
                            return ItemStack.field_190927_a;
                        }
                    } else if (!func_75135_a(itemstack1, 7, 34, false)) {
                        return ItemStack.field_190927_a;
                    }
                    return ItemStack.field_190927_a;
                }
                if (itemstack1.func_190916_E() == 0) {
                    slot.func_75215_d(ItemStack.field_190927_a);
                } else {
                    slot.func_75218_e();
                }
                if (itemstack1.func_190916_E() == itemstack.func_190916_E()) {
                    return ItemStack.field_190927_a;
                }
                slot.func_190901_a(playerIn, itemstack1);
            }
            return itemstack;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00ec A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x018e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0188 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected boolean func_75135_a(net.minecraft.item.ItemStack r5, int r6, int r7, boolean r8) {
            /*
                Method dump skipped, instructions count: 407
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiContainerMod.func_75135_a(net.minecraft.item.ItemStack, int, int, boolean):boolean");
        }

        public void func_75134_a(EntityPlayer playerIn) {
            super.func_75134_a(playerIn);
            if ((this.internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
                func_193327_a(playerIn, playerIn.field_70170_p, this.internal);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void slotChanged(int slotid, int ctype, int meta) {
            if (this.world != null && this.world.field_72995_K) {
                FabaokuozhanMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, this.x, this.y, this.z, ctype, meta));
                GuiLianQiGui2.handleSlotAction(this.entity, slotid, ctype, meta, this.x, this.y, this.z);
            }
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiLianQiGui2$GuiWindow.class */
    public static class GuiWindow extends GuiContainer {
        private World world;
        private int x;
        private int y;
        private int z;
        private EntityPlayer entity;
        private static final ResourceLocation texture = new ResourceLocation("fabaokuozhan:textures/lian_qi_gui_2.png");

        public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
            super(new GuiContainerMod(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.field_146999_f = 176;
            this.field_147000_g = 166;
        }

        public void func_73863_a(int mouseX, int mouseY, float partialTicks) {
            func_146276_q_();
            super.func_73863_a(mouseX, mouseY, partialTicks);
            func_191948_b(mouseX, mouseY);
        }

        protected void func_146976_a(float par1, int par2, int par3) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.field_146297_k.field_71446_o.func_110577_a(texture);
            int k = (this.field_146294_l - this.field_146999_f) / 2;
            int l = (this.field_146295_m - this.field_147000_g) / 2;
            func_146110_a(k, l, 0.0f, 0.0f, this.field_146999_f, this.field_147000_g, this.field_146999_f, this.field_147000_g);
            this.field_73735_i = 100.0f;
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("fabaokuozhan:textures/qi2.png"));
            func_146110_a(this.field_147003_i + 132, this.field_147009_r + 28, 0.0f, 0.0f, 16, 16, 16.0f, 16.0f);
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("fabaokuozhan:textures/gan_.png"));
            func_146110_a(this.field_147003_i + 9, this.field_147009_r + 28, 0.0f, 0.0f, 16, 16, 16.0f, 16.0f);
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("fabaokuozhan:textures/kun_.png"));
            func_146110_a(this.field_147003_i + 9, this.field_147009_r + 51, 0.0f, 0.0f, 16, 16, 16.0f, 16.0f);
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("fabaokuozhan:textures/chi_.png"));
            func_146110_a(this.field_147003_i + 32, this.field_147009_r + 28, 0.0f, 0.0f, 16, 16, 16.0f, 16.0f);
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("fabaokuozhan:textures/kan_.png"));
            func_146110_a(this.field_147003_i + 33, this.field_147009_r + 51, 0.0f, 0.0f, 16, 16, 16.0f, 16.0f);
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("fabaokuozhan:textures/ling_.png"));
            func_146110_a(this.field_147003_i + 77, this.field_147009_r + 28, 0.0f, 0.0f, 16, 16, 16.0f, 16.0f);
        }

        public void func_73876_c() {
            super.func_73876_c();
        }

        protected void func_73864_a(int mouseX, int mouseY, int mouseButton) throws IOException {
            super.func_73864_a(mouseX, mouseY, mouseButton);
        }

        protected void func_73869_a(char typedChar, int keyCode) throws IOException {
            super.func_73869_a(typedChar, keyCode);
        }

        /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.fabaokuozhan.gui.GuiLianQiGui2$GuiWindow$2] */
        /* JADX WARN: Type inference failed for: r2v16, types: [net.mcreator.fabaokuozhan.gui.GuiLianQiGui2$GuiWindow$3] */
        /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.fabaokuozhan.gui.GuiLianQiGui2$GuiWindow$1] */
        protected void func_146979_b(int par1, int par2) {
            this.field_146289_q.func_78276_b("剩余炼制时间:", 6, 7, -16777216);
            this.field_146289_q.func_78276_b("" + ((int) new Object() { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiWindow.1
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "剩余炼制时间")) + "", 67, 7, -39373);
            this.field_146289_q.func_78276_b("" + new Object() { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiWindow.2
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "级别") + "级炼器鼎", 6, 71, -6684673);
            this.field_146289_q.func_78276_b("模式:§b" + new Object() { // from class: net.mcreator.fabaokuozhan.gui.GuiLianQiGui2.GuiWindow.3
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "炼器模式") + "", 135, 7, -16777216);
        }

        public void func_146281_b() {
            super.func_146281_b();
            Keyboard.enableRepeatEvents(false);
        }

        public void func_73866_w_() {
            super.func_73866_w_();
            this.field_147003_i = (this.field_146294_l - 176) / 2;
            this.field_147009_r = (this.field_146295_m - 166) / 2;
            Keyboard.enableRepeatEvents(true);
            this.field_146292_n.clear();
            this.field_146292_n.add(new GuiButton(0, this.field_147003_i + 68, this.field_147009_r + 51, 35, 20, "炼制"));
            this.field_146292_n.add(new GuiButton(1, this.field_147003_i + 172, this.field_147009_r + 3, 55, 20, "本命与淬炼"));
            this.field_146292_n.add(new GuiButton(2, this.field_147003_i + 172, this.field_147009_r + 51, 55, 20, "炼器/材切换"));
        }

        protected void func_146284_a(GuiButton button) {
            FabaokuozhanMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.field_146127_k, this.x, this.y, this.z));
            GuiLianQiGui2.handleButtonAction(this.entity, button.field_146127_k, this.x, this.y, this.z);
        }

        public boolean func_73868_f() {
            return false;
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiLianQiGui2$GUIButtonPressedMessageHandler.class */
    public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
        public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                GuiLianQiGui2.handleButtonAction(entity, buttonID, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiLianQiGui2$GUISlotChangedMessageHandler.class */
    public static class GUISlotChangedMessageHandler implements IMessageHandler<GUISlotChangedMessage, IMessage> {
        public IMessage onMessage(GUISlotChangedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                int slotID = message.slotID;
                int changeType = message.changeType;
                int meta = message.meta;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                GuiLianQiGui2.handleSlotAction(entity, slotID, changeType, meta, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiLianQiGui2$GUIButtonPressedMessage.class */
    public static class GUIButtonPressedMessage implements IMessage {
        int buttonID;
        int x;
        int y;
        int z;

        public GUIButtonPressedMessage() {
        }

        public GUIButtonPressedMessage(int buttonID, int x, int y, int z) {
            this.buttonID = buttonID;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void toBytes(ByteBuf buf) {
            buf.writeInt(this.buttonID);
            buf.writeInt(this.x);
            buf.writeInt(this.y);
            buf.writeInt(this.z);
        }

        public void fromBytes(ByteBuf buf) {
            this.buttonID = buf.readInt();
            this.x = buf.readInt();
            this.y = buf.readInt();
            this.z = buf.readInt();
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiLianQiGui2$GUISlotChangedMessage.class */
    public static class GUISlotChangedMessage implements IMessage {
        int slotID;
        int x;
        int y;
        int z;
        int changeType;
        int meta;

        public GUISlotChangedMessage() {
        }

        public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
            this.slotID = slotID;
            this.x = x;
            this.y = y;
            this.z = z;
            this.changeType = changeType;
            this.meta = meta;
        }

        public void toBytes(ByteBuf buf) {
            buf.writeInt(this.slotID);
            buf.writeInt(this.x);
            buf.writeInt(this.y);
            buf.writeInt(this.z);
            buf.writeInt(this.changeType);
            buf.writeInt(this.meta);
        }

        public void fromBytes(ByteBuf buf) {
            this.slotID = buf.readInt();
            this.x = buf.readInt();
            this.y = buf.readInt();
            this.z = buf.readInt();
            this.changeType = buf.readInt();
            this.meta = buf.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
            return;
        }
        if (buttonID == 0) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianqipipei.executeProcedure($_dependencies);
        }
        if (buttonID == 1) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureBenMingYuCuiLianGuiOpen.executeProcedure($_dependencies);
        }
        if (buttonID == 2) {
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianQiQieHuan.executeProcedure($_dependencies);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
            return;
        }
        if (slotID == 6 && changeType == 1) {
            ProcedureLianqijingyan.executeProcedure($_dependencies);
        }
        if (slotID == 6 && changeType == 2) {
            ProcedureLianqijingyan.executeProcedure($_dependencies);
        }
        if (slotID == 7 && changeType == 1) {
            ProcedureLianqijingyan.executeProcedure($_dependencies);
        }
        if (slotID == 7 && changeType == 2) {
            ProcedureLianqijingyan.executeProcedure($_dependencies);
        }
    }
}
