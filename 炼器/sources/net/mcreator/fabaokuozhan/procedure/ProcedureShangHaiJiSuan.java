package net.mcreator.fabaokuozhan.procedure;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFaBao33;
import net.mcreator.fabaokuozhan.item.ItemFabao0501;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureShangHaiJiSuan.class */
public class ProcedureShangHaiJiSuan extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShangHaiJiSuan(ElementsFabaokuozhanMod instance) {
        super(instance, 446);
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShangHaiJiSuan$1] */
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
        double d22;
        double d23;
        double d24;
        double d25;
        double d26;
        double d27;
        double d28;
        double d29;
        double d30;
        double d31;
        double d32;
        double d33;
        double d34;
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("sourceentity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("淬炼普攻");
        } else {
            d = -1.0d;
        }
        if (d > 0.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("物理")) {
                    NBTTagCompound entityData = entity.getEntityData();
                    double func_74769_h = entity.getEntityData().func_74769_h("BeAttack");
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d34 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("淬炼普攻");
                    } else {
                        d34 = -1.0d;
                    }
                    entityData.func_74780_a("BeAttack", func_74769_h + d34);
                }
            }
            NBTTagCompound entityData2 = entity.getEntityData();
            double func_74769_h2 = entity.getEntityData().func_74769_h("BeMagicAttack");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d33 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("淬炼普攻");
            } else {
                d33 = -1.0d;
            }
            entityData2.func_74780_a("BeMagicAttack", func_74769_h2 + d33);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加物攻");
        } else {
            d2 = -1.0d;
        }
        if (d2 > 0.0d) {
            NBTTagCompound entityData3 = entity.getEntityData();
            double func_74769_h3 = entity.getEntityData().func_74769_h("BeAttack");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d32 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加物攻");
            } else {
                d32 = -1.0d;
            }
            entityData3.func_74780_a("BeAttack", func_74769_h3 + d32);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加法攻");
        } else {
            d3 = -1.0d;
        }
        if (d3 > 0.0d) {
            NBTTagCompound entityData4 = entity.getEntityData();
            double func_74769_h4 = entity.getEntityData().func_74769_h("BeMagicAttack");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d31 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加法攻");
            } else {
                d31 = -1.0d;
            }
            entityData4.func_74780_a("BeMagicAttack", func_74769_h4 + d31);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加雷攻");
        } else {
            d4 = -1.0d;
        }
        if (d4 > 0.0d) {
            NBTTagCompound entityData5 = entity.getEntityData();
            double func_74769_h5 = entity.getEntityData().func_74769_h("BeThunderAttack");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d30 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加雷攻");
            } else {
                d30 = -1.0d;
            }
            entityData5.func_74780_a("BeThunderAttack", func_74769_h5 + d30);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加火攻");
        } else {
            d5 = -1.0d;
        }
        if (d5 > 0.0d) {
            NBTTagCompound entityData6 = entity.getEntityData();
            double func_74769_h6 = entity.getEntityData().func_74769_h("BeFireAttack");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d29 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加火攻");
            } else {
                d29 = -1.0d;
            }
            entityData6.func_74780_a("BeFireAttack", func_74769_h6 + d29);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加毒攻");
        } else {
            d6 = -1.0d;
        }
        if (d6 > 0.0d) {
            NBTTagCompound entityData7 = entity.getEntityData();
            double func_74769_h7 = entity.getEntityData().func_74769_h("BePoisonAttack");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d28 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加毒攻");
            } else {
                d28 = -1.0d;
            }
            entityData7.func_74780_a("BePoisonAttack", func_74769_h7 + d28);
        }
        if (entity.getEntityData().func_74767_n("连击")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d18 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击物攻");
            } else {
                d18 = -1.0d;
            }
            if (d18 > 0.0d) {
                NBTTagCompound entityData8 = entity.getEntityData();
                double func_74769_h8 = entity.getEntityData().func_74769_h("BeAttack");
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d27 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击物攻");
                } else {
                    d27 = -1.0d;
                }
                entityData8.func_74780_a("BeAttack", func_74769_h8 + d27);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d19 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击法攻");
            } else {
                d19 = -1.0d;
            }
            if (d19 > 0.0d) {
                NBTTagCompound entityData9 = entity.getEntityData();
                double func_74769_h9 = entity.getEntityData().func_74769_h("BeMagicAttack");
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d26 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击法攻");
                } else {
                    d26 = -1.0d;
                }
                entityData9.func_74780_a("BeMagicAttack", func_74769_h9 + d26);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d20 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击雷攻");
            } else {
                d20 = -1.0d;
            }
            if (d20 > 0.0d) {
                NBTTagCompound entityData10 = entity.getEntityData();
                double func_74769_h10 = entity.getEntityData().func_74769_h("BeThunderAttack");
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d25 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击雷攻");
                } else {
                    d25 = -1.0d;
                }
                entityData10.func_74780_a("BeThunderAttack", func_74769_h10 + d25);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d21 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击火攻");
            } else {
                d21 = -1.0d;
            }
            if (d21 > 0.0d) {
                NBTTagCompound entityData11 = entity.getEntityData();
                double func_74769_h11 = entity.getEntityData().func_74769_h("BeFireAttack");
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d24 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击火攻");
                } else {
                    d24 = -1.0d;
                }
                entityData11.func_74780_a("BeFireAttack", func_74769_h11 + d24);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d22 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击毒攻");
            } else {
                d22 = -1.0d;
            }
            if (d22 > 0.0d) {
                NBTTagCompound entityData12 = entity.getEntityData();
                double func_74769_h12 = entity.getEntityData().func_74769_h("BePoisonAttack");
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d23 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("连击毒攻");
                } else {
                    d23 = -1.0d;
                }
                entityData12.func_74780_a("BePoisonAttack", func_74769_h12 + d23);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("物攻增幅");
        } else {
            d7 = -1.0d;
        }
        if (d7 > 0.0d) {
            NBTTagCompound entityData13 = entity.getEntityData();
            double func_74769_h13 = entity.getEntityData().func_74769_h("BeAttackAdd");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d17 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("物攻增幅");
            } else {
                d17 = -1.0d;
            }
            entityData13.func_74780_a("BeAttackAdd", func_74769_h13 + d17);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("法攻增幅");
        } else {
            d8 = -1.0d;
        }
        if (d8 > 0.0d) {
            NBTTagCompound entityData14 = entity.getEntityData();
            double func_74769_h14 = entity.getEntityData().func_74769_h("BeMagicAdd");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d16 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("法攻增幅");
            } else {
                d16 = -1.0d;
            }
            entityData14.func_74780_a("BeMagicAdd", func_74769_h14 + d16);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d9 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("雷攻增幅");
        } else {
            d9 = -1.0d;
        }
        if (d9 > 0.0d) {
            NBTTagCompound entityData15 = entity.getEntityData();
            double func_74769_h15 = entity.getEntityData().func_74769_h("BeThunderAdd");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d15 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("雷攻增幅");
            } else {
                d15 = -1.0d;
            }
            entityData15.func_74780_a("BeThunderAdd", func_74769_h15 + d15);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d10 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("火攻增幅");
        } else {
            d10 = -1.0d;
        }
        if (d10 > 0.0d) {
            NBTTagCompound entityData16 = entity.getEntityData();
            double func_74769_h16 = entity.getEntityData().func_74769_h("BeFireAdd");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d14 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("火攻增幅");
            } else {
                d14 = -1.0d;
            }
            entityData16.func_74780_a("BeFireAdd", func_74769_h16 + d14);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d11 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("毒攻增幅");
        } else {
            d11 = -1.0d;
        }
        if (d11 > 0.0d) {
            NBTTagCompound entityData17 = entity.getEntityData();
            double func_74769_h17 = entity.getEntityData().func_74769_h("BePoisonAdd");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d13 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("毒攻增幅");
            } else {
                d13 = -1.0d;
            }
            entityData17.func_74780_a("BePoisonAdd", func_74769_h17 + d13);
        }
        if (entity.getEntityData().func_74767_n("圣皇枪连击")) {
            entity.getEntityData().func_74780_a("BeAttackAdd", entity.getEntityData().func_74769_h("BeAttackAdd") + 1.0d);
            entity.getEntityData().func_74757_a("圣皇枪连击", false);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFaBao33.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("威能")) {
                    if (Math.random() < 0.7d) {
                        entity.getEntityData().func_74780_a("暴击倍率", 2.0d);
                    }
                    ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    _stack.func_77978_p().func_74757_a("威能", false);
                }
            }
            if (Math.random() < 0.35d) {
                entity.getEntityData().func_74780_a("暴击倍率", 1.0d);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0501.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= 0.2d * (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f)) {
                entity.getEntityData().func_74780_a("BeAttackAdd", entity.getEntityData().func_74769_h("BeAttackAdd") + 1.0d);
            }
        }
        if (entityLivingBase.getEntityData().func_74769_h("金箍棒威能") > 0.0d && Math.random() <= 0.75d) {
            List<Entity> _entfound = (List) world.func_175647_a(Entity.class, new AxisAlignedBB(x - 5.0d, y - 5.0d, z - 5.0d, x + 5.0d, y + 5.0d, z + 5.0d), (Predicate) null).stream().sorted(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShangHaiJiSuan.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparing(_entcnd -> {
                        return Double.valueOf(_entcnd.func_70092_e(_x, _y, _z));
                    });
                }
            }.compareDistOf(x, y, z)).collect(Collectors.toList());
            for (Entity entityiterator : _entfound) {
                if (entityiterator.getEntityData().func_74767_n("金箍棒连击")) {
                    NBTTagCompound entityData18 = entityiterator.getEntityData();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d12 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("法攻增幅");
                    } else {
                        d12 = -1.0d;
                    }
                    entityData18.func_74780_a("BeMagicAttack", 2.0d * (1.0d + d12) * (238.0d + entityLivingBase.getEntityData().func_74769_h("MagicAttack")));
                    entityiterator.getEntityData().func_74757_a("金箍棒连击", false);
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70691_i((float) (((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) - (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f)) * 0.01d));
                    }
                }
            }
        }
    }
}
