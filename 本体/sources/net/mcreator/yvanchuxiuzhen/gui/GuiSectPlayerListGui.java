package net.mcreator.yvanchuxiuzhen.gui;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Down;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1UnJob;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob2Down;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob2UnJob;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob2Up;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob3Down;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob3UnJob;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob3Up;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob4Down;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob4UnJob;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob4Up;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob5UnJob;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob6UnJob;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiGuiOpen;
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

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/GuiSectPlayerListGui.class */
public class GuiSectPlayerListGui extends ElementsYvanchuxiuzhenMod.ModElement {
    public static int GUIID = 12;
    public static HashMap guistate = new HashMap();
    static Map<String, Object> $_dependencies = new HashMap();

    public GuiSectPlayerListGui(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 536);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        this.elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        this.elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/GuiSectPlayerListGui$GuiContainerMod.class */
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
            this.internal = new InventoryBasic("", true, 0);
            IInventory func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s instanceof IInventory) {
                this.internal = func_175625_s;
            }
            for (int si = 0; si < 3; si++) {
                for (int sj = 0; sj < 9; sj++) {
                    func_75146_a(new Slot(player.field_71071_by, sj + ((si + 1) * 9), 20 + (sj * 18), 339 + (si * 18)));
                }
            }
            for (int si2 = 0; si2 < 9; si2++) {
                func_75146_a(new Slot(player.field_71071_by, si2, 20 + (si2 * 18), 397));
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
                if (index < 0) {
                    if (!func_75135_a(itemstack1, 0, this.field_75151_b.size(), true)) {
                        return ItemStack.field_190927_a;
                    }
                    slot.func_75220_a(itemstack1, itemstack);
                } else if (!func_75135_a(itemstack1, 0, 0, false)) {
                    if (index < 27) {
                        if (!func_75135_a(itemstack1, 27, this.field_75151_b.size(), true)) {
                            return ItemStack.field_190927_a;
                        }
                    } else if (!func_75135_a(itemstack1, 0, 27, false)) {
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
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiContainerMod.func_75135_a(net.minecraft.item.ItemStack, int, int, boolean):boolean");
        }

        public void func_75134_a(EntityPlayer playerIn) {
            super.func_75134_a(playerIn);
            if ((this.internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
                func_193327_a(playerIn, playerIn.field_70170_p, this.internal);
            }
        }

        private void slotChanged(int slotid, int ctype, int meta) {
            if (this.world != null && this.world.field_72995_K) {
                YvanchuxiuzhenMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, this.x, this.y, this.z, ctype, meta));
                GuiSectPlayerListGui.handleSlotAction(this.entity, slotid, ctype, meta, this.x, this.y, this.z);
            }
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/GuiSectPlayerListGui$GuiWindow.class */
    public static class GuiWindow extends GuiContainer {
        private World world;
        private int x;
        private int y;
        private int z;
        private EntityPlayer entity;
        private static final ResourceLocation texture = new ResourceLocation("yvanchuxiuzhen:textures/sect_player_list_gui.png");

        public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
            super(new GuiContainerMod(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.field_146999_f = 200;
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

        /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$3] */
        /* JADX WARN: Type inference failed for: r2v15, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$4] */
        /* JADX WARN: Type inference failed for: r2v21, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$5] */
        /* JADX WARN: Type inference failed for: r2v24, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$6] */
        /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$1] */
        /* JADX WARN: Type inference failed for: r2v30, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$7] */
        /* JADX WARN: Type inference failed for: r2v33, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$8] */
        /* JADX WARN: Type inference failed for: r2v39, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$9] */
        /* JADX WARN: Type inference failed for: r2v42, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$10] */
        /* JADX WARN: Type inference failed for: r2v48, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$11] */
        /* JADX WARN: Type inference failed for: r2v51, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$12] */
        /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui$GuiWindow$2] */
        protected void func_146979_b(int par1, int par2) {
            this.field_146289_q.func_78276_b("§2§l人员列表", 78, 7, -12829636);
            this.field_146289_q.func_78276_b("" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.1
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJobName6") + "§8: §2" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.2
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJob6") + "", 5, 28, -12829636);
            this.field_146289_q.func_78276_b("" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.3
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJobName5") + "§8: §2" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.4
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJob5") + "", 5, 51, -12829636);
            this.field_146289_q.func_78276_b("" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.5
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJobName4") + "§8: §2" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.6
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJob4") + "", 5, 74, -12829636);
            this.field_146289_q.func_78276_b("" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.7
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJobName3") + "§8: §2" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.8
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJob3") + "", 5, 97, -12829636);
            this.field_146289_q.func_78276_b("" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.9
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJobName2") + "§8: §2" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.10
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJob2") + "", 5, 120, -12829636);
            this.field_146289_q.func_78276_b("" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.11
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJobName1") + "§8: §2" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.gui.GuiSectPlayerListGui.GuiWindow.12
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "SectJob1") + "", 5, 143, -12829636);
            this.field_146289_q.func_78276_b("" + this.entity.getEntityData().func_74779_i("SxlGuiTip") + "", 137, 40, -12829636);
        }

        public void func_146281_b() {
            super.func_146281_b();
            Keyboard.enableRepeatEvents(false);
        }

        public void func_73866_w_() {
            super.func_73866_w_();
            this.field_147003_i = (this.field_146294_l - 200) / 2;
            this.field_147009_r = (this.field_146295_m - 166) / 2;
            Keyboard.enableRepeatEvents(true);
            this.field_146292_n.clear();
            this.field_146292_n.add(new GuiButton(0, this.field_147003_i + 96, this.field_147009_r + 23, 30, 20, "卸任"));
            this.field_146292_n.add(new GuiButton(1, this.field_147003_i + 96, this.field_147009_r + 46, 30, 20, "卸任"));
            this.field_146292_n.add(new GuiButton(2, this.field_147003_i + 96, this.field_147009_r + 69, 30, 20, "<"));
            this.field_146292_n.add(new GuiButton(3, this.field_147003_i + 129, this.field_147009_r + 69, 30, 20, ">"));
            this.field_146292_n.add(new GuiButton(4, this.field_147003_i + 162, this.field_147009_r + 69, 30, 20, "卸任"));
            this.field_146292_n.add(new GuiButton(5, this.field_147003_i + 96, this.field_147009_r + 92, 30, 20, "<"));
            this.field_146292_n.add(new GuiButton(6, this.field_147003_i + 129, this.field_147009_r + 92, 30, 20, ">"));
            this.field_146292_n.add(new GuiButton(7, this.field_147003_i + 162, this.field_147009_r + 92, 30, 20, "卸任"));
            this.field_146292_n.add(new GuiButton(8, this.field_147003_i + 96, this.field_147009_r + 115, 30, 20, "<"));
            this.field_146292_n.add(new GuiButton(9, this.field_147003_i + 129, this.field_147009_r + 115, 30, 20, ">"));
            this.field_146292_n.add(new GuiButton(10, this.field_147003_i + 162, this.field_147009_r + 115, 30, 20, "卸任"));
            this.field_146292_n.add(new GuiButton(11, this.field_147003_i + 96, this.field_147009_r + 138, 30, 20, "<"));
            this.field_146292_n.add(new GuiButton(12, this.field_147003_i + 129, this.field_147009_r + 138, 30, 20, ">"));
            this.field_146292_n.add(new GuiButton(13, this.field_147003_i + 162, this.field_147009_r + 138, 30, 20, "卸任"));
            this.field_146292_n.add(new GuiButton(14, this.field_147003_i - 35, this.field_147009_r + 144, 30, 20, "返回"));
        }

        protected void func_146284_a(GuiButton button) {
            YvanchuxiuzhenMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.field_146127_k, this.x, this.y, this.z));
            GuiSectPlayerListGui.handleButtonAction(this.entity, button.field_146127_k, this.x, this.y, this.z);
        }

        public boolean func_73868_f() {
            return false;
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/GuiSectPlayerListGui$GUIButtonPressedMessageHandler.class */
    public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
        public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                GuiSectPlayerListGui.handleButtonAction(entity, buttonID, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/GuiSectPlayerListGui$GUISlotChangedMessageHandler.class */
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
                GuiSectPlayerListGui.handleSlotAction(entity, slotID, changeType, meta, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/GuiSectPlayerListGui$GUIButtonPressedMessage.class */
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

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/GuiSectPlayerListGui$GUISlotChangedMessage.class */
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
            ProcedureSectJob6UnJob.executeProcedure($_dependencies);
        }
        if (buttonID == 1) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob5UnJob.executeProcedure($_dependencies);
        }
        if (buttonID == 2) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob4Up.executeProcedure($_dependencies);
        }
        if (buttonID == 3) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob4Down.executeProcedure($_dependencies);
        }
        if (buttonID == 4) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob4UnJob.executeProcedure($_dependencies);
        }
        if (buttonID == 5) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob3Up.executeProcedure($_dependencies);
        }
        if (buttonID == 6) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob3Down.executeProcedure($_dependencies);
        }
        if (buttonID == 7) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob3UnJob.executeProcedure($_dependencies);
        }
        if (buttonID == 8) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob2Up.executeProcedure($_dependencies);
        }
        if (buttonID == 9) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob2Down.executeProcedure($_dependencies);
        }
        if (buttonID == 10) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob2UnJob.executeProcedure($_dependencies);
        }
        if (buttonID == 11) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob1Up.executeProcedure($_dependencies);
        }
        if (buttonID == 12) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob1Down.executeProcedure($_dependencies);
        }
        if (buttonID == 13) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureSectJob1UnJob.executeProcedure($_dependencies);
        }
        if (buttonID == 14) {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureZhenShanBeiGuiOpen.executeProcedure($_dependencies);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
        }
    }
}
