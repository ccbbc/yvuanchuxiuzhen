package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui29;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui30;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui31;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui32;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui33;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui34;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui35;
import net.mcreator.wupinmiaosu.gui.GuiPoZhenzhui;
import net.mcreator.wupinmiaosu.gui.GuiQuLeiDianFu;
import net.mcreator.wupinmiaosu.gui.GuiXiaoLvPing;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFaBaoGuiOpen5.class */
public class ProcedureFaBaoGuiOpen5 extends ElementsWupinmiaosuMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFaBaoGuiOpen5(ElementsWupinmiaosuMod instance) {
        super(instance, 137);
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
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0501")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui29.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1401")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui30.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao17")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui31.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:lei_ji_mu_jian")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui32.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("fabaokuozhan:fabao34")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui33.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("fabaokuozhan:dao_pao_04")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui34.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:cang_yun_fei_huo")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui35.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:jin_gu_bang")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao32")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:xiao_lv_ping")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiXiaoLvPing.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:breaking_cone")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiPoZhenzhui.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:thunder_repelling_charm") && (entityLivingBase instanceof EntityPlayer)) {
            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiQuLeiDianFu.GUIID, world, x, y, z);
        }
    }
}
