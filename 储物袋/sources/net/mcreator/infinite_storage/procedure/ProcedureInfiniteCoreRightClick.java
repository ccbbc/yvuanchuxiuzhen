package net.mcreator.infinite_storage.procedure;

import java.util.Map;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureInfiniteCoreRightClick.class */
public class ProcedureInfiniteCoreRightClick extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureInfiniteCoreRightClick(ElementsInfiniteStorageMod instance) {
        super(instance, 16);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!entityPlayer.getEntityData().func_74767_n("InfiniteBagOn")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString(new TextComponentTranslation("Infinite_storage.on", new Object[0]).func_150261_e()), true);
            }
            entityPlayer.getEntityData().func_74757_a("InfiniteBagOn", true);
            world.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("block.enchantment_table.use")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
            itemstack.func_190918_g(1);
            if (entityPlayer instanceof EntityPlayerMP) {
                Advancement _adv = ((EntityPlayerMP) entityPlayer).field_71133_b.func_191949_aK().func_192778_a(new ResourceLocation("none"));
                AdvancementProgress _ap = ((EntityPlayerMP) entityPlayer).func_192039_O().func_192747_a(_adv);
                if (!_ap.func_192105_a()) {
                    for (String _criterion : _ap.func_192107_d()) {
                        ((EntityPlayerMP) entityPlayer).func_192039_O().func_192750_a(_adv, _criterion);
                    }
                }
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString(new TextComponentTranslation("Infinite_core.msg.a", new Object[0]).func_150261_e()), false);
            }
        } else if (entityPlayer.getEntityData().func_74767_n("InfiniteBagOn") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString(new TextComponentTranslation("Infinite_core.msg.b", new Object[0]).func_150261_e()), false);
        }
    }
}
