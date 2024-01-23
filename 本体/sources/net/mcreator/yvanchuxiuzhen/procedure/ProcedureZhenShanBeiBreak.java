package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.block.BlockZhenShanBei;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhenShanBeiBreak.class */
public class ProcedureZhenShanBeiBreak extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhenShanBeiBreak(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 578);
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBreak$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockZhenShanBei.block.func_176223_P().func_177230_c() && !new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBreak.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJob6").equals(entity.func_145748_c_().func_150260_c()) && dependencies.get("event") != null) {
            Object _obj = dependencies.get("event");
            if (_obj instanceof Event) {
                Event _evt = (Event) _obj;
                if (_evt.isCancelable()) {
                    _evt.setCanceled(true);
                }
            }
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

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
