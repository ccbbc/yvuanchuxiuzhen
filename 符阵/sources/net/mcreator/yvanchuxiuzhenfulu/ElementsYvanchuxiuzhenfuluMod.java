package net.mcreator.yvanchuxiuzhenfulu;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluModVariables;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiFuLuDaQuanGUI1;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiFuLuDaQuanGUI2;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiFuLuDaQuanGUI3;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiFuLuDaQuanGUI4;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiJiuZhenXinDeGUI1;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiJiuZhenXinDeGUI2;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiJiuZhenXinDeGUI3;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiJiuZhenXinDeGUI4;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiJiuZhenXinDeGUI5;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiBaiZhenGUI1;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiBaiZhenGUI2;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiBaiZhenGUI3;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiBaiZhenGUI4;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiZhenFaGUI1;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiZhenFaGUI2;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiZhenFaGUI3;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiWanXiangFuJinGUI1;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiWanXiangFuJinGUI2;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiWanXiangFuJinGUI3;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiXinDeGui;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiXinDeGui10;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiXinDeGui2;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiXinDeGui3;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiXinDeGui4;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiXinDeGui5;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiXinDeGui6;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiYaoKongQiGui;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiZhenFaGUI1;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiZhenFaGUI2;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiZhenFaGUI3;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiZhenFaTai;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiZhenfa01GUI;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiZhifutaiGUI;
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

/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/ElementsYvanchuxiuzhenfuluMod.class */
public class ElementsYvanchuxiuzhenfuluMod implements IFuelHandler, IWorldGenerator {
    public static Map<ResourceLocation, SoundEvent> sounds = new HashMap();
    public final List<ModElement> elements = new ArrayList();
    public final List<Supplier<Block>> blocks = new ArrayList();
    public final List<Supplier<Item>> items = new ArrayList();
    public final List<Supplier<Biome>> biomes = new ArrayList();
    public final List<Supplier<EntityEntry>> entities = new ArrayList();
    public final List<Supplier<Potion>> potions = new ArrayList();
    private int messageID = 0;

