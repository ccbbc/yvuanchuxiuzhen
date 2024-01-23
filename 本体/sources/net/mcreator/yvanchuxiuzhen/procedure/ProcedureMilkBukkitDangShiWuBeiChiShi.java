package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureMilkBukkitDangShiWuBeiChiShi.class */
public class ProcedureMilkBukkitDangShiWuBeiChiShi extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMilkBukkitDangShiWuBeiChiShi(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 270);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer instanceof EntityPlayer) {
            ItemStack _setstack = new ItemStack(Items.field_151133_ar, 1);
            _setstack.func_190920_e(1);
            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
        }
    }
}
