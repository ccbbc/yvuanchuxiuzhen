package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockLiandan0101;
import net.mcreator.yvanchuliandan.block.BlockLiandan0102;
import net.mcreator.yvanchuliandan.block.BlockLiandan0201;
import net.mcreator.yvanchuliandan.block.BlockLiandan0202;
import net.mcreator.yvanchuliandan.block.BlockLiandan0301;
import net.mcreator.yvanchuliandan.block.BlockLiandan0302;
import net.mcreator.yvanchuliandan.block.BlockLiandan0401;
import net.mcreator.yvanchuliandan.block.BlockLiandan0402;
import net.mcreator.yvanchuliandan.block.BlockLiandan0501;
import net.mcreator.yvanchuliandan.block.BlockLiandan0502;
import net.mcreator.yvanchuliandan.item.ItemDanLuTaoZhuang1;
import net.mcreator.yvanchuliandan.item.ItemDanLuTaoZhuang2;
import net.mcreator.yvanchuliandan.item.ItemDanLuTaoZhuang3;
import net.mcreator.yvanchuliandan.item.ItemDanLuTaoZhuang4;
import net.mcreator.yvanchuliandan.item.ItemDanLuTaoZhuang5;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanLuTaoZhuangTick.class */
public class ProcedureDanLuTaoZhuangTick extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanLuTaoZhuangTick(ElementsYvanchuliandanMod instance) {
        super(instance, 861);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (itemstack.func_77973_b() == new ItemStack(ItemDanLuTaoZhuang1.block, 1).func_77973_b()) {
            itemstack.func_190918_g(1);
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack = new ItemStack(BlockLiandan0102.block, 1);
                _setstack.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
            }
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack2 = new ItemStack(BlockLiandan0101.block, 1);
                _setstack2.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack2);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemDanLuTaoZhuang2.block, 1).func_77973_b()) {
            itemstack.func_190918_g(1);
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack3 = new ItemStack(BlockLiandan0202.block, 1);
                _setstack3.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack3);
            }
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack4 = new ItemStack(BlockLiandan0201.block, 1);
                _setstack4.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack4);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemDanLuTaoZhuang3.block, 1).func_77973_b()) {
            itemstack.func_190918_g(1);
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack5 = new ItemStack(BlockLiandan0302.block, 1);
                _setstack5.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack5);
            }
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack6 = new ItemStack(BlockLiandan0301.block, 1);
                _setstack6.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack6);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemDanLuTaoZhuang4.block, 1).func_77973_b()) {
            itemstack.func_190918_g(1);
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack7 = new ItemStack(BlockLiandan0402.block, 1);
                _setstack7.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack7);
            }
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack8 = new ItemStack(BlockLiandan0401.block, 1);
                _setstack8.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack8);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemDanLuTaoZhuang5.block, 1).func_77973_b()) {
            itemstack.func_190918_g(1);
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack9 = new ItemStack(BlockLiandan0502.block, 1);
                _setstack9.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack9);
            }
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack10 = new ItemStack(BlockLiandan0501.block, 1);
                _setstack10.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack10);
            }
        }
    }
}
