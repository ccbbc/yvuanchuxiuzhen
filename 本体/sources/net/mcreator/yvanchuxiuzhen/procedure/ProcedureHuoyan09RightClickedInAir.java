package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyan09RightClickedInAir.class */
public class ProcedureHuoyan09RightClickedInAir extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyan09RightClickedInAir(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 151);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        final WorldServer worldServer = (World) dependencies.get("world");
        if (itemstack.func_77958_k() - itemstack.func_77952_i() > 1 && entityPlayer.getEntityData().func_74769_h("Power") >= 2560.0d && !entityPlayer.func_70093_af()) {
            if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.1
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityPlayer.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityPlayer.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityPlayer.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityPlayer;
                    }
                }, "scoreboard players tag @s add yihuo");
            }
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 2560.0d);
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177952_p(), 10, 0.2d, 0.2d, 0.2d, 0.0d, new int[0]);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177952_p(), 10, 0.2d, 0.2d, 0.2d, 0.0d, new int[0]);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177952_p(), 10, 0.2d, 0.2d, 0.2d, 0.0d, new int[0]);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177952_p(), 10, 0.2d, 0.2d, 0.2d, 0.0d, new int[0]);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177952_p(), 20, 0.4d, 0.4d, 0.4d, 0.1d, new int[0]);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177952_p(), 40, 0.8d, 0.8d, 0.8d, 0.3d, new int[0]);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177958_n(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177956_o(), ((Entity) entityPlayer).field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177952_p(), 80, 2.0d, 2.0d, 2.0d, 1.0d, new int[0]);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.2
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 1.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 1.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 1.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "effect @e[r=3,tag=!yihuo] yvanchuxiuzhen:huoyanbuffi 10 0 true");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.3
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 2.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 2.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "effect @e[r=3,tag=!yihuo] yvanchuxiuzhen:huoyanbuffi 10 0 true");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.4
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 3.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 3.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "effect @e[r=3,tag=!yihuo] yvanchuxiuzhen:huoyanbuffi 10 0 true");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.5
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 4.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 4.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "effect @e[r=3,tag=!yihuo] yvanchuxiuzhen:huoyanbuffi 10 0 true");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.6
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 5.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 5.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 5.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "effect @e[r=3,tag=!yihuo] yvanchuxiuzhen:huoyanbuffi 10 0 true");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.7
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 6.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 6.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "effect @e[r=3,tag=!yihuo] yvanchuxiuzhen:huoyanbuffi 10 0 true");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.8
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return new BlockPos(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177952_p());
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177958_n(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177956_o(), entityPlayer.field_70170_p.func_147447_a(entityPlayer.func_174824_e(1.0f), entityPlayer.func_174824_e(1.0f).func_72441_c(entityPlayer.func_70676_i(1.0f).field_72450_a * 7.0d, entityPlayer.func_70676_i(1.0f).field_72448_b * 7.0d, entityPlayer.func_70676_i(1.0f).field_72449_c * 7.0d), false, false, true).func_178782_a().func_177952_p());
                    }
                }, "effect @e[r=3,tag=!yihuo] yvanchuxiuzhen:huoyanbuffi 10 0 true");
            }
            if (itemstack.func_96631_a(1, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 8);
            }
            if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan09RightClickedInAir.9
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityPlayer.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityPlayer.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityPlayer.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityPlayer;
                    }
                }, "scoreboard players tag @s remove yihuo");
            }
        } else if (!entityPlayer.func_70093_af() && entityPlayer.getEntityData().func_74769_h("Power") < 2560.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("灵力不足2560点，无法释放火焰"), false);
        }
    }
}
