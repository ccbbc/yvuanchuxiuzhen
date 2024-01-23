package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiJianFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiXingFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu02;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu04;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu05;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu08;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu11;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu13;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu16;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu18;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu2401;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu25;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu26;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiZhenBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuDunFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHunDunJianShiFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuoDanFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemJuFengFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLeiJiFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLiuHuoFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemRanShanFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemTieJiaFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemWuLiangDunFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemYinShenFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhaoMingFu;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFuLuMiaoSu.class */
public class ProcedureFuLuMiaoSu extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFuLuMiaoSu(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 308);
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
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu02.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "给予目标30秒缓慢二");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu03.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "获得一分钟速度二");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu04.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "在目标位置爆炸并造成47范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemZhaoMingFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "获得一分钟夜视");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoDanFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "放出火球并造成46范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu2401.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "获得一分种水下呼吸");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu26.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "释放剑气并造成177范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuDunFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "获得5秒抗性一");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu05.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "释放雷击造成183范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu11.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "制造一个无法破坏的牢笼并给予目标30秒缓慢二");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu25.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "破坏地形并造成730范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu08.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "释放火焰并造成630范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFeiXingFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "获得一分钟无消耗飞行时间");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFeiJianFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "三阶符宝");
                    _event.getToolTip().add(2, "释放飞剑造成56伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemJuFengFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "三阶符宝");
                    _event.getToolTip().add(2, "释放飓风造成174范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemTieJiaFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "释放3个属性为自己八成的铁傀儡");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu18.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "使地面向下凹陷并造成215范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu13.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "四阶符箓");
                    _event.getToolTip().add(2, "释放更大范围的雷击并造成1989的范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemRanShanFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "四阶符宝");
                    _event.getToolTip().add(2, "释放火球并造成539的范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemLiuHuoFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "四阶符宝");
                    _event.getToolTip().add(2, "放出火焰并造成933范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemYinShenFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "四阶符箓");
                    _event.getToolTip().add(2, "使用后15秒内获得隐身");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemFulu16.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "四阶符箓");
                    _event.getToolTip().add(2, "使目标产生混乱效果每秒造成424伤害持续7秒");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHanDiZhenBao.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "五阶真宝");
                    _event.getToolTip().add(2, "破坏地形并造成3585的范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemLeiJiFuBao.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "五阶符宝");
                    _event.getToolTip().add(2, "释放雷剑并造成1325伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemWuLiangDunFuBao.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "五阶符宝");
                    _event.getToolTip().add(2, "获得5秒抗性二");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHanDiFuBao.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "五阶符宝");
                    _event.getToolTip().add(2, "破坏地下并造成1792的范围伤害");
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHunDunJianShiFu.block, 1).func_77973_b()) {
                    _event.getToolTip().add(1, "五阶真宝");
                    _event.getToolTip().add(2, "放出蓄能飞箭攻击敌人造成4190伤害");
                }
            }
        }
    }
}
