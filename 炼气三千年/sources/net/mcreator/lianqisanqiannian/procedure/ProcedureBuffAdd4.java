package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureBuffAdd4.class */
public class ProcedureBuffAdd4 extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureBuffAdd4(ElementsLianqisanqiannianMod instance) {
        super(instance, 30);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("BuffAdd8") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("BuffAdd8") > 2.0d) {
                entityLivingBase.getEntityData().func_74780_a("BuffAdd8", 2.0d);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76422_e, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd8") - 1.0d), false, false));
            }
        }
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("xpAmount", Integer.valueOf(event.getExpToDrop()));
        dependencies.put("x", Integer.valueOf(event.getPos().func_177958_n()));
        dependencies.put("y", Integer.valueOf(event.getPos().func_177956_o()));
        dependencies.put("z", Integer.valueOf(event.getPos().func_177952_p()));
        dependencies.put("px", Integer.valueOf((int) ((Entity) player).field_70165_t));
        dependencies.put("py", Integer.valueOf((int) ((Entity) player).field_70163_u));
        dependencies.put("pz", Integer.valueOf((int) ((Entity) player).field_70161_v));
        dependencies.put("world", event.getWorld());
        dependencies.put("entity", player);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
