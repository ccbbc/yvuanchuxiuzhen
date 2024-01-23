package edebe.doglib.api.item;

import edebe.core.EdebeCoreModPlugin;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.function.Function;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.model.ModelLoader;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/item/ICompoundItem.class */
public interface ICompoundItem {

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/item/ICompoundItem$IDisplayName.class */
    public interface IDisplayName {
        ITextComponent getDisplayName(ITextComponent iTextComponent, int i);
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/item/ICompoundItem$IModelResourceLocation.class */
    public interface IModelResourceLocation {
        ModelResourceLocation getModelResourceLocation(int i);
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/item/ICompoundItem$IName.class */
    public interface IName {
        ResourceLocation getName(int i);
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/item/ICompoundItem$IUnlocalizedName.class */
    public interface IUnlocalizedName {
        String getUnlocalizedName(String str, int i);
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/item/ICompoundItem$Instance.class */
    public @interface Instance {
    }

    ItemStack get(int i);

    void loaderAllModel();

    static String getUnlocalizedName(ItemStack stack, String method, IUnlocalizedName unlocalizedName) {
        return unlocalizedName.getUnlocalizedName(method, stack.func_77960_j());
    }

    static String getItemStackDisplayName(ItemStack stack, String method, IDisplayName displayName) {
        return displayName.getDisplayName(new TextComponentTranslation(method + ".name", new Object[0]), stack.func_77960_j()).func_150254_d();
    }

    static void getSubItems(NonNullList<ItemStack> list, int maxMetadata, Function<Integer, ItemStack> function) {
        for (int metadata = 0; metadata < maxMetadata; metadata++) {
            list.add(function.apply(Integer.valueOf(metadata)));
        }
    }

    static ItemStack get(Item thisItem, int metadata) {
        ItemStack stack = new ItemStack(thisItem);
        stack.func_77964_b(metadata);
        return stack;
    }

    static void loaderAllModel(Item thisItem, int maxMetadata, IModelResourceLocation modelResourceLocation) {
        for (int metadata = 0; metadata < maxMetadata; metadata++) {
            ModelLoader.setCustomModelResourceLocation(thisItem, metadata, modelResourceLocation.getModelResourceLocation(metadata));
        }
    }

    static <T extends Item> T newInstance(Class<T> clazz) {
        Method[] declaredMethods;
        if (Item.class.isAssignableFrom(clazz)) {
            for (Method method : clazz.getDeclaredMethods()) {
                boolean accessible = method.isAccessible();
                method.setAccessible(true);
                try {
                    try {
                    } catch (Exception e) {
                        EdebeCoreModPlugin.LOGGER.error(e);
                        method.setAccessible(accessible);
                    }
                    if (method.isAnnotationPresent(Instance.class)) {
                        T t = (T) method.invoke(null, new Object[0]);
                        method.setAccessible(accessible);
                        return t;
                    }
                    method.setAccessible(accessible);
                } catch (Throwable th) {
                    method.setAccessible(accessible);
                    throw th;
                }
            }
            throw new RuntimeException("Item has no instance");
        }
        throw new RuntimeException("Class is not instance of Item");
    }
}
