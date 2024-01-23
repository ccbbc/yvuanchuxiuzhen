package net.mcreator.yvanchuyaoshou.procedure;

import java.text.DecimalFormat;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureTianGongUpdate.class */
public class ProcedureTianGongUpdate extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTianGongUpdate(ElementsYvanchuyaoshouMod instance) {
        super(instance, 323);
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureTianGongUpdate$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f && !entityLivingBase.getEntityData().func_74767_n("初始化")) {
            if (!entityLivingBase.getEntityData().func_74767_n("信息设置")) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureTianGongXinXi.executeProcedure($_dependencies);
                $_dependencies.put("entity", entityLivingBase);
                ProcedureMobsShuXingSet.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74757_a("信息设置", true);
            }
            entityLivingBase.getEntityData().func_74780_a("初始化计时", entityLivingBase.getEntityData().func_74769_h("初始化计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("初始化计时") >= 3.0d) {
                entityLivingBase.getEntityData().func_74780_a("初始化计时", 0.0d);
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70691_i(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
                }
                entityLivingBase.func_96094_a(entityLivingBase.getEntityData().func_74779_i("名称"));
                entityLivingBase.getEntityData().func_74757_a("初始化", true);
            }
        } else if (entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.getEntityData().func_74780_a("主计时", entityLivingBase.getEntityData().func_74769_h("主计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("主计时") >= 20.0d) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureShouJiAndTuoZhan.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74780_a("主计时", 0.0d);
                ProcedureSanXiuSkill.executeProcedure($_dependencies);
                if (entityLivingBase.func_145748_c_().func_150260_c().contains("中期")) {
                    $_dependencies.put("entity", entityLivingBase);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureTianGongSkill0.executeProcedure($_dependencies);
                }
                if (entityLivingBase.func_145748_c_().func_150260_c().contains("后期")) {
                    entityLivingBase.getEntityData().func_74780_a("计时1", entityLivingBase.getEntityData().func_74769_h("计时1") + 1.0d);
                    entityLivingBase.getEntityData().func_74780_a("计时2", entityLivingBase.getEntityData().func_74769_h("计时2") + 1.0d);
                    if (entityLivingBase.getEntityData().func_74767_n("技能3")) {
                        entityLivingBase.getEntityData().func_74780_a("计时3", entityLivingBase.getEntityData().func_74769_h("计时3") + 1.0d);
                        if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                            ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureTianGongUpdate.1
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
                            }, " execute @e[r=12,type=!yvanchuyaoshou:tian_gong_3]  ~ ~ ~ shanghai m 6374");
                        }
                    }
                    if (entityLivingBase.getEntityData().func_74769_h("计时1") >= 1.0d) {
                        entityLivingBase.getEntityData().func_74780_a("MagicDefense", entityLivingBase.getEntityData().func_74769_h("法防"));
                    }
                    if (entityLivingBase.getEntityData().func_74769_h("计时1") >= 3.0d) {
                        entityLivingBase.getEntityData().func_74780_a("法防增加", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureTianGongUpdate.2
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("MagicDefense") * 0.3d)));
                        entityLivingBase.getEntityData().func_74780_a("MagicDefense", entityLivingBase.getEntityData().func_74769_h("MagicDefense") + entityLivingBase.getEntityData().func_74769_h("法防增加"));
                        if (entityLivingBase instanceof EntityLivingBase) {
                            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 20, 3, false, false));
                        }
                        entityLivingBase.getEntityData().func_74780_a("计时1", 0.0d);
                    }
                    if (entityLivingBase.getEntityData().func_74769_h("计时2") >= 5.0d) {
                        entityLivingBase.getEntityData().func_74757_a("技能3", true);
                        entityLivingBase.getEntityData().func_74780_a("计时2", 0.0d);
                    }
                    if (entityLivingBase.getEntityData().func_74769_h("计时3") >= 3.0d) {
                        entityLivingBase.getEntityData().func_74757_a("技能3", false);
                        entityLivingBase.getEntityData().func_74780_a("计时3", 0.0d);
                    }
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.05d && !entityLivingBase.getEntityData().func_74767_n("技能2")) {
                            if (entityLivingBase instanceof EntityLivingBase) {
                                entityLivingBase.func_70691_i((float) ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.3d));
                            }
                            entityLivingBase.getEntityData().func_74757_a("技能2", true);
                        }
                    }
                }
            }
        }
        if (entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.func_96094_a(entityLivingBase.getEntityData().func_74779_i("名称"));
        }
        $_dependencies.put("entity", entityLivingBase);
        ProcedureSanXiuSkill2.executeProcedure($_dependencies);
        if (entityLivingBase.func_145748_c_().func_150260_c().contains("中期")) {
            $_dependencies.put("entity", entityLivingBase);
            ProcedureCaientity04EntityIsHurt.executeProcedure($_dependencies);
        }
        if (entityLivingBase.func_145748_c_().func_150260_c().contains("后期")) {
            entityLivingBase.getEntityData().func_74780_a("教主技能计时", entityLivingBase.getEntityData().func_74769_h("教主技能计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("教主技能计时") >= 100.0d) {
                if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureTianGongUpdate.3
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
                    }, "execute @e[r=7,type=!yvanchuyaoshou:tian_gong_3] ~ ~ ~ shanghai m 3108");
                }
                entityLivingBase.getEntityData().func_74780_a("教主技能计时", 0.0d);
            }
        }
        if (entityLivingBase.getEntityData().func_74767_n("无敌")) {
            entityLivingBase.getEntityData().func_74780_a("无敌计时", entityLivingBase.getEntityData().func_74769_h("无敌计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("无敌计时") >= entityLivingBase.getEntityData().func_74769_h("无敌时间")) {
                entityLivingBase.getEntityData().func_74757_a("无敌", false);
                entityLivingBase.getEntityData().func_74780_a("无敌计时", 0.0d);
                entityLivingBase.getEntityData().func_74780_a("无敌时间", 0.0d);
            }
        }
        $_dependencies.put("entity", entityLivingBase);
        $_dependencies.put("world", world);
        ProcedureAllMobsUpdate.executeProcedure($_dependencies);
    }
}
