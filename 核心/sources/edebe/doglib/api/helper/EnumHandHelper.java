package edebe.doglib.api.helper;

import net.minecraft.util.EnumHand;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/EnumHandHelper.class */
public interface EnumHandHelper {
    static EnumHand getHandFromID(int id) {
        return id == 1 ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
    }

    static int getIDFromHand(EnumHand hand) {
        return hand == EnumHand.OFF_HAND ? 1 : 0;
    }
}
