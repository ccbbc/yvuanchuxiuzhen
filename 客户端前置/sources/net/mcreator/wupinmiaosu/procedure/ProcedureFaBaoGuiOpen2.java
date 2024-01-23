package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui10;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui11;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui6;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui7;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui8;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui9;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFaBaoGuiOpen2.class */
public class ProcedureFaBaoGuiOpen2 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFaBaoGuiOpen2(ElementsWupinmiaosuMod instance) {
        super(instance, 134);
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
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao04")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui6.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:xing_du_duan_d_ao")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui7.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:jin_yu_huan")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui8.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao31")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui9.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhu_gun")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui10.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0801") && (entityLivingBase instanceof EntityPlayer)) {
            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui11.GUIID, world, x, y, z);
        }
    }
}
