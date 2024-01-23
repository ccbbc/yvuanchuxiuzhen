package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan01;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan02;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan03;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan04;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan05;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan06;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan07;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan08;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan09;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan11;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan12;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan13;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan14;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan15;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan16;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan17;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan18;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan19;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedurePickUp.class */
public class ProcedurePickUp extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePickUp(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 104);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan01.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 1.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan02.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 2.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan03.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 3.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan04.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 4.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan04.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 4.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan05.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 5.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan06.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 6.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan07.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 7.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan08.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 8.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan09.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 9.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan11.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 11.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan12.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 12.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan13.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 13.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan14.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 14.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan15.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 15.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan16.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 16.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan17.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 17.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan18.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 18.0d);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan19.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huoyan", 19.0d);
        }
    }

    @SubscribeEvent
    public void onGemDropped(ItemTossEvent event) {
        EntityPlayer entity = event.getPlayer();
        int i = (int) entity.field_70165_t;
        int j = (int) entity.field_70163_u;
        int k = (int) entity.field_70161_v;
        Object world = entity.field_70170_p;
        Object itemstack = event.getEntityItem().func_92059_d();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("itemstack", itemstack);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
