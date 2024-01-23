package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.YvanchuliandanMod;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureFangShiGuiTwo.class */
public class ProcedureFangShiGuiTwo extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureFangShiGuiTwo(ElementsYvanchuliandanMod instance) {
        super(instance, 947);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShiGuiTwo$2] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShiGuiTwo$3] */
    /* JADX WARN: Type inference failed for: r0v81, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShiGuiTwo$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityPlayer.func_70093_af() && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yuanchuzhushou:zhu_shou"), 1))) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShiGuiTwo.1
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "旧")) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74757_a("旧", false);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换为正常"), false);
                }
                TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:cailiaolingshi03"), 1);
                    _setstack.func_190920_e(1);
                    func_175625_s.func_70299_a(1, _setstack);
                }
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s2 != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack2 = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:cailiaolingshi05"), 1);
                    _setstack2.func_190920_e(1);
                    func_175625_s2.func_70299_a(2, _setstack2);
                }
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s3 != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack3 = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:ling_shi_kuai_1"), 1);
                    _setstack3.func_190920_e(1);
                    func_175625_s3.func_70299_a(3, _setstack3);
                }
                TileEntityLockableLoot func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s4 != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack4 = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:ling_shi_kuai_2"), 1);
                    _setstack4.func_190920_e(1);
                    func_175625_s4.func_70299_a(4, _setstack4);
                }
            } else {
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74757_a("旧", true);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("切换只存不取"), false);
                }
                TileEntityLockableLoot func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s5 instanceof TileEntityLockableLoot) {
                    func_175625_s5.func_70304_b(1);
                }
                TileEntityLockableLoot func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s6 instanceof TileEntityLockableLoot) {
                    func_175625_s6.func_70304_b(2);
                }
                TileEntityLockableLoot func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s7 instanceof TileEntityLockableLoot) {
                    func_175625_s7.func_70304_b(3);
                }
                TileEntityLockableLoot func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s8 instanceof TileEntityLockableLoot) {
                    func_175625_s8.func_70304_b(4);
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShiGuiTwo.2
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "旧")) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.openGui(YvanchuliandanMod.instance, GuiFangShiGui.GUIID, world, x, y, z);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShiGuiTwo.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                if (func_175625_s9 instanceof TileEntityLockableLoot) {
                    return func_175625_s9.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            TileEntityLockableLoot func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s9 != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack5 = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:cailiaolingshi03"), 1);
                _setstack5.func_190920_e(1);
                func_175625_s9.func_70299_a(1, _setstack5);
            }
            TileEntityLockableLoot func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s10 != null && (func_175625_s10 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack6 = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:cailiaolingshi05"), 1);
                _setstack6.func_190920_e(1);
                func_175625_s10.func_70299_a(2, _setstack6);
            }
            TileEntityLockableLoot func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s11 != null && (func_175625_s11 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack7 = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:ling_shi_kuai_1"), 1);
                _setstack7.func_190920_e(1);
                func_175625_s11.func_70299_a(3, _setstack7);
            }
            TileEntityLockableLoot func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s12 != null && (func_175625_s12 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack8 = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:ling_shi_kuai_2"), 1);
                _setstack8.func_190920_e(1);
                func_175625_s12.func_70299_a(4, _setstack8);
            }
        }
    }
}
