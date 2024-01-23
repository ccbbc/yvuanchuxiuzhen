package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu1001EntityCollidesInTheBlock.class */
public class ProcedureFulu1001EntityCollidesInTheBlock extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu1001EntityCollidesInTheBlock(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 87);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001EntityCollidesInTheBlock$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001EntityCollidesInTheBlock$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001EntityCollidesInTheBlock.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "jineng") == 1.0d) {
            entity.func_70097_a(DamageSource.field_76377_j, 25.0f);
            entity.field_70159_w = 0.0d;
            entity.field_70181_x = 2.0d;
            entity.field_70179_y = 0.0d;
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001EntityCollidesInTheBlock.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "jineng") != 1.0d) {
            entity.field_70159_w = 0.0d;
            entity.field_70181_x = 2.0d;
            entity.field_70179_y = 0.0d;
            entity.func_70097_a(DamageSource.field_76377_j, 25.0f);
            world.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
