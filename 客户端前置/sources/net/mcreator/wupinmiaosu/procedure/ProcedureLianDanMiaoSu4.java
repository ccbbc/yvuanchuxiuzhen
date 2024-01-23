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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLianDanMiaoSu4.class */
public class ProcedureLianDanMiaoSu4 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureLianDanMiaoSu4(ElementsWupinmiaosuMod instance) {
        super(instance, 4);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_43")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复360气血值");
                    _event.getToolTip().add(2, "元婴期服用额外恢复每秒1%的最大生命值，持续5秒");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_44")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复720灵力值");
                    _event.getToolTip().add(2, "元婴期服用额外恢复5%灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_45a")) {
                    _event.getToolTip().add(1, "适合元婴期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加170真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_45b")) {
                    _event.getToolTip().add(1, "适合元婴期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加340真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_45c")) {
                    _event.getToolTip().add(1, "适合元婴期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加510真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_46")) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加24物理攻击");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_47")) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加24物理防御");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_48")) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加240气血值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_49")) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加480灵力值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_50")) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加3回灵速");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_51")) {
                    _event.getToolTip().add(1, "元婴期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加144物理攻击 将减少4寿元与320真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_52")) {
                    _event.getToolTip().add(1, "元婴期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加144物理防御 将减少4寿元与320真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_53")) {
                    _event.getToolTip().add(1, "元婴期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加1440气血值 将减少4寿元与320真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_54")) {
                    _event.getToolTip().add(1, "用于元婴期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加15%");
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
