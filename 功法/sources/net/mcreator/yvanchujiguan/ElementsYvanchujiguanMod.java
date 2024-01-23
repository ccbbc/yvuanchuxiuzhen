package net.mcreator.yvanchujiguan;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import net.mcreator.yvanchujiguan.YvanchujiguanModVariables;
import net.mcreator.yvanchujiguan.gui.GuiFuXiuSanGongZanCun;
import net.mcreator.yvanchujiguan.gui.GuiGOngFaHuo;
import net.mcreator.yvanchujiguan.gui.GuiGongFa06;
import net.mcreator.yvanchujiguan.gui.GuiGongFaJin;
import net.mcreator.yvanchujiguan.gui.GuiGongFaShouPi;
import net.mcreator.yvanchujiguan.gui.GuiGongFaShui;
import net.mcreator.yvanchujiguan.gui.GuiGongFaTu;
import net.mcreator.yvanchujiguan.gui.GuiGui10;
import net.mcreator.yvanchujiguan.gui.GuiGui11;
import net.mcreator.yvanchujiguan.gui.GuiGui12;
import net.mcreator.yvanchujiguan.gui.GuiGui13;
import net.mcreator.yvanchujiguan.gui.GuiGui14;
import net.mcreator.yvanchujiguan.gui.GuiGui15;
import net.mcreator.yvanchujiguan.gui.GuiGui16;
import net.mcreator.yvanchujiguan.gui.GuiGui17;
import net.mcreator.yvanchujiguan.gui.GuiGui18;
import net.mcreator.yvanchujiguan.gui.GuiGui19;
import net.mcreator.yvanchujiguan.gui.GuiGui20;
import net.mcreator.yvanchujiguan.gui.GuiGui22;
import net.mcreator.yvanchujiguan.gui.GuiGui25;
import net.mcreator.yvanchujiguan.gui.GuiGui26;
import net.mcreator.yvanchujiguan.gui.GuiGui32;
import net.mcreator.yvanchujiguan.gui.GuiGui33;
import net.mcreator.yvanchujiguan.gui.GuiGui7;
import net.mcreator.yvanchujiguan.gui.GuiGui9;
import net.mcreator.yvanchujiguan.gui.GuiKMianBan;
import net.mcreator.yvanchujiguan.gui.GuiKMianBan2;
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

/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/ElementsYvanchujiguanMod.class */
public class ElementsYvanchujiguanMod implements IFuelHandler, IWorldGenerator {
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
        addNetworkMessage(YvanchujiguanModVariables.WorldSavedDataSyncMessageHandler.class, YvanchujiguanModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
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
            WorldSavedData mapdata = YvanchujiguanModVariables.MapVariables.get(event.player.field_70170_p);
            WorldSavedData worlddata = YvanchujiguanModVariables.WorldVariables.get(event.player.field_70170_p);
            if (mapdata != null) {
                YvanchujiguanMod.PACKET_HANDLER.sendTo(new YvanchujiguanModVariables.WorldSavedDataSyncMessage(0, mapdata), event.player);
            }
            if (worlddata != null) {
                YvanchujiguanMod.PACKET_HANDLER.sendTo(new YvanchujiguanModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        WorldSavedData worlddata;
        if (!event.player.field_70170_p.field_72995_K && (worlddata = YvanchujiguanModVariables.WorldVariables.get(event.player.field_70170_p)) != null) {
            YvanchujiguanMod.PACKET_HANDLER.sendTo(new YvanchujiguanModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
        }
    }

    public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass, Side... sides) {
        for (Side side : sides) {
            YvanchujiguanMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side);
        }
        this.messageID++;
    }

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/ElementsYvanchujiguanMod$GuiHandler.class */
    public static class GuiHandler implements IGuiHandler {
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiGongFa06.GUIID) {
                return new GuiGongFa06.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGOngFaHuo.GUIID) {
                return new GuiGOngFaHuo.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFaJin.GUIID) {
                return new GuiGongFaJin.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFaShui.GUIID) {
                return new GuiGongFaShui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFaTu.GUIID) {
                return new GuiGongFaTu.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFaShouPi.GUIID) {
                return new GuiGongFaShouPi.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui32.GUIID) {
                return new GuiGui32.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui7.GUIID) {
                return new GuiGui7.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui9.GUIID) {
                return new GuiGui9.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui11.GUIID) {
                return new GuiGui11.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui10.GUIID) {
                return new GuiGui10.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui13.GUIID) {
                return new GuiGui13.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui12.GUIID) {
                return new GuiGui12.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui14.GUIID) {
                return new GuiGui14.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui15.GUIID) {
                return new GuiGui15.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui16.GUIID) {
                return new GuiGui16.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui17.GUIID) {
                return new GuiGui17.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui18.GUIID) {
                return new GuiGui18.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui19.GUIID) {
                return new GuiGui19.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui33.GUIID) {
                return new GuiGui33.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui20.GUIID) {
                return new GuiGui20.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui25.GUIID) {
                return new GuiGui25.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui26.GUIID) {
                return new GuiGui26.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui22.GUIID) {
                return new GuiGui22.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiKMianBan.GUIID) {
                return new GuiKMianBan.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiKMianBan2.GUIID) {
                return new GuiKMianBan2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFuXiuSanGongZanCun.GUIID) {
                return new GuiFuXiuSanGongZanCun.GuiContainerMod(world, x, y, z, player);
            }
            return null;
        }

        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiGongFa06.GUIID) {
                return new GuiGongFa06.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGOngFaHuo.GUIID) {
                return new GuiGOngFaHuo.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFaJin.GUIID) {
                return new GuiGongFaJin.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFaShui.GUIID) {
                return new GuiGongFaShui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFaTu.GUIID) {
                return new GuiGongFaTu.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFaShouPi.GUIID) {
                return new GuiGongFaShouPi.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui32.GUIID) {
                return new GuiGui32.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui7.GUIID) {
                return new GuiGui7.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui9.GUIID) {
                return new GuiGui9.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui11.GUIID) {
                return new GuiGui11.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui10.GUIID) {
                return new GuiGui10.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui13.GUIID) {
                return new GuiGui13.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui12.GUIID) {
                return new GuiGui12.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui14.GUIID) {
                return new GuiGui14.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui15.GUIID) {
                return new GuiGui15.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui16.GUIID) {
                return new GuiGui16.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui17.GUIID) {
                return new GuiGui17.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui18.GUIID) {
                return new GuiGui18.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui19.GUIID) {
                return new GuiGui19.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui33.GUIID) {
                return new GuiGui33.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui20.GUIID) {
                return new GuiGui20.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui25.GUIID) {
                return new GuiGui25.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui26.GUIID) {
                return new GuiGui26.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui22.GUIID) {
                return new GuiGui22.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiKMianBan.GUIID) {
                return new GuiKMianBan.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiKMianBan2.GUIID) {
                return new GuiKMianBan2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFuXiuSanGongZanCun.GUIID) {
                return new GuiFuXiuSanGongZanCun.GuiWindow(world, x, y, z, player);
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

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/ElementsYvanchujiguanMod$ModElement.class */
    public static class ModElement implements Comparable<ModElement> {
        protected final ElementsYvanchujiguanMod elements;
        protected final int sortid;

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/ElementsYvanchujiguanMod$ModElement$Tag.class */
        public @interface Tag {
        }

        public ModElement(ElementsYvanchujiguanMod elements, int sortid) {
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
