package net.mcreator.yvanchuxiuzhen.gui.overlay;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureArmorHIde;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureBreathHide;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFoodHide;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHealthHide;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureMainHudHide;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/overlay/OverlayMainHud.class */
public class OverlayMainHud extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public OverlayMainHud(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 337);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new GUIRenderEventClass());
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/gui/overlay/OverlayMainHud$GUIRenderEventClass.class */
    public static class GUIRenderEventClass {
        @SubscribeEvent(priority = EventPriority.NORMAL)
        @SideOnly(Side.CLIENT)
        public void eventHandler(RenderGameOverlayEvent event) {
            if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
                int posX = event.getResolution().func_78326_a() / 2;
                int func_78328_b = event.getResolution().func_78328_b() / 2;
                event.getResolution().func_78326_a();
                int h = event.getResolution().func_78328_b();
                EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                World world = ((EntityPlayer) entityPlayerSP).field_70170_p;
                int i = (int) ((EntityPlayer) entityPlayerSP).field_70165_t;
                int i2 = (int) ((EntityPlayer) entityPlayerSP).field_70163_u;
                int i3 = (int) ((EntityPlayer) entityPlayerSP).field_70161_v;
                if (ProcedureMainHudHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/strip_bg.png"));
                    GuiIngame guiIngame = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX - 91, h - 39, 0.0f, 0.0f, 81, 9, 81.0f, 9.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    if (ProcedureHealthHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/strip_bg.png"));
                        GuiIngame guiIngame2 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX - 91, h - 49, 0.0f, 0.0f, 81, 9, 81.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    if (ProcedureArmorHIde.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/strip_bg.png"));
                        GuiIngame guiIngame3 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX - 91, h - 59, 0.0f, 0.0f, 81, 9, 81.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    if (ProcedureFoodHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/strip_bg.png"));
                        GuiIngame guiIngame4 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX + 10, h - 39, 0.0f, 0.0f, 81, 9, 81.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/strip_bg.png"));
                    GuiIngame guiIngame5 = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX + 10, h - 49, 0.0f, 0.0f, 81, 9, 81.0f, 9.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    if (ProcedureBreathHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/strip_bg.png"));
                        GuiIngame guiIngame6 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX + 10, h - 59, 0.0f, 0.0f, 81, 9, 81.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/zhen_yuan_strip.png"));
                    GuiIngame guiIngame7 = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX + 12 + ((int) entityPlayerSP.getEntityData().func_74769_h("BaseStripMoveNum")), h - 37, 0.0f, 0.0f, (int) entityPlayerSP.getEntityData().func_74769_h("BaseStripUpdate"), 5, 77.0f, 5.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    if (ProcedureHealthHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/health_strip.png"));
                        GuiIngame guiIngame8 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX - 89, h - 47, 0.0f, 0.0f, (int) entityPlayerSP.getEntityData().func_74769_h("HealthStripUpdate"), 5, 77.0f, 5.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    if (ProcedureArmorHIde.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/armor_strip.png"));
                        GuiIngame guiIngame9 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX - 89, h - 57, 0.0f, 0.0f, (int) entityPlayerSP.getEntityData().func_74769_h("ArmorStripUpdate"), 5, 77.0f, 5.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/ling_qi_strip.png"));
                    GuiIngame guiIngame10 = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX - 89, h - 37, 0.0f, 0.0f, (int) entityPlayerSP.getEntityData().func_74769_h("PowerStripUpdate"), 5, 77.0f, 5.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    if (ProcedureFoodHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/food_strip.png"));
                        GuiIngame guiIngame11 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX + 12 + ((int) entityPlayerSP.getEntityData().func_74769_h("FoodStripMoveNum")), h - 47, 0.0f, 0.0f, (int) entityPlayerSP.getEntityData().func_74769_h("FoodStripUpdate"), 5, 77.0f, 5.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    if (ProcedureBreathHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/breath_strip.png"));
                        GuiIngame guiIngame12 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX + 12 + ((int) entityPlayerSP.getEntityData().func_74769_h("BreathStripMoveNum")), h - 57, 0.0f, 0.0f, (int) entityPlayerSP.getEntityData().func_74769_h("BreathStripUpdate"), 5, 77.0f, 5.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/zhen_yuan_icon.png"));
                    GuiIngame guiIngame13 = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX + 92, h - 39, 0.0f, 0.0f, 9, 9, 9.0f, 9.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    if (ProcedureHealthHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/health_icon.png"));
                        GuiIngame guiIngame14 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX - 101, h - 49, 0.0f, 0.0f, 9, 9, 9.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    if (ProcedureArmorHIde.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/armor_icon.png"));
                        GuiIngame guiIngame15 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX - 101, h - 59, 0.0f, 0.0f, 9, 9, 9.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179118_c();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/ling_qi_icon.png"));
                    GuiIngame guiIngame16 = Minecraft.func_71410_x().field_71456_v;
                    GuiIngame.func_146110_a(posX - 101, h - 39, 0.0f, 0.0f, 9, 9, 9.0f, 9.0f);
                    GlStateManager.func_179132_a(true);
                    GlStateManager.func_179126_j();
                    GlStateManager.func_179141_d();
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.func_179097_i();
                    GlStateManager.func_179132_a(false);
                    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    if (ProcedureFoodHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/food_icon.png"));
                        GuiIngame guiIngame17 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX + 92, h - 49, 0.0f, 0.0f, 9, 9, 9.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    if (ProcedureBreathHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        GlStateManager.func_179097_i();
                        GlStateManager.func_179132_a(false);
                        GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.func_179118_c();
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("yvanchuxiuzhen:textures/breath_icon.png"));
                        GuiIngame guiIngame18 = Minecraft.func_71410_x().field_71456_v;
                        GuiIngame.func_146110_a(posX + 92, h - 59, 0.0f, 0.0f, 9, 9, 9.0f, 9.0f);
                        GlStateManager.func_179132_a(true);
                        GlStateManager.func_179126_j();
                        GlStateManager.func_179141_d();
                        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("ZhenYuanNumShow") + "", posX + 102, h - 39, -1);
                    if (ProcedureHealthHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("HealthNumShow") + "", (posX - 104) - ((int) entityPlayerSP.getEntityData().func_74769_h("HealthFontMove")), h - 49, -1);
                    }
                    if (ProcedureArmorHIde.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("ArmorNumShow") + "", (posX - 104) - ((int) entityPlayerSP.getEntityData().func_74769_h("ArmorFontMove")), h - 59, -1);
                    }
                    Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("LingQiNumShow") + "", (posX - 104) - ((int) entityPlayerSP.getEntityData().func_74769_h("PowerFontMove")), h - 39, -1);
                    if (ProcedureFoodHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("FoodNumShow") + "", posX + 102, h - 49, -1);
                    }
                    if (ProcedureBreathHide.executeProcedure(ImmutableMap.of("entity", entityPlayerSP))) {
                        Minecraft.func_71410_x().field_71466_p.func_78276_b("" + entityPlayerSP.getEntityData().func_74779_i("BreathNumShow") + "", posX + 102, h - 59, -1);
                    }
                }
            }
        }
    }
}
