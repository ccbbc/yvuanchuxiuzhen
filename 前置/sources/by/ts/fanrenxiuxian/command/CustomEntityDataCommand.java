package by.ts.fanrenxiuxian.command;

import by.ts.fanrenxiuxian.AttrWrapper;
import by.ts.fanrenxiuxian.FanRenXiuXianMod;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/command/CustomEntityDataCommand.class */
public class CustomEntityDataCommand extends FRCommand {
    public CustomEntityDataCommand() {
        super("customEntityData");
    }

    public void func_184881_a(MinecraftServer server, ICommandSender sender, String[] args) {
        World[] worldArr;
        if (args.length == 3) {
            String entityName = args[0];
            String attrName = args[1];
            String value = args[2];
            for (World world : server.field_71305_c) {
                world.field_72996_f.stream().forEach(e -> {
                    if ((e instanceof EntityLivingBase) && e.func_70005_c_().equals(entityName)) {
                        AttrWrapper.ATTR_MAP.get(attrName).setStringData(e.getEntityData(), value);
                        e.getEntityData().func_74757_a("dataChanged", true);
                    }
                });
            }
            return;
        }
        FanRenXiuXianMod.logger.error("命令错误");
    }

    public List<String> func_184883_a(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        List<String> result = new ArrayList<>();
        int currentArgsIndex = args.length - 1;
        if (currentArgsIndex == 0) {
            String entityName = args[currentArgsIndex];
            Set<String> names = getEntityNameSet(server, entityName);
            result.addAll(CommandBase.func_175762_a(args, names));
        } else if (currentArgsIndex == 1) {
            result.addAll(CommandBase.func_175762_a(args, AttrWrapper.ATTR_MAP.keySet()));
        }
        return result;
    }
}
