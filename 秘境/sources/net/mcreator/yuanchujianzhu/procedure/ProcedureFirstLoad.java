package net.mcreator.yuanchujianzhu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.YuanchujianzhuModVariables;
import net.mcreator.yuanchujianzhu.block.BlockFormationLingShiCave2;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureFirstLoad.class */
public class ProcedureFirstLoad extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureFirstLoad(ElementsYuanchujianzhuMod instance) {
        super(instance, 263);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            return;
        }
        World world = (World) dependencies.get("world");
        if (!YuanchujianzhuModVariables.MapVariables.get(world).FirstLoad) {
            if (Math.random() <= 0.3d) {
                world.func_180501_a(new BlockPos(0, 30, 10000), BlockFormationLingShiCave2.block.func_176223_P(), 3);
            } else if (Math.random() <= 0.3d) {
                world.func_180501_a(new BlockPos(10000, 30, 0), BlockFormationLingShiCave2.block.func_176223_P(), 3);
            } else if (Math.random() <= 0.3d) {
                world.func_180501_a(new BlockPos(-10000, 30, 0), BlockFormationLingShiCave2.block.func_176223_P(), 3);
            } else {
                world.func_180501_a(new BlockPos(0, 30, -10000), BlockFormationLingShiCave2.block.func_176223_P(), 3);
            }
            YuanchujianzhuModVariables.MapVariables.get(world).FirstLoad = true;
            YuanchujianzhuModVariables.MapVariables.get(world).syncData(world);
        }
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
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

    @Override // net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
