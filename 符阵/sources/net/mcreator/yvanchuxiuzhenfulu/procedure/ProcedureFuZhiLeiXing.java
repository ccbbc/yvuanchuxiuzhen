package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi1;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi2;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi3;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi4;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi5;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFuZhiLeiXing.class */
public class ProcedureFuZhiLeiXing extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFuZhiLeiXing(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 294);
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
                if (itemstack.func_77973_b() == new ItemStack(ItemFuZhi1.block, 1).func_77973_b()) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 2.0d) {
                            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 3.0d) {
                                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 4.0d) {
                                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 5.0d) {
                                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 6.0d) {
                                            _event.getToolTip().add(1, "一级符纸[空白]");
                                        }
                                    }
                                }
                            }
                        }
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
                } else if (itemstack.func_77973_b() == new ItemStack(ItemFuZhi2.block, 1).func_77973_b()) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 2.0d) {
                            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 3.0d) {
                                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 4.0d) {
                                    _event.getToolTip().add(1, "二级符纸[空白]");
                                }
                            }
                        }
                    }
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                        _event.getToolTip().add(1, "二级符纸[剑阵]");
                    }
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                        _event.getToolTip().add(1, "二级符纸[盾甲]");
                    }
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                        _event.getToolTip().add(1, "二级符纸[落雷]");
                    }
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                        _event.getToolTip().add(1, "二级符纸[晶牢]");
                    }
                } else if (itemstack.func_77973_b() != new ItemStack(ItemFuZhi3.block, 1).func_77973_b()) {
                    if (itemstack.func_77973_b() == new ItemStack(ItemFuZhi4.block, 1).func_77973_b()) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                            _event.getToolTip().add(1, "四级符纸[空白]");
                        }
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                            _event.getToolTip().add(1, "四级符纸[惊雷五庭]");
                        }
                    } else if (itemstack.func_77973_b() == new ItemStack(ItemFuZhi5.block, 1).func_77973_b()) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                            _event.getToolTip().add(1, "五级符纸[空白]");
                        }
                    }
                } else {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 2.0d) {
                            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 3.0d) {
                                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) != 4.0d) {
                                    _event.getToolTip().add(1, "三级符纸[空白]");
                                }
                            }
                        }
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
                }
            }
        }
    }
}
