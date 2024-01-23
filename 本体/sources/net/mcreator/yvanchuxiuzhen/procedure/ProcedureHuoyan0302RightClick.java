package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan03;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyan0302RightClick.class */
public class ProcedureHuoyan0302RightClick extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyan0302RightClick(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 257);
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302RightClick$3] */
    /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302RightClick$1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302RightClick$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("点击火焰", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302RightClick.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "点击火焰") + 1.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x + 0.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("还差" + (500.0d - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302RightClick.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "点击火焰")) + "就可以炼化火焰了！"), false);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302RightClick.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "点击火焰") >= 500.0d) {
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack = new ItemStack(ItemHuoyan03.block, 1);
                _setstack.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
            }
            worldServer.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
