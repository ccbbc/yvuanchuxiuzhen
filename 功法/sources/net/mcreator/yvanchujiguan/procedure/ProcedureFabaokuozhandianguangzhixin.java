package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureFabaokuozhandianguangzhixin.class */
public class ProcedureFabaokuozhandianguangzhixin extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabaokuozhandianguangzhixin(ElementsYvanchujiguanMod instance) {
        super(instance, 130);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:dian_guang_zhi_xin") && entityLivingBase.getEntityData().func_74769_h("功法被动1") == 1.0d) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
            if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureFabaokuozhandianguangzhixin.1
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
                }, "execute @a[r=7] ~ ~ ~ wifigongfa bixiedianguang");
            }
            entityLivingBase.getEntityData().func_74780_a("功法被动1", 0.0d);
        }
    }

    @SubscribeEvent
    public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Object entity = event.getEntityPlayer();
        int i = event.getPos().func_177958_n();
        int j = event.getPos().func_177956_o();
        int k = event.getPos().func_177952_p();
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
