package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCao702;
import net.mcreator.yvanchuliandan.item.ItemCaoYao101;
import net.mcreator.yvanchuliandan.item.ItemCaoYao102;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1101;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1102;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1201;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1202;
import net.mcreator.yvanchuliandan.item.ItemCaoYao201;
import net.mcreator.yvanchuliandan.item.ItemCaoYao202;
import net.mcreator.yvanchuliandan.item.ItemCaoYao52;
import net.mcreator.yvanchuliandan.item.ItemCaoYao53;
import net.mcreator.yvanchuliandan.item.ItemCaoYao701;
import net.mcreator.yvanchuliandan.item.ItemCaoYao801;
import net.mcreator.yvanchuliandan.item.ItemCaoYao802;
import net.mcreator.yvanchuliandan.item.ItemCaoYao82;
import net.mcreator.yvanchuliandan.item.ItemCaoYao83;
import net.mcreator.yvanchuliandan.item.ItemCaoYao901;
import net.mcreator.yvanchuliandan.item.ItemCaoYao902;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1;
import net.mcreator.yvanchuliandan.item.ItemCaoyao10;
import net.mcreator.yvanchuliandan.item.ItemCaoyao11;
import net.mcreator.yvanchuliandan.item.ItemCaoyao12;
import net.mcreator.yvanchuliandan.item.ItemCaoyao15;
import net.mcreator.yvanchuliandan.item.ItemCaoyao2;
import net.mcreator.yvanchuliandan.item.ItemCaoyao3;
import net.mcreator.yvanchuliandan.item.ItemCaoyao4;
import net.mcreator.yvanchuliandan.item.ItemCaoyao5;
import net.mcreator.yvanchuliandan.item.ItemCaoyao6;
import net.mcreator.yvanchuliandan.item.ItemCaoyao7;
import net.mcreator.yvanchuliandan.item.ItemCaoyao8;
import net.mcreator.yvanchuliandan.item.ItemCaoyao9;
import net.mcreator.yvanchuliandan.item.ItemZhongZi101;
import net.mcreator.yvanchuliandan.item.ItemZhongZi11;
import net.mcreator.yvanchuliandan.item.ItemZhongZi1111;
import net.mcreator.yvanchuliandan.item.ItemZhongZi121;
import net.mcreator.yvanchuliandan.item.ItemZhongZi151;
import net.mcreator.yvanchuliandan.item.ItemZhongZi21;
import net.mcreator.yvanchuliandan.item.ItemZhongZi31;
import net.mcreator.yvanchuliandan.item.ItemZhongZi41;
import net.mcreator.yvanchuliandan.item.ItemZhongZi51;
import net.mcreator.yvanchuliandan.item.ItemZhongZi61;
import net.mcreator.yvanchuliandan.item.ItemZhongZi71;
import net.mcreator.yvanchuliandan.item.ItemZhongZi81;
import net.mcreator.yvanchuliandan.item.ItemZhongZi91;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureZhongZiShouHuo.class */
public class ProcedureZhongZiShouHuo extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhongZiShouHuo(ElementsYvanchuliandanMod instance) {
        super(instance, 563);
    }

    /* JADX WARN: Type inference failed for: r0v134, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$53] */
    /* JADX WARN: Type inference failed for: r0v161, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$49] */
    /* JADX WARN: Type inference failed for: r0v164, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$50] */
    /* JADX WARN: Type inference failed for: r0v167, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$51] */
    /* JADX WARN: Type inference failed for: r0v206, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$45] */
    /* JADX WARN: Type inference failed for: r0v209, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$46] */
    /* JADX WARN: Type inference failed for: r0v212, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$47] */
    /* JADX WARN: Type inference failed for: r0v251, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$43] */
    /* JADX WARN: Type inference failed for: r0v278, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$39] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$1] */
    /* JADX WARN: Type inference failed for: r0v281, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$40] */
    /* JADX WARN: Type inference failed for: r0v284, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$41] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$9] */
    /* JADX WARN: Type inference failed for: r0v323, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$37] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$12] */
    /* JADX WARN: Type inference failed for: r0v350, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$35] */
    /* JADX WARN: Type inference failed for: r0v377, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$31] */
    /* JADX WARN: Type inference failed for: r0v380, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$32] */
    /* JADX WARN: Type inference failed for: r0v383, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$33] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$10] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$11] */
    /* JADX WARN: Type inference failed for: r0v422, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$27] */
    /* JADX WARN: Type inference failed for: r0v425, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$28] */
    /* JADX WARN: Type inference failed for: r0v428, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$29] */
    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$13] */
    /* JADX WARN: Type inference failed for: r0v467, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$23] */
    /* JADX WARN: Type inference failed for: r0v470, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$24] */
    /* JADX WARN: Type inference failed for: r0v473, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$25] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$14] */
    /* JADX WARN: Type inference failed for: r0v512, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$19] */
    /* JADX WARN: Type inference failed for: r0v515, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$20] */
    /* JADX WARN: Type inference failed for: r0v518, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$21] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$18] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$22] */
    /* JADX WARN: Type inference failed for: r0v568, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$15] */
    /* JADX WARN: Type inference failed for: r0v571, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$16] */
    /* JADX WARN: Type inference failed for: r0v574, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$17] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$26] */
    /* JADX WARN: Type inference failed for: r0v613, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$2] */
    /* JADX WARN: Type inference failed for: r0v616, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$3] */
    /* JADX WARN: Type inference failed for: r0v619, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$4] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$30] */
    /* JADX WARN: Type inference failed for: r0v622, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$5] */
    /* JADX WARN: Type inference failed for: r0v625, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$6] */
    /* JADX WARN: Type inference failed for: r0v628, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$7] */
    /* JADX WARN: Type inference failed for: r0v631, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$8] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$34] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$36] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$38] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$42] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$44] */
    /* JADX WARN: Type inference failed for: r0v80, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$48] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$52] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$54] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$55] */
    /* JADX WARN: Type inference failed for: r0v92, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$56] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo$57] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") < 100.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") != 13.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") != 17.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") != 19.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") != 20.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") + 2.0d);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") + 4.0d);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d) {
                entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") + 6.0d);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 19.0d || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.10
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") < 20.0d || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.11
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") >= 100.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") + 4.0d);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") + 6.0d);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.14
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 1.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao1.block, 1));
                    entityToSpawn.func_174867_a(10);
                    world.func_72838_d(entityToSpawn);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn2 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao101.block, 1));
                    entityToSpawn2.func_174867_a(10);
                    world.func_72838_d(entityToSpawn2);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.17
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn3 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao102.block, 1));
                entityToSpawn3.func_174867_a(10);
                world.func_72838_d(entityToSpawn3);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn4 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi11.block, 1));
                entityToSpawn4.func_174867_a(10);
                world.func_72838_d(entityToSpawn4);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn5 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi11.block, 1));
                entityToSpawn5.func_174867_a(10);
                world.func_72838_d(entityToSpawn5);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.18
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 2.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.19
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn6 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao2.block, 1));
                    entityToSpawn6.func_174867_a(10);
                    world.func_72838_d(entityToSpawn6);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.20
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn7 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao901.block, 1));
                    entityToSpawn7.func_174867_a(10);
                    world.func_72838_d(entityToSpawn7);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.21
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn8 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao902.block, 1));
                entityToSpawn8.func_174867_a(10);
                world.func_72838_d(entityToSpawn8);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn9 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi21.block, 1));
                entityToSpawn9.func_174867_a(10);
                world.func_72838_d(entityToSpawn9);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn10 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi21.block, 1));
                entityToSpawn10.func_174867_a(10);
                world.func_72838_d(entityToSpawn10);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.22
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 3.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.23
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn11 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao3.block, 1));
                    entityToSpawn11.func_174867_a(10);
                    world.func_72838_d(entityToSpawn11);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.24
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn12 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao201.block, 1));
                    entityToSpawn12.func_174867_a(10);
                    world.func_72838_d(entityToSpawn12);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.25
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn13 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao202.block, 1));
                entityToSpawn13.func_174867_a(10);
                world.func_72838_d(entityToSpawn13);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn14 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi31.block, 1));
                entityToSpawn14.func_174867_a(10);
                world.func_72838_d(entityToSpawn14);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn15 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi31.block, 1));
                entityToSpawn15.func_174867_a(10);
                world.func_72838_d(entityToSpawn15);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.26
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 4.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.27
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn16 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao4.block, 1));
                    entityToSpawn16.func_174867_a(10);
                    world.func_72838_d(entityToSpawn16);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn17 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao1201.block, 1));
                    entityToSpawn17.func_174867_a(10);
                    world.func_72838_d(entityToSpawn17);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.29
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn18 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao1202.block, 1));
                entityToSpawn18.func_174867_a(10);
                world.func_72838_d(entityToSpawn18);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn19 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi41.block, 1));
                entityToSpawn19.func_174867_a(10);
                world.func_72838_d(entityToSpawn19);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn20 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi41.block, 1));
                entityToSpawn20.func_174867_a(10);
                world.func_72838_d(entityToSpawn20);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.30
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 5.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.31
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d && !world.field_72995_K) {
                EntityItem entityToSpawn21 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao5.block, 1));
                entityToSpawn21.func_174867_a(10);
                world.func_72838_d(entityToSpawn21);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.32
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn22 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao52.block, 1));
                entityToSpawn22.func_174867_a(10);
                world.func_72838_d(entityToSpawn22);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.33
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn23 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao53.block, 1));
                entityToSpawn23.func_174867_a(10);
                world.func_72838_d(entityToSpawn23);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn24 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi51.block, 1));
                entityToSpawn24.func_174867_a(10);
                world.func_72838_d(entityToSpawn24);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn25 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi51.block, 1));
                entityToSpawn25.func_174867_a(10);
                world.func_72838_d(entityToSpawn25);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.34
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 6.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.35
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d && !world.field_72995_K) {
                EntityItem entityToSpawn26 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao6.block, 1));
                entityToSpawn26.func_174867_a(10);
                world.func_72838_d(entityToSpawn26);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn27 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi61.block, 1));
                entityToSpawn27.func_174867_a(10);
                world.func_72838_d(entityToSpawn27);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn28 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi61.block, 1));
                entityToSpawn28.func_174867_a(10);
                world.func_72838_d(entityToSpawn28);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.36
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 7.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.37
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d && !world.field_72995_K) {
                EntityItem entityToSpawn29 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao7.block, 1));
                entityToSpawn29.func_174867_a(10);
                world.func_72838_d(entityToSpawn29);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn30 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi71.block, 1));
                entityToSpawn30.func_174867_a(10);
                world.func_72838_d(entityToSpawn30);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn31 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi71.block, 1));
                entityToSpawn31.func_174867_a(10);
                world.func_72838_d(entityToSpawn31);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.38
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 8.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.39
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d && !world.field_72995_K) {
                EntityItem entityToSpawn32 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao8.block, 1));
                entityToSpawn32.func_174867_a(10);
                world.func_72838_d(entityToSpawn32);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.40
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d && !world.field_72995_K) {
                EntityItem entityToSpawn33 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao82.block, 1));
                entityToSpawn33.func_174867_a(10);
                world.func_72838_d(entityToSpawn33);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.41
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn34 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao83.block, 1));
                entityToSpawn34.func_174867_a(10);
                world.func_72838_d(entityToSpawn34);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn35 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi81.block, 1));
                entityToSpawn35.func_174867_a(10);
                world.func_72838_d(entityToSpawn35);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn36 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi81.block, 1));
                entityToSpawn36.func_174867_a(10);
                world.func_72838_d(entityToSpawn36);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.42
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 9.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.43
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d && !world.field_72995_K) {
                EntityItem entityToSpawn37 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao9.block, 1));
                entityToSpawn37.func_174867_a(10);
                world.func_72838_d(entityToSpawn37);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn38 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi91.block, 1));
                entityToSpawn38.func_174867_a(10);
                world.func_72838_d(entityToSpawn38);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn39 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi91.block, 1));
                entityToSpawn39.func_174867_a(10);
                world.func_72838_d(entityToSpawn39);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.44
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 10.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.45
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn40 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao10.block, 1));
                    entityToSpawn40.func_174867_a(10);
                    world.func_72838_d(entityToSpawn40);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.46
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn41 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao701.block, 1));
                    entityToSpawn41.func_174867_a(10);
                    world.func_72838_d(entityToSpawn41);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.47
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn42 = new EntityItem(world, x, y, z, new ItemStack(ItemCao702.block, 1));
                entityToSpawn42.func_174867_a(10);
                world.func_72838_d(entityToSpawn42);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn43 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi101.block, 1));
                entityToSpawn43.func_174867_a(10);
                world.func_72838_d(entityToSpawn43);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn44 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi101.block, 1));
                entityToSpawn44.func_174867_a(10);
                world.func_72838_d(entityToSpawn44);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.48
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 11.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.49
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn45 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao11.block, 1));
                    entityToSpawn45.func_174867_a(10);
                    world.func_72838_d(entityToSpawn45);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.50
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn46 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao801.block, 1));
                    entityToSpawn46.func_174867_a(10);
                    world.func_72838_d(entityToSpawn46);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.51
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn47 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao802.block, 1));
                entityToSpawn47.func_174867_a(10);
                world.func_72838_d(entityToSpawn47);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn48 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi1111.block, 1));
                entityToSpawn48.func_174867_a(10);
                world.func_72838_d(entityToSpawn48);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn49 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi1111.block, 1));
                entityToSpawn49.func_174867_a(10);
                world.func_72838_d(entityToSpawn49);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.52
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 12.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.53
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d && !world.field_72995_K) {
                EntityItem entityToSpawn50 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao12.block, 1));
                entityToSpawn50.func_174867_a(10);
                world.func_72838_d(entityToSpawn50);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn51 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi121.block, 1));
                entityToSpawn51.func_174867_a(10);
                world.func_72838_d(entityToSpawn51);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn52 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi121.block, 1));
                entityToSpawn52.func_174867_a(10);
                world.func_72838_d(entityToSpawn52);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.54
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "CaoYao") == 15.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.55
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn53 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoyao15.block, 1));
                    entityToSpawn53.func_174867_a(10);
                    world.func_72838_d(entityToSpawn53);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.56
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn54 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao1101.block, 1));
                    entityToSpawn54.func_174867_a(10);
                    world.func_72838_d(entityToSpawn54);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZiShouHuo.57
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 5.0d && !world.field_72995_K) {
                EntityItem entityToSpawn55 = new EntityItem(world, x, y, z, new ItemStack(ItemCaoYao1102.block, 1));
                entityToSpawn55.func_174867_a(10);
                world.func_72838_d(entityToSpawn55);
            }
            if (new Random().nextInt(100) < entity.getEntityData().func_74769_h("ZhongZhi") * 10.0d && !world.field_72995_K) {
                EntityItem entityToSpawn56 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi151.block, 1));
                entityToSpawn56.func_174867_a(10);
                world.func_72838_d(entityToSpawn56);
            }
            if (new Random().nextInt(100) < 60 && !world.field_72995_K) {
                EntityItem entityToSpawn57 = new EntityItem(world, x, y, z, new ItemStack(ItemZhongZi151.block, 1));
                entityToSpawn57.func_174867_a(10);
                world.func_72838_d(entityToSpawn57);
            }
        }
        $_dependencies.put("entity", entity);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        $_dependencies.put("world", world);
        ProcedureZhongZiShouHuo2.executeProcedure($_dependencies);
    }
}
