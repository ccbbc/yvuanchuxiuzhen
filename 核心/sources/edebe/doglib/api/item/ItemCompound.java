package edebe.doglib.api.item;

import edebe.doglib.api.helper.ItemHelper;
import edebe.doglib.api.helper.ResourceLocationHelper;
import edebe.doglib.api.item.ICompoundItem;
import javax.annotation.ParametersAreNonnullByDefault;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/item/ItemCompound.class */
public abstract class ItemCompound extends Item implements ICompoundItem {
    protected final int maxMetadata;
    protected final ICompoundItem.IUnlocalizedName field_77774_bZ;
    protected final ICompoundItem.IDisplayName displayName;
    protected final ICompoundItem.IModelResourceLocation modelResourceLocation;

    public ItemCompound(int maxMetadata, ICompoundItem.IName name, ICompoundItem.IDisplayName displayName) {
        this(maxMetadata, defaultUnlocalizedName, metadata -> {
            return ItemHelper.createUnlocalizedName(name.getName(metadata));
        }, displayName, metadata2 -> {
            return ResourceLocationHelper.createModelResourceLocation(name.getName(metadata2));
        });
    }

    public ItemCompound(int maxMetadata, ICompoundItem.IUnlocalizedName unlocalizedName, ICompoundItem.IDisplayName displayName, ICompoundItem.IModelResourceLocation modelResourceLocation) {
        this.maxMetadata = maxMetadata;
        this.field_77774_bZ = unlocalizedName;
        this.displayName = displayName;
        this.modelResourceLocation = modelResourceLocation;
    }

    public String func_77667_c(ItemStack stack) {
        return ICompoundItem.getUnlocalizedName(stack, super.func_77667_c(stack), this.field_77774_bZ);
    }

    public String func_77653_i(ItemStack stack) {
        return ICompoundItem.getItemStackDisplayName(stack, func_77657_g(stack), this.displayName);
    }

    public void func_150895_a(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (func_194125_a(tab)) {
            ICompoundItem.getSubItems(list, this.maxMetadata, (v1) -> {
                return getDefaultItem(v1);
            });
        }
    }

    @Override // edebe.doglib.api.item.ICompoundItem
    public ItemStack get(int metadata) {
        return ICompoundItem.get(this, metadata);
    }

    @Override // edebe.doglib.api.item.ICompoundItem
    public void loaderAllModel() {
        ICompoundItem.loaderAllModel(this, this.maxMetadata, this.modelResourceLocation);
    }

    public ItemStack getDefaultItem(int metadata) {
        return ICompoundItem.get(this, metadata);
    }
}
