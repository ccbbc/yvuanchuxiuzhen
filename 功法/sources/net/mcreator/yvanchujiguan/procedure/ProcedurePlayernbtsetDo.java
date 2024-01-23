package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedurePlayernbtsetDo.class */
public class ProcedurePlayernbtsetDo extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayernbtsetDo(ElementsYvanchujiguanMod instance) {
        super(instance, 137);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$4] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$7] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$8] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$12] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$13] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$5] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$6] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$18] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$21] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$22] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$24] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$25] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$19] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$20] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$27] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$28] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$2] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$3] */
    /* JADX WARN: Type inference failed for: r1v10, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$9] */
    /* JADX WARN: Type inference failed for: r1v16, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$17] */
    /* JADX WARN: Type inference failed for: r1v28, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$23] */
    /* JADX WARN: Type inference failed for: r1v34, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$26] */
    /* JADX WARN: Type inference failed for: r1v44, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$29] */
    /* JADX WARN: Type inference failed for: r2v30, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$30] */
    /* JADX WARN: Type inference failed for: r2v4, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$10] */
    /* JADX WARN: Type inference failed for: r3v17, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$32] */
    /* JADX WARN: Type inference failed for: r3v2, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$11] */
    /* JADX WARN: Type inference failed for: r3v22, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$33] */
    /* JADX WARN: Type inference failed for: r3v27, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$34] */
    /* JADX WARN: Type inference failed for: r3v32, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$35] */
    /* JADX WARN: Type inference failed for: r3v37, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$36] */
    /* JADX WARN: Type inference failed for: r3v5, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$14] */
    /* JADX WARN: Type inference failed for: r3v7, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$15] */
    /* JADX WARN: Type inference failed for: r4v3, types: [net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo$16] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("@p") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.2
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("@s") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.3
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals(entity.func_145748_c_().func_150260_c())) {
            if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.4
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("number") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.5
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("num") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.6
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("n")) {
                if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.7
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("set") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.8
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("s")) {
                    entity.getEntityData().func_74780_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.9
                        public String getText() {
                            String param = (String) cmdparams.get("3");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText(), new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.10
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.11
                        public String getText() {
                            String param = (String) cmdparams.get("4");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()));
                } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.12
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("add") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.13
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("a")) {
                    entity.getEntityData().func_74780_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.17
                        public String getText() {
                            String param = (String) cmdparams.get("3");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText(), entity.getEntityData().func_74769_h(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.14
                        public String getText() {
                            String param = (String) cmdparams.get("3");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.15
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.16
                        public String getText() {
                            String param = (String) cmdparams.get("4");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()));
                }
            } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.18
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("boolean") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.19
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("bool") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.20
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("b")) {
                if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.21
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("true") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.22
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("t")) {
                    entity.getEntityData().func_74757_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.23
                        public String getText() {
                            String param = (String) cmdparams.get("2");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText(), true);
                } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.24
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("false") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.25
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("f")) {
                    entity.getEntityData().func_74757_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.26
                        public String getText() {
                            String param = (String) cmdparams.get("2");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText(), false);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.27
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("text") || new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.28
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("t")) {
                entity.getEntityData().func_74778_a(new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.29
                    public String getText() {
                        String param = (String) cmdparams.get("2");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText(), new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.30
                    public String getText() {
                        String param = (String) cmdparams.get("3");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText());
            }
        } else if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
            entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.31
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entity.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entity.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entity.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entity;
                }
            }, "execute " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.32
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " ~ ~ ~ playernbtset @p " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.33
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.34
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.35
                public String getText() {
                    String param = (String) cmdparams.get("3");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText() + " " + new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedurePlayernbtsetDo.36
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
