package edebe.flyinginstrument.event;

import edebe.flyinginstrument.entity.IFlyingInstrumentEntity;
import edebe.flyinginstrument.item.IFlyingInstrumentItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/event/EventHander.class */
public class EventHander {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onGameOverlayRender(RenderGameOverlayEvent.Pre event) {
        EntityPlayerSP player = Minecraft.func_71410_x().field_71439_g;
        if (event.getType() != RenderGameOverlayEvent.ElementType.HEALTHMOUNT || !player.func_184218_aH() || !(player.func_184187_bx() instanceof IFlyingInstrumentEntity)) {
            return;
        }
        event.setCanceled(true);
    }

    @SubscribeEvent
    public static void onPlayerRightClickItem(PlayerInteractEvent.RightClickItem event) {
        EntityPlayer player;
        World world = event.getWorld();
        if (!world.field_72995_K && (player = event.getEntityPlayer()) != null) {
            ItemStack stack = event.getItemStack();
            NBTTagCompound data = player.getEntityData();
            if (data.func_74764_b("Power") && data.func_74760_g("Power") > 0.0f && !player.func_184218_aH() && !player.func_184218_aH() && (stack.func_77973_b() instanceof IFlyingInstrumentItem)) {
                stack.func_77972_a(1, player);
                if (!player.func_70093_af() && (stack.func_77973_b() instanceof IFlyingInstrumentItem)) {
                    Entity sword = stack.func_77973_b().createEntity(world, stack.func_77946_l(), player);
                    sword.func_70634_a(player.field_70165_t, player.field_70163_u, player.field_70161_v);
                    world.func_72838_d(sword);
                    event.getEntity().func_184220_m(sword);
                    stack.func_190918_g(1);
                }
            } else if ((stack.func_77973_b() instanceof IFlyingInstrumentItem) && data.func_74764_b("Power") && data.func_74760_g("Power") <= 0.0f) {
                player.func_145747_a(new TextComponentTranslation("message.flyinginstrument.use.flysword.fail", new Object[0]));
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerUpdate(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;
        if (player.func_184218_aH() && player.func_70093_af()) {
            IFlyingInstrumentEntity func_184187_bx = player.func_184187_bx();
            if (func_184187_bx instanceof IFlyingInstrumentEntity) {
                func_184187_bx.putAwaySword(player);
                player.func_184210_p();
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerLoggedOutEvent(PlayerEvent.PlayerLoggedOutEvent event) {
        EntityPlayer player;
        IFlyingInstrumentEntity func_184187_bx;
        if (event != null && (player = event.player) != null && (player instanceof EntityPlayer) && !player.field_70170_p.field_72995_K && player.func_184218_aH() && (func_184187_bx = player.func_184187_bx()) != null && (func_184187_bx instanceof IFlyingInstrumentEntity)) {
            func_184187_bx.putAwaySword(player);
            player.func_184210_p();
        }
    }

    @SubscribeEvent
    public static void onPlayerAttackEntityEvent(AttackEntityEvent event) {
        EntityPlayer player;
        if (event != null && (player = event.getEntityPlayer()) != null && !player.field_70170_p.field_72995_K) {
            ItemStack itemStack = player.func_184582_a(EntityEquipmentSlot.MAINHAND);
            if (!itemStack.func_190926_b() && (itemStack.func_77973_b() instanceof IFlyingInstrumentItem)) {
                event.setCanceled(true);
            }
        }
    }
}
