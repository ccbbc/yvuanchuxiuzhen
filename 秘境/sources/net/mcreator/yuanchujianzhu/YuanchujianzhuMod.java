package net.mcreator.yuanchujianzhu;

import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod(modid = YuanchujianzhuMod.MODID, version = YuanchujianzhuMod.VERSION)
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/YuanchujianzhuMod.class */
public class YuanchujianzhuMod {
    public static final String MODID = "yuanchujianzhu";
    public static final String VERSION = "1.5.4";
    public static final SimpleNetworkWrapper PACKET_HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("yuanchujianzhu:a");
    @SidedProxy(clientSide = "net.mcreator.yuanchujianzhu.ClientProxyYuanchujianzhuMod", serverSide = "net.mcreator.yuanchujianzhu.ServerProxyYuanchujianzhuMod")
    public static IProxyYuanchujianzhuMod proxy;
    @Mod.Instance(MODID)
    public static YuanchujianzhuMod instance;
    public ElementsYuanchujianzhuMod elements = new ElementsYuanchujianzhuMod();

    static {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        GameRegistry.registerWorldGenerator(this.elements, 5);
        GameRegistry.registerFuelHandler(this.elements);
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new ElementsYuanchujianzhuMod.GuiHandler());
        this.elements.preInit(event);
        MinecraftForge.EVENT_BUS.register(this.elements);
        this.elements.getElements().forEach(element -> {
            element.preInit(event);
        });
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        this.elements.getElements().forEach(element -> {
            element.init(event);
        });
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        this.elements.getElements().forEach(element -> {
            element.serverLoad(event);
        });
        proxy.serverLoad(event);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll((IForgeRegistryEntry[]) this.elements.getBlocks().stream().map((v0) -> {
            return v0.get();
        }).toArray(x$0 -> {
            return new Block[x$0];
        }));
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll((IForgeRegistryEntry[]) this.elements.getItems().stream().map((v0) -> {
            return v0.get();
        }).toArray(x$0 -> {
            return new Item[x$0];
        }));
    }

    @SubscribeEvent
    public void registerBiomes(RegistryEvent.Register<Biome> event) {
        event.getRegistry().registerAll((IForgeRegistryEntry[]) this.elements.getBiomes().stream().map((v0) -> {
            return v0.get();
        }).toArray(x$0 -> {
            return new Biome[x$0];
        }));
    }

    @SubscribeEvent
    public void registerEntities(RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().registerAll((IForgeRegistryEntry[]) this.elements.getEntities().stream().map((v0) -> {
            return v0.get();
        }).toArray(x$0 -> {
            return new EntityEntry[x$0];
        }));
    }

    @SubscribeEvent
    public void registerPotions(RegistryEvent.Register<Potion> event) {
        event.getRegistry().registerAll((IForgeRegistryEntry[]) this.elements.getPotions().stream().map((v0) -> {
            return v0.get();
        }).toArray(x$0 -> {
            return new Potion[x$0];
        }));
    }

    @SubscribeEvent
    public void registerSounds(RegistryEvent.Register<SoundEvent> event) {
        this.elements.registerSounds(event);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        this.elements.getElements().forEach(element -> {
            element.registerModels(event);
        });
    }
}
