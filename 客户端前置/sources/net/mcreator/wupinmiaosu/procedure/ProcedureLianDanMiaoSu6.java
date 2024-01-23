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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLianDanMiaoSu6.class */
public class ProcedureLianDanMiaoSu6 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureLianDanMiaoSu6(ElementsWupinmiaosuMod instance) {
        super(instance, 6);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_01")) {
                    _event.getToolTip().add(1, "筑基期服用才有效果");
                    _event.getToolTip().add(2, "服用后增加6物理防御与6煞气值,最多可服用6枚");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_02")) {
                    _event.getToolTip().add(1, "结丹服用才有效果");
                    _event.getToolTip().add(2, "服用后增加16物理攻击与16煞气值,最多可服用6枚");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_03")) {
                    _event.getToolTip().add(1, "结丹期服用才有效果");
                    _event.getToolTip().add(2, "服用后减少结丹境界10%的真元需求,最多可服用一枚");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_04")) {
                    _event.getToolTip().add(1, "元婴期服用才有效果");
                    _event.getToolTip().add(2, "增加30寿元，最多可服用7枚");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_05")) {
                    _event.getToolTip().add(1, "筑基期服用才有效果");
                    _event.getToolTip().add(2, "增加36真元88灵力值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_06")) {
                    _event.getToolTip().add(1, "练气期服用才有效果");
                    _event.getToolTip().add(2, "增加5寿元，最多可服用7枚");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_07")) {
                    _event.getToolTip().add(1, "结丹期服用才有效果");
                    _event.getToolTip().add(2, "增加15寿元，最多可服用7枚");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_08")) {
                    _event.getToolTip().add(1, "化神期服用才有效果");
                    _event.getToolTip().add(2, "增加50寿元，最多可服用7枚");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_09")) {
                    _event.getToolTip().add(1, "筑基期服用才有效果");
                    _event.getToolTip().add(2, "增加10寿元，最多可服用7枚");
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
