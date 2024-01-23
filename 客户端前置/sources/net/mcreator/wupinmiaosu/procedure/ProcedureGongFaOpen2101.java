package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiGongFa21GUI;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureGongFaOpen2101.class */
public class ProcedureGongFaOpen2101 extends ElementsWupinmiaosuMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaOpen2101(ElementsWupinmiaosuMod instance) {
        super(instance, 212);
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
            entityPlayer.openGui(WupinmiaosuMod.instance, GuiGongFa21GUI.GUIID, world, x, y, z);
        }
    }
}
