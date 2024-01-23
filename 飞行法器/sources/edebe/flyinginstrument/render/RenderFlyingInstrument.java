package edebe.flyinginstrument.render;

import edebe.flyinginstrument.entity.EntityFlyingInstrument;
import edebe.flyinginstrument.loader.ItemLoader;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/render/RenderFlyingInstrument.class */
public class RenderFlyingInstrument extends Render<EntityFlyingInstrument> {
    public RenderFlyingInstrument(RenderManager renderManager) {
        super(renderManager);
    }

    /* renamed from: doRender */
    public void func_76986_a(@Nonnull EntityFlyingInstrument entity, double x, double y, double z, float entityYaw, float partialTicks) {
        World world = entity.field_70170_p;
        if (world == null) {
            return;
        }
        GlStateManager.func_179094_E();
        RenderItem itemRender = Minecraft.func_71410_x().func_175599_af();
        ItemStack itemStack = entity.getItemStack();
        func_180548_c(entity);
        Item item = itemStack.func_77973_b();
        if (item == ItemLoader.GOURD) {
            GlStateManager.func_179152_a(2.0f, 2.0f, 2.0f);
            GlStateManager.func_179137_b(x, y + 0.55d, z);
            GlStateManager.func_179114_b(180.0f, 1.0f, 1.0f, 0.0f);
            GlStateManager.func_179114_b(90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.func_179114_b((-entityYaw) + 180.0f, 1.0f, 0.0f, 0.0f);
        } else if (item == ItemLoader.LEAF) {
            GlStateManager.func_179152_a(2.0f, 2.0f, 2.0f);
            GlStateManager.func_179137_b(x, y + 0.5d, z);
            GlStateManager.func_179114_b((-entityYaw) + 180.0f, 0.0f, 1.0f, 0.0f);
        } else if (item == ItemLoader.BOAT) {
            GlStateManager.func_179152_a(2.0f, 2.0f, 2.0f);
            GlStateManager.func_179137_b(x, y + 0.58d, z);
            GlStateManager.func_179114_b((-entityYaw) + 180.0f, 0.0f, 1.0f, 0.0f);
        } else if (item == ItemLoader.MOUNTAIN_AND_RIVER_DIAGRAM) {
            GlStateManager.func_179152_a(2.0f, 2.0f, 2.0f);
            GlStateManager.func_179137_b(x, y + 0.535d, z);
            GlStateManager.func_179114_b((-entityYaw) + 180.0f, 0.0f, 1.0f, 0.0f);
        } else {
            GlStateManager.func_179137_b(x, y + 1.2d, z);
            GlStateManager.func_179114_b(-45.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.func_179114_b(90.0f, 1.0f, 1.0f, 0.0f);
            GlStateManager.func_179114_b(entityYaw + 90.0f, 0.0f, 0.0f, 1.0f);
        }
        itemRender.func_180454_a(itemStack, itemRender.func_184393_a(itemStack, (World) null, (EntityLivingBase) null));
        GlStateManager.func_179121_F();
        super.func_76986_a(entity, x, y, z, entityYaw, partialTicks);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: getEntityTexture */
    public ResourceLocation func_110775_a(@Nullable EntityFlyingInstrument entity) {
        return TextureMap.field_110575_b;
    }
}
