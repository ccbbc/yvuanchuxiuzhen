package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureSanXiuSkill2.class */
public class ProcedureSanXiuSkill2 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXiuSkill2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 293);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.func_145748_c_().func_150260_c().contains("筑基")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.4d && Math.random() <= 0.5d) {
                entityLivingBase.getEntityData().func_74780_a("隐身计时", entityLivingBase.getEntityData().func_74769_h("隐身计时") + 1.0d);
            }
        } else if (entityLivingBase.func_145748_c_().func_150260_c().contains("化神")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.6d && Math.random() <= 0.5d) {
                entityLivingBase.getEntityData().func_74780_a("隐身计时", entityLivingBase.getEntityData().func_74769_h("隐身计时") + 1.0d);
            }
        } else {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.5d && Math.random() <= 0.5d) {
                entityLivingBase.getEntityData().func_74780_a("隐身计时", entityLivingBase.getEntityData().func_74769_h("隐身计时") + 1.0d);
            }
        }
        if (entityLivingBase.func_145748_c_().func_150260_c().contains("护法")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.6d && !((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureSanXiuSkill2.1
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
                }, "execute @e[r=5,type=!yvanchuyaoshou:tian_gong_3] ~ ~ ~ shanghai m 2088");
            }
        }
        if (entityLivingBase.getEntityData().func_74769_h("隐身计时") >= 5.0d) {
            if (!entityLivingBase.func_145748_c_().func_150260_c().contains("化神") && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 20, 1));
            }
            if (entityLivingBase.func_145748_c_().func_150260_c().contains("筑基")) {
                entityLivingBase.getEntityData().func_74757_a("无敌", true);
                entityLivingBase.getEntityData().func_74780_a("无敌时间", 10.0d);
            } else if (entityLivingBase.func_145748_c_().func_150260_c().contains("结丹")) {
                entityLivingBase.getEntityData().func_74757_a("无敌", true);
                entityLivingBase.getEntityData().func_74780_a("无敌时间", 20.0d);
            } else if (entityLivingBase.func_145748_c_().func_150260_c().contains("元婴")) {
                entityLivingBase.getEntityData().func_74757_a("无敌", true);
                entityLivingBase.getEntityData().func_74780_a("无敌时间", 20.0d);
                if (entityLivingBase.getEntityData().func_74769_h("Sex") == 1.0d) {
                    if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureSanXiuSkill2.2
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
                        }, " execute @e[r=8,c=1,type=!yvanchuyaoshou:san_xiu_04]  ~ ~ ~ shanghai m 1720");
                    }
                } else if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureSanXiuSkill2.3
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
                    }, " execute @e[r=8,c=1,type=!yvanchuyaoshou:san_xiu_0402]  ~ ~ ~ shanghai m 1720");
                }
            } else if (entityLivingBase.func_145748_c_().func_150260_c().contains("化神")) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 40, 1));
                }
                entityLivingBase.getEntityData().func_74757_a("无敌", true);
                entityLivingBase.getEntityData().func_74780_a("无敌时间", 30.0d);
                if (entityLivingBase.getEntityData().func_74769_h("Sex") == 1.0d) {
                    if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureSanXiuSkill2.4
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
                        }, " execute @e[r=12,c=1,type=!yvanchuyaoshou:san_xiu_05]  ~ ~ ~ shanghai m 4022");
                    }
                } else if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureSanXiuSkill2.5
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
                    }, " execute @e[r=12,c=1,type=!yvanchuyaoshou:san_xiu_0502]  ~ ~ ~ shanghai m 4022");
                }
            }
            entityLivingBase.getEntityData().func_74780_a("隐身计时", 0.0d);
        }
    }
}
