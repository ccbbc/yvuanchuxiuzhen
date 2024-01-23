package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.mcreator.lianqisanqiannian.item.ItemChunJunJian;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureChunJunSay.class */
public class ProcedureChunJunSay extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureChunJunSay(ElementsLianqisanqiannianMod instance) {
        super(instance, 37);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        entityPlayer.getEntityData().func_74780_a("纯钧剑对话计时", entityPlayer.getEntityData().func_74769_h("纯钧剑对话计时") + 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("纯钧剑对话计时") >= 20.0d) {
            entityPlayer.getEntityData().func_74780_a("纯钧剑对话计时", 0.0d);
            if (!entityPlayer.getEntityData().func_74779_i("TiZhi").contains("天妒之体")) {
                if ((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(ItemChunJunJian.block, 1)) && !entityPlayer.getEntityData().func_74767_n("非天妒之体")) {
                    if (entityPlayer.getEntityData().func_74767_n("纯钧剑性格")) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 想成为我的主人可不是一件简单的事情噢！"), false);
                        }
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 我乃纯钧剑剑灵，尔等凡夫俗子也敢妄想获得我？"), false);
                    }
                    entityPlayer.getEntityData().func_74757_a("非天妒之体", true);
                } else if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(ItemChunJunJian.block, 1))) && entityPlayer.getEntityData().func_74767_n("非天妒之体")) {
                    entityPlayer.getEntityData().func_74757_a("非天妒之体", false);
                }
            } else if (entityPlayer.getEntityData().func_74779_i("TiZhi").contains("天妒之体") && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(ItemChunJunJian.block, 1)) && !entityPlayer.getEntityData().func_74767_n("纯钧剑认主")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 你便是我的主人吗？看起来长得还不错嘛。我认可你了。"), false);
                }
                entityPlayer.getEntityData().func_74757_a("纯钧剑认主", true);
            }
            if (entityPlayer.getEntityData().func_74767_n("纯钧剑认主")) {
                if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChunJunJian.block, 1).func_77973_b()) {
                    if (((Entity) entityPlayer).field_70181_x >= 0.0d && !entityPlayer.getEntityData().func_74767_n("纯钧剑对话限制3")) {
                        entityPlayer.getEntityData().func_74780_a("纯钧对话1计时", entityPlayer.getEntityData().func_74769_h("纯钧对话1计时") + 1.0d);
                        if (entityPlayer.getEntityData().func_74769_h("纯钧对话1计时") >= 60.0d) {
                            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 呜呼——！为主人痴！为主人狂！为主人哐哐撞大墙！"), false);
                            }
                            entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制3", true);
                        }
                    } else if (((Entity) entityPlayer).field_70181_x < 0.0d && entityPlayer.getEntityData().func_74767_n("纯钧剑对话限制3")) {
                        entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制3", false);
                        entityPlayer.getEntityData().func_74780_a("纯钧对话1计时", 0.0d);
                    }
                    if (!world.func_72935_r() && !entityPlayer.getEntityData().func_74767_n("纯钧剑对话限制2")) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 夜晚的星空真美，真想在天空遨游一番。"), false);
                        }
                        entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制2", true);
                    } else if (world.func_72935_r() && entityPlayer.getEntityData().func_74767_n("纯钧剑对话限制2")) {
                        entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制2", false);
                    }
                    if (!entityPlayer.getEntityData().func_74767_n("在主手时")) {
                        if (new ItemStack(world.func_180495_p(new BlockPos(x, y, z)).func_177230_c()).func_77973_b().getRegistryName().toString().contains("water")) {
                            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 主人是要捉鱼吃嘛，我也想吃，主人可以分我点嘛。"), false);
                            }
                        } else {
                            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 是要打架了吗？我最喜欢打架了！"), false);
                            }
                            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("§b我一定全力出手，帮主人把他们打的落花流水！"), false);
                            }
                        }
                        entityPlayer.getEntityData().func_74757_a("在主手时", true);
                        entityPlayer.getEntityData().func_74757_a("在副手时", false);
                        entityPlayer.getEntityData().func_74757_a("在背包时", false);
                        entityPlayer.getEntityData().func_74757_a("不在背包时", false);
                        entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制", false);
                        return;
                    }
                    return;
                }
                if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChunJunJian.block, 1).func_77973_b()) {
                    if (!entityPlayer.getEntityData().func_74767_n("在副手时")) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 主人快使用我吧，我可是很喜欢外面的，老是待在剑鞘中，我会发霉的。"), false);
                        }
                        entityPlayer.getEntityData().func_74757_a("在主手时", false);
                        entityPlayer.getEntityData().func_74757_a("在副手时", true);
                        entityPlayer.getEntityData().func_74757_a("在背包时", false);
                        entityPlayer.getEntityData().func_74757_a("不在背包时", false);
                        entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制", false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(ItemChunJunJian.block, 1))) {
                    if (!entityPlayer.getEntityData().func_74767_n("在背包时")) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 主人我要出去玩，待在这里很闷的。"), false);
                        }
                        entityPlayer.getEntityData().func_74757_a("在主手时", false);
                        entityPlayer.getEntityData().func_74757_a("在副手时", false);
                        entityPlayer.getEntityData().func_74757_a("在背包时", true);
                        entityPlayer.getEntityData().func_74757_a("不在背包时", false);
                        entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制", false);
                    }
                } else if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(ItemChunJunJian.block, 1))) && !entityPlayer.getEntityData().func_74767_n("不在背包时")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("§b<纯钧> 主人，不要让我离开你啊！！啊~啊--啊，哦，嘻嘻，终于可以一个剑偷偷玩了~"), false);
                    }
                    entityPlayer.getEntityData().func_74757_a("在主手时", false);
                    entityPlayer.getEntityData().func_74757_a("在副手时", false);
                    entityPlayer.getEntityData().func_74757_a("在背包时", false);
                    entityPlayer.getEntityData().func_74757_a("不在背包时", true);
                    entityPlayer.getEntityData().func_74757_a("纯钧剑对话限制", false);
                }
            }
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
