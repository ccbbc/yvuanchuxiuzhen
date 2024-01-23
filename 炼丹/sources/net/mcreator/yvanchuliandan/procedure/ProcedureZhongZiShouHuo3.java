package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCaoYao34;
import net.mcreator.yvanchuliandan.item.ItemCaoYao35;
import net.mcreator.yvanchuliandan.item.ItemCaoYao36;
import net.mcreator.yvanchuliandan.item.ItemCaoyao13;
import net.mcreator.yvanchuliandan.item.ItemCaoyao17;
import net.mcreator.yvanchuliandan.item.ItemCaoyao19;
import net.mcreator.yvanchuliandan.item.ItemCaoyao20;
import net.mcreator.yvanchuliandan.item.ItemZhongZi131;
import net.mcreator.yvanchuliandan.item.ItemZhongZi171;
import net.mcreator.yvanchuliandan.item.ItemZhongZi191;
import net.mcreator.yvanchuliandan.item.ItemZhongZi201;
import net.mcreator.yvanchuliandan.item.ItemZhongZi261;
import net.mcreator.yvanchuliandan.item.ItemZhongZiJuLingCao;
import net.mcreator.yvanchuliandan.item.ItemZhongZiQingYinHua;
import net.mcreator.yvanchuliandan.item.ItemZhongZiYunLinHua;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureZhongZiShouHuo3.class */
public class ProcedureZhongZiShouHuo3 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureZhongZiShouHuo3(ElementsYvanchuliandanMod instance) {
        super(instance, 945);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$18] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$20] */
    /* JADX WARN: Type inference failed for: r0v106, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$21] */
    /* JADX WARN: Type inference failed for: r0v133, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$19] */
    /* JADX WARN: Type inference failed for: r0v160, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$17] */
    /* JADX WARN: Type inference failed for: r0v187, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$15] */
    /* JADX WARN: Type inference failed for: r0v214, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$8] */
    /* JADX WARN: Type inference failed for: r0v217, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$10] */
    /* JADX WARN: Type inference failed for: r0v220, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$12] */
    /* JADX WARN: Type inference failed for: r0v255, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$2] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$3] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$5] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$6] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$4] */
    /* JADX WARN: Type inference failed for: r0v91, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$7] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$14] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3$16] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 102.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao34.block, 1));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
            if (new Random().nextInt(100) < 45 && !world.field_72995_K) {
                EntityItem entityToSpawn2 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiJuLingCao.block, 1));
                entityToSpawn2.func_174867_a(10);
                world.func_72838_d(entityToSpawn2);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn3 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiJuLingCao.block, 1));
                entityToSpawn3.func_174867_a(10);
                world.func_72838_d(entityToSpawn3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 103.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn4 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao35.block, 1));
                entityToSpawn4.func_174867_a(10);
                world.func_72838_d(entityToSpawn4);
            }
            if (new Random().nextInt(100) < 45 && !world.field_72995_K) {
                EntityItem entityToSpawn5 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiQingYinHua.block, 1));
                entityToSpawn5.func_174867_a(10);
                world.func_72838_d(entityToSpawn5);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn6 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiQingYinHua.block, 1));
                entityToSpawn6.func_174867_a(10);
                world.func_72838_d(entityToSpawn6);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 104.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn7 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao36.block, 1));
                entityToSpawn7.func_174867_a(10);
                world.func_72838_d(entityToSpawn7);
            }
            if (new Random().nextInt(100) < 30 && !world.field_72995_K) {
                EntityItem entityToSpawn8 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiYunLinHua.block, 1));
                entityToSpawn8.func_174867_a(10);
                world.func_72838_d(entityToSpawn8);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn9 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiYunLinHua.block, 1));
                entityToSpawn9.func_174867_a(10);
                world.func_72838_d(entityToSpawn9);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 26.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.9
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
                    }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuyaoshou:you_yao_cao_item\",Count:1b,Damage:0s}}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.11
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
                    }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuyaoshou:you_yao_cao_2_item\",Count:1b,Damage:0s}}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.13
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
                }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuyaoshou:you_yao_cao_3_item\",Count:1b,Damage:0s}}");
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn10 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi261.block, 1));
                entityToSpawn10.func_174867_a(10);
                world.func_72838_d(entityToSpawn10);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.14
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 13.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn11 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao13.block, 1));
                entityToSpawn11.func_174867_a(10);
                world.func_72838_d(entityToSpawn11);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn12 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi131.block, 1));
                entityToSpawn12.func_174867_a(10);
                world.func_72838_d(entityToSpawn12);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn13 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi131.block, 1));
                entityToSpawn13.func_174867_a(10);
                world.func_72838_d(entityToSpawn13);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.16
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 17.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.17
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn14 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao17.block, 1));
                entityToSpawn14.func_174867_a(10);
                world.func_72838_d(entityToSpawn14);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn15 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi171.block, 1));
                entityToSpawn15.func_174867_a(10);
                world.func_72838_d(entityToSpawn15);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn16 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi171.block, 1));
                entityToSpawn16.func_174867_a(10);
                world.func_72838_d(entityToSpawn16);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.18
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 19.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.19
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn17 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao19.block, 1));
                entityToSpawn17.func_174867_a(10);
                world.func_72838_d(entityToSpawn17);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn18 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi191.block, 1));
                entityToSpawn18.func_174867_a(10);
                world.func_72838_d(entityToSpawn18);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn19 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi191.block, 1));
                entityToSpawn19.func_174867_a(10);
                world.func_72838_d(entityToSpawn19);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.20
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 20.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo3.21
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn20 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao20.block, 1));
                entityToSpawn20.func_174867_a(10);
                world.func_72838_d(entityToSpawn20);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn21 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi201.block, 1));
                entityToSpawn21.func_174867_a(10);
                world.func_72838_d(entityToSpawn21);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn22 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi201.block, 1));
                entityToSpawn22.func_174867_a(10);
                world.func_72838_d(entityToSpawn22);
            }
        }
    }
}
