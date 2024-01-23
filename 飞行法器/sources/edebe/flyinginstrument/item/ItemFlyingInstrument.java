package edebe.flyinginstrument.item;

import edebe.flyinginstrument.entity.EntityFlyingInstrument;
import edebe.flyinginstrument.loader.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/item/ItemFlyingInstrument.class */
public class ItemFlyingInstrument extends Item implements IFlyingInstrumentItem {
    public ItemFlyingInstrument(String id) {
        setRegistryName(id);
        func_77655_b("flyinginstrument." + id);
        func_77637_a(CreativeTabs.field_78026_f);
        func_77625_d(1);
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public float getWidth() {
        if (this == ItemLoader.GOURD) {
            return 1.6f;
        }
        if (this == ItemLoader.LEAF) {
            return 4.0f;
        }
        if (this == ItemLoader.BOAT) {
            return 5.0f;
        }
        if (this == ItemLoader.MOUNTAIN_AND_RIVER_DIAGRAM) {
            return 6.0f;
        }
        return 0.0f;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public float getHeight() {
        if (this == ItemLoader.GOURD) {
            return 1.2f;
        }
        if (this == ItemLoader.LEAF) {
            return 0.3f;
        }
        if (this == ItemLoader.BOAT) {
            return 1.4f;
        }
        if (this == ItemLoader.MOUNTAIN_AND_RIVER_DIAGRAM) {
            return 0.2f;
        }
        return 0.0f;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public double getMountedYOffset() {
        if (this == ItemLoader.GOURD) {
            return 0.9d;
        }
        if (this == ItemLoader.LEAF || this == ItemLoader.BOAT || this == ItemLoader.MOUNTAIN_AND_RIVER_DIAGRAM) {
            return 0.5d;
        }
        return 0.0d;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public float getStepHeight() {
        return 32.0f;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public boolean shouldRiderSit() {
        return this == ItemLoader.GOURD;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public EntityFlyingInstrument createEntity(World worldIn, ItemStack stackIn, EntityPlayer playerIn) {
        return new EntityFlyingInstrument(worldIn, stackIn, playerIn);
    }
}
