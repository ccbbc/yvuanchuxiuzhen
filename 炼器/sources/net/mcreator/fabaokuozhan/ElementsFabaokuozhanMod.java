package net.mcreator.fabaokuozhan;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import net.mcreator.fabaokuozhan.FabaokuozhanModVariables;
import net.mcreator.fabaokuozhan.gui.GuiBenMingGui;
import net.mcreator.fabaokuozhan.gui.GuiBenMingYuCuiLian;
import net.mcreator.fabaokuozhan.gui.GuiFaBaoCuiLian;
import net.mcreator.fabaokuozhan.gui.GuiFuLingTai;
import net.mcreator.fabaokuozhan.gui.GuiLianQiGui2;
import net.mcreator.fabaokuozhan.gui.GuiLianqi1201GUI;
import net.mcreator.fabaokuozhan.gui.GuiLianqiGUI;
import net.mcreator.fabaokuozhan.gui.GuiQiLu1Gui1;
import net.mcreator.fabaokuozhan.gui.GuiQiLu1Gui2;
import net.mcreator.fabaokuozhan.gui.GuiQiLu1gui3;
import net.mcreator.fabaokuozhan.gui.GuiQiLu1gui4;
import net.mcreator.fabaokuozhan.gui.GuiQiLu2Gui1;
import net.mcreator.fabaokuozhan.gui.GuiQiLu2Gui2;
import net.mcreator.fabaokuozhan.gui.GuiQiLu3Gui1;
import net.mcreator.fabaokuozhan.gui.GuiQiLu3Gui2;
import net.mcreator.fabaokuozhan.gui.GuiQiLu3Gui3;
import net.mcreator.fabaokuozhan.gui.GuiQiLu3Gui4;
import net.mcreator.fabaokuozhan.gui.GuiQiLu4Gui1;
import net.mcreator.fabaokuozhan.gui.GuiQiLu4Gui2;
import net.mcreator.fabaokuozhan.gui.GuiQiLu5Gui1;
import net.mcreator.fabaokuozhan.gui.GuiQiLu5Gui2;
import net.mcreator.fabaokuozhan.gui.GuiQiLu5Gui3;
import net.mcreator.fabaokuozhan.gui.GuiQiLu6Gui1;
import net.mcreator.fabaokuozhan.gui.GuiQiLu6Gui2;
import net.mcreator.fabaokuozhan.gui.GuiQiLu6Gui3;
import net.mcreator.fabaokuozhan.gui.GuiQianKunDaiGui;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;

/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/ElementsFabaokuozhanMod.class */
public class ElementsFabaokuozhanMod implements IFuelHandler, IWorldGenerator {
    public static Map<ResourceLocation, SoundEvent> sounds = new HashMap();
    public final List<ModElement> elements = new ArrayList();
    public final List<Supplier<Block>> blocks = new ArrayList();
    public final List<Supplier<Item>> items = new ArrayList();
    public final List<Supplier<Biome>> biomes = new ArrayList();
    public final List<Supplier<EntityEntry>> entities = new ArrayList();
    public final List<Supplier<Potion>> potions = new ArrayList();
    private int messageID = 0;

