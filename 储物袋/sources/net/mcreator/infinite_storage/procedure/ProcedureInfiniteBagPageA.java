package net.mcreator.infinite_storage.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureInfiniteBagPageA.class */
public class ProcedureInfiniteBagPageA extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureInfiniteBagPageA(ElementsInfiniteStorageMod instance) {
        super(instance, 22);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagPageA$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if (entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage") > 0.0d) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entityPlayerMP);
            ProcedureInfiniteBagGuiClose.executeProcedure($_dependencies);
            for (int i = 0; i < 54; i++) {
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    Supplier supplier = entityPlayerMP.field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            ((Slot) ((Map) invobj).get(Integer.valueOf(i))).func_75209_a(64);
                            supplier.func_75142_b();
                        }
                    }
                }
            }
            if (entityPlayerMP instanceof EntityPlayer) {
                Scoreboard _sc = ((EntityPlayer) entityPlayerMP).func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("InfiniteBagPage");
                if (_so == null) {
                    _so = _sc.func_96535_a("InfiniteBagPage", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(((EntityPlayer) entityPlayerMP).func_146103_bH().getName(), _so);
                _scr.func_96647_c(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagPageA.1
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entityPlayerMP instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayerMP.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entityPlayerMP.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("InfiniteBagPage") - 1);
            }
            entityPlayerMP.getEntityData().func_74780_a("InfiniteBagPage", entityPlayerMP.getEntityData().func_74769_h("InfiniteBagPage") - 1.0d);
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("entity", entityPlayerMP);
            ProcedureInfiniteBagUpdate.executeProcedure($_dependencies2);
        }
    }
}
