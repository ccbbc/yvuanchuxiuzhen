package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenModVariables;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureWeimian0103PlayerEntersDimension.class */
public class ProcedureWeimian0103PlayerEntersDimension extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureWeimian0103PlayerEntersDimension(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 198);
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
        if (dependencies.get("world") == null) {
            return;
        }
        WorldServer worldServer = (World) dependencies.get("world");
        if (YvanchuxiuzhenModVariables.MapVariables.get(worldServer).liucheng == 0.0d) {
            if (!((World) worldServer).field_72995_K && (template8 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou02"))) != null) {
                BlockPos spawnTo = new BlockPos(-45, 70, -14);
                IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
                worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                template8.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            if (!((World) worldServer).field_72995_K && (template7 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou03"))) != null) {
                BlockPos spawnTo2 = new BlockPos(-13, 70, -5);
                IBlockState iblockstate2 = worldServer.func_180495_p(spawnTo2);
                worldServer.func_184138_a(spawnTo2, iblockstate2, iblockstate2, 3);
                template7.func_186260_a(worldServer, spawnTo2, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            if (!((World) worldServer).field_72995_K && (template6 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou04"))) != null) {
                BlockPos spawnTo3 = new BlockPos(-30, 64, -64);
                IBlockState iblockstate3 = worldServer.func_180495_p(spawnTo3);
                worldServer.func_184138_a(spawnTo3, iblockstate3, iblockstate3, 3);
                template6.func_186260_a(worldServer, spawnTo3, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            if (!((World) worldServer).field_72995_K && (template5 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou04"))) != null) {
                BlockPos spawnTo4 = new BlockPos(-30, 64, -32);
                IBlockState iblockstate4 = worldServer.func_180495_p(spawnTo4);
                worldServer.func_184138_a(spawnTo4, iblockstate4, iblockstate4, 3);
                template5.func_186260_a(worldServer, spawnTo4, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            if (!((World) worldServer).field_72995_K && (template4 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou04"))) != null) {
                BlockPos spawnTo5 = new BlockPos(-30, 64, 0);
                IBlockState iblockstate5 = worldServer.func_180495_p(spawnTo5);
                worldServer.func_184138_a(spawnTo5, iblockstate5, iblockstate5, 3);
                template4.func_186260_a(worldServer, spawnTo5, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            if (!((World) worldServer).field_72995_K && (template3 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou04"))) != null) {
                BlockPos spawnTo6 = new BlockPos(-30, 64, 32);
                IBlockState iblockstate6 = worldServer.func_180495_p(spawnTo6);
                worldServer.func_184138_a(spawnTo6, iblockstate6, iblockstate6, 3);
                template3.func_186260_a(worldServer, spawnTo6, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            if (!((World) worldServer).field_72995_K && (template2 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou04"))) != null) {
                BlockPos spawnTo7 = new BlockPos(-30, 64, 64);
                IBlockState iblockstate7 = worldServer.func_180495_p(spawnTo7);
                worldServer.func_184138_a(spawnTo7, iblockstate7, iblockstate7, 3);
                template2.func_186260_a(worldServer, spawnTo7, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenMod.MODID, "jiegou04"))) != null) {
                BlockPos spawnTo8 = new BlockPos(-30, 64, 96);
                IBlockState iblockstate8 = worldServer.func_180495_p(spawnTo8);
                worldServer.func_184138_a(spawnTo8, iblockstate8, iblockstate8, 3);
                template.func_186260_a(worldServer, spawnTo8, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
            }
            YvanchuxiuzhenModVariables.MapVariables.get(worldServer).liucheng = 1.0d;
            YvanchuxiuzhenModVariables.MapVariables.get(worldServer).syncData(worldServer);
        }
    }
}
