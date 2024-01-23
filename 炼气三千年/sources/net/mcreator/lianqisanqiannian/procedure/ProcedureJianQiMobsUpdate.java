package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.mcreator.lianqisanqiannian.entity.EntityJianQiMobs;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureJianQiMobsUpdate.class */
public class ProcedureJianQiMobsUpdate extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureJianQiMobsUpdate(ElementsLianqisanqiannianMod instance) {
        super(instance, 17);
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiMobsUpdate$2] */
    /* JADX WARN: Type inference failed for: r2v27, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiMobsUpdate$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        if (entity instanceof EntityJianQiMobs.EntityCustom) {
            if (!entity.getEntityData().func_74767_n("无敌")) {
                entity.getEntityData().func_74757_a("无敌", true);
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiMobsUpdate.1
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
                    }, "execute @s ~ ~ ~ jianqiset " + entity.func_145748_c_().func_150260_c());
                }
            }
            if (!entity.getEntityData().func_74779_i("伤害").equals("") && !entity.getEntityData().func_74767_n("初始化")) {
                entity.getEntityData().func_74778_a("NumTempSave3", entity.getEntityData().func_74779_i("NumTempSave1").replace(".", ""));
                entity.getEntityData().func_74778_a("NumTempSave4", entity.getEntityData().func_74779_i("NumTempSave2").replace(".", ""));
                entity.getEntityData().func_74780_a("X数Temp", new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiMobsUpdate.2
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(entity.getEntityData().func_74779_i("NumTempSave3")));
                entity.getEntityData().func_74780_a("Z数Temp", new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiMobsUpdate.3
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(entity.getEntityData().func_74779_i("NumTempSave4")));
                entity.getEntityData().func_74780_a("X数", entity.getEntityData().func_74769_h("X数Temp") / 1000.0d);
                entity.getEntityData().func_74780_a("Z数", entity.getEntityData().func_74769_h("Z数Temp") / 1000.0d);
                entity.getEntityData().func_74757_a("初始化", true);
            }
            if (entity.getEntityData().func_74767_n("初始化")) {
                entity.field_70159_w = entity.getEntityData().func_74769_h("X数");
                entity.field_70181_x = 0.0d;
                entity.field_70179_y = entity.getEntityData().func_74769_h("Z数");
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiMobsUpdate.4
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
                    }, "execute @e[r=3] ~ ~ ~ jianqiset " + entity.getEntityData().func_74779_i("伤害") + " true " + entity.getEntityData().func_74779_i("剑气主人"));
                }
                entity.getEntityData().func_74780_a("计时", entity.getEntityData().func_74769_h("计时") + 1.0d);
                if (entity.getEntityData().func_74769_h("计时") >= 180.0d) {
                    entity.getEntityData().func_74780_a("计时", 0.0d);
                    entity.field_70170_p.func_72900_e(entity);
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntityTick(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase entityLiving = event.getEntityLiving();
        Object world = ((Entity) entityLiving).field_70170_p;
        int i = (int) ((Entity) entityLiving).field_70165_t;
        int j = (int) ((Entity) entityLiving).field_70163_u;
        int k = (int) ((Entity) entityLiving).field_70161_v;
        Map<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entityLiving);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
