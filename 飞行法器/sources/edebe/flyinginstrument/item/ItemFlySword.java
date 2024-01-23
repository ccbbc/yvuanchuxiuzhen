package edebe.flyinginstrument.item;

import edebe.flyinginstrument.entity.EntityFlySword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/item/ItemFlySword.class */
public class ItemFlySword extends Item implements IFlyingInstrumentItem {
    public ItemFlySword(String id) {
        setRegistryName(id);
        func_77655_b("flyinginstrument." + id);
        func_77637_a(CreativeTabs.field_78026_f);
        func_77625_d(1);
    }

    public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        return true;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public float getWidth() {
        return 3.0f;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public float getHeight() {
        return 0.2f;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public double getMountedYOffset() {
        return 0.5d;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public float getStepHeight() {
        return 0.2f;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public boolean shouldRiderSit() {
        return false;
    }

    @Override // edebe.flyinginstrument.item.IFlyingInstrumentItem
    public EntityFlySword createEntity(World worldIn, ItemStack stackIn, EntityPlayer playerIn) {
        return new EntityFlySword(worldIn, stackIn, playerIn);
    }
}
