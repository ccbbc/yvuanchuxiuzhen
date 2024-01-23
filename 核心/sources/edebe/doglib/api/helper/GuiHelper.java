package edebe.doglib.api.helper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/GuiHelper.class */
public interface GuiHelper {
    static ITextComponent getGuiTitle(ItemStack stack) {
        return stack.func_82837_s() ? new TextComponentString(stack.func_82833_r()) : new TextComponentTranslation(stack.func_77977_a() + ".name", new Object[0]);
    }

    static void updateGui(EntityPlayer player, Object instance, int guiIndex, World world, int x, int y, int z) {
        for (int i = 0; i < 2; i++) {
            player.openGui(instance, guiIndex, world, x, y, z);
        }
    }
}
