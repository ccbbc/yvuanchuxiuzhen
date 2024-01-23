package net.mcreator.infinite_storage.gui;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.infinite_storage.Config;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.mcreator.infinite_storage.InfiniteStorageMod;
import net.mcreator.infinite_storage.item.ItemBigBag;
import net.mcreator.infinite_storage.item.ItemSmallBag;
import net.mcreator.infinite_storage.procedure.ProcedureBagSearch;
import net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiClose;
import net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagLevelUp;
import net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagPageA;
import net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagPageB;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
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

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/gui/GuiInfiniteBagGui.class */
public class GuiInfiniteBagGui extends ElementsInfiniteStorageMod.ModElement {
    public static int GUIID = 2;
    public static HashMap guistate = new HashMap();

    public GuiInfiniteBagGui(ElementsInfiniteStorageMod instance) {
        super(instance, 9);
    }

    @Override // net.mcreator.infinite_storage.ElementsInfiniteStorageMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        this.elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
        this.elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
    }

    /* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/gui/GuiInfiniteBagGui$GuiContainerMod.class */
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
            this.internal = new InventoryBasic("", true, 54);
            IInventory func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s instanceof IInventory) {
                this.internal = func_175625_s;
            }
            this.customSlots.put(0, func_75146_a(new Slot(this.internal, 0, 7, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.1
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(1, func_75146_a(new Slot(this.internal, 1, 25, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.2
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(2, func_75146_a(new Slot(this.internal, 2, 43, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.3
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(3, func_75146_a(new Slot(this.internal, 3, 61, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.4
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(4, func_75146_a(new Slot(this.internal, 4, 79, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.5
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(5, func_75146_a(new Slot(this.internal, 5, 97, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.6
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(6, func_75146_a(new Slot(this.internal, 6, 115, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.7
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(7, func_75146_a(new Slot(this.internal, 7, 133, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.8
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(8, func_75146_a(new Slot(this.internal, 8, 151, 17) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.9
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(9, func_75146_a(new Slot(this.internal, 9, 7, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.10
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(10, func_75146_a(new Slot(this.internal, 10, 25, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.11
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(11, func_75146_a(new Slot(this.internal, 11, 43, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.12
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(12, func_75146_a(new Slot(this.internal, 12, 61, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.13
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(13, func_75146_a(new Slot(this.internal, 13, 79, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.14
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(14, func_75146_a(new Slot(this.internal, 14, 97, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.15
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(15, func_75146_a(new Slot(this.internal, 15, 115, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.16
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(16, func_75146_a(new Slot(this.internal, 16, 133, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.17
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(17, func_75146_a(new Slot(this.internal, 17, 151, 35) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.18
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(18, func_75146_a(new Slot(this.internal, 18, 7, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.19
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(19, func_75146_a(new Slot(this.internal, 19, 25, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.20
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(20, func_75146_a(new Slot(this.internal, 20, 43, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.21
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(21, func_75146_a(new Slot(this.internal, 21, 61, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.22
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(22, func_75146_a(new Slot(this.internal, 22, 79, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.23
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(23, func_75146_a(new Slot(this.internal, 23, 97, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.24
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(24, func_75146_a(new Slot(this.internal, 24, 115, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.25
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(25, func_75146_a(new Slot(this.internal, 25, 133, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.26
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(26, func_75146_a(new Slot(this.internal, 26, 151, 53) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.27
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(27, func_75146_a(new Slot(this.internal, 27, 7, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.28
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(28, func_75146_a(new Slot(this.internal, 28, 25, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.29
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(29, func_75146_a(new Slot(this.internal, 29, 43, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.30
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(30, func_75146_a(new Slot(this.internal, 30, 61, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.31
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(31, func_75146_a(new Slot(this.internal, 31, 79, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.32
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(32, func_75146_a(new Slot(this.internal, 32, 97, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.33
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(33, func_75146_a(new Slot(this.internal, 33, 115, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.34
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(34, func_75146_a(new Slot(this.internal, 34, 133, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.35
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(35, func_75146_a(new Slot(this.internal, 35, 151, 71) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.36
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(36, func_75146_a(new Slot(this.internal, 36, 7, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.37
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(37, func_75146_a(new Slot(this.internal, 37, 25, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.38
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(38, func_75146_a(new Slot(this.internal, 38, 43, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.39
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(39, func_75146_a(new Slot(this.internal, 39, 61, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.40
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(40, func_75146_a(new Slot(this.internal, 40, 79, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.41
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(41, func_75146_a(new Slot(this.internal, 41, 97, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.42
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(42, func_75146_a(new Slot(this.internal, 42, 115, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.43
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(43, func_75146_a(new Slot(this.internal, 43, 133, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.44
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(44, func_75146_a(new Slot(this.internal, 44, 151, 89) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.45
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(45, func_75146_a(new Slot(this.internal, 45, 7, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.46
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(46, func_75146_a(new Slot(this.internal, 46, 25, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.47
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(47, func_75146_a(new Slot(this.internal, 47, 43, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.48
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(48, func_75146_a(new Slot(this.internal, 48, 61, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.49
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(49, func_75146_a(new Slot(this.internal, 49, 79, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.50
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(50, func_75146_a(new Slot(this.internal, 50, 97, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.51
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(51, func_75146_a(new Slot(this.internal, 51, 115, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.52
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(52, func_75146_a(new Slot(this.internal, 52, 133, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.53
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            this.customSlots.put(53, func_75146_a(new Slot(this.internal, 53, 151, 107) { // from class: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.54
                public boolean func_75214_a(ItemStack stack) {
                    if (stack.func_77973_b() == ItemSmallBag.block || stack.func_77973_b() == ItemBigBag.block) {
                        return false;
                    }
                    return true;
                }
            }));
            for (int si = 0; si < 3; si++) {
                for (int sj = 0; sj < 9; sj++) {
                    func_75146_a(new Slot(player.field_71071_by, sj + ((si + 1) * 9), 8 + (sj * 18), 139 + (si * 18)));
                }
            }
            for (int si2 = 0; si2 < 9; si2++) {
                func_75146_a(new Slot(player.field_71071_by, si2, 8 + (si2 * 18), 197));
            }
        }

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
                if (index < 54) {
                    if (!func_75135_a(itemstack1, 54, this.field_75151_b.size(), true)) {
                        return ItemStack.field_190927_a;
                    }
                    slot.func_75220_a(itemstack1, itemstack);
                } else if (!func_75135_a(itemstack1, 0, 54, false)) {
                    if (index < 81) {
                        if (!func_75135_a(itemstack1, 81, this.field_75151_b.size(), true)) {
                            return ItemStack.field_190927_a;
                        }
                    } else if (!func_75135_a(itemstack1, 54, 81, false)) {
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

        /* JADX WARN: Removed duplicated region for block: B:118:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x00ec A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:166:0x018e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0188 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected boolean func_75135_a(net.minecraft.item.ItemStack r5, int r6, int r7, boolean r8) {
            /*
                Method dump skipped, instructions count: 407
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.infinite_storage.gui.GuiInfiniteBagGui.GuiContainerMod.func_75135_a(net.minecraft.item.ItemStack, int, int, boolean):boolean");
        }

        public void func_75134_a(EntityPlayer playerIn) {
            super.func_75134_a(playerIn);
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", this.entity);
            ProcedureInfiniteBagGuiClose.executeProcedure($_dependencies);
            if (!(this.internal instanceof InventoryBasic) || (playerIn instanceof EntityPlayerMP)) {
            }
        }

        private void slotChanged(int slotid, int ctype, int meta) {
            if (this.world != null && this.world.field_72995_K) {
                InfiniteStorageMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, this.x, this.y, this.z, ctype, meta));
                GuiInfiniteBagGui.handleSlotAction(this.entity, slotid, ctype, meta, this.x, this.y, this.z);
            }
        }
    }

    /* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/gui/GuiInfiniteBagGui$GuiWindow.class */
    public static class GuiWindow extends GuiContainer {
        private World world;
        private int x;
        private int y;
        private int z;
        private EntityPlayer entity;
        GuiTextField bag_search;
        private static final ResourceLocation texture = new ResourceLocation("infinite_storage:textures/infinite_bag_gui.png");

        public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
            super(new GuiContainerMod(world, x, y, z, entity));
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
            this.entity = entity;
            this.field_146999_f = 176;
            this.field_147000_g = 220;
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
            this.bag_search.func_146178_a();
        }

        protected void func_73864_a(int mouseX, int mouseY, int mouseButton) throws IOException {
            this.bag_search.func_146192_a(mouseX - this.field_147003_i, mouseY - this.field_147009_r, mouseButton);
            super.func_73864_a(mouseX, mouseY, mouseButton);
        }

        protected void func_73869_a(char typedChar, int keyCode) throws IOException {
            this.bag_search.func_146201_a(typedChar, keyCode);
            if (this.bag_search.func_146206_l()) {
                return;
            }
            super.func_73869_a(typedChar, keyCode);
        }

        protected void func_146979_b(int par1, int par2) {
            this.field_146289_q.func_78276_b("" + I18n.func_135052_a("gui.infinite_bag.texts.a", new Object[0]) + "", 6, 5, -12829636);
            this.field_146289_q.func_78276_b("第" + ((int) this.entity.getEntityData().func_74769_h("InfiniteBagPage")) + "页", 6, 127, -12829636);
            this.field_146289_q.func_78276_b("输入页数", 178, 94, -1);
            this.bag_search.func_146194_f();
            this.field_146289_q.func_78276_b("" + this.entity.getEntityData().func_74779_i("InfiniteBagTip") + "", 179, 146, -1);
            if (Config.bagState) {
                this.field_146289_q.func_78276_b("每500神识可额外开启一页", 210, 114, -1);
            }
        }

        public void func_146281_b() {
            super.func_146281_b();
            Keyboard.enableRepeatEvents(false);
        }

        public void func_73866_w_() {
            super.func_73866_w_();
            this.field_147003_i = (this.field_146294_l - 176) / 2;
            this.field_147009_r = (this.field_146295_m - 220) / 2;
            Keyboard.enableRepeatEvents(true);
            this.field_146292_n.clear();
            this.field_146292_n.add(new GuiButton(0, this.field_147003_i + 177, this.field_147009_r + 3, 30, 20, "上一页"));
            this.field_146292_n.add(new GuiButton(1, this.field_147003_i + 177, this.field_147009_r + 25, 30, 20, "下一页"));
            this.field_146292_n.add(new GuiButton(2, this.field_147003_i + 177, this.field_147009_r + 71, 30, 20, "跳转"));
            this.bag_search = new GuiTextField(0, this.field_146289_q, 178, 48, 28, 20);
            GuiInfiniteBagGui.guistate.put("text:bag_search", this.bag_search);
            this.bag_search.func_146203_f(32767);
            this.bag_search.func_146180_a("");
            if (Config.bagState) {
                this.field_146292_n.add(new GuiButton(3, this.field_147003_i + 177, this.field_147009_r + 108, 30, 20, "升级"));
            }
        }

        protected void func_146284_a(GuiButton button) {
            InfiniteStorageMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.field_146127_k, this.x, this.y, this.z));
            GuiInfiniteBagGui.handleButtonAction(this.entity, button.field_146127_k, this.x, this.y, this.z);
        }

        public boolean func_73868_f() {
            return false;
        }
    }

    /* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/gui/GuiInfiniteBagGui$GUIButtonPressedMessageHandler.class */
    public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
        public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                GuiInfiniteBagGui.handleButtonAction(entity, buttonID, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/gui/GuiInfiniteBagGui$GUISlotChangedMessageHandler.class */
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
                GuiInfiniteBagGui.handleSlotAction(entity, slotID, changeType, meta, x, y, z);
            });
            return null;
        }
    }

    /* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/gui/GuiInfiniteBagGui$GUIButtonPressedMessage.class */
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

    /* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/gui/GuiInfiniteBagGui$GUISlotChangedMessage.class */
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

    public static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
            return;
        }
        if (buttonID == 0) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureInfiniteBagPageA.executeProcedure($_dependencies);
        }
        if (buttonID == 1) {
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("entity", entity);
            ProcedureInfiniteBagPageB.executeProcedure($_dependencies2);
        }
        if (buttonID == 2) {
            Map<String, Object> $_dependencies3 = new HashMap<>();
            $_dependencies3.put("entity", entity);
            $_dependencies3.put("guistate", guistate);
            ProcedureBagSearch.executeProcedure($_dependencies3);
        }
        if (Config.bagState && buttonID == 3) {
            Map<String, Object> $_dependencies4 = new HashMap<>();
            $_dependencies4.put("entity", entity);
            ProcedureInfiniteBagLevelUp.executeProcedure($_dependencies4);
        }
    }

    public static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
        World world = entity.field_70170_p;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
        }
    }
}
