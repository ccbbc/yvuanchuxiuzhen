package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.YvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockHongSongShuMiao2;
import net.mcreator.yvanchuliandan.block.BlockLingTaoShuMiao2;
import net.mcreator.yvanchuliandan.block.BlockQingLiShuMiao2;
import net.mcreator.yvanchuliandan.item.ItemJingChunLingYe;
import net.mcreator.yvanchuliandan.item.ItemLingYe;
import net.mcreator.yvanchuliandan.item.ItemXiaoLvPing;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureGuoShuCuiShu.class */
public class ProcedureGuoShuCuiShu extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureGuoShuCuiShu(ElementsYvanchuliandanMod instance) {
        super(instance, 769);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        double d2;
        Template template;
        double d3;
        Template template2;
        double d4;
        Template template3;
        double d5;
        Template template4;
        double d6;
        Template template5;
        double d7;
        Template template6;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
        } else {
            d = -1.0d;
        }
        if (d > 0.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemLingYe.block, 1).func_77973_b()) {
                if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLingTaoShuMiao2.block.func_176223_P().func_177230_c()) {
                    ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p = _stack.func_77978_p();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
                    } else {
                        d7 = -1.0d;
                    }
                    func_77978_p.func_74780_a("TotalTimes", d7 - 1.0d);
                    if (!((World) worldServer).field_72995_K && (template6 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuliandanMod.MODID, "taomu"))) != null) {
                        BlockPos spawnTo = new BlockPos(x - 2, y, z - 2);
                        IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
                        worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                        template6.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                        return;
                    }
                    return;
                }
                return;
            }
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJingChunLingYe.block, 1).func_77973_b()) {
                if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHongSongShuMiao2.block.func_176223_P().func_177230_c()) {
                    ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack2.func_77942_o()) {
                        _stack2.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p2 = _stack2.func_77978_p();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
                    } else {
                        d6 = -1.0d;
                    }
                    func_77978_p2.func_74780_a("TotalTimes", d6 - 1.0d);
                    if (!((World) worldServer).field_72995_K && (template5 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuliandanMod.MODID, "hongsongshu2"))) != null) {
                        BlockPos spawnTo2 = new BlockPos(x - 2, y, z - 2);
                        IBlockState iblockstate2 = worldServer.func_180495_p(spawnTo2);
                        worldServer.func_184138_a(spawnTo2, iblockstate2, iblockstate2, 3);
                        template5.func_186260_a(worldServer, spawnTo2, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                        return;
                    }
                    return;
                } else if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockQingLiShuMiao2.block.func_176223_P().func_177230_c()) {
                    ItemStack _stack3 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack3.func_77942_o()) {
                        _stack3.func_77982_d(new NBTTagCompound());
                    }
                    NBTTagCompound func_77978_p3 = _stack3.func_77978_p();
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
                    } else {
                        d5 = -1.0d;
                    }
                    func_77978_p3.func_74780_a("TotalTimes", d5 - 1.0d);
                    if (!((World) worldServer).field_72995_K && (template4 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuliandanMod.MODID, "qinglishu"))) != null) {
                        BlockPos spawnTo3 = new BlockPos(x - 2, y, z - 2);
                        IBlockState iblockstate3 = worldServer.func_180495_p(spawnTo3);
                        worldServer.func_184138_a(spawnTo3, iblockstate3, iblockstate3, 3);
                        template4.func_186260_a(worldServer, spawnTo3, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemXiaoLvPing.block, 1).func_77973_b()) {
            if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLingTaoShuMiao2.block.func_176223_P().func_177230_c()) {
                ItemStack _stack4 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p4 = _stack4.func_77978_p();
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
                } else {
                    d4 = -1.0d;
                }
                func_77978_p4.func_74780_a("TotalTimes", d4 - 1.0d);
                if (!((World) worldServer).field_72995_K && (template3 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuliandanMod.MODID, "taomu"))) != null) {
                    BlockPos spawnTo4 = new BlockPos(x - 2, y, z - 2);
                    IBlockState iblockstate4 = worldServer.func_180495_p(spawnTo4);
                    worldServer.func_184138_a(spawnTo4, iblockstate4, iblockstate4, 3);
                    template3.func_186260_a(worldServer, spawnTo4, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                }
            } else if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHongSongShuMiao2.block.func_176223_P().func_177230_c()) {
                ItemStack _stack5 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack5.func_77942_o()) {
                    _stack5.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p5 = _stack5.func_77978_p();
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
                } else {
                    d3 = -1.0d;
                }
                func_77978_p5.func_74780_a("TotalTimes", d3 - 1.0d);
                if (!((World) worldServer).field_72995_K && (template2 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuliandanMod.MODID, "hongsongshu"))) != null) {
                    BlockPos spawnTo5 = new BlockPos(x - 2, y, z - 2);
                    IBlockState iblockstate5 = worldServer.func_180495_p(spawnTo5);
                    worldServer.func_184138_a(spawnTo5, iblockstate5, iblockstate5, 3);
                    template2.func_186260_a(worldServer, spawnTo5, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                }
            } else if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockQingLiShuMiao2.block.func_176223_P().func_177230_c()) {
                ItemStack _stack6 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack6.func_77942_o()) {
                    _stack6.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p6 = _stack6.func_77978_p();
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
                } else {
                    d2 = -1.0d;
                }
                func_77978_p6.func_74780_a("TotalTimes", d2 - 1.0d);
                if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuliandanMod.MODID, "qinglishu"))) != null) {
                    BlockPos spawnTo6 = new BlockPos(x - 2, y, z - 2);
                    IBlockState iblockstate6 = worldServer.func_180495_p(spawnTo6);
                    worldServer.func_184138_a(spawnTo6, iblockstate6, iblockstate6, 3);
                    template.func_186260_a(worldServer, spawnTo6, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                }
            }
        }
    }
}
