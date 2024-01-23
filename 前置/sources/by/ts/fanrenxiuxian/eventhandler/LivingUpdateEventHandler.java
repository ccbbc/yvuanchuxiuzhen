package by.ts.fanrenxiuxian.eventhandler;

import by.ts.fanrenxiuxian.AttrWrapper;
import by.ts.fanrenxiuxian.FRUtils;
import by.ts.fanrenxiuxian.packet.EntityDataPacket;
import by.ts.fanrenxiuxian.packet.PacketHandler;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/eventhandler/LivingUpdateEventHandler.class */
public class LivingUpdateEventHandler {
    @SubscribeEvent
    public static void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
        EntityPlayerMP entity = event.getEntity();
        if (entity != null && (entity instanceof EntityLivingBase) && !((Entity) entity).field_70170_p.field_72995_K) {
            NBTTagCompound data = entity.getEntityData();
            World world = ((Entity) entity).field_70170_p;
            EntityLivingBase living = (EntityLivingBase) entity;
            NBTTagCompound entityData = living.getEntityData();
            if (!data.func_74764_b("dataCreated")) {
                AttrWrapper.initCustomData(data);
            }
            if (data.func_74767_n("DataReset")) {
                AttrWrapper.initCustomData(data);
            }
            if (data.func_74767_n("dataChanged") && (entity instanceof EntityPlayer)) {
                PacketHandler.CHANNEL.sendTo(new EntityDataPacket(FRUtils.getCustomEntityData(living), living.func_145782_y()), (EntityPlayer) entity);
                data.func_74757_a("dataChanged", false);
            }
            if ((entity instanceof EntityPlayer) && ((EntityPlayer) entity).field_71075_bZ.field_75098_d) {
                entityData.func_74780_a("BeMagicAttack", 0.0d);
                entityData.func_74780_a("BeThunderAttack", 0.0d);
                entityData.func_74780_a("BeFireAttack", 0.0d);
                entityData.func_74780_a("BePoisonAttack", 0.0d);
                entityData.func_74780_a("NewAttackTime", 0.0d);
            }
            if (entityData.func_74769_h("BeMagicAttack") > 0.0d || entityData.func_74769_h("BeThunderAttack") > 0.0d || entityData.func_74769_h("BeFireAttack") > 0.0d || entityData.func_74769_h("BePoisonAttack") > 0.0d) {
                entityData.func_74780_a("NewAttackTime", entityData.func_74769_h("NewAttackTime") + 1.0d);
                if (entityData.func_74769_h("NewAttackTime") >= 2.0d) {
                    entityData.func_74780_a("NewAttackTime", 0.0d);
                    entityData.func_74757_a("BeNewAttack", true);
                    entity.func_70097_a(DamageSource.field_76380_i, 1.0f);
                }
            }
            if (world.func_72820_D() % 20 == 0 && (entity instanceof EntityPlayer)) {
                data.func_74757_a("dataChanged", false);
                PacketHandler.CHANNEL.sendTo(new EntityDataPacket(FRUtils.getCustomEntityData(living), living.func_145782_y()), (EntityPlayer) entity);
            }
        }
    }

    private static <T extends Entity> List<T> getEntitiesCloseToTarget(Class<T> clazz, World world, Entity target) {
        AxisAlignedBB aabb = new AxisAlignedBB(target.field_70165_t - 10.0d, target.field_70163_u - 10.0d, target.field_70161_v - 10.0d, target.field_70165_t + 10.0d, target.field_70163_u + 10.0d, target.field_70161_v + 10.0d);
        return world.func_72872_a(clazz, aabb);
    }

    private static void applyAttr(EntityLivingBase living, IAttribute attr, UUID modifierUuid, String attrName, int operation, boolean saved) {
        IAttributeInstance attrIns = living.func_110148_a(attr);
        if (attrIns != null) {
            AttributeModifier oldModifier = attrIns.func_111127_a(modifierUuid);
            double amount = living.getEntityData().func_74769_h(attrName);
            if (oldModifier == null || Math.abs(oldModifier.func_111164_d() - amount) > 1.0E-5d) {
                attrIns.func_188479_b(modifierUuid);
                AttributeModifier newModifier = new AttributeModifier(modifierUuid, attrName, amount, operation).func_111168_a(saved);
                attrIns.func_111121_a(newModifier);
            }
        }
    }
}
