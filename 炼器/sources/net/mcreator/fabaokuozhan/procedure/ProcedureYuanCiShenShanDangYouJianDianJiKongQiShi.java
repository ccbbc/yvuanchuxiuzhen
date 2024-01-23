package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureYuanCiShenShanDangYouJianDianJiKongQiShi.class */
public class ProcedureYuanCiShenShanDangYouJianDianJiKongQiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYuanCiShenShanDangYouJianDianJiKongQiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 401);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        final WorldServer worldServer = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("Power") < 1131.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("灵力不足无法使用"), true);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("GongFa28") == 0.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("未修炼元磁神光无法使用"), true);
            }
        } else {
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureYuanCiShenShanDangYouJianDianJiKongQiShi.1
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=8] ~ ~ ~ shanghaiy " + new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h("MagicAttack") * 1.1d) + 641.0d) + " " + entityPlayer.func_145748_c_().func_150260_c() + "\",CustomNameVisible:0b}");
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FIREWORKS_SPARK, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 20.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 20.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177952_p(), 500, 7.0d, 3.0d, 7.0d, 0.1d, new int[0]);
            }
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1131.0d);
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 50);
            }
            if (itemstack.func_96631_a(20, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
        }
    }
}
