package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeHuanZongSkill2.class */
public class ProcedureHeHuanZongSkill2 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeHuanZongSkill2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 307);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74767_n("冲刺伤害")) {
            entityLivingBase.getEntityData().func_74780_a("冲刺计时", entityLivingBase.getEntityData().func_74769_h("冲刺计时") + 1.0d);
            if (entityLivingBase.func_145748_c_().func_150260_c().contains("初期") || entityLivingBase.func_145748_c_().func_150260_c().contains("中期")) {
                if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureHeHuanZongSkill2.1
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityLivingBase.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityLivingBase.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityLivingBase.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityLivingBase;
                        }
                    }, "effect @e[r=2] yvanchuyaoshou:he_huan_zong_buff_1 1 1");
                }
                if (entityLivingBase.getEntityData().func_74769_h("冲刺计时") >= 8.0d) {
                    entityLivingBase.getEntityData().func_74780_a("冲刺计时", 0.0d);
                    entityLivingBase.getEntityData().func_74757_a("冲刺伤害", false);
                }
            } else if (entityLivingBase.func_145748_c_().func_150260_c().contains("后期")) {
                if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureHeHuanZongSkill2.2
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityLivingBase.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityLivingBase.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityLivingBase.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityLivingBase;
                        }
                    }, "effect @e[r=2] yvanchuyaoshou:he_huan_zong_buff_2 1 1");
                }
                if (entityLivingBase.getEntityData().func_74769_h("冲刺计时") >= 5.0d) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.05d) {
                        if (entityLivingBase instanceof EntityLivingBase) {
                            entityLivingBase.func_70691_i((float) ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.25d));
                        }
                    } else if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70691_i((float) entityLivingBase.getEntityData().func_74769_h("攻击"));
                    }
                    entityLivingBase.getEntityData().func_74780_a("冲刺计时", 0.0d);
                    entityLivingBase.getEntityData().func_74757_a("冲刺伤害", false);
                }
            }
        }
    }
}
