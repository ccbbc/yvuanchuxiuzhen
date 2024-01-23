package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao31;
import net.mcreator.yvanchuliandan.item.ItemDanYao32;
import net.mcreator.yvanchuliandan.item.ItemDanYao33a;
import net.mcreator.yvanchuliandan.item.ItemDanYao33b;
import net.mcreator.yvanchuliandan.item.ItemDanYao33c;
import net.mcreator.yvanchuliandan.item.ItemDanYao34;
import net.mcreator.yvanchuliandan.item.ItemDanYao35;
import net.mcreator.yvanchuliandan.item.ItemDanYao36;
import net.mcreator.yvanchuliandan.item.ItemDanYao37;
import net.mcreator.yvanchuliandan.item.ItemDanYao38;
import net.mcreator.yvanchuliandan.item.ItemDanYao39;
import net.mcreator.yvanchuliandan.item.ItemDanYao40;
import net.mcreator.yvanchuliandan.item.ItemDanYao41;
import net.mcreator.yvanchuliandan.item.ItemDanYao42;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureWuPingMiaoSu3.class */
public class ProcedureWuPingMiaoSu3 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureWuPingMiaoSu3(ElementsYvanchuliandanMod instance) {
        super(instance, 470);
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
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao31.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用后恢复气血");
                    _event.getToolTip().add(2, "服用后瞬间恢复120气血值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao32.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用后恢复灵力");
                    _event.getToolTip().add(2, "服用后瞬间恢复240灵力值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao33a.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合结丹期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加42真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao33b.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合结丹期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加84真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao33c.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合结丹期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加126真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao34.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加8攻击力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao35.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加8防御力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao36.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加80气血值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao37.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加160灵力值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao38.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加1回灵速");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao39.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加48攻击力 将减少2寿元与80真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao40.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加48防御力 将减少2寿元与80真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao41.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "结丹期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加480气血值 将减少2寿元与80真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao42.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "用于结丹期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加20%");
                }
            }
        }
    }
}
