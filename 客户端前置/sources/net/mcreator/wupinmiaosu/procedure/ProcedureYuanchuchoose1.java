package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiGui1;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureYuanchuchoose1.class */
public class ProcedureYuanchuchoose1 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureYuanchuchoose1(ElementsWupinmiaosuMod instance) {
        super(instance, 80);
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$2] */
    /* JADX WARN: Type inference failed for: r0v117, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$3] */
    /* JADX WARN: Type inference failed for: r0v120, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$4] */
    /* JADX WARN: Type inference failed for: r0v123, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$5] */
    /* JADX WARN: Type inference failed for: r0v126, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$6] */
    /* JADX WARN: Type inference failed for: r0v129, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$7] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$1] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$8] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$9] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$10] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$11] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$12] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1$13] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("yuanchuchoose") != 1) {
            if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.2
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("jd")) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureJianDanMoShi.executeProcedure($_dependencies);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.3
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("zj")) {
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("entity", entityPlayer);
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", world);
                ProcedureZhuJueMoShi.executeProcedure($_dependencies2);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.4
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("kn")) {
                Map<String, Object> $_dependencies3 = new HashMap<>();
                $_dependencies3.put("entity", entityPlayer);
                ProcedureKunNanMoShi.executeProcedure($_dependencies3);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.5
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("jn")) {
                Map<String, Object> $_dependencies4 = new HashMap<>();
                $_dependencies4.put("entity", entityPlayer);
                ProcedureJiNanMoShi.executeProcedure($_dependencies4);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.6
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("sj")) {
                Map<String, Object> $_dependencies5 = new HashMap<>();
                $_dependencies5.put("entity", entityPlayer);
                ProcedureSuiJi.executeProcedure($_dependencies5);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.7
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("sqn")) {
                Map<String, Object> $_dependencies6 = new HashMap<>();
                $_dependencies6.put("entity", entityPlayer);
                $_dependencies6.put("x", Integer.valueOf(x));
                $_dependencies6.put("y", Integer.valueOf(y));
                $_dependencies6.put("z", Integer.valueOf(z));
                $_dependencies6.put("world", world);
                ProcedureSanQianNian.executeProcedure($_dependencies6);
            } else if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.openGui(WupinmiaosuMod.instance, GuiGui1.GUIID, world, x, y, z);
            }
        } else if (entityPlayer.func_70003_b(4, "")) {
            if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.8
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("jd")) {
                Map<String, Object> $_dependencies7 = new HashMap<>();
                $_dependencies7.put("entity", entityPlayer);
                $_dependencies7.put("x", Integer.valueOf(x));
                $_dependencies7.put("y", Integer.valueOf(y));
                $_dependencies7.put("z", Integer.valueOf(z));
                $_dependencies7.put("world", world);
                ProcedureJianDanMoShi.executeProcedure($_dependencies7);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.9
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("zj")) {
                Map<String, Object> $_dependencies8 = new HashMap<>();
                $_dependencies8.put("entity", entityPlayer);
                $_dependencies8.put("x", Integer.valueOf(x));
                $_dependencies8.put("y", Integer.valueOf(y));
                $_dependencies8.put("z", Integer.valueOf(z));
                $_dependencies8.put("world", world);
                ProcedureZhuJueMoShi.executeProcedure($_dependencies8);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.10
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("kn")) {
                Map<String, Object> $_dependencies9 = new HashMap<>();
                $_dependencies9.put("entity", entityPlayer);
                ProcedureKunNanMoShi.executeProcedure($_dependencies9);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.11
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("jn")) {
                Map<String, Object> $_dependencies10 = new HashMap<>();
                $_dependencies10.put("entity", entityPlayer);
                ProcedureJiNanMoShi.executeProcedure($_dependencies10);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.12
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("sj")) {
                Map<String, Object> $_dependencies11 = new HashMap<>();
                $_dependencies11.put("entity", entityPlayer);
                ProcedureSuiJi.executeProcedure($_dependencies11);
            } else if (new Object() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureYuanchuchoose1.13
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("sqn")) {
                Map<String, Object> $_dependencies12 = new HashMap<>();
                $_dependencies12.put("entity", entityPlayer);
                $_dependencies12.put("x", Integer.valueOf(x));
                $_dependencies12.put("y", Integer.valueOf(y));
                $_dependencies12.put("z", Integer.valueOf(z));
                $_dependencies12.put("world", world);
                ProcedureSanQianNian.executeProcedure($_dependencies12);
            } else if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.openGui(WupinmiaosuMod.instance, GuiGui1.GUIID, world, x, y, z);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("无权访问！"), false);
        }
    }
}
