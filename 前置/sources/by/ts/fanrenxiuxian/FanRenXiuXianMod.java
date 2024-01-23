package by.ts.fanrenxiuxian;

import by.ts.fanrenxiuxian.command.FRCommands;
import by.ts.fanrenxiuxian.packet.PacketHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FanRenXiuXianMod.MODID, name = FanRenXiuXianMod.NAME, version = FanRenXiuXianMod.VERSION)
/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/FanRenXiuXianMod.class */
public class FanRenXiuXianMod {
    public static final String MODID = "fanrenxiuxian";
    public static final String NAME = "Fan Ren Xiu Xian";
    public static final String VERSION = "1.2.5";
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        logger = event.getModLog();
        FRUtils.noAttrLimit(SharedMonsterAttributes.field_111267_a);
        FRUtils.noAttrLimit(SharedMonsterAttributes.field_111264_e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        PacketHandler.init();
    }

    @Mod.EventHandler
    public void serverStart(FMLServerStartingEvent event) {
        FRCommands.register(event);
    }
}
