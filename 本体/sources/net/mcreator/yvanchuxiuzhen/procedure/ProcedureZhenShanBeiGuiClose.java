package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhenShanBeiGuiClose.class */
public class ProcedureZhenShanBeiGuiClose extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhenShanBeiGuiClose(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 559);
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiGuiClose$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!entityPlayer.getEntityData().func_74767_n("OpenZSBGui")) {
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiGuiClose.1
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77946_l();
                _setstack.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
            }
            TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
                ItemStack _setstack2 = new ItemStack(Blocks.field_150350_a, 1);
                _setstack2.func_190920_e(1);
                func_175625_s.func_70299_a(1, _setstack2);
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74757_a("Open", false);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
        }
        entityPlayer.getEntityData().func_74757_a("OpenZSBGui", false);
    }
}
