package net.mcreator.yvanchuliandan;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/ClientProxyYvanchuliandanMod.class */
public class ClientProxyYvanchuliandanMod implements IProxyYvanchuliandanMod {
    @Override // net.mcreator.yvanchuliandan.IProxyYvanchuliandanMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuliandan.IProxyYvanchuliandanMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(YvanchuliandanMod.MODID);
    }

    @Override // net.mcreator.yvanchuliandan.IProxyYvanchuliandanMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuliandan.IProxyYvanchuliandanMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
