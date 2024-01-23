package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureLinHaiShouHuangSkill.class */
public class ProcedureLinHaiShouHuangSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLinHaiShouHuangSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, 199);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        entityLivingBase.getEntityData().func_74780_a("caientity09tick", entityLivingBase.getEntityData().func_74769_h("caientity09tick") + 1.0d);
        entityLivingBase.getEntityData().func_74780_a("caientity09tick2", entityLivingBase.getEntityData().func_74769_h("caientity09tick2") + 1.0d);
        if (entityLivingBase.getEntityData().func_74769_h("caientity09tick") >= 600.0d) {
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, x + 0.5d, y + 1, z + 0.5d, 100, 1.0d, 2.0d, 1.0d, 1.0d, new int[0]);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 40, 4, true, true));
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76420_g, 40, 2, true, true));
            }
            entityLivingBase.getEntityData().func_74780_a("caientity09tick", 0.0d);
        }
        if (entityLivingBase.getEntityData().func_74769_h("caientity09tick2") >= 1000.0d) {
            worldServer.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuyaoshou:caientity09")), SoundCategory.NEUTRAL, 1.0f, 2.0f);
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.CRIT, x + 0.5d, y + 1, z + 0.5d, 100, 4.0d, 0.0d, 4.0d, 1.0d, new int[0]);
            }
            ((Entity) entityLivingBase).field_70177_z = ((Entity) entityLivingBase).field_70177_z;
            ((Entity) entityLivingBase).field_70125_A = 315.0f;
            entityLivingBase.getEntityData().func_74757_a("mianyi", true);
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 60, 40, true, true));
            }
            if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureLinHaiShouHuangSkill.1
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityLivingBase.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityLivingBase.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityLivingBase.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityLivingBase;
                    }
                }, "execute @e[rm=0,r=8] ~ ~ ~ shanghai30");
            }
            if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureLinHaiShouHuangSkill.2
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityLivingBase.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityLivingBase.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityLivingBase.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityLivingBase;
                    }
                }, "execute @e[rm=8,r=15] ~ ~ ~ shanghai15");
            }
            entityLivingBase.getEntityData().func_74780_a("caientity09tick2", 0.0d);
        }
    }
}
