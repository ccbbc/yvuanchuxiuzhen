package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureShuangxiulixian.class */
public class ProcedureShuangxiulixian extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShuangxiulixian(ElementsYvanchujiguanMod instance) {
        super(instance, 131);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
            entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShuangxiulixian.1
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
            }, "execute @a[name=" + entity.getEntityData().func_74779_i("DaoLv") + "] ~ ~ ~ wifigongfa shuangxiu0");
        }
    }

    @SubscribeEvent
    public void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
        EntityPlayer entityPlayer = event.player;
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf((int) ((Entity) entityPlayer).field_70165_t));
        dependencies.put("y", Integer.valueOf((int) ((Entity) entityPlayer).field_70163_u));
        dependencies.put("z", Integer.valueOf((int) ((Entity) entityPlayer).field_70161_v));
        dependencies.put("world", ((Entity) entityPlayer).field_70170_p);
        dependencies.put("entity", entityPlayer);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
