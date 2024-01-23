package net.mcreator.wupinmiaosu;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/ClientProxyWupinmiaosuMod.class */
public class ClientProxyWupinmiaosuMod implements IProxyWupinmiaosuMod {
    @Override // net.mcreator.wupinmiaosu.IProxyWupinmiaosuMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.wupinmiaosu.IProxyWupinmiaosuMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(WupinmiaosuMod.MODID);
    }

    @Override // net.mcreator.wupinmiaosu.IProxyWupinmiaosuMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.wupinmiaosu.IProxyWupinmiaosuMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
