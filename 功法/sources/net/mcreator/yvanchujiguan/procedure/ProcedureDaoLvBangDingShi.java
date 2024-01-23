package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureDaoLvBangDingShi.class */
public class ProcedureDaoLvBangDingShi extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDaoLvBangDingShi(ElementsYvanchujiguanMod instance) {
        super(instance, 98);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [net.mcreator.yvanchujiguan.procedure.ProcedureDaoLvBangDingShi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        entityPlayer.getEntityData().func_74778_a("DaoLv", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureDaoLvBangDingShi.1
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText());
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("道侣绑定成功！"), false);
        }
    }
}
