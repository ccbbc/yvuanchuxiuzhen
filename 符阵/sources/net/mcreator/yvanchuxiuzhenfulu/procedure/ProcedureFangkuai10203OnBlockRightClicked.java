package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFangkuai10201;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFangkuai10203;
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

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFangkuai10203OnBlockRightClicked.class */
public class ProcedureFangkuai10203OnBlockRightClicked extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFangkuai10203OnBlockRightClicked(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 156);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        double d2;
        Template template;
        Template template2;
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
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:ling_ye") && worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuai10203.block.func_176223_P().func_177230_c()) {
                ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p = _stack.func_77978_p();
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("TotalTimes");
                } else {
                    d2 = -1.0d;
                }
                func_77978_p.func_74780_a("TotalTimes", d2 - 1.0d);
                if (!((World) worldServer).field_72995_K && (template2 = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "cailiao3202"))) != null) {
                    BlockPos spawnTo = new BlockPos(x - 1, y + 6, z - 1);
                    IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
                    worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                    template2.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                }
                if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "cailiao3201"))) != null) {
                    BlockPos spawnTo2 = new BlockPos(x - 2, y + 4, z - 2);
                    IBlockState iblockstate2 = worldServer.func_180495_p(spawnTo2);
                    worldServer.func_184138_a(spawnTo2, iblockstate2, iblockstate2, 3);
                    template.func_186260_a(worldServer, spawnTo2, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                }
                worldServer.func_180501_a(new BlockPos(x, y + 3, z), BlockFangkuai10201.block.func_176223_P(), 3);
                worldServer.func_180501_a(new BlockPos(x, y + 2, z), BlockFangkuai10201.block.func_176223_P(), 3);
                worldServer.func_180501_a(new BlockPos(x, y + 1, z), BlockFangkuai10201.block.func_176223_P(), 3);
                worldServer.func_180501_a(new BlockPos(x, y, z), BlockFangkuai10201.block.func_176223_P(), 3);
            }
        }
    }
}
