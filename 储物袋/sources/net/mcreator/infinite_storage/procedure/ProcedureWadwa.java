package net.mcreator.infinite_storage.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureWadwa.class */
public class ProcedureWadwa extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureWadwa(ElementsInfiniteStorageMod instance) {
        super(instance, 32);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
    }

    @Override // net.mcreator.infinite_storage.ElementsInfiniteStorageMod.ModElement
    public void init(FMLInitializationEvent event) {
        executeProcedure(new HashMap());
    }

    @Override // net.mcreator.infinite_storage.ElementsInfiniteStorageMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
