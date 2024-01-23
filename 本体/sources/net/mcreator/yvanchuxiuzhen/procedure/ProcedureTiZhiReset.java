package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.Config;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureTiZhiReset.class */
public class ProcedureTiZhiReset extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTiZhiReset(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 295);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74779_i("TiZhi").equals("")) {
            if ((entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 2.0d || entityPlayer.getEntityData().func_74769_h("TiZhiNum") == 3.0d) && Math.random() <= 0.05d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "三阳之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 1.0d);
            }
            if (Math.random() <= 0.01d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "龙吟之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 2.0d);
            }
            if (entityPlayer.getEntityData().func_74767_n("JinLingGen") && Math.random() <= 0.05d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "锻金之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 3.0d);
            }
            if (entityPlayer.getEntityData().func_74767_n("MuLingGen") && Math.random() <= 0.05d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "木灵之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 4.0d);
            }
            if (entityPlayer.getEntityData().func_74767_n("ShuiLingGen") && Math.random() <= 0.05d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "水灵之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 5.0d);
            }
            if (entityPlayer.getEntityData().func_74767_n("HuoLingGen") && Math.random() <= 0.05d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "火灵之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 6.0d);
            }
            if (entityPlayer.getEntityData().func_74767_n("TuLingGen") && Math.random() <= 0.05d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "土灵之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 7.0d);
            }
            if (entityPlayer.getEntityData().func_74767_n("HuoLingGen") && Math.random() <= 0.05d) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "炎灵之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 8.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("LingGenNum") == 5.0d && Math.random() <= 0.05d && Config.SpecialEdition) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "天妒之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 11.0d);
                if (entityPlayer instanceof EntityPlayer) {
                    ItemStack _setstack = new ItemStack(Item.func_111206_d("lianqisanqiannian:chun_jun_jian"), 1);
                    _setstack.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    ItemStack _setstack2 = new ItemStack(Item.func_111206_d("lianqisanqiannian:gong_fa"), 1);
                    _setstack2.func_190920_e(1);
                    ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack2);
                }
            }
            if (entityPlayer.getEntityData().func_74779_i("TiZhi").equals("")) {
                entityPlayer.getEntityData().func_74778_a("TiZhi", "平庸之体");
                entityPlayer.getEntityData().func_74780_a("TiZhiNum", 0.0d);
            }
        }
    }
}
