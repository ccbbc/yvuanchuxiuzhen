package edebe.doglib.api.capability;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/capability/DogLibCapabilities.class */
public class DogLibCapabilities {
    @CapabilityInject(IContainerItem.class)
    public static Capability<IContainerItem> CAPABILITY_CONTAINER_ITEM;
}
