package by.ts.fanrenxiuxian.command;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/command/FRCommands.class */
public class FRCommands {
    public static void register(FMLServerStartingEvent event) {
        event.registerServerCommand(new AttributeCommand());
        event.registerServerCommand(new CustomEntityDataCommand());
    }
}
