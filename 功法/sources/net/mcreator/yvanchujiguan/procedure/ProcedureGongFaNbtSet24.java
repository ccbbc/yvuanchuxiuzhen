package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaNbtSet24.class */
public class ProcedureGongFaNbtSet24 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaNbtSet24(ElementsYvanchujiguanMod instance) {
        super(instance, 250);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74779_i("GongFa名暂存").equals("24")) {
            entity.getEntityData().func_74778_a("GongFaGui3", " §1第一层:加2物攻,减30煞气与80灵力");
            entity.getEntityData().func_74778_a("GongFaGui4", " §1第二层:加2物攻,减30煞气与80灵力");
            entity.getEntityData().func_74778_a("GongFaGui5", " §1第三层:加4物攻,减100煞气与90灵力");
            entity.getEntityData().func_74778_a("GongFaGui6", " §1前三层突破后获得20真元");
            entity.getEntityData().func_74778_a("GongFaGui7", " §1第四层:加4物攻,减100煞气与160灵力");
            entity.getEntityData().func_74778_a("GongFaGui8", " §1第五层:加4物攻,减100煞气与160灵力");
            entity.getEntityData().func_74778_a("GongFaGui9", " §1第六层:加8物攻,减300煞气与320灵力");
            entity.getEntityData().func_74778_a("GongFaGui10", " §1四至六层突破后获得80真元");
            entity.getEntityData().func_74778_a("GongFaGui11", " §1第七层:加12物攻,减300煞气与480灵力");
            entity.getEntityData().func_74778_a("GongFaGui12", " §1第八层:加12物攻,减300煞气与480灵力");
            entity.getEntityData().func_74778_a("GongFaGui13", " §1第九层:加24物攻,减900煞气与960灵");
            entity.getEntityData().func_74778_a("GongFaGui14", "  §1力");
            entity.getEntityData().func_74778_a("GongFaGui15", " §1七至九层突破后获得200真元");
            entity.getEntityData().func_74778_a("GongFaGui16", " §1第十层:加36物攻,减900煞气与1440灵");
            entity.getEntityData().func_74778_a("GongFaGui17", "  §1力");
            entity.getEntityData().func_74778_a("GongFaGui18", " §1第十一层:加36物攻,减900煞气与1440");
            entity.getEntityData().func_74778_a("GongFaGui19", "  §1灵力");
            entity.getEntityData().func_74778_a("GongFaGui20", " §1第十二层:加72物攻,减1800煞气与2880");
            entity.getEntityData().func_74778_a("GongFaGui21", "  §1灵力");
            entity.getEntityData().func_74778_a("GongFaGui22", " §1十至十二层突破后获得800真元");
            entity.getEntityData().func_74778_a("GongFaGui23", " §1第十三层:加108物攻");
            entity.getEntityData().func_74778_a("GongFaGui24", " §1十三层突破后获得2500真元");
            if (entity.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
                entity.getEntityData().func_74778_a("GongFaGui25", "练气期可增加100煞气上限");
            }
            if (entity.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
                entity.getEntityData().func_74778_a("GongFaGui26", "筑基期可增加150煞气上限");
            }
            if (entity.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                entity.getEntityData().func_74778_a("GongFaGui27", "结丹期可增加200煞气上限");
            }
            if (entity.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                entity.getEntityData().func_74778_a("GongFaGui28", "元婴期可增加400煞气上限");
            }
            if (entity.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                entity.getEntityData().func_74778_a("GongFaGui29", "化神期可增加800煞气上限");
            }
        }
    }
}
