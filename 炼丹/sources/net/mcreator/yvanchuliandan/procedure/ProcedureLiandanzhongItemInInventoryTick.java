package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLiandanzhongItemInInventoryTick.class */
public class ProcedureLiandanzhongItemInInventoryTick extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureLiandanzhongItemInInventoryTick(ElementsYvanchuliandanMod instance) {
        super(instance, 271);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
        }
    }
}
