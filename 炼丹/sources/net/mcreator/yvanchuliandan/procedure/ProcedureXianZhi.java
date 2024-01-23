package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockFangShi2;
import net.mcreator.yvanchuliandan.block.BlockFangShi4;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXianZhi.class */
public class ProcedureXianZhi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXianZhi(ElementsYvanchuliandanMod instance) {
        super(instance, 907);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() != Blocks.field_150486_ae.func_176223_P().func_177230_c() && entityPlayer.getEntityData().func_74769_h("JingJieNum") == 0.0d) {
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangShi2.block.func_176223_P().func_177230_c()) {
                if (dependencies.get("event") != null) {
                    Object _obj = dependencies.get("event");
                    if (_obj instanceof Event) {
                        Event _evt = (Event) _obj;
                        if (_evt.isCancelable()) {
                            _evt.setCanceled(true);
                        }
                    }
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("此物非凡物，阁下拍下也无用途。"), false);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangShi4.block.func_176223_P().func_177230_c()) {
                if (dependencies.get("event") != null) {
                    Object _obj2 = dependencies.get("event");
                    if (_obj2 instanceof Event) {
                        Event _evt2 = (Event) _obj2;
                        if (_evt2.isCancelable()) {
                            _evt2.setCanceled(true);
                        }
                    }
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("此物非凡物，阁下拍下也无用途。"), false);
                }
            }
        }
    }

    @SubscribeEvent
    public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Object entity = event.getEntityPlayer();
        int i = event.getPos().func_177958_n();
        int j = event.getPos().func_177956_o();
        int k = event.getPos().func_177952_p();
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
