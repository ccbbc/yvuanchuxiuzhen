package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSanXianLingGuiBind.class */
public class ProcedureSanXianLingGuiBind extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXianLingGuiBind(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 501);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 0.0d) {
            if ((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("fabaokuozhan:caiitem04"), 1))) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("fabaokuozhan:caiitem04"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_151001_c("§f" + entityPlayer.func_145748_c_().func_150260_c() + "的散仙令");
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l绑定成功");
                ItemStack _stack = entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74778_a("Master", entityPlayer.func_145748_c_().func_150260_c());
                ItemStack _stack2 = entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                _stack2.func_77978_p().func_74780_a("SanXianLingLevel", 1.0d);
                entityPlayer.getEntityData().func_74780_a("SanXianLingLevel", 1.0d);
                return;
            }
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l未有精血");
            return;
        }
        entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l已然绑定");
    }
}
