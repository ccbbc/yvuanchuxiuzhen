package net.mcreator.fabaokuozhan.fuel;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCailiao9101;
import net.minecraft.item.ItemStack;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/fuel/FuelCailiao9102.class */
public class FuelCailiao9102 extends ElementsFabaokuozhanMod.ModElement {
    public FuelCailiao9102(ElementsFabaokuozhanMod instance) {
        super(instance, 189);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public int addFuel(ItemStack fuel) {
        if (fuel.func_77973_b() == new ItemStack(ItemCailiao9101.block, 1).func_77973_b()) {
            return 3200;
        }
        return 0;
    }
}
