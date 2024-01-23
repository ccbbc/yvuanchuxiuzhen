package edebe.doglib.api.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/proxy/IProxy.class */
public interface IProxy {
    void preInitialization(FMLPreInitializationEvent fMLPreInitializationEvent);

    void initialization(FMLInitializationEvent fMLInitializationEvent);

    void postInitialization(FMLPostInitializationEvent fMLPostInitializationEvent);

    void addScheduledTask(Runnable runnable);
}
