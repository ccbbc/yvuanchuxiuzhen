package net.mcreator.wupinmiaosu;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import net.mcreator.wupinmiaosu.WupinmiaosuModVariables;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui1;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui10;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui11;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui12;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui13;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui14;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui15;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui16;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui17;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui18;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui19;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui2;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui20;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui21;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui22;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui23;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui24;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui25;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui26;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui27;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui28;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui29;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui3;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui30;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui31;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui32;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui33;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui34;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui35;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui4;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui5;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui6;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui7;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui8;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoGui9;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoQiYinXiao1;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoQiYinXiao2;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoQiYinXiao3;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoRanshanjian;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoShenghuangqiang;
import net.mcreator.wupinmiaosu.gui.GuiFaBaoWuxingjian;
import net.mcreator.wupinmiaosu.gui.GuiGongFa10GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa11GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa12GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa13GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa14GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa15GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa16GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa17GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa18GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa19GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa1GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa1GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa20GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa21GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa21GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa22GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa23GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa23GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa24GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa24GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa25GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa26GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa27GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa28GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa28GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa29GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa29GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa2GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa2GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa30GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa30GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa31GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa31GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa32GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa33GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa3GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa3GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa4GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa4GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa5GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa5GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa6GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa6GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa7GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa8GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFa8GUI2;
import net.mcreator.wupinmiaosu.gui.GuiGongFa9GUI;
import net.mcreator.wupinmiaosu.gui.GuiGongFaGUI2403;
import net.mcreator.wupinmiaosu.gui.GuiGongFaWuJi;
import net.mcreator.wupinmiaosu.gui.GuiGui1;
import net.mcreator.wupinmiaosu.gui.GuiPoZhenzhui;
import net.mcreator.wupinmiaosu.gui.GuiQinZuFengYuJian1;
import net.mcreator.wupinmiaosu.gui.GuiQinZuFengYuJian2;
import net.mcreator.wupinmiaosu.gui.GuiQinZuFengYuJian3;
import net.mcreator.wupinmiaosu.gui.GuiQingzhufengyunjian;
import net.mcreator.wupinmiaosu.gui.GuiQiyinxiao;
import net.mcreator.wupinmiaosu.gui.GuiQuLeiDianFu;
import net.mcreator.wupinmiaosu.gui.GuiRanShanJian1;
import net.mcreator.wupinmiaosu.gui.GuiRanShanJian2;
import net.mcreator.wupinmiaosu.gui.GuiShengHuangQiang1;
import net.mcreator.wupinmiaosu.gui.GuiShengHuangQiang2;
import net.mcreator.wupinmiaosu.gui.GuiWuXingJian1;
import net.mcreator.wupinmiaosu.gui.GuiWuXingJian2;
import net.mcreator.wupinmiaosu.gui.GuiXiaoLvPing;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan1;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan2;
import net.mcreator.wupinmiaosu.gui.GuiZhuQueHuan3;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;

/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/ElementsWupinmiaosuMod.class */
public class ElementsWupinmiaosuMod implements IFuelHandler, IWorldGenerator {
    public static Map<ResourceLocation, SoundEvent> sounds = new HashMap();
    public final List<ModElement> elements = new ArrayList();
    public final List<Supplier<Block>> blocks = new ArrayList();
    public final List<Supplier<Item>> items = new ArrayList();
    public final List<Supplier<Biome>> biomes = new ArrayList();
    public final List<Supplier<EntityEntry>> entities = new ArrayList();
    public final List<Supplier<Potion>> potions = new ArrayList();
    private int messageID = 0;

