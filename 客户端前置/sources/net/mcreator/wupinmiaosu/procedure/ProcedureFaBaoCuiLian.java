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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFaBaoCuiLian.class */
public class ProcedureFaBaoCuiLian extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFaBaoCuiLian(ElementsWupinmiaosuMod instance) {
        super(instance, 174);
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
                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼级别") : -1.0d) > 1.0d) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d) > 1.0d) {
                        _event.getToolTip().add(3, "§a淬炼增益[威能]:" + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d));
                    }
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d) > 1.0d) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼普攻") : -1.0d) > 1.0d) {
                            _event.getToolTip().add(4, "§8淬炼增益[普攻]:" + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼普攻") : -1.0d));
                            return;
                        }
                    }
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼普攻") : -1.0d) > 1.0d) {
                        _event.getToolTip().add(3, "§8淬炼增益[普攻]:" + new DecimalFormat("0").format(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼普攻") : -1.0d));
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
