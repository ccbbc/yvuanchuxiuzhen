package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiJianFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiXingFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu02;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu04;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu05;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu06;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu07;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu08;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu09;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu10;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu11;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu13;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu15;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu16;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu17;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu18;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu25;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu26;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu27;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu28;
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
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhaoMingFu;
import net.mcreator.yvanchuxiuzhenfulu.potion.PotionFulu1701;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulushiyongyvyan.class */
public class ProcedureFulushiyongyvyan extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulushiyongyvyan(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 77);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        world.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuxiuzhenfulu:fulufashe")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
        if (itemstack.func_77973_b() == new ItemStack(ItemFulu02.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张丝缕缠符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemLiuHuoFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("流火符宝发动"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu04.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张起爆符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu05.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张落雷符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu06.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张连爆符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu07.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张血遁符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu08.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张纵横火符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu09.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张盾甲符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu10.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张浮空符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu11.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张晶牢符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu13.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张惊庭五雷符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemTieJiaFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张铁甲符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu15.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张大树界符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu16.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张神傀符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu17.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张大将军镇尸符"), false);
            }
            if (entityPlayer instanceof EntityLivingBase) {
                ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(PotionFulu1701.potion, 200, 1, false, false));
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu18.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张强压符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu25.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张震山符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu26.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张剑符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemHuoDanFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张火弹符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu03.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("使用一张神行符"), false);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemFulu27.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张炮符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu28.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张兵阵符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemZhaoMingFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张照明符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemHunDunJianShiFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张混沌箭矢符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemHuDunFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张护盾符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFeiJianFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("飞剑符宝发动"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemJuFengFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("飓风符宝发动"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemRanShanFu.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("燃山符宝发动"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemHanDiZhenBao.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("使用一张撼地符"), false);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemLeiJiFuBao.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("雷击符宝发动"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemHanDiFuBao.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("撼地符宝发动"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFeiXingFu.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("使用一张飞行符"), false);
        }
    }
}
