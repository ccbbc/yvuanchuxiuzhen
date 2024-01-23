package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao32;
import net.mcreator.fabaokuozhan.item.ItemJinYuHuan;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBiHaiWuLiangDunFangYu.class */
public class ProcedureBiHaiWuLiangDunFangYu extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBiHaiWuLiangDunFangYu(ElementsFabaokuozhanMod instance) {
        super(instance, 300);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao32.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("bihaiwuliangdun") == 0.0d) {
                entityLivingBase.getEntityData().func_74780_a("bihaiwuliangdun", 1.0d);
                entityLivingBase.getEntityData().func_74780_a("Defense", entityLivingBase.getEntityData().func_74769_h("Defense") + 67.0d);
            } else {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemFabao32.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("bihaiwuliangdun") == 1.0d) {
                    entityLivingBase.getEntityData().func_74780_a("bihaiwuliangdun", 0.0d);
                    entityLivingBase.getEntityData().func_74780_a("Defense", entityLivingBase.getEntityData().func_74769_h("Defense") - 68.0d);
                }
            }
        }
        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJinYuHuan.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jinyuhuan") == 0.0d) {
                entityLivingBase.getEntityData().func_74780_a("jinyuhuan", 1.0d);
                entityLivingBase.getEntityData().func_74780_a("MagicDefense", entityLivingBase.getEntityData().func_74769_h("MagicDefense") + 4.0d);
            } else {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemJinYuHuan.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jinyuhuan") == 1.0d) {
                    entityLivingBase.getEntityData().func_74780_a("jinyuhuan", 0.0d);
                    entityLivingBase.getEntityData().func_74780_a("MagicDefense", entityLivingBase.getEntityData().func_74769_h("MagicDefense") - 4.0d);
                }
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJinYuHuan.block, 1).func_77973_b()) {
                entityLivingBase.getEntityData().func_74780_a("jinyuhuantick", entityLivingBase.getEntityData().func_74769_h("jinyuhuantick") + 1.0d);
                if (entityLivingBase.getEntityData().func_74769_h("jinyuhuantick") >= 20.0d) {
                    if (entityLivingBase.func_70089_S() && (entityLivingBase instanceof EntityLivingBase)) {
                        entityLivingBase.func_70691_i(1.0f);
                    }
                    entityLivingBase.getEntityData().func_74780_a("jinyuhuantick", 0.0d);
                }
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
