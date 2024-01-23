package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockCailiao91;
import net.mcreator.fabaokuozhan.item.ItemCaiitem03;
import net.mcreator.fabaokuozhan.item.ItemCailiao11;
import net.mcreator.fabaokuozhan.item.ItemCailiao12;
import net.mcreator.fabaokuozhan.item.ItemCailiao13;
import net.mcreator.fabaokuozhan.item.ItemCailiao14;
import net.mcreator.fabaokuozhan.item.ItemCailiao15;
import net.mcreator.fabaokuozhan.item.ItemCailiao16;
import net.mcreator.fabaokuozhan.item.ItemCailiao17;
import net.mcreator.fabaokuozhan.item.ItemCailiao18;
import net.mcreator.fabaokuozhan.item.ItemCailiao19;
import net.mcreator.fabaokuozhan.item.ItemCailiao20;
import net.mcreator.fabaokuozhan.item.ItemCailiao9101;
import net.mcreator.fabaokuozhan.item.ItemCailiao92;
import net.mcreator.fabaokuozhan.item.ItemCailiao93;
import net.mcreator.fabaokuozhan.item.ItemCailiao94;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureDiaoluo01RightClickedInAir.class */
public class ProcedureDiaoluo01RightClickedInAir extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDiaoluo01RightClickedInAir(ElementsFabaokuozhanMod instance) {
        super(instance, 214);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (Math.random() < 0.004d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.1
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchujiguan:caiitem14\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.04d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.2
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuyaoshou:caientity0101\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.01d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.3
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuyaoshou:caientity0201\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.02d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.4
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuyaoshou:caientity0301\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.04d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.5
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuyaoshou:caientity0401\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.02d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.6
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhen:caiitem05\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.06d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.7
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhenfulu:cailiao34\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.08d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.8
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhenfulu:cailiao32\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.01d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.9
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhenfulu:fulu23\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.04d && !world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDiaoluo01RightClickedInAir.10
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
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon minecraft:item ~ ~1 ~ {Item:{id:\"yvanchuxiuzhenfulu:fulu22\",Count:1b,Damage:0s}}");
        }
        if (Math.random() < 0.1d && !world.field_72995_K) {
            EntityItem entityToSpawn = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(BlockCailiao91.block, 1));
            entityToSpawn.func_174867_a(10);
            world.func_72838_d(entityToSpawn);
        }
        if (Math.random() < 0.02d && !world.field_72995_K) {
            EntityItem entityToSpawn2 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCaiitem03.block, 1));
            entityToSpawn2.func_174867_a(10);
            world.func_72838_d(entityToSpawn2);
        }
        if (Math.random() < 0.12d && !world.field_72995_K) {
            EntityItem entityToSpawn3 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao94.block, 1));
            entityToSpawn3.func_174867_a(10);
            world.func_72838_d(entityToSpawn3);
        }
        if (Math.random() < 0.08d && !world.field_72995_K) {
            EntityItem entityToSpawn4 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao93.block, 1));
            entityToSpawn4.func_174867_a(10);
            world.func_72838_d(entityToSpawn4);
        }
        if (Math.random() < 0.1d && !world.field_72995_K) {
            EntityItem entityToSpawn5 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao92.block, 1));
            entityToSpawn5.func_174867_a(10);
            world.func_72838_d(entityToSpawn5);
        }
        if (Math.random() < 0.12d && !world.field_72995_K) {
            EntityItem entityToSpawn6 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao9101.block, 1));
            entityToSpawn6.func_174867_a(10);
            world.func_72838_d(entityToSpawn6);
        }
        if (Math.random() < 0.02d && !world.field_72995_K) {
            EntityItem entityToSpawn7 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao20.block, 1));
            entityToSpawn7.func_174867_a(10);
            world.func_72838_d(entityToSpawn7);
        }
        if (Math.random() < 0.04d && !world.field_72995_K) {
            EntityItem entityToSpawn8 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao19.block, 1));
            entityToSpawn8.func_174867_a(10);
            world.func_72838_d(entityToSpawn8);
        }
        if (Math.random() < 0.04d && !world.field_72995_K) {
            EntityItem entityToSpawn9 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao18.block, 1));
            entityToSpawn9.func_174867_a(10);
            world.func_72838_d(entityToSpawn9);
        }
        if (Math.random() < 0.06d && !world.field_72995_K) {
            EntityItem entityToSpawn10 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao17.block, 1));
            entityToSpawn10.func_174867_a(10);
            world.func_72838_d(entityToSpawn10);
        }
        if (Math.random() < 0.06d && !world.field_72995_K) {
            EntityItem entityToSpawn11 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao16.block, 1));
            entityToSpawn11.func_174867_a(10);
            world.func_72838_d(entityToSpawn11);
        }
        if (Math.random() < 0.08d && !world.field_72995_K) {
            EntityItem entityToSpawn12 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao15.block, 1));
            entityToSpawn12.func_174867_a(10);
            world.func_72838_d(entityToSpawn12);
        }
        if (Math.random() < 0.08d && !world.field_72995_K) {
            EntityItem entityToSpawn13 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao14.block, 1));
            entityToSpawn13.func_174867_a(10);
            world.func_72838_d(entityToSpawn13);
        }
        if (Math.random() < 0.1d && !world.field_72995_K) {
            EntityItem entityToSpawn14 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao13.block, 1));
            entityToSpawn14.func_174867_a(10);
            world.func_72838_d(entityToSpawn14);
        }
        if (Math.random() < 0.1d && !world.field_72995_K) {
            EntityItem entityToSpawn15 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao12.block, 1));
            entityToSpawn15.func_174867_a(10);
            world.func_72838_d(entityToSpawn15);
        }
        if (Math.random() < 0.12d && !world.field_72995_K) {
            EntityItem entityToSpawn16 = new EntityItem(world, x + 0.5d, y + 0.5d, z + 0.5d, new ItemStack(ItemCailiao11.block, 1));
            entityToSpawn16.func_174867_a(10);
            world.func_72838_d(entityToSpawn16);
        }
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
        }
    }
}
