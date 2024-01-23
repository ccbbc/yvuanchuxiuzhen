package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectTokenUpdate.class */
public class ProcedureSectTokenUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectTokenUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 555);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectTokenUpdate$1] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectTokenUpdate$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        Calendar cal = Calendar.getInstance();
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("Master") : "").equals(entity.func_145748_c_().func_150260_c())) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectTokenUpdate.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SectJobUn") != 1) {
                entity.getEntityData().func_74780_a("SectLevel", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("SectLevel") : -1.0d);
                entity.getEntityData().func_74780_a("SectJobLevel", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("SectJobLevel") : -1.0d);
                entity.getEntityData().func_74778_a("SectJobLevelName", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("SectJobLevelName") : "");
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectTokenUpdate.2
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SectJobUn") == 1) {
                entity.getEntityData().func_74780_a("SectLevel", 0.0d);
                entity.getEntityData().func_74780_a("SectJobLevel", 0.0d);
                entity.getEntityData().func_74778_a("SectJobLevelName", "");
            }
            if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("SectJobGetCool")) {
                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("SectJobGetCoolTime") : -1.0d) != cal.get(5)) {
                    if (!itemstack.func_77942_o()) {
                        itemstack.func_77982_d(new NBTTagCompound());
                    }
                    itemstack.func_77978_p().func_74757_a("SectJobGetCool", false);
                }
            }
        }
    }
}
