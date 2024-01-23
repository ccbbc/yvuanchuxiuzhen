package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureCaiitem17RightClickedOnBlock.class */
public class ProcedureCaiitem17RightClickedOnBlock extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureCaiitem17RightClickedOnBlock(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 242);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("direction") == null || dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EnumFacing direction = (EnumFacing) dependencies.get("direction");
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (direction == EnumFacing.UP) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureCaiitem17RightClickedOnBlock.1
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
                }, "setblock " + x + " " + (y + 1) + " " + z + " yvanchuxiuzhen:huoyan0102 0 replace");
            }
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
        }
    }
}
