package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureTianHuZhen04.class */
public class ProcedureTianHuZhen04 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureTianHuZhen04(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 429);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureTianHuZhen04.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return world;
                }

                public MinecraftServer func_184102_h() {
                    return world.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos(entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177958_n(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177956_o(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177952_p());
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177958_n(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177956_o(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177952_p());
                }
            }, "summon yvanchuxiuzhenfulu:zhen_fa_sheng_ceng_01 ~ ~1 ~ {CustomName:\"6\",CustomNameVisible:0b}");
        }
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureTianHuZhen04.2
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return world;
                }

                public MinecraftServer func_184102_h() {
                    return world.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos(entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177958_n(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177956_o(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177952_p());
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177958_n(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177956_o(), entity.field_70170_p.func_147447_a(entity.func_174824_e(1.0f), entity.func_174824_e(1.0f).func_72441_c(entity.func_70676_i(1.0f).field_72450_a * 20.0d, entity.func_70676_i(1.0f).field_72448_b * 20.0d, entity.func_70676_i(1.0f).field_72449_c * 20.0d), false, false, true).func_178782_a().func_177952_p());
                }
            }, "summon yvanchuxiuzhenfulu:zhen_fa_pan_ji_yu ~ ~1 ~ {CustomName:\"" + entity.func_189512_bd() + "\",CustomNameVisible:0b}");
        }
        itemstack.func_190918_g(1);
    }
}
