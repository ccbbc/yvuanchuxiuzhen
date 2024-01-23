package net.mcreator.yuanchuzhushou.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.YuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.gui.GuiZhuShouGui;
import net.mcreator.yuanchuzhushou.item.ItemZhuShou;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureZhuShouYouJian.class */
public class ProcedureZhuShouYouJian extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureZhuShouYouJian(ElementsYuanchuzhushouMod instance) {
        super(instance, 3);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        String str;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        String str2;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityLivingBase.func_70003_b(4, "")) {
            entityLivingBase.getEntityData().func_74780_a("工具数值", 0.0d);
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemZhuShou.block, 1).func_77973_b()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemZhuShou.block, 1).func_77973_b()) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("破坏模式")) {
                            if (entityLivingBase.func_70093_af()) {
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(Items.field_151055_y, 1).func_77973_b()) {
                                    ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                    if (!_stack.func_77942_o()) {
                                        _stack.func_77982_d(new NBTTagCompound());
                                    }
                                    _stack.func_77978_p().func_74757_a("破坏模式", false);
                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("助手已关闭破坏模式"), false);
                                    }
                                } else {
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(Items.field_151103_aS, 1).func_77973_b()) {
                                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("掉落模式")) {
                                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("助手已关闭方块掉落模式"), false);
                                                }
                                                ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                                if (!_stack2.func_77942_o()) {
                                                    _stack2.func_77982_d(new NBTTagCompound());
                                                }
                                                _stack2.func_77978_p().func_74757_a("掉落模式", false);
                                            }
                                        }
                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("助手已开启方块掉落模式"), false);
                                        }
                                        ItemStack _stack3 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                        if (!_stack3.func_77942_o()) {
                                            _stack3.func_77982_d(new NBTTagCompound());
                                        }
                                        _stack3.func_77978_p().func_74757_a("掉落模式", true);
                                    } else {
                                        ItemStack _stack4 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                        if (!_stack4.func_77942_o()) {
                                            _stack4.func_77982_d(new NBTTagCompound());
                                        }
                                        _stack4.func_77978_p().func_74778_a("指定方块", (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString());
                                        ItemStack _stack5 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                        if (!_stack5.func_77942_o()) {
                                            _stack5.func_77982_d(new NBTTagCompound());
                                        }
                                        _stack5.func_77978_p().func_74780_a("数量1", 0.0d);
                                        ItemStack _stack6 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                        if (!_stack6.func_77942_o()) {
                                            _stack6.func_77982_d(new NBTTagCompound());
                                        }
                                        _stack6.func_77978_p().func_74780_a("数量2", 0.0d);
                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("助手已设置探测方块并清空采集数据！"), false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (entityLivingBase.func_70093_af()) {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("快捷使用")) {
                                Map<String, Object> $_dependencies = new HashMap<>();
                                $_dependencies.put("entity", entityLivingBase);
                                ProcedureKuaiJieShiYong.executeProcedure($_dependencies);
                            }
                        }
                    } else if (entityLivingBase instanceof EntityPlayer) {
                        ((EntityPlayer) entityLivingBase).openGui(YuanchuzhushouMod.instance, GuiZhuShouGui.GUIID, world, x, y, z);
                    }
                }
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemZhuShou.block, 1).func_77973_b()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemZhuShou.block, 1).func_77973_b()) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74767_n("坐标A")) {
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                str = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74779_i("方块名");
                            } else {
                                str = "";
                            }
                            if (str.equals("")) {
                                ItemStack _stack7 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                                if (!_stack7.func_77942_o()) {
                                    _stack7.func_77982_d(new NBTTagCompound());
                                }
                                _stack7.func_77978_p().func_74778_a("方块名", "air");
                            }
                            ItemStack _stack8 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                            if (!_stack8.func_77942_o()) {
                                _stack8.func_77982_d(new NBTTagCompound());
                            }
                            _stack8.func_77978_p().func_74780_a("坐标Xa", ((Entity) entityLivingBase).field_70165_t);
                            ItemStack _stack9 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                            if (!_stack9.func_77942_o()) {
                                _stack9.func_77982_d(new NBTTagCompound());
                            }
                            _stack9.func_77978_p().func_74780_a("坐标Ya", ((Entity) entityLivingBase).field_70163_u - 1.0d);
                            ItemStack _stack10 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                            if (!_stack10.func_77942_o()) {
                                _stack10.func_77982_d(new NBTTagCompound());
                            }
                            _stack10.func_77978_p().func_74780_a("坐标Za", ((Entity) entityLivingBase).field_70161_v);
                            if (!world.field_72995_K && world.func_73046_m() != null) {
                                ICommandManager func_71187_D = world.func_73046_m().func_71187_D();
                                ICommandSender iCommandSender = new ICommandSender() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureZhuShouYouJian.1
                                    public String func_70005_c_() {
                                        return "";
                                    }

                                    public boolean func_70003_b(int permission, String command) {
                                        return true;
                                    }

                                    public World func_130014_f_() {
                                        return world;
                                    }

                                    public MinecraftServer func_184102_h() {
                                        return world.func_73046_m();
                                    }

                                    public boolean func_174792_t_() {
                                        return false;
                                    }

                                    public BlockPos func_180425_c() {
                                        return new BlockPos(x, y, z);
                                    }

                                    public Vec3d func_174791_d() {
                                        return new Vec3d(x, y, z);
                                    }
                                };
                                StringBuilder append = new StringBuilder().append("fill ");
                                DecimalFormat decimalFormat = new DecimalFormat("0");
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                    d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("坐标Xa");
                                } else {
                                    d = -1.0d;
                                }
                                StringBuilder append2 = append.append(decimalFormat.format(d)).append("").append(" ").append("");
                                DecimalFormat decimalFormat2 = new DecimalFormat("0");
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                    d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("坐标Ya");
                                } else {
                                    d2 = -1.0d;
                                }
                                StringBuilder append3 = append2.append(decimalFormat2.format(d2)).append("").append(" ").append("");
                                DecimalFormat decimalFormat3 = new DecimalFormat("0");
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                    d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("坐标Za");
                                } else {
                                    d3 = -1.0d;
                                }
                                StringBuilder append4 = append3.append(decimalFormat3.format(d3)).append("").append(" ").append("");
                                DecimalFormat decimalFormat4 = new DecimalFormat("0");
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                    d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("坐标X");
                                } else {
                                    d4 = -1.0d;
                                }
                                StringBuilder append5 = append4.append(decimalFormat4.format(d4)).append("").append(" ").append("");
                                DecimalFormat decimalFormat5 = new DecimalFormat("0");
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                    d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("坐标Y");
                                } else {
                                    d5 = -1.0d;
                                }
                                StringBuilder append6 = append5.append(decimalFormat5.format(d5)).append("").append(" ").append("");
                                DecimalFormat decimalFormat6 = new DecimalFormat("0");
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                    d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("坐标Z");
                                } else {
                                    d6 = -1.0d;
                                }
                                StringBuilder append7 = append6.append(decimalFormat6.format(d6)).append("").append(" ").append("");
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                                    str2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74779_i("方块名");
                                } else {
                                    str2 = "";
                                }
                                func_71187_D.func_71556_a(iCommandSender, append7.append(str2).toString());
                            }
                            ItemStack _stack11 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                            if (!_stack11.func_77942_o()) {
                                _stack11.func_77982_d(new NBTTagCompound());
                            }
                            _stack11.func_77978_p().func_74757_a("坐标A", false);
                            return;
                        }
                    }
                    ItemStack _stack12 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                    if (!_stack12.func_77942_o()) {
                        _stack12.func_77982_d(new NBTTagCompound());
                    }
                    _stack12.func_77978_p().func_74780_a("坐标X", ((Entity) entityLivingBase).field_70165_t);
                    ItemStack _stack13 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                    if (!_stack13.func_77942_o()) {
                        _stack13.func_77982_d(new NBTTagCompound());
                    }
                    _stack13.func_77978_p().func_74780_a("坐标Y", ((Entity) entityLivingBase).field_70163_u - 1.0d);
                    ItemStack _stack14 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                    if (!_stack14.func_77942_o()) {
                        _stack14.func_77982_d(new NBTTagCompound());
                    }
                    _stack14.func_77978_p().func_74780_a("坐标Z", ((Entity) entityLivingBase).field_70161_v);
                    ItemStack _stack15 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                    if (!_stack15.func_77942_o()) {
                        _stack15.func_77982_d(new NBTTagCompound());
                    }
                    _stack15.func_77978_p().func_74757_a("坐标A", true);
                }
            }
        } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§4开发者已关闭非管理者的功能访问权限！"), false);
        }
    }
}
