package by.ts.fanrenxiuxian;

import java.lang.reflect.Field;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/FRUtils.class */
public class FRUtils {
    public static void sendPlayerDataMessage(EntityPlayer player) {
        NBTTagCompound data = player.getEntityData();
        AttrWrapper.ATTR_MAP.values().stream().forEach(con -> {
            player.func_145747_a(new TextComponentString(con.getName() + ": " + con.getData(data)));
        });
    }

    public static void noAttrLimit(RangedAttribute attr) {
        Field[] fields = attr.getClass().getDeclaredFields();
        fields[0].setAccessible(true);
        fields[1].setAccessible(true);
        try {
            fields[0].set(attr, Double.valueOf(Double.MIN_VALUE));
            fields[1].set(attr, Double.valueOf(Double.MAX_VALUE));
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static NBTTagCompound getCustomEntityData(EntityLivingBase living) {
        NBTTagCompound customEntityData = new NBTTagCompound();
        NBTTagCompound entityData = living.getEntityData();
        AttrWrapper.ATTR_MAP.values().stream().forEach(attr -> {
            attr.setData(customEntityData, attr.getData(entityData));
        });
        return customEntityData;
    }
}
