package net.mcreator.yuanchujianzhu;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/ClientProxyYuanchujianzhuMod.class */
public class ClientProxyYuanchujianzhuMod implements IProxyYuanchujianzhuMod {
    @Override // net.mcreator.yuanchujianzhu.IProxyYuanchujianzhuMod
    public void init(FMLInitializationEvent event) {
    }

    @Override // net.mcreator.yuanchujianzhu.IProxyYuanchujianzhuMod
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(YuanchujianzhuMod.MODID);
    }

    @Override // net.mcreator.yuanchujianzhu.IProxyYuanchujianzhuMod
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override // net.mcreator.yuanchujianzhu.IProxyYuanchujianzhuMod
    public void serverLoad(FMLServerStartingEvent event) {
    }
}
