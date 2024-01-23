package net.mcreator.yvanchuyaoshou.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou04;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHuJiaAddSkill.class */
public class ProcedureHuJiaAddSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuJiaAddSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityHunTieShou04.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f && !entityLivingBase.func_145748_c_().func_150260_c().contains("魔修")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.3d) {
                if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureHuJiaAddSkill.1
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
                    }, "replaceitem entity @s slot.armor.feet yvanchuyaoshou:air_armorboots 1 0 {AttributeModifiers:[{Operation:0,Amount:" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("技能护甲")) + ",UUIDLeast:-1371433651325581318L,UUIDMost:2713261868338689742L,AttributeName:\"generic.armor\",Name:\"generic.armor\"}]}");
                    return;
                }
                return;
            }
        }
        if (entityLivingBase instanceof EntityPlayer) {
            ((EntityPlayer) entityLivingBase).field_71071_by.field_70460_b.set(0, new ItemStack(Blocks.field_150350_a, 1));
            if (entityLivingBase instanceof EntityPlayerMP) {
                ((EntityPlayerMP) entityLivingBase).field_71071_by.func_70296_d();
            }
        }
    }
}
