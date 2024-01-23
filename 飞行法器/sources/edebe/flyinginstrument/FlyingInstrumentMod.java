package edebe.flyinginstrument;

import edebe.flyinginstrument.key.ModKeys;
import edebe.flyinginstrument.loader.EntityRenderLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

@Mod(modid = FlyingInstrumentMod.MODID, name = FlyingInstrumentMod.NAME, version = FlyingInstrumentMod.VERSION)
/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/FlyingInstrumentMod.class */
public class FlyingInstrumentMod {
    public static final String MODID = "flyinginstrument";
    public static final String NAME = "Flying Instrument";
    public static final String VERSION = "1.8.0";
    public static Logger logger;

    @SideOnly(Side.CLIENT)
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        ModKeys.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @SideOnly(Side.CLIENT)
    @Mod.EventHandler
    public void preInitClient(FMLPreInitializationEvent event) {
        EntityRenderLoader.registerEntityRenders();
    }
}
