package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.mcreator.yvanchujiguan.YvanchujiguanMod;
import net.mcreator.yvanchujiguan.gui.GuiGui9;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFa9RightClickDo.class */
public class ProcedureGongFa9RightClickDo extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFa9RightClickDo(ElementsYvanchujiguanMod instance) {
        super(instance, 69);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!entityPlayer.func_70093_af()) {
            if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
                    if (entityPlayer.getEntityData().func_74769_h("GongFa9") == 0.0d && entityPlayer.getEntityData().func_74769_h("ShaQi") >= 100.0d && entityPlayer.getEntityData().func_74769_h("GongFa7") == 0.0d) {
                        entityPlayer.getEntityData().func_74780_a("GongFa9", 1.0d);
                        entityPlayer.getEntityData().func_74780_a("GongFa", 9.0d);
                        ProcedureGongFaMingXianShi.executeProcedure($_dependencies);
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("已学习" + itemstack.func_82833_r() + "§f需要打坐研习才能掌握功法。"), false);
                        }
                        entityPlayer.getEntityData().func_74778_a("GongFaShow2", "§9玄阴大法");
                        if (!itemstack.func_77942_o()) {
                            itemstack.func_77982_d(new NBTTagCompound());
                        }
                        itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
                        entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
                    } else if (entityPlayer.getEntityData().func_74769_h("GongFa7") > 0.0d) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("你学的功法与此功法冲突。"), false);
                        }
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("是否切换所学功法，若是请发送/rc2"), false);
                        }
                    } else if (entityPlayer.getEntityData().func_74769_h("ShaQi") < 100.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("煞气不足，无法修得此法精髓"), false);
                    }
                    if (entityPlayer.getEntityData().func_74769_h("GongFa9") > 0.0d) {
                        if (!itemstack.func_77942_o()) {
                            itemstack.func_77982_d(new NBTTagCompound());
                        }
                        itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("非此物主人，勿要触之"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa9") > 0.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修炼功法已切换至 " + itemstack.func_82833_r()), false);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa", 9.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow2", "§9玄阴大法");
                entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
            } else {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("经转世轮回，已物是人非，前世痕迹已尽散除"), false);
                }
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74778_a("主人", "");
            }
        }
        if (entityPlayer.func_70093_af() && (entityPlayer instanceof EntityPlayer)) {
            entityPlayer.openGui(YvanchujiguanMod.instance, GuiGui9.GUIID, world, x, y, z);
        }
    }
}
