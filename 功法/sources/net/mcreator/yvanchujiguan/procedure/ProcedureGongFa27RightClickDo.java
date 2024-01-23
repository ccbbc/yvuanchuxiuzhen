package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFa27RightClickDo.class */
public class ProcedureGongFa27RightClickDo extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFa27RightClickDo(ElementsYvanchujiguanMod instance) {
        super(instance, 94);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa27") > 0.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修炼功法已切换至 " + itemstack.func_82833_r()), false);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa", 27.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow", "悟灵诀");
                entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
                return;
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("经转世轮回，已物是人非，此体已无此法所需灵根，便消除自身痕迹留于有缘人吧..."), false);
            }
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74778_a("主人", "");
            return;
        }
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d && entityPlayer.getEntityData().func_74769_h("GongFa27") == 0.0d && entityPlayer.getEntityData().func_74769_h("GongFa4") == 0.0d && entityPlayer.getEntityData().func_74769_h("GongFa3") == 0.0d && entityPlayer.getEntityData().func_74769_h("GongFa2") == 0.0d && entityPlayer.getEntityData().func_74769_h("GongFa5") == 0.0d && entityPlayer.getEntityData().func_74769_h("GongFa1") == 0.0d && !entityPlayer.func_70093_af()) {
                ProcedureGongFaMingXianShi.executeProcedure($_dependencies);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已学习" + itemstack.func_82833_r() + "§f需要打坐研习才能掌握功法。"), false);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa", 27.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow", "悟灵诀");
                entityPlayer.getEntityData().func_74778_a("GongFaShow1", "悟灵诀");
                entityPlayer.getEntityData().func_74780_a("GongFa27", 1.0d);
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
                entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa1") > 3.0d || entityPlayer.getEntityData().func_74769_h("GongFa2") > 3.0d || entityPlayer.getEntityData().func_74769_h("GongFa3") > 3.0d || entityPlayer.getEntityData().func_74769_h("GongFa4") > 3.0d || entityPlayer.getEntityData().func_74769_h("GongFa5") > 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("你学的功法与此功法冲突。"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已非凡人，此法于你已无用"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa27") > 0.0d) {
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("非此物主人，勿要触之"), false);
        }
    }
}
