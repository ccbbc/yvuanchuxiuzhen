package net.mcreator.yvanchuliandan.gui;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.YvanchuliandanMod;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou1;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou2;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou3;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou4;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou5;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou6;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou7;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou8;
import net.mcreator.yvanchuliandan.procedure.ProcedureChuShou9;
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

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/gui/GuiFangShiGui3.class */
public class GuiFangShiGui3 extends ElementsYvanchuliandanMod.ModElement {
    public static int GUIID = 33;
    public static HashMap guistate = new HashMap();

    public GuiFangShiGui3(ElementsYvanchuliandanMod instance) {
        super(instance, 826);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        this.elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        this.elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/gui/GuiFangShiGui3$GuiContainerMod.class */
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
            this.internal = new InventoryBasic("", true, 10);
            IInventory func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s instanceof IInventory) {
                this.internal = func_175625_s;
            }
            this.customSlots.put(2, func_75146_a(new Slot(this.internal, 2, 77, 37) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.1
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(0, func_75146_a(new Slot(this.internal, 0, 5, 37) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.2
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(1, func_75146_a(new Slot(this.internal, 1, 41, 37) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.3
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(3, func_75146_a(new Slot(this.internal, 3, 113, 37) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.4
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(4, func_75146_a(new Slot(this.internal, 4, 149, 37) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.5
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(5, func_75146_a(new Slot(this.internal, 5, 5, 105) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.6
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(6, func_75146_a(new Slot(this.internal, 6, 41, 105) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.7
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(7, func_75146_a(new Slot(this.internal, 7, 77, 105) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.8
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(8, func_75146_a(new Slot(this.internal, 8, 113, 105) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.9
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            this.customSlots.put(9, func_75146_a(new Slot(this.internal, 9, 149, 105) { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.10
                public boolean func_82869_a(EntityPlayer player2) {
                    return false;
                }

                public boolean func_75214_a(ItemStack stack) {
                    return false;
                }
            }));
            for (int si = 0; si < 3; si++) {
                for (int sj = 0; sj < 9; sj++) {
                    func_75146_a(new Slot(player.field_71071_by, sj + ((si + 1) * 9), 8 + (sj * 18), 161 + (si * 18)));
                }
            }
            for (int si2 = 0; si2 < 9; si2++) {
                func_75146_a(new Slot(player.field_71071_by, si2, 8 + (si2 * 18), 219));
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
                if (index < 10) {
                    if (!func_75135_a(itemstack1, 10, this.field_75151_b.size(), true)) {
                        return ItemStack.field_190927_a;
                    }
                    slot.func_75220_a(itemstack1, itemstack);
                } else if (!func_75135_a(itemstack1, 0, 10, false)) {
                    if (index < 37) {
                        if (!func_75135_a(itemstack1, 37, this.field_75151_b.size(), true)) {
                            return ItemStack.field_190927_a;
                        }
                    } else if (!func_75135_a(itemstack1, 10, 37, false)) {
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
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiContainerMod.func_75135_a(net.minecraft.item.ItemStack, int, int, boolean):boolean");
        }

        private void slotChanged(int slotid, int ctype, int meta) {
            if (this.world != null && this.world.field_72995_K) {
                YvanchuliandanMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, this.x, this.y, this.z, ctype, meta));
                GuiFangShiGui3.handleSlotAction(this.entity, slotid, ctype, meta, this.x, this.y, this.z);
            }
        }
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/gui/GuiFangShiGui3$GuiWindow.class */
    public static class GuiWindow extends GuiContainer {
        private World world;
        private int x;
        private int y;
        private int z;
        private EntityPlayer entity;
        private static final ResourceLocation texture = new ResourceLocation("yvanchuliandan:textures/fang_shi_gui_3.png");

        public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
            super(new GuiContainerMod(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.field_146999_f = 176;
            this.field_147000_g = 240;
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

        /* JADX WARN: Type inference failed for: r2v102, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$14] */
        /* JADX WARN: Type inference failed for: r2v109, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$15] */
        /* JADX WARN: Type inference failed for: r2v116, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$16] */
        /* JADX WARN: Type inference failed for: r2v123, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$17] */
        /* JADX WARN: Type inference failed for: r2v130, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$18] */
        /* JADX WARN: Type inference failed for: r2v137, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$19] */
        /* JADX WARN: Type inference failed for: r2v144, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$20] */
        /* JADX WARN: Type inference failed for: r2v151, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$21] */
        /* JADX WARN: Type inference failed for: r2v16, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$3] */
        /* JADX WARN: Type inference failed for: r2v2, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$1] */
        /* JADX WARN: Type inference failed for: r2v23, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$4] */
        /* JADX WARN: Type inference failed for: r2v39, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$5] */
        /* JADX WARN: Type inference failed for: r2v46, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$6] */
        /* JADX WARN: Type inference failed for: r2v53, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$7] */
        /* JADX WARN: Type inference failed for: r2v60, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$8] */
        /* JADX WARN: Type inference failed for: r2v67, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$9] */
        /* JADX WARN: Type inference failed for: r2v74, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$10] */
        /* JADX WARN: Type inference failed for: r2v81, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$11] */
        /* JADX WARN: Type inference failed for: r2v88, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$12] */
        /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$2] */
        /* JADX WARN: Type inference failed for: r2v95, types: [net.mcreator.yvanchuliandan.gui.GuiFangShiGui3$GuiWindow$13] */
        protected void func_146979_b(int par1, int par2) {
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.1
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe1")) + "", 4, 8, -10027009);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe2")) + "", 40, 8, -10027009);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe3")) + "", 76, 8, -10027009);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe4")) + "", 112, 8, -10027009);
            this.field_146289_q.func_78276_b("余额:" + ((int) this.entity.getEntityData().func_74769_h("LingYuanNum")) + "", 4, 148, -16763905);
            this.field_146289_q.func_78276_b("刷新时间:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.5
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "ShuaXinTime")) + "秒", 112, 148, -6710785);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang1")) + "", 4, 20, -39322);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe6")) + "", 4, 80, -10027009);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang6")) + "", 4, 92, -39322);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe5")) + "", 148, 8, -10027009);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang2")) + "", 40, 20, -39322);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang3")) + "", 76, 20, -39322);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang4")) + "", 112, 20, -39322);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang5")) + "", 148, 20, -39322);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe7")) + "", 40, 80, -10027009);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe8")) + "", 76, 80, -10027009);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe9")) + "", 112, 80, -10027009);
            this.field_146289_q.func_78276_b("收价:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.17
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "JiaGe10")) + "", 148, 80, -10027009);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang7")) + "", 40, 92, -39322);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.19
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang8")) + "", 76, 92, -39322);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.20
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang9")) + "", 112, 92, -39322);
            this.field_146289_q.func_78276_b("限量:" + ((int) new Object() { // from class: net.mcreator.yvanchuliandan.gui.GuiFangShiGui3.GuiWindow.21
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = GuiWindow.this.world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return 0.0d;
                }
            }.getValue(new BlockPos(this.x, this.y, this.z), "XianLiang10")) + "", 148, 92, -39322);
        }

        public void func_146281_b() {
            super.func_146281_b();
            Keyboard.enableRepeatEvents(false);
        }

        public void func_73866_w_() {
            super.func_73866_w_();
            this.field_147003_i = (this.field_146294_l - 176) / 2;
            this.field_147009_r = (this.field_146295_m - 240) / 2;
            Keyboard.enableRepeatEvents(true);
            this.field_146292_n.clear();
            this.field_146292_n.add(new GuiButton(0, this.field_147003_i + 4, this.field_147009_r + 56, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(1, this.field_147003_i + 40, this.field_147009_r + 56, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(2, this.field_147003_i + 76, this.field_147009_r + 56, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(3, this.field_147003_i + 112, this.field_147009_r + 56, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(4, this.field_147003_i + 148, this.field_147009_r + 56, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(5, this.field_147003_i + 4, this.field_147009_r + 124, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(6, this.field_147003_i + 112, this.field_147009_r + 124, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(7, this.field_147003_i + 76, this.field_147009_r + 124, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(8, this.field_147003_i + 40, this.field_147009_r + 124, 18, 20, "卖"));
            this.field_146292_n.add(new GuiButton(9, this.field_147003_i + 148, this.field_147009_r + 124, 18, 20, "卖"));
        }

        protected void func_146284_a(GuiButton button) {
            YvanchuliandanMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.field_146127_k, this.x, this.y, this.z));
            GuiFangShiGui3.handleButtonAction(this.entity, button.field_146127_k, this.x, this.y, this.z);
        }

        public boolean func_73868_f() {
            return false;
        }
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/gui/GuiFangShiGui3$GUIButtonPressedMessageHandler.class */
    public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
        public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                GuiFangShiGui3.handleButtonAction(entity, buttonID, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/gui/GuiFangShiGui3$GUISlotChangedMessageHandler.class */
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
                GuiFangShiGui3.handleSlotAction(entity, slotID, changeType, meta, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/gui/GuiFangShiGui3$GUIButtonPressedMessage.class */
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

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/gui/GuiFangShiGui3$GUISlotChangedMessage.class */
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
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureChuShou1.executeProcedure($_dependencies);
        }
        if (buttonID == 1) {
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("entity", entity);
            $_dependencies2.put("x", Integer.valueOf(x));
            $_dependencies2.put("y", Integer.valueOf(y));
            $_dependencies2.put("z", Integer.valueOf(z));
            $_dependencies2.put("world", world);
            ProcedureChuShou2.executeProcedure($_dependencies2);
        }
        if (buttonID == 2) {
            Map<String, Object> $_dependencies3 = new HashMap<>();
            $_dependencies3.put("entity", entity);
            $_dependencies3.put("x", Integer.valueOf(x));
            $_dependencies3.put("y", Integer.valueOf(y));
            $_dependencies3.put("z", Integer.valueOf(z));
            $_dependencies3.put("world", world);
            ProcedureChuShou3.executeProcedure($_dependencies3);
        }
        if (buttonID == 3) {
            Map<String, Object> $_dependencies4 = new HashMap<>();
            $_dependencies4.put("entity", entity);
            $_dependencies4.put("x", Integer.valueOf(x));
            $_dependencies4.put("y", Integer.valueOf(y));
            $_dependencies4.put("z", Integer.valueOf(z));
            $_dependencies4.put("world", world);
            ProcedureChuShou4.executeProcedure($_dependencies4);
        }
        if (buttonID == 4) {
            Map<String, Object> $_dependencies5 = new HashMap<>();
            $_dependencies5.put("entity", entity);
            $_dependencies5.put("x", Integer.valueOf(x));
            $_dependencies5.put("y", Integer.valueOf(y));
            $_dependencies5.put("z", Integer.valueOf(z));
            $_dependencies5.put("world", world);
            ProcedureChuShou5.executeProcedure($_dependencies5);
        }
        if (buttonID == 5) {
            Map<String, Object> $_dependencies6 = new HashMap<>();
            $_dependencies6.put("entity", entity);
            $_dependencies6.put("x", Integer.valueOf(x));
            $_dependencies6.put("y", Integer.valueOf(y));
            $_dependencies6.put("z", Integer.valueOf(z));
            $_dependencies6.put("world", world);
            ProcedureChuShou6.executeProcedure($_dependencies6);
        }
        if (buttonID == 6) {
            Map<String, Object> $_dependencies7 = new HashMap<>();
            $_dependencies7.put("entity", entity);
            $_dependencies7.put("x", Integer.valueOf(x));
            $_dependencies7.put("y", Integer.valueOf(y));
            $_dependencies7.put("z", Integer.valueOf(z));
            $_dependencies7.put("world", world);
            ProcedureChuShou9.executeProcedure($_dependencies7);
        }
        if (buttonID == 7) {
            Map<String, Object> $_dependencies8 = new HashMap<>();
            $_dependencies8.put("entity", entity);
            $_dependencies8.put("x", Integer.valueOf(x));
            $_dependencies8.put("y", Integer.valueOf(y));
            $_dependencies8.put("z", Integer.valueOf(z));
            $_dependencies8.put("world", world);
            ProcedureChuShou8.executeProcedure($_dependencies8);
        }
        if (buttonID == 8) {
            Map<String, Object> $_dependencies9 = new HashMap<>();
            $_dependencies9.put("entity", entity);
            $_dependencies9.put("x", Integer.valueOf(x));
            $_dependencies9.put("y", Integer.valueOf(y));
            $_dependencies9.put("z", Integer.valueOf(z));
            $_dependencies9.put("world", world);
            ProcedureChuShou7.executeProcedure($_dependencies9);
        }
        if (buttonID == 9) {
            Map<String, Object> $_dependencies10 = new HashMap<>();
            $_dependencies10.put("entity", entity);
            $_dependencies10.put("x", Integer.valueOf(x));
            $_dependencies10.put("y", Integer.valueOf(y));
            $_dependencies10.put("z", Integer.valueOf(z));
            $_dependencies10.put("world", world);
            ProcedureChuShou10.executeProcedure($_dependencies10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
        }
    }
}