    public ElementsFabaokuozhanMod() {
        sounds.put(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0101"), new SoundEvent(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0101")));
        sounds.put(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0501"), new SoundEvent(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0501")));
        sounds.put(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0502"), new SoundEvent(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0502")));
        sounds.put(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0102"), new SoundEvent(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0102")));
        sounds.put(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0301"), new SoundEvent(new ResourceLocation(FabaokuozhanMod.MODID, "fabao0301")));
    }

    public void preInit(FMLPreInitializationEvent event) {
        try {
            for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
                Class<?> clazz = Class.forName(asmData.getClassName());
                if (clazz.getSuperclass() == ModElement.class) {
                    this.elements.add((ModElement) clazz.getConstructor(getClass()).newInstance(this));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(this.elements);
        this.elements.forEach((v0) -> {
            v0.initElements();
        });
        addNetworkMessage(FabaokuozhanModVariables.WorldSavedDataSyncMessageHandler.class, FabaokuozhanModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
    }

    public void registerSounds(RegistryEvent.Register<SoundEvent> event) {
        for (Map.Entry<ResourceLocation, SoundEvent> sound : sounds.entrySet()) {
            event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
        }
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
        this.elements.forEach(element -> {
            element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.field_73011_w.getDimension(), cg, cp);
        });
    }

    public int getBurnTime(ItemStack fuel) {
        for (ModElement element : this.elements) {
            int ret = element.addFuel(fuel);
            if (ret != 0) {
                return ret;
            }
        }
        return 0;
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.player.field_70170_p.field_72995_K) {
            WorldSavedData mapdata = FabaokuozhanModVariables.MapVariables.get(event.player.field_70170_p);
            WorldSavedData worlddata = FabaokuozhanModVariables.WorldVariables.get(event.player.field_70170_p);
            if (mapdata != null) {
                FabaokuozhanMod.PACKET_HANDLER.sendTo(new FabaokuozhanModVariables.WorldSavedDataSyncMessage(0, mapdata), event.player);
            }
            if (worlddata != null) {
                FabaokuozhanMod.PACKET_HANDLER.sendTo(new FabaokuozhanModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        WorldSavedData worlddata;
        if (!event.player.field_70170_p.field_72995_K && (worlddata = FabaokuozhanModVariables.WorldVariables.get(event.player.field_70170_p)) != null) {
            FabaokuozhanMod.PACKET_HANDLER.sendTo(new FabaokuozhanModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
        }
    }

    public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass, Side... sides) {
        for (Side side : sides) {
            FabaokuozhanMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side);
        }
        this.messageID++;
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/ElementsFabaokuozhanMod$GuiHandler.class */
    public static class GuiHandler implements IGuiHandler {
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiLianqiGUI.GUIID) {
                return new GuiLianqiGUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiLianqi1201GUI.GUIID) {
                return new GuiLianqi1201GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFuLingTai.GUIID) {
                return new GuiFuLingTai.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu1Gui1.GUIID) {
                return new GuiQiLu1Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu1Gui2.GUIID) {
                return new GuiQiLu1Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu1gui3.GUIID) {
                return new GuiQiLu1gui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu2Gui1.GUIID) {
                return new GuiQiLu2Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu2Gui2.GUIID) {
                return new GuiQiLu2Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui1.GUIID) {
                return new GuiQiLu3Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui2.GUIID) {
                return new GuiQiLu3Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui3.GUIID) {
                return new GuiQiLu3Gui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu4Gui1.GUIID) {
                return new GuiQiLu4Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu4Gui2.GUIID) {
                return new GuiQiLu4Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQianKunDaiGui.GUIID) {
                return new GuiQianKunDaiGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiBenMingGui.GUIID) {
                return new GuiBenMingGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiBenMingYuCuiLian.GUIID) {
                return new GuiBenMingYuCuiLian.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoCuiLian.GUIID) {
                return new GuiFaBaoCuiLian.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiLianQiGui2.GUIID) {
                return new GuiLianQiGui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu1gui4.GUIID) {
                return new GuiQiLu1gui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui4.GUIID) {
                return new GuiQiLu3Gui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu5Gui1.GUIID) {
                return new GuiQiLu5Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu5Gui2.GUIID) {
                return new GuiQiLu5Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu5Gui3.GUIID) {
                return new GuiQiLu5Gui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu6Gui1.GUIID) {
                return new GuiQiLu6Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu6Gui2.GUIID) {
                return new GuiQiLu6Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiLu6Gui3.GUIID) {
                return new GuiQiLu6Gui3.GuiContainerMod(world, x, y, z, player);
            }
            return null;
        }

        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiLianqiGUI.GUIID) {
                return new GuiLianqiGUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiLianqi1201GUI.GUIID) {
                return new GuiLianqi1201GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFuLingTai.GUIID) {
                return new GuiFuLingTai.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu1Gui1.GUIID) {
                return new GuiQiLu1Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu1Gui2.GUIID) {
                return new GuiQiLu1Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu1gui3.GUIID) {
                return new GuiQiLu1gui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu2Gui1.GUIID) {
                return new GuiQiLu2Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu2Gui2.GUIID) {
                return new GuiQiLu2Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui1.GUIID) {
                return new GuiQiLu3Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui2.GUIID) {
                return new GuiQiLu3Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui3.GUIID) {
                return new GuiQiLu3Gui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu4Gui1.GUIID) {
                return new GuiQiLu4Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu4Gui2.GUIID) {
                return new GuiQiLu4Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQianKunDaiGui.GUIID) {
                return new GuiQianKunDaiGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiBenMingGui.GUIID) {
                return new GuiBenMingGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiBenMingYuCuiLian.GUIID) {
                return new GuiBenMingYuCuiLian.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoCuiLian.GUIID) {
                return new GuiFaBaoCuiLian.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiLianQiGui2.GUIID) {
                return new GuiLianQiGui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu1gui4.GUIID) {
                return new GuiQiLu1gui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu3Gui4.GUIID) {
                return new GuiQiLu3Gui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu5Gui1.GUIID) {
                return new GuiQiLu5Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu5Gui2.GUIID) {
                return new GuiQiLu5Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu5Gui3.GUIID) {
                return new GuiQiLu5Gui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu6Gui1.GUIID) {
                return new GuiQiLu6Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu6Gui2.GUIID) {
                return new GuiQiLu6Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiLu6Gui3.GUIID) {
                return new GuiQiLu6Gui3.GuiWindow(world, x, y, z, player);
            }
            return null;
        }
    }

    public List<ModElement> getElements() {
        return this.elements;
    }

    public List<Supplier<Block>> getBlocks() {
        return this.blocks;
    }

    public List<Supplier<Item>> getItems() {
        return this.items;
    }

    public List<Supplier<Biome>> getBiomes() {
        return this.biomes;
    }

    public List<Supplier<EntityEntry>> getEntities() {
        return this.entities;
    }

    public List<Supplier<Potion>> getPotions() {
        return this.potions;
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/ElementsFabaokuozhanMod$ModElement.class */
    public static class ModElement implements Comparable<ModElement> {
        protected final ElementsFabaokuozhanMod elements;
        protected final int sortid;

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/ElementsFabaokuozhanMod$ModElement$Tag.class */
        public @interface Tag {
        }

        public ModElement(ElementsFabaokuozhanMod elements, int sortid) {
            this.elements = elements;
            this.sortid = sortid;
        }

        public void initElements() {
        }

        public void init(FMLInitializationEvent event) {
        }

        public void preInit(FMLPreInitializationEvent event) {
        }

        public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        }

        public void serverLoad(FMLServerStartingEvent event) {
        }

        public void registerModels(ModelRegistryEvent event) {
        }

        public int addFuel(ItemStack fuel) {
            return 0;
        }

        @Override // java.lang.Comparable
        public int compareTo(ModElement other) {
            return this.sortid - other.sortid;
        }
    }
}
