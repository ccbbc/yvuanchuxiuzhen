package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaPanJiYuDangShiTiGengXinKeShi.class */
public class ProcedureZhenFaPanJiYuDangShiTiGengXinKeShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaPanJiYuDangShiTiGengXinKeShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 433);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        entity.getEntityData().func_74780_a("存活时间", entity.getEntityData().func_74769_h("存活时间") + 1.0d);
        if (entity.getEntityData().func_74769_h("存活时间") >= 2.0d) {
            if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPanJiYuDangShiTiGengXinKeShi.1
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entity.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entity.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entity.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entity;
                    }
                }, "give " + entity.getEntityData().func_74779_i("命令") + " yvanchuxiuzhenfulu:yao_kong_qi_01 1 0 {\"遥控绑定\":1b,X:" + new DecimalFormat("0").format(x) + "d,Y:" + new DecimalFormat("0").format(y) + "d,Z:" + new DecimalFormat("0").format(z) + "d,InitialImmortal:{}}");
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74778_a("所有者", entity.getEntityData().func_74779_i("命令"));
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            entity.field_70170_p.func_72900_e(entity);
        }
    }
}