    public void preInit(FMLPreInitializationEvent event) {
        try {
            for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
                Class<?> clazz = Class.forName(asmData.getClassName());
                if (clazz.getSuperclass() == ModElement.class) {
                    this.elements.add((ModElement) clazz.getConstructor(getClass()).newInstance(this));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(this.elements);
        this.elements.forEach((v0) -> {
            v0.initElements();
        });
        addNetworkMessage(WupinmiaosuModVariables.WorldSavedDataSyncMessageHandler.class, WupinmiaosuModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
    }

    public void registerSounds(RegistryEvent.Register<SoundEvent> event) {
        for (Map.Entry<ResourceLocation, SoundEvent> sound : sounds.entrySet()) {
            event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
        }
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
        this.elements.forEach(element -> {
            element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.field_73011_w.getDimension(), cg, cp);
        });
    }

    public int getBurnTime(ItemStack fuel) {
        for (ModElement element : this.elements) {
            int ret = element.addFuel(fuel);
            if (ret != 0) {
                return ret;
            }
        }
        return 0;
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.player.field_70170_p.field_72995_K) {
            WorldSavedData mapdata = WupinmiaosuModVariables.MapVariables.get(event.player.field_70170_p);
            WorldSavedData worlddata = WupinmiaosuModVariables.WorldVariables.get(event.player.field_70170_p);
            if (mapdata != null) {
                WupinmiaosuMod.PACKET_HANDLER.sendTo(new WupinmiaosuModVariables.WorldSavedDataSyncMessage(0, mapdata), event.player);
            }
            if (worlddata != null) {
                WupinmiaosuMod.PACKET_HANDLER.sendTo(new WupinmiaosuModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        WorldSavedData worlddata;
        if (!event.player.field_70170_p.field_72995_K && (worlddata = WupinmiaosuModVariables.WorldVariables.get(event.player.field_70170_p)) != null) {
            WupinmiaosuMod.PACKET_HANDLER.sendTo(new WupinmiaosuModVariables.WorldSavedDataSyncMessage(1, worlddata), event.player);
        }
    }

    public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass, Side... sides) {
        for (Side side : sides) {
            WupinmiaosuMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side);
        }
        this.messageID++;
    }

    /* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/ElementsWupinmiaosuMod$GuiHandler.class */
    public static class GuiHandler implements IGuiHandler {
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiGongFa7GUI.GUIID) {
                return new GuiGongFa7GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa8GUI.GUIID) {
                return new GuiGongFa8GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa9GUI.GUIID) {
                return new GuiGongFa9GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa10GUI.GUIID) {
                return new GuiGongFa10GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa11GUI.GUIID) {
                return new GuiGongFa11GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa12GUI.GUIID) {
                return new GuiGongFa12GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa13GUI.GUIID) {
                return new GuiGongFa13GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa14GUI.GUIID) {
                return new GuiGongFa14GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa15GUI.GUIID) {
                return new GuiGongFa15GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa16GUI.GUIID) {
                return new GuiGongFa16GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa17GUI.GUIID) {
                return new GuiGongFa17GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa18GUI.GUIID) {
                return new GuiGongFa18GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa19GUI.GUIID) {
                return new GuiGongFa19GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa20GUI.GUIID) {
                return new GuiGongFa20GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa21GUI.GUIID) {
                return new GuiGongFa21GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa22GUI.GUIID) {
                return new GuiGongFa22GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa23GUI.GUIID) {
                return new GuiGongFa23GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa24GUI.GUIID) {
                return new GuiGongFa24GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa25GUI.GUIID) {
                return new GuiGongFa25GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa26GUI.GUIID) {
                return new GuiGongFa26GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa27GUI.GUIID) {
                return new GuiGongFa27GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa28GUI.GUIID) {
                return new GuiGongFa28GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa29GUI.GUIID) {
                return new GuiGongFa29GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa30GUI.GUIID) {
                return new GuiGongFa30GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoShenghuangqiang.GUIID) {
                return new GuiFaBaoShenghuangqiang.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoWuxingjian.GUIID) {
                return new GuiFaBaoWuxingjian.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoRanshanjian.GUIID) {
                return new GuiFaBaoRanshanjian.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGui1.GUIID) {
                return new GuiGui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFaWuJi.GUIID) {
                return new GuiGongFaWuJi.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiXiaoLvPing.GUIID) {
                return new GuiXiaoLvPing.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiPoZhenzhui.GUIID) {
                return new GuiPoZhenzhui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQuLeiDianFu.GUIID) {
                return new GuiQuLeiDianFu.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQiyinxiao.GUIID) {
                return new GuiQiyinxiao.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan.GUIID) {
                return new GuiZhuQueHuan.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQingzhufengyunjian.GUIID) {
                return new GuiQingzhufengyunjian.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoQiYinXiao1.GUIID) {
                return new GuiFaBaoQiYinXiao1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoQiYinXiao2.GUIID) {
                return new GuiFaBaoQiYinXiao2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoQiYinXiao3.GUIID) {
                return new GuiFaBaoQiYinXiao3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQinZuFengYuJian1.GUIID) {
                return new GuiQinZuFengYuJian1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQinZuFengYuJian2.GUIID) {
                return new GuiQinZuFengYuJian2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiQinZuFengYuJian3.GUIID) {
                return new GuiQinZuFengYuJian3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiRanShanJian1.GUIID) {
                return new GuiRanShanJian1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiRanShanJian2.GUIID) {
                return new GuiRanShanJian2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShengHuangQiang1.GUIID) {
                return new GuiShengHuangQiang1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiShengHuangQiang2.GUIID) {
                return new GuiShengHuangQiang2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiWuXingJian1.GUIID) {
                return new GuiWuXingJian1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiWuXingJian2.GUIID) {
                return new GuiWuXingJian2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan1.GUIID) {
                return new GuiZhuQueHuan1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan2.GUIID) {
                return new GuiZhuQueHuan2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan3.GUIID) {
                return new GuiZhuQueHuan3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa32GUI.GUIID) {
                return new GuiGongFa32GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui.GUIID) {
                return new GuiFaBaoGui.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa33GUI.GUIID) {
                return new GuiGongFa33GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui1.GUIID) {
                return new GuiFaBaoGui1.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui2.GUIID) {
                return new GuiFaBaoGui2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui3.GUIID) {
                return new GuiFaBaoGui3.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui4.GUIID) {
                return new GuiFaBaoGui4.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui5.GUIID) {
                return new GuiFaBaoGui5.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui6.GUIID) {
                return new GuiFaBaoGui6.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui7.GUIID) {
                return new GuiFaBaoGui7.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui8.GUIID) {
                return new GuiFaBaoGui8.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui9.GUIID) {
                return new GuiFaBaoGui9.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui10.GUIID) {
                return new GuiFaBaoGui10.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui11.GUIID) {
                return new GuiFaBaoGui11.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui12.GUIID) {
                return new GuiFaBaoGui12.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui13.GUIID) {
                return new GuiFaBaoGui13.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui14.GUIID) {
                return new GuiFaBaoGui14.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui15.GUIID) {
                return new GuiFaBaoGui15.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui16.GUIID) {
                return new GuiFaBaoGui16.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui17.GUIID) {
                return new GuiFaBaoGui17.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui18.GUIID) {
                return new GuiFaBaoGui18.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui19.GUIID) {
                return new GuiFaBaoGui19.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui20.GUIID) {
                return new GuiFaBaoGui20.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui21.GUIID) {
                return new GuiFaBaoGui21.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui22.GUIID) {
                return new GuiFaBaoGui22.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui23.GUIID) {
                return new GuiFaBaoGui23.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui24.GUIID) {
                return new GuiFaBaoGui24.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui25.GUIID) {
                return new GuiFaBaoGui25.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui26.GUIID) {
                return new GuiFaBaoGui26.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui27.GUIID) {
                return new GuiFaBaoGui27.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui28.GUIID) {
                return new GuiFaBaoGui28.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui29.GUIID) {
                return new GuiFaBaoGui29.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui30.GUIID) {
                return new GuiFaBaoGui30.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui31.GUIID) {
                return new GuiFaBaoGui31.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui32.GUIID) {
                return new GuiFaBaoGui32.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui33.GUIID) {
                return new GuiFaBaoGui33.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui34.GUIID) {
                return new GuiFaBaoGui34.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui35.GUIID) {
                return new GuiFaBaoGui35.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa31GUI.GUIID) {
                return new GuiGongFa31GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa24GUI2.GUIID) {
                return new GuiGongFa24GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFaGUI2403.GUIID) {
                return new GuiGongFaGUI2403.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa1GUI.GUIID) {
                return new GuiGongFa1GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa2GUI.GUIID) {
                return new GuiGongFa2GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa3GUI.GUIID) {
                return new GuiGongFa3GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa4GUI.GUIID) {
                return new GuiGongFa4GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa5GUI.GUIID) {
                return new GuiGongFa5GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa6GUI.GUIID) {
                return new GuiGongFa6GUI.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa1GUI2.GUIID) {
                return new GuiGongFa1GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa2GUI2.GUIID) {
                return new GuiGongFa2GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa3GUI2.GUIID) {
                return new GuiGongFa3GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa4GUI2.GUIID) {
                return new GuiGongFa4GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa5GUI2.GUIID) {
                return new GuiGongFa5GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa6GUI2.GUIID) {
                return new GuiGongFa6GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa8GUI2.GUIID) {
                return new GuiGongFa8GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa31GUI2.GUIID) {
                return new GuiGongFa31GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa21GUI2.GUIID) {
                return new GuiGongFa21GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa23GUI2.GUIID) {
                return new GuiGongFa23GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa30GUI2.GUIID) {
                return new GuiGongFa30GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa28GUI2.GUIID) {
                return new GuiGongFa28GUI2.GuiContainerMod(world, x, y, z, player);
            }
            if (id == GuiGongFa29GUI2.GUIID) {
                return new GuiGongFa29GUI2.GuiContainerMod(world, x, y, z, player);
            }
            return null;
        }

        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            if (id == GuiGongFa7GUI.GUIID) {
                return new GuiGongFa7GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa8GUI.GUIID) {
                return new GuiGongFa8GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa9GUI.GUIID) {
                return new GuiGongFa9GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa10GUI.GUIID) {
                return new GuiGongFa10GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa11GUI.GUIID) {
                return new GuiGongFa11GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa12GUI.GUIID) {
                return new GuiGongFa12GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa13GUI.GUIID) {
                return new GuiGongFa13GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa14GUI.GUIID) {
                return new GuiGongFa14GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa15GUI.GUIID) {
                return new GuiGongFa15GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa16GUI.GUIID) {
                return new GuiGongFa16GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa17GUI.GUIID) {
                return new GuiGongFa17GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa18GUI.GUIID) {
                return new GuiGongFa18GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa19GUI.GUIID) {
                return new GuiGongFa19GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa20GUI.GUIID) {
                return new GuiGongFa20GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa21GUI.GUIID) {
                return new GuiGongFa21GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa22GUI.GUIID) {
                return new GuiGongFa22GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa23GUI.GUIID) {
                return new GuiGongFa23GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa24GUI.GUIID) {
                return new GuiGongFa24GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa25GUI.GUIID) {
                return new GuiGongFa25GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa26GUI.GUIID) {
                return new GuiGongFa26GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa27GUI.GUIID) {
                return new GuiGongFa27GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa28GUI.GUIID) {
                return new GuiGongFa28GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa29GUI.GUIID) {
                return new GuiGongFa29GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa30GUI.GUIID) {
                return new GuiGongFa30GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoShenghuangqiang.GUIID) {
                return new GuiFaBaoShenghuangqiang.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoWuxingjian.GUIID) {
                return new GuiFaBaoWuxingjian.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoRanshanjian.GUIID) {
                return new GuiFaBaoRanshanjian.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGui1.GUIID) {
                return new GuiGui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFaWuJi.GUIID) {
                return new GuiGongFaWuJi.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiXiaoLvPing.GUIID) {
                return new GuiXiaoLvPing.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiPoZhenzhui.GUIID) {
                return new GuiPoZhenzhui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQuLeiDianFu.GUIID) {
                return new GuiQuLeiDianFu.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQiyinxiao.GUIID) {
                return new GuiQiyinxiao.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan.GUIID) {
                return new GuiZhuQueHuan.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQingzhufengyunjian.GUIID) {
                return new GuiQingzhufengyunjian.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoQiYinXiao1.GUIID) {
                return new GuiFaBaoQiYinXiao1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoQiYinXiao2.GUIID) {
                return new GuiFaBaoQiYinXiao2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoQiYinXiao3.GUIID) {
                return new GuiFaBaoQiYinXiao3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQinZuFengYuJian1.GUIID) {
                return new GuiQinZuFengYuJian1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQinZuFengYuJian2.GUIID) {
                return new GuiQinZuFengYuJian2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiQinZuFengYuJian3.GUIID) {
                return new GuiQinZuFengYuJian3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiRanShanJian1.GUIID) {
                return new GuiRanShanJian1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiRanShanJian2.GUIID) {
                return new GuiRanShanJian2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShengHuangQiang1.GUIID) {
                return new GuiShengHuangQiang1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiShengHuangQiang2.GUIID) {
                return new GuiShengHuangQiang2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiWuXingJian1.GUIID) {
                return new GuiWuXingJian1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiWuXingJian2.GUIID) {
                return new GuiWuXingJian2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan1.GUIID) {
                return new GuiZhuQueHuan1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan2.GUIID) {
                return new GuiZhuQueHuan2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiZhuQueHuan3.GUIID) {
                return new GuiZhuQueHuan3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa32GUI.GUIID) {
                return new GuiGongFa32GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui.GUIID) {
                return new GuiFaBaoGui.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa33GUI.GUIID) {
                return new GuiGongFa33GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui1.GUIID) {
                return new GuiFaBaoGui1.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui2.GUIID) {
                return new GuiFaBaoGui2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui3.GUIID) {
                return new GuiFaBaoGui3.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui4.GUIID) {
                return new GuiFaBaoGui4.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui5.GUIID) {
                return new GuiFaBaoGui5.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui6.GUIID) {
                return new GuiFaBaoGui6.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui7.GUIID) {
                return new GuiFaBaoGui7.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui8.GUIID) {
                return new GuiFaBaoGui8.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui9.GUIID) {
                return new GuiFaBaoGui9.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui10.GUIID) {
                return new GuiFaBaoGui10.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui11.GUIID) {
                return new GuiFaBaoGui11.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui12.GUIID) {
                return new GuiFaBaoGui12.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui13.GUIID) {
                return new GuiFaBaoGui13.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui14.GUIID) {
                return new GuiFaBaoGui14.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui15.GUIID) {
                return new GuiFaBaoGui15.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui16.GUIID) {
                return new GuiFaBaoGui16.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui17.GUIID) {
                return new GuiFaBaoGui17.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui18.GUIID) {
                return new GuiFaBaoGui18.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui19.GUIID) {
                return new GuiFaBaoGui19.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui20.GUIID) {
                return new GuiFaBaoGui20.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui21.GUIID) {
                return new GuiFaBaoGui21.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui22.GUIID) {
                return new GuiFaBaoGui22.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui23.GUIID) {
                return new GuiFaBaoGui23.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui24.GUIID) {
                return new GuiFaBaoGui24.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui25.GUIID) {
                return new GuiFaBaoGui25.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui26.GUIID) {
                return new GuiFaBaoGui26.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui27.GUIID) {
                return new GuiFaBaoGui27.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui28.GUIID) {
                return new GuiFaBaoGui28.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui29.GUIID) {
                return new GuiFaBaoGui29.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui30.GUIID) {
                return new GuiFaBaoGui30.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui31.GUIID) {
                return new GuiFaBaoGui31.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui32.GUIID) {
                return new GuiFaBaoGui32.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui33.GUIID) {
                return new GuiFaBaoGui33.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui34.GUIID) {
                return new GuiFaBaoGui34.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiFaBaoGui35.GUIID) {
                return new GuiFaBaoGui35.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa31GUI.GUIID) {
                return new GuiGongFa31GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa24GUI2.GUIID) {
                return new GuiGongFa24GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFaGUI2403.GUIID) {
                return new GuiGongFaGUI2403.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa1GUI.GUIID) {
                return new GuiGongFa1GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa2GUI.GUIID) {
                return new GuiGongFa2GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa3GUI.GUIID) {
                return new GuiGongFa3GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa4GUI.GUIID) {
                return new GuiGongFa4GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa5GUI.GUIID) {
                return new GuiGongFa5GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa6GUI.GUIID) {
                return new GuiGongFa6GUI.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa1GUI2.GUIID) {
                return new GuiGongFa1GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa2GUI2.GUIID) {
                return new GuiGongFa2GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa3GUI2.GUIID) {
                return new GuiGongFa3GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa4GUI2.GUIID) {
                return new GuiGongFa4GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa5GUI2.GUIID) {
                return new GuiGongFa5GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa6GUI2.GUIID) {
                return new GuiGongFa6GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa8GUI2.GUIID) {
                return new GuiGongFa8GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa31GUI2.GUIID) {
                return new GuiGongFa31GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa21GUI2.GUIID) {
                return new GuiGongFa21GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa23GUI2.GUIID) {
                return new GuiGongFa23GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa30GUI2.GUIID) {
                return new GuiGongFa30GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa28GUI2.GUIID) {
                return new GuiGongFa28GUI2.GuiWindow(world, x, y, z, player);
            }
            if (id == GuiGongFa29GUI2.GUIID) {
                return new GuiGongFa29GUI2.GuiWindow(world, x, y, z, player);
            }
            return null;
        }
    }

    public List<ModElement> getElements() {
        return this.elements;
    }

    public List<Supplier<Block>> getBlocks() {
        return this.blocks;
    }

    public List<Supplier<Item>> getItems() {
        return this.items;
    }

    public List<Supplier<Biome>> getBiomes() {
        return this.biomes;
    }

    public List<Supplier<EntityEntry>> getEntities() {
        return this.entities;
    }

    public List<Supplier<Potion>> getPotions() {
        return this.potions;
    }

    /* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/ElementsWupinmiaosuMod$ModElement.class */
    public static class ModElement implements Comparable<ModElement> {
        protected final ElementsWupinmiaosuMod elements;
        protected final int sortid;

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/ElementsWupinmiaosuMod$ModElement$Tag.class */
        public @interface Tag {
        }

        public ModElement(ElementsWupinmiaosuMod elements, int sortid) {
            this.elements = elements;
            this.sortid = sortid;
        }

        public void initElements() {
        }

        public void init(FMLInitializationEvent event) {
        }

        public void preInit(FMLPreInitializationEvent event) {
        }

        public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        }

        public void serverLoad(FMLServerStartingEvent event) {
        }

        public void registerModels(ModelRegistryEvent event) {
        }

        public int addFuel(ItemStack fuel) {
            return 0;
        }

        @Override // java.lang.Comparable
        public int compareTo(ModElement other) {
            return this.sortid - other.sortid;
        }
    }
}
