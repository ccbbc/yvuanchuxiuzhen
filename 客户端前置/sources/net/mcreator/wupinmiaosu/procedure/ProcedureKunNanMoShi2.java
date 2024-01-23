package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureKunNanMoShi2.class */
public class ProcedureKunNanMoShi2 extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureKunNanMoShi2(ElementsWupinmiaosuMod instance) {
        super(instance, 93);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureKunNanMoShi2.1
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
            }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"选择困难模式拥有以下特质：\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
        }
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureKunNanMoShi2.2
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
            }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"- \",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\"伪灵根\",\"color\":\"yellow\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\" （从“金木水火土”中随机四~五个属性灵根）\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
        }
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureKunNanMoShi2.3
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
            }, "tellraw " + entityPlayer.func_145748_c_().func_150260_c() + " [{\"text\":\"- \",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\"平庸之体\",\"color\":\"gold\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\" （普通的常见体质）\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
        }
        if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
            ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureKunNanMoShi2.4
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entityPlayer.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entityPlayer.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entityPlayer.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entityPlayer;
                }
            }, "yuanchuchoose kn");
        }
        Map<String, Object> $_dependencies = new HashMap<>();
        $_dependencies.put("entity", entityPlayer);
        ProcedureFaBaoTiShi.executeProcedure($_dependencies);
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.func_71053_j();
        }
    }
}
