package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiGongFa10GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa11GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa12GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa13GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa14GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa15GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa16GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa17GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa18GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa19GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa1GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa20GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa22GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa23GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa24GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa25GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa26GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa27GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa28GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa29GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa2GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa30GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa31GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa32GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa33GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa3GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa4GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa5GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa6GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa7GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa8GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa9GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFaWuJi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureGongFaMiaoSu.class */
public class ProcedureGongFaMiaoSu extends ElementsWupinmiaosuMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaMiaoSu(ElementsWupinmiaosuMod instance) {
        super(instance, 14);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureTest.executeProcedure($_dependencies);
        if (entityLivingBase.func_70093_af()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_1") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa1GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_2") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa2GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_3") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa3GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_4") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa4GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_5") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa5GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_6") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa6GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_7") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa7GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_8") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa8GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_9") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa9GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_10") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa10GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_11") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa11GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_12") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa12GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_13") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa13GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_14") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa14GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_15") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa15GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_16") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa16GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_17") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa17GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_18") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa18GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_19") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa19GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_20") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa20GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_21") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa7GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_22") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa22GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_23") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa23GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_24") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa24GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_25") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa25GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_26") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa26GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_27") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa27GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_28") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa28GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_29") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa29GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_30") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa30GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_31") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa31GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_32") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa32GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:gong_fa_33") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFa33GUI.GUIID, world, x, y, z);
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("lianqisanqiannian:gong_fa") && (entityLivingBase instanceof EntityPlayer)) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiGongFaWuJi.GUIID, world, x, y, z);
            }
            $_dependencies.put("entity", entityLivingBase);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureFaBaoGuiOpen.executeProcedure($_dependencies);
        }
    }
}
