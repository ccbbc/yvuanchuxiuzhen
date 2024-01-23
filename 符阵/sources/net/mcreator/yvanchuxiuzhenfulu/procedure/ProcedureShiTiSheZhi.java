package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.entity.EntityZhenFaPanJiYu;
import net.mcreator.yvanchuxiuzhenfulu.entity.EntityZhenFaShengCeng01;
import net.mcreator.yvanchuxiuzhenfulu.entity.EntityZhenFaZhiXingYuan;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureShiTiSheZhi.class */
public class ProcedureShiTiSheZhi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureShiTiSheZhi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 444);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if ((entity instanceof EntityZhenFaZhiXingYuan.EntityCustom) || (entity instanceof EntityZhenFaPanJiYu.EntityCustom) || (entity instanceof EntityZhenFaShengCeng01.EntityCustom)) {
            entity.getEntityData().func_74778_a("命令", entity.func_145748_c_().func_150260_c());
            entity.func_96094_a("阵法");
        }
    }

    @SubscribeEvent
    public void onEntitySpawned(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        int i = (int) entity.field_70165_t;
        int j = (int) entity.field_70163_u;
        int k = (int) entity.field_70161_v;
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
