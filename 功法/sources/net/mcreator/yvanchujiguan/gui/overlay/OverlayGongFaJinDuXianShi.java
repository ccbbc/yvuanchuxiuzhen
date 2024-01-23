package net.mcreator.yvanchujiguan.gui.overlay;

import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/gui/overlay/OverlayGongFaJinDuXianShi.class */
public class OverlayGongFaJinDuXianShi extends ElementsYvanchujiguanMod.ModElement {
    public OverlayGongFaJinDuXianShi(ElementsYvanchujiguanMod instance) {
        super(instance, 238);
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new GUIRenderEventClass());
    }

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/gui/overlay/OverlayGongFaJinDuXianShi$GUIRenderEventClass.class */
    public static class GUIRenderEventClass {
        @SubscribeEvent(priority = EventPriority.NORMAL)
        @SideOnly(Side.CLIENT)
        public void eventHandler(RenderGameOverlayEvent event) {
            new NBTTagCompound();
            if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET && !Minecraft.func_71410_x().field_71439_g.func_184812_l_()) {
                int posX = event.getResolution().func_78326_a() / 2;
                int func_78328_b = event.getResolution().func_78328_b() / 2;
                event.getResolution().func_78326_a();
                int h = event.getResolution().func_78328_b();
                EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                World world = ((EntityPlayer) entityPlayerSP).field_70170_p;
                int i = (int) ((EntityPlayer) entityPlayerSP).field_70165_t;
                int i2 = (int) ((EntityPlayer) entityPlayerSP).field_70163_u;
                int i3 = (int) ((EntityPlayer) entityPlayerSP).field_70161_v;
                if (entityPlayerSP.getEntityData().func_74769_h("GongFaXiuLian") > 0.0d) {
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchujiguan:textures/gong_fa_di_tu_1.png"));
                    GuiIngame guiIngame = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX - 56, h - 67, 0.0f, 0.0f, 101, 17, 101.0f, 17.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchujiguan:textures/gong_fa_jin_du_1.png"));
                    GuiIngame guiIngame2 = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX - 35, h - 62, 0.0f, 0.0f, (int) entityPlayerSP.getEntityData().func_74769_h("ShowZhuXiu"), 7, 80.0f, 7.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("GeZiXianShi1") + "", posX - 42, h - 63, -16777216);
                    Minecraft.func_71410_x().field_71466_p.func_78276_b("正在修炼: " + entityPlayerSP.getEntityData().func_74779_i("FanRenXiuXian1") + "", posX - 32, h - 73, -1);
                    Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("功法层数进度显示") + "%", posX - 5, h - 63, -16777216);
                }
            }
        }
    }
}
