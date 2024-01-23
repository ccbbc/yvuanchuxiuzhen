package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemChiSongZi;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureHOngSongYeDiaoLuo.class */
public class ProcedureHOngSongYeDiaoLuo extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureHOngSongYeDiaoLuo(ElementsYvanchuliandanMod instance) {
        super(instance, 728);
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
        if (EnchantmentHelper.func_77506_a(Enchantments.field_185306_r, entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a) == 0 && Math.random() <= 0.2d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemChiSongZi.block, 1));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
            entityLivingBase.getEntityData().func_74780_a("ZhongZhiXp", entityLivingBase.getEntityData().func_74769_h("ZhongZhiXp") + 3.0d);
        }
    }
}
