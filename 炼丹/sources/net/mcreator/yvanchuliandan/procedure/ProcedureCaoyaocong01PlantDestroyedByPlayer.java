package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.YvanchuliandanModVariables;
import net.mcreator.yvanchuliandan.item.ItemCailiao31;
import net.mcreator.yvanchuliandan.item.ItemCaoYao02;
import net.mcreator.yvanchuliandan.item.ItemCaoYao101;
import net.mcreator.yvanchuliandan.item.ItemCaoYao201;
import net.mcreator.yvanchuliandan.item.ItemCaoYao301;
import net.mcreator.yvanchuliandan.item.ItemCaoYao32;
import net.mcreator.yvanchuliandan.item.ItemCaoYao33;
import net.mcreator.yvanchuliandan.item.ItemCaoYao401;
import net.mcreator.yvanchuliandan.item.ItemCaoYao501;
import net.mcreator.yvanchuliandan.item.ItemCaoYao601;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1;
import net.mcreator.yvanchuliandan.item.ItemCaoyao12;
import net.mcreator.yvanchuliandan.item.ItemCaoyao18;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1801;
import net.mcreator.yvanchuliandan.item.ItemCaoyao20;
import net.mcreator.yvanchuliandan.item.ItemCaoyao21;
import net.mcreator.yvanchuliandan.item.ItemCaoyao22;
import net.mcreator.yvanchuliandan.item.ItemCaoyao23;
import net.mcreator.yvanchuliandan.item.ItemCaoyao24;
import net.mcreator.yvanchuliandan.item.ItemCaoyao25;
import net.mcreator.yvanchuliandan.item.ItemCaoyao3;
import net.mcreator.yvanchuliandan.item.ItemCaoyao5;
import net.mcreator.yvanchuliandan.item.ItemCaoyao6;
import net.mcreator.yvanchuliandan.item.ItemCaoyao7;
import net.mcreator.yvanchuliandan.item.ItemCaoyao8;
import net.mcreator.yvanchuliandan.item.ItemCaoyao9;
import net.mcreator.yvanchuliandan.item.ItemXiaoLvPing;
import net.mcreator.yvanchuliandan.item.ItemZhongZi11;
import net.mcreator.yvanchuliandan.item.ItemZhongZi121;
import net.mcreator.yvanchuliandan.item.ItemZhongZi181;
import net.mcreator.yvanchuliandan.item.ItemZhongZi201;
import net.mcreator.yvanchuliandan.item.ItemZhongZi211;
import net.mcreator.yvanchuliandan.item.ItemZhongZi221;
import net.mcreator.yvanchuliandan.item.ItemZhongZi231;
import net.mcreator.yvanchuliandan.item.ItemZhongZi241;
import net.mcreator.yvanchuliandan.item.ItemZhongZi251;
import net.mcreator.yvanchuliandan.item.ItemZhongZi261;
import net.mcreator.yvanchuliandan.item.ItemZhongZi31;
import net.mcreator.yvanchuliandan.item.ItemZhongZi51;
import net.mcreator.yvanchuliandan.item.ItemZhongZi61;
import net.mcreator.yvanchuliandan.item.ItemZhongZi71;
import net.mcreator.yvanchuliandan.item.ItemZhongZi81;
import net.mcreator.yvanchuliandan.item.ItemZhongZi91;
import net.mcreator.yvanchuliandan.item.ItemZhongZiHuangLongGuo;
import net.mcreator.yvanchuliandan.item.ItemZhongZiJinHeLan;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureCaoyaocong01PlantDestroyedByPlayer.class */
public class ProcedureCaoyaocong01PlantDestroyedByPlayer extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureCaoyaocong01PlantDestroyedByPlayer(ElementsYvanchuliandanMod instance) {
        super(instance, 274);
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
        if (entity.getEntityData().func_74769_h("草药") > 34.0d && entity.getEntityData().func_74769_h("草药") <= 84.0d) {
            entity.getEntityData().func_74780_a("草药", new Random().nextInt(17));
            if (entity.getEntityData().func_74769_h("草药") == 0.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao18.block, 1));
                    entityToSpawn.func_174867_a(10);
                    world.func_72838_d(entityToSpawn);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn2 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi181.block, 1));
                    entityToSpawn2.func_174867_a(10);
                    world.func_72838_d(entityToSpawn2);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 1.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn3 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao5.block, 1));
                    entityToSpawn3.func_174867_a(10);
                    world.func_72838_d(entityToSpawn3);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn4 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi51.block, 1));
                    entityToSpawn4.func_174867_a(10);
                    world.func_72838_d(entityToSpawn4);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 2.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn5 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCailiao31.block, 1));
                    entityToSpawn5.func_174867_a(10);
                    world.func_72838_d(entityToSpawn5);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn6 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao7.block, 1));
                    entityToSpawn6.func_174867_a(10);
                    world.func_72838_d(entityToSpawn6);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn7 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi71.block, 1));
                    entityToSpawn7.func_174867_a(10);
                    world.func_72838_d(entityToSpawn7);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn8 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao6.block, 1));
                    entityToSpawn8.func_174867_a(10);
                    world.func_72838_d(entityToSpawn8);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn9 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi61.block, 1));
                    entityToSpawn9.func_174867_a(10);
                    world.func_72838_d(entityToSpawn9);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 5.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn10 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao8.block, 1));
                    entityToSpawn10.func_174867_a(10);
                    world.func_72838_d(entityToSpawn10);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn11 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi81.block, 1));
                    entityToSpawn11.func_174867_a(10);
                    world.func_72838_d(entityToSpawn11);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 6.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn12 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao9.block, 1));
                    entityToSpawn12.func_174867_a(10);
                    world.func_72838_d(entityToSpawn12);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn13 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi91.block, 1));
                    entityToSpawn13.func_174867_a(10);
                    world.func_72838_d(entityToSpawn13);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 7.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn14 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao12.block, 1));
                    entityToSpawn14.func_174867_a(10);
                    world.func_72838_d(entityToSpawn14);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn15 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi121.block, 1));
                    entityToSpawn15.func_174867_a(10);
                    world.func_72838_d(entityToSpawn15);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 8.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn16 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao1.block, 1));
                    entityToSpawn16.func_174867_a(10);
                    world.func_72838_d(entityToSpawn16);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn17 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi11.block, 1));
                    entityToSpawn17.func_174867_a(10);
                    world.func_72838_d(entityToSpawn17);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 9.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn18 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao3.block, 1));
                    entityToSpawn18.func_174867_a(10);
                    world.func_72838_d(entityToSpawn18);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn19 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi31.block, 1));
                    entityToSpawn19.func_174867_a(10);
                    world.func_72838_d(entityToSpawn19);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 10.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn20 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao23.block, 1));
                    entityToSpawn20.func_174867_a(10);
                    world.func_72838_d(entityToSpawn20);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn21 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi231.block, 1));
                    entityToSpawn21.func_174867_a(10);
                    world.func_72838_d(entityToSpawn21);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 11.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn22 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao22.block, 1));
                    entityToSpawn22.func_174867_a(10);
                    world.func_72838_d(entityToSpawn22);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn23 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi221.block, 1));
                    entityToSpawn23.func_174867_a(10);
                    world.func_72838_d(entityToSpawn23);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 12.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn24 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao24.block, 1));
                    entityToSpawn24.func_174867_a(10);
                    world.func_72838_d(entityToSpawn24);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn25 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi241.block, 1));
                    entityToSpawn25.func_174867_a(10);
                    world.func_72838_d(entityToSpawn25);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 13.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn26 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao25.block, 1));
                    entityToSpawn26.func_174867_a(10);
                    world.func_72838_d(entityToSpawn26);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn27 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi251.block, 1));
                    entityToSpawn27.func_174867_a(10);
                    world.func_72838_d(entityToSpawn27);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 14.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn28 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao21.block, 1));
                    entityToSpawn28.func_174867_a(10);
                    world.func_72838_d(entityToSpawn28);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn29 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi211.block, 1));
                    entityToSpawn29.func_174867_a(10);
                    world.func_72838_d(entityToSpawn29);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 15.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureCaoyaocong01PlantDestroyedByPlayer.1
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
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn30 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi261.block, 1));
                    entityToSpawn30.func_174867_a(10);
                    world.func_72838_d(entityToSpawn30);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 16.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn31 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao20.block, 1));
                    entityToSpawn31.func_174867_a(10);
                    world.func_72838_d(entityToSpawn31);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn32 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi201.block, 1));
                    entityToSpawn32.func_174867_a(10);
                    world.func_72838_d(entityToSpawn32);
                }
            }
        } else if (entity.getEntityData().func_74769_h("草药") > 9.0d && entity.getEntityData().func_74769_h("草药") <= 34.0d) {
            entity.getEntityData().func_74780_a("草药", new Random().nextInt(9));
            if (entity.getEntityData().func_74769_h("草药") == 0.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn33 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao101.block, 1));
                    entityToSpawn33.func_174867_a(10);
                    world.func_72838_d(entityToSpawn33);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn34 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi11.block, 1));
                    entityToSpawn34.func_174867_a(10);
                    world.func_72838_d(entityToSpawn34);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 1.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn35 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao201.block, 1));
                    entityToSpawn35.func_174867_a(10);
                    world.func_72838_d(entityToSpawn35);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn36 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi31.block, 1));
                    entityToSpawn36.func_174867_a(10);
                    world.func_72838_d(entityToSpawn36);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 2.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn37 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao301.block, 1));
                    entityToSpawn37.func_174867_a(10);
                    world.func_72838_d(entityToSpawn37);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn38 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi231.block, 1));
                    entityToSpawn38.func_174867_a(10);
                    world.func_72838_d(entityToSpawn38);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 3.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn39 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao401.block, 1));
                    entityToSpawn39.func_174867_a(10);
                    world.func_72838_d(entityToSpawn39);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn40 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi221.block, 1));
                    entityToSpawn40.func_174867_a(10);
                    world.func_72838_d(entityToSpawn40);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 4.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn41 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao501.block, 1));
                    entityToSpawn41.func_174867_a(10);
                    world.func_72838_d(entityToSpawn41);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn42 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi241.block, 1));
                    entityToSpawn42.func_174867_a(10);
                    world.func_72838_d(entityToSpawn42);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 5.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn43 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao601.block, 1));
                    entityToSpawn43.func_174867_a(10);
                    world.func_72838_d(entityToSpawn43);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn44 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi251.block, 1));
                    entityToSpawn44.func_174867_a(10);
                    world.func_72838_d(entityToSpawn44);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 6.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn45 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao1801.block, 1));
                    entityToSpawn45.func_174867_a(10);
                    world.func_72838_d(entityToSpawn45);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn46 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi181.block, 1));
                    entityToSpawn46.func_174867_a(10);
                    world.func_72838_d(entityToSpawn46);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 7.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn47 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao32.block, 1));
                    entityToSpawn47.func_174867_a(10);
                    world.func_72838_d(entityToSpawn47);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn48 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZiHuangLongGuo.block, 1));
                    entityToSpawn48.func_174867_a(10);
                    world.func_72838_d(entityToSpawn48);
                }
            } else if (entity.getEntityData().func_74769_h("草药") == 8.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn49 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao33.block, 1));
                    entityToSpawn49.func_174867_a(10);
                    world.func_72838_d(entityToSpawn49);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    EntityItem entityToSpawn50 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZiJinHeLan.block, 1));
                    entityToSpawn50.func_174867_a(10);
                    world.func_72838_d(entityToSpawn50);
                }
            }
        } else if (entity.getEntityData().func_74769_h("草药") <= 9.0d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn51 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoYao02.block, 1));
                entityToSpawn51.func_174867_a(10);
                world.func_72838_d(entityToSpawn51);
            }
        } else {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn52 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemCaoyao18.block, 1));
                entityToSpawn52.func_174867_a(10);
                world.func_72838_d(entityToSpawn52);
            }
            if (Math.random() <= 0.25d && !world.field_72995_K) {
                EntityItem entityToSpawn53 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemZhongZi181.block, 1));
                entityToSpawn53.func_174867_a(10);
                world.func_72838_d(entityToSpawn53);
            }
        }
        if (!YvanchuliandanModVariables.MapVariables.get(world).LittleGreenBottle && Math.random() <= 0.01d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn54 = new EntityItem(world, x + 0.5d, y + 1, z + 0.5d, new ItemStack(ItemXiaoLvPing.block, 1));
                entityToSpawn54.func_174867_a(10);
                world.func_72838_d(entityToSpawn54);
            }
            YvanchuliandanModVariables.MapVariables.get(world).LittleGreenBottle = true;
            YvanchuliandanModVariables.MapVariables.get(world).syncData(world);
        }
    }
}
