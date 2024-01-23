package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureShuXingWuXiao.class */
public class ProcedureShuXingWuXiao extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShuXingWuXiao(ElementsYvanchuliandanMod instance) {
        super(instance, 939);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuXingWuXiao$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuXingWuXiao$2] */
    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return false;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuXingWuXiao.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore(entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存")) == 1 && (entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存").equals("danyao10") || entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存").equals("danyao11") || entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存").equals("danyao12") || entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存").equals("danyao13"))) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("该丹药服用过多,已无药效"), false);
                return false;
            }
            return false;
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuXingWuXiao.2
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore(entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存")) >= 7) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("该丹药服用过多,已无药效"), false);
                return false;
            }
            return false;
        } else {
            return true;
        }
    }
}
