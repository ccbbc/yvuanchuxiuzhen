package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectJobUpdate.class */
public class ProcedureSectJobUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectJobUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 534);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobUpdate$3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobUpdate$2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobUpdate$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
        if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
            ItemStack _setstack = new ItemStack(Items.field_151100_aR, 1, 7);
            _setstack.func_190920_e(1);
            func_175625_s.func_70299_a(0, _setstack);
        }
        new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobUpdate.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_151001_c("§f" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobUpdate.2
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobUpdate.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectJobLevel"))) + "§f(可修改)");
    }
}
