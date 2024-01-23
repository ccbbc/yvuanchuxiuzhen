package net.mcreator.yvanchuxiuzhenfulu.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShanghai2CommandExecuted;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/command/CommandShanghai2.class */
public class CommandShanghai2 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public CommandShanghai2(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 127);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandHandler());
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/command/CommandShanghai2$CommandHandler.class */
    public static class CommandHandler implements ICommand {
        public int compareTo(ICommand c) {
            return func_71517_b().compareTo(c.func_71517_b());
        }

        public boolean func_184882_a(MinecraftServer server, ICommandSender var1) {
            return true;
        }

        public List func_71514_a() {
            return new ArrayList();
        }

        public List func_184883_a(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
            return new ArrayList();
        }

        public boolean func_82358_a(String[] string, int index) {
            return true;
        }

        public String func_71517_b() {
            return "shanghaiaaad";
        }

        public String func_71518_a(ICommandSender var1) {
            return "/shanghaiaaad [<arguments>]";
        }

        public void func_184881_a(MinecraftServer server, ICommandSender sender, String[] cmd) {
            sender.func_180425_c().func_177958_n();
            sender.func_180425_c().func_177956_o();
            sender.func_180425_c().func_177952_p();
            Entity entity = sender.func_174793_f();
            if (entity != null) {
                World world = entity.field_70170_p;
                HashMap<String, String> cmdparams = new HashMap<>();
                int[] index = {0};
                Arrays.stream(cmd).forEach(param -> {
                    cmdparams.put(Integer.toString(index[0]), param);
                    index[0] = index[0] + 1;
                });
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entity);
                ProcedureShanghai2CommandExecuted.executeProcedure($_dependencies);
            }
        }
    }
}
