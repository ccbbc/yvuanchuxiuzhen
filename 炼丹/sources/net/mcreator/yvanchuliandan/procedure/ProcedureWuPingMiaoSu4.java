package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao43;
import net.mcreator.yvanchuliandan.item.ItemDanYao44;
import net.mcreator.yvanchuliandan.item.ItemDanYao45a;
import net.mcreator.yvanchuliandan.item.ItemDanYao45b;
import net.mcreator.yvanchuliandan.item.ItemDanYao45c;
import net.mcreator.yvanchuliandan.item.ItemDanYao46;
import net.mcreator.yvanchuliandan.item.ItemDanYao47;
import net.mcreator.yvanchuliandan.item.ItemDanYao48;
import net.mcreator.yvanchuliandan.item.ItemDanYao49;
import net.mcreator.yvanchuliandan.item.ItemDanYao50;
import net.mcreator.yvanchuliandan.item.ItemDanYao51;
import net.mcreator.yvanchuliandan.item.ItemDanYao52;
import net.mcreator.yvanchuliandan.item.ItemDanYao53;
import net.mcreator.yvanchuliandan.item.ItemDanYao54;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureWuPingMiaoSu4.class */
public class ProcedureWuPingMiaoSu4 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureWuPingMiaoSu4(ElementsYvanchuliandanMod instance) {
        super(instance, 471);
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
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao43.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用后恢复气血");
                    _event.getToolTip().add(2, "服用后瞬间恢复360气血值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao44.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用后恢复灵力");
                    _event.getToolTip().add(2, "服用后瞬间恢复720灵力值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao45a.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合元婴期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加170真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao45b.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合元婴期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加340真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao45c.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "适合元婴期修士增进修为的丹药");
                    _event.getToolTip().add(2, "服用后增加510真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao46.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加24攻击力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao47.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加24防御力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao48.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加240气血值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao49.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加480灵力值");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao50.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用有奇效");
                    _event.getToolTip().add(2, "服用后永久增加3回灵速");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao51.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加144攻击力 将减少4寿元与320真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao52.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加144防御力 将减少4寿元与320真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao53.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "元婴期服用后会强行催动真元为你暂时增强肉体");
                    _event.getToolTip().add(2, "服用后3分钟内增加1440气血值 将减少4寿元与320真元");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao54.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "用于元婴期突破瓶颈");
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加15%");
                }
            }
        }
    }
}
