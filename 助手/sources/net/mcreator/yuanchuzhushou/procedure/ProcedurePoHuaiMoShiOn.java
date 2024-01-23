package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedurePoHuaiMoShiOn.class */
public class ProcedurePoHuaiMoShiOn extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedurePoHuaiMoShiOn(ElementsYuanchuzhushouMod instance) {
        super(instance, 54);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        String str;
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
        double d22;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!entityLivingBase.func_70003_b(4, "")) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§4开发者已关闭非管理者的功能访问权限！"), false);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("破坏模式")) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    entityLivingBase.getEntityData().func_74780_a("weizhiX", -10.0d);
                    entityLivingBase.getEntityData().func_74780_a("weizhiY", -10.0d);
                    entityLivingBase.getEntityData().func_74780_a("weizhiZ", -10.0d);
                    ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    _stack.func_77978_p().func_74780_a("weizhiX", -10.0d);
                    ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack2.func_77942_o()) {
                        _stack2.func_77982_d(new NBTTagCompound());
                    }
                    _stack2.func_77978_p().func_74780_a("weizhiY", -10.0d);
                    ItemStack _stack3 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack3.func_77942_o()) {
                        _stack3.func_77982_d(new NBTTagCompound());
                    }
                    _stack3.func_77978_p().func_74780_a("weizhiZ", -10.0d);
                    for (int index0 = 0; index0 < 20; index0++) {
                        ItemStack _stack4 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack4.func_77942_o()) {
                            _stack4.func_77982_d(new NBTTagCompound());
                        }
                        _stack4.func_77978_p().func_74780_a("weizhiY", -10.0d);
                        for (int index1 = 0; index1 < 20; index1++) {
                            ItemStack _stack5 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                            if (!_stack5.func_77942_o()) {
                                _stack5.func_77982_d(new NBTTagCompound());
                            }
                            _stack5.func_77978_p().func_74780_a("weizhiX", -10.0d);
                            for (int index2 = 0; index2 < 20; index2++) {
                                double d23 = x;
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiX");
                                } else {
                                    d5 = -1.0d;
                                }
                                int i = (int) (d23 + d5);
                                double d24 = y;
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiY");
                                } else {
                                    d6 = -1.0d;
                                }
                                int i2 = (int) (d24 + d6);
                                double d25 = z;
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiZ");
                                } else {
                                    d7 = -1.0d;
                                }
                                String resourceLocation = new ItemStack(world.func_180495_p(new BlockPos(i, i2, (int) (d25 + d7))).func_177230_c()).func_77973_b().getRegistryName().toString();
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    str = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("指定方块");
                                } else {
                                    str = "";
                                }
                                if (!resourceLocation.equals(str)) {
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("掉落模式")) {
                                            double d26 = x;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d14 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiX");
                                            } else {
                                                d14 = -1.0d;
                                            }
                                            int i3 = (int) (d26 + d14);
                                            double d27 = y;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d15 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiY");
                                            } else {
                                                d15 = -1.0d;
                                            }
                                            int i4 = (int) (d27 + d15);
                                            double d28 = z;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d16 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiZ");
                                            } else {
                                                d16 = -1.0d;
                                            }
                                            Block func_177230_c = world.func_180495_p(new BlockPos(i3, i4, (int) (d28 + d16))).func_177230_c();
                                            BlockPos blockPos = new BlockPos(x, y, z);
                                            double d29 = x;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d17 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiX");
                                            } else {
                                                d17 = -1.0d;
                                            }
                                            int i5 = (int) (d29 + d17);
                                            double d30 = y;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d18 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiY");
                                            } else {
                                                d18 = -1.0d;
                                            }
                                            int i6 = (int) (d30 + d18);
                                            double d31 = z;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d19 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiZ");
                                            } else {
                                                d19 = -1.0d;
                                            }
                                            func_177230_c.func_176226_b(world, blockPos, world.func_180495_p(new BlockPos(i5, i6, (int) (d31 + d19))), 1);
                                            double d32 = x;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d20 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiX");
                                            } else {
                                                d20 = -1.0d;
                                            }
                                            int i7 = (int) (d32 + d20);
                                            double d33 = y;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d21 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiY");
                                            } else {
                                                d21 = -1.0d;
                                            }
                                            int i8 = (int) (d33 + d21);
                                            double d34 = z;
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                d22 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiZ");
                                            } else {
                                                d22 = -1.0d;
                                            }
                                            world.func_175698_g(new BlockPos(i7, i8, (int) (d34 + d22)));
                                        }
                                    }
                                    double d35 = x;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d10 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiX");
                                    } else {
                                        d10 = -1.0d;
                                    }
                                    int i9 = (int) (d35 + d10);
                                    double d36 = y;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d11 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiY");
                                    } else {
                                        d11 = -1.0d;
                                    }
                                    int i10 = (int) (d36 + d11);
                                    double d37 = z;
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d12 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiZ");
                                    } else {
                                        d12 = -1.0d;
                                    }
                                    world.func_175698_g(new BlockPos(i9, i10, (int) (d37 + d12)));
                                    ItemStack _stack6 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                    if (!_stack6.func_77942_o()) {
                                        _stack6.func_77982_d(new NBTTagCompound());
                                    }
                                    NBTTagCompound func_77978_p = _stack6.func_77978_p();
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d13 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("数量1");
                                    } else {
                                        d13 = -1.0d;
                                    }
                                    func_77978_p.func_74780_a("数量1", d13 + 1.0d);
                                } else {
                                    ItemStack _stack7 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                    if (!_stack7.func_77942_o()) {
                                        _stack7.func_77982_d(new NBTTagCompound());
                                    }
                                    NBTTagCompound func_77978_p2 = _stack7.func_77978_p();
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                        d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("数量2");
                                    } else {
                                        d8 = -1.0d;
                                    }
                                    func_77978_p2.func_74780_a("数量2", d8 + 1.0d);
                                }
                                ItemStack _stack8 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                                if (!_stack8.func_77942_o()) {
                                    _stack8.func_77982_d(new NBTTagCompound());
                                }
                                NBTTagCompound func_77978_p3 = _stack8.func_77978_p();
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d9 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiX");
                                } else {
                                    d9 = -1.0d;
                                }
                                func_77978_p3.func_74780_a("weizhiX", d9 + 1.0d);
                            }
                            ItemStack _stack9 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                            if (!_stack9.func_77942_o()) {
                                _stack9.func_77982_d(new NBTTagCompound());
                            }
                            NBTTagCompound func_77978_p4 = _stack9.func_77978_p();
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiY");
                            } else {
                                d4 = -1.0d;
                            }
                            func_77978_p4.func_74780_a("weizhiY", d4 + 1.0d);
                        }
                        ItemStack _stack10 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack10.func_77942_o()) {
                            _stack10.func_77982_d(new NBTTagCompound());
                        }
                        NBTTagCompound func_77978_p5 = _stack10.func_77978_p();
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("weizhiZ");
                        } else {
                            d3 = -1.0d;
                        }
                        func_77978_p5.func_74780_a("weizhiZ", d3 + 1.0d);
                    }
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        EntityPlayer entityPlayer = (EntityPlayer) entityLivingBase;
                        StringBuilder append = new StringBuilder().append("当前已定位到指定方块");
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("数量2");
                        } else {
                            d2 = -1.0d;
                        }
                        entityPlayer.func_146105_b(new TextComponentString(append.append(d2).append("").append("个").toString()), false);
                    }
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        EntityPlayer entityPlayer2 = (EntityPlayer) entityLivingBase;
                        StringBuilder append2 = new StringBuilder().append("当前已破坏非指定方块");
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("数量1");
                        } else {
                            d = -1.0d;
                        }
                        entityPlayer2.func_146105_b(new TextComponentString(append2.append(d).append("").append("个").toString()), false);
                    }
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("--------------分割线--------------"), false);
                    }
                }
            }
        }
    }
}
