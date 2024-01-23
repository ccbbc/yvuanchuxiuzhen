package edebe.flyinginstrument.item;

import edebe.flyinginstrument.entity.IFlyingInstrumentEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/item/IFlyingInstrumentItem.class */
public interface IFlyingInstrumentItem {
    float getWidth();

    float getHeight();

    double getMountedYOffset();

    float getStepHeight();

    boolean shouldRiderSit();

    <T extends IFlyingInstrumentEntity> T createEntity(World world, ItemStack itemStack, EntityPlayer entityPlayer);
}
