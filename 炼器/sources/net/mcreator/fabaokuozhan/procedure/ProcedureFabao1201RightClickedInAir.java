package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockFabao1202;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao1201RightClickedInAir.class */
public class ProcedureFabao1201RightClickedInAir extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao1201RightClickedInAir(ElementsFabaokuozhanMod instance) {
        super(instance, 131);
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
        WorldServer worldServer = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("Power") >= 313.0d) {
            worldServer.func_180501_a(new BlockPos(((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177952_p()), BlockFabao1202.block.func_176223_P(), 3);
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp = new BlockPos(((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177952_p());
                TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                IBlockState _bs = worldServer.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("伤害", (0.6d * entityPlayer.getEntityData().func_74769_h("MagicAttack")) + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d) + 15.0d);
                }
                worldServer.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp2 = new BlockPos(((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 10.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 10.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 10.0d), false, false, true).func_178782_a().func_177952_p());
                TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74778_a("所有者", entityPlayer.func_145748_c_().func_150260_c());
                }
                worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, x + 0.5d, y + 0.5d, z + 0.5d, 20, 1.0d, 0.0d, 1.0d, 0.0d, new int[0]);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("魂雾梦原"), false);
            }
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 313.0d);
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
            }
            if (itemstack.func_96631_a(30, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("Power") < 313.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("灵力不足无法使用"), false);
        }
    }
}
