package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.block.BlockFangkuailingshi03;
import net.mcreator.yvanchuxiuzhen.block.BlockFangkuailingshi05;
import net.mcreator.yvanchuxiuzhen.item.ItemFabao28;
import net.minecraft.command.ICommandSender;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureLingShiBreakAdd.class */
public class ProcedureLingShiBreakAdd extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLingShiBreakAdd(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 479);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao28.block, 1).func_77973_b()) {
            if (EnchantmentHelper.func_77506_a(Enchantments.field_185306_r, entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a) == 0) {
                if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuailingshi03.block.func_176223_P().func_177230_c()) {
                    entityLivingBase.getEntityData().func_74780_a("CaiShiXp", entityLivingBase.getEntityData().func_74769_h("CaiShiXp") + 1.0d);
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureLingShiBreakAdd.1
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
                        }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(8)) + "b,Damage:0s}}");
                    }
                    if (entityLivingBase.getEntityData().func_74769_h("CaiShi") >= 1.0d && Math.random() <= 0.1d * entityLivingBase.getEntityData().func_74769_h("CaiShi")) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") + ((entityLivingBase.getEntityData().func_74769_h("CaiShi") + 1.0d) * 10.0d));
                        if (!world.field_72995_K && world.func_73046_m() != null) {
                            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureLingShiBreakAdd.2
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
                            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(8) + 1) + "b,Damage:0s}}");
                        }
                    }
                } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuailingshi05.block.func_176223_P().func_177230_c()) {
                    entityLivingBase.getEntityData().func_74780_a("CaiShiXp", entityLivingBase.getEntityData().func_74769_h("CaiShiXp") + 10.0d);
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureLingShiBreakAdd.3
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
                        }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(8)) + "b,Damage:0s}}");
                    }
                    if (entityLivingBase.getEntityData().func_74769_h("CaiShi") >= 1.0d && Math.random() <= 0.1d * entityLivingBase.getEntityData().func_74769_h("CaiShi")) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") + ((entityLivingBase.getEntityData().func_74769_h("CaiShi") + 1.0d) * 100.0d));
                        if (!world.field_72995_K && world.func_73046_m() != null) {
                            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureLingShiBreakAdd.4
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
                            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(8) + 1) + "b,Damage:0s}}");
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("xpAmount", Integer.valueOf(event.getExpToDrop()));
        dependencies.put("x", Integer.valueOf(event.getPos().func_177958_n()));
        dependencies.put("y", Integer.valueOf(event.getPos().func_177956_o()));
        dependencies.put("z", Integer.valueOf(event.getPos().func_177952_p()));
        dependencies.put("px", Integer.valueOf((int) ((Entity) player).field_70165_t));
        dependencies.put("py", Integer.valueOf((int) ((Entity) player).field_70163_u));
        dependencies.put("pz", Integer.valueOf((int) ((Entity) player).field_70161_v));
        dependencies.put("world", event.getWorld());
        dependencies.put("entity", player);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
