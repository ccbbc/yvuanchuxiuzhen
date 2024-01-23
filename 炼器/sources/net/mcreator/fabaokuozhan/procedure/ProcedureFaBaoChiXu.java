package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFaBaoChiXu.class */
public class ProcedureFaBaoChiXu extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFaBaoChiXu(ElementsFabaokuozhanMod instance) {
        super(instance, 518);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("青虹剑") > 0.0d) {
            entity.getEntityData().func_74780_a("青虹剑", entity.getEntityData().func_74769_h("青虹剑") - 1.0d);
            if (entity.getEntityData().func_74769_h("青虹剑") <= 0.0d) {
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 18.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 18.0d);
                entity.getEntityData().func_74780_a("AttackTemp", entity.getEntityData().func_74769_h("AttackTemp") + 18.0d);
                entity.getEntityData().func_74780_a("MagicAttackTemp", entity.getEntityData().func_74769_h("MagicAttackTemp") + 18.0d);
            }
        }
        if (entity.getEntityData().func_74769_h("翠竹棍") > 0.0d) {
            entity.getEntityData().func_74780_a("翠竹棍", entity.getEntityData().func_74769_h("翠竹棍") - 1.0d);
            if (entity.getEntityData().func_74769_h("翠竹棍") <= 0.0d) {
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") - 4.0d);
                entity.getEntityData().func_74780_a("MagicDefenseTemp", entity.getEntityData().func_74769_h("MagicDefenseTemp") - 4.0d);
            }
        }
        if (entity.getEntityData().func_74769_h("清风剑计时") > 0.0d) {
            entity.getEntityData().func_74780_a("清风剑计时", entity.getEntityData().func_74769_h("清风剑计时") - 1.0d);
            if (entity.getEntityData().func_74769_h("清风剑计时") <= 0.0d) {
                entity.getEntityData().func_74780_a("ThunderAttack", entity.getEntityData().func_74769_h("ThunderAttack") - entity.getEntityData().func_74769_h("清风剑累计"));
                entity.getEntityData().func_74780_a("ThunderAttackTemp", entity.getEntityData().func_74769_h("ThunderAttackTemp") - entity.getEntityData().func_74769_h("清风剑累计"));
                entity.getEntityData().func_74780_a("清风剑累计", 0.0d);
            }
        }
        if (entity.getEntityData().func_74769_h("石峰拳套计时") > 0.0d) {
            entity.getEntityData().func_74780_a("石峰拳套计时", entity.getEntityData().func_74769_h("石峰拳套计时") - 1.0d);
            if (entity.getEntityData().func_74769_h("石峰拳套计时") <= 0.0d) {
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") - 29.0d);
                entity.getEntityData().func_74780_a("DefenseTemp", entity.getEntityData().func_74769_h("DefenseTemp") - 29.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") - 29.0d);
                entity.getEntityData().func_74780_a("MagicDefenseTemp", entity.getEntityData().func_74769_h("MagicDefenseTemp") - 29.0d);
                entity.getEntityData().func_74780_a("石峰拳套计时", 0.0d);
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

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
