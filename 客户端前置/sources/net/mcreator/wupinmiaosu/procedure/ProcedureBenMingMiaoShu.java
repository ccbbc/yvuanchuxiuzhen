package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoQiYinXiao1;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoQiYinXiao2;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoQiYinXiao3;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoRanshanjian;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoShenghuangqiang;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoWuxingjian;
import net.mcreator.wupinmiaosu.gui.GuiQinZuFengYuJian1;
import net.mcreator.wupinmiaosu.gui.GuiQinZuFengYuJian2;
import net.mcreator.wupinmiaosu.gui.GuiQinZuFengYuJian3;
import net.mcreator.wupinmiaosu.gui.GuiQingzhufengyunjian;
import net.mcreator.wupinmiaosu.gui.GuiQiyinxiao;
import net.mcreator.wupinmiaosu.gui.GuiRanShanJian1;
import net.mcreator.wupinmiaosu.gui.GuiRanShanJian2;
import net.mcreator.wupinmiaosu.gui.GuiShengHuangQiang1;
import net.mcreator.wupinmiaosu.gui.GuiShengHuangQiang2;
import net.mcreator.wupinmiaosu.gui.GuiWuXingJian1;
import net.mcreator.wupinmiaosu.gui.GuiWuXingJian2;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan1;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan2;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan3;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureBenMingMiaoShu.class */
public class ProcedureBenMingMiaoShu extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureBenMingMiaoShu(ElementsWupinmiaosuMod instance) {
        super(instance, 113);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qi_yin_xiao")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d18 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d18 = -1.0d;
            }
            if (d18 != 0.0d) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d19 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                } else {
                    d19 = -1.0d;
                }
                if (d19 != 1.0d) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d20 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                    } else {
                        d20 = -1.0d;
                    }
                    if (d20 == 2.0d) {
                        if (entityLivingBase instanceof EntityPlayer) {
                            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoQiYinXiao2.GUIID, world, x, y, z);
                        }
                    } else {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d21 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                        } else {
                            d21 = -1.0d;
                        }
                        if (d21 == 3.0d && (entityLivingBase instanceof EntityPlayer)) {
                            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoQiYinXiao3.GUIID, world, x, y, z);
                        }
                    }
                } else if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoQiYinXiao1.GUIID, world, x, y, z);
                }
            } else if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiQiyinxiao.GUIID, world, x, y, z);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhu_que_huan")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d14 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d14 = -1.0d;
            }
            if (d14 != 0.0d) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d15 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                } else {
                    d15 = -1.0d;
                }
                if (d15 != 1.0d) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d16 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                    } else {
                        d16 = -1.0d;
                    }
                    if (d16 == 2.0d) {
                        if (entityLivingBase instanceof EntityPlayer) {
                            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiZhuQueHuan2.GUIID, world, x, y, z);
                        }
                    } else {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d17 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                        } else {
                            d17 = -1.0d;
                        }
                        if (d17 == 3.0d && (entityLivingBase instanceof EntityPlayer)) {
                            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiZhuQueHuan3.GUIID, world, x, y, z);
                        }
                    }
                } else if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiZhuQueHuan1.GUIID, world, x, y, z);
                }
            } else if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiZhuQueHuan.GUIID, world, x, y, z);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qing_zu_feng_yun_jian")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d10 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d10 = -1.0d;
            }
            if (d10 != 0.0d) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d11 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                } else {
                    d11 = -1.0d;
                }
                if (d11 != 1.0d) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d12 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                    } else {
                        d12 = -1.0d;
                    }
                    if (d12 == 2.0d) {
                        if (entityLivingBase instanceof EntityPlayer) {
                            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiQinZuFengYuJian2.GUIID, world, x, y, z);
                        }
                    } else {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d13 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                        } else {
                            d13 = -1.0d;
                        }
                        if (d13 == 3.0d && (entityLivingBase instanceof EntityPlayer)) {
                            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiQinZuFengYuJian3.GUIID, world, x, y, z);
                        }
                    }
                } else if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiQinZuFengYuJian1.GUIID, world, x, y, z);
                }
            } else if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiQingzhufengyunjian.GUIID, world, x, y, z);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0201")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d7 = -1.0d;
            }
            if (d7 != 0.0d) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                } else {
                    d8 = -1.0d;
                }
                if (d8 == 1.0d) {
                    if (entityLivingBase instanceof EntityPlayer) {
                        ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiShengHuangQiang1.GUIID, world, x, y, z);
                    }
                } else {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d9 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                    } else {
                        d9 = -1.0d;
                    }
                    if (d9 == 2.0d && (entityLivingBase instanceof EntityPlayer)) {
                        ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiShengHuangQiang2.GUIID, world, x, y, z);
                    }
                }
            } else if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoShenghuangqiang.GUIID, world, x, y, z);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1001")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d4 = -1.0d;
            }
            if (d4 != 0.0d) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                } else {
                    d5 = -1.0d;
                }
                if (d5 == 1.0d) {
                    if (entityLivingBase instanceof EntityPlayer) {
                        ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiWuXingJian1.GUIID, world, x, y, z);
                    }
                } else {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                    } else {
                        d6 = -1.0d;
                    }
                    if (d6 == 2.0d && (entityLivingBase instanceof EntityPlayer)) {
                        ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiWuXingJian2.GUIID, world, x, y, z);
                    }
                }
            } else if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoWuxingjian.GUIID, world, x, y, z);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao33")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d = -1.0d;
            }
            if (d == 0.0d) {
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoRanshanjian.GUIID, world, x, y, z);
                    return;
                }
                return;
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d2 = -1.0d;
            }
            if (d2 == 1.0d) {
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiRanShanJian1.GUIID, world, x, y, z);
                    return;
                }
                return;
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d3 = -1.0d;
            }
            if (d3 == 2.0d && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiRanShanJian2.GUIID, world, x, y, z);
            }
        }
    }
}
