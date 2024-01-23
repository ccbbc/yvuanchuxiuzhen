package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemQuKe11;
import net.mcreator.yvanchuxiuzhen.item.ItemQuKe12;
import net.mcreator.yvanchuxiuzhen.item.ItemQuKe13;
import net.mcreator.yvanchuxiuzhen.item.ItemQuKe14;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureQuKeDrop.class */
public class ProcedureQuKeDrop extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQuKeDrop(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 324);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (sourceentity instanceof EntityPlayer) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    if ((sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:kong_ti_fu")) {
                        if ((entity instanceof EntityZombie) || (entity instanceof EntityZombieVillager)) {
                            if (Math.random() <= 0.25d) {
                                if (!world.field_72995_K) {
                                    EntityItem entityToSpawn = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe13.block, 1));
                                    entityToSpawn.func_174867_a(10);
                                    world.func_72838_d(entityToSpawn);
                                }
                                (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                            } else if (Math.random() <= 0.25d) {
                                if (!world.field_72995_K) {
                                    EntityItem entityToSpawn2 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe14.block, 1));
                                    entityToSpawn2.func_174867_a(10);
                                    world.func_72838_d(entityToSpawn2);
                                }
                                (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                            }
                        }
                        if (entity instanceof EntityVillager) {
                            if (Math.random() <= 0.05d) {
                                if (!world.field_72995_K) {
                                    EntityItem entityToSpawn3 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe11.block, 1));
                                    entityToSpawn3.func_174867_a(10);
                                    world.func_72838_d(entityToSpawn3);
                                }
                                (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                            } else if (Math.random() <= 0.05d) {
                                if (!world.field_72995_K) {
                                    EntityItem entityToSpawn4 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe12.block, 1));
                                    entityToSpawn4.func_174867_a(10);
                                    world.func_72838_d(entityToSpawn4);
                                }
                                (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                            }
                        }
                        if (entity.func_145748_c_().func_150260_c().contains("散修")) {
                            if (entity.func_145748_c_().func_150260_c().contains("炼气")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn5 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe11.block, 1));
                                            entityToSpawn5.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn5);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn6 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe12.block, 1));
                                        entityToSpawn6.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn6);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("筑基")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn7 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe12.block, 1));
                                            entityToSpawn7.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn7);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn8 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe13.block, 1));
                                        entityToSpawn8.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn8);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("结丹")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn9 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe11.block, 1));
                                            entityToSpawn9.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn9);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn10 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe12.block, 1));
                                        entityToSpawn10.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn10);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("元婴")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn11 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe11.block, 1));
                                            entityToSpawn11.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn11);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn12 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe12.block, 1));
                                        entityToSpawn12.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn12);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("化神")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn13 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe11.block, 1));
                                            entityToSpawn13.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn13);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn14 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe12.block, 1));
                                        entityToSpawn14.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn14);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            }
                        } else if (entity.func_145748_c_().func_150260_c().contains("魔修")) {
                            if (entity.func_145748_c_().func_150260_c().contains("炼气")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn15 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe13.block, 1));
                                            entityToSpawn15.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn15);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn16 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe14.block, 1));
                                        entityToSpawn16.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn16);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("筑基")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn17 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe13.block, 1));
                                            entityToSpawn17.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn17);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn18 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe14.block, 1));
                                        entityToSpawn18.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn18);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("结丹")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn19 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe13.block, 1));
                                            entityToSpawn19.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn19);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn20 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe14.block, 1));
                                        entityToSpawn20.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn20);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("元婴")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn21 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe13.block, 1));
                                            entityToSpawn21.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn21);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn22 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe14.block, 1));
                                        entityToSpawn22.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn22);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            } else if (entity.func_145748_c_().func_150260_c().contains("化神")) {
                                if (entity.getEntityData().func_74769_h("Sex") == 1.0d) {
                                    if (Math.random() <= 0.25d) {
                                        if (!world.field_72995_K) {
                                            EntityItem entityToSpawn23 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe13.block, 1));
                                            entityToSpawn23.func_174867_a(10);
                                            world.func_72838_d(entityToSpawn23);
                                        }
                                        (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                    }
                                } else if (Math.random() <= 0.25d) {
                                    if (!world.field_72995_K) {
                                        EntityItem entityToSpawn24 = new EntityItem(world, x, y + 2, z, new ItemStack(ItemQuKe14.block, 1));
                                        entityToSpawn24.func_174867_a(10);
                                        world.func_72838_d(entityToSpawn24);
                                    }
                                    (sourceentity instanceof EntityLivingBase ? ((EntityLivingBase) sourceentity).func_184592_cb() : ItemStack.field_190927_a).func_190918_g(1);
                                }
                            }
                        }
                    }
                }
            }, 25L, TimeUnit.MILLISECONDS);
        }
    }

    @SubscribeEvent
    public void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            float amount = event.getAmount();
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("amount", Float.valueOf(amount));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            dependencies.put("sourceentity", event.getSource().func_76346_g());
            dependencies.put("imediatesourceentity", event.getSource().func_76364_f());
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
