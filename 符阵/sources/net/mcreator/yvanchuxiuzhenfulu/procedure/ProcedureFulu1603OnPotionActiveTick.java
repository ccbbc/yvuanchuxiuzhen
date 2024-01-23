package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu1603OnPotionActiveTick.class */
public class ProcedureFulu1603OnPotionActiveTick extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu1603OnPotionActiveTick(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 128);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        entity.getEntityData().func_74780_a("fulu16tick", entity.getEntityData().func_74769_h("fulu16tick") + 1.0d);
        entity.getEntityData().func_74780_a("fulu16tick2", entity.getEntityData().func_74769_h("fulu16tick2") + 1.0d);
        if (entity.getEntityData().func_74769_h("fulu16tick") >= 20.0d) {
            entity.getEntityData().func_74780_a("fulu16tick", 0.0d);
            worldServer.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuxiuzhenfulu:fulu1602")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x + 0.5d, y, z + 0.5d, 20, 0.7d, 0.7d, 0.7d, 0.0d, new int[0]);
            }
            if (Math.random() < 0.25d) {
                entity.field_70159_w = 1.0d;
                entity.field_70181_x = 0.3d;
                entity.field_70179_y = 0.0d;
            } else if (Math.random() < 0.33d) {
                entity.field_70159_w = -1.0d;
                entity.field_70181_x = 0.3d;
                entity.field_70179_y = 0.0d;
            } else if (Math.random() < 0.5d) {
                entity.field_70159_w = 0.0d;
                entity.field_70181_x = 0.3d;
                entity.field_70179_y = 1.0d;
            } else {
                entity.field_70159_w = 0.0d;
                entity.field_70181_x = 0.3d;
                entity.field_70179_y = -1.0d;
            }
        }
        if (entity.getEntityData().func_74769_h("fulu16tick2") >= 60.0d) {
            if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1603OnPotionActiveTick.1
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
                }, "shanghaim 233");
            }
            entity.getEntityData().func_74780_a("fulu16tick2", 0.0d);
        }
    }
}
