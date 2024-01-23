package net.mcreator.infinite_storage.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.infinite_storage.Config;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.mcreator.infinite_storage.InfiniteStorageMod;
import net.mcreator.infinite_storage.gui.GuiInfiniteBagGui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.world.World;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureInfiniteBagGuiOpen.class */
public class ProcedureInfiniteBagGuiOpen extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureInfiniteBagGuiOpen(ElementsInfiniteStorageMod instance) {
        super(instance, 15);
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpen$2] */
    /* JADX WARN: Type inference failed for: r2v28, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpen$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74767_n("InfiniteBagOn")) {
            entityPlayer.getEntityData().func_74778_a("InfiniteBagTip", "");
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("InfiniteBagLv");
                if (_so == null) {
                    _so = _sc.func_96535_a("InfiniteBagLv", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("InfiniteBagLevel"));
            }
            entityPlayer.getEntityData().func_74780_a("InfiniteBagPage", entityPlayer.getEntityData().func_74769_h("InfiniteBagPage"));
            entityPlayer.getEntityData().func_74780_a("LevelXpTemp", entityPlayer instanceof EntityPlayer ? entityPlayer.field_71068_ca : 0);
            entityPlayer.getEntityData().func_74757_a("bagState", Config.bagState);
            entityPlayer.getEntityData().func_74757_a("doubleOn", Config.doubleOn);
            entityPlayer.getEntityData().func_74780_a("needLevel", Config.needLevel);
            entityPlayer.getEntityData().func_74780_a("doubleBase", Config.doubleBase);
            if (!entityPlayer.getEntityData().func_74767_n("bagState")) {
                entityPlayer.getEntityData().func_74780_a("LevelXpTemp", entityPlayer instanceof EntityPlayer ? entityPlayer.field_71068_ca : 0);
                if (!entityPlayer.getEntityData().func_74767_n("doubleOn")) {
                    entityPlayer.getEntityData().func_74780_a("InfiniteBagPageAdd", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpen.1
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("LevelXpTemp") / entityPlayer.getEntityData().func_74769_h("needLevel"))));
                } else if (entityPlayer.getEntityData().func_74767_n("doubleOn")) {
                    entityPlayer.getEntityData().func_74780_a("InfiniteBagPageAdd", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpen.2
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("LevelXpTemp") / (entityPlayer.getEntityData().func_74769_h("needLevel") * entityPlayer.getEntityData().func_74769_h("doubleBase")))));
                }
            } else if (entityPlayer.getEntityData().func_74767_n("bagState")) {
                entityPlayer.getEntityData().func_74780_a("InfiniteBagPageAdd", entityPlayer.getEntityData().func_74769_h("InfiniteBagLevel"));
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.openGui(InfiniteStorageMod.instance, GuiInfiniteBagGui.GUIID, world, x, y, z);
            }
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entityPlayer);
            ProcedureInfiniteBagUpdate.executeProcedure($_dependencies);
        }
    }
}
