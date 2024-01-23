package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLianQiMiaoSu6.class */
public class ProcedureLianQiMiaoSu6 extends ElementsWupinmiaosuMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianQiMiaoSu6(ElementsWupinmiaosuMod instance) {
        super(instance, 225);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fa_bao_33")) {
                    if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : "").equals("")) {
                        _event.getToolTip().add(1, "炼制者:" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("炼制者") : ""));
                    } else {
                        _event.getToolTip().add(1, "炼制者:Linlang");
                    }
                    _event.getToolTip().add(2, "§bSHIFT+V键查看法宝属性");
                }
            }
        }
    }
}
