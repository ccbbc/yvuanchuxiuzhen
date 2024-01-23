package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockCailiao1201;
import net.mcreator.fabaokuozhan.block.BlockCailiao1501;
import net.mcreator.fabaokuozhan.block.BlockCailiao1701;
import net.mcreator.fabaokuozhan.block.BlockCailiao1801;
import net.mcreator.fabaokuozhan.block.BlockCailiao52;
import net.mcreator.fabaokuozhan.block.BlockCailiao91;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCailiao1201EntityWalksOnTheBlock.class */
public class ProcedureCailiao1201EntityWalksOnTheBlock extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCailiao1201EntityWalksOnTheBlock(ElementsFabaokuozhanMod instance) {
        super(instance, 177);
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
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCailiao1201.block.func_176223_P().func_177230_c() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 10.0d) {
            entityLivingBase.func_70015_d(2);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCailiao1501.block.func_176223_P().func_177230_c() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 14.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 1, true, true));
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCailiao1701.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y + 1, z), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if ((world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCailiao1801.block.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCailiao52.block.func_176223_P().func_177230_c()) && entityLivingBase.getEntityData().func_74769_h("jingjie") < 22.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 1, true, true));
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCailiao91.block.func_176223_P().func_177230_c() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 10.0d) {
            entityLivingBase.func_70097_a(DamageSource.field_76370_b, 2.0f);
        }
    }
}
