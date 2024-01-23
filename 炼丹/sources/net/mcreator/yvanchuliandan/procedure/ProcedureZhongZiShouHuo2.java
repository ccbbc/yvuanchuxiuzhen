package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1002;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1301;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1302;
import net.mcreator.yvanchuliandan.item.ItemCaoYao301;
import net.mcreator.yvanchuliandan.item.ItemCaoYao302;
import net.mcreator.yvanchuliandan.item.ItemCaoYao32;
import net.mcreator.yvanchuliandan.item.ItemCaoYao33;
import net.mcreator.yvanchuliandan.item.ItemCaoYao401;
import net.mcreator.yvanchuliandan.item.ItemCaoYao402;
import net.mcreator.yvanchuliandan.item.ItemCaoYao501;
import net.mcreator.yvanchuliandan.item.ItemCaoYao502;
import net.mcreator.yvanchuliandan.item.ItemCaoYao601;
import net.mcreator.yvanchuliandan.item.ItemCaoYao602;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1001;
import net.mcreator.yvanchuliandan.item.ItemCaoyao16;
import net.mcreator.yvanchuliandan.item.ItemCaoyao18;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1801;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1802;
import net.mcreator.yvanchuliandan.item.ItemCaoyao21;
import net.mcreator.yvanchuliandan.item.ItemCaoyao22;
import net.mcreator.yvanchuliandan.item.ItemCaoyao23;
import net.mcreator.yvanchuliandan.item.ItemCaoyao24;
import net.mcreator.yvanchuliandan.item.ItemCaoyao25;
import net.mcreator.yvanchuliandan.item.ItemZhongZi161;
import net.mcreator.yvanchuliandan.item.ItemZhongZi181;
import net.mcreator.yvanchuliandan.item.ItemZhongZi211;
import net.mcreator.yvanchuliandan.item.ItemZhongZi221;
import net.mcreator.yvanchuliandan.item.ItemZhongZi231;
import net.mcreator.yvanchuliandan.item.ItemZhongZi241;
import net.mcreator.yvanchuliandan.item.ItemZhongZi251;
import net.mcreator.yvanchuliandan.item.ItemZhongZiHuangLongGuo;
import net.mcreator.yvanchuliandan.item.ItemZhongZiJinHeLan;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureZhongZiShouHuo2.class */
public class ProcedureZhongZiShouHuo2 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureZhongZiShouHuo2(ElementsYvanchuliandanMod instance) {
        super(instance, 944);
    }

    /* JADX WARN: Type inference failed for: r0v121, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$26] */
    /* JADX WARN: Type inference failed for: r0v124, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$27] */
    /* JADX WARN: Type inference failed for: r0v127, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$28] */
    /* JADX WARN: Type inference failed for: r0v166, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$22] */
    /* JADX WARN: Type inference failed for: r0v169, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$23] */
    /* JADX WARN: Type inference failed for: r0v172, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$24] */
    /* JADX WARN: Type inference failed for: r0v211, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$18] */
    /* JADX WARN: Type inference failed for: r0v214, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$19] */
    /* JADX WARN: Type inference failed for: r0v217, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$20] */
    /* JADX WARN: Type inference failed for: r0v256, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$14] */
    /* JADX WARN: Type inference failed for: r0v259, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$15] */
    /* JADX WARN: Type inference failed for: r0v262, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$16] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$1] */
    /* JADX WARN: Type inference failed for: r0v301, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$10] */
    /* JADX WARN: Type inference failed for: r0v304, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$11] */
    /* JADX WARN: Type inference failed for: r0v307, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$12] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$5] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$9] */
    /* JADX WARN: Type inference failed for: r0v346, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$6] */
    /* JADX WARN: Type inference failed for: r0v349, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$7] */
    /* JADX WARN: Type inference failed for: r0v352, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$8] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$13] */
    /* JADX WARN: Type inference failed for: r0v391, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$2] */
    /* JADX WARN: Type inference failed for: r0v394, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$3] */
    /* JADX WARN: Type inference failed for: r0v397, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$4] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$17] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$21] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$25] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$29] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$31] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$32] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2$30] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 16.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao16.block, 1));
                    entityToSpawn.func_174867_a(10);
                    world.func_72838_d(entityToSpawn);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn2 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao1001.block, 1));
                    entityToSpawn2.func_174867_a(10);
                    world.func_72838_d(entityToSpawn2);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn3 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao1002.block, 1));
                entityToSpawn3.func_174867_a(10);
                world.func_72838_d(entityToSpawn3);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn4 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi161.block, 1));
                entityToSpawn4.func_174867_a(10);
                world.func_72838_d(entityToSpawn4);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn5 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi161.block, 1));
                entityToSpawn5.func_174867_a(10);
                world.func_72838_d(entityToSpawn5);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 18.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn6 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao18.block, 1));
                    entityToSpawn6.func_174867_a(10);
                    world.func_72838_d(entityToSpawn6);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn7 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao1801.block, 1));
                    entityToSpawn7.func_174867_a(10);
                    world.func_72838_d(entityToSpawn7);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn8 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao1802.block, 1));
                entityToSpawn8.func_174867_a(10);
                world.func_72838_d(entityToSpawn8);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn9 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi181.block, 1));
                entityToSpawn9.func_174867_a(10);
                world.func_72838_d(entityToSpawn9);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn10 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi181.block, 1));
                entityToSpawn10.func_174867_a(10);
                world.func_72838_d(entityToSpawn10);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 21.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn11 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao21.block, 1));
                    entityToSpawn11.func_174867_a(10);
                    world.func_72838_d(entityToSpawn11);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn12 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao1301.block, 1));
                    entityToSpawn12.func_174867_a(10);
                    world.func_72838_d(entityToSpawn12);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn13 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao1302.block, 1));
                entityToSpawn13.func_174867_a(10);
                world.func_72838_d(entityToSpawn13);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn14 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi211.block, 1));
                entityToSpawn14.func_174867_a(10);
                world.func_72838_d(entityToSpawn14);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn15 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi211.block, 1));
                entityToSpawn15.func_174867_a(10);
                world.func_72838_d(entityToSpawn15);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 22.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn16 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao22.block, 1));
                    entityToSpawn16.func_174867_a(10);
                    world.func_72838_d(entityToSpawn16);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn17 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao401.block, 1));
                    entityToSpawn17.func_174867_a(10);
                    world.func_72838_d(entityToSpawn17);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn18 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao402.block, 1));
                entityToSpawn18.func_174867_a(10);
                world.func_72838_d(entityToSpawn18);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn19 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi221.block, 1));
                entityToSpawn19.func_174867_a(10);
                world.func_72838_d(entityToSpawn19);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn20 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi221.block, 1));
                entityToSpawn20.func_174867_a(10);
                world.func_72838_d(entityToSpawn20);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.17
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 23.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn21 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao23.block, 1));
                    entityToSpawn21.func_174867_a(10);
                    world.func_72838_d(entityToSpawn21);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.19
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn22 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao301.block, 1));
                    entityToSpawn22.func_174867_a(10);
                    world.func_72838_d(entityToSpawn22);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.20
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn23 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao302.block, 1));
                entityToSpawn23.func_174867_a(10);
                world.func_72838_d(entityToSpawn23);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn24 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi231.block, 1));
                entityToSpawn24.func_174867_a(10);
                world.func_72838_d(entityToSpawn24);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn25 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi231.block, 1));
                entityToSpawn25.func_174867_a(10);
                world.func_72838_d(entityToSpawn25);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.21
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 24.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.22
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn26 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao24.block, 1));
                    entityToSpawn26.func_174867_a(10);
                    world.func_72838_d(entityToSpawn26);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.23
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn27 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao501.block, 1));
                    entityToSpawn27.func_174867_a(10);
                    world.func_72838_d(entityToSpawn27);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.24
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn28 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao502.block, 1));
                entityToSpawn28.func_174867_a(10);
                world.func_72838_d(entityToSpawn28);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn29 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi241.block, 1));
                entityToSpawn29.func_174867_a(10);
                world.func_72838_d(entityToSpawn29);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn30 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi241.block, 1));
                entityToSpawn30.func_174867_a(10);
                world.func_72838_d(entityToSpawn30);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 25.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.26
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn31 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao25.block, 1));
                    entityToSpawn31.func_174867_a(10);
                    world.func_72838_d(entityToSpawn31);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.27
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn32 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao601.block, 1));
                    entityToSpawn32.func_174867_a(10);
                    world.func_72838_d(entityToSpawn32);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn33 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao602.block, 1));
                entityToSpawn33.func_174867_a(10);
                world.func_72838_d(entityToSpawn33);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn34 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi251.block, 1));
                entityToSpawn34.func_174867_a(10);
                world.func_72838_d(entityToSpawn34);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn35 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi251.block, 1));
                entityToSpawn35.func_174867_a(10);
                world.func_72838_d(entityToSpawn35);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.29
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 100.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.30
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn36 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao32.block, 1));
                entityToSpawn36.func_174867_a(10);
                world.func_72838_d(entityToSpawn36);
            }
            if (new Random().nextInt(100) < 45 && !world.field_72995_K) {
                EntityItem entityToSpawn37 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiHuangLongGuo.block, 1));
                entityToSpawn37.func_174867_a(10);
                world.func_72838_d(entityToSpawn37);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn38 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiHuangLongGuo.block, 1));
                entityToSpawn38.func_174867_a(10);
                world.func_72838_d(entityToSpawn38);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.31
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 101.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo2.32
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn39 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao33.block, 1));
                entityToSpawn39.func_174867_a(10);
                world.func_72838_d(entityToSpawn39);
            }
            if (new Random().nextInt(100) < 45 && !world.field_72995_K) {
                EntityItem entityToSpawn40 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiJinHeLan.block, 1));
                entityToSpawn40.func_174867_a(10);
                world.func_72838_d(entityToSpawn40);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn41 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZiJinHeLan.block, 1));
                entityToSpawn41.func_174867_a(10);
                world.func_72838_d(entityToSpawn41);
            }
        }
        Map<String, Object> $_dependencies = new HashMap<>();
        $_dependencies.put("entity", entity);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        $_dependencies.put("world", world);
        ProcedureZhongZiShouHuo3.executeProcedure($_dependencies);
    }
}
