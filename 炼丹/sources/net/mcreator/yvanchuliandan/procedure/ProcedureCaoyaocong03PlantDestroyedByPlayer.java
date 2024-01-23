package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCao702;
import net.mcreator.yvanchuliandan.item.ItemCaoYao02;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1002;
import net.mcreator.yvanchuliandan.item.ItemCaoYao101;
import net.mcreator.yvanchuliandan.item.ItemCaoYao102;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1101;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1102;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1201;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1202;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1301;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1302;
import net.mcreator.yvanchuliandan.item.ItemCaoYao201;
import net.mcreator.yvanchuliandan.item.ItemCaoYao202;
import net.mcreator.yvanchuliandan.item.ItemCaoYao301;
import net.mcreator.yvanchuliandan.item.ItemCaoYao302;
import net.mcreator.yvanchuliandan.item.ItemCaoYao401;
import net.mcreator.yvanchuliandan.item.ItemCaoYao402;
import net.mcreator.yvanchuliandan.item.ItemCaoYao501;
import net.mcreator.yvanchuliandan.item.ItemCaoYao502;
import net.mcreator.yvanchuliandan.item.ItemCaoYao601;
import net.mcreator.yvanchuliandan.item.ItemCaoYao602;
import net.mcreator.yvanchuliandan.item.ItemCaoYao701;
import net.mcreator.yvanchuliandan.item.ItemCaoYao801;
import net.mcreator.yvanchuliandan.item.ItemCaoYao802;
import net.mcreator.yvanchuliandan.item.ItemCaoYao901;
import net.mcreator.yvanchuliandan.item.ItemCaoYao902;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1001;
import net.mcreator.yvanchuliandan.item.ItemCaoyao12;
import net.mcreator.yvanchuliandan.item.ItemCaoyao17;
import net.mcreator.yvanchuliandan.item.ItemCaoyao18;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1801;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1802;
import net.mcreator.yvanchuliandan.item.ItemCaoyao21;
import net.mcreator.yvanchuliandan.item.ItemCaoyao22;
import net.mcreator.yvanchuliandan.item.ItemCaoyao23;
import net.mcreator.yvanchuliandan.item.ItemCaoyao24;
import net.mcreator.yvanchuliandan.item.ItemCaoyao3;
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
import net.mcreator.yvanchuliandan.item.ItemZhongZi161;
import net.mcreator.yvanchuliandan.item.ItemZhongZi171;
import net.mcreator.yvanchuliandan.item.ItemZhongZi181;
import net.mcreator.yvanchuliandan.item.ItemZhongZi21;
import net.mcreator.yvanchuliandan.item.ItemZhongZi211;
import net.mcreator.yvanchuliandan.item.ItemZhongZi221;
import net.mcreator.yvanchuliandan.item.ItemZhongZi231;
import net.mcreator.yvanchuliandan.item.ItemZhongZi241;
import net.mcreator.yvanchuliandan.item.ItemZhongZi251;
import net.mcreator.yvanchuliandan.item.ItemZhongZi261;
import net.mcreator.yvanchuliandan.item.ItemZhongZi31;
import net.mcreator.yvanchuliandan.item.ItemZhongZi41;
import net.mcreator.yvanchuliandan.item.ItemZhongZi51;
import net.mcreator.yvanchuliandan.item.ItemZhongZi61;
import net.mcreator.yvanchuliandan.item.ItemZhongZi71;
import net.mcreator.yvanchuliandan.item.ItemZhongZi81;
import net.mcreator.yvanchuliandan.item.ItemZhongZi91;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureCaoyaocong03PlantDestroyedByPlayer.class */
public class ProcedureCaoyaocong03PlantDestroyedByPlayer extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureCaoyaocong03PlantDestroyedByPlayer(ElementsYvanchuliandanMod instance) {
        super(instance, 481);
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
        entity.getEntityData().func_74780_a("草药", new Random().nextInt(100));
        if (entity.getEntityData().func_74769_h("草药") <= 49.0d) {
            entity.getEntityData().func_74780_a("草药", new Random().nextInt(17));
            if (entity.getEntityData().func_74769_h("草药") == 0.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao502.block, 1));
                    entityToSpawn.func_174867_a(10);
                    world.func_72838_d(entityToSpawn);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn2 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi241.block, 1));
                    entityToSpawn2.func_174867_a(10);
                    world.func_72838_d(entityToSpawn2);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 1.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn3 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao602.block, 1));
                    entityToSpawn3.func_174867_a(10);
                    world.func_72838_d(entityToSpawn3);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn4 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi251.block, 1));
                    entityToSpawn4.func_174867_a(10);
                    world.func_72838_d(entityToSpawn4);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 2.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn5 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao402.block, 1));
                    entityToSpawn5.func_174867_a(10);
                    world.func_72838_d(entityToSpawn5);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn6 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi221.block, 1));
                    entityToSpawn6.func_174867_a(10);
                    world.func_72838_d(entityToSpawn6);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn7 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao302.block, 1));
                    entityToSpawn7.func_174867_a(10);
                    world.func_72838_d(entityToSpawn7);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn8 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi231.block, 1));
                    entityToSpawn8.func_174867_a(10);
                    world.func_72838_d(entityToSpawn8);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn9 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao202.block, 1));
                    entityToSpawn9.func_174867_a(10);
                    world.func_72838_d(entityToSpawn9);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn10 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi31.block, 1));
                    entityToSpawn10.func_174867_a(10);
                    world.func_72838_d(entityToSpawn10);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 5.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn11 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao102.block, 1));
                    entityToSpawn11.func_174867_a(10);
                    world.func_72838_d(entityToSpawn11);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn12 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi11.block, 1));
                    entityToSpawn12.func_174867_a(10);
                    world.func_72838_d(entityToSpawn12);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 6.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn13 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCao702.block, 1));
                    entityToSpawn13.func_174867_a(10);
                    world.func_72838_d(entityToSpawn13);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn14 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi101.block, 1));
                    entityToSpawn14.func_174867_a(10);
                    world.func_72838_d(entityToSpawn14);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 7.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn15 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao802.block, 1));
                    entityToSpawn15.func_174867_a(10);
                    world.func_72838_d(entityToSpawn15);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn16 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi1111.block, 1));
                    entityToSpawn16.func_174867_a(10);
                    world.func_72838_d(entityToSpawn16);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 8.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn17 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao902.block, 1));
                    entityToSpawn17.func_174867_a(10);
                    world.func_72838_d(entityToSpawn17);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn18 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi21.block, 1));
                    entityToSpawn18.func_174867_a(10);
                    world.func_72838_d(entityToSpawn18);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 9.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn19 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao1002.block, 1));
                    entityToSpawn19.func_174867_a(10);
                    world.func_72838_d(entityToSpawn19);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn20 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi161.block, 1));
                    entityToSpawn20.func_174867_a(10);
                    world.func_72838_d(entityToSpawn20);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 10.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn21 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao1102.block, 1));
                    entityToSpawn21.func_174867_a(10);
                    world.func_72838_d(entityToSpawn21);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn22 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi151.block, 1));
                    entityToSpawn22.func_174867_a(10);
                    world.func_72838_d(entityToSpawn22);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 11.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn23 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao1202.block, 1));
                    entityToSpawn23.func_174867_a(10);
                    world.func_72838_d(entityToSpawn23);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn24 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi41.block, 1));
                    entityToSpawn24.func_174867_a(10);
                    world.func_72838_d(entityToSpawn24);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 12.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn25 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao1302.block, 1));
                    entityToSpawn25.func_174867_a(10);
                    world.func_72838_d(entityToSpawn25);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn26 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi211.block, 1));
                    entityToSpawn26.func_174867_a(10);
                    world.func_72838_d(entityToSpawn26);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 13.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn27 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao02.block, 1));
                    entityToSpawn27.func_174867_a(10);
                    world.func_72838_d(entityToSpawn27);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 14.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn28 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao1802.block, 1));
                    entityToSpawn28.func_174867_a(10);
                    world.func_72838_d(entityToSpawn28);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn29 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi181.block, 1));
                    entityToSpawn29.func_174867_a(10);
                    world.func_72838_d(entityToSpawn29);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 15.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCaoyaocong03PlantDestroyedByPlayer.1
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
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn30 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi261.block, 1));
                    entityToSpawn30.func_174867_a(10);
                    world.func_72838_d(entityToSpawn30);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 16.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn31 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao17.block, 1));
                    entityToSpawn31.func_174867_a(10);
                    world.func_72838_d(entityToSpawn31);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn32 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi171.block, 1));
                    entityToSpawn32.func_174867_a(10);
                    world.func_72838_d(entityToSpawn32);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if ((entity.getEntityData().func_74769_h("草药") > 49.0d) == (entity.getEntityData().func_74769_h("草药") <= 74.0d)) {
            entity.getEntityData().func_74780_a("草药", new Random().nextInt(14));
            if (entity.getEntityData().func_74769_h("草药") == 0.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn33 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao1801.block, 1));
                    entityToSpawn33.func_174867_a(10);
                    world.func_72838_d(entityToSpawn33);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn34 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi181.block, 1));
                    entityToSpawn34.func_174867_a(10);
                    world.func_72838_d(entityToSpawn34);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 1.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn35 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao101.block, 1));
                    entityToSpawn35.func_174867_a(10);
                    world.func_72838_d(entityToSpawn35);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn36 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi11.block, 1));
                    entityToSpawn36.func_174867_a(10);
                    world.func_72838_d(entityToSpawn36);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 2.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn37 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao201.block, 1));
                    entityToSpawn37.func_174867_a(10);
                    world.func_72838_d(entityToSpawn37);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn38 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi31.block, 1));
                    entityToSpawn38.func_174867_a(10);
                    world.func_72838_d(entityToSpawn38);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn39 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao301.block, 1));
                    entityToSpawn39.func_174867_a(10);
                    world.func_72838_d(entityToSpawn39);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn40 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi231.block, 1));
                    entityToSpawn40.func_174867_a(10);
                    world.func_72838_d(entityToSpawn40);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn41 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao401.block, 1));
                    entityToSpawn41.func_174867_a(10);
                    world.func_72838_d(entityToSpawn41);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn42 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi221.block, 1));
                    entityToSpawn42.func_174867_a(10);
                    world.func_72838_d(entityToSpawn42);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 5.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn43 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao501.block, 1));
                    entityToSpawn43.func_174867_a(10);
                    world.func_72838_d(entityToSpawn43);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn44 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi241.block, 1));
                    entityToSpawn44.func_174867_a(10);
                    world.func_72838_d(entityToSpawn44);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 6.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn45 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao601.block, 1));
                    entityToSpawn45.func_174867_a(10);
                    world.func_72838_d(entityToSpawn45);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn46 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi251.block, 1));
                    entityToSpawn46.func_174867_a(10);
                    world.func_72838_d(entityToSpawn46);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 7.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn47 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao701.block, 1));
                    entityToSpawn47.func_174867_a(10);
                    world.func_72838_d(entityToSpawn47);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn48 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi101.block, 1));
                    entityToSpawn48.func_174867_a(10);
                    world.func_72838_d(entityToSpawn48);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 8.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn49 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao801.block, 1));
                    entityToSpawn49.func_174867_a(10);
                    world.func_72838_d(entityToSpawn49);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn50 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi121.block, 1));
                    entityToSpawn50.func_174867_a(10);
                    world.func_72838_d(entityToSpawn50);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 9.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn51 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao901.block, 1));
                    entityToSpawn51.func_174867_a(10);
                    world.func_72838_d(entityToSpawn51);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn52 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi21.block, 1));
                    entityToSpawn52.func_174867_a(10);
                    world.func_72838_d(entityToSpawn52);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 10.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn53 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao1001.block, 1));
                    entityToSpawn53.func_174867_a(10);
                    world.func_72838_d(entityToSpawn53);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn54 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi161.block, 1));
                    entityToSpawn54.func_174867_a(10);
                    world.func_72838_d(entityToSpawn54);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 11.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn55 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao1101.block, 1));
                    entityToSpawn55.func_174867_a(10);
                    world.func_72838_d(entityToSpawn55);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn56 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi151.block, 1));
                    entityToSpawn56.func_174867_a(10);
                    world.func_72838_d(entityToSpawn56);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 12.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn57 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao1201.block, 1));
                    entityToSpawn57.func_174867_a(10);
                    world.func_72838_d(entityToSpawn57);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn58 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi41.block, 1));
                    entityToSpawn58.func_174867_a(10);
                    world.func_72838_d(entityToSpawn58);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 13.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn59 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao1301.block, 1));
                    entityToSpawn59.func_174867_a(10);
                    world.func_72838_d(entityToSpawn59);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn60 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi211.block, 1));
                    entityToSpawn60.func_174867_a(10);
                    world.func_72838_d(entityToSpawn60);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if ((entity.getEntityData().func_74769_h("草药") <= 84.0d) == (entity.getEntityData().func_74769_h("草药") > 74.0d)) {
            entity.getEntityData().func_74780_a("草药", new Random().nextInt(14));
            if (entity.getEntityData().func_74769_h("草药") == 0.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn61 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao18.block, 1));
                    entityToSpawn61.func_174867_a(10);
                    world.func_72838_d(entityToSpawn61);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn62 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi181.block, 1));
                    entityToSpawn62.func_174867_a(10);
                    world.func_72838_d(entityToSpawn62);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 1.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn63 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao5.block, 1));
                    entityToSpawn63.func_174867_a(10);
                    world.func_72838_d(entityToSpawn63);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn64 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi51.block, 1));
                    entityToSpawn64.func_174867_a(10);
                    world.func_72838_d(entityToSpawn64);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 2.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn65 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao7.block, 1));
                    entityToSpawn65.func_174867_a(10);
                    world.func_72838_d(entityToSpawn65);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn66 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi71.block, 1));
                    entityToSpawn66.func_174867_a(10);
                    world.func_72838_d(entityToSpawn66);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn67 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao6.block, 1));
                    entityToSpawn67.func_174867_a(10);
                    world.func_72838_d(entityToSpawn67);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn68 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi61.block, 1));
                    entityToSpawn68.func_174867_a(10);
                    world.func_72838_d(entityToSpawn68);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn69 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao8.block, 1));
                    entityToSpawn69.func_174867_a(10);
                    world.func_72838_d(entityToSpawn69);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn70 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi81.block, 1));
                    entityToSpawn70.func_174867_a(10);
                    world.func_72838_d(entityToSpawn70);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 5.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn71 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao9.block, 1));
                    entityToSpawn71.func_174867_a(10);
                    world.func_72838_d(entityToSpawn71);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn72 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi91.block, 1));
                    entityToSpawn72.func_174867_a(10);
                    world.func_72838_d(entityToSpawn72);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 6.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn73 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao12.block, 1));
                    entityToSpawn73.func_174867_a(10);
                    world.func_72838_d(entityToSpawn73);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn74 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi121.block, 1));
                    entityToSpawn74.func_174867_a(10);
                    world.func_72838_d(entityToSpawn74);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 7.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn75 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao1.block, 1));
                    entityToSpawn75.func_174867_a(10);
                    world.func_72838_d(entityToSpawn75);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn76 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi11.block, 1));
                    entityToSpawn76.func_174867_a(10);
                    world.func_72838_d(entityToSpawn76);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 8.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn77 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao3.block, 1));
                    entityToSpawn77.func_174867_a(10);
                    world.func_72838_d(entityToSpawn77);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn78 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi31.block, 1));
                    entityToSpawn78.func_174867_a(10);
                    world.func_72838_d(entityToSpawn78);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 9.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn79 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao23.block, 1));
                    entityToSpawn79.func_174867_a(10);
                    world.func_72838_d(entityToSpawn79);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn80 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi231.block, 1));
                    entityToSpawn80.func_174867_a(10);
                    world.func_72838_d(entityToSpawn80);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 10.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn81 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao22.block, 1));
                    entityToSpawn81.func_174867_a(10);
                    world.func_72838_d(entityToSpawn81);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn82 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi221.block, 1));
                    entityToSpawn82.func_174867_a(10);
                    world.func_72838_d(entityToSpawn82);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 11.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn83 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao24.block, 1));
                    entityToSpawn83.func_174867_a(10);
                    world.func_72838_d(entityToSpawn83);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn84 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi241.block, 1));
                    entityToSpawn84.func_174867_a(10);
                    world.func_72838_d(entityToSpawn84);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 12.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn85 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao601.block, 1));
                    entityToSpawn85.func_174867_a(10);
                    world.func_72838_d(entityToSpawn85);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn86 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi251.block, 1));
                    entityToSpawn86.func_174867_a(10);
                    world.func_72838_d(entityToSpawn86);
                    return;
                }
                return;
            } else if (entity.getEntityData().func_74769_h("草药") == 13.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn87 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao21.block, 1));
                    entityToSpawn87.func_174867_a(10);
                    world.func_72838_d(entityToSpawn87);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn88 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi211.block, 1));
                    entityToSpawn88.func_174867_a(10);
                    world.func_72838_d(entityToSpawn88);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (!world.field_72995_K) {
            EntityItem entityToSpawn89 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao1802.block, 1));
            entityToSpawn89.func_174867_a(10);
            world.func_72838_d(entityToSpawn89);
        }
        if (Math.random() <= 0.25d && !world.field_72995_K) {
            EntityItem entityToSpawn90 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi181.block, 1));
            entityToSpawn90.func_174867_a(10);
            world.func_72838_d(entityToSpawn90);
        }
    }
}
