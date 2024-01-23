package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureWanXiangZhen03.class */
public class ProcedureWanXiangZhen03 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureWanXiangZhen03(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 522);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("万象阵") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("万象阵", entityPlayer.getEntityData().func_74769_h("万象阵") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("万象阵1", entityPlayer.getEntityData().func_74769_h("万象阵1") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("万象阵1") >= 20.0d) {
                entityPlayer.getEntityData().func_74780_a("万象阵1", 0.0d);
                if (entityPlayer.getEntityData().func_74769_h("Power") < entityPlayer.getEntityData().func_74769_h("PowerMax") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                    entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") + 600.0d);
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < entityPlayer.getEntityData().func_74769_h("PowerMax") && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                    entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") + 400.0d);
                }
            }
            if (!entityPlayer.getEntityData().func_74767_n("万象阵2")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已进入万象阵获得灵力回复加成"), false);
                }
                entityPlayer.getEntityData().func_74757_a("万象阵2", true);
            }
            if (entityPlayer.getEntityData().func_74769_h("万象阵") == 0.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已离开万象阵失去灵力回复加成"), false);
                }
                entityPlayer.getEntityData().func_74757_a("万象阵2", false);
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
