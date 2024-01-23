package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureItemnbtsetDo.class */
public class ProcedureItemnbtsetDo extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureItemnbtsetDo(ElementsYvanchujiguanMod instance) {
        super(instance, 146);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$1] */
    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$20] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$27] */
    /* JADX WARN: Type inference failed for: r0v118, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$28] */
    /* JADX WARN: Type inference failed for: r0v121, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$2] */
    /* JADX WARN: Type inference failed for: r0v124, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$3] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$4] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$7] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$8] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$12] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$13] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$5] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$6] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$18] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$21] */
    /* JADX WARN: Type inference failed for: r0v76, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$22] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$24] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$25] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$19] */
    /* JADX WARN: Type inference failed for: r1v10, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$9] */
    /* JADX WARN: Type inference failed for: r1v17, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$17] */
    /* JADX WARN: Type inference failed for: r1v30, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$23] */
    /* JADX WARN: Type inference failed for: r1v37, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$26] */
    /* JADX WARN: Type inference failed for: r1v48, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$29] */
    /* JADX WARN: Type inference failed for: r2v4, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$10] */
    /* JADX WARN: Type inference failed for: r2v50, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$30] */
    /* JADX WARN: Type inference failed for: r3v17, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$32] */
    /* JADX WARN: Type inference failed for: r3v2, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$11] */
    /* JADX WARN: Type inference failed for: r3v22, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$33] */
    /* JADX WARN: Type inference failed for: r3v27, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$34] */
    /* JADX WARN: Type inference failed for: r3v32, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$35] */
    /* JADX WARN: Type inference failed for: r3v37, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$36] */
    /* JADX WARN: Type inference failed for: r3v5, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$15] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$14] */
    /* JADX WARN: Type inference failed for: r4v2, types: [net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo$16] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("@p") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.2
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("@s") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.3
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals(entityLivingBase.func_145748_c_().func_150260_c())) {
            if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.4
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("number") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.5
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("num") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.6
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("n")) {
                if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.7
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("set") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.8
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("s")) {
                    ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    _stack.func_77978_p().func_74780_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.9
                        public String getText() {
                            String param = (String) cmdparams.get("3");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText(), new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.10
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.11
                        public String getText() {
                            String param = (String) cmdparams.get("4");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()));
                } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.12
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("add") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.13
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("a")) {
                    ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack2.func_77942_o()) {
                        _stack2.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p = _stack2.func_77978_p();
                    String text = new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.17
                        public String getText() {
                            String param = (String) cmdparams.get("3");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.14
                            public String getText() {
                                String param = (String) cmdparams.get("3");
                                if (param != null) {
                                    return param;
                                }
                                return "";
                            }
                        }.getText());
                    } else {
                        d = -1.0d;
                    }
                    func_77978_p.func_74780_a(text, d + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.15
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.16
                        public String getText() {
                            String param = (String) cmdparams.get("4");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()));
                }
            } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.18
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("boolean") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.19
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("bool") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.20
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("b")) {
                if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.21
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("true") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.22
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("t")) {
                    ItemStack _stack3 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack3.func_77942_o()) {
                        _stack3.func_77982_d(new NBTTagCompound());
                    }
                    _stack3.func_77978_p().func_74757_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.23
                        public String getText() {
                            String param = (String) cmdparams.get("2");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText(), true);
                } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.24
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("false") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.25
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("f")) {
                    ItemStack _stack4 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack4.func_77942_o()) {
                        _stack4.func_77982_d(new NBTTagCompound());
                    }
                    _stack4.func_77978_p().func_74757_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.26
                        public String getText() {
                            String param = (String) cmdparams.get("2");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText(), false);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.27
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("text") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.28
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("t")) {
                ItemStack _stack5 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack5.func_77942_o()) {
                    _stack5.func_77982_d(new NBTTagCompound());
                }
                _stack5.func_77978_p().func_74778_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.29
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText(), new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.30
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText());
            }
        } else if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
            ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.31
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entityLivingBase.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entityLivingBase.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entityLivingBase.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entityLivingBase;
                }
            }, "execute " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.32
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " ~ ~ ~ itemnbtset @p " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.33
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.34
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.35
                public String getText() {
                    String param = (String) cmdparams.get("3");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureItemnbtsetDo.36
                public String getText() {
                    String param = (String) cmdparams.get("4");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText());
        }
    }
}
