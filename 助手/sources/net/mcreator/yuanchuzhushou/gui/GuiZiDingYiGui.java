package net.mcreator.yuanchuzhushou.gui;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.YuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.procedure.ProcedureCaiShiXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureDuSuFang;
import net.mcreator.yuanchuzhushou.procedure.ProcedureDuSuGong;
import net.mcreator.yuanchuzhushou.procedure.ProcedureFaShuFang;
import net.mcreator.yuanchuzhushou.procedure.ProcedureFaShuGong;
import net.mcreator.yuanchuzhushou.procedure.ProcedureHuaFuXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureHuiLingZhi;
import net.mcreator.yuanchuzhushou.procedure.ProcedureHuoYanFang;
import net.mcreator.yuanchuzhushou.procedure.ProcedureHuoYanGong;
import net.mcreator.yuanchuzhushou.procedure.ProcedureLeiDianFang;
import net.mcreator.yuanchuzhushou.procedure.ProcedureLeiDianGong;
import net.mcreator.yuanchuzhushou.procedure.ProcedureLianDanXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureLianQiJingYan;
import net.mcreator.yuanchuzhushou.procedure.ProcedureLingLiZhi;
import net.mcreator.yuanchuzhushou.procedure.ProcedureNiangJiuXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShaQiZhi;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShengMing;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShuZhi1;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShuZhi2;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShuZhi3;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShuZhi4;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShuZhi5;
import net.mcreator.yuanchuzhushou.procedure.ProcedureShuZhi6;
import net.mcreator.yuanchuzhushou.procedure.ProcedureSouXunXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureWuFang;
import net.mcreator.yuanchuzhushou.procedure.ProcedureWuGong;
import net.mcreator.yuanchuzhushou.procedure.ProcedureXingShangXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureZhenFaXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureZhenYuanZhi;
import net.mcreator.yuanchuzhushou.procedure.ProcedureZhiLiXp;
import net.mcreator.yuanchuzhushou.procedure.ProcedureZhongZhiXp;
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

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/gui/GuiZiDingYiGui.class */
public class GuiZiDingYiGui extends ElementsYuanchuzhushouMod.ModElement {
    public static int GUIID = 6;
    public static HashMap guistate = new HashMap();

    public GuiZiDingYiGui(ElementsYuanchuzhushouMod instance) {
        super(instance, 92);
    }

