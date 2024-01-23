package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu01;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0102;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu02;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0202;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu01;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0102;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu02;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0202;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSum9.class */
public class ProcedureShiTiSum9 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSum9(ElementsYvanchuyaoshouMod instance) {
        super(instance, 350);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityMoXiu0202.EntityCustom entityCustom;
        EntityMoXiu0202.EntityCustom entityCustom2;
        EntityMoXiu02.EntityCustom entityCustom3;
        EntityMoXiu02.EntityCustom entityCustom4;
        EntitySanXiu0202.EntityCustom entityCustom5;
        EntitySanXiu0202.EntityCustom entityCustom6;
        EntitySanXiu02.EntityCustom entityCustom7;
        EntitySanXiu02.EntityCustom entityCustom8;
        EntityMoXiu0102.EntityCustom entityCustom9;
        EntityMoXiu0102.EntityCustom entityCustom10;
        EntityMoXiu01.EntityCustom entityCustom11;
        EntityMoXiu01.EntityCustom entityCustom12;
        EntitySanXiu0102.EntityCustom entityCustom13;
        EntitySanXiu0102.EntityCustom entityCustom14;
        EntitySanXiu01.EntityCustom entityCustom15;
        EntitySanXiu01.EntityCustom entityCustom16;
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        World world = (World) dependencies.get("world");
        int CheckNum = 0;
        if (entity.field_71093_bK == 0 && entity.getEntityData().func_74767_n("实体生成处露天")) {
            for (int index0 = 0; index0 < Config.SanXiuNumMax; index0++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.SanXiuOdds) {
                    if (!world.field_72995_K && (entityCustom16 = new EntitySanXiu01.EntityCustom(world)) != null) {
                        entityCustom16.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom16);
                    }
                } else if (new Random().nextInt(100) <= Config.SanXiuOdds && !world.field_72995_K && (entityCustom13 = new EntitySanXiu0102.EntityCustom(world)) != null) {
                    entityCustom13.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom13);
                }
                if (CheckNum >= Config.SanXiuNumMax - 1) {
                    if (Config.SanXiuNumMin > 0) {
                        for (int index1 = 0; index1 < Config.SanXiuNumMin; index1++) {
                            if (new Random().nextInt(100) <= Config.SanXiuOdds) {
                                if (!world.field_72995_K && (entityCustom15 = new EntitySanXiu01.EntityCustom(world)) != null) {
                                    entityCustom15.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom15);
                                }
                            } else if (!world.field_72995_K && (entityCustom14 = new EntitySanXiu0102.EntityCustom(world)) != null) {
                                entityCustom14.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom14);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index2 = 0; index2 < Config.MoXiuNumMax; index2++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.MoXiuOdds) {
                    if (!world.field_72995_K && (entityCustom12 = new EntityMoXiu01.EntityCustom(world)) != null) {
                        entityCustom12.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom12);
                    }
                } else if (new Random().nextInt(100) <= Config.MoXiuOdds && !world.field_72995_K && (entityCustom9 = new EntityMoXiu0102.EntityCustom(world)) != null) {
                    entityCustom9.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom9);
                }
                if (CheckNum >= Config.MoXiuNumMax - 1) {
                    if (Config.MoXiuNumMin > 0) {
                        for (int index3 = 0; index3 < Config.MoXiuNumMin; index3++) {
                            if (new Random().nextInt(100) <= Config.MoXiuOdds) {
                                if (!world.field_72995_K && (entityCustom11 = new EntityMoXiu01.EntityCustom(world)) != null) {
                                    entityCustom11.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom11);
                                }
                            } else if (!world.field_72995_K && (entityCustom10 = new EntityMoXiu0102.EntityCustom(world)) != null) {
                                entityCustom10.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom10);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index4 = 0; index4 < Config.SanXiu2NumMax; index4++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.SanXiu2Odds) {
                    if (!world.field_72995_K && (entityCustom8 = new EntitySanXiu02.EntityCustom(world)) != null) {
                        entityCustom8.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom8);
                    }
                } else if (new Random().nextInt(100) <= Config.SanXiu2Odds && !world.field_72995_K && (entityCustom5 = new EntitySanXiu0202.EntityCustom(world)) != null) {
                    entityCustom5.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom5);
                }
                if (CheckNum >= Config.SanXiu2NumMax - 1) {
                    if (Config.SanXiu2NumMin > 0) {
                        for (int index5 = 0; index5 < Config.SanXiu2NumMin; index5++) {
                            if (new Random().nextInt(100) <= Config.SanXiu2Odds) {
                                if (!world.field_72995_K && (entityCustom7 = new EntitySanXiu02.EntityCustom(world)) != null) {
                                    entityCustom7.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom7);
                                }
                            } else if (!world.field_72995_K && (entityCustom6 = new EntitySanXiu0202.EntityCustom(world)) != null) {
                                entityCustom6.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom6);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index6 = 0; index6 < Config.MoXiu2NumMax; index6++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.MoXiu2Odds) {
                    if (!world.field_72995_K && (entityCustom4 = new EntityMoXiu02.EntityCustom(world)) != null) {
                        entityCustom4.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom4);
                    }
                } else if (new Random().nextInt(100) <= Config.MoXiu2Odds && !world.field_72995_K && (entityCustom = new EntityMoXiu0202.EntityCustom(world)) != null) {
                    entityCustom.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom);
                }
                if (CheckNum >= Config.MoXiu2NumMax - 1) {
                    if (Config.MoXiu2NumMin > 0) {
                        for (int index7 = 0; index7 < Config.MoXiu2NumMin; index7++) {
                            if (new Random().nextInt(100) <= Config.MoXiu2Odds) {
                                if (!world.field_72995_K && (entityCustom3 = new EntityMoXiu02.EntityCustom(world)) != null) {
                                    entityCustom3.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom3);
                                }
                            } else if (!world.field_72995_K && (entityCustom2 = new EntityMoXiu0202.EntityCustom(world)) != null) {
                                entityCustom2.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom2);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
        }
    }
}
