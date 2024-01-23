package edebe.flyinginstrument.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/item/ICustomModelItem.class */
public interface ICustomModelItem {
    ModelResourceLocation getModelResourceLocation();

    default int getMetadata() {
        return 0;
    }
}
