package net.mcreator.lianqisanqiannian.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.mcreator.lianqisanqiannian.item.ItemChunJunJian;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureChunJunJianUse.class */
public class ProcedureChunJunJianUse extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureChunJunJianUse(ElementsLianqisanqiannianMod instance) {
        super(instance, 12);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChunJunJian.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74779_i("TiZhi").contains("天妒之体")) {
            if ((entityLivingBase.getEntityData().func_74769_h("GongFa") == 3000.0d && entityLivingBase.getEntityData().func_74769_h("Power") >= 120.0d && entityLivingBase.getEntityData().func_74769_h("Base") >= 3.0d) || ((entityLivingBase instanceof EntityPlayer) && ((EntityPlayer) entityLivingBase).field_71075_bZ.field_75098_d)) {
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b(), 200);
                }
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_184609_a(EnumHand.MAIN_HAND);
                }
                entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 200.0d);
                entityLivingBase.getEntityData().func_74780_a("Base", entityLivingBase.getEntityData().func_74769_h("Base") - 3.0d);
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureChunJunJianUse.1
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
                            return new BlockPos(entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177958_n(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177956_o(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177952_p());
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177958_n(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177956_o(), entityLivingBase.field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177952_p());
                        }
                    }, "summon lianqisanqiannian:jian_qi_mobs ~ ~ ~ {CustomName:\"" + new DecimalFormat("0.###").format(((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177958_n() - ((Entity) entityLivingBase).field_70165_t) + " " + new DecimalFormat("0.###").format(((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 5.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177952_p() - ((Entity) entityLivingBase).field_70161_v) + " " + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("MagicAttack") * 3.0d) + " " + entityLivingBase.func_145748_c_().func_150260_c() + "\"}");
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                    return;
                }
                return;
            } else if ((entityLivingBase.getEntityData().func_74769_h("Power") < 120.0d || entityLivingBase.getEntityData().func_74769_h("Base") < 3.0d) && (entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵气不足120或真元不足3，无法斩出剑气"), false);
                return;
            } else {
                return;
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChunJunJian.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74779_i("TiZhi").contains("天妒之体")) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("需将此剑置于主手方可斩出剑气"), false);
            }
        } else if (!entityLivingBase.getEntityData().func_74779_i("TiZhi").contains("天妒之体") && (entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§b<纯钧> 本剑灵是不会让凡夫俗子驱使的。"), false);
        }
    }
}
