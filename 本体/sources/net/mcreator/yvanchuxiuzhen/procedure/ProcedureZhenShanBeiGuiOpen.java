package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.gui.GuiZhenShanBeiGui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhenShanBeiGuiOpen.class */
public class ProcedureZhenShanBeiGuiOpen extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhenShanBeiGuiOpen(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 524);
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
            entityPlayer.openGui(YvanchuxiuzhenMod.instance, GuiZhenShanBeiGui.GUIID, world, x, y, z);
        }
    }
}
