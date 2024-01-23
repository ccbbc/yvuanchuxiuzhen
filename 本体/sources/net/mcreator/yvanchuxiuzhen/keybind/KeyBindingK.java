package net.mcreator.yvanchuxiuzhen.keybind;

import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureKOnKeyPressed;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/keybind/KeyBindingK.class */
public class KeyBindingK extends ElementsYvanchuxiuzhenMod.ModElement {
    private KeyBinding keys;
    static Map<String, Object> $_dependencies = new HashMap();

    public KeyBindingK(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 108);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        this.elements.addNetworkMessage(KeyBindingPressedMessageHandler.class, KeyBindingPressedMessage.class, Side.SERVER);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void init(FMLInitializationEvent event) {
        this.keys = new KeyBinding("key.mcreator.k", 37, "key.categories.initial");
        ClientRegistry.registerKeyBinding(this.keys);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (Minecraft.func_71410_x().field_71462_r == null && this.keys.func_151468_f()) {
            YvanchuxiuzhenMod.PACKET_HANDLER.sendToServer(new KeyBindingPressedMessage());
            pressAction(Minecraft.func_71410_x().field_71439_g);
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/keybind/KeyBindingK$KeyBindingPressedMessageHandler.class */
    public static class KeyBindingPressedMessageHandler implements IMessageHandler<KeyBindingPressedMessage, IMessage> {
        public IMessage onMessage(KeyBindingPressedMessage message, MessageContext context) {
            EntityPlayerMP entity = context.getServerHandler().field_147369_b;
            entity.func_71121_q().func_152344_a(() -> {
                KeyBindingK.pressAction(entity);
            });
            return null;
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/keybind/KeyBindingK$KeyBindingPressedMessage.class */
    public static class KeyBindingPressedMessage implements IMessage {
        public void toBytes(ByteBuf buf) {
        }

        public void fromBytes(ByteBuf buf) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pressAction(EntityPlayer entity) {
        World world = entity.field_70170_p;
        int x = (int) entity.field_70165_t;
        int y = (int) entity.field_70163_u;
        int z = (int) entity.field_70161_v;
        if (!world.func_175667_e(new BlockPos(x, y, z))) {
            return;
        }
        $_dependencies.put("entity", entity);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        $_dependencies.put("world", world);
        ProcedureKOnKeyPressed.executeProcedure($_dependencies);
    }
}
