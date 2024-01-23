package net.mcreator.infinite_storage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/NbtKeep.class */
public class NbtKeep extends ElementsInfiniteStorageMod.ModElement {
    private Map<UUID, NBTTagCompound> playerNbtMap;

    public NbtKeep(ElementsInfiniteStorageMod instance) {
        super(instance, 17);
        this.playerNbtMap = new HashMap();
    }

    @Override // net.mcreator.infinite_storage.ElementsInfiniteStorageMod.ModElement
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event) {
        if (event.getOriginal().getEntityData().func_74767_n("NbtClear")) {
            return;
        }
        UUID playerId = event.getEntityPlayer().func_110124_au();
        NBTTagCompound originalNbt = event.getOriginal().getEntityData();
        NBTTagCompound nbt = new NBTTagCompound();
        boolean infiniteBagOn = originalNbt.func_74767_n("InfiniteBagOn");
        double infiniteBagPageAdd = originalNbt.func_74769_h("InfiniteBagPageAdd");
        double infiniteBagPage = originalNbt.func_74769_h("InfiniteBagPage");
        double infiniteBagLevel = originalNbt.func_74769_h("InfiniteBagLevel");
        nbt.func_74757_a("InfiniteBagOn", infiniteBagOn);
        nbt.func_74780_a("InfiniteBagPageAdd", infiniteBagPageAdd);
        nbt.func_74780_a("InfiniteBagPage", infiniteBagPage);
        nbt.func_74780_a("InfiniteBagLevel", infiniteBagLevel);
        for (int index0 = 0; index0 <= ((int) infiniteBagPageAdd); index0++) {
            String saveItemStack = originalNbt.func_74779_i("SaveItemStack" + index0);
            String saveItemStackNum = originalNbt.func_74779_i("SaveItemStackNum" + index0);
            String saveItemStackMeta = originalNbt.func_74779_i("SaveItemStackMeta" + index0);
            nbt.func_74778_a("SaveItemStack" + index0, saveItemStack);
            nbt.func_74778_a("SaveItemStackNum" + index0, saveItemStackNum);
            nbt.func_74778_a("SaveItemStackMeta" + index0, saveItemStackMeta);
        }
        this.playerNbtMap.put(playerId, nbt);
    }

    @SubscribeEvent
    public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        UUID playerId = event.player.func_110124_au();
        NBTTagCompound nbt = this.playerNbtMap.get(playerId);
        if (nbt != null) {
            event.player.getEntityData().func_74757_a("InfiniteBagOn", nbt.func_74767_n("InfiniteBagOn"));
            event.player.getEntityData().func_74780_a("InfiniteBagPageAdd", nbt.func_74769_h("InfiniteBagPageAdd"));
            event.player.getEntityData().func_74780_a("InfiniteBagPage", nbt.func_74769_h("InfiniteBagPage"));
            event.player.getEntityData().func_74780_a("InfiniteBagLevel", nbt.func_74769_h("InfiniteBagLevel"));
            double infiniteBagPageAdd = event.player.getEntityData().func_74769_h("InfiniteBagPageAdd");
            for (int index0 = 0; index0 <= ((int) infiniteBagPageAdd); index0++) {
                event.player.getEntityData().func_74778_a("SaveItemStack" + index0, nbt.func_74779_i("SaveItemStack" + index0));
                event.player.getEntityData().func_74778_a("SaveItemStackNum" + index0, nbt.func_74779_i("SaveItemStackNum" + index0));
                event.player.getEntityData().func_74778_a("SaveItemStackMeta" + index0, nbt.func_74779_i("SaveItemStackMeta" + index0));
            }
            this.playerNbtMap.remove(playerId);
        }
    }
}
