package by.ts.fanrenxiuxian;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.nbt.NBTTagCompound;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/AttrWrapper.class */
public class AttrWrapper<T> {
    public static final Map<String, AttrWrapper> ATTR_MAP = new HashMap();
    private String name;
    private T defaultValue;
    private AttrType<T> attrType;

    static {
        registerAttr("Attack", Double.valueOf(1.0d), AttrType.DOUBLE);
        registerAttr("BeAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("BeAttackTemp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("DamageNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("AttackTemp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("Defense", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("MagicAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("BeMagicAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("MagicDefense", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ThunderAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("BeThunderAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ThunderDefense", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("FireAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("BeFireAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("FireDefense", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("PoisonAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("BePoisonAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("PoisonDefense", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("HealthMax", Double.valueOf(20.0d), AttrType.DOUBLE);
        registerAttr("HealthMaxTemp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("Power", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("PowerMax", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ShaQiAddMax", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("PowerReply", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("Base", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("BaseMax", Double.valueOf(10.0d), AttrType.DOUBLE);
        registerAttr("ShouJi", false, AttrType.BOOLEAN);
        registerAttr("BePlayerAttack", false, AttrType.BOOLEAN);
        registerAttr("BePlayerAttack2", false, AttrType.BOOLEAN);
        registerAttr("BePlayerAttack3", false, AttrType.BOOLEAN);
        registerAttr("BeNewAttack", false, AttrType.BOOLEAN);
        registerAttr("BeAllAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("NewAttackTime", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("DataReset", false, AttrType.BOOLEAN);
        registerAttr("XiuXianMobs", false, AttrType.BOOLEAN);
        registerAttr("JingJie", "凡人", AttrType.STRING);
        registerAttr("XiaoJingJie", "凡体", AttrType.STRING);
        registerAttr("Layer", "零层", AttrType.STRING);
        registerAttr("JingJieNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("XiaoJingJieNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("XiaoJingJieNumSave", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LayerNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("功法增加概率", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ShaQi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ShouYuan", Double.valueOf(50.0d), AttrType.DOUBLE);
        registerAttr("DaoLing", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LingGen", "", AttrType.STRING);
        registerAttr("境界突破总概率", "", AttrType.STRING);
        registerAttr("LingGenNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("Fly", false, AttrType.BOOLEAN);
        registerAttr("LingQiFly", false, AttrType.BOOLEAN);
        registerAttr("JinLingGen", false, AttrType.BOOLEAN);
        registerAttr("MuLingGen", false, AttrType.BOOLEAN);
        registerAttr("ShuiLingGen", false, AttrType.BOOLEAN);
        registerAttr("HuoLingGen", false, AttrType.BOOLEAN);
        registerAttr("TuLingGen", false, AttrType.BOOLEAN);
        registerAttr("TiZhi", "", AttrType.STRING);
        registerAttr("TiZhiNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LingYuanNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LianQi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LianQiXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LianDan", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LianDanXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("FuLu", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("FuLuXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ZhiLi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ZhiLiXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ZhenFa", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ZhenFaXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("SouXun", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("SouXunXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ZhongZhi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ZhongZhiXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("CaiShi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("CaiShiXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("NiangJiu", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("NiangJiuXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LingYuZhi", Double.valueOf(1000.0d), AttrType.DOUBLE);
        registerAttr("GongFa", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("TuPoGaiLv", Double.valueOf(1.0d), AttrType.DOUBLE);
        registerAttr("LeiJie", false, AttrType.BOOLEAN);
        registerAttr("LeiJieNum", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LeiJieAttack", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("YuanShenUp", false, AttrType.BOOLEAN);
        registerAttr("YuanYingUp", false, AttrType.BOOLEAN);
        registerAttr("GongFaShow", "", AttrType.STRING);
        registerAttr("DaoLv", "", AttrType.STRING);
        registerAttr("TuPoLimit", false, AttrType.BOOLEAN);
        registerAttr("GameModel", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("MagicDie", false, AttrType.BOOLEAN);
        registerAttr("ThunderDie", false, AttrType.BOOLEAN);
        registerAttr("FireDie", false, AttrType.BOOLEAN);
        registerAttr("PoisonDie", false, AttrType.BOOLEAN);
        registerAttr("突破", false, AttrType.BOOLEAN);
        registerAttr("GongFaZhuDong1", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("GongFaZhuDong2", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("YuanCi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("功法被动1", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("功法被动2", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("功法被动3", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("境界突破附加概率", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("LeiJieTime3", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ShenShi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("XingShang", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("XingShangXp", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("JingPaiYuan", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("DanYaoBreach1", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("DanYaoBreach2", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("DanYaoBreach3", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("SectLevel", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("SectJobLevel", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("SanXianLingLevel", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("SxlGuiTip", "", AttrType.STRING);
        registerAttr("SectJobLevelName", "", AttrType.STRING);
        registerAttr("CengShuXianShi", "", AttrType.STRING);
        registerAttr("GongFaShuZi001", "", AttrType.STRING);
        registerAttr("GongFaShuZi002", "", AttrType.STRING);
        registerAttr("GongFa名暂存", "", AttrType.STRING);
        registerAttr("GongFaShuZi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ShowZhuXiu", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ShowFuXiu", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("GeZiXianShi1", "", AttrType.STRING);
        registerAttr("GeZiXianShi2", "", AttrType.STRING);
        registerAttr("WuXing", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("ZiZhi", Double.valueOf(0.0d), AttrType.DOUBLE);
        registerAttr("淬炼方向", "", AttrType.STRING);
        registerAttr("功法层数进度显示", "", AttrType.STRING);
        for (int i = 1; i < 31; i++) {
            registerAttr("ShuJiShow" + i, "", AttrType.STRING);
        }
        for (int i2 = 1; i2 < 7; i2++) {
            registerAttr("FaBaoMiaoShu" + i2, "", AttrType.STRING);
        }
        for (int i3 = 1; i3 < 30; i3++) {
            registerAttr("GongFa" + i3, Double.valueOf(0.0d), AttrType.DOUBLE);
            if (i3 <= 15) {
                registerAttr("GongFaShow" + i3, "", AttrType.STRING);
            }
            registerAttr("GongFa" + i3 + "Num", Double.valueOf(0.0d), AttrType.DOUBLE);
            registerAttr("NiangJiu" + i3, Double.valueOf(0.0d), AttrType.DOUBLE);
        }
        for (int ia = 1; ia < 50; ia++) {
            registerAttr("ChaTan" + ia, "", AttrType.STRING);
        }
        for (int i4 = 0; i4 < 50; i4++) {
            registerAttr("FanRenXiuXian" + i4, "", AttrType.STRING);
        }
        for (int i5 = 1; i5 < 9; i5++) {
            registerAttr("CengShuXianShi" + i5, "", AttrType.STRING);
        }
        registerAttr("dataCreated", true, AttrType.BOOLEAN);
        registerAttr("dataChanged", true, AttrType.BOOLEAN);
    }

    public AttrWrapper(String name, T defaultValue, AttrType<T> attrType) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.attrType = attrType;
    }

    public static <T> void registerAttr(String name, T defaultValue, AttrType<T> type) {
        ATTR_MAP.put(name, new AttrWrapper(name, defaultValue, type));
    }

    public static void initCustomData(NBTTagCompound entityData) {
        for (AttrWrapper<?> attr : ATTR_MAP.values()) {
            attr.initEntityData(entityData);
        }
    }

    public void initEntityData(NBTTagCompound entityData) {
        this.attrType.setData(entityData, this.name, this.defaultValue);
    }

    public T getData(NBTTagCompound entityData) {
        return this.attrType.getData(entityData, this.name);
    }

    public void setData(NBTTagCompound entityData, T value) {
        this.attrType.setData(entityData, this.name, value);
    }

    public void setStringData(NBTTagCompound entityData, String value) {
        this.attrType.setStringData(entityData, this.name, value);
    }

    public void setRandData(NBTTagCompound entityData) {
        this.attrType.setRandData(entityData, this.name);
    }

    public String getName() {
        return this.name;
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public AttrType<T> getAttrType() {
        return this.attrType;
    }
}
