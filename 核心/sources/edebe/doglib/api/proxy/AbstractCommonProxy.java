package edebe.doglib.api.proxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/proxy/AbstractCommonProxy.class */
public abstract class AbstractCommonProxy implements IProxy {
    protected abstract void preinit(FMLPreInitializationEvent fMLPreInitializationEvent);

    protected abstract void init(FMLInitializationEvent fMLInitializationEvent);

    protected abstract void postinit(FMLPostInitializationEvent fMLPostInitializationEvent);

    @Override // edebe.doglib.api.proxy.IProxy
    public void preInitialization(FMLPreInitializationEvent event) {
        preinit(event);
    }

    @Override // edebe.doglib.api.proxy.IProxy
    public void initialization(FMLInitializationEvent event) {
        init(event);
    }

    @Override // edebe.doglib.api.proxy.IProxy
    public void postInitialization(FMLPostInitializationEvent event) {
        postinit(event);
    }

    @Override // edebe.doglib.api.proxy.IProxy
    public void addScheduledTask(Runnable runnable) {
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(runnable);
        Minecraft.func_71410_x().func_152344_a(runnable);
    }
}
