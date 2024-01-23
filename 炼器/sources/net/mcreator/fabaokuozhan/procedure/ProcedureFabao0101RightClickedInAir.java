package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockFabao0102;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao0101RightClickedInAir.class */
public class ProcedureFabao0101RightClickedInAir extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao0101RightClickedInAir(ElementsFabaokuozhanMod instance) {
        super(instance, 115);
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
        final WorldServer worldServer = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("Power") >= 305.0d) {
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0101RightClickedInAir.1
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=9] ~ ~ ~ shanghaiy " + new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h("MagicAttack") * 0.7d) + 97.0d + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d)) + " " + entityPlayer.func_145748_c_().func_150260_c() + "\",CustomNameVisible:0b}");
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0101RightClickedInAir.2
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=9] ~ ~ ~ ufangxiang\",CustomNameVisible:0b}");
            }
            worldServer.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("fabaokuozhan:fabao0102")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.CLOUD, x + 0.5d, y, z + 0.5d, 40, 4.0d, 3.0d, 4.0d, 1.0d, new int[0]);
            }
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 305.0d);
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 30);
            }
            if (itemstack.func_96631_a(30, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
            worldServer.func_180501_a(new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d)), BlockFabao0102.block.func_176223_P(), 3);
        } else if (entityPlayer.getEntityData().func_74769_h("Power") < 305.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("灵力不足，无法释放技能“风云巨变”"), false);
        }
    }
}
