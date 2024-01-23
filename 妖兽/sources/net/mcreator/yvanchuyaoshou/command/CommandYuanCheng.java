package net.mcreator.yvanchuyaoshou.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/command/CommandYuanCheng.class */
public class CommandYuanCheng extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public CommandYuanCheng(ElementsYvanchuyaoshouMod instance) {
        super(instance, 240);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandHandler());
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/command/CommandYuanCheng$CommandHandler.class */
    public static class CommandHandler implements ICommand {
        public int compareTo(ICommand c) {
            return func_71517_b().compareTo(c.func_71517_b());
        }

        public boolean func_184882_a(MinecraftServer server, ICommandSender var1) {
            return var1.func_70003_b(0, "yuancheng");
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
            return "yuancheng";
        }

        public String func_71518_a(ICommandSender var1) {
            return "/yuancheng [<arguments>]";
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
                CommandYuanCheng.$_dependencies.put("entity", entity);
                CommandYuanCheng.$_dependencies.put("cmdparams", cmdparams);
                ProcedureYuanChengCmd.executeProcedure(CommandYuanCheng.$_dependencies);
            }
        }
    }
}
