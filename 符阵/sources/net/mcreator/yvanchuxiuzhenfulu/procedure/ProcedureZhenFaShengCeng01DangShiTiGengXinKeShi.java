package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaShengCeng01DangShiTiGengXinKeShi.class */
public class ProcedureZhenFaShengCeng01DangShiTiGengXinKeShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaShengCeng01DangShiTiGengXinKeShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 412);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        Object world = (World) dependencies.get("world");
        entity.getEntityData().func_74780_a("存活时间", entity.getEntityData().func_74769_h("存活时间") + 1.0d);
        if (entity.getEntityData().func_74769_h("存活时间") >= 2.0d) {
            if (entity.getEntityData().func_74779_i("命令").equals("1")) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLuoLeiZhen0.executeProcedure($_dependencies);
            } else if (entity.getEntityData().func_74779_i("命令").equals("2")) {
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", world);
                ProcedureLieKongZhen0.executeProcedure($_dependencies2);
            } else if (entity.getEntityData().func_74779_i("命令").equals("3")) {
                Map<String, Object> $_dependencies3 = new HashMap<>();
                $_dependencies3.put("x", Integer.valueOf(x));
                $_dependencies3.put("y", Integer.valueOf(y));
                $_dependencies3.put("z", Integer.valueOf(z));
                $_dependencies3.put("world", world);
                ProcedureChenHuiZhen0.executeProcedure($_dependencies3);
            } else if (entity.getEntityData().func_74779_i("命令").equals("4")) {
                Map<String, Object> $_dependencies4 = new HashMap<>();
                $_dependencies4.put("x", Integer.valueOf(x));
                $_dependencies4.put("y", Integer.valueOf(y));
                $_dependencies4.put("z", Integer.valueOf(z));
                $_dependencies4.put("world", world);
                ProcedureHuiLingZhen0.executeProcedure($_dependencies4);
            } else if (entity.getEntityData().func_74779_i("命令").equals("5")) {
                Map<String, Object> $_dependencies5 = new HashMap<>();
                $_dependencies5.put("x", Integer.valueOf(x));
                $_dependencies5.put("y", Integer.valueOf(y));
                $_dependencies5.put("z", Integer.valueOf(z));
                $_dependencies5.put("world", world);
                ProcedureMiZongZhen0.executeProcedure($_dependencies5);
            } else if (entity.getEntityData().func_74779_i("命令").equals("6")) {
                Map<String, Object> $_dependencies6 = new HashMap<>();
                $_dependencies6.put("x", Integer.valueOf(x));
                $_dependencies6.put("y", Integer.valueOf(y));
                $_dependencies6.put("z", Integer.valueOf(z));
                $_dependencies6.put("world", world);
                ProcedureTianHuZhen0.executeProcedure($_dependencies6);
            } else if (entity.getEntityData().func_74779_i("命令").equals("7")) {
                Map<String, Object> $_dependencies7 = new HashMap<>();
                $_dependencies7.put("x", Integer.valueOf(x));
                $_dependencies7.put("y", Integer.valueOf(y));
                $_dependencies7.put("z", Integer.valueOf(z));
                $_dependencies7.put("world", world);
                ProcedureJinJueZhen0.executeProcedure($_dependencies7);
            } else if (entity.getEntityData().func_74779_i("命令").equals("8")) {
                Map<String, Object> $_dependencies8 = new HashMap<>();
                $_dependencies8.put("x", Integer.valueOf(x));
                $_dependencies8.put("y", Integer.valueOf(y));
                $_dependencies8.put("z", Integer.valueOf(z));
                $_dependencies8.put("world", world);
                ProcedureXiuLianZhen0.executeProcedure($_dependencies8);
            } else if (entity.getEntityData().func_74779_i("命令").equals("9")) {
                Map<String, Object> $_dependencies9 = new HashMap<>();
                $_dependencies9.put("x", Integer.valueOf(x));
                $_dependencies9.put("y", Integer.valueOf(y));
                $_dependencies9.put("z", Integer.valueOf(z));
                $_dependencies9.put("world", world);
                ProcedureDaXiuLianZhen0.executeProcedure($_dependencies9);
            } else if (entity.getEntityData().func_74779_i("命令").equals("10")) {
                Map<String, Object> $_dependencies10 = new HashMap<>();
                $_dependencies10.put("x", Integer.valueOf(x));
                $_dependencies10.put("y", Integer.valueOf(y));
                $_dependencies10.put("z", Integer.valueOf(z));
                $_dependencies10.put("world", world);
                ProcedureShouJiaZhen0.executeProcedure($_dependencies10);
            } else if (entity.getEntityData().func_74779_i("命令").equals("11")) {
                Map<String, Object> $_dependencies11 = new HashMap<>();
                $_dependencies11.put("x", Integer.valueOf(x));
                $_dependencies11.put("y", Integer.valueOf(y));
                $_dependencies11.put("z", Integer.valueOf(z));
                $_dependencies11.put("world", world);
                ProcedureYuanShuiZhen0.executeProcedure($_dependencies11);
            } else if (entity.getEntityData().func_74779_i("命令").equals("12")) {
                Map<String, Object> $_dependencies12 = new HashMap<>();
                $_dependencies12.put("x", Integer.valueOf(x));
                $_dependencies12.put("y", Integer.valueOf(y));
                $_dependencies12.put("z", Integer.valueOf(z));
                $_dependencies12.put("world", world);
                ProcedureWeiHuoZhen0.executeProcedure($_dependencies12);
            } else if (entity.getEntityData().func_74779_i("命令").equals("13")) {
                Map<String, Object> $_dependencies13 = new HashMap<>();
                $_dependencies13.put("x", Integer.valueOf(x));
                $_dependencies13.put("y", Integer.valueOf(y));
                $_dependencies13.put("z", Integer.valueOf(z));
                $_dependencies13.put("world", world);
                ProcedureXinDingZhen0.executeProcedure($_dependencies13);
            } else if (entity.getEntityData().func_74779_i("命令").equals("14")) {
                Map<String, Object> $_dependencies14 = new HashMap<>();
                $_dependencies14.put("x", Integer.valueOf(x));
                $_dependencies14.put("y", Integer.valueOf(y));
                $_dependencies14.put("z", Integer.valueOf(z));
                $_dependencies14.put("world", world);
                ProcedureWanXiangZhen0.executeProcedure($_dependencies14);
            } else if (entity.getEntityData().func_74779_i("命令").equals("15")) {
                Map<String, Object> $_dependencies15 = new HashMap<>();
                $_dependencies15.put("x", Integer.valueOf(x));
                $_dependencies15.put("y", Integer.valueOf(y));
                $_dependencies15.put("z", Integer.valueOf(z));
                $_dependencies15.put("world", world);
                ProcedureYiYiShuiJianZhen0.executeProcedure($_dependencies15);
            } else if (entity.getEntityData().func_74779_i("命令").equals("16")) {
                Map<String, Object> $_dependencies16 = new HashMap<>();
                $_dependencies16.put("x", Integer.valueOf(x));
                $_dependencies16.put("y", Integer.valueOf(y));
                $_dependencies16.put("z", Integer.valueOf(z));
                $_dependencies16.put("world", world);
                ProcedureChiHunLianYuZhen0.executeProcedure($_dependencies16);
            } else if (entity.getEntityData().func_74779_i("命令").equals("17")) {
                Map<String, Object> $_dependencies17 = new HashMap<>();
                $_dependencies17.put("x", Integer.valueOf(x));
                $_dependencies17.put("y", Integer.valueOf(y));
                $_dependencies17.put("z", Integer.valueOf(z));
                $_dependencies17.put("world", world);
                ProcedureDianDaoWuXing0.executeProcedure($_dependencies17);
            }
            entity.field_70170_p.func_72900_e(entity);
        }
    }
}
