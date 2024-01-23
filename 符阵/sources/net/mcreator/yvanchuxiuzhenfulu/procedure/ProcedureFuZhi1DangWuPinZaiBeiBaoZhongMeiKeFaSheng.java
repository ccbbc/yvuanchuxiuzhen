package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.item.ItemStack;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFuZhi1DangWuPinZaiBeiBaoZhongMeiKeFaSheng.class */
public class ProcedureFuZhi1DangWuPinZaiBeiBaoZhongMeiKeFaSheng extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFuZhi1DangWuPinZaiBeiBaoZhongMeiKeFaSheng(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 293);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (itemstack.func_82833_r().equals("一阶符纸")) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                itemstack.func_151001_c("一阶符纸(缠绕)");
            }
        }
    }
}
