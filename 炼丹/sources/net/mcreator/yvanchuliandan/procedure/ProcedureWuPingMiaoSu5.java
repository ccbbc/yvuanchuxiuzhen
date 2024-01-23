package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao55;
import net.mcreator.yvanchuliandan.item.ItemDanYao56;
import net.mcreator.yvanchuliandan.item.ItemDanYao57;
import net.mcreator.yvanchuliandan.item.ItemDanYao57b;
import net.mcreator.yvanchuliandan.item.ItemDanYao57c;
import net.mcreator.yvanchuliandan.item.ItemDanYao58;
import net.mcreator.yvanchuliandan.item.ItemDanYao59;
import net.mcreator.yvanchuliandan.item.ItemDanYao60;
import net.mcreator.yvanchuliandan.item.ItemDanYao61;
import net.mcreator.yvanchuliandan.item.ItemDanYao62;
import net.mcreator.yvanchuliandan.item.ItemDanYao63;
import net.mcreator.yvanchuliandan.item.ItemDanYao64;
import net.mcreator.yvanchuliandan.item.ItemDanYao65;
import net.mcreator.yvanchuliandan.item.ItemDanYao66;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureWuPingMiaoSu5.class */
public class ProcedureWuPingMiaoSu5 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureWuPingMiaoSu5(ElementsYvanchuliandanMod instance) {
        super(instance, 472);
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
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao55.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用后恢复气血");
                    _event.getToolTip().add(2, "服用后瞬间恢复1080气血值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao56.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用后恢复灵力");
                    _event.getToolTip().add(2, "服用后瞬间恢复2160灵力值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao57.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合化神期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加512真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao57b.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合化神期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加1024真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao57c.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合化神期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加1536真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao58.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加73攻击力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao59.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加73防御力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao60.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加730气血值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao61.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1460灵力值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao62.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加9回灵速");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao63.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加432攻击力 将减少8寿元与1280真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao64.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加432防御力 将减少8寿元与1280真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao65.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "化神期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加4320气血值 将减少8寿元与1280真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao66.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "用于化神期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加10%");
                }
            }
        }
    }
}
