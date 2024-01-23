package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityLinHaiShouHuang04;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureBoss01EntityWalksOnTheBlock.class */
public class ProcedureBoss01EntityWalksOnTheBlock extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBoss01EntityWalksOnTheBlock(ElementsYvanchuyaoshouMod instance) {
        super(instance, 108);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityLinHaiShouHuang04.EntityCustom entityCustom;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer.func_175659_aa() != EnumDifficulty.PEACEFUL) {
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.CLOUD, x + 0.5d, y + 0.5d, z + 0.5d, 100, 3.0d, 3.0d, 3.0d, 0.1d, new int[0]);
            }
            worldServer.func_184148_a((EntityPlayer) null, x + 0.5d, y, z + 0.5d, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuyaoshou:caientity09")), SoundCategory.NEUTRAL, 2.0f, 1.0f);
            if (!((World) worldServer).field_72995_K && (entityCustom = new EntityLinHaiShouHuang04.EntityCustom(worldServer)) != null) {
                entityCustom.func_70012_b(x + 0.5d, y + 2, z + 0.5d, ((World) worldServer).field_73012_v.nextFloat() * 360.0f, 0.0f);
                worldServer.func_72838_d(entityCustom);
            }
            worldServer.func_180501_a(new BlockPos(x, y, z), Blocks.field_150348_b.func_176203_a(2), 3);
        }
    }
}
