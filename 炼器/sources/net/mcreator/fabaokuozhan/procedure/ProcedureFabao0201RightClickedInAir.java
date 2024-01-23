package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao0201RightClickedInAir.class */
public class ProcedureFabao0201RightClickedInAir extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao0201RightClickedInAir(ElementsFabaokuozhanMod instance) {
        super(instance, 118);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴期以下无法使用"), false);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) >= (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d)) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("本命阶段") : -1.0d) != 0.0d) {
                if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("绑定者") : "").equals(entityLivingBase.func_189512_bd())) {
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("本命法宝的所有者不是你,你无法使用"), false);
                        return;
                    }
                    return;
                }
            }
            entityLivingBase.func_70634_a(((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177952_p());
            world.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("entity.endereye.launch")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("惊神击!"), false);
            }
            entityLivingBase.getEntityData().func_74780_a("BeMagicAttack", entityLivingBase.getEntityData().func_74769_h("BeMagicAttack") + entityLivingBase.getEntityData().func_74769_h("MagicDefense") + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d));
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0201RightClickedInAir.1
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return world;
                    }

                    public MinecraftServer func_184102_h() {
                        return world.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177958_n(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177956_o(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177958_n(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177956_o(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=7] ~ ~ ~ shanghaiyc " + new DecimalFormat("0").format((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d) + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("威能伤害") : -1.0d) + (0.75d * entityLivingBase.getEntityData().func_74769_h("Attack"))) + " " + entityLivingBase.func_145748_c_().func_150260_c() + "\",CustomNameVisible:0b}");
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 140);
            }
            if (itemstack.func_96631_a(40, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
        } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("气血不足无法释放"), false);
        }
    }
}
