package net.mcreator.wupinmiaosu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureBenMingFaBao.class */
public class ProcedureBenMingFaBao extends ElementsWupinmiaosuMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBenMingFaBao(ElementsWupinmiaosuMod instance) {
        super(instance, 109);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null || dependencies.get("tooltip") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        dependencies.get("tooltip");
        if (dependencies.get("event") != null) {
            Object _obj = dependencies.get("event");
            if (_obj instanceof Event) {
                ItemTooltipEvent _event = (Event) _obj;
                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("本命阶段") : -1.0d) < 1.0d) {
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qi_yin_xiao") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qing_zu_feng_yun_jian") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhu_que_huan")) {
                        if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                            _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                        } else {
                            _event.getToolTip().add(1, "炼制者:Linlang");
                        }
                        _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0201")) {
                        if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                            _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                        } else {
                            _event.getToolTip().add(1, "炼制者:XiaYi");
                        }
                        _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1001")) {
                        if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                            _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                        } else {
                            _event.getToolTip().add(1, "炼制者:Linlang");
                        }
                        _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao33")) {
                        if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                            _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                        } else {
                            _event.getToolTip().add(1, "炼制者:Linlang");
                        }
                        _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qi_yin_xiao") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qing_zu_feng_yun_jian") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhu_que_huan") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0201") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1001") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao33")) {
                        if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("初始化")) {
                            _event.getToolTip().add(3, "可点击炼器鼎的 > 按钮,在新的界面提升法宝;器格内放入本法宝,物格内放入[" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("材料") : "") + " * " + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("材料数量") : -1.0d) + "],点击炼制,在真元和灵力满足的情况下即可提升法宝为本命法宝");
                        } else {
                            _event.getToolTip().add(3, "放置主手后查看新的描述");
                        }
                    }
                } else if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qi_yin_xiao") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qing_zu_feng_yun_jian") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhu_que_huan") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0201") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1001") || itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao33")) {
                    _event.getToolTip().add(1, itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("境界") : "");
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("绑定者") : "").equals("")) {
                        _event.getToolTip().add(2, "所有者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("绑定者") : ""));
                    } else {
                        _event.getToolTip().add(2, "无人绑定");
                    }
                    _event.getToolTip().add(3, "§bSHIFT+V键查看法宝属性");
                    _event.getToolTip().add(4, "提升所需材料[" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("材料") : "") + " * " + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("材料数量") : -1.0d) + "],点击炼制,在真元和灵力满足的情况下即可将本命法宝提升至下个境界");
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
