package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao20;
import net.mcreator.yvanchuliandan.item.ItemDanYao21;
import net.mcreator.yvanchuliandan.item.ItemDanYao22a;
import net.mcreator.yvanchuliandan.item.ItemDanYao22b;
import net.mcreator.yvanchuliandan.item.ItemDanYao22c;
import net.mcreator.yvanchuliandan.item.ItemDanYao23;
import net.mcreator.yvanchuliandan.item.ItemDanYao24;
import net.mcreator.yvanchuliandan.item.ItemDanYao25;
import net.mcreator.yvanchuliandan.item.ItemDanYao26;
import net.mcreator.yvanchuliandan.item.ItemDanYao27;
import net.mcreator.yvanchuliandan.item.ItemDanYao28;
import net.mcreator.yvanchuliandan.item.ItemDanYao29;
import net.mcreator.yvanchuliandan.item.ItemDanYao30a;
import net.mcreator.yvanchuliandan.item.ItemDanYao30b;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureWuPingMiaoSu2.class */
public class ProcedureWuPingMiaoSu2 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureWuPingMiaoSu2(ElementsYvanchuliandanMod instance) {
        super(instance, 469);
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
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao20.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后瞬间恢复40气血值");
                    _event.getToolTip().add(1, "筑基期服用后恢复气血");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao21.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后瞬间恢复80灵气值");
                    _event.getToolTip().add(1, "筑基期服用后恢复灵力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao22a.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后增加16真元");
                    _event.getToolTip().add(1, "适合筑基期修士增进修为的丹药");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao22b.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后增加32真元");
                    _event.getToolTip().add(1, "适合筑基期修士增进修为的丹药");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后增加48真元");
                    _event.getToolTip().add(1, "适合筑基期修士增进修为的丹药");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao23.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加3攻击力");
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao24.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加3防御力");
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao25.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加30气血值");
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao26.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加60灵力值");
                    _event.getToolTip().add(1, "筑基期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao27.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内增加16攻击力 将减少1寿元与20真元");
                    _event.getToolTip().add(1, "筑基期服用后会强行催动真元为你暂时增强肉体");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao28.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内增加16防御力 将减少1寿元与20真元");
                    _event.getToolTip().add(1, "筑基期服用后会强行催动真元为你暂时增强肉体");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao29.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内增加160气血值 将减少1寿元与20真元");
                    _event.getToolTip().add(1, "筑基期服用后会强行催动真元为你暂时增强肉体");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao30a.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加25%");
                    _event.getToolTip().add(1, "用于筑基期突破瓶颈");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao30b.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加25%");
                    _event.getToolTip().add(1, "用于筑基期突破瓶颈");
                }
            }
        }
    }
}
