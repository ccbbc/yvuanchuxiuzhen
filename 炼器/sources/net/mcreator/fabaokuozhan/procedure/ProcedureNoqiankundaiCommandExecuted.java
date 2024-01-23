package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.FabaokuozhanModVariables;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureNoqiankundaiCommandExecuted.class */
public class ProcedureNoqiankundaiCommandExecuted extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureNoqiankundaiCommandExecuted(ElementsFabaokuozhanMod instance) {
        super(instance, 233);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        World world = (World) dependencies.get("world");
        if (FabaokuozhanModVariables.MapVariables.get(world).qiankundai) {
            FabaokuozhanModVariables.MapVariables.get(world).qiankundai = false;
            FabaokuozhanModVariables.MapVariables.get(world).syncData(world);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("天道提醒：已关闭乾坤袋制作"), false);
            }
        } else if (!FabaokuozhanModVariables.MapVariables.get(world).qiankundai) {
            FabaokuozhanModVariables.MapVariables.get(world).qiankundai = true;
            FabaokuozhanModVariables.MapVariables.get(world).syncData(world);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("天道提醒：已开启乾坤袋制作"), false);
            }
        }
    }
}
