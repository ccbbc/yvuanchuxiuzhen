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
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFuLuMiaoSu2.class */
public class ProcedureFuLuMiaoSu2 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFuLuMiaoSu2(ElementsWupinmiaosuMod instance) {
        super(instance, 8);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            System.err.println("Failed to load dependency itemstack for procedure FuLuMiaoSu2!");
        } else if (dependencies.get("tooltip") == null) {
            System.err.println("Failed to load dependency tooltip for procedure FuLuMiaoSu2!");
        } else {
            ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
            dependencies.get("tooltip");
            if (dependencies.get("event") != null) {
                Object _obj = dependencies.get("event");
                if (_obj instanceof Event) {
                    ItemTooltipEvent _event = (Event) _obj;
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fu_zhi_1")) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 0.0d) {
                            _event.getToolTip().add(1, "一级符纸[空白]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                            _event.getToolTip().add(1, "一级符纸[缠绕]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                            _event.getToolTip().add(1, "一级符纸[神行]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                            _event.getToolTip().add(1, "一级符纸[起爆]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                            _event.getToolTip().add(1, "一级符纸[龟息]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d) {
                            _event.getToolTip().add(1, "一级符纸[夜明]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 6.0d) {
                            _event.getToolTip().add(1, "一级符纸[火弹]");
                        }
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fu_zhi_2")) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 0.0d) {
                            _event.getToolTip().add(1, "二级符纸[空白]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                            _event.getToolTip().add(1, "二级符纸[剑阵]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                            _event.getToolTip().add(1, "二级符纸[护盾]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                            _event.getToolTip().add(1, "二级符纸[落雷]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                            _event.getToolTip().add(1, "二级符纸[晶牢]");
                        }
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fu_zhi_3")) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 0.0d) {
                            _event.getToolTip().add(1, "三级符纸[空白]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                            _event.getToolTip().add(1, "三级符纸[震山]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                            _event.getToolTip().add(1, "三级符纸[纵横火]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                            _event.getToolTip().add(1, "三级符纸[飞行]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                            _event.getToolTip().add(1, "三级符纸[铁甲]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d) {
                            _event.getToolTip().add(1, "三级符纸[符宝]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 6.0d) {
                            _event.getToolTip().add(1, "三级符纸[真宝]");
                        }
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fu_zhi_4")) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 0.0d) {
                            _event.getToolTip().add(1, "四级符纸[空白]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                            _event.getToolTip().add(1, "四级符纸[惊雷五庭]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                            _event.getToolTip().add(1, "四级符纸[符宝]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                            _event.getToolTip().add(1, "四级符纸[真宝]");
                        }
                    }
                    if (itemstack.func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:fu_zhi_5")) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 0.0d) {
                            _event.getToolTip().add(1, "五级符纸[空白]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                            _event.getToolTip().add(1, "四级符纸[符宝]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                            _event.getToolTip().add(1, "四级符纸[真宝]");
                        }
                    }
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
