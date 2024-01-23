package net.mcreator.yuanchujianzhu.procedure;

import java.util.Collection;
import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.potion.PotionShouHuangShangHaiBuff;
import net.mcreator.yuanchujianzhu.potion.PotionYingBingShangHaiBuff;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureDongFuTiShi44.class */
public class ProcedureDongFuTiShi44 extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureDongFuTiShi44(ElementsYuanchujianzhuMod instance) {
        super(instance, 177);
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44$2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuyaoshou:breaking_cone"), 1))) {
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.1
                boolean check() {
                    if (entityPlayer instanceof EntityLivingBase) {
                        Collection<PotionEffect> effects = entityPlayer.func_70651_bq();
                        for (PotionEffect effect : effects) {
                            if (effect.func_188419_a() == PotionYingBingShangHaiBuff.potion) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                }
            }.check() || new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.2
                boolean check() {
                    if (entityPlayer instanceof EntityLivingBase) {
                        Collection<PotionEffect> effects = entityPlayer.func_70651_bq();
                        for (PotionEffect effect : effects) {
                            if (effect.func_188419_a() == PotionShouHuangShangHaiBuff.potion) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                }
            }.check()) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                    if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.3
                            public String func_70005_c_() {
                                return "";
                            }

                            public boolean func_70003_b(int permission, String command) {
                                return true;
                            }

                            public World func_130014_f_() {
                                return entityPlayer.field_70170_p;
                            }

                            public MinecraftServer func_184102_h() {
                                return entityPlayer.field_70170_p.func_73046_m();
                            }

                            public boolean func_174792_t_() {
                                return false;
                            }

                            public BlockPos func_180425_c() {
                                return entityPlayer.func_180425_c();
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                            }

                            public Entity func_174793_f() {
                                return entityPlayer;
                            }
                        }, "title @s actionbar [{\"text\":\"此处有恐怖妖兽威压，妖兽无法抵挡！\",\"color\":\"red\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                    if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                        ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.4
                            public String func_70005_c_() {
                                return "";
                            }

                            public boolean func_70003_b(int permission, String command) {
                                return true;
                            }

                            public World func_130014_f_() {
                                return entityPlayer.field_70170_p;
                            }

                            public MinecraftServer func_184102_h() {
                                return entityPlayer.field_70170_p.func_73046_m();
                            }

                            public boolean func_174792_t_() {
                                return false;
                            }

                            public BlockPos func_180425_c() {
                                return entityPlayer.func_180425_c();
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                            }

                            public Entity func_174793_f() {
                                return entityPlayer;
                            }
                        }, "title @s actionbar [{\"text\":\"此处有强大妖兽威压，妖兽难以抵挡！\",\"color\":\"red\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.5
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "title @s actionbar [{\"text\":\"此处有阵阵妖兽威压，妖兽似有威胁！\",\"color\":\"red\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.6
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "title @s actionbar [{\"text\":\"此处有阵法结界保护，阵法威力极为恐怖！\",\"color\":\"red\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.7
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "title @s actionbar [{\"text\":\"此处有阵法结界保护，阵法威力难以抵挡！\",\"color\":\"red\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi44.8
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityPlayer.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityPlayer.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityPlayer.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityPlayer;
                    }
                }, "title @s actionbar [{\"text\":\"此处有阵法结界保护，阵法威力似有威胁！\",\"color\":\"red\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
            }
        }
    }
}
