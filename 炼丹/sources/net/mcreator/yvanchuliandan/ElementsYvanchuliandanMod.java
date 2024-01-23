package net.mcreator.yvanchuliandan;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.YvanchuliandanModVariables;
import net.mcreator.yvanchuliandan.gui.GuiDanFang101Gui1;
import net.mcreator.yvanchuliandan.gui.GuiDanFang101Gui2;
import net.mcreator.yvanchuliandan.gui.GuiDanFang101Gui3;
import net.mcreator.yvanchuliandan.gui.GuiDanFang101Gui4;
import net.mcreator.yvanchuliandan.gui.GuiDanFang101Gui5;
import net.mcreator.yvanchuliandan.gui.GuiDanFang101Gui6;
import net.mcreator.yvanchuliandan.gui.GuiDanFang102Gui1;
import net.mcreator.yvanchuliandan.gui.GuiDanFang102Gui2;
import net.mcreator.yvanchuliandan.gui.GuiDanFang102Gui3;
import net.mcreator.yvanchuliandan.gui.GuiDanFang102Gui4;
import net.mcreator.yvanchuliandan.gui.GuiDanFang103Gui1;
import net.mcreator.yvanchuliandan.gui.GuiDanFang103Gui2;
import net.mcreator.yvanchuliandan.gui.GuiDanFang103Gui3;
import net.mcreator.yvanchuliandan.gui.GuiDanFang103Gui4;
import net.mcreator.yvanchuliandan.gui.GuiDanFang103Gui5;
import net.mcreator.yvanchuliandan.gui.GuiDanFang104Gui1;
import net.mcreator.yvanchuliandan.gui.GuiDanFang104Gui2;
import net.mcreator.yvanchuliandan.gui.GuiDanFang104Gui3;
import net.mcreator.yvanchuliandan.gui.GuiDanFang104Gui4;
import net.mcreator.yvanchuliandan.gui.GuiDanyaobaoxiangGui;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui11;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui2;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui3;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui4;
import net.mcreator.yvanchuliandan.gui.GuiFuWuQiGui;
import net.mcreator.yvanchuliandan.gui.GuiLiandanGUI;
import net.mcreator.yvanchuliandan.gui.GuiNiangJiuGui;
import net.mcreator.yvanchuliandan.gui.GuiShenMiCanYeGui;
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

