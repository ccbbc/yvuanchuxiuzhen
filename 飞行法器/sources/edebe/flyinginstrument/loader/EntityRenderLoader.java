package edebe.flyinginstrument.loader;

import edebe.flyinginstrument.entity.EntityFlySword;
import edebe.flyinginstrument.entity.EntityFlyingInstrument;
import edebe.flyinginstrument.render.RenderFlySword;
import edebe.flyinginstrument.render.RenderFlyingInstrument;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/loader/EntityRenderLoader.class */
public class EntityRenderLoader {
    @SideOnly(Side.CLIENT)
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFlyingInstrument.class, RenderFlyingInstrument::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityFlySword.class, RenderFlySword::new);
    }
}
