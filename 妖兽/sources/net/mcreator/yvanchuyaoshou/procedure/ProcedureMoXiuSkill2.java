package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureMoXiuSkill2.class */
public class ProcedureMoXiuSkill2 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMoXiuSkill2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 302);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74767_n("冲刺伤害")) {
            entity.getEntityData().func_74780_a("冲刺计时", entity.getEntityData().func_74769_h("冲刺计时") + 1.0d);
            if (entity.func_145748_c_().func_150260_c().contains("筑基")) {
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMoXiuSkill2.1
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entity.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entity.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entity.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entity;
                        }
                    }, "effect @e[r=2] yvanchuyaoshou:mo_xiu_buff_1 1 1");
                }
                if (entity.getEntityData().func_74769_h("冲刺计时") >= 6.0d) {
                    entity.getEntityData().func_74780_a("冲刺计时", 0.0d);
                    entity.getEntityData().func_74757_a("冲刺伤害", false);
                }
            } else if (entity.func_145748_c_().func_150260_c().contains("结丹")) {
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMoXiuSkill2.2
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entity.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entity.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entity.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entity;
                        }
                    }, "effect @e[r=2] yvanchuyaoshou:mo_xiu_buff_2 1 1");
                }
                if (entity.getEntityData().func_74769_h("冲刺计时") >= 7.0d) {
                    entity.getEntityData().func_74780_a("冲刺计时", 0.0d);
                    entity.getEntityData().func_74757_a("冲刺伤害", false);
                }
            } else if (entity.func_145748_c_().func_150260_c().contains("元婴")) {
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMoXiuSkill2.3
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entity.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entity.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entity.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entity;
                        }
                    }, "effect @e[r=2] yvanchuyaoshou:mo_xiu_buff_3 1 1");
                }
                if (entity.getEntityData().func_74769_h("冲刺计时") >= 8.0d) {
                    entity.getEntityData().func_74780_a("冲刺计时", 0.0d);
                    entity.getEntityData().func_74757_a("冲刺伤害", false);
                }
            } else if (entity.func_145748_c_().func_150260_c().contains("化神")) {
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMoXiuSkill2.4
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entity.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entity.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entity.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entity;
                        }
                    }, "effect @e[r=2] yvanchuyaoshou:mo_xiu_buff_4 1 1");
                }
                if (entity.getEntityData().func_74769_h("冲刺计时") >= 9.0d) {
                    entity.getEntityData().func_74780_a("冲刺计时", 0.0d);
                    entity.getEntityData().func_74757_a("冲刺伤害", false);
                }
            }
        }
    }
}
