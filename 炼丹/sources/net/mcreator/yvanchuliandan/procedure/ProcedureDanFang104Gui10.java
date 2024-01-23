package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.YvanchuliandanMod;
import net.mcreator.yvanchuliandan.gui.GuiDanFang104Gui1;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanFang104Gui10.class */
public class ProcedureDanFang104Gui10 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanFang104Gui10(ElementsYvanchuliandanMod instance) {
        super(instance, 515);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.openGui(YvanchuliandanMod.instance, GuiDanFang104Gui1.GUIID, world, x, y, z);
        }
    }
}
