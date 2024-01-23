package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureFeiXingFaQiMiaoShu.class */
public class ProcedureFeiXingFaQiMiaoShu extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureFeiXingFaQiMiaoShu(ElementsWupinmiaosuMod instance) {
        super(instance, 88);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null || dependencies.get("tooltip") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        dependencies.get("tooltip");
        if (dependencies.get("event") != null) {
            Object _obj = dependencies.get("event");
            if (_obj instanceof Event) {
                ItemTooltipEvent _event = (Event) _obj;
                if (itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:gold_sword") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:wood_sword") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:water_sword") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:fire_sword") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:soil_sword") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:leaf") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:gourd") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:boat") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:blue_point_sword") || itemstack.func_77973_b().getRegistryName().toString().equals("flyinginstrument:shan_he_tu")) {
                    _event.getToolTip().add(1, "未达结丹期的修士可以借由飞行法器飞行的更久");
                    _event.getToolTip().add(2, "右键 消耗3灵力御器飞行");
                    _event.getToolTip().add(3, "御剑飞行时 SHIFT键 降落地面");
                }
            }
        }
    }

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent event) {
        if (event != null && event.getEntityPlayer() != null) {
            EntityPlayer entity = event.getEntityPlayer();
            Object itemStack = event.getItemStack();
            Object tooltip = event.getToolTip();
            Object flag = event.getFlags();
            Object world = entity.field_70170_p;
            double i = entity.field_70165_t;
            double j = entity.field_70163_u;
            double k = entity.field_70161_v;
            Map<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Double.valueOf(i));
            dependencies.put("y", Double.valueOf(j));
            dependencies.put("z", Double.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("itemstack", itemStack);
            dependencies.put("flag", flag);
            dependencies.put("tooltip", tooltip);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
