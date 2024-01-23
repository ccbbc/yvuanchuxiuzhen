package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureCommandExecuted.class */
public class ProcedureCommandExecuted extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCommandExecuted(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 176);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) && entityPlayer.getEntityData().func_74767_n("FLY") && (entityPlayer instanceof EntityPlayer)) {
            entityPlayer.field_71075_bZ.field_75101_c = true;
            entityPlayer.func_71016_p();
        }
    }

    @SubscribeEvent
    public void onCommand(CommandEvent event) {
        ICommandSender sender = event.getSender();
        Entity entity = sender.func_174793_f();
        if (entity != null) {
            int i = sender.func_180425_c().func_177958_n();
            int j = sender.func_180425_c().func_177956_o();
            int k = sender.func_180425_c().func_177952_p();
            Object command = event.getCommand().func_71517_b();
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", entity.field_70170_p);
            dependencies.put("entity", entity);
            dependencies.put("command", command);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
