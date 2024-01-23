package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui1;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui2;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui3;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui4;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui5;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFaBaoGuiOpen1.class */
public class ProcedureFaBaoGuiOpen1 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFaBaoGuiOpen1(ElementsWupinmiaosuMod instance) {
        super(instance, 133);
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
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fu_huo_hu_lu")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui1.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("fabaokuozhan:fabao2501")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui2.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao21")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui3.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:po_shan")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui4.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1501") && (entityLivingBase instanceof EntityPlayer)) {
            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui5.GUIID, world, x, y, z);
        }
    }
}
