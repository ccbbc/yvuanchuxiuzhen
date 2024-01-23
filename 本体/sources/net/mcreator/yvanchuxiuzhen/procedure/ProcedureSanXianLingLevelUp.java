package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi03;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi05;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSanXianLingLevelUp.class */
public class ProcedureSanXianLingLevelUp extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXianLingLevelUp(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 505);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        double d2;
        double d3;
        double d4;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        double ItemNum2 = 0.0d;
        double ItemNum1 = 0.0d;
        if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 1.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            InventoryPlayer inventoryPlayer = entityPlayer.field_71071_by;
            for (int slotIndex = 0; slotIndex < inventoryPlayer.func_70302_i_(); slotIndex++) {
                try {
                    ItemStack itemstackiterator = inventoryPlayer.func_70301_a(slotIndex);
                    if (!itemstackiterator.func_190926_b()) {
                        if (itemstackiterator.func_77973_b() == new ItemStack(ItemLingshi03.block, 1).func_77973_b()) {
                            ItemNum1 += itemstackiterator.func_190916_E();
                        }
                        if (itemstackiterator.func_77973_b() == new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0202"), 1).func_77973_b()) {
                            ItemNum2 += itemstackiterator.func_190916_E();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (ItemNum1 >= 32.0d && ItemNum2 >= 64.0d) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(ItemLingshi03.block, 1).func_77973_b(), -1, 32, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0202"), 1).func_77973_b(), -1, 64, (NBTTagCompound) null);
                }
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                ItemStack _stack = entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p = _stack.func_77978_p();
                if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d4 = (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SanXianLingLevel");
                } else {
                    d4 = -1.0d;
                }
                func_77978_p.func_74780_a("SanXianLingLevel", d4 + 1.0d);
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianLingLevelUp.1
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "give " + entityPlayer.func_189512_bd() + " yvanchuxiuzhen:san_xian_voucher 1 0 {\"级别\":2.0d}");
                    return;
                }
                return;
            }
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l材料不足");
        } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 2.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
            InventoryPlayer inventoryPlayer2 = entityPlayer.field_71071_by;
            for (int slotIndex2 = 0; slotIndex2 < inventoryPlayer2.func_70302_i_(); slotIndex2++) {
                try {
                    ItemStack itemstackiterator2 = inventoryPlayer2.func_70301_a(slotIndex2);
                    if (!itemstackiterator2.func_190926_b()) {
                        if (itemstackiterator2.func_77973_b() == new ItemStack(ItemLingshi03.block, 1).func_77973_b()) {
                            ItemNum1 += itemstackiterator2.func_190916_E();
                        }
                        if (itemstackiterator2.func_77973_b() == new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0203"), 1).func_77973_b()) {
                            ItemNum2 += itemstackiterator2.func_190916_E();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (ItemNum1 >= 64.0d && ItemNum2 >= 64.0d) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(ItemLingshi03.block, 1).func_77973_b(), -1, 64, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0203"), 1).func_77973_b(), -1, 64, (NBTTagCompound) null);
                }
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                ItemStack _stack2 = entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p2 = _stack2.func_77978_p();
                if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d3 = (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SanXianLingLevel");
                } else {
                    d3 = -1.0d;
                }
                func_77978_p2.func_74780_a("SanXianLingLevel", d3 + 1.0d);
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianLingLevelUp.2
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "give " + entityPlayer.func_189512_bd() + " yvanchuxiuzhen:san_xian_voucher 1 0 {\"级别\":3.0d}");
                    return;
                }
                return;
            }
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l材料不足");
        } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 3.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
            InventoryPlayer inventoryPlayer3 = entityPlayer.field_71071_by;
            for (int slotIndex3 = 0; slotIndex3 < inventoryPlayer3.func_70302_i_(); slotIndex3++) {
                try {
                    ItemStack itemstackiterator3 = inventoryPlayer3.func_70301_a(slotIndex3);
                    if (!itemstackiterator3.func_190926_b()) {
                        if (itemstackiterator3.func_77973_b() == new ItemStack(ItemLingshi05.block, 1).func_77973_b()) {
                            ItemNum1 += itemstackiterator3.func_190916_E();
                        }
                        if (itemstackiterator3.func_77973_b() == new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0204"), 1).func_77973_b()) {
                            ItemNum2 += itemstackiterator3.func_190916_E();
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if (ItemNum1 >= 32.0d && ItemNum2 >= 64.0d) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(ItemLingshi05.block, 1).func_77973_b(), -1, 32, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0204"), 1).func_77973_b(), -1, 64, (NBTTagCompound) null);
                }
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                ItemStack _stack3 = entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p3 = _stack3.func_77978_p();
                if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d2 = (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SanXianLingLevel");
                } else {
                    d2 = -1.0d;
                }
                func_77978_p3.func_74780_a("SanXianLingLevel", d2 + 1.0d);
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianLingLevelUp.3
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "give " + entityPlayer.func_189512_bd() + " yvanchuxiuzhen:san_xian_voucher 1 0 {\"级别\":4.0d}");
                    return;
                }
                return;
            }
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l材料不足");
        } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 4.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
            InventoryPlayer inventoryPlayer4 = entityPlayer.field_71071_by;
            for (int slotIndex4 = 0; slotIndex4 < inventoryPlayer4.func_70302_i_(); slotIndex4++) {
                try {
                    ItemStack itemstackiterator4 = inventoryPlayer4.func_70301_a(slotIndex4);
                    if (!itemstackiterator4.func_190926_b()) {
                        if (itemstackiterator4.func_77973_b() == new ItemStack(ItemLingshi05.block, 1).func_77973_b()) {
                            ItemNum1 += itemstackiterator4.func_190916_E();
                        }
                        if (itemstackiterator4.func_77973_b() == new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0205"), 1).func_77973_b()) {
                            ItemNum2 += itemstackiterator4.func_190916_E();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            if (ItemNum1 >= 64.0d && ItemNum2 >= 64.0d) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(ItemLingshi05.block, 1).func_77973_b(), -1, 64, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuyaoshou:yaodan0205"), 1).func_77973_b(), -1, 64, (NBTTagCompound) null);
                }
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                ItemStack _stack4 = entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p4 = _stack4.func_77978_p();
                if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d = (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("SanXianLingLevel");
                } else {
                    d = -1.0d;
                }
                func_77978_p4.func_74780_a("SanXianLingLevel", d + 1.0d);
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianLingLevelUp.4
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "give " + entityPlayer.func_189512_bd() + " yvanchuxiuzhen:san_xian_voucher 1 0 {\"级别\":5.0d}");
                    return;
                }
                return;
            }
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l材料不足");
        } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 0.0d) {
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l尚未绑定");
        } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 5.0d) {
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l已达上限");
        } else {
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l境界不符");
        }
    }
}
