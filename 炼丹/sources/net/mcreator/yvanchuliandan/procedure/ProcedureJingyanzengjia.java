package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureJingyanzengjia.class */
public class ProcedureJingyanzengjia extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureJingyanzengjia(ElementsYvanchuliandanMod instance) {
        super(instance, 273);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [net.mcreator.yvanchuliandan.procedure.ProcedureJingyanzengjia$1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [net.mcreator.yvanchuliandan.procedure.ProcedureJingyanzengjia$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        entityPlayer.getEntityData().func_74780_a("liandanjingyan", entityPlayer.getEntityData().func_74769_h("liandanjingyan") + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureJingyanzengjia.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanjingyan"));
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("增加" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureJingyanzengjia.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandanjingyan") + "点炼丹经验"), false);
        }
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("liandanjingyan", 0.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
    }
}
