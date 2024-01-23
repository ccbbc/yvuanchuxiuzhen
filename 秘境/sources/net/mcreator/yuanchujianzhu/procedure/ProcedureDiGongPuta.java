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
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureDiGongPuta.class */
public class ProcedureDiGongPuta extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureDiGongPuta(ElementsYuanchujianzhuMod instance) {
        super(instance, 248);
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
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!((World) worldServer).field_72995_K && (template15 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongjiao"))) != null) {
            BlockPos spawnTo = new BlockPos(x, y, z);
            IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
            worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
            template15.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template14 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongmen"))) != null) {
            BlockPos spawnTo2 = new BlockPos(x, y, z - 19);
            IBlockState iblockstate2 = worldServer.func_180495_p(spawnTo2);
            worldServer.func_184138_a(spawnTo2, iblockstate2, iblockstate2, 3);
            template14.func_186260_a(worldServer, spawnTo2, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template13 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongjiao"))) != null) {
            BlockPos spawnTo3 = new BlockPos(x, y, z - 20);
            IBlockState iblockstate3 = worldServer.func_180495_p(spawnTo3);
            worldServer.func_184138_a(spawnTo3, iblockstate3, iblockstate3, 3);
            template13.func_186260_a(worldServer, spawnTo3, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.LEFT_RIGHT).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template12 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongmen2"))) != null) {
            BlockPos spawnTo4 = new BlockPos(x + 51, y, z + 27);
            IBlockState iblockstate4 = worldServer.func_180495_p(spawnTo4);
            worldServer.func_184138_a(spawnTo4, iblockstate4, iblockstate4, 3);
            template12.func_186260_a(worldServer, spawnTo4, new PlacementSettings().func_186220_a(Rotation.CLOCKWISE_180).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template11 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongjiao"))) != null) {
            BlockPos spawnTo5 = new BlockPos(x + 74, y, z);
            IBlockState iblockstate5 = worldServer.func_180495_p(spawnTo5);
            worldServer.func_184138_a(spawnTo5, iblockstate5, iblockstate5, 3);
            template11.func_186260_a(worldServer, spawnTo5, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.FRONT_BACK).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template10 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongmen"))) != null) {
            BlockPos spawnTo6 = new BlockPos(x + 74, y, z - 19);
            IBlockState iblockstate6 = worldServer.func_180495_p(spawnTo6);
            worldServer.func_184138_a(spawnTo6, iblockstate6, iblockstate6, 3);
            template10.func_186260_a(worldServer, spawnTo6, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.FRONT_BACK).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template9 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongjiao"))) != null) {
            BlockPos spawnTo7 = new BlockPos(x + 74, y, z - 20);
            IBlockState iblockstate7 = worldServer.func_180495_p(spawnTo7);
            worldServer.func_184138_a(spawnTo7, iblockstate7, iblockstate7, 3);
            template9.func_186260_a(worldServer, spawnTo7, new PlacementSettings().func_186220_a(Rotation.CLOCKWISE_180).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template8 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongmen2"))) != null) {
            BlockPos spawnTo8 = new BlockPos(x + 23, y, z - 47);
            IBlockState iblockstate8 = worldServer.func_180495_p(spawnTo8);
            worldServer.func_184138_a(spawnTo8, iblockstate8, iblockstate8, 3);
            template8.func_186260_a(worldServer, spawnTo8, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
            worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDiGongPuta.1
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
                    return new BlockPos(x + 33, y, z - 10);
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 33, y, z - 10);
                }
            }, "fill ~-30 ~ ~33 ~30 ~ ~-33 minecraft:stone 6");
        }
        if (!((World) worldServer).field_72995_K && (template7 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongzhongxin"))) != null) {
            BlockPos spawnTo9 = new BlockPos(x + 27, y + 1, z - 24);
            IBlockState iblockstate9 = worldServer.func_180495_p(spawnTo9);
            worldServer.func_184138_a(spawnTo9, iblockstate9, iblockstate9, 3);
            template7.func_186260_a(worldServer, spawnTo9, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template6 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongting"))) != null) {
            BlockPos spawnTo10 = new BlockPos(x + 16, y + 1, z - 30);
            IBlockState iblockstate10 = worldServer.func_180495_p(spawnTo10);
            worldServer.func_184138_a(spawnTo10, iblockstate10, iblockstate10, 3);
            template6.func_186260_a(worldServer, spawnTo10, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template5 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongting"))) != null) {
            BlockPos spawnTo11 = new BlockPos(x + 26, y + 1, z + 10);
            IBlockState iblockstate11 = worldServer.func_180495_p(spawnTo11);
            worldServer.func_184138_a(spawnTo11, iblockstate11, iblockstate11, 3);
            template5.func_186260_a(worldServer, spawnTo11, new PlacementSettings().func_186220_a(Rotation.CLOCKWISE_180).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template4 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongting"))) != null) {
            BlockPos spawnTo12 = new BlockPos(x + 49, y + 1, z - 30);
            IBlockState iblockstate12 = worldServer.func_180495_p(spawnTo12);
            worldServer.func_184138_a(spawnTo12, iblockstate12, iblockstate12, 3);
            template4.func_186260_a(worldServer, spawnTo12, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template3 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digongting"))) != null) {
            BlockPos spawnTo13 = new BlockPos(x + 59, y + 1, z + 10);
            IBlockState iblockstate13 = worldServer.func_180495_p(spawnTo13);
            worldServer.func_184138_a(spawnTo13, iblockstate13, iblockstate13, 3);
            template3.func_186260_a(worldServer, spawnTo13, new PlacementSettings().func_186220_a(Rotation.CLOCKWISE_180).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template2 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "digong1"))) != null) {
            BlockPos spawnTo14 = new BlockPos(x + 24, y + 1, z - 2);
            IBlockState iblockstate14 = worldServer.func_180495_p(spawnTo14);
            worldServer.func_184138_a(spawnTo14, iblockstate14, iblockstate14, 3);
            template2.func_186260_a(worldServer, spawnTo14, new PlacementSettings().func_186220_a(Rotation.CLOCKWISE_180).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YuanchujianzhuMod.MODID, "zhuozi"))) != null) {
            BlockPos spawnTo15 = new BlockPos(x + 52, y + 1, z - 12);
            IBlockState iblockstate15 = worldServer.func_180495_p(spawnTo15);
            worldServer.func_184138_a(spawnTo15, iblockstate15, iblockstate15, 3);
            template.func_186260_a(worldServer, spawnTo15, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
        }
        worldServer.func_180501_a(new BlockPos(x + 33, y + 1, z - 10), BlockBaoXiang04.block.func_176223_P(), 3);
        worldServer.func_180501_a(new BlockPos(x + 33, y + 10, z - 10), BlockDongFuShangHai4.block.func_176223_P(), 3);
        if (worldServer.func_175659_aa() != EnumDifficulty.PEACEFUL) {
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDiGongPuta.2
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
                        return new BlockPos(x + 19, y + 4, z - 27);
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 19, y + 4, z - 27);
                    }
                }, "summon yvanchuyaoshou:he_huan_zong_2 ~ ~ ~");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDiGongPuta.3
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
                        return new BlockPos(x + 56, y + 4, z + 13);
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 56, y + 4, z + 13);
                    }
                }, "summon yvanchuyaoshou:he_huan_zong_2 ~ ~ ~");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDiGongPuta.4
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
                        return new BlockPos(x + 33, y + 3, z - 10);
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 33, y + 3, z - 10);
                    }
                }, "summon yvanchuyaoshou:he_huan_zong_3 ~ ~ ~");
            }
        }
    }
}
