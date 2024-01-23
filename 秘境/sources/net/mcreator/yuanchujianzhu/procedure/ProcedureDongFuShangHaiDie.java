package net.mcreator.yuanchujianzhu.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureDongFuShangHaiDie.class */
public class ProcedureDongFuShangHaiDie extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureDongFuShangHaiDie(ElementsYuanchujianzhuMod instance) {
        super(instance, 145);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entity instanceof EntityPlayer) {
            if (entity.getEntityData().func_74767_n("洞府伤害1") || entity.getEntityData().func_74767_n("洞府伤害2") || entity.getEntityData().func_74767_n("洞府伤害3") || entity.getEntityData().func_74767_n("洞府伤害4") || entity.getEntityData().func_74767_n("洞府伤害")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.1
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
                    }, "gamerule showDeathMessages false");
                }
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.2
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
                    }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 因境界不足破开洞府禁制而亡\"}");
                }
                Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.3
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
                        }, "gamerule showDeathMessages true");
                    }
                }, 50L, TimeUnit.MILLISECONDS);
            }
            if (entity.getEntityData().func_74767_n("丹房伤害1") || entity.getEntityData().func_74767_n("丹房伤害2") || entity.getEntityData().func_74767_n("丹房伤害3") || entity.getEntityData().func_74767_n("丹房伤害4") || entity.getEntityData().func_74767_n("丹房伤害5")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.4
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
                    }, "gamerule showDeathMessages false");
                }
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.5
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
                    }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 因境界不足破开丹房禁制而亡\"}");
                }
                Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.6
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
                        }, "gamerule showDeathMessages true");
                    }
                }, 50L, TimeUnit.MILLISECONDS);
            }
            if (entity.getEntityData().func_74767_n("器房伤害1") || entity.getEntityData().func_74767_n("器房伤害2") || entity.getEntityData().func_74767_n("器房伤害3") || entity.getEntityData().func_74767_n("器房伤害4") || entity.getEntityData().func_74767_n("器房伤害5")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.7
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
                    }, "gamerule showDeathMessages false");
                }
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.8
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
                    }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 因境界不足破开器房禁制而亡\"}");
                }
                Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuShangHaiDie.9
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
                        }, "gamerule showDeathMessages true");
                    }
                }, 50L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @SubscribeEvent
    public void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
