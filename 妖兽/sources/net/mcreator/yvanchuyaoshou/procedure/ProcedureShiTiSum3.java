package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity16;
import net.mcreator.yvanchuyaoshou.entity.EntityHeiZhu;
import net.mcreator.yvanchuyaoshou.entity.EntityShiFengTuo04;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao02;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSum3.class */
public class ProcedureShiTiSum3 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSum3(ElementsYvanchuyaoshouMod instance) {
        super(instance, 344);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityShiFengTuo04.EntityCustom entityCustom;
        EntityShiFengTuo04.EntityCustom entityCustom2;
        EntityCaientity16.EntityCustom entityCustom3;
        EntityCaientity16.EntityCustom entityCustom4;
        EntityYingXiao02.EntityCustom entityCustom5;
        EntityYingXiao02.EntityCustom entityCustom6;
        EntityHeiZhu.EntityCustom entityCustom7;
        EntityHeiZhu.EntityCustom entityCustom8;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        int CheckNum = 0;
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuyaoshou:shengtai21"))) {
            if (entity.getEntityData().func_74767_n("实体生成处露天") || entity.getEntityData().func_74767_n("实体生成处黑暗")) {
                for (int index0 = 0; index0 < Config.HeiZhuNumMax; index0++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.HeiZhuOdds && !world.field_72995_K && (entityCustom8 = new EntityHeiZhu.EntityCustom(world)) != null) {
                        entityCustom8.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom8);
                    }
                    if (CheckNum >= Config.HeiZhuNumMax - 1) {
                        if (Config.HeiZhuNumMin > 0) {
                            for (int index1 = 0; index1 < Config.HeiZhuNumMin; index1++) {
                                if (!world.field_72995_K && (entityCustom7 = new EntityHeiZhu.EntityCustom(world)) != null) {
                                    entityCustom7.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom7);
                                }
                            }
                        }
                        CheckNum = 0;
                    }
                }
                if (entity.getEntityData().func_74767_n("实体生成处露天")) {
                    for (int index2 = 0; index2 < Config.YingXiaoNumMax; index2++) {
                        CheckNum++;
                        if (new Random().nextInt(100) <= Config.YingXiaoOdds && !world.field_72995_K && (entityCustom6 = new EntityYingXiao02.EntityCustom(world)) != null) {
                            entityCustom6.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom6);
                        }
                        if (CheckNum >= Config.YingXiaoNumMax - 1) {
                            if (Config.YingXiaoNumMin > 0) {
                                for (int index3 = 0; index3 < Config.YingXiaoNumMin; index3++) {
                                    if (!world.field_72995_K && (entityCustom5 = new EntityYingXiao02.EntityCustom(world)) != null) {
                                        entityCustom5.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom5);
                                    }
                                }
                            }
                            CheckNum = 0;
                        }
                    }
                    for (int index4 = 0; index4 < Config.GuLangNumMax; index4++) {
                        CheckNum++;
                        if (new Random().nextInt(100) <= Config.GuLangOdds && !world.field_72995_K && (entityCustom4 = new EntityCaientity16.EntityCustom(world)) != null) {
                            entityCustom4.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom4);
                        }
                        if (CheckNum >= Config.GuLangNumMax - 1) {
                            if (Config.GuLangNumMin > 0) {
                                for (int index5 = 0; index5 < Config.GuLangNumMin; index5++) {
                                    if (!world.field_72995_K && (entityCustom3 = new EntityCaientity16.EntityCustom(world)) != null) {
                                        entityCustom3.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom3);
                                    }
                                }
                            }
                            CheckNum = 0;
                        }
                    }
                    for (int index6 = 0; index6 < Config.ShiFengTuoNumMax; index6++) {
                        CheckNum++;
                        if (new Random().nextInt(100) <= Config.ShiFengTuoOdds && !world.field_72995_K && (entityCustom2 = new EntityShiFengTuo04.EntityCustom(world)) != null) {
                            entityCustom2.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom2);
                        }
                        if (CheckNum >= Config.ShiFengTuoNumMax - 1) {
                            if (Config.ShiFengTuoNumMin > 0) {
                                for (int index7 = 0; index7 < Config.ShiFengTuoNumMin; index7++) {
                                    if (!world.field_72995_K && (entityCustom = new EntityShiFengTuo04.EntityCustom(world)) != null) {
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
    }
}
