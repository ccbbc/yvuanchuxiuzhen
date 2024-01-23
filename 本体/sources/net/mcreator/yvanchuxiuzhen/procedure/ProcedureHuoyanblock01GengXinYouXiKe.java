package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyanblock01GengXinYouXiKe.class */
public class ProcedureHuoyanblock01GengXinYouXiKe extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyanblock01GengXinYouXiKe(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 231);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01GengXinYouXiKe$1] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01GengXinYouXiKe$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01GengXinYouXiKe.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 1.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01GengXinYouXiKe.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 1.0d) {
            world.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
