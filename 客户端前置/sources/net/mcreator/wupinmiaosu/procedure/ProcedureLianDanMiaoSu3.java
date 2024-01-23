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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLianDanMiaoSu3.class */
public class ProcedureLianDanMiaoSu3 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureLianDanMiaoSu3(ElementsWupinmiaosuMod instance) {
        super(instance, 3);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_31")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复120气血值");
                    _event.getToolTip().add(2, "结丹期服用额外恢复每秒1%的最大生命值，持续5秒");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_32")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复240灵力值");
                    _event.getToolTip().add(2, "结丹期服用额外恢复5%灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_33a")) {
                    _event.getToolTip().add(1, "适合结丹期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加42真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_33b")) {
                    _event.getToolTip().add(1, "适合结丹期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加84真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_33c")) {
                    _event.getToolTip().add(1, "适合结丹期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加126真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_34")) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加8物理攻击");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_35")) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加8物理防御");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_36")) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加80气血值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_37")) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加160灵力值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_38")) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1回灵速");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_39")) {
                    _event.getToolTip().add(1, "结丹期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加48物理攻击 将减少2寿元与80真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_40")) {
                    _event.getToolTip().add(1, "结丹期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加48物理防御 将减少2寿元与80真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_41")) {
                    _event.getToolTip().add(1, "结丹期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加480气血值 将减少2寿元与80真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_42")) {
                    _event.getToolTip().add(1, "用于结丹期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加20%");
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
