package edebe.flyinginstrument.loader;

import edebe.flyinginstrument.item.ItemFlySword;
import edebe.flyinginstrument.item.ItemFlyingInstrument;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/loader/ItemLoader.class */
public class ItemLoader {
    public static final List<Item> ITEMS = new ArrayList();
    public static Item GOLD_SWORD = new ItemFlySword("gold_sword");
    public static Item WOOD_SWORD = new ItemFlySword("wood_sword");
    public static Item WATER_SWORD = new ItemFlySword("water_sword");
    public static Item FIRE_SWORD = new ItemFlySword("fire_sword");
    public static Item SOIL_SWORD = new ItemFlySword("soil_sword");
    public static Item BLUE_POINT_SWORD = new ItemFlySword("blue_point_sword");
    public static Item LEAF = new ItemFlyingInstrument("leaf");
    public static Item GOURD = new ItemFlyingInstrument("gourd");
    public static Item BOAT = new ItemFlyingInstrument("boat");
    public static Item MOUNTAIN_AND_RIVER_DIAGRAM = new ItemFlyingInstrument("shan_he_tu");

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        ITEMS.add(GOLD_SWORD);
        ITEMS.add(WOOD_SWORD);
        ITEMS.add(WATER_SWORD);
        ITEMS.add(FIRE_SWORD);
        ITEMS.add(SOIL_SWORD);
        ITEMS.add(BLUE_POINT_SWORD);
        ITEMS.add(LEAF);
        ITEMS.add(GOURD);
        ITEMS.add(BOAT);
        ITEMS.add(MOUNTAIN_AND_RIVER_DIAGRAM);
        for (Item item : ITEMS) {
            event.getRegistry().register(item);
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onModelreg(ModelRegistryEvent event) {
        for (Item item : ITEMS) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
