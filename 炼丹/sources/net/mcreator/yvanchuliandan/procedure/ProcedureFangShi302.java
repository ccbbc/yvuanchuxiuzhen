package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureFangShi302.class */
public class ProcedureFangShi302 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureFangShi302(ElementsYvanchuliandanMod instance) {
        super(instance, 828);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        Object world = (World) dependencies.get("world");
        Map<String, Object> $_dependencies = new HashMap<>();
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        $_dependencies.put("world", world);
        ProcedureMaiChu1001.executeProcedure($_dependencies);
        Map<String, Object> $_dependencies2 = new HashMap<>();
        $_dependencies2.put("x", Integer.valueOf(x));
        $_dependencies2.put("y", Integer.valueOf(y));
        $_dependencies2.put("z", Integer.valueOf(z));
        $_dependencies2.put("world", world);
        ProcedureMaiChu02.executeProcedure($_dependencies2);
        Map<String, Object> $_dependencies3 = new HashMap<>();
        $_dependencies3.put("x", Integer.valueOf(x));
        $_dependencies3.put("y", Integer.valueOf(y));
        $_dependencies3.put("z", Integer.valueOf(z));
        $_dependencies3.put("world", world);
        ProcedureMaiChu03.executeProcedure($_dependencies3);
        Map<String, Object> $_dependencies4 = new HashMap<>();
        $_dependencies4.put("x", Integer.valueOf(x));
        $_dependencies4.put("y", Integer.valueOf(y));
        $_dependencies4.put("z", Integer.valueOf(z));
        $_dependencies4.put("world", world);
        ProcedureMaiChu04.executeProcedure($_dependencies4);
        Map<String, Object> $_dependencies5 = new HashMap<>();
        $_dependencies5.put("x", Integer.valueOf(x));
        $_dependencies5.put("y", Integer.valueOf(y));
        $_dependencies5.put("z", Integer.valueOf(z));
        $_dependencies5.put("world", world);
        ProcedureMaiChu05.executeProcedure($_dependencies5);
        Map<String, Object> $_dependencies6 = new HashMap<>();
        $_dependencies6.put("x", Integer.valueOf(x));
        $_dependencies6.put("y", Integer.valueOf(y));
        $_dependencies6.put("z", Integer.valueOf(z));
        $_dependencies6.put("world", world);
        ProcedureMaiChu06.executeProcedure($_dependencies6);
        Map<String, Object> $_dependencies7 = new HashMap<>();
        $_dependencies7.put("x", Integer.valueOf(x));
        $_dependencies7.put("y", Integer.valueOf(y));
        $_dependencies7.put("z", Integer.valueOf(z));
        $_dependencies7.put("world", world);
        ProcedureMaiChu07.executeProcedure($_dependencies7);
        Map<String, Object> $_dependencies8 = new HashMap<>();
        $_dependencies8.put("x", Integer.valueOf(x));
        $_dependencies8.put("y", Integer.valueOf(y));
        $_dependencies8.put("z", Integer.valueOf(z));
        $_dependencies8.put("world", world);
        ProcedureMaiChu08.executeProcedure($_dependencies8);
        Map<String, Object> $_dependencies9 = new HashMap<>();
        $_dependencies9.put("x", Integer.valueOf(x));
        $_dependencies9.put("y", Integer.valueOf(y));
        $_dependencies9.put("z", Integer.valueOf(z));
        $_dependencies9.put("world", world);
        ProcedureMaiChu09.executeProcedure($_dependencies9);
        Map<String, Object> $_dependencies10 = new HashMap<>();
        $_dependencies10.put("x", Integer.valueOf(x));
        $_dependencies10.put("y", Integer.valueOf(y));
        $_dependencies10.put("z", Integer.valueOf(z));
        $_dependencies10.put("world", world);
        ProcedureMaiChu10.executeProcedure($_dependencies10);
        Map<String, Object> $_dependencies11 = new HashMap<>();
        $_dependencies11.put("x", Integer.valueOf(x));
        $_dependencies11.put("y", Integer.valueOf(y));
        $_dependencies11.put("z", Integer.valueOf(z));
        $_dependencies11.put("world", world);
        ProcedureMaiChu11.executeProcedure($_dependencies11);
        Map<String, Object> $_dependencies12 = new HashMap<>();
        $_dependencies12.put("x", Integer.valueOf(x));
        $_dependencies12.put("y", Integer.valueOf(y));
        $_dependencies12.put("z", Integer.valueOf(z));
        $_dependencies12.put("world", world);
        ProcedureMaiChu12.executeProcedure($_dependencies12);
        Map<String, Object> $_dependencies13 = new HashMap<>();
        $_dependencies13.put("x", Integer.valueOf(x));
        $_dependencies13.put("y", Integer.valueOf(y));
        $_dependencies13.put("z", Integer.valueOf(z));
        $_dependencies13.put("world", world);
        ProcedureMaiChu13.executeProcedure($_dependencies13);
        Map<String, Object> $_dependencies14 = new HashMap<>();
        $_dependencies14.put("x", Integer.valueOf(x));
        $_dependencies14.put("y", Integer.valueOf(y));
        $_dependencies14.put("z", Integer.valueOf(z));
        $_dependencies14.put("world", world);
        ProcedureMaiChu1014.executeProcedure($_dependencies14);
    }
}
