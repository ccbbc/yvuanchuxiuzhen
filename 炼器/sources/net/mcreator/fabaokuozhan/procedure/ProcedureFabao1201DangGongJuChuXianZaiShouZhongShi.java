package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao1201DangGongJuChuXianZaiShouZhongShi.class */
public class ProcedureFabao1201DangGongJuChuXianZaiShouZhongShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao1201DangGongJuChuXianZaiShouZhongShi(ElementsFabaokuozhanMod instance) {
        super(instance, 556);
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
            itemstack.func_77978_p().func_74780_a("境界需求", 3.0d);
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("初始化", true);
        }
    }
}
