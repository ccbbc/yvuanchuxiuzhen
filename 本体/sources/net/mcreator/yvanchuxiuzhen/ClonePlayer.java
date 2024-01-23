package net.mcreator.yvanchuxiuzhen;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/ClonePlayer.class */
public class ClonePlayer extends ElementsYvanchuxiuzhenMod.ModElement {
    private static Map<UUID, NBTTagCompound> playerNbtMap = new HashMap();

    public ClonePlayer(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 577);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event) {
        if (event.getOriginal().getEntityData().func_74767_n("DataReset")) {
            return;
        }
        UUID playerId = event.getEntityPlayer().func_110124_au();
        NBTTagCompound originalNbt = event.getOriginal().getEntityData();
        NBTTagCompound nbt = originalNbt.func_74737_b();
        playerNbtMap.put(playerId, nbt);
    }

    @SubscribeEvent
    public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        UUID playerId = event.player.func_110124_au();
        NBTTagCompound nbt = playerNbtMap.get(playerId);
        if (nbt != null) {
            event.player.getEntityData().func_179237_a(nbt);
            playerNbtMap.remove(playerId);
        }
    }
}
