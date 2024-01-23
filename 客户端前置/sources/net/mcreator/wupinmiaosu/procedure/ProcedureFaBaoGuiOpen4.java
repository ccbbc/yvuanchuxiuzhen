package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui21;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui22;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui23;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui24;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui25;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui26;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui27;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui28;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFaBaoGuiOpen4.class */
public class ProcedureFaBaoGuiOpen4 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFaBaoGuiOpen4(ElementsWupinmiaosuMod instance) {
        super(instance, 136);
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
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0301")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui21.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0201")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui22.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0701")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui23.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhui_hun_zhen")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui24.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:yuan_ci_shen_shan")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui25.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:ming_hai_san_jian_qiang")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui26.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1001")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui27.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fa_bao_33") && (entityLivingBase instanceof EntityPlayer)) {
            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui28.GUIID, world, x, y, z);
        }
    }
}
