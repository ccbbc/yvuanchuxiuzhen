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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureLianDanMiaoSu5.class */
public class ProcedureLianDanMiaoSu5 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureLianDanMiaoSu5(ElementsWupinmiaosuMod instance) {
        super(instance, 5);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_55")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复1080气血值");
                    _event.getToolTip().add(2, "化神期服用额外恢复每秒1%的最大生命值，持续5秒");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_56")) {
                    _event.getToolTip().add(1, "服用后瞬间恢复2160灵力值");
                    _event.getToolTip().add(2, "化神期服用额外恢复5%灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_57")) {
                    _event.getToolTip().add(1, "适合化神期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加512真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_57b")) {
                    _event.getToolTip().add(1, "适合化神期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加1024真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_57c")) {
                    _event.getToolTip().add(1, "适合化神期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加1536真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_58")) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加73物理攻击");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_59")) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加73物理防御");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_60")) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加730气血值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_61")) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1460灵力值");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_62")) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加9回灵速");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_63")) {
                    _event.getToolTip().add(1, "化神期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加432物理攻击 将减少8寿元与1280真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_64")) {
                    _event.getToolTip().add(1, "化神期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加432物理防御 将减少8寿元与1280真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_65")) {
                    _event.getToolTip().add(1, "化神期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加4320气血值 将减少8寿元与1280真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_66")) {
                    _event.getToolTip().add(1, "用于化神期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加10%");
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
