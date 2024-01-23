package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureXiaoJingJieNameSet2.class */
public class ProcedureXiaoJingJieNameSet2 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXiaoJingJieNameSet2(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 276);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 8640.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 48.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 1000.0d);
                entity.getEntityData().func_74780_a("BaseMax", 112500.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("BaseMax", 172500.0d);
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 108.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 54.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 1080.0d);
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 108.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 54.0d);
                entity.getEntityData().func_74780_a("ShenShi", entity.getEntityData().func_74769_h("ShenShi") + 500.0d);
            }
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 6.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 34560.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 192.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 3000.0d);
                entity.getEntityData().func_74780_a("BaseMax", 883200.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("BaseMax", 1344000.0d);
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 432.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 216.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 4320.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 432.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 216.0d);
            }
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 7.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 138240.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 768.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 5000.0d);
                entity.getEntityData().func_74780_a("BaseMax", 6144000.0d);
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("BaseMax", 9093120.0d);
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 1728.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 864.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 17280.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 1728.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 864.0d);
            }
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 8.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 552960.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 3072.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 10000.0d);
                entity.getEntityData().func_74780_a("BaseMax", 5.80608E7d);
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("BaseMax", 8.38656E7d);
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 6912.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 3456.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 69120.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 6912.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 3456.0d);
            }
        }
        $_dependencies.put("entity", entity);
        ProcedureXiaoJingJieNameSet3.executeProcedure($_dependencies);
    }
}
