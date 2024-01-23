package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockHongSongShuYe2;
import net.mcreator.yvanchuliandan.block.BlockHongSongShuYe3;
import net.mcreator.yvanchuliandan.item.ItemHongSongShuMiao;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureShuMiaoDiaoLuo.class */
public class ProcedureShuMiaoDiaoLuo extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureShuMiaoDiaoLuo(ElementsYvanchuliandanMod instance) {
        super(instance, 766);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if ((world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHongSongShuYe2.block.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockHongSongShuYe3.block.func_176223_P().func_177230_c()) && Math.random() <= 0.05d && !world.field_72995_K) {
            EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemHongSongShuMiao.block, 1));
            entityToSpawn.func_174867_a(10);
            world.func_72838_d(entityToSpawn);
        }
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("xpAmount", Integer.valueOf(event.getExpToDrop()));
        dependencies.put("x", Integer.valueOf(event.getPos().func_177958_n()));
        dependencies.put("y", Integer.valueOf(event.getPos().func_177956_o()));
        dependencies.put("z", Integer.valueOf(event.getPos().func_177952_p()));
        dependencies.put("px", Integer.valueOf((int) ((Entity) player).field_70165_t));
        dependencies.put("py", Integer.valueOf((int) ((Entity) player).field_70163_u));
        dependencies.put("pz", Integer.valueOf((int) ((Entity) player).field_70161_v));
        dependencies.put("world", event.getWorld());
        dependencies.put("entity", player);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
