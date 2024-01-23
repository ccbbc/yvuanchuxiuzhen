package edebe.core.mixin;

import edebe.doglib.api.helper.ItemStackHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({EntityItem.class})
/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/core/mixin/EntityItemMixin.class */
public abstract class EntityItemMixin {
    @Shadow
    public abstract boolean func_70097_a(DamageSource damageSource, float f);

    @Shadow
    public abstract ItemStack func_92059_d();

    @Overwrite
    protected void func_70081_e(int amount) {
        if (!ItemStackHelper.isItemFireResistant(func_92059_d())) {
            func_70097_a(DamageSource.field_76372_a, amount);
        }
    }
}
