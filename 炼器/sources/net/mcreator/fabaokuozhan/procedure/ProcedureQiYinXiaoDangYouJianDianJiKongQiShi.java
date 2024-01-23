package net.mcreator.fabaokuozhan.procedure;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureQiYinXiaoDangYouJianDianJiKongQiShi.class */
public class ProcedureQiYinXiaoDangYouJianDianJiKongQiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQiYinXiaoDangYouJianDianJiKongQiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 482);
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureQiYinXiaoDangYouJianDianJiKongQiShi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("结丹期以下修士无法使用"), false);
                return;
            }
            return;
        }
        if (entityPlayer.getEntityData().func_74769_h("Power") >= (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d)) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("本命阶段") : -1.0d) != 0.0d) {
                if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("绑定者") : "").equals(entityPlayer.func_189512_bd())) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("本命法宝的所有者不是你,你无法使用"), false);
                        return;
                    }
                    return;
                }
            }
            List<Entity> _entfound = (List) world.func_175647_a(Entity.class, new AxisAlignedBB(x - 6.0d, y - 6.0d, z - 6.0d, x + 6.0d, y + 6.0d, z + 6.0d), (Predicate) null).stream().sorted(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureQiYinXiaoDangYouJianDianJiKongQiShi.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparing(_entcnd -> {
                        return Double.valueOf(_entcnd.func_70092_e(_x, _y, _z));
                    });
                }
            }.compareDistOf(x, y, z)).collect(Collectors.toList());
            for (Entity entityiterator : _entfound) {
                entityiterator.getEntityData().func_74780_a("BeMagicAttack", (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d) + entityiterator.getEntityData().func_74769_h("BeMagicAttack") + entityPlayer.getEntityData().func_74769_h("MagicAttack"));
            }
            if (entityPlayer instanceof EntityLivingBase) {
                ((EntityLivingBase) entityPlayer).func_70691_i((float) ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("威能伤害") : -1.0d) + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d)));
            }
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d));
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 60);
            }
            if (itemstack.func_96631_a(30, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("灵力不足无法使用"), false);
        }
    }
}
