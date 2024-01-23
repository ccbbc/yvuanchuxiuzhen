package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureFuWuQiAnNiuPress.class */
public class ProcedureFuWuQiAnNiuPress extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureFuWuQiAnNiuPress(ElementsYvanchuliandanMod instance) {
        super(instance, 943);
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress$1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress$3] */
    /* JADX WARN: Type inference failed for: r3v4, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress$4] */
    /* JADX WARN: Type inference failed for: r4v1, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        entityPlayer.getEntityData().func_74780_a("服务器兑换需求", 0.0d);
        InventoryPlayer inventoryPlayer = entityPlayer.field_71071_by;
        for (int slotIndex = 0; slotIndex < inventoryPlayer.func_70302_i_(); slotIndex++) {
            try {
                ItemStack itemstackiterator = inventoryPlayer.func_70301_a(slotIndex);
                if (!itemstackiterator.func_190926_b() && itemstackiterator.func_77973_b() == new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress.1
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b()) {
                    entityPlayer.getEntityData().func_74780_a("服务器兑换需求", entityPlayer.getEntityData().func_74769_h("服务器兑换需求") + itemstackiterator.func_190916_E());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        entityPlayer.getEntityData().func_74780_a("Position", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress.3
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e2) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress.2
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "玩家UUID").indexOf(entityPlayer.func_189512_bd()) / 38)) + 1);
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("" + entityPlayer.getEntityData().func_74769_h("Position")), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress.4
                String string;
                String[] value;
                String indexvalue;

                /* JADX WARN: Type inference failed for: r1v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress$4$1] */
                {
                    this.string = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFuWuQiAnNiuPress.4.1
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "交易价格");
                    this.value = this.string.split("|");
                    this.indexvalue = this.value[(int) entityPlayer.getEntityData().func_74769_h("Position")];
                }

                String getString() {
                    String s = this.indexvalue;
                    return s;
                }
            }.getString()), false);
        }
    }
}
