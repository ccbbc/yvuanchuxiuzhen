package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemSanXianLing;
import net.mcreator.yvanchuxiuzhen.potion.PotionSanXianBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSanXianLingGuiUnBind.class */
public class ProcedureSanXianLingGuiUnBind extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXianLingGuiUnBind(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 502);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        if (entityPlayerMP.getEntityData().func_74769_h("SanXianLingLevel") != 0.0d) {
            if (entityPlayerMP instanceof EntityLivingBase) {
                ItemStack _setstack = new ItemStack(ItemSanXianLing.block, 1);
                _setstack.func_190920_e(1);
                ((EntityLivingBase) entityPlayerMP).func_184611_a(EnumHand.MAIN_HAND, _setstack);
                if (entityPlayerMP instanceof EntityPlayerMP) {
                    entityPlayerMP.field_71071_by.func_70296_d();
                }
            }
            entityPlayerMP.getEntityData().func_74780_a("SanXianLingLevel", 0.0d);
            entityPlayerMP.getEntityData().func_74778_a("SxlGuiTip", "§2§l解绑成功");
            if (entityPlayerMP instanceof EntityLivingBase) {
                ((EntityLivingBase) entityPlayerMP).func_184589_d(PotionSanXianBuff.potion);
                return;
            }
            return;
        }
        entityPlayerMP.getEntityData().func_74778_a("SxlGuiTip", "§4§l尚未绑定");
    }
}
