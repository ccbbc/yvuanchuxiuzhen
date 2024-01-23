package net.mcreator.wupinmiaosu.procedure;

import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.mcreator.wupinmiaosu.WupinmiaosuMod;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui12;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui13;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui14;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui15;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui16;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui17;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui18;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui19;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui20;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFaBaoGuiOpen3.class */
public class ProcedureFaBaoGuiOpen3 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFaBaoGuiOpen3(ElementsWupinmiaosuMod instance) {
        super(instance, 135);
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
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0101")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui12.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao13")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui13.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:chi_yan_dao")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui14.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:zhu_que_huan")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui15.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qing_zu_feng_yun_jian")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui16.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qi_yin_xiao")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui17.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1201")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui18.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao22")) {
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui19.GUIID, world, x, y, z);
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("fabaokuozhan:fabao2601") && (entityLivingBase instanceof EntityPlayer)) {
            ((EntityPlayer) entityLivingBase).openGui(WupinmiaosuMod.instance, GuiFaBaoGui20.GUIID, world, x, y, z);
        }
    }
}