    @Override // net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        this.elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        this.elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/gui/GuiZiDingYiGui$GuiContainerMod.class */
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
                    func_75146_a(new Slot(player.field_71071_by, sj + ((si + 1) * 9), 8 + (sj * 18), 340 + (si * 18)));
                }
            }
            for (int si2 = 0; si2 < 9; si2++) {
                func_75146_a(new Slot(player.field_71071_by, si2, 8 + (si2 * 18), 398));
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
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yuanchuzhushou.gui.GuiZiDingYiGui.GuiContainerMod.func_75135_a(net.minecraft.item.ItemStack, int, int, boolean):boolean");
        }

        public void func_75134_a(EntityPlayer playerIn) {
            super.func_75134_a(playerIn);
            if ((this.internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
                func_193327_a(playerIn, playerIn.field_70170_p, this.internal);
            }
        }

        private void slotChanged(int slotid, int ctype, int meta) {
            if (this.world != null && this.world.field_72995_K) {
                YuanchuzhushouMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, this.x, this.y, this.z, ctype, meta));
                GuiZiDingYiGui.handleSlotAction(this.entity, slotid, ctype, meta, this.x, this.y, this.z);
            }
        }
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/gui/GuiZiDingYiGui$GuiWindow.class */
    public static class GuiWindow extends GuiContainer {
        private World world;
        private int x;
        private int y;
        private int z;
        private EntityPlayer entity;

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
            this.field_73735_i = 100.0f;
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("yuanchuzhushou:textures/zi_ding_yi_shu_xing_bei_jing_.png"));
            func_146110_a(this.field_147003_i - 74, this.field_147009_r - 20, 0.0f, 0.0f, 320, 180, 320.0f, 180.0f);
            this.field_146297_k.field_71446_o.func_110577_a(new ResourceLocation("yuanchuzhushou:textures/bjk1.png"));
            func_146110_a(this.field_147003_i + 42, this.field_147009_r - 11, 0.0f, 0.0f, 81, 16, 81.0f, 16.0f);
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
            this.field_146289_q.func_78276_b("" + ((int) this.entity.getEntityData().func_74769_h("工具数值")) + "", 45, -7, -154);
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
            this.field_146292_n.add(new GuiButton(0, this.field_147003_i - 65, this.field_147009_r - 11, 27, 20, "-1"));
            this.field_146292_n.add(new GuiButton(1, this.field_147003_i - 38, this.field_147009_r - 11, 27, 20, "-100"));
            this.field_146292_n.add(new GuiButton(2, this.field_147003_i - 11, this.field_147009_r - 11, 45, 20, "-10000"));
            this.field_146292_n.add(new GuiButton(3, this.field_147003_i + 132, this.field_147009_r - 11, 27, 20, "+1"));
            this.field_146292_n.add(new GuiButton(4, this.field_147003_i + 159, this.field_147009_r - 11, 27, 20, "+100"));
            this.field_146292_n.add(new GuiButton(5, this.field_147003_i + 186, this.field_147009_r - 11, 45, 20, "+10000"));
            this.field_146292_n.add(new GuiButton(6, this.field_147003_i - 65, this.field_147009_r + 25, 54, 20, "炼器经验"));
            this.field_146292_n.add(new GuiButton(7, this.field_147003_i - 65, this.field_147009_r + 52, 54, 20, "炼丹经验"));
            this.field_146292_n.add(new GuiButton(8, this.field_147003_i - 65, this.field_147009_r + 79, 54, 20, "画符经验"));
            this.field_146292_n.add(new GuiButton(9, this.field_147003_i - 65, this.field_147009_r + 106, 54, 20, "阵法经验"));
            this.field_146292_n.add(new GuiButton(10, this.field_147003_i - 65, this.field_147009_r + 133, 54, 20, "支离经验"));
            this.field_146292_n.add(new GuiButton(11, this.field_147003_i - 2, this.field_147009_r + 25, 54, 20, "搜寻经验"));
            this.field_146292_n.add(new GuiButton(12, this.field_147003_i - 2, this.field_147009_r + 52, 54, 20, "种植经验"));
            this.field_146292_n.add(new GuiButton(13, this.field_147003_i - 2, this.field_147009_r + 79, 54, 20, "酿酒经验"));
            this.field_146292_n.add(new GuiButton(14, this.field_147003_i - 2, this.field_147009_r + 106, 54, 20, "采石经验"));
            this.field_146292_n.add(new GuiButton(15, this.field_147003_i - 2, this.field_147009_r + 133, 54, 20, "行商经验"));
            this.field_146292_n.add(new GuiButton(16, this.field_147003_i + 78, this.field_147009_r + 25, 27, 20, "物攻"));
            this.field_146292_n.add(new GuiButton(17, this.field_147003_i + 114, this.field_147009_r + 25, 27, 20, "物防"));
            this.field_146292_n.add(new GuiButton(18, this.field_147003_i + 78, this.field_147009_r + 52, 27, 20, "法攻"));
            this.field_146292_n.add(new GuiButton(19, this.field_147003_i + 78, this.field_147009_r + 79, 27, 20, "火攻"));
            this.field_146292_n.add(new GuiButton(20, this.field_147003_i + 78, this.field_147009_r + 106, 27, 20, "雷攻"));
            this.field_146292_n.add(new GuiButton(21, this.field_147003_i + 78, this.field_147009_r + 133, 27, 20, "毒攻"));
            this.field_146292_n.add(new GuiButton(22, this.field_147003_i + 114, this.field_147009_r + 52, 27, 20, "法防"));
            this.field_146292_n.add(new GuiButton(23, this.field_147003_i + 114, this.field_147009_r + 79, 27, 20, "火防"));
            this.field_146292_n.add(new GuiButton(24, this.field_147003_i + 114, this.field_147009_r + 106, 27, 20, "雷防"));
            this.field_146292_n.add(new GuiButton(25, this.field_147003_i + 114, this.field_147009_r + 133, 27, 20, "毒防"));
            this.field_146292_n.add(new GuiButton(26, this.field_147003_i + 150, this.field_147009_r + 25, 27, 20, "气血"));
            this.field_146292_n.add(new GuiButton(27, this.field_147003_i + 150, this.field_147009_r + 52, 27, 20, "灵力"));
            this.field_146292_n.add(new GuiButton(28, this.field_147003_i + 150, this.field_147009_r + 79, 27, 20, "回灵"));
            this.field_146292_n.add(new GuiButton(29, this.field_147003_i + 150, this.field_147009_r + 106, 27, 20, "煞气"));
            this.field_146292_n.add(new GuiButton(30, this.field_147003_i + 150, this.field_147009_r + 133, 27, 20, "真元"));
        }

        protected void func_146284_a(GuiButton button) {
            YuanchuzhushouMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.field_146127_k, this.x, this.y, this.z));
            GuiZiDingYiGui.handleButtonAction(this.entity, button.field_146127_k, this.x, this.y, this.z);
        }

        public boolean func_73868_f() {
            return false;
        }
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/gui/GuiZiDingYiGui$GUIButtonPressedMessageHandler.class */
    public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
        public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                GuiZiDingYiGui.handleButtonAction(entity, buttonID, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/gui/GuiZiDingYiGui$GUISlotChangedMessageHandler.class */
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
                GuiZiDingYiGui.handleSlotAction(entity, slotID, changeType, meta, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/gui/GuiZiDingYiGui$GUIButtonPressedMessage.class */
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

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/gui/GuiZiDingYiGui$GUISlotChangedMessage.class */
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
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureShuZhi1.executeProcedure($_dependencies);
        }
        if (buttonID == 1) {
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("entity", entity);
            ProcedureShuZhi2.executeProcedure($_dependencies2);
        }
        if (buttonID == 2) {
            Map<String, Object> $_dependencies3 = new HashMap<>();
            $_dependencies3.put("entity", entity);
            ProcedureShuZhi3.executeProcedure($_dependencies3);
        }
        if (buttonID == 3) {
            Map<String, Object> $_dependencies4 = new HashMap<>();
            $_dependencies4.put("entity", entity);
            ProcedureShuZhi4.executeProcedure($_dependencies4);
        }
        if (buttonID == 4) {
            Map<String, Object> $_dependencies5 = new HashMap<>();
            $_dependencies5.put("entity", entity);
            ProcedureShuZhi5.executeProcedure($_dependencies5);
        }
        if (buttonID == 5) {
            Map<String, Object> $_dependencies6 = new HashMap<>();
            $_dependencies6.put("entity", entity);
            ProcedureShuZhi6.executeProcedure($_dependencies6);
        }
        if (buttonID == 6) {
            Map<String, Object> $_dependencies7 = new HashMap<>();
            $_dependencies7.put("entity", entity);
            $_dependencies7.put("x", Integer.valueOf(x));
            $_dependencies7.put("y", Integer.valueOf(y));
            $_dependencies7.put("z", Integer.valueOf(z));
            $_dependencies7.put("world", world);
            ProcedureLianQiJingYan.executeProcedure($_dependencies7);
        }
        if (buttonID == 7) {
            Map<String, Object> $_dependencies8 = new HashMap<>();
            $_dependencies8.put("entity", entity);
            $_dependencies8.put("x", Integer.valueOf(x));
            $_dependencies8.put("y", Integer.valueOf(y));
            $_dependencies8.put("z", Integer.valueOf(z));
            $_dependencies8.put("world", world);
            ProcedureLianDanXp.executeProcedure($_dependencies8);
        }
        if (buttonID == 8) {
            Map<String, Object> $_dependencies9 = new HashMap<>();
            $_dependencies9.put("entity", entity);
            $_dependencies9.put("x", Integer.valueOf(x));
            $_dependencies9.put("y", Integer.valueOf(y));
            $_dependencies9.put("z", Integer.valueOf(z));
            $_dependencies9.put("world", world);
            ProcedureHuaFuXp.executeProcedure($_dependencies9);
        }
        if (buttonID == 9) {
            Map<String, Object> $_dependencies10 = new HashMap<>();
            $_dependencies10.put("entity", entity);
            $_dependencies10.put("x", Integer.valueOf(x));
            $_dependencies10.put("y", Integer.valueOf(y));
            $_dependencies10.put("z", Integer.valueOf(z));
            $_dependencies10.put("world", world);
            ProcedureZhenFaXp.executeProcedure($_dependencies10);
        }
        if (buttonID == 10) {
            Map<String, Object> $_dependencies11 = new HashMap<>();
            $_dependencies11.put("entity", entity);
            $_dependencies11.put("x", Integer.valueOf(x));
            $_dependencies11.put("y", Integer.valueOf(y));
            $_dependencies11.put("z", Integer.valueOf(z));
            $_dependencies11.put("world", world);
            ProcedureZhiLiXp.executeProcedure($_dependencies11);
        }
        if (buttonID == 11) {
            Map<String, Object> $_dependencies12 = new HashMap<>();
            $_dependencies12.put("entity", entity);
            $_dependencies12.put("x", Integer.valueOf(x));
            $_dependencies12.put("y", Integer.valueOf(y));
            $_dependencies12.put("z", Integer.valueOf(z));
            $_dependencies12.put("world", world);
            ProcedureSouXunXp.executeProcedure($_dependencies12);
        }
        if (buttonID == 12) {
            Map<String, Object> $_dependencies13 = new HashMap<>();
            $_dependencies13.put("entity", entity);
            $_dependencies13.put("x", Integer.valueOf(x));
            $_dependencies13.put("y", Integer.valueOf(y));
            $_dependencies13.put("z", Integer.valueOf(z));
            $_dependencies13.put("world", world);
            ProcedureZhongZhiXp.executeProcedure($_dependencies13);
        }
        if (buttonID == 13) {
            Map<String, Object> $_dependencies14 = new HashMap<>();
            $_dependencies14.put("entity", entity);
            $_dependencies14.put("x", Integer.valueOf(x));
            $_dependencies14.put("y", Integer.valueOf(y));
            $_dependencies14.put("z", Integer.valueOf(z));
            $_dependencies14.put("world", world);
            ProcedureNiangJiuXp.executeProcedure($_dependencies14);
        }
        if (buttonID == 14) {
            Map<String, Object> $_dependencies15 = new HashMap<>();
            $_dependencies15.put("entity", entity);
            $_dependencies15.put("x", Integer.valueOf(x));
            $_dependencies15.put("y", Integer.valueOf(y));
            $_dependencies15.put("z", Integer.valueOf(z));
            $_dependencies15.put("world", world);
            ProcedureCaiShiXp.executeProcedure($_dependencies15);
        }
        if (buttonID == 15) {
            Map<String, Object> $_dependencies16 = new HashMap<>();
            $_dependencies16.put("entity", entity);
            $_dependencies16.put("x", Integer.valueOf(x));
            $_dependencies16.put("y", Integer.valueOf(y));
            $_dependencies16.put("z", Integer.valueOf(z));
            $_dependencies16.put("world", world);
            ProcedureXingShangXp.executeProcedure($_dependencies16);
        }
        if (buttonID == 16) {
            Map<String, Object> $_dependencies17 = new HashMap<>();
            $_dependencies17.put("entity", entity);
            $_dependencies17.put("x", Integer.valueOf(x));
            $_dependencies17.put("y", Integer.valueOf(y));
            $_dependencies17.put("z", Integer.valueOf(z));
            $_dependencies17.put("world", world);
            ProcedureWuGong.executeProcedure($_dependencies17);
        }
        if (buttonID == 17) {
            Map<String, Object> $_dependencies18 = new HashMap<>();
            $_dependencies18.put("entity", entity);
            $_dependencies18.put("x", Integer.valueOf(x));
            $_dependencies18.put("y", Integer.valueOf(y));
            $_dependencies18.put("z", Integer.valueOf(z));
            $_dependencies18.put("world", world);
            ProcedureWuFang.executeProcedure($_dependencies18);
        }
        if (buttonID == 18) {
            Map<String, Object> $_dependencies19 = new HashMap<>();
            $_dependencies19.put("entity", entity);
            $_dependencies19.put("x", Integer.valueOf(x));
            $_dependencies19.put("y", Integer.valueOf(y));
            $_dependencies19.put("z", Integer.valueOf(z));
            $_dependencies19.put("world", world);
            ProcedureFaShuGong.executeProcedure($_dependencies19);
        }
        if (buttonID == 19) {
            Map<String, Object> $_dependencies20 = new HashMap<>();
            $_dependencies20.put("entity", entity);
            $_dependencies20.put("x", Integer.valueOf(x));
            $_dependencies20.put("y", Integer.valueOf(y));
            $_dependencies20.put("z", Integer.valueOf(z));
            $_dependencies20.put("world", world);
            ProcedureHuoYanGong.executeProcedure($_dependencies20);
        }
        if (buttonID == 20) {
            Map<String, Object> $_dependencies21 = new HashMap<>();
            $_dependencies21.put("entity", entity);
            $_dependencies21.put("x", Integer.valueOf(x));
            $_dependencies21.put("y", Integer.valueOf(y));
            $_dependencies21.put("z", Integer.valueOf(z));
            $_dependencies21.put("world", world);
            ProcedureLeiDianGong.executeProcedure($_dependencies21);
        }
        if (buttonID == 21) {
            Map<String, Object> $_dependencies22 = new HashMap<>();
            $_dependencies22.put("entity", entity);
            $_dependencies22.put("x", Integer.valueOf(x));
            $_dependencies22.put("y", Integer.valueOf(y));
            $_dependencies22.put("z", Integer.valueOf(z));
            $_dependencies22.put("world", world);
            ProcedureDuSuGong.executeProcedure($_dependencies22);
        }
        if (buttonID == 22) {
            Map<String, Object> $_dependencies23 = new HashMap<>();
            $_dependencies23.put("entity", entity);
            $_dependencies23.put("x", Integer.valueOf(x));
            $_dependencies23.put("y", Integer.valueOf(y));
            $_dependencies23.put("z", Integer.valueOf(z));
            $_dependencies23.put("world", world);
            ProcedureFaShuFang.executeProcedure($_dependencies23);
        }
        if (buttonID == 23) {
            Map<String, Object> $_dependencies24 = new HashMap<>();
            $_dependencies24.put("entity", entity);
            $_dependencies24.put("x", Integer.valueOf(x));
            $_dependencies24.put("y", Integer.valueOf(y));
            $_dependencies24.put("z", Integer.valueOf(z));
            $_dependencies24.put("world", world);
            ProcedureHuoYanFang.executeProcedure($_dependencies24);
        }
        if (buttonID == 24) {
            Map<String, Object> $_dependencies25 = new HashMap<>();
            $_dependencies25.put("entity", entity);
            $_dependencies25.put("x", Integer.valueOf(x));
            $_dependencies25.put("y", Integer.valueOf(y));
            $_dependencies25.put("z", Integer.valueOf(z));
            $_dependencies25.put("world", world);
            ProcedureLeiDianFang.executeProcedure($_dependencies25);
        }
        if (buttonID == 25) {
            Map<String, Object> $_dependencies26 = new HashMap<>();
            $_dependencies26.put("entity", entity);
            $_dependencies26.put("x", Integer.valueOf(x));
            $_dependencies26.put("y", Integer.valueOf(y));
            $_dependencies26.put("z", Integer.valueOf(z));
            $_dependencies26.put("world", world);
            ProcedureDuSuFang.executeProcedure($_dependencies26);
        }
        if (buttonID == 26) {
            Map<String, Object> $_dependencies27 = new HashMap<>();
            $_dependencies27.put("entity", entity);
            $_dependencies27.put("x", Integer.valueOf(x));
            $_dependencies27.put("y", Integer.valueOf(y));
            $_dependencies27.put("z", Integer.valueOf(z));
            $_dependencies27.put("world", world);
            ProcedureShengMing.executeProcedure($_dependencies27);
        }
        if (buttonID == 27) {
            Map<String, Object> $_dependencies28 = new HashMap<>();
            $_dependencies28.put("entity", entity);
            $_dependencies28.put("x", Integer.valueOf(x));
            $_dependencies28.put("y", Integer.valueOf(y));
            $_dependencies28.put("z", Integer.valueOf(z));
            $_dependencies28.put("world", world);
            ProcedureLingLiZhi.executeProcedure($_dependencies28);
        }
        if (buttonID == 28) {
            Map<String, Object> $_dependencies29 = new HashMap<>();
            $_dependencies29.put("entity", entity);
            $_dependencies29.put("x", Integer.valueOf(x));
            $_dependencies29.put("y", Integer.valueOf(y));
            $_dependencies29.put("z", Integer.valueOf(z));
            $_dependencies29.put("world", world);
            ProcedureHuiLingZhi.executeProcedure($_dependencies29);
        }
        if (buttonID == 29) {
            Map<String, Object> $_dependencies30 = new HashMap<>();
            $_dependencies30.put("entity", entity);
            $_dependencies30.put("x", Integer.valueOf(x));
            $_dependencies30.put("y", Integer.valueOf(y));
            $_dependencies30.put("z", Integer.valueOf(z));
            $_dependencies30.put("world", world);
            ProcedureShaQiZhi.executeProcedure($_dependencies30);
        }
        if (buttonID == 30) {
            Map<String, Object> $_dependencies31 = new HashMap<>();
            $_dependencies31.put("entity", entity);
            $_dependencies31.put("x", Integer.valueOf(x));
            $_dependencies31.put("y", Integer.valueOf(y));
            $_dependencies31.put("z", Integer.valueOf(z));
            $_dependencies31.put("world", world);
            ProcedureZhenYuanZhi.executeProcedure($_dependencies31);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
        }
    }
}
