package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShengJIShiBack.class */
public class ProcedureShengJIShiBack extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShengJIShiBack(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 396);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entity.getEntityData().func_74780_a("HealthMax", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("HealthMax") : -1.0d);
        entity.getEntityData().func_74780_a("GongFa", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("GongFa") : -1.0d);
        entity.getEntityData().func_74780_a("GongFaShow", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("GongFaShow") : -1.0d);
        entity.getEntityData().func_74780_a("Attack", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("Attack") : -1.0d);
        entity.getEntityData().func_74780_a("MagicAttack", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("MagicAttack") : -1.0d);
        entity.getEntityData().func_74780_a("ThunderAttack", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ThunderAttack") : -1.0d);
        entity.getEntityData().func_74780_a("FireAttack", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("FireAttack") : -1.0d);
        entity.getEntityData().func_74780_a("PoisonAttack", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("PoisonAttack") : -1.0d);
        entity.getEntityData().func_74780_a("ShaQi", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ShaQi") : -1.0d);
        entity.getEntityData().func_74780_a("Defense", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("Defense") : -1.0d);
        entity.getEntityData().func_74780_a("MagicDefense", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("MagicDefense") : -1.0d);
        entity.getEntityData().func_74780_a("ThunderDefense", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ThunderDefense") : -1.0d);
        entity.getEntityData().func_74780_a("FireDefense", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("FireDefense") : -1.0d);
        entity.getEntityData().func_74780_a("PosionDefense", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("PosionDefense") : -1.0d);
        entity.getEntityData().func_74780_a("DaoLing", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("DaoLing") : -1.0d);
        entity.getEntityData().func_74780_a("ShouYuan", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ShouYuan") : -1.0d);
        entity.getEntityData().func_74780_a("Base", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("Base") : -1.0d);
        entity.getEntityData().func_74780_a("BaseMax", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("BaseMax") : -1.0d);
        entity.getEntityData().func_74780_a("Power", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("Power") : -1.0d);
        entity.getEntityData().func_74780_a("PowerReply", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("PowerReply") : -1.0d);
        entity.getEntityData().func_74780_a("PowerMax", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("PowerMax") : -1.0d);
        entity.getEntityData().func_74780_a("JingJieNum", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("JingJieNum") : -1.0d);
        entity.getEntityData().func_74780_a("XiaoJingJieNum", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("XiaoJingJieNum") : -1.0d);
        entity.getEntityData().func_74780_a("XiaoJingJieNumSave", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("XiaoJingJieNumSave") : -1.0d);
        entity.getEntityData().func_74780_a("LayerNum", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("LayerNum") : -1.0d);
        entity.getEntityData().func_74780_a("LingGenNum", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("LingGenNum") : -1.0d);
        entity.getEntityData().func_74780_a("TiZhiNum", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("TiZhiNum") : -1.0d);
        entity.getEntityData().func_74780_a("LianQi", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("LianQi") : -1.0d);
        entity.getEntityData().func_74780_a("LianQiXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("LianQiXp") : -1.0d);
        entity.getEntityData().func_74780_a("LianDan", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("LianDan") : -1.0d);
        entity.getEntityData().func_74780_a("LianDanXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("LianDanXp") : -1.0d);
        entity.getEntityData().func_74780_a("FuLu", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("FuLu") : -1.0d);
        entity.getEntityData().func_74780_a("FuLuXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("FuLuXp") : -1.0d);
        entity.getEntityData().func_74780_a("ZhiLi", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ZhiLi") : -1.0d);
        entity.getEntityData().func_74780_a("ZhiLiXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ZhiLiXp") : -1.0d);
        entity.getEntityData().func_74780_a("突破失败增加概率", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("突破失败增加概率") : -1.0d);
        entity.getEntityData().func_74780_a("境界突破附加概率", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("境界突破附加概率") : -1.0d);
        entity.getEntityData().func_74780_a("功法增加概率", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("功法增加概率") : -1.0d);
        entity.getEntityData().func_74780_a("TuPoGaiLv", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("TuPoGaiLv") : -1.0d);
        entity.getEntityData().func_74780_a("ZhenFa", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ZhenFa") : -1.0d);
        entity.getEntityData().func_74780_a("ZhenFaXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ZhenFaXp") : -1.0d);
        entity.getEntityData().func_74780_a("ShouXun", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ShouXun") : -1.0d);
        entity.getEntityData().func_74780_a("ShouXunXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ShouXunXp") : -1.0d);
        entity.getEntityData().func_74780_a("ShaQiAddMax", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ShaQiAddMax") : -1.0d);
        entity.getEntityData().func_74780_a("YuanCi", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("YuanCi") : -1.0d);
        entity.getEntityData().func_74780_a("ZhongZhi", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ZhongZhi") : -1.0d);
        entity.getEntityData().func_74780_a("ZhongZhiXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("ZhongZhiXp") : -1.0d);
        entity.getEntityData().func_74780_a("CaiShi", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("CaiShi") : -1.0d);
        entity.getEntityData().func_74780_a("CaiShiXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("CaiShiXp") : -1.0d);
        entity.getEntityData().func_74780_a("NiangJiu", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("NiangJiu") : -1.0d);
        entity.getEntityData().func_74780_a("NiangJiuXp", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("NiangJiuXp") : -1.0d);
        entity.getEntityData().func_74780_a("BuffAdd", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("BuffAdd") : -1.0d);
        entity.getEntityData().func_74780_a("GongFa3000", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("GongFa3000") : -1.0d);
        entity.getEntityData().func_74778_a("LingGen", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("LingGen") : "");
        entity.getEntityData().func_74778_a("JingJie", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("JingJie") : "");
        entity.getEntityData().func_74778_a("XiaoJingJie", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("XiaoJingJie") : "");
        entity.getEntityData().func_74778_a("Layer", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("Layer") : "");
        entity.getEntityData().func_74778_a("DaoLv", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("DaoLv") : "");
        if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("JinLingGen")) {
            entity.getEntityData().func_74757_a("JinLingGen", true);
            entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "金");
        }
        if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("MuLingGen")) {
            entity.getEntityData().func_74757_a("MuLingGen", true);
            entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "木");
        }
        if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("ShuiLingGen")) {
            entity.getEntityData().func_74757_a("ShuiLingGen", true);
            entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "水");
        }
        if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("HuoLingGen")) {
            entity.getEntityData().func_74757_a("HuoLingGen", true);
            entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "火");
        }
        if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("TuLingGen")) {
            entity.getEntityData().func_74757_a("TuLingGen", true);
            entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "土");
        }
        entity.getEntityData().func_74757_a("境界概率更新", true);
        entity.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
        for (int index0 = 0; index0 < 30; index0++) {
            entity.getEntityData().func_74780_a("功法顺序暂存", entity.getEntityData().func_74769_h("功法顺序暂存") + 1.0d);
            entity.getEntityData().func_74778_a("功法名暂存", "GongFa" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
            entity.getEntityData().func_74778_a("功法熟练度名暂存", "GongFa" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")) + "熟练度");
            entity.getEntityData().func_74778_a("酿酒名暂存", "NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
            entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("功法名暂存"), itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h(entity.getEntityData().func_74779_i("功法名暂存")) : -1.0d);
            entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("功法熟练度名暂存"), itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h(entity.getEntityData().func_74779_i("功法熟练度名暂存")) : -1.0d);
            entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("酿酒名暂存"), itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h(entity.getEntityData().func_74779_i("酿酒名暂存")) : -1.0d);
            entity.getEntityData().func_74780_a("NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")), itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存"))) : -1.0d);
            if (entity.getEntityData().func_74769_h("功法顺序暂存") <= 15.0d) {
                entity.getEntityData().func_74778_a("功法显示名暂存", "GongFaShow" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
                entity.getEntityData().func_74778_a(entity.getEntityData().func_74779_i("功法显示名暂存"), itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i(entity.getEntityData().func_74779_i("功法显示名暂存")) : "");
            }
            if (entity.getEntityData().func_74769_h("功法顺序暂存") <= 13.0d) {
                entity.getEntityData().func_74778_a("无极培元buff", "BuffAdd" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
                entity.getEntityData().func_74778_a(entity.getEntityData().func_74779_i("无极培元buff"), itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i(entity.getEntityData().func_74779_i("无极培元buff")) : "");
            }
        }
        entity.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
        entity.getEntityData().func_74780_a("LingYuZhi", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("LingYuZhi") : -1.0d);
        entity.getEntityData().func_74780_a("灵裕值增加计时", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵裕值增加计时") : -1.0d);
    }
}
