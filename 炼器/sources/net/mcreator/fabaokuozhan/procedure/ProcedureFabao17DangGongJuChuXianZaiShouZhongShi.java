package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao17DangGongJuChuXianZaiShouZhongShi.class */
public class ProcedureFabao17DangGongJuChuXianZaiShouZhongShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao17DangGongJuChuXianZaiShouZhongShi(ElementsFabaokuozhanMod instance) {
        super(instance, 444);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (!itemstack.func_77942_o() || !itemstack.func_77978_p().func_74767_n("初始化")) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("法攻增幅", 0.0d);
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("物攻增幅", 0.2d);
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("附加法攻", 0.0d);
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("境界需求", 5.0d);
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("物理", true);
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("初始化", true);
        }
    }
}
