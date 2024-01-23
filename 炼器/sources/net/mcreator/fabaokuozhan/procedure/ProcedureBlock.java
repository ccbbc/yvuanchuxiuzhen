package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCailiao94;
import net.mcreator.fabaokuozhan.item.ItemCailiao95;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBlock.class */
public class ProcedureBlock extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBlock(ElementsFabaokuozhanMod instance) {
        super(instance, 195);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if ((world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(0).func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(1).func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(3).func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(5).func_177230_c()) && Math.random() < 0.05d) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao94.block, 1));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
        } else if ((world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(0).func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(1).func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(3).func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150348_b.func_176203_a(5).func_177230_c()) && Math.random() < 0.006d && !world.field_72995_K) {
            EntityItem entityToSpawn2 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao95.block, 1));
            entityToSpawn2.func_174867_a(10);
            world.func_72838_d(entityToSpawn2);
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

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
