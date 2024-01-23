package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu01;
import net.mcreator.yvanchuliandan.item.ItemJiuJu02;
import net.mcreator.yvanchuliandan.item.ItemJiuJu03;
import net.mcreator.yvanchuliandan.item.ItemJiuJu04;
import net.mcreator.yvanchuliandan.item.ItemJiuJu05;
import net.mcreator.yvanchuliandan.item.ItemJiuJu06;
import net.mcreator.yvanchuliandan.item.ItemJiuJu07;
import net.mcreator.yvanchuliandan.item.ItemXianNiang01;
import net.mcreator.yvanchuliandan.item.ItemXianNiang03;
import net.mcreator.yvanchuliandan.item.ItemXianNiang04;
import net.mcreator.yvanchuliandan.item.ItemXianNiang05;
import net.mcreator.yvanchuliandan.item.ItemXianNiang06;
import net.mcreator.yvanchuliandan.item.ItemXianNiang07;
import net.mcreator.yvanchuliandan.item.ItemXiangNiang02;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureNiangJiuJieSuan.class */
public class ProcedureNiangJiuJieSuan extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureNiangJiuJieSuan(ElementsYvanchuliandanMod instance) {
        super(instance, 690);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan$2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan$3] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan$4] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan$5] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan$6] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan$7] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "YuanJiang") == 1.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJiuJu01.block, 1).func_77973_b()) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74757_a("未盛出", false);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
                if (entityLivingBase instanceof EntityPlayer) {
                    ItemStack _setstack = new ItemStack(ItemXianNiang01.block, 1);
                    _setstack.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack);
                    return;
                }
                return;
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "YuanJiang") == 2.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJiuJu03.block, 1).func_77973_b()) {
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74757_a("未盛出", false);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
                if (entityLivingBase instanceof EntityPlayer) {
                    ItemStack _setstack2 = new ItemStack(ItemXiangNiang02.block, 1);
                    _setstack2.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack2);
                    return;
                }
                return;
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "YuanJiang") == 3.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJiuJu02.block, 1).func_77973_b()) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74757_a("未盛出", false);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
                if (entityLivingBase instanceof EntityPlayer) {
                    ItemStack _setstack3 = new ItemStack(ItemXianNiang03.block, 1);
                    _setstack3.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack3);
                    return;
                }
                return;
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "YuanJiang") == 4.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJiuJu04.block, 1).func_77973_b()) {
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74757_a("未盛出", false);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
                if (entityLivingBase instanceof EntityPlayer) {
                    ItemStack _setstack4 = new ItemStack(ItemXianNiang04.block, 1);
                    _setstack4.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack4);
                    return;
                }
                return;
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "YuanJiang") == 5.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJiuJu05.block, 1).func_77973_b()) {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74757_a("未盛出", false);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
                if (entityLivingBase instanceof EntityPlayer) {
                    ItemStack _setstack5 = new ItemStack(ItemXianNiang05.block, 1);
                    _setstack5.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack5);
                    return;
                }
                return;
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "YuanJiang") == 6.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJiuJu06.block, 1).func_77973_b()) {
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74757_a("未盛出", false);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
                if (entityLivingBase instanceof EntityPlayer) {
                    ItemStack _setstack6 = new ItemStack(ItemXianNiang06.block, 1);
                    _setstack6.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack6);
                    return;
                }
                return;
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuJieSuan.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "YuanJiang") == 7.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJiuJu07.block, 1).func_77973_b()) {
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74757_a("未盛出", false);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
                if (entityLivingBase instanceof EntityPlayer) {
                    ItemStack _setstack7 = new ItemStack(ItemXianNiang07.block, 1);
                    _setstack7.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer((EntityPlayer) entityLivingBase, _setstack7);
                    return;
                }
                return;
            }
        }
        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("请使用对应酒具盛酒"), false);
        }
        if (!world.field_72995_K) {
            BlockPos _bp8 = new BlockPos(x, y, z);
            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
            IBlockState _bs8 = world.func_180495_p(_bp8);
            if (_tileEntity8 != null) {
                _tileEntity8.getTileData().func_74757_a("未盛出", true);
            }
            world.func_184138_a(_bp8, _bs8, _bs8, 3);
        }
    }
}
