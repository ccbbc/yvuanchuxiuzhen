package net.mcreator.yvanchuxiuzhen;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/ClientProxyYvanchuxiuzhenMod.class */
public class ClientProxyYvanchuxiuzhenMod implements IProxyYvanchuxiuzhenMod {
    @Override // net.mcreator.yvanchuxiuzhen.IProxyYvanchuxiuzhenMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuxiuzhen.IProxyYvanchuxiuzhenMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(YvanchuxiuzhenMod.MODID);
    }

    @Override // net.mcreator.yvanchuxiuzhen.IProxyYvanchuxiuzhenMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuxiuzhen.IProxyYvanchuxiuzhenMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
