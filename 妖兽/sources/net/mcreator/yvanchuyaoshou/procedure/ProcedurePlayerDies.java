package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedurePlayerDies.class */
public class ProcedurePlayerDies extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayerDies(ElementsYvanchuyaoshouMod instance) {
        super(instance, 237);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entity instanceof EntityPlayer) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.1
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
                        return new BlockPos(x, y, z);
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x, y, z);
                    }
                }, "gamerule showDeathMessages false");
            }
            if (entity.getEntityData().func_74767_n("雨蛙攻击") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.2
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被雨蛙吐毒而死\"}");
            }
            if (entity.getEntityData().func_74767_n("黑蛛攻击") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.3
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被黑蛛的网拍死了\"}");
            }
            if (entity.getEntityData().func_74767_n("鹰枭攻击") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.4
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被鹰枭吼叫致死\"}");
            }
            if (entity.getEntityData().func_74767_n("白泽攻击") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.5
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被白泽的神力射杀\"}");
            }
            if (entity.getEntityData().func_74767_n("九尾火狐攻击") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.6
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被九尾火狐的火焰烤熟了\"}");
            }
            if (entity.getEntityData().func_74767_n("散修攻击") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.7
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被修士使用法术拍死了\"}");
            }
            if (entity.getEntityData().func_74767_n("魔修撞击") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.8
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被魔修蓄力撞死了\"}");
            }
            if (entity.getEntityData().func_74767_n("军颚蚁毒伤") && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.9
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
                }, "tellraw @a {\"text\":\"" + entity.func_145748_c_().func_150260_c() + " 被军颚蚁獠牙的毒素毒死了\"}");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerDies.10
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
                        return new BlockPos(x, y, z);
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x, y, z);
                    }
                }, "gamerule showDeathMessages true");
            }
        }
    }

    @SubscribeEvent
    public void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
