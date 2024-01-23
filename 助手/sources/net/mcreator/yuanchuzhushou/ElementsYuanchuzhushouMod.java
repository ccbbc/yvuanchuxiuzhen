package net.mcreator.yuanchuzhushou;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import net.mcreator.yuanchuzhushou.YuanchuzhushouModVariables;
import net.mcreator.yuanchuzhushou.gui.GuiChaKanGui;
import net.mcreator.yuanchuzhushou.gui.GuiJianZhu;
import net.mcreator.yuanchuzhushou.gui.GuiLingGenGui;
import net.mcreator.yuanchuzhushou.gui.GuiZhuShouGui;
import net.mcreator.yuanchuzhushou.gui.GuiZiDingYiGui;
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

/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/ElementsYuanchuzhushouMod.class */
public class ElementsYuanchuzhushouMod implements IFuelHandler, IWorldGenerator {
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
        addNetworkMessage(YuanchuzhushouModVariables.WorldSavedDataSyncMessageHandler.class, YuanchuzhushouModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
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
            WorldSavedData mapdata = YuanchuzhushouModVariables.MapVariables.get(event.player.field_70170_p);
            WorldSavedData worlddata = YuanchuzhushouModVariables.WorldVariables.get(event.player.field_70170_p);
            if (mapdata != null) {
                YuanchuzhushouMod.PACKET_HANDLER.sendTo(new YuanchuzhushouModVariables.WorldSavedDataSyncMessage(0, mapdata), event.player);
            }
            if (worlddata != null) {
                YuanchuzhushouMod.PACKET_HANDLER.sendTo(new YuanchuzhushouModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        WorldSavedData worlddata;
        if (!event.player.field_70170_p.field_72995_K && (worlddata = YuanchuzhushouModVariables.WorldVariables.get(event.player.field_70170_p)) != null) {
            YuanchuzhushouMod.PACKET_HANDLER.sendTo(new YuanchuzhushouModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
        }
    }

    public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass, Side... sides) {
        for (Side side : sides) {
            YuanchuzhushouMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side);
        }
        this.messageID++;
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/ElementsYuanchuzhushouMod$GuiHandler.class */
    public static class GuiHandler implements IGuiHandler {
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiZhuShouGui.GUIID) {
                return new GuiZhuShouGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiLingGenGui.GUIID) {
                return new GuiLingGenGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiJianZhu.GUIID) {
                return new GuiJianZhu.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiChaKanGui.GUIID) {
                return new GuiChaKanGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZiDingYiGui.GUIID) {
                return new GuiZiDingYiGui.GuiContainerMod(world, x, y, z, player);
            }
            return null;
        }

        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiZhuShouGui.GUIID) {
                return new GuiZhuShouGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiLingGenGui.GUIID) {
                return new GuiLingGenGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiJianZhu.GUIID) {
                return new GuiJianZhu.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiChaKanGui.GUIID) {
                return new GuiChaKanGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZiDingYiGui.GUIID) {
                return new GuiZiDingYiGui.GuiWindow(world, x, y, z, player);
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

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/ElementsYuanchuzhushouMod$ModElement.class */
    public static class ModElement implements Comparable<ModElement> {
        protected final ElementsYuanchuzhushouMod elements;
        protected final int sortid;

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/ElementsYuanchuzhushouMod$ModElement$Tag.class */
        public @interface Tag {
        }

        public ModElement(ElementsYuanchuzhushouMod elements, int sortid) {
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
