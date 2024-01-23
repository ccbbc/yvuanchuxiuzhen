package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureDiaoluofanjian.class */
public class ProcedureDiaoluofanjian extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDiaoluofanjian(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 268);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if (entityPlayerMP.getEntityData().func_74767_n("intianting") && ((Entity) entityPlayerMP).field_70163_u <= 0.0d) {
            entityPlayerMP.getEntityData().func_74780_a("intiantingX", ((Entity) entityPlayerMP).field_70165_t);
            entityPlayerMP.getEntityData().func_74780_a("intiantingZ", ((Entity) entityPlayerMP).field_70161_v);
            if (!((Entity) entityPlayerMP).field_70170_p.field_72995_K && !entityPlayerMP.func_184218_aH() && !entityPlayerMP.func_184207_aI() && (entityPlayerMP instanceof EntityPlayerMP)) {
                EntityPlayerMP _player = entityPlayerMP;
                _player.field_71133_b.func_184103_al().transferPlayerToDimension(_player, 0, new Teleporter(_player.func_71121_q()) { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureDiaoluofanjian.1TeleporterDirect
                    public void func_180266_a(Entity entity, float yawrotation) {
                    }

                    public boolean func_180620_b(Entity entity, float yawrotation) {
                        return true;
                    }

                    public boolean func_85188_a(Entity entity) {
                        return true;
                    }
                });
                _player.field_71135_a.func_147364_a(DimensionManager.getWorld(0).func_175694_M().func_177958_n(), DimensionManager.getWorld(0).func_175694_M().func_177956_o() + 1, DimensionManager.getWorld(0).func_175694_M().func_177952_p(), _player.field_70177_z, _player.field_70125_A);
            }
            entityPlayerMP.getEntityData().func_74757_a("intianting", false);
            entityPlayerMP.getEntityData().func_74780_a("gotofanjian", 1.0d);
        }
        if (entityPlayerMP.getEntityData().func_74769_h("gotofanjian") >= 1.0d) {
            entityPlayerMP.getEntityData().func_74780_a("gotofanjian", entityPlayerMP.getEntityData().func_74769_h("gotofanjian") + 1.0d);
            if (entityPlayerMP.getEntityData().func_74769_h("gotofanjian") >= 10.0d) {
                if (!((Entity) entityPlayerMP).field_70170_p.field_72995_K && ((Entity) entityPlayerMP).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayerMP).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureDiaoluofanjian.1
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayerMP.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayerMP.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayerMP.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayerMP.field_70165_t, entityPlayerMP.field_70163_u, entityPlayerMP.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayerMP;
                        }
                    }, "tp @s " + entityPlayerMP.getEntityData().func_74769_h("intiantingX") + " 255 " + entityPlayerMP.getEntityData().func_74769_h("intiantingZ"));
                }
                entityPlayerMP.getEntityData().func_74780_a("gotofanjian", 0.0d);
                entityPlayerMP.getEntityData().func_74780_a("intiantingX", 0.0d);
                entityPlayerMP.getEntityData().func_74780_a("intiantingZ", 0.0d);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
