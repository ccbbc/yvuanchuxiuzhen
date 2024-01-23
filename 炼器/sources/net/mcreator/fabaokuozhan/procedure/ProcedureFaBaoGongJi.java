package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemChiYanDao;
import net.mcreator.fabaokuozhan.item.ItemMingHaiSanJianQiang;
import net.mcreator.fabaokuozhan.item.ItemPoShan;
import net.mcreator.fabaokuozhan.item.ItemQingZuFengYunJian;
import net.mcreator.fabaokuozhan.item.ItemXingDuDuanDAo;
import net.mcreator.fabaokuozhan.item.ItemZhuGun;
import net.mcreator.fabaokuozhan.item.ItemZhuQueHuan;
import net.mcreator.fabaokuozhan.potion.PotionRosefinchBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFaBaoGongJi.class */
public class ProcedureFaBaoGongJi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFaBaoGongJi(ElementsFabaokuozhanMod instance) {
        super(instance, 517);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        double d2;
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase2 = (Entity) dependencies.get("sourceentity");
        WorldServer worldServer = (World) dependencies.get("world");
        if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemPoShan.block, 1).func_77973_b()) {
            if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("额外伤害")) {
                    Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                        double d3;
                        ItemStack _stack = entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack.func_77942_o()) {
                            _stack.func_77982_d(new NBTTagCompound());
                        }
                        NBTTagCompound func_77978_p = _stack.func_77978_p();
                        if ((entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d3 = (entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加法攻");
                        } else {
                            d3 = -1.0d;
                        }
                        func_77978_p.func_74780_a("附加法攻", d3 - 12.0d);
                        ItemStack _stack2 = entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack2.func_77942_o()) {
                            _stack2.func_77982_d(new NBTTagCompound());
                        }
                        _stack2.func_77978_p().func_74757_a("额外伤害", false);
                    }, 50L, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (Math.random() > 0.5d) {
                ItemStack _stack = entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74757_a("额外伤害", true);
                ItemStack _stack2 = entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p = _stack2.func_77978_p();
                if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d2 = (entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加法攻");
                } else {
                    d2 = -1.0d;
                }
                func_77978_p.func_74780_a("附加法攻", d2 + 12.0d);
                return;
            }
            return;
        }
        if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemZhuGun.block, 1).func_77973_b()) {
            if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("额外伤害")) {
                    Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                        double d3;
                        ItemStack _stack3 = entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack3.func_77942_o()) {
                            _stack3.func_77982_d(new NBTTagCompound());
                        }
                        NBTTagCompound func_77978_p2 = _stack3.func_77978_p();
                        if ((entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d3 = (entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加法攻");
                        } else {
                            d3 = -1.0d;
                        }
                        func_77978_p2.func_74780_a("附加法攻", d3 - 13.0d);
                        ItemStack _stack4 = entityLivingBase2 instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase2).func_184614_ca() : ItemStack.field_190927_a;
                        if (!_stack4.func_77942_o()) {
                            _stack4.func_77982_d(new NBTTagCompound());
                        }
                        _stack4.func_77978_p().func_74757_a("额外伤害", false);
                    }, 50L, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (Math.random() > 0.5d) {
                ItemStack _stack3 = entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74757_a("额外伤害", true);
                ItemStack _stack4 = entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p2 = _stack4.func_77978_p();
                if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d = (entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("附加法攻");
                } else {
                    d = -1.0d;
                }
                func_77978_p2.func_74780_a("附加法攻", d + 13.0d);
                return;
            }
            return;
        }
        if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemXingDuDuanDAo.block, 1).func_77973_b()) {
            entityLivingBase.getEntityData().func_74780_a("BePoisonAttack", (entityLivingBase2.getEntityData().func_74769_h("PoisonAttack") * 1.5d) + 33.0d);
            return;
        }
        if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChiYanDao.block, 1).func_77973_b()) {
            if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("威能")) {
                    entityLivingBase2.getEntityData().func_74780_a("BeFireAttack", entityLivingBase2.getEntityData().func_74769_h("FireDefense") + entityLivingBase2.getEntityData().func_74769_h("BeFireAttack") + 1.0d);
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityLivingBase).field_70165_t, ((Entity) entityLivingBase).field_70163_u, ((Entity) entityLivingBase).field_70161_v, 30, 0.3d, 0.3d, 0.3d, 0.1d, new int[0]);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemZhuQueHuan.block, 1).func_77973_b()) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(PotionRosefinchBuff.potion, 100, 1, false, false));
                return;
            }
            return;
        }
        if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemQingZuFengYunJian.block, 1).func_77973_b()) {
            entityLivingBase2.getEntityData().func_74780_a("清风剑计时", 80.0d);
            if (entityLivingBase2.getEntityData().func_74769_h("清风剑累计") < 40.0d) {
                entityLivingBase2.getEntityData().func_74780_a("ThunderAttackTemp", entityLivingBase2.getEntityData().func_74769_h("ThunderAttackTemp") - entityLivingBase2.getEntityData().func_74769_h("清风剑累计"));
                entityLivingBase2.getEntityData().func_74780_a("ThunderAttack", entityLivingBase2.getEntityData().func_74769_h("ThunderAttack") - entityLivingBase2.getEntityData().func_74769_h("清风剑累计"));
                entityLivingBase2.getEntityData().func_74780_a("清风剑累计", entityLivingBase2.getEntityData().func_74769_h("清风剑累计") + 10.0d);
                if (entityLivingBase2.getEntityData().func_74769_h("清风剑累计") > 40.0d) {
                    entityLivingBase2.getEntityData().func_74780_a("清风剑累计", 40.0d);
                }
                entityLivingBase2.getEntityData().func_74780_a("ThunderAttack", entityLivingBase2.getEntityData().func_74769_h("ThunderAttack") + entityLivingBase2.getEntityData().func_74769_h("清风剑累计"));
                entityLivingBase2.getEntityData().func_74780_a("ThunderAttackTemp", entityLivingBase2.getEntityData().func_74769_h("ThunderAttackTemp") + entityLivingBase2.getEntityData().func_74769_h("清风剑累计"));
                return;
            }
            return;
        }
        if ((entityLivingBase2 instanceof EntityLivingBase ? entityLivingBase2.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemMingHaiSanJianQiang.block, 1).func_77973_b()) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entityLivingBase instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase).func_110143_aJ() : -1.0f) <= 0.0f && entityLivingBase2.getEntityData().func_74769_h("SanJianQiangPassive") < 25.0d) {
                    entityLivingBase2.getEntityData().func_74780_a("SanJianQiangPassive", entityLivingBase2.getEntityData().func_74769_h("SanJianQiangPassive") + 1.0d);
                    entityLivingBase2.getEntityData().func_74780_a("PoisonAttack", entityLivingBase2.getEntityData().func_74769_h("PoisonAttack") + 1.0d);
                    if ((entityLivingBase2 instanceof EntityPlayer) && !entityLivingBase2.field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase2).func_146105_b(new TextComponentString("§a使用冥海三尖枪杀死一个生物永久获得了1毒攻,已增加[" + new DecimalFormat("0").format(entityLivingBase2.getEntityData().func_74769_h("SanJianQiangPassive")) + "]点毒攻"), false);
                    }
                    if (entityLivingBase2.getEntityData().func_74769_h("SanJianQiangPassive") >= 25.0d && (entityLivingBase2 instanceof EntityPlayer) && !entityLivingBase2.field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase2).func_146105_b(new TextComponentString("§e你已经累计使用冥海三尖枪杀死一个生物永久获得了25毒攻,之后的击杀将不会给你带来永久的毒属性"), false);
                    }
                }
            }, 50L, TimeUnit.MILLISECONDS);
        }
    }

    @SubscribeEvent
    public void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            float amount = event.getAmount();
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("amount", Float.valueOf(amount));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            dependencies.put("sourceentity", event.getSource().func_76346_g());
            dependencies.put("imediatesourceentity", event.getSource().func_76364_f());
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
