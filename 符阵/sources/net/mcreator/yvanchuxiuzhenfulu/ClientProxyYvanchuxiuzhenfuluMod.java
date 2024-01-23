package net.mcreator.yvanchuxiuzhenfulu;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/ClientProxyYvanchuxiuzhenfuluMod.class */
public class ClientProxyYvanchuxiuzhenfuluMod implements IProxyYvanchuxiuzhenfuluMod {
    @Override // net.mcreator.yvanchuxiuzhenfulu.IProxyYvanchuxiuzhenfuluMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.IProxyYvanchuxiuzhenfuluMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(YvanchuxiuzhenfuluMod.MODID);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.IProxyYvanchuxiuzhenfuluMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.IProxyYvanchuxiuzhenfuluMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
