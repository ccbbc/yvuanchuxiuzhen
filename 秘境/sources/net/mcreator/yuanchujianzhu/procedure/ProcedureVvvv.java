package net.mcreator.yuanchujianzhu.procedure;

import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.YuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.block.BlockBaoXiang04;
import net.mcreator.yuanchujianzhu.block.BlockDongFuShangHai4;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureVvvv.class */
public class ProcedureVvvv extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureVvvv(ElementsYuanchujianzhuMod instance) {
        super(instance, 249);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        Template template;
        Template template2;
        Template template3;
        Template template4;
        Template template5;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!((World) worldServer).field_72995_K && (template5 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "zhongshi1"))) != null) {
            BlockPos spawnTo = new BlockPos(x, y, z);
            IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
            worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
            template5.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template4 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "zhongshi2"))) != null) {
            BlockPos spawnTo2 = new BlockPos(x - 4, y + 9, z + 12);
            IBlockState iblockstate2 = worldServer.func_180495_p(spawnTo2);
            worldServer.func_184138_a(spawnTo2, iblockstate2, iblockstate2, 3);
            template4.func_186260_a(worldServer, spawnTo2, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template3 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "zhongshi2"))) != null) {
            BlockPos spawnTo3 = new BlockPos(x - 4, y + 9, z + 12);
            IBlockState iblockstate3 = worldServer.func_180495_p(spawnTo3);
            worldServer.func_184138_a(spawnTo3, iblockstate3, iblockstate3, 3);
            template3.func_186260_a(worldServer, spawnTo3, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.LEFT_RIGHT).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template2 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "zhongshi2"))) != null) {
            BlockPos spawnTo4 = new BlockPos(x + 28, y + 9, z + 12);
            IBlockState iblockstate4 = worldServer.func_180495_p(spawnTo4);
            worldServer.func_184138_a(spawnTo4, iblockstate4, iblockstate4, 3);
            template2.func_186260_a(worldServer, spawnTo4, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "zhongshi2"))) != null) {
            BlockPos spawnTo5 = new BlockPos(x + 28, y + 9, z + 12);
            IBlockState iblockstate5 = worldServer.func_180495_p(spawnTo5);
            worldServer.func_184138_a(spawnTo5, iblockstate5, iblockstate5, 3);
            template.func_186260_a(worldServer, spawnTo5, new PlacementSettings().func_186220_a(Rotation.CLOCKWISE_180).func_186214_a(Mirror.LEFT_RIGHT).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (worldServer.func_175659_aa() != EnumDifficulty.PEACEFUL && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
            worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureVvvv.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return worldServer;
                }

                public MinecraftServer func_184102_h() {
                    return worldServer.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos(x + 10, y + 4, z + 12);
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 10, y + 4, z + 12);
                }
            }, "summon yvanchuyaoshou:he_huan_zong_1 ~ ~ ~");
        }
        worldServer.func_180501_a(new BlockPos(x + 10, y + 1, z + 12), BlockBaoXiang04.block.func_176223_P(), 3);
        worldServer.func_180501_a(new BlockPos(x + 10, y + 10, z + 12), BlockDongFuShangHai4.block.func_176223_P(), 3);
    }
}
