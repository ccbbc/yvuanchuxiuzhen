package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureHanDiChui.class */
public class ProcedureHanDiChui extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHanDiChui(ElementsFabaokuozhanMod instance) {
        super(instance, 312);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$19] */
    /* JADX WARN: Type inference failed for: r3v10, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$25] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$20] */
    /* JADX WARN: Type inference failed for: r4v10, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$26] */
    /* JADX WARN: Type inference failed for: r4v12, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$27] */
    /* JADX WARN: Type inference failed for: r4v16, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$4] */
    /* JADX WARN: Type inference failed for: r4v18, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$5] */
    /* JADX WARN: Type inference failed for: r4v3, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$21] */
    /* JADX WARN: Type inference failed for: r4v5, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$7] */
    /* JADX WARN: Type inference failed for: r5v14, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$28] */
    /* JADX WARN: Type inference failed for: r5v16, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$29] */
    /* JADX WARN: Type inference failed for: r5v2, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$22] */
    /* JADX WARN: Type inference failed for: r5v21, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$6] */
    /* JADX WARN: Type inference failed for: r5v4, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$23] */
    /* JADX WARN: Type inference failed for: r5v7, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$8] */
    /* JADX WARN: Type inference failed for: r5v9, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$9] */
    /* JADX WARN: Type inference failed for: r6v11, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$13] */
    /* JADX WARN: Type inference failed for: r6v16, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$30] */
    /* JADX WARN: Type inference failed for: r6v3, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$24] */
    /* JADX WARN: Type inference failed for: r6v7, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$10] */
    /* JADX WARN: Type inference failed for: r6v9, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$11] */
    /* JADX WARN: Type inference failed for: r7v10, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$15] */
    /* JADX WARN: Type inference failed for: r7v5, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$12] */
    /* JADX WARN: Type inference failed for: r7v8, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$14] */
    /* JADX WARN: Type inference failed for: r8v5, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$16] */
    /* JADX WARN: Type inference failed for: r8v7, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$17] */
    /* JADX WARN: Type inference failed for: r9v4, types: [net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui$18] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("cmdparams") == null || dependencies.get("world") == null) {
            return;
        }
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.1
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.2
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.3
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.4
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.5
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.6
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()), 3, 0.5d, 0.5d, 0.5d, 0.1d, new int[0]);
        }
        worldServer.func_180495_p(new BlockPos(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.19
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.20
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.21
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.22
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.23
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.24
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()))).func_177230_c().func_176226_b(worldServer, new BlockPos(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.7
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.8
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.9
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.10
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.11
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.12
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())), worldServer.func_180495_p(new BlockPos(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.13
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.14
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.15
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.16
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.17
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.18
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()))), 1);
        worldServer.func_175698_g(new BlockPos(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.25
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.26
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.27
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.28
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()), new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.29
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureHanDiChui.30
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())));
    }
}
