package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.entity.EntityJiaRen;
import net.mcreator.yvanchuxiuzhen.item.ItemJiaRenItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureJiaRenBeAttack.class */
public class ProcedureJiaRenBeAttack extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJiaRenBeAttack(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 435);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        EntityPlayer entityPlayer = (Entity) dependencies.get("sourceentity");
        if (entityLivingBase instanceof EntityJiaRen.EntityCustom) {
            entityLivingBase.getEntityData().func_74780_a("生命1", entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f);
            entityLivingBase.getEntityData().func_74757_a("被攻击", true);
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                entityLivingBase.getEntityData().func_74780_a("生命2", entityLivingBase.getEntityData().func_74769_h("生命1") - (entityLivingBase instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase).func_110143_aJ() : -1.0f));
                entityLivingBase.getEntityData().func_74778_a("造成伤害者", entityPlayer.func_145748_c_().func_150260_c());
                if ((entityPlayer instanceof EntityPlayer) && !entityPlayer.field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityPlayer).func_146105_b(new TextComponentString("造成伤害 " + new DecimalFormat("0.##").format(entityLivingBase.getEntityData().func_74769_h("生命2")) + " 点"), false);
                }
                if (entityLivingBase instanceof EntityLivingBase) {
                    ((EntityLivingBase) entityLivingBase).func_70606_j(entityLivingBase instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase).func_110138_aP() : -1.0f);
                }
                entityLivingBase.getEntityData().func_74757_a("被攻击", false);
            }, 25L, TimeUnit.MILLISECONDS);
            if (entityPlayer.func_70093_af()) {
                if (entityPlayer instanceof EntityPlayer) {
                    ItemStack _setstack = new ItemStack(ItemJiaRenItem.block, 1);
                    _setstack.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
                }
                ((Entity) entityLivingBase).field_70170_p.func_72900_e(entityLivingBase);
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
            float amount = event.getAmount();
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("amount", Float.valueOf(amount));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            dependencies.put("sourceentity", event.getSource().func_76346_g());
            dependencies.put("imediatesourceentity", event.getSource().func_76364_f());
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
