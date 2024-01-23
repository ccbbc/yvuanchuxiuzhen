package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectJob5UnJob.class */
public class ProcedureSectJob5UnJob extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectJob5UnJob(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 549);
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob5UnJob$1] */
    /* JADX WARN: Type inference failed for: r2v17, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob5UnJob$3] */
    /* JADX WARN: Type inference failed for: r2v25, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob5UnJob$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entity.getEntityData().func_74769_h("SectJobLevel") >= 5.0d) {
            if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob5UnJob.1
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "SectJob5").equals("")) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("SectStaffNum5", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob5UnJob.2
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum5") - 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("SectStaffNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob5UnJob.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum") - 1.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74778_a("SectJob5", "");
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                entity.getEntityData().func_74778_a("SxlGuiTip", "§2§l卸任成功");
                return;
            }
            entity.getEntityData().func_74778_a("SxlGuiTip", "§4§l未有任职");
            return;
        }
        entity.getEntityData().func_74778_a("SxlGuiTip", "§4§l权限不足");
    }
}
