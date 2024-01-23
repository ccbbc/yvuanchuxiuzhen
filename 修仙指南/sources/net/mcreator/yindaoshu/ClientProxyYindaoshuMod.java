package net.mcreator.yindaoshu;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 修仙指南0.4.jar:net/mcreator/yindaoshu/ClientProxyYindaoshuMod.class */
public class ClientProxyYindaoshuMod implements IProxyYindaoshuMod {
    @Override // net.mcreator.yindaoshu.IProxyYindaoshuMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.yindaoshu.IProxyYindaoshuMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(YindaoshuMod.MODID);
    }

    @Override // net.mcreator.yindaoshu.IProxyYindaoshuMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.yindaoshu.IProxyYindaoshuMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
