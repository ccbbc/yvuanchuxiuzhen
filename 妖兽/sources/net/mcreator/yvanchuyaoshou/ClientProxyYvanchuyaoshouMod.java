package net.mcreator.yvanchuyaoshou;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/ClientProxyYvanchuyaoshouMod.class */
public class ClientProxyYvanchuyaoshouMod implements IProxyYvanchuyaoshouMod {
    @Override // net.mcreator.yvanchuyaoshou.IProxyYvanchuyaoshouMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuyaoshou.IProxyYvanchuyaoshouMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(YvanchuyaoshouMod.MODID);
    }

    @Override // net.mcreator.yvanchuyaoshou.IProxyYvanchuyaoshouMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.yvanchuyaoshou.IProxyYvanchuyaoshouMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
