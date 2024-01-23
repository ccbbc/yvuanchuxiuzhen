package net.mcreator.fabaokuozhan;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/ClientProxyFabaokuozhanMod.class */
public class ClientProxyFabaokuozhanMod implements IProxyFabaokuozhanMod {
    @Override // net.mcreator.fabaokuozhan.IProxyFabaokuozhanMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.fabaokuozhan.IProxyFabaokuozhanMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(FabaokuozhanMod.MODID);
    }

    @Override // net.mcreator.fabaokuozhan.IProxyFabaokuozhanMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.fabaokuozhan.IProxyFabaokuozhanMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
