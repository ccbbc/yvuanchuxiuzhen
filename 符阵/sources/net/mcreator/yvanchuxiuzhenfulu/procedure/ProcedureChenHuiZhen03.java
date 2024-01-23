package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureChenHuiZhen03.class */
public class ProcedureChenHuiZhen03 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureChenHuiZhen03(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 366);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("绿荫阵") > 0.0d) {
            entityLivingBase.getEntityData().func_74780_a("绿荫阵", entityLivingBase.getEntityData().func_74769_h("绿荫阵") - 1.0d);
            entityLivingBase.getEntityData().func_74780_a("绿荫阵1", entityLivingBase.getEntityData().func_74769_h("绿荫阵1") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("绿荫阵1") >= 20.0d) {
                entityLivingBase.getEntityData().func_74780_a("绿荫阵1", 0.0d);
                if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70691_i(12.0f);
                    }
                } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 2.0d && (entityLivingBase instanceof EntityLivingBase)) {
                    entityLivingBase.func_70691_i(4.0f);
                }
            }
            if (!entityLivingBase.getEntityData().func_74767_n("绿荫阵2")) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已进入绿荫阵获得气血回复加成"), false);
                }
                entityLivingBase.getEntityData().func_74757_a("绿荫阵2", true);
            }
            if (entityLivingBase.getEntityData().func_74769_h("绿荫阵") == 0.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已离开绿荫阵失去气血回复加成"), false);
                }
                entityLivingBase.getEntityData().func_74757_a("绿荫阵2", false);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
