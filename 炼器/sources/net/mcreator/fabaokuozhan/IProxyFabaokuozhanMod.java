package net.mcreator.fabaokuozhan;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/IProxyFabaokuozhanMod.class */
public interface IProxyFabaokuozhanMod {
    void preInit(FMLPreInitializationEvent fMLPreInitializationEvent);

    void init(FMLInitializationEvent fMLInitializationEvent);

    void postInit(FMLPostInitializationEvent fMLPostInitializationEvent);

    void serverLoad(FMLServerStartingEvent fMLServerStartingEvent);
}
