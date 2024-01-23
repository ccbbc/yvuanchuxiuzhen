package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureFangKuaiHuoQu.class */
public class ProcedureFangKuaiHuoQu extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureFangKuaiHuoQu(ElementsYuanchuzhushouMod instance) {
        super(instance, 50);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureFangKuaiHuoQu$1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureFangKuaiHuoQu$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureFangKuaiHuoQu.1
            public ItemStack getItemStack(int sltid) {
                if (entityLivingBase instanceof EntityPlayerMP) {
                    Supplier supplier = entityLivingBase.field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                        }
                    }
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(0).func_77973_b().getRegistryName().toString().equals("minecraft:stick")) {
            ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
            if (!_stack.func_77942_o()) {
                _stack.func_77982_d(new NBTTagCompound());
            }
            _stack.func_77978_p().func_74778_a("方块名", "air");
            return;
        }
        ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
        if (!_stack2.func_77942_o()) {
            _stack2.func_77982_d(new NBTTagCompound());
        }
        _stack2.func_77978_p().func_74778_a("方块名", new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureFangKuaiHuoQu.2
            public ItemStack getItemStack(int sltid) {
                if (entityLivingBase instanceof EntityPlayerMP) {
                    Supplier supplier = entityLivingBase.field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                        }
                    }
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(0).func_77973_b().getRegistryName().toString());
    }
}
