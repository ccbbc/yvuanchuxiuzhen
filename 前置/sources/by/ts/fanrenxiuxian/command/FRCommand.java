package by.ts.fanrenxiuxian.command;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/command/FRCommand.class */
public abstract class FRCommand extends CommandBase {
    private String name;

    public FRCommand(String name) {
        this.name = name;
    }

    public String func_71517_b() {
        return this.name;
    }

    public String func_71518_a(ICommandSender sender) {
        return "commands." + this.name + ".usage";
    }

    public Set<String> getEntityNameSet(MinecraftServer server, String entityName) {
        World[] worldArr;
        Set<String> names = new HashSet<>();
        for (World world : server.field_71305_c) {
            world.field_72996_f.stream().forEach(e -> {
                if (e instanceof EntityLivingBase) {
                    names.add(e.func_70005_c_());
                }
            });
        }
        return names;
    }
}
