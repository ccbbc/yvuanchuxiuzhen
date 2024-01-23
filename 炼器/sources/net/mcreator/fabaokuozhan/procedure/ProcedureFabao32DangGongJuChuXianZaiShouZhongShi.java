package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao32DangGongJuChuXianZaiShouZhongShi.class */
public class ProcedureFabao32DangGongJuChuXianZaiShouZhongShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao32DangGongJuChuXianZaiShouZhongShi(ElementsFabaokuozhanMod instance) {
        super(instance, 543);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74778_a("FaBaoMiaoShu2", "法宝");
        entity.getEntityData().func_74778_a("FaBaoMiaoShu3", "副手67物防");
        entity.getEntityData().func_74778_a("FaBaoMiaoShu4", "副手持有时每5秒抵挡一次攻击(1600灵力)");
        entity.getEntityData().func_74778_a("FaBaoMiaoShu5", "右键获得2秒抗性4效果");
        entity.getEntityData().func_74778_a("FaBaoMiaoShu6", "消耗150真元3600灵力");
    }
}
