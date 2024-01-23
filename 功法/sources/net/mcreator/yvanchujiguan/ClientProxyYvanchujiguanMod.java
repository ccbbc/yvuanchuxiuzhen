package net.mcreator.yvanchujiguan;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/ClientProxyYvanchujiguanMod.class */
public class ClientProxyYvanchujiguanMod implements IProxyYvanchujiguanMod {
    @Override // net.mcreator.yvanchujiguan.IProxyYvanchujiguanMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchujiguan.IProxyYvanchujiguanMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(YvanchujiguanMod.MODID);
    }

    @Override // net.mcreator.yvanchujiguan.IProxyYvanchujiguanMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchujiguan.IProxyYvanchujiguanMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
