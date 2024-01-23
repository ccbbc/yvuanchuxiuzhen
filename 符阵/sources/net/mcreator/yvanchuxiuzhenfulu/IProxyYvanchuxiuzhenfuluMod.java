package net.mcreator.yvanchuxiuzhenfulu;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/IProxyYvanchuxiuzhenfuluMod.class */
public interface IProxyYvanchuxiuzhenfuluMod {
    void preInit(FMLPreInitializationEvent fMLPreInitializationEvent);

    void init(FMLInitializationEvent fMLInitializationEvent);

    void postInit(FMLPostInitializationEvent fMLPostInitializationEvent);

    void serverLoad(FMLServerStartingEvent fMLServerStartingEvent);
}