    public ElementsYvanchuxiuzhenfuluMod() {
        sounds.put(new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulufashe"), new SoundEvent(new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulufashe")));
        sounds.put(new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu1602"), new SoundEvent(new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu1602")));
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
        addNetworkMessage(YvanchuxiuzhenfuluModVariables.WorldSavedDataSyncMessageHandler.class, YvanchuxiuzhenfuluModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
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
            WorldSavedData mapdata = YvanchuxiuzhenfuluModVariables.MapVariables.get(event.player.field_70170_p);
            WorldSavedData worlddata = YvanchuxiuzhenfuluModVariables.WorldVariables.get(event.player.field_70170_p);
            if (mapdata != null) {
                YvanchuxiuzhenfuluMod.PACKET_HANDLER.sendTo(new YvanchuxiuzhenfuluModVariables.WorldSavedDataSyncMessage(0, mapdata), event.player);
            }
            if (worlddata != null) {
                YvanchuxiuzhenfuluMod.PACKET_HANDLER.sendTo(new YvanchuxiuzhenfuluModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        WorldSavedData worlddata;
        if (!event.player.field_70170_p.field_72995_K && (worlddata = YvanchuxiuzhenfuluModVariables.WorldVariables.get(event.player.field_70170_p)) != null) {
            YvanchuxiuzhenfuluMod.PACKET_HANDLER.sendTo(new YvanchuxiuzhenfuluModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
        }
    }

    public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass, Side... sides) {
        for (Side side : sides) {
            YvanchuxiuzhenfuluMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side);
        }
        this.messageID++;
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/ElementsYvanchuxiuzhenfuluMod$GuiHandler.class */
    public static class GuiHandler implements IGuiHandler {
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiZhifutaiGUI.GUIID) {
                return new GuiZhifutaiGUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhenfa01GUI.GUIID) {
                return new GuiZhenfa01GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiYaoKongQiGui.GUIID) {
                return new GuiYaoKongQiGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhenFaTai.GUIID) {
                return new GuiZhenFaTai.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXinDeGui.GUIID) {
                return new GuiXinDeGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXinDeGui10.GUIID) {
                return new GuiXinDeGui10.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXinDeGui2.GUIID) {
                return new GuiXinDeGui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXinDeGui3.GUIID) {
                return new GuiXinDeGui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXinDeGui4.GUIID) {
                return new GuiXinDeGui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXinDeGui5.GUIID) {
                return new GuiXinDeGui5.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXinDeGui6.GUIID) {
                return new GuiXinDeGui6.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenJiZhenFaGUI1.GUIID) {
                return new GuiShenJiZhenFaGUI1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenJiZhenFaGUI2.GUIID) {
                return new GuiShenJiZhenFaGUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenJiZhenFaGUI3.GUIID) {
                return new GuiShenJiZhenFaGUI3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI1.GUIID) {
                return new GuiJiuZhenXinDeGUI1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI2.GUIID) {
                return new GuiJiuZhenXinDeGUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI3.GUIID) {
                return new GuiJiuZhenXinDeGUI3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI4.GUIID) {
                return new GuiJiuZhenXinDeGUI4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI5.GUIID) {
                return new GuiJiuZhenXinDeGUI5.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI1.GUIID) {
                return new GuiShenJiBaiZhenGUI1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI2.GUIID) {
                return new GuiShenJiBaiZhenGUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI3.GUIID) {
                return new GuiShenJiBaiZhenGUI3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI4.GUIID) {
                return new GuiShenJiBaiZhenGUI4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhenFaGUI1.GUIID) {
                return new GuiZhenFaGUI1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhenFaGUI2.GUIID) {
                return new GuiZhenFaGUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhenFaGUI3.GUIID) {
                return new GuiZhenFaGUI3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI1.GUIID) {
                return new GuiFuLuDaQuanGUI1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI2.GUIID) {
                return new GuiFuLuDaQuanGUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI3.GUIID) {
                return new GuiFuLuDaQuanGUI3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI4.GUIID) {
                return new GuiFuLuDaQuanGUI4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiWanXiangFuJinGUI1.GUIID) {
                return new GuiWanXiangFuJinGUI1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiWanXiangFuJinGUI2.GUIID) {
                return new GuiWanXiangFuJinGUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiWanXiangFuJinGUI3.GUIID) {
                return new GuiWanXiangFuJinGUI3.GuiContainerMod(world, x, y, z, player);
            }
            return null;
        }

        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiZhifutaiGUI.GUIID) {
                return new GuiZhifutaiGUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhenfa01GUI.GUIID) {
                return new GuiZhenfa01GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiYaoKongQiGui.GUIID) {
                return new GuiYaoKongQiGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhenFaTai.GUIID) {
                return new GuiZhenFaTai.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXinDeGui.GUIID) {
                return new GuiXinDeGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXinDeGui10.GUIID) {
                return new GuiXinDeGui10.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXinDeGui2.GUIID) {
                return new GuiXinDeGui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXinDeGui3.GUIID) {
                return new GuiXinDeGui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXinDeGui4.GUIID) {
                return new GuiXinDeGui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXinDeGui5.GUIID) {
                return new GuiXinDeGui5.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXinDeGui6.GUIID) {
                return new GuiXinDeGui6.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenJiZhenFaGUI1.GUIID) {
                return new GuiShenJiZhenFaGUI1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenJiZhenFaGUI2.GUIID) {
                return new GuiShenJiZhenFaGUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenJiZhenFaGUI3.GUIID) {
                return new GuiShenJiZhenFaGUI3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI1.GUIID) {
                return new GuiJiuZhenXinDeGUI1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI2.GUIID) {
                return new GuiJiuZhenXinDeGUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI3.GUIID) {
                return new GuiJiuZhenXinDeGUI3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI4.GUIID) {
                return new GuiJiuZhenXinDeGUI4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiJiuZhenXinDeGUI5.GUIID) {
                return new GuiJiuZhenXinDeGUI5.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI1.GUIID) {
                return new GuiShenJiBaiZhenGUI1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI2.GUIID) {
                return new GuiShenJiBaiZhenGUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI3.GUIID) {
                return new GuiShenJiBaiZhenGUI3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShenJiBaiZhenGUI4.GUIID) {
                return new GuiShenJiBaiZhenGUI4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhenFaGUI1.GUIID) {
                return new GuiZhenFaGUI1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhenFaGUI2.GUIID) {
                return new GuiZhenFaGUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhenFaGUI3.GUIID) {
                return new GuiZhenFaGUI3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI1.GUIID) {
                return new GuiFuLuDaQuanGUI1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI2.GUIID) {
                return new GuiFuLuDaQuanGUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI3.GUIID) {
                return new GuiFuLuDaQuanGUI3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFuLuDaQuanGUI4.GUIID) {
                return new GuiFuLuDaQuanGUI4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiWanXiangFuJinGUI1.GUIID) {
                return new GuiWanXiangFuJinGUI1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiWanXiangFuJinGUI2.GUIID) {
                return new GuiWanXiangFuJinGUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiWanXiangFuJinGUI3.GUIID) {
                return new GuiWanXiangFuJinGUI3.GuiWindow(world, x, y, z, player);
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

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/ElementsYvanchuxiuzhenfuluMod$ModElement.class */
    public static class ModElement implements Comparable<ModElement> {
        protected final ElementsYvanchuxiuzhenfuluMod elements;
        protected final int sortid;

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/ElementsYvanchuxiuzhenfuluMod$ModElement$Tag.class */
        public @interface Tag {
        }

        public ModElement(ElementsYvanchuxiuzhenfuluMod elements, int sortid) {
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
