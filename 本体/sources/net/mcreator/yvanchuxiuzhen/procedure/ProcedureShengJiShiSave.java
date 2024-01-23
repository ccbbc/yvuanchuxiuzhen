package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShengJiShiSave.class */
public class ProcedureShengJiShiSave extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShengJiShiSave(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 395);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") - entity.getEntityData().func_74769_h("AttackTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") - entity.getEntityData().func_74769_h("MagicAttackTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") - entity.getEntityData().func_74769_h("HealthMaxTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ThunderAttack", entity.getEntityData().func_74769_h("ThunderAttack") - entity.getEntityData().func_74769_h("ThunderAttackTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("FireAttack", entity.getEntityData().func_74769_h("FireAttack") - entity.getEntityData().func_74769_h("FireAttackTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("PoisonAttack", entity.getEntityData().func_74769_h("PoisonAttack") - entity.getEntityData().func_74769_h("PoisonAttackTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") - entity.getEntityData().func_74769_h("MagicDefenseTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ThunderDefense", entity.getEntityData().func_74769_h("ThunderDefense") - entity.getEntityData().func_74769_h("ThunderDefenseTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("FireDefense", entity.getEntityData().func_74769_h("FireDefense") - entity.getEntityData().func_74769_h("FireDefenseTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("PoisonDefense", entity.getEntityData().func_74769_h("PoisonDefense") - entity.getEntityData().func_74769_h("PoisonDefenseTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") - entity.getEntityData().func_74769_h("DefenseTemp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("GongFa", entity.getEntityData().func_74769_h("GongFa"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("GongFaShow", entity.getEntityData().func_74769_h("GongFaShow"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("Base", 0.0d);
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ShaQi", entity.getEntityData().func_74769_h("ShaQi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("LingYuZhi", entity.getEntityData().func_74769_h("LingYuZhi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("灵裕值增加计时", entity.getEntityData().func_74769_h("灵裕值增加计时"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("BaseMax", entity.getEntityData().func_74769_h("BaseMax"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("Power", entity.getEntityData().func_74769_h("Power"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("PowerReply", entity.getEntityData().func_74769_h("PowerReply"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("PowerMax", entity.getEntityData().func_74769_h("PowerMax"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("JingJieNum", entity.getEntityData().func_74769_h("JingJieNum"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNumSave"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("LayerNum", entity.getEntityData().func_74769_h("LayerNum"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("LingGenNum", entity.getEntityData().func_74769_h("LingGenNum"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("TiZhiNum", entity.getEntityData().func_74769_h("TiZhiNum"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("突破失败增加概率", entity.getEntityData().func_74769_h("突破失败增加概率"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("功法增加概率", entity.getEntityData().func_74769_h("功法增加概率"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("境界突破附加概率", entity.getEntityData().func_74769_h("境界突破附加概率"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ShouXun", entity.getEntityData().func_74769_h("ShouXun"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ShouXunXp", entity.getEntityData().func_74769_h("ShouXunXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("YuanCi", entity.getEntityData().func_74769_h("YuanCi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ShaQiAddMax", entity.getEntityData().func_74769_h("ShaQiAddMax"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("CaiShi", entity.getEntityData().func_74769_h("CaiShi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("CaiShiXp", entity.getEntityData().func_74769_h("CaiShiXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("BuffAdd", entity.getEntityData().func_74769_h("BuffAdd"));
        if (entity.getEntityData().func_74767_n("JinLingGen")) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("JinLingGen", true);
        }
        if (entity.getEntityData().func_74767_n("ShuiLingGen")) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("ShuiLingGen", true);
        }
        if (entity.getEntityData().func_74767_n("MuLingGen")) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("MuLingGen", true);
        }
        if (entity.getEntityData().func_74767_n("HuoLingGen")) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("MuLingGen", true);
        }
        if (entity.getEntityData().func_74767_n("TuLingGen")) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("TuLingGen", true);
        }
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74778_a("TiZhi", entity.getEntityData().func_74779_i("TiZhi"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74778_a("JingJie", entity.getEntityData().func_74779_i("JingJie"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74778_a("XiaoJingJie", entity.getEntityData().func_74779_i("XiaoJingJie"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74778_a("Layer", entity.getEntityData().func_74779_i("Layer"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74778_a("DaoLv", entity.getEntityData().func_74779_i("DaoLv"));
        entity.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
        for (int index0 = 0; index0 < 30; index0++) {
            entity.getEntityData().func_74780_a("功法顺序暂存", entity.getEntityData().func_74769_h("功法顺序暂存") + 1.0d);
            entity.getEntityData().func_74778_a("功法名暂存", "GongFa" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
            entity.getEntityData().func_74778_a("酿酒名暂存", "NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
            entity.getEntityData().func_74778_a("功法熟练度名暂存", "GongFa" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")) + "Num");
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a(entity.getEntityData().func_74779_i("功法名暂存"), entity.getEntityData().func_74769_h(entity.getEntityData().func_74779_i("功法名暂存")));
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a(entity.getEntityData().func_74779_i("功法熟练度名暂存"), entity.getEntityData().func_74769_h(entity.getEntityData().func_74779_i("功法熟练度名暂存")));
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a(entity.getEntityData().func_74779_i("酿酒名暂存"), entity.getEntityData().func_74769_h(entity.getEntityData().func_74779_i("酿酒名暂存")));
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")), entity.getEntityData().func_74769_h("NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存"))));
            if (entity.getEntityData().func_74769_h("功法顺序暂存") <= 15.0d) {
                entity.getEntityData().func_74778_a("功法显示名暂存", "GongFaShow" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74778_a(entity.getEntityData().func_74779_i("功法显示名暂存"), entity.getEntityData().func_74779_i(entity.getEntityData().func_74779_i("功法显示名暂存")));
            }
            if (entity.getEntityData().func_74769_h("功法顺序暂存") <= 13.0d) {
                entity.getEntityData().func_74778_a("无极培元buff", "BuffAdd" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74778_a(entity.getEntityData().func_74779_i("无极培元buff"), entity.getEntityData().func_74779_i(entity.getEntityData().func_74779_i("无极培元buff")));
            }
        }
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("灵欲值", entity.getEntityData().func_74769_h("灵欲值"));
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("灵裕值增加计时", entity.getEntityData().func_74769_h("灵裕值增加计时"));
        entity.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
        entity.getEntityData().func_74780_a("BeMagicAttack", 0.0d);
        entity.getEntityData().func_74780_a("BeThunderAttack", 0.0d);
        entity.getEntityData().func_74780_a("BeFireAttack", 0.0d);
        entity.getEntityData().func_74780_a("BePoisonAttack", 0.0d);
        if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entity.getEntityData().func_74780_a("生机石暂存", entity.getEntityData().func_74769_h("TuPoGaiLv") - 0.01d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entity.getEntityData().func_74780_a("生机石暂存", entity.getEntityData().func_74769_h("TuPoGaiLv") - 0.05d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entity.getEntityData().func_74780_a("生机石暂存", entity.getEntityData().func_74769_h("TuPoGaiLv") - 0.07d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entity.getEntityData().func_74780_a("生机石暂存", entity.getEntityData().func_74769_h("TuPoGaiLv") - 0.05d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entity.getEntityData().func_74780_a("生机石暂存", entity.getEntityData().func_74769_h("TuPoGaiLv") - 0.03d);
        }
        if (entity.getEntityData().func_74769_h("TuPoGaiLv") < 0.01d) {
            entity.getEntityData().func_74780_a("生机石暂存", 0.01d);
        }
        if (!itemstack.func_77942_o()) {
            itemstack.func_77982_d(new NBTTagCompound());
        }
        itemstack.func_77978_p().func_74780_a("TuPoGaiLv", entity.getEntityData().func_74769_h("生机石暂存"));
    }
}