/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/ElementsYvanchuliandanMod.class */
public class ElementsYvanchuliandanMod implements IFuelHandler, IWorldGenerator {
    public static Map<ResourceLocation, SoundEvent> sounds = new HashMap();
    public final List<ModElement> elements = new ArrayList();
    public final List<Supplier<Block>> blocks = new ArrayList();
    public final List<Supplier<Item>> items = new ArrayList();
    public final List<Supplier<Biome>> biomes = new ArrayList();
    public final List<Supplier<EntityEntry>> entities = new ArrayList();
    public final List<Supplier<Potion>> potions = new ArrayList();
    private int messageID = 0;

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
        addNetworkMessage(YvanchuliandanModVariables.WorldSavedDataSyncMessageHandler.class, YvanchuliandanModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
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
            WorldSavedData mapdata = YvanchuliandanModVariables.MapVariables.get(event.player.field_70170_p);
            WorldSavedData worlddata = YvanchuliandanModVariables.WorldVariables.get(event.player.field_70170_p);
            if (mapdata != null) {
                YvanchuliandanMod.PACKET_HANDLER.sendTo(new YvanchuliandanModVariables.WorldSavedDataSyncMessage(0, mapdata), event.player);
            }
            if (worlddata != null) {
                YvanchuliandanMod.PACKET_HANDLER.sendTo(new YvanchuliandanModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        WorldSavedData worlddata;
        if (!event.player.field_70170_p.field_72995_K && (worlddata = YvanchuliandanModVariables.WorldVariables.get(event.player.field_70170_p)) != null) {
            YvanchuliandanMod.PACKET_HANDLER.sendTo(new YvanchuliandanModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
        }
    }

    public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass, Side... sides) {
        for (Side side : sides) {
            YvanchuliandanMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side);
        }
        this.messageID++;
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/ElementsYvanchuliandanMod$GuiHandler.class */
    public static class GuiHandler implements IGuiHandler {
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiLiandanGUI.GUIID) {
                return new GuiLiandanGUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanyaobaoxiangGui.GUIID) {
                return new GuiDanyaobaoxiangGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui1.GUIID) {
                return new GuiDanFang101Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui2.GUIID) {
                return new GuiDanFang101Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui3.GUIID) {
                return new GuiDanFang101Gui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui4.GUIID) {
                return new GuiDanFang101Gui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui5.GUIID) {
                return new GuiDanFang101Gui5.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui6.GUIID) {
                return new GuiDanFang101Gui6.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui1.GUIID) {
                return new GuiDanFang102Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui2.GUIID) {
                return new GuiDanFang102Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui3.GUIID) {
                return new GuiDanFang102Gui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui4.GUIID) {
                return new GuiDanFang102Gui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui1.GUIID) {
                return new GuiDanFang103Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui2.GUIID) {
                return new GuiDanFang103Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui3.GUIID) {
                return new GuiDanFang103Gui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui4.GUIID) {
                return new GuiDanFang103Gui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui5.GUIID) {
                return new GuiDanFang103Gui5.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui1.GUIID) {
                return new GuiDanFang104Gui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui2.GUIID) {
                return new GuiDanFang104Gui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui3.GUIID) {
                return new GuiDanFang104Gui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenMiCanYeGui.GUIID) {
                return new GuiShenMiCanYeGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiNiangJiuGui.GUIID) {
                return new GuiNiangJiuGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFangShiGui.GUIID) {
                return new GuiFangShiGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFangShiGui2.GUIID) {
                return new GuiFangShiGui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFangShiGui3.GUIID) {
                return new GuiFangShiGui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFangShiGui4.GUIID) {
                return new GuiFangShiGui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFuWuQiGui.GUIID) {
                return new GuiFuWuQiGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFangShiGui11.GUIID) {
                return new GuiFangShiGui11.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui4.GUIID) {
                return new GuiDanFang104Gui4.GuiContainerMod(world, x, y, z, player);
            }
            return null;
        }

        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiLiandanGUI.GUIID) {
                return new GuiLiandanGUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanyaobaoxiangGui.GUIID) {
                return new GuiDanyaobaoxiangGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui1.GUIID) {
                return new GuiDanFang101Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui2.GUIID) {
                return new GuiDanFang101Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui3.GUIID) {
                return new GuiDanFang101Gui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui4.GUIID) {
                return new GuiDanFang101Gui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui5.GUIID) {
                return new GuiDanFang101Gui5.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang101Gui6.GUIID) {
                return new GuiDanFang101Gui6.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui1.GUIID) {
                return new GuiDanFang102Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui2.GUIID) {
                return new GuiDanFang102Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui3.GUIID) {
                return new GuiDanFang102Gui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang102Gui4.GUIID) {
                return new GuiDanFang102Gui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui1.GUIID) {
                return new GuiDanFang103Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui2.GUIID) {
                return new GuiDanFang103Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui3.GUIID) {
                return new GuiDanFang103Gui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui4.GUIID) {
                return new GuiDanFang103Gui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang103Gui5.GUIID) {
                return new GuiDanFang103Gui5.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui1.GUIID) {
                return new GuiDanFang104Gui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui2.GUIID) {
                return new GuiDanFang104Gui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui3.GUIID) {
                return new GuiDanFang104Gui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenMiCanYeGui.GUIID) {
                return new GuiShenMiCanYeGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiNiangJiuGui.GUIID) {
                return new GuiNiangJiuGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFangShiGui.GUIID) {
                return new GuiFangShiGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFangShiGui2.GUIID) {
                return new GuiFangShiGui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFangShiGui3.GUIID) {
                return new GuiFangShiGui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFangShiGui4.GUIID) {
                return new GuiFangShiGui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFuWuQiGui.GUIID) {
                return new GuiFuWuQiGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFangShiGui11.GUIID) {
                return new GuiFangShiGui11.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiDanFang104Gui4.GUIID) {
                return new GuiDanFang104Gui4.GuiWindow(world, x, y, z, player);
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

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/ElementsYvanchuliandanMod$ModElement.class */
    public static class ModElement implements Comparable<ModElement> {
        protected final ElementsYvanchuliandanMod elements;
        protected final int sortid;

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/ElementsYvanchuliandanMod$ModElement$Tag.class */
        public @interface Tag {
        }

        public ModElement(ElementsYvanchuliandanMod elements, int sortid) {
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
