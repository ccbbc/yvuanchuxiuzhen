package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao1;
import net.mcreator.yvanchuliandan.item.ItemDanYao10;
import net.mcreator.yvanchuliandan.item.ItemDanYao11;
import net.mcreator.yvanchuliandan.item.ItemDanYao12;
import net.mcreator.yvanchuliandan.item.ItemDanYao13;
import net.mcreator.yvanchuliandan.item.ItemDanYao14;
import net.mcreator.yvanchuliandan.item.ItemDanYao15;
import net.mcreator.yvanchuliandan.item.ItemDanYao16;
import net.mcreator.yvanchuliandan.item.ItemDanYao17;
import net.mcreator.yvanchuliandan.item.ItemDanYao18;
import net.mcreator.yvanchuliandan.item.ItemDanYao19;
import net.mcreator.yvanchuliandan.item.ItemDanYao2;
import net.mcreator.yvanchuliandan.item.ItemDanYao3;
import net.mcreator.yvanchuliandan.item.ItemDanYao4;
import net.mcreator.yvanchuliandan.item.ItemDanYao5;
import net.mcreator.yvanchuliandan.item.ItemDanYao6;
import net.mcreator.yvanchuliandan.item.ItemDanYao7;
import net.mcreator.yvanchuliandan.item.ItemDanYao8;
import net.mcreator.yvanchuliandan.item.ItemDanYao9a;
import net.mcreator.yvanchuliandan.item.ItemDanYao9b;
import net.mcreator.yvanchuliandan.item.ItemDanYao9c;
import net.mcreator.yvanchuliandan.item.ItemJiandao;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureWuPingMiaoSu.class */
public class ProcedureWuPingMiaoSu extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureWuPingMiaoSu(ElementsYvanchuliandanMod instance) {
        super(instance, 468);
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
                if (itemstack.func_77973_b() == new ItemStack(ItemJiandao.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "收集草药的工具");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao1.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内获得急迫I BUFF");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao2.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后5分钟内获得水下呼吸 BUFF");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao3.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后15分钟内获得饱和I BUFF");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao4.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内获得速度I BUFF");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao5.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内获得跳跃I BUFF");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao6.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后5分钟内获得夜视 BUFF");
                    _event.getToolTip().add(1, "练气期服用有奇效,");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao7.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后瞬间恢复20气血值");
                    _event.getToolTip().add(1, "练气期服用后恢复气血");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao8.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后瞬间恢复40灵力值");
                    _event.getToolTip().add(1, "练气期服用后恢复灵力");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao9a.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后增加4真元");
                    _event.getToolTip().add(1, "适合练气期修士增进修为的丹药");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao9b.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后增加8真元");
                    _event.getToolTip().add(1, "适合练气期修士增进修为的丹药");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao9c.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后增加12真元");
                    _event.getToolTip().add(1, "适合练气期修士增进修为的丹药");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao10.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加1攻击力");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao11.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加1防御力");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao12.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加10气血值");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao13.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后永久增加20灵力值");
                    _event.getToolTip().add(1, "练气期服用有奇效");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao14.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内增加8攻击力 将减少0.5寿元与5真元");
                    _event.getToolTip().add(1, "练气期服用后会强行催动真元为你暂时增强肉体");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao15.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内增加8防御力 将减少0.5寿元与5真元");
                    _event.getToolTip().add(1, "练气期服用后会强行催动真元为你暂时增强肉体");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao16.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后3分钟内增加80气血值 将减少0.5寿元与5真元");
                    _event.getToolTip().add(1, "练气期服用后会强行催动真元为你暂时增强肉体");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao17.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加30%");
                    _event.getToolTip().add(1, "用于练气期突破瓶颈");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao18.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "龙吟体质者服用可增加5寿元");
                    _event.getToolTip().add(1, "可制衡龙吟之质");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemDanYao19.block, 1).func_77973_b()) {
                    _event.getToolTip().add(2, "服用后本次突破瓶颈概率增加30%");
                    _event.getToolTip().add(1, "用于练气期突破瓶颈");
                }
            }
        }
    }
}
