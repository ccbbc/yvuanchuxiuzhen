package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockFabao1502;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao1501RightClickedOnBlock.class */
public class ProcedureFabao1501RightClickedOnBlock extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao1501RightClickedOnBlock(ElementsFabaokuozhanMod instance) {
        super(instance, 145);
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
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
            if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() && entityPlayer.getEntityData().func_74769_h("Power") >= 26.0d && entityPlayer.getEntityData().func_74769_h("fabao1501cd") == 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("1501LengQueMiao") >= 5.0d) {
                    world.func_180501_a(new BlockPos(x, y + 1, z), BlockFabao1502.block.func_176223_P(), 3);
                    if (!world.field_72995_K) {
                        BlockPos _bp = new BlockPos(x, y + 1, z);
                        TileEntity _tileEntity = world.func_175625_s(_bp);
                        IBlockState _bs = world.func_180495_p(_bp);
                        if (_tileEntity != null) {
                            _tileEntity.getTileData().func_74780_a("shanghai", (entityPlayer.getEntityData().func_74769_h("FireAttack") * 1.5d) + 7.0d);
                        }
                        world.func_184138_a(_bp, _bs, _bs, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp2 = new BlockPos(x, y + 1, z);
                        TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                        IBlockState _bs2 = world.func_180495_p(_bp2);
                        if (_tileEntity2 != null) {
                            _tileEntity2.getTileData().func_74778_a("所有者", entityPlayer.func_145748_c_().func_150260_c());
                        }
                        world.func_184138_a(_bp2, _bs2, _bs2, 3);
                    }
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("虚幻红影"), false);
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_184609_a(EnumHand.MAIN_HAND);
                    }
                    if (itemstack.func_96631_a(5, new Random(), (EntityPlayerMP) null)) {
                        itemstack.func_190918_g(1);
                        itemstack.func_77964_b(0);
                    }
                    entityPlayer.getEntityData().func_74780_a("1501LengQueMiao", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 26.0d);
                } else {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("威能CD：" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("1501LengQueMiao")) + "秒"), true);
                    }
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("手持时CD方可回复"), false);
                    }
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("Power") < 26.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("灵力不足，无法放置虚幻红影"), true);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("练气期以下修士无法使用法宝"), true);
        }
    }
}
