package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureGongFaLimit.class */
public class ProcedureGongFaLimit extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureGongFaLimit(ElementsLianqisanqiannianMod instance) {
        super(instance, 5);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (entityLivingBase.getEntityData().func_74779_i("TiZhi").contains("天妒之体")) {
            if (!(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_")) {
                if (!(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_")) {
                    if (!(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("flyinginstrument:")) {
                        if (!(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("flyinginstrument:")) {
                            return;
                        }
                    }
                    if (dependencies.get("event") != null) {
                        Object _obj = dependencies.get("event");
                        if (_obj instanceof Event) {
                            Event _evt = (Event) _obj;
                            if (_evt.isCancelable()) {
                                _evt.setCanceled(true);
                            }
                        }
                    }
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("一股灰色的力量阻止你使用飞剑"), false);
                    }
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x, y, z, 30, 0.5d, 0.5d, 0.5d, 0.0d, new int[0]);
                        return;
                    }
                    return;
                }
            }
            if (dependencies.get("event") != null) {
                Object _obj2 = dependencies.get("event");
                if (_obj2 instanceof Event) {
                    Event _evt2 = (Event) _obj2;
                    if (_evt2.isCancelable()) {
                        _evt2.setCanceled(true);
                    }
                }
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("一股灰色的力量阻止你学习此功法"), false);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x, y, z, 30, 0.5d, 0.5d, 0.5d, 0.0d, new int[0]);
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

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
