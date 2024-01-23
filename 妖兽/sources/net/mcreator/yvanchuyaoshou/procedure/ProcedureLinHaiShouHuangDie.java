package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityLvNi;
import net.mcreator.yvanchuyaoshou.item.ItemCaientity0201;
import net.mcreator.yvanchuyaoshou.item.ItemYaodan0204;
import net.mcreator.yvanchuyaoshou.item.ItemYaodan0205;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureLinHaiShouHuangDie.class */
public class ProcedureLinHaiShouHuangDie extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLinHaiShouHuangDie(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityLvNi.ENTITYID);
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
        if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            if (Math.random() <= 0.08d) {
                for (int index0 = 0; index0 < 3; index0++) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureLinHaiShouHuangDie.1
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
                        }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuliandan:cai_liao_11\",Count:1b,Damage:0s}}");
                    }
                }
            }
            if (Math.random() <= 0.2d && !world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureLinHaiShouHuangDie.2
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
                }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"fabaokuozhan:shou_huang_jing_xue\",Count:1b,Damage:0s}}");
            }
            if (!world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x, y + 1, z, new ItemStack(ItemYaodan0204.block, 1));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
            if (Math.random() <= 0.5d) {
                for (int index1 = 0; index1 < 3; index1++) {
                    if (!world.field_72995_K) {
                        EntityItem entityToSpawn2 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemCaientity0201.block, 1));
                        entityToSpawn2.func_174867_a(10);
                        world.func_72838_d(entityToSpawn2);
                    }
                }
            }
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            if (Math.random() <= 0.5d + (entity.getEntityData().func_74769_h("ZhiLi") * 0.05d) && !world.field_72995_K) {
                EntityItem entityToSpawn3 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemYaodan0205.block, 1));
                entityToSpawn3.func_174867_a(10);
                world.func_72838_d(entityToSpawn3);
            }
            if (Math.random() <= 0.5d && !world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureLinHaiShouHuangDie.3
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
                }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"fabaokuozhan:bi_hai_ling_yuan\",Count:1b,Damage:0s}}");
            }
        }
    }
}
