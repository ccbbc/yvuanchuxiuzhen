package edebe.doglib.api.event;

import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.lwjgl.input.Keyboard;

@Cancelable
/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/event/KeyboardEvent.class */
public class KeyboardEvent extends Event {

    @Cancelable
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/event/KeyboardEvent$Pre.class */
    public static class Pre extends KeyboardEvent {
        private final int key = Keyboard.getEventKey();

        public int getKey() {
            return this.key;
        }
    }
}
