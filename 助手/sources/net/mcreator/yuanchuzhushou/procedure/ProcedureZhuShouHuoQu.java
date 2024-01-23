package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.item.ItemZhuShou;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureZhuShouHuoQu.class */
public class ProcedureZhuShouHuoQu extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureZhuShouHuoQu(ElementsYuanchuzhushouMod instance) {
        super(instance, 4);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.func_70003_b(4, "")) {
            if (entityPlayer instanceof EntityPlayer) {
                ItemStack _setstack = new ItemStack(ItemZhuShou.block, 1);
                _setstack.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§4你无权获取助手"), false);
        }
    }
}
