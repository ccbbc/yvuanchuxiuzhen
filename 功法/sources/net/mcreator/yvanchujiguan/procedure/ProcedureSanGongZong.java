package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureSanGongZong.class */
public class ProcedureSanGongZong extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanGongZong(ElementsYvanchujiguanMod instance) {
        super(instance, 159);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (!entityPlayer.getEntityData().func_74779_i("GongFaShow").equals("")) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa2") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong2.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa1") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong1.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa3") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong3.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa4") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong4.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa5") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong5.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa6") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong6.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa8") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong8.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa31") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong31.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa21") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong21.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa23") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong23.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa24") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong24.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa29") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong29.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa30") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong30.executeProcedure($_dependencies);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa28") > 0.0d) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureSanGong28.executeProcedure($_dependencies);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("你没有修炼中的功法供你散功"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("散功需打坐时进行"), false);
        }
    }
}
