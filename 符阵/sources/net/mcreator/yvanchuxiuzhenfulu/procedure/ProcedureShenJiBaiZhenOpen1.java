package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiShenJiZhenFaGUI1;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureShenJiBaiZhenOpen1.class */
public class ProcedureShenJiBaiZhenOpen1 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureShenJiBaiZhenOpen1(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 614);
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
            entityPlayer.openGui(YvanchuxiuzhenfuluMod.instance, GuiShenJiZhenFaGUI1.GUIID, world, x, y, z);
        }
    }
}
