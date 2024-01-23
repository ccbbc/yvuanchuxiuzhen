package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenModVariables;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureFirefirefireCommandExecuted.class */
public class ProcedureFirefirefireCommandExecuted extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFirefirefireCommandExecuted(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 210);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        World world = (World) dependencies.get("world");
        if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("手持异火潜行右键，放置火焰"), false);
            }
            YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire = false;
            YvanchuxiuzhenModVariables.MapVariables.get(world).syncData(world);
        } else if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("手持异火潜行右键，给予火焰方块"), false);
            }
            YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire = true;
            YvanchuxiuzhenModVariables.MapVariables.get(world).syncData(world);
        }
    }
}
