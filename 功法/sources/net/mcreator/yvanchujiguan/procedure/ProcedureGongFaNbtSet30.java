package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaNbtSet30.class */
public class ProcedureGongFaNbtSet30 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaNbtSet30(ElementsYvanchujiguanMod instance) {
        super(instance, 253);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74779_i("GongFa名暂存").equals("30")) {
            entity.getEntityData().func_74778_a("GongFaGui3", " §1第一层:加1物防");
            entity.getEntityData().func_74778_a("GongFaGui4", " §1第二层:加1法攻");
            entity.getEntityData().func_74778_a("GongFaGui5", " §1第三层:加4法攻，减2物攻");
            entity.getEntityData().func_74778_a("GongFaGui6", " §1前三层突破后获得20真元");
            entity.getEntityData().func_74778_a("GongFaGui7", " §1第四层:加2法攻");
            entity.getEntityData().func_74778_a("GongFaGui8", " §1第五层:加2法攻");
            entity.getEntityData().func_74778_a("GongFaGui9", " §1第六层:加8法攻，减4物攻");
            entity.getEntityData().func_74778_a("GongFaGui10", " §1四至六层突破后获得80真元");
            entity.getEntityData().func_74778_a("GongFaGui11", " §1第七层:加6物防");
            entity.getEntityData().func_74778_a("GongFaGui12", " §1第八层:加6法攻");
            entity.getEntityData().func_74778_a("GongFaGui13", " §1第九层:加24法攻，减12物攻");
            entity.getEntityData().func_74778_a("GongFaGui14", " §1七至九层突破后获得200真元");
            entity.getEntityData().func_74778_a("GongFaGui15", " §1第十层:加1440灵力");
            entity.getEntityData().func_74778_a("GongFaGui16", " §1第十一层:加18法攻");
            entity.getEntityData().func_74778_a("GongFaGui17", " §1第十二层:加72法攻，减36物攻");
            entity.getEntityData().func_74778_a("GongFaGui18", " §1十至十二层突破后获得800真元");
            entity.getEntityData().func_74778_a("GongFaGui19", " §1第十三层:加108法攻");
            entity.getEntityData().func_74778_a("GongFaGui20", " §1十三层突破后获得2500真元");
        }
    }
}
