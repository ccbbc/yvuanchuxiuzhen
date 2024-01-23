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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLianDanMiaoSu2.class */
public class ProcedureLianDanMiaoSu2 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureLianDanMiaoSu2(ElementsWupinmiaosuMod instance) {
        super(instance, 2);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_20")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复40气血值");
                    _event.getToolTip().add(2, "筑基期服用额外恢复每秒1%的最大生命值，持续5秒");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_21")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复80灵气值");
                    _event.getToolTip().add(2, "筑基期服用额外恢复5%灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_22a")) {
                    _event.getToolTip().add(1, "适合筑基期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加16真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_22b")) {
                    _event.getToolTip().add(1, "适合筑基期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加32真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_22c")) {
                    _event.getToolTip().add(1, "适合筑基期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加48真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_23")) {
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1物理攻击");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_24")) {
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1物理防御");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_25")) {
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加10气血值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_26")) {
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加80灵力值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_27")) {
                    _event.getToolTip().add(1, "筑基期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加16物理攻击 将减少1寿元与20真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_28")) {
                    _event.getToolTip().add(1, "筑基期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加16物理防御 将减少1寿元与20真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_29")) {
                    _event.getToolTip().add(1, "筑基期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加160气血值 将减少1寿元与20真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_30a")) {
                    _event.getToolTip().add(1, "用于筑基期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加25%");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_30b")) {
                    _event.getToolTip().add(1, "用于筑基期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加25%");
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
