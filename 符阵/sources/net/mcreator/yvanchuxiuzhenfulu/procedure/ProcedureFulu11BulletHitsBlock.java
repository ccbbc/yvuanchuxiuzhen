package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu11BulletHitsBlock.class */
public class ProcedureFulu11BulletHitsBlock extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu11BulletHitsBlock(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 92);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        Template template;
        Template template2;
        Template template3;
        Template template4;
        Template template5;
        Template template6;
        Template template7;
        Template template8;
        Template template9;
        Template template10;
        Template template11;
        Template template12;
        Template template13;
        Template template14;
        Template template15;
        Template template16;
        Template template17;
        Template template18;
        Template template19;
        Template template20;
        Template template21;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if ((worldServer.func_180495_p(new BlockPos(x, y + 10, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 10, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 10, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11011"))) != null) {
            BlockPos spawnTo = new BlockPos(x - 3, y + 10, z - 3);
            IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
            worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
            template.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 9, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 9, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 9, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template2 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11010"))) != null) {
            BlockPos spawnTo2 = new BlockPos(x - 5, y + 9, z - 5);
            IBlockState iblockstate2 = worldServer.func_180495_p(spawnTo2);
            worldServer.func_184138_a(spawnTo2, iblockstate2, iblockstate2, 3);
            template2.func_186260_a(worldServer, spawnTo2, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 8, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 8, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 8, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template3 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11009"))) != null) {
            BlockPos spawnTo3 = new BlockPos(x - 6, y + 8, z - 6);
            IBlockState iblockstate3 = worldServer.func_180495_p(spawnTo3);
            worldServer.func_184138_a(spawnTo3, iblockstate3, iblockstate3, 3);
            template3.func_186260_a(worldServer, spawnTo3, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 7, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 7, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 7, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template4 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11008"))) != null) {
            BlockPos spawnTo4 = new BlockPos(x - 7, y + 7, z - 7);
            IBlockState iblockstate4 = worldServer.func_180495_p(spawnTo4);
            worldServer.func_184138_a(spawnTo4, iblockstate4, iblockstate4, 3);
            template4.func_186260_a(worldServer, spawnTo4, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 6, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 6, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 6, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template5 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11007"))) != null) {
            BlockPos spawnTo5 = new BlockPos(x - 8, y + 6, z - 8);
            IBlockState iblockstate5 = worldServer.func_180495_p(spawnTo5);
            worldServer.func_184138_a(spawnTo5, iblockstate5, iblockstate5, 3);
            template5.func_186260_a(worldServer, spawnTo5, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 5, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 5, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 5, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template6 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11006"))) != null) {
            BlockPos spawnTo6 = new BlockPos(x - 9, y + 5, z - 9);
            IBlockState iblockstate6 = worldServer.func_180495_p(spawnTo6);
            worldServer.func_184138_a(spawnTo6, iblockstate6, iblockstate6, 3);
            template6.func_186260_a(worldServer, spawnTo6, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 4, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 4, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 4, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template7 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11005"))) != null) {
            BlockPos spawnTo7 = new BlockPos(x - 9, y + 4, z - 9);
            IBlockState iblockstate7 = worldServer.func_180495_p(spawnTo7);
            worldServer.func_184138_a(spawnTo7, iblockstate7, iblockstate7, 3);
            template7.func_186260_a(worldServer, spawnTo7, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 3, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 3, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 3, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template8 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11004"))) != null) {
            BlockPos spawnTo8 = new BlockPos(x - 10, y + 3, z - 10);
            IBlockState iblockstate8 = worldServer.func_180495_p(spawnTo8);
            worldServer.func_184138_a(spawnTo8, iblockstate8, iblockstate8, 3);
            template8.func_186260_a(worldServer, spawnTo8, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 2, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 2, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 2, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template9 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11003"))) != null) {
            BlockPos spawnTo9 = new BlockPos(x - 10, y + 2, z - 10);
            IBlockState iblockstate9 = worldServer.func_180495_p(spawnTo9);
            worldServer.func_184138_a(spawnTo9, iblockstate9, iblockstate9, 3);
            template9.func_186260_a(worldServer, spawnTo9, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y + 1, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y + 1, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template10 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11002"))) != null) {
            BlockPos spawnTo10 = new BlockPos(x - 10, y + 1, z - 10);
            IBlockState iblockstate10 = worldServer.func_180495_p(spawnTo10);
            worldServer.func_184138_a(spawnTo10, iblockstate10, iblockstate10, 3);
            template10.func_186260_a(worldServer, spawnTo10, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template11 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11001"))) != null) {
            BlockPos spawnTo11 = new BlockPos(x - 10, y, z - 10);
            IBlockState iblockstate11 = worldServer.func_180495_p(spawnTo11);
            worldServer.func_184138_a(spawnTo11, iblockstate11, iblockstate11, 3);
            template11.func_186260_a(worldServer, spawnTo11, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template12 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11002"))) != null) {
            BlockPos spawnTo12 = new BlockPos(x - 10, y - 1, z - 10);
            IBlockState iblockstate12 = worldServer.func_180495_p(spawnTo12);
            worldServer.func_184138_a(spawnTo12, iblockstate12, iblockstate12, 3);
            template12.func_186260_a(worldServer, spawnTo12, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 2, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 2, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 2, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template13 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11003"))) != null) {
            BlockPos spawnTo13 = new BlockPos(x - 10, y - 2, z - 10);
            IBlockState iblockstate13 = worldServer.func_180495_p(spawnTo13);
            worldServer.func_184138_a(spawnTo13, iblockstate13, iblockstate13, 3);
            template13.func_186260_a(worldServer, spawnTo13, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 3, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 3, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 3, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template14 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11004"))) != null) {
            BlockPos spawnTo14 = new BlockPos(x - 10, y - 3, z - 10);
            IBlockState iblockstate14 = worldServer.func_180495_p(spawnTo14);
            worldServer.func_184138_a(spawnTo14, iblockstate14, iblockstate14, 3);
            template14.func_186260_a(worldServer, spawnTo14, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 4, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 4, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 4, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template15 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11005"))) != null) {
            BlockPos spawnTo15 = new BlockPos(x - 9, y - 4, z - 9);
            IBlockState iblockstate15 = worldServer.func_180495_p(spawnTo15);
            worldServer.func_184138_a(spawnTo15, iblockstate15, iblockstate15, 3);
            template15.func_186260_a(worldServer, spawnTo15, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 5, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 5, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 5, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template16 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11006"))) != null) {
            BlockPos spawnTo16 = new BlockPos(x - 9, y - 5, z - 9);
            IBlockState iblockstate16 = worldServer.func_180495_p(spawnTo16);
            worldServer.func_184138_a(spawnTo16, iblockstate16, iblockstate16, 3);
            template16.func_186260_a(worldServer, spawnTo16, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 6, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 6, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 6, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template17 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11007"))) != null) {
            BlockPos spawnTo17 = new BlockPos(x - 8, y - 6, z - 8);
            IBlockState iblockstate17 = worldServer.func_180495_p(spawnTo17);
            worldServer.func_184138_a(spawnTo17, iblockstate17, iblockstate17, 3);
            template17.func_186260_a(worldServer, spawnTo17, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 7, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 7, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 7, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template18 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11008"))) != null) {
            BlockPos spawnTo18 = new BlockPos(x - 7, y - 7, z - 7);
            IBlockState iblockstate18 = worldServer.func_180495_p(spawnTo18);
            worldServer.func_184138_a(spawnTo18, iblockstate18, iblockstate18, 3);
            template18.func_186260_a(worldServer, spawnTo18, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 8, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 8, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 8, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template19 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11009"))) != null) {
            BlockPos spawnTo19 = new BlockPos(x - 6, y - 8, z - 6);
            IBlockState iblockstate19 = worldServer.func_180495_p(spawnTo19);
            worldServer.func_184138_a(spawnTo19, iblockstate19, iblockstate19, 3);
            template19.func_186260_a(worldServer, spawnTo19, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 9, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 9, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 9, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template20 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11010"))) != null) {
            BlockPos spawnTo20 = new BlockPos(x - 5, y - 9, z - 5);
            IBlockState iblockstate20 = worldServer.func_180495_p(spawnTo20);
            worldServer.func_184138_a(spawnTo20, iblockstate20, iblockstate20, 3);
            template20.func_186260_a(worldServer, spawnTo20, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if ((worldServer.func_180495_p(new BlockPos(x, y - 10, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y - 10, z)).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos(x, y - 10, z)).func_185904_a() == Material.field_151582_l) && !((World) worldServer).field_72995_K && (template21 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "fulu11011"))) != null) {
            BlockPos spawnTo21 = new BlockPos(x - 3, y - 10, z - 3);
            IBlockState iblockstate21 = worldServer.func_180495_p(spawnTo21);
            worldServer.func_184138_a(spawnTo21, iblockstate21, iblockstate21, 3);
            template21.func_186260_a(worldServer, spawnTo21, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
    }
}
