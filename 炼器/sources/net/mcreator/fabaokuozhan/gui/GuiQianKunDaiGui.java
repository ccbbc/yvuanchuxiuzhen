package net.mcreator.fabaokuozhan.gui;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.FabaokuozhanMod;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiQianKunDaiGui.class */
public class GuiQianKunDaiGui extends ElementsFabaokuozhanMod.ModElement {
    public static int GUIID = 22;
    public static HashMap guistate = new HashMap();

    public GuiQianKunDaiGui(ElementsFabaokuozhanMod instance) {
        super(instance, 379);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        this.elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        this.elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiQianKunDaiGui$GuiContainerMod.class */
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
            this.internal = new InventoryBasic("", true, 27);
            IInventory func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s instanceof IInventory) {
                this.internal = func_175625_s;
            }
            this.customSlots.put(0, func_75146_a(new Slot(this.internal, 0, 7, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.1
            }));
            this.customSlots.put(1, func_75146_a(new Slot(this.internal, 1, 25, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.2
            }));
            this.customSlots.put(2, func_75146_a(new Slot(this.internal, 2, 43, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.3
            }));
            this.customSlots.put(3, func_75146_a(new Slot(this.internal, 3, 61, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.4
            }));
            this.customSlots.put(4, func_75146_a(new Slot(this.internal, 4, 79, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.5
            }));
            this.customSlots.put(5, func_75146_a(new Slot(this.internal, 5, 97, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.6
            }));
            this.customSlots.put(6, func_75146_a(new Slot(this.internal, 6, 115, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.7
            }));
            this.customSlots.put(7, func_75146_a(new Slot(this.internal, 7, 133, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.8
            }));
            this.customSlots.put(8, func_75146_a(new Slot(this.internal, 8, 151, 17) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.9
            }));
            this.customSlots.put(9, func_75146_a(new Slot(this.internal, 9, 7, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.10
            }));
            this.customSlots.put(10, func_75146_a(new Slot(this.internal, 10, 25, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.11
            }));
            this.customSlots.put(11, func_75146_a(new Slot(this.internal, 11, 43, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.12
            }));
            this.customSlots.put(12, func_75146_a(new Slot(this.internal, 12, 61, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.13
            }));
            this.customSlots.put(13, func_75146_a(new Slot(this.internal, 13, 79, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.14
            }));
            this.customSlots.put(14, func_75146_a(new Slot(this.internal, 14, 97, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.15
            }));
            this.customSlots.put(15, func_75146_a(new Slot(this.internal, 15, 115, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.16
            }));
            this.customSlots.put(16, func_75146_a(new Slot(this.internal, 16, 133, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.17
            }));
            this.customSlots.put(17, func_75146_a(new Slot(this.internal, 17, 151, 35) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.18
            }));
            this.customSlots.put(18, func_75146_a(new Slot(this.internal, 18, 7, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.19
            }));
            this.customSlots.put(19, func_75146_a(new Slot(this.internal, 19, 25, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.20
            }));
            this.customSlots.put(20, func_75146_a(new Slot(this.internal, 20, 43, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.21
            }));
            this.customSlots.put(21, func_75146_a(new Slot(this.internal, 21, 61, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.22
            }));
            this.customSlots.put(22, func_75146_a(new Slot(this.internal, 22, 79, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.23
            }));
            this.customSlots.put(23, func_75146_a(new Slot(this.internal, 23, 97, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.24
            }));
            this.customSlots.put(24, func_75146_a(new Slot(this.internal, 24, 115, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.25
            }));
            this.customSlots.put(25, func_75146_a(new Slot(this.internal, 25, 133, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.26
            }));
            this.customSlots.put(26, func_75146_a(new Slot(this.internal, 26, 151, 53) { // from class: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.27
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
                if (index < 27) {
                    if (!func_75135_a(itemstack1, 27, this.field_75151_b.size(), true)) {
                        return ItemStack.field_190927_a;
                    }
                    slot.func_75220_a(itemstack1, itemstack);
                } else if (!func_75135_a(itemstack1, 0, 27, false)) {
                    if (index < 54) {
                        if (!func_75135_a(itemstack1, 54, this.field_75151_b.size(), true)) {
                            return ItemStack.field_190927_a;
                        }
                    } else if (!func_75135_a(itemstack1, 27, 54, false)) {
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
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui.GuiContainerMod.func_75135_a(net.minecraft.item.ItemStack, int, int, boolean):boolean");
        }

        public void func_75134_a(EntityPlayer playerIn) {
            super.func_75134_a(playerIn);
            if ((this.internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
                func_193327_a(playerIn, playerIn.field_70170_p, this.internal);
            }
        }

        private void slotChanged(int slotid, int ctype, int meta) {
            if (this.world != null && this.world.field_72995_K) {
                FabaokuozhanMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, this.x, this.y, this.z, ctype, meta));
                GuiQianKunDaiGui.handleSlotAction(this.entity, slotid, ctype, meta, this.x, this.y, this.z);
            }
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiQianKunDaiGui$GuiWindow.class */
    public static class GuiWindow extends GuiContainer {
        private World world;
        private int x;
        private int y;
        private int z;
        private EntityPlayer entity;
        private static final ResourceLocation texture = new ResourceLocation("fabaokuozhan:textures/qian_kun_dai_gui.png");

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

        protected void func_146979_b(int par1, int par2) {
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
        }

        protected void func_146284_a(GuiButton button) {
            FabaokuozhanMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.field_146127_k, this.x, this.y, this.z));
            GuiQianKunDaiGui.handleButtonAction(this.entity, button.field_146127_k, this.x, this.y, this.z);
        }

        public boolean func_73868_f() {
            return false;
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiQianKunDaiGui$GUIButtonPressedMessageHandler.class */
    public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
        public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                GuiQianKunDaiGui.handleButtonAction(entity, buttonID, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiQianKunDaiGui$GUISlotChangedMessageHandler.class */
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
                GuiQianKunDaiGui.handleSlotAction(entity, slotID, changeType, meta, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiQianKunDaiGui$GUIButtonPressedMessage.class */
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

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/gui/GuiQianKunDaiGui$GUISlotChangedMessage.class */
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
        }
    }
}
