package net.mcreator.yuanchujianzhu;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/IProxyYuanchujianzhuMod.class */
public interface IProxyYuanchujianzhuMod {
    void preInit(FMLPreInitializationEvent fMLPreInitializationEvent);

    void init(FMLInitializationEvent fMLInitializationEvent);

    void postInit(FMLPostInitializationEvent fMLPostInitializationEvent);

    void serverLoad(FMLServerStartingEvent fMLServerStartingEvent);
}
