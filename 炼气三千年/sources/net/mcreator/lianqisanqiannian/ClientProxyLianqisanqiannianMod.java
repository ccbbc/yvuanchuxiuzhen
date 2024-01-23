package net.mcreator.lianqisanqiannian;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/ClientProxyLianqisanqiannianMod.class */
public class ClientProxyLianqisanqiannianMod implements IProxyLianqisanqiannianMod {
    @Override // net.mcreator.lianqisanqiannian.IProxyLianqisanqiannianMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.lianqisanqiannian.IProxyLianqisanqiannianMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(LianqisanqiannianMod.MODID);
    }

    @Override // net.mcreator.lianqisanqiannian.IProxyLianqisanqiannianMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.lianqisanqiannian.IProxyLianqisanqiannianMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
