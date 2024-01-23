package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu04;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureCaientity15OnEntityTickUpdate.class */
public class ProcedureCaientity15OnEntityTickUpdate extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaientity15OnEntityTickUpdate(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu04.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        entity.getEntityData().func_74780_a("投弹", entity.getEntityData().func_74769_h("投弹") + 1.0d);
        if (entity.getEntityData().func_74769_h("投弹") >= 100.0d) {
            if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity15OnEntityTickUpdate.1
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
                            return new BlockPos(x, y - 1, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y - 1, z);
                        }
                    }, "summon yvanchuyaoshou:zhadan ~ ~ ~ {CustomName:\"二阶炸蛋\",CustomNameVisible:0b}");
                }
            } else if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity15OnEntityTickUpdate.2
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
                            return new BlockPos(x, y - 1, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y - 1, z);
                        }
                    }, "summon yvanchuyaoshou:zhadan ~ ~ ~ {CustomName:\"三阶炸蛋\",CustomNameVisible:0b}");
                }
            } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity15OnEntityTickUpdate.3
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
                            return new BlockPos(x, y - 1, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y - 1, z);
                        }
                    }, "summon yvanchuyaoshou:zhadan ~ ~ ~ {CustomName:\"四阶炸蛋\",CustomNameVisible:0b}");
                }
            } else if (entity.func_145748_c_().func_150260_c().contains("五阶") && !world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity15OnEntityTickUpdate.4
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
                        return new BlockPos(x, y - 1, z);
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x, y - 1, z);
                    }
                }, "summon yvanchuyaoshou:zhadan ~ ~ ~ {CustomName:\"五阶炸蛋\",CustomNameVisible:0b}");
            }
            entity.getEntityData().func_74780_a("投弹", 0.0d);
        }
    }
}
