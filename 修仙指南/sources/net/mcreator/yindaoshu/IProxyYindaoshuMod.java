package net.mcreator.yindaoshu;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 修仙指南0.4.jar:net/mcreator/yindaoshu/IProxyYindaoshuMod.class */
public interface IProxyYindaoshuMod {
    void preInit(FMLPreInitializationEvent fMLPreInitializationEvent);

    void init(FMLInitializationEvent fMLInitializationEvent);

    void postInit(FMLPostInitializationEvent fMLPostInitializationEvent);

    void serverLoad(FMLServerStartingEvent fMLServerStartingEvent);
}
