package edebe.flyinginstrument.loader;

import edebe.flyinginstrument.entity.EntityFlySword;
import edebe.flyinginstrument.entity.EntityFlyingInstrument;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/loader/EntityLoader.class */
public final class EntityLoader {
    private static int index;
    public static final EntityEntry EntityFlyingInstrument;
    public static final EntityEntry EntityFlySword;

    static {
        index = 0;
        EntityEntryBuilder entity = EntityEntryBuilder.create().entity(EntityFlyingInstrument.class);
        int i = index;
        index = i + 1;
        EntityFlyingInstrument = entity.id("FlyingInstrument", i).name("flyinginstrument.FlyingInstrument").tracker(64, 10, true).build();
        EntityEntryBuilder entity2 = EntityEntryBuilder.create().entity(EntityFlySword.class);
        int i2 = index;
        index = i2 + 1;
        EntityFlySword = entity2.id("EntityFlySword", i2).name("flyinginstrument.EntityFlySword").tracker(64, 10, true).build();
    }

    public static void registerEntities() {
    }

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<EntityEntry> event) {
        IForgeRegistry<EntityEntry> registry = event.getRegistry();
        registry.register(EntityFlyingInstrument);
        registry.register(EntityFlySword);
    }
}
