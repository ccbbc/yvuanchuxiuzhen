package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityLeiBanLu03;
import net.mcreator.yvanchuyaoshou.entity.EntityShouGuanYinBing02;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSum8.class */
public class ProcedureShiTiSum8 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSum8(ElementsYvanchuyaoshouMod instance) {
        super(instance, 349);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityShouGuanYinBing02.EntityCustom entityCustom;
        EntityShouGuanYinBing02.EntityCustom entityCustom2;
        EntityLeiBanLu03.EntityCustom entityCustom3;
        EntityLeiBanLu03.EntityCustom entityCustom4;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        int CheckNum = 0;
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuyaoshou:shengtai15")) && entity.getEntityData().func_74767_n("实体生成处露天")) {
            for (int index0 = 0; index0 < Config.LeiBanLuNumMax; index0++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.LeiBanLuOdds && !world.field_72995_K && (entityCustom4 = new EntityLeiBanLu03.EntityCustom(world)) != null) {
                    entityCustom4.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom4);
                }
                if (CheckNum >= Config.LeiBanLuNumMax - 1) {
                    if (Config.LeiBanLuNumMin > 0) {
                        for (int index1 = 0; index1 < Config.LeiBanLuNumMin; index1++) {
                            if (!world.field_72995_K && (entityCustom3 = new EntityLeiBanLu03.EntityCustom(world)) != null) {
                                entityCustom3.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom3);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index2 = 0; index2 < Config.ShouGuanYinBingNumMax; index2++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.ShouGuanYinBingOdds && !world.field_72995_K && (entityCustom2 = new EntityShouGuanYinBing02.EntityCustom(world)) != null) {
                    entityCustom2.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom2);
                }
                if (CheckNum >= Config.ShouGuanYinBingNumMax - 1) {
                    if (Config.ShouGuanYinBingNumMin > 0) {
                        for (int index3 = 0; index3 < Config.ShouGuanYinBingNumMin; index3++) {
                            if (!world.field_72995_K && (entityCustom = new EntityShouGuanYinBing02.EntityCustom(world)) != null) {
                                entityCustom.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
        }
    }
}
