package net.mcreator.wupinmiaosu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureQiTaMiaoSu.class */
public class ProcedureQiTaMiaoSu extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureQiTaMiaoSu(ElementsWupinmiaosuMod instance) {
        super(instance, 87);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("tooltip") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        dependencies.get("tooltip");
        if (dependencies.get("event") != null) {
            Object _obj = dependencies.get("event");
            if (_obj instanceof Event) {
                ItemTooltipEvent _event = (Event) _obj;
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:weimian02")) {
                    _event.getToolTip().add(1, "§f此令记录着一个神秘坐标 X:-1000 Y:237 Z:0");
                    _event.getToolTip().add(2, "网易玩家请用 [伪·天宫令] 前往天宫");
                    _event.getToolTip().add(3, "（网易无法使用天宫令激活传送门前往天宫，可能原因为：网易1.12.2Forge版本落后）");
                } else if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:weimian01")) {
                    _event.getToolTip().add(1, "§f此令记录着一个神秘坐标 X:1000 Y:1 Z:0");
                    _event.getToolTip().add(2, "网易玩家请用 [伪·冥府令] 前往冥府");
                    _event.getToolTip().add(3, "（网易无法使用冥府令激活传送门前往冥府，可能原因为：网易1.12.2Forge版本落后）");
                } else if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:ling_ye") || itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:jing_chun_ling_ye")) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("TotalTimes") : -1.0d) > 0.0d) {
                        _event.getToolTip().add(1, "剩余可使用次数:" + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("TotalTimes") : -1.0d));
                    } else {
                        _event.getToolTip().add(1, "已无灵液可以使用啦~");
                    }
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("lianqisanqiannian:chun_jun_jian")) {
                    _event.getToolTip().add(1, "此剑是灵界大能偷渡人间时携带的上古灵宝-纯钧剑灵");
                    _event.getToolTip().add(2, "特点：剑很强就是话多");
                    _event.getToolTip().add(3, "§bSHIFT+V键查看法宝属性");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("lianqisanqiannian:gong_fa")) {
                    _event.getToolTip().add(1, "五灵根且天妒之体者可修炼");
                    _event.getToolTip().add(2, "§bShift+V键翻阅功法内容");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:thunder_repelling_charm")) {
                    _event.getToolTip().add(1, "§b蹲下按V键查看法宝属性");
                    _event.getToolTip().add(2, "§d法宝置于背包中提供被动加成：5%雷攻");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:tao_zi")) {
                    _event.getToolTip().add(1, "食用后恢复10气血、20灵力、5饱食度");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_8") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_31") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_21") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_23") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_29") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_30") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_28") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_32") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_7") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_9") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_11") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_10") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_13") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_12") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_14") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_15") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_16") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_17") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_18") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_19") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_33") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_20") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_25") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_22") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_26")) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
                        _event.getToolTip().add(3, "此功法无人修炼，未绑定神识");
                        _event.getToolTip().add(4, "§bSHIFT+V查看功法内容");
                    } else {
                        _event.getToolTip().add(3, "此功法已被人以神识绑定");
                        _event.getToolTip().add(4, "§bSHIFT+V查看功法内容");
                    }
                } else if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_24")) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
                        _event.getToolTip().add(4, "此功法无人修炼，未绑定神识");
                        _event.getToolTip().add(5, "§bSHIFT+V查看功法内容");
                    } else {
                        _event.getToolTip().add(4, "此功法已被人以神识绑定");
                        _event.getToolTip().add(5, "§bSHIFT+V查看功法内容");
                    }
                } else if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_6")) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
                        _event.getToolTip().add(3, "此功法无人修炼，未绑定神识");
                        _event.getToolTip().add(4, "§bSHIFT+V查看功法内容");
                    } else {
                        _event.getToolTip().add(3, "此功法已被人以神识绑定");
                        _event.getToolTip().add(4, "§bSHIFT+V查看功法内容");
                    }
                } else if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_1") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_2") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_3") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_4") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchujiguan:gong_fa_5")) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
                        _event.getToolTip().add(2, "此功法无人修炼，未绑定神识");
                        _event.getToolTip().add(3, "§bSHIFT+V查看功法内容");
                    } else {
                        _event.getToolTip().add(2, "此功法已被人以神识绑定");
                        _event.getToolTip().add(3, "§bSHIFT+V查看功法内容");
                    }
                }
                if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_sect_")) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("级别") : -1.0d) > 0.0d) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("级别") : -1.0d) == 2.0d) {
                            _event.getToolTip().add(1, "筑基期服用后有奇效");
                        } else {
                            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("级别") : -1.0d) == 3.0d) {
                                _event.getToolTip().add(1, "结丹期服用后有奇效");
                            } else {
                                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("级别") : -1.0d) == 4.0d) {
                                    _event.getToolTip().add(1, "元婴期服用后有奇效");
                                } else {
                                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("级别") : -1.0d) == 5.0d) {
                                        _event.getToolTip().add(1, "化神期服用后有奇效");
                                    }
                                }
                            }
                        }
                        if (entity.getEntityData().func_74769_h("DanYaoSect" + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("级别") : -1.0d)) > 0.0d) {
                            _event.getToolTip().add(2, "§b此丹已于你无效,服用只可饱腹");
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent event) {
        if (event != null && event.getEntityPlayer() != null) {
            EntityPlayer entity = event.getEntityPlayer();
            Object itemStack = event.getItemStack();
            Object tooltip = event.getToolTip();
            Object flag = event.getFlags();
            Object world = entity.field_70170_p;
            double i = entity.field_70165_t;
            double j = entity.field_70163_u;
            double k = entity.field_70161_v;
            Map<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Double.valueOf(i));
            dependencies.put("y", Double.valueOf(j));
            dependencies.put("z", Double.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("itemstack", itemStack);
            dependencies.put("flag", flag);
            dependencies.put("tooltip", tooltip);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
