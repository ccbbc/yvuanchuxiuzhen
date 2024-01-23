package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou01;
import net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou02;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi02;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSum7.class */
public class ProcedureShiTiSum7 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSum7(ElementsYvanchuyaoshouMod instance) {
        super(instance, 348);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityHunTieShou02.EntityCustom entityCustom;
        EntityHunTieShou02.EntityCustom entityCustom2;
        EntityHunTieShou01.EntityCustom entityCustom3;
        EntityHunTieShou01.EntityCustom entityCustom4;
        EntityJunEYi02.EntityCustom entityCustom5;
        EntityJunEYi02.EntityCustom entityCustom6;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        int CheckNum = 0;
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuyaoshou:shengtai17")) && entity.getEntityData().func_74767_n("实体生成处露天")) {
            for (int index0 = 0; index0 < Config.JunEYiNumMax; index0++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.JunEYiOdds && !world.field_72995_K && (entityCustom6 = new EntityJunEYi02.EntityCustom(world)) != null) {
                    entityCustom6.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom6);
                }
                if (CheckNum >= Config.JunEYiNumMax - 1) {
                    if (Config.JunEYiNumMin > 0) {
                        for (int index1 = 0; index1 < Config.JunEYiNumMin; index1++) {
                            if (!world.field_72995_K && (entityCustom5 = new EntityJunEYi02.EntityCustom(world)) != null) {
                                entityCustom5.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom5);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index2 = 0; index2 < Config.HunTieShouNumMax; index2++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.HunTieShouOdds && !world.field_72995_K && (entityCustom4 = new EntityHunTieShou01.EntityCustom(world)) != null) {
                    entityCustom4.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom4);
                }
                if (CheckNum >= Config.HunTieShouNumMax - 1) {
                    if (Config.HunTieShouNumMin > 0) {
                        for (int index3 = 0; index3 < Config.HunTieShouNumMin; index3++) {
                            if (!world.field_72995_K && (entityCustom3 = new EntityHunTieShou01.EntityCustom(world)) != null) {
                                entityCustom3.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom3);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index4 = 0; index4 < Config.HunTieShou2NumMax; index4++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.HunTieShou2Odds && !world.field_72995_K && (entityCustom2 = new EntityHunTieShou02.EntityCustom(world)) != null) {
                    entityCustom2.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom2);
                }
                if (CheckNum >= Config.HunTieShou2NumMax - 1) {
                    if (Config.HunTieShou2NumMin > 0) {
                        for (int index5 = 0; index5 < Config.HunTieShou2NumMin; index5++) {
                            if (!world.field_72995_K && (entityCustom = new EntityHunTieShou02.EntityCustom(world)) != null) {
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
