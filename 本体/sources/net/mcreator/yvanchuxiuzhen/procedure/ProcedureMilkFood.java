package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemMilkBukkit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureMilkFood.class */
public class ProcedureMilkFood extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMilkFood(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 269);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(Items.field_151117_aB, 1).func_77973_b()) {
            if (dependencies.get("event") != null) {
                Object _obj = dependencies.get("event");
                if (_obj instanceof Event) {
                    Event _evt = (Event) _obj;
                    if (_evt.isCancelable()) {
                        _evt.setCanceled(true);
                    }
                }
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                ItemStack _setstack = new ItemStack(ItemMilkBukkit.block, 1);
                _setstack.func_190920_e(1);
                entityLivingBase.func_184611_a(EnumHand.MAIN_HAND, _setstack);
                if (entityLivingBase instanceof EntityPlayerMP) {
                    ((EntityPlayerMP) entityLivingBase).field_71071_by.func_70296_d();
                    return;
                }
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(Items.field_151117_aB, 1).func_77973_b()) {
            if (dependencies.get("event") != null) {
                Object _obj2 = dependencies.get("event");
                if (_obj2 instanceof Event) {
                    Event _evt2 = (Event) _obj2;
                    if (_evt2.isCancelable()) {
                        _evt2.setCanceled(true);
                    }
                }
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                ItemStack _setstack2 = new ItemStack(ItemMilkBukkit.block, 1);
                _setstack2.func_190920_e(1);
                entityLivingBase.func_184611_a(EnumHand.OFF_HAND, _setstack2);
                if (entityLivingBase instanceof EntityPlayerMP) {
                    ((EntityPlayerMP) entityLivingBase).field_71071_by.func_70296_d();
                }
            }
        }
    }

    @SubscribeEvent
    public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Object entity = event.getEntityPlayer();
        int i = event.getPos().func_177958_n();
        int j = event.getPos().func_177956_o();
        int k = event.getPos().func_177952_p();
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
