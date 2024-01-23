package net.mcreator.lianqisanqiannian.item;

import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.mcreator.lianqisanqiannian.procedure.ProcedureChunJunJianUse;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/item/ItemChunJunJian.class */
public class ItemChunJunJian extends ElementsLianqisanqiannianMod.ModElement {
    @GameRegistry.ObjectHolder("lianqisanqiannian:chun_jun_jian")
    public static final Item block = null;

    public ItemChunJunJian(ElementsLianqisanqiannianMod instance) {
        super(instance, 10);
    }

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemSword(EnumHelper.addToolMaterial("CHUN_JUN_JIAN", 0, 0, 0.0f, -3.0f, 0)) { // from class: net.mcreator.lianqisanqiannian.item.ItemChunJunJian.1
                public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot slot) {
                    Multimap multimap = super.func_111205_h(slot);
                    if (slot == EntityEquipmentSlot.MAINHAND) {
                        multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", func_150931_i(), 0));
                        multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Weapon modifier", -3.0d, 0));
                    }
                    return multimap;
                }

                public Set<String> getToolClasses(ItemStack stack) {
                    HashMap ret = new HashMap();
                    ret.put("sword", 0);
                    return ret.keySet();
                }

                public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
                    ActionResult retval = super.func_77659_a(world, entity, hand);
                    ItemStack itemStack = (ItemStack) retval.func_188398_b();
                    int x = (int) entity.field_70165_t;
                    int y = (int) entity.field_70163_u;
                    int z = (int) entity.field_70161_v;
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureChunJunJianUse.executeProcedure($_dependencies);
                    return retval;
                }
            }.func_77655_b("chun_jun_jian").setRegistryName("chun_jun_jian").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lianqisanqiannian:chun_jun_jian", "inventory"));
    }
}
