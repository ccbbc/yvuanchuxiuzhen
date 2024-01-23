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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLiandanMiaoSu1.class */
public class ProcedureLiandanMiaoSu1 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureLiandanMiaoSu1(ElementsWupinmiaosuMod instance) {
        super(instance, 1);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:yaochu")) {
                    _event.getToolTip().add(1, "收集草药的工具");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_1")) {
                    _event.getToolTip().add(1, "练气期以后服用有奇效");
                    _event.getToolTip().add(2, "服用后3分钟内获得急迫I BUFF");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_2")) {
                    _event.getToolTip().add(1, "练气期以后服用有奇效");
                    _event.getToolTip().add(2, "服用后5分钟内获得水下呼吸 BUFF");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_3")) {
                    _event.getToolTip().add(1, "练气期以后服用有奇效");
                    _event.getToolTip().add(2, "服用后15分钟内获得饱和I BUFF");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_4")) {
                    _event.getToolTip().add(1, "练气期以后服用有奇效");
                    _event.getToolTip().add(2, "服用后3分钟内获得速度I BUFF");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_5")) {
                    _event.getToolTip().add(1, "练气期以后服用有奇效");
                    _event.getToolTip().add(2, "服用后3分钟内获得跳跃I BUFF");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_6")) {
                    _event.getToolTip().add(1, "练气期以后服用有奇效");
                    _event.getToolTip().add(2, "服用后5分钟内获得夜视 BUFF");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_7")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复20气血值");
                    _event.getToolTip().add(2, "练气期服用额外恢复每秒1%的最大生命值，持续5秒");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_8")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复40灵力值");
                    _event.getToolTip().add(2, "练气期服用额外恢复5%灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_9a")) {
                    _event.getToolTip().add(1, "适合练气期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加4真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_9b")) {
                    _event.getToolTip().add(1, "适合练气期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加8真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_9c")) {
                    _event.getToolTip().add(1, "适合练气期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加12真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_10")) {
                    _event.getToolTip().add(1, "练气期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1物理攻击");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_11")) {
                    _event.getToolTip().add(1, "练气期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1物理防御");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_12")) {
                    _event.getToolTip().add(1, "练气期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加10气血值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_13")) {
                    _event.getToolTip().add(1, "练气期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加20灵力值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_14")) {
                    _event.getToolTip().add(1, "练气期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加8物理攻击 将减少0.5寿元与5真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_15")) {
                    _event.getToolTip().add(1, "练气期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加8物理防御 将减少0.5寿元与5真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_16")) {
                    _event.getToolTip().add(1, "练气期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加80气血值 将减少0.5寿元与5真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_17")) {
                    _event.getToolTip().add(1, "用于练气期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加30%");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_18")) {
                    _event.getToolTip().add(1, "可制衡龙吟之质");
                    _event.getToolTip().add(2, "龙吟体质者服用可增加5寿元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_19")) {
                    _event.getToolTip().add(1, "用于练气期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加30%");
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
