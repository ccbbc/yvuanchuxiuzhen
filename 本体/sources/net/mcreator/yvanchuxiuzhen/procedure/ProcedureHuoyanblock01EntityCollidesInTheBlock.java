package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock01;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock02;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock03;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock04;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock05;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock06;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock07;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock08;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock09;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock11;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock12;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock13;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock14;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock15;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock16;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock17;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock18;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock19;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyanblock01EntityCollidesInTheBlock.class */
public class ProcedureHuoyanblock01EntityCollidesInTheBlock extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyanblock01EntityCollidesInTheBlock(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 131);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01EntityCollidesInTheBlock$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01EntityCollidesInTheBlock.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "name").equals(entity.func_145748_c_().func_150260_c())) {
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock01.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 5.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock11.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 5.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock02.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 10.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock12.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 10.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock03.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 15.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock13.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 15.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock04.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 20.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock14.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 20.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock05.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 25.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock15.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 25.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock06.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 30.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock16.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 30.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock07.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 35.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock17.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 35.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock08.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 40.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock18.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 40.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock09.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 45.0f);
            }
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHuoyanblock19.block.func_176223_P().func_177230_c()) {
                entity.func_70097_a(DamageSource.field_76372_a, 45.0f);
            }
        }
    }
}
