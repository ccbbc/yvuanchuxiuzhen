package net.mcreator.lianqisanqiannian.procedure;

import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureGongFaRightClickDo.class */
public class ProcedureGongFaRightClickDo extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureGongFaRightClickDo(ElementsLianqisanqiannianMod instance) {
        super(instance, 3);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
            if (entityPlayer.getEntityData().func_74767_n("JinLingGen") && entityPlayer.getEntityData().func_74767_n("ShuiLingGen") && entityPlayer.getEntityData().func_74767_n("MuLingGen") && entityPlayer.getEntityData().func_74767_n("HuoLingGen") && entityPlayer.getEntityData().func_74767_n("TuLingGen") && entityPlayer.getEntityData().func_74779_i("TiZhi").contains("天妒之体") && entityPlayer.getEntityData().func_74769_h("GongFa27") >= 114.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("主修功法已切换至 " + itemstack.func_82833_r() + "§f需要再次打坐研习掌握功法。"), false);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa", 3000.0d);
                entityPlayer.getEntityData().func_74780_a("GongFa27", 114.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow", "无极培元功");
                entityPlayer.getEntityData().func_74778_a("GongFaShow1", "无极培元功");
                return;
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("经转世轮回，已物是人非，此体已无此法所需灵根与体质，便消除自身痕迹留于有缘人吧..."), false);
                return;
            } else {
                return;
            }
        }
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
            if (entityPlayer.getEntityData().func_74767_n("JinLingGen") && entityPlayer.getEntityData().func_74767_n("ShuiLingGen") && entityPlayer.getEntityData().func_74767_n("MuLingGen") && entityPlayer.getEntityData().func_74767_n("HuoLingGen") && entityPlayer.getEntityData().func_74767_n("TuLingGen") && entityPlayer.getEntityData().func_74779_i("TiZhi").contains("天妒之体") && entityPlayer.getEntityData().func_74769_h("GongFa") != 3000.0d) {
                entityPlayer.getEntityData().func_74780_a("GongFa27", 114.0d);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已习得" + itemstack.func_82833_r() + "§f需要打坐研习才能掌握功法。"), false);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa", 3000.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow", "无极培元功");
                entityPlayer.getEntityData().func_74778_a("GongFaShow1", "无极培元功");
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
            } else if (!entityPlayer.getEntityData().func_74779_i("TiZhi").contains("天妒之体")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("非天妒之体无法习得"), false);
                }
            } else if ((!entityPlayer.getEntityData().func_74767_n("JinLingGen") || !entityPlayer.getEntityData().func_74767_n("ShuiLingGen") || !entityPlayer.getEntityData().func_74767_n("JinLingGen") || !entityPlayer.getEntityData().func_74767_n("HuoLingGen") || !entityPlayer.getEntityData().func_74767_n("TuLingGen")) && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("非五灵根者无法习得"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa1") > 0.0d) {
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
