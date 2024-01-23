package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureNiangJiuPeiFang.class */
public class ProcedureNiangJiuPeiFang extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureNiangJiuPeiFang(ElementsYvanchuliandanMod instance) {
        super(instance, 693);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang$2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang.1
            public ItemStack getItemStack(int sltid) {
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier = entityPlayer.field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                        }
                    }
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(2).func_77973_b() == new ItemStack(Items.field_151068_bn, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureNiangJiuPeiFang.2
                public ItemStack getItemStack(int sltid) {
                    if (entityPlayer instanceof EntityPlayerMP) {
                        Supplier supplier = entityPlayer.field_71070_bA;
                        if (supplier instanceof Supplier) {
                            Object invobj = supplier.get();
                            if (invobj instanceof Map) {
                                return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                            }
                        }
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(3).func_77973_b() != new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                entityPlayer.getEntityData().func_74757_a("酿酒错误", true);
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entityPlayer);
                ProcedureNiangJiuPeiFang1.executeProcedure($_dependencies);
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("entity", entityPlayer);
                ProcedureNiangJiuPeiFang2.executeProcedure($_dependencies2);
                Map<String, Object> $_dependencies3 = new HashMap<>();
                $_dependencies3.put("entity", entityPlayer);
                ProcedureNiangJiuPeiFang3.executeProcedure($_dependencies3);
                Map<String, Object> $_dependencies4 = new HashMap<>();
                $_dependencies4.put("entity", entityPlayer);
                ProcedureNiangJiuPeiFang4.executeProcedure($_dependencies4);
                Map<String, Object> $_dependencies5 = new HashMap<>();
                $_dependencies5.put("entity", entityPlayer);
                ProcedureNiangJiuPeiFang5.executeProcedure($_dependencies5);
                if (entityPlayer.getEntityData().func_74767_n("酿酒错误")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("无法制作,请检查酒方以及材料数量是否正确"), false);
                    }
                    entityPlayer.getEntityData().func_74757_a("酿酒错误", false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("缺少酒方"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("缺少水瓶无法制作"), false);
        }
    }
}
