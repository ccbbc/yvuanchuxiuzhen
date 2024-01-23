package net.mcreator.yvanchuxiuzhen.item;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFabao28BlockDestroyedWithTool;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFabao28ItemIsCraftedsmelted;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemFabao28.class */
public class ItemFabao28 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fabao28")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemFabao28(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 24);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemPickaxe(EnumHelper.addToolMaterial("FABAO28", 5, 1000, 8.0f, 2.0f, 0)) { // from class: net.mcreator.yvanchuxiuzhen.item.ItemFabao28.1
                {
                    this.field_185065_c = -3.0f;
                }

                public Set<String> getToolClasses(ItemStack stack) {
                    HashMap ret = new HashMap();
                    ret.put("pickaxe", 5);
                    return ret.keySet();
                }

                public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
                    ActionResult retval = super.func_77659_a(world, entity, hand);
                    ItemStack itemStack = (ItemStack) retval.func_188398_b();
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    ProcedureFabao28BlockDestroyedWithTool.executeProcedure(ItemFabao28.$_dependencies);
                    return retval;
                }

                public void func_77622_d(ItemStack itemstack, World world, EntityPlayer entity) {
                    super.func_77622_d(itemstack, world, entity);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    ItemFabao28.$_dependencies.put("itemstack", itemstack);
                    ProcedureFabao28ItemIsCraftedsmelted.executeProcedure(ItemFabao28.$_dependencies);
                }
            }.func_77655_b("fabao28").setRegistryName("fabao28").func_77637_a(TabFenlei01.tab);
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhen:fabao28", "inventory"));
    }
}
