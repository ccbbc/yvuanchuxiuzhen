package edebe.flyinginstrument.key;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/key/ModKeys.class */
public class ModKeys {
    public static final KeyBinding FLYING_INSTRUMENT_DOWN = new KeyBinding("key.flyinginstrument.down", 45, "key.categories.gameplay");

    public static void init() {
        ClientRegistry.registerKeyBinding(FLYING_INSTRUMENT_DOWN);
    }
}
