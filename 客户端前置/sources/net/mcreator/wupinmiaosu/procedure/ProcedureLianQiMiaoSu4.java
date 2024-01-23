package net.mcreator.wupinmiaosu.procedure;

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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLianQiMiaoSu4.class */
public class ProcedureLianQiMiaoSu4 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureLianQiMiaoSu4(ElementsWupinmiaosuMod instance) {
        super(instance, 12);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0301")) {
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                        _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                    } else {
                        _event.getToolTip().add(1, "炼制者:XiaYi");
                    }
                    _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:ming_hai_san_jian_qiang")) {
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                        _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                    } else {
                        _event.getToolTip().add(1, "炼制者:XiaYi");
                    }
                    _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    _event.getToolTip().add(3, "§d法宝置于背包中提供被动加成：5%物攻");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0302")) {
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                        _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                    } else {
                        _event.getToolTip().add(1, "炼制者:Linlang");
                    }
                    _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0701")) {
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                        _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                    } else {
                        _event.getToolTip().add(1, "炼制者:XiaYi");
                    }
                    _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    _event.getToolTip().add(3, "§d法宝置于背包中提供被动加成：5%火攻");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhui_hun_zhen")) {
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                        _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                    } else {
                        _event.getToolTip().add(1, "炼制者:XiaYi");
                    }
                    _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    _event.getToolTip().add(3, "§d法宝置于背包中提供被动加成：5%毒攻");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:yuan_ci_shen_shan")) {
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                        _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                    } else {
                        _event.getToolTip().add(1, "炼制者:XiaYi");
                    }
                    _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                    _event.getToolTip().add(3, "§d法宝置于背包中提供被动加成：5%物攻 5%法攻");
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
