package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.mcreator.lianqisanqiannian.item.ItemChunJunJian;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureBeChunJunJianAttack.class */
public class ProcedureBeChunJunJianAttack extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureBeChunJunJianAttack(ElementsLianqisanqiannianMod instance) {
        super(instance, 24);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("sourceentity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemChunJunJian.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74779_i("TiZhi").contains("天妒之体")) {
            if (Math.random() <= 0.5d) {
                entity.getEntityData().func_74780_a("BeMagicAttack", entity.getEntityData().func_74769_h("BeMagicAttack") + entityLivingBase.getEntityData().func_74769_h("MagicAttack"));
                entity.getEntityData().func_74757_a("BeAttackB", true);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChunJunJian.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74779_i("TiZhi").contains("天妒之体") && !entityLivingBase.getEntityData().func_74767_n("纯钧攻击冷却")) {
            entity.getEntityData().func_74780_a("BeMagicAttack", (12.0d + entityLivingBase.getEntityData().func_74769_h("LayerNum") + entityLivingBase.getEntityData().func_74769_h("MagicAttack")) * 1.45d);
            entity.getEntityData().func_74757_a("BeNewAttack", true);
            if (Math.random() <= 0.5d) {
                entityLivingBase.getEntityData().func_74757_a("纯钧剑性格", true);
            } else if (Math.random() <= 0.5d) {
                entityLivingBase.getEntityData().func_74757_a("纯钧剑性格", false);
            }
            entityLivingBase.getEntityData().func_74757_a("纯钧攻击冷却", true);
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChunJunJian.block, 1).func_77973_b() && !entityLivingBase.getEntityData().func_74779_i("TiZhi").contains("天妒之体")) {
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
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§b<纯钧> 任尔等凡夫何等巨力，吾亦不动万分。"), false);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChunJunJian.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74767_n("纯钧攻击冷却") && dependencies.get("event") != null) {
            Object _obj2 = dependencies.get("event");
            if (_obj2 instanceof Event) {
                Event _evt2 = (Event) _obj2;
                if (_evt2.isCancelable()) {
                    _evt2.setCanceled(true);
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            dependencies.put("sourceentity", event.getSource().func_76364_f());
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
