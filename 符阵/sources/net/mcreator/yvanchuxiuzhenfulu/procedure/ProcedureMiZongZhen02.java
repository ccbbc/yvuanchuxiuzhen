package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureMiZongZhen02.class */
public class ProcedureMiZongZhen02 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureMiZongZhen02(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 373);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$5] */
    /* JADX WARN: Type inference failed for: r1v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$3] */
    /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$7] */
    /* JADX WARN: Type inference failed for: r3v9, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02$8] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (!entityLivingBase.func_189512_bd().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.1
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.2
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.3
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.4
            public String getText() {
                String param = (String) cmdparams.get("4");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.5
            public String getText() {
                String param = (String) cmdparams.get("5");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.6
            public String getText() {
                String param = (String) cmdparams.get("6");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 40, 4));
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76440_q, 40, 4));
            }
            entityLivingBase.getEntityData().func_74780_a("ZhenFaTime5", entityLivingBase.getEntityData().func_74769_h("ZhenFaTime5") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("ZhenFaTime5") >= 20.0d) {
                entityLivingBase.getEntityData().func_74780_a("BePoisonAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.7
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureMiZongZhen02.8
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
                entityLivingBase.getEntityData().func_74780_a("ZhenFaTime5", 0.0d);
            }
        }
    }
}
