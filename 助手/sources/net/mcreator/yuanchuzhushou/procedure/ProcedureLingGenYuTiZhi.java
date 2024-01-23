package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.YuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.gui.GuiLingGenGui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureLingGenYuTiZhi.class */
public class ProcedureLingGenYuTiZhi extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureLingGenYuTiZhi(ElementsYuanchuzhushouMod instance) {
        super(instance, 41);
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
            entityPlayer.openGui(YuanchuzhushouMod.instance, GuiLingGenGui.GUIID, world, x, y, z);
        }
    }
}
