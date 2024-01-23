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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFuLuMiaoSu1.class */
public class ProcedureFuLuMiaoSu1 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFuLuMiaoSu1(ElementsWupinmiaosuMod instance) {
        super(instance, 7);
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
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu02")) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "给予目标30秒缓慢二");
                    _event.getToolTip().add(3, "催动此符需要20灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:kong_ti_fu")) {
                    if (!itemstack.func_77942_o() || !itemstack.func_77978_p().func_74767_n("第一次获取")) {
                        _event.getToolTip().add(1, "一阶符箓");
                        _event.getToolTip().add(2, "操控修士躯体，以便后续施展夺舍");
                    } else {
                        _event.getToolTip().add(1, "§e你在野外捡到了这个发着绿光的奇怪符箓");
                        _event.getToolTip().add(2, "一阶符箓");
                        _event.getToolTip().add(3, "操控修士躯体，以便后续施展夺舍");
                        _event.getToolTip().add(4, "§b控体符制作方式：在制符台笔框里放入一阶符笔，纸框里放入一阶符纸，宝框里放入自己的精血。");
                    }
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu03")) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "获得一分钟速度二");
                    _event.getToolTip().add(3, "催动此符需要20灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu04")) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "击中处会爆炸并造成18范围法伤");
                    _event.getToolTip().add(3, "催动此符需要35灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:zhao_ming_fu")) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "获得一分钟夜视");
                    _event.getToolTip().add(3, "催动此符需要20灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:huo_dan_fu")) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "发出火球并造成12火伤");
                    _event.getToolTip().add(3, "催动此符需要23灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu2401")) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "获得一分种水下呼吸");
                    _event.getToolTip().add(3, "催动此符需要20灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:zhen_zai_fu")) {
                    _event.getToolTip().add(1, "一阶符箓");
                    _event.getToolTip().add(2, "防止周边半径32-64格生成怪物");
                    _event.getToolTip().add(3, "催动此符需要3灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu26")) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "释放剑气攻击造成46范围法伤");
                    _event.getToolTip().add(3, "催动此符需要132灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:hu_dun_fu")) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "获得5秒抗性一");
                    _event.getToolTip().add(3, "催动此符需要50灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu18")) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "使地面向下凹陷并造成56范围法伤");
                    _event.getToolTip().add(3, "催动此符需要151灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu05")) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "释放雷电攻击造成36范围雷伤");
                    _event.getToolTip().add(3, "催动此符需要78灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu11")) {
                    _event.getToolTip().add(1, "二阶符箓");
                    _event.getToolTip().add(2, "唤出晶牢困住敌人并施加目标30秒的缓慢二");
                    _event.getToolTip().add(3, "催动此符需要50灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu25")) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "大面积破坏地形并造成152范围法伤");
                    _event.getToolTip().add(3, "催动此符需要505灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu08")) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "释放大面积烈火并造成108范围火伤");
                    _event.getToolTip().add(3, "催动此符需要440灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fei_xing_fu")) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "使用后30分钟内不消耗灵力飞行");
                    _event.getToolTip().add(3, "催动此符需要60灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fei_jian_fu")) {
                    _event.getToolTip().add(1, "三阶符宝");
                    _event.getToolTip().add(2, "发出飞剑攻击敌人造成30物伤");
                    _event.getToolTip().add(3, "催动此符需要40灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:ju_feng_fu")) {
                    _event.getToolTip().add(1, "三阶符宝");
                    _event.getToolTip().add(2, "唤出飓风造成40范围法伤");
                    _event.getToolTip().add(3, "催动此符需要100灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:tie_jia_fu")) {
                    _event.getToolTip().add(1, "三阶符箓");
                    _event.getToolTip().add(2, "释放3个物攻300物防220法防160 血量2200的铁傀儡");
                    _event.getToolTip().add(3, "催动此符需要490灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu13")) {
                    _event.getToolTip().add(1, "四阶符箓");
                    _event.getToolTip().add(2, "释放大量雷电攻击造成417范围雷伤");
                    _event.getToolTip().add(3, "催动此符需要1300灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:liu_huo_fu")) {
                    _event.getToolTip().add(1, "四阶符宝");
                    _event.getToolTip().add(2, "释放大面积流火并造成193范围火伤");
                    _event.getToolTip().add(3, "催动此符需要600灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:yin_shen_fu")) {
                    _event.getToolTip().add(1, "四阶符箓");
                    _event.getToolTip().add(2, "使用后10分钟内获得隐身");
                    _event.getToolTip().add(3, "催动此符需要300灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fulu16")) {
                    _event.getToolTip().add(1, "四阶符箓");
                    _event.getToolTip().add(2, "使目标产生混乱效果持续6秒，每秒造成233点伤害");
                    _event.getToolTip().add(3, "催动此符需要3000灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:ran_shan_fu")) {
                    _event.getToolTip().add(1, "四阶符宝");
                    _event.getToolTip().add(2, "发出火球并造成235火伤");
                    _event.getToolTip().add(3, "催动此符需要300灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:han_di_zhen_bao")) {
                    _event.getToolTip().add(1, "五阶真宝");
                    _event.getToolTip().add(2, "破坏地形并造成1542范围物伤");
                    _event.getToolTip().add(3, "催动此符需要2200灵力、50真元");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:lei_ji_fu_bao")) {
                    _event.getToolTip().add(1, "五阶符宝");
                    _event.getToolTip().add(2, "发出雷剑攻击敌人造成331雷伤");
                    _event.getToolTip().add(3, "催动此符需要900灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:wu_liang_dun_fu_bao")) {
                    _event.getToolTip().add(1, "五阶符宝");
                    _event.getToolTip().add(2, "唤出飞盾护身临时提高5秒的54物防与法防");
                    _event.getToolTip().add(3, "催动此符需要500灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:han_di_fu_bao")) {
                    _event.getToolTip().add(1, "五阶符宝");
                    _event.getToolTip().add(2, "破坏地形并造成694范围物伤");
                    _event.getToolTip().add(3, "催动此符需要2100灵力");
                }
                if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:hun_dun_jian_shi_fu")) {
                    _event.getToolTip().add(1, "五阶真宝");
                    _event.getToolTip().add(2, "放出蓄能飞箭攻击敌人造成1693法伤");
                    _event.getToolTip().add(3, "催动此符需要2300灵力、50真元");
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
