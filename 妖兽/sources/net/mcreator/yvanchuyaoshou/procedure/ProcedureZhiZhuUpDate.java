package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityBaiYuZhiZhu;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureZhiZhuUpDate.class */
public class ProcedureZhiZhuUpDate extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhiZhuUpDate(ElementsYvanchuyaoshouMod instance) {
        super(instance, 372);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f && !entityLivingBase.getEntityData().func_74767_n("初始化")) {
            if (!entityLivingBase.getEntityData().func_74767_n("信息设置")) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureZhiZhuXinXi.executeProcedure($_dependencies);
                $_dependencies.put("entity", entityLivingBase);
                ProcedureMobsShuXingSet.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74757_a("信息设置", true);
            }
            entityLivingBase.getEntityData().func_74780_a("初始化计时", entityLivingBase.getEntityData().func_74769_h("初始化计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("初始化计时") >= 3.0d) {
                entityLivingBase.getEntityData().func_74780_a("初始化计时", 0.0d);
                entityLivingBase.func_96094_a(entityLivingBase.getEntityData().func_74779_i("名称"));
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70691_i(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
                }
                entityLivingBase.getEntityData().func_74757_a("初始化", true);
            }
        } else if (entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.getEntityData().func_74780_a("主计时", entityLivingBase.getEntityData().func_74769_h("主计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("主计时") >= 20.0d) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureShouJiAndTuoZhan.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74780_a("主计时", 0.0d);
            }
        }
        if (entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.func_96094_a(entityLivingBase.getEntityData().func_74779_i("名称"));
            if (entityLivingBase instanceof EntityBaiYuZhiZhu.EntityCustom) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.35d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureZhiZhuUpDate.1
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
                                return new BlockPos(x, y, z);
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x, y, z);
                            }
                        }, "/summon yvanchuyaoshou:xue_yu_zhi_zhu");
                    }
                    ((Entity) entityLivingBase).field_70170_p.func_72900_e(entityLivingBase);
                }
            }
            $_dependencies.put("entity", entityLivingBase);
            $_dependencies.put("world", world);
            ProcedureAllMobsUpdate.executeProcedure($_dependencies);
            entityLivingBase.getEntityData().func_74780_a("清除计时", 0.0d);
        }
    }
}
