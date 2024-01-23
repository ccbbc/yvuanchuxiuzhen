package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity02;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity04;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity10;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity11;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi04;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi05;
import net.mcreator.yvanchuyaoshou.entity.EntityLeiBanLu03;
import net.mcreator.yvanchuyaoshou.entity.EntityLeiBanLu04;
import net.mcreator.yvanchuyaoshou.entity.EntityLeiBanLu05;
import net.mcreator.yvanchuyaoshou.entity.EntityLeiYuanJuE04;
import net.mcreator.yvanchuyaoshou.entity.EntityLinHaiShouHuang04;
import net.mcreator.yvanchuyaoshou.entity.EntityLinHaiShouHuang05;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu03;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0302;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu04;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0402;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu05;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0502;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu03;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0302;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu04;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0402;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu05;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0502;
import net.mcreator.yvanchuyaoshou.entity.EntityShiFengTuo04;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao03;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao04;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao05;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSum6.class */
public class ProcedureShiTiSum6 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSum6(ElementsYvanchuyaoshouMod instance) {
        super(instance, 347);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum6$1] */
    /* JADX WARN: Type inference failed for: r0v70, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum6$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityMoXiu0502.EntityCustom entityCustom;
        EntityMoXiu0502.EntityCustom entityCustom2;
        EntityMoXiu05.EntityCustom entityCustom3;
        EntityMoXiu05.EntityCustom entityCustom4;
        EntitySanXiu0502.EntityCustom entityCustom5;
        EntitySanXiu0502.EntityCustom entityCustom6;
        EntitySanXiu05.EntityCustom entityCustom7;
        EntitySanXiu05.EntityCustom entityCustom8;
        EntityMoXiu0402.EntityCustom entityCustom9;
        EntityMoXiu0402.EntityCustom entityCustom10;
        EntityMoXiu04.EntityCustom entityCustom11;
        EntityMoXiu04.EntityCustom entityCustom12;
        EntitySanXiu0402.EntityCustom entityCustom13;
        EntitySanXiu0402.EntityCustom entityCustom14;
        EntitySanXiu04.EntityCustom entityCustom15;
        EntitySanXiu04.EntityCustom entityCustom16;
        EntityMoXiu0302.EntityCustom entityCustom17;
        EntityMoXiu0302.EntityCustom entityCustom18;
        EntityMoXiu03.EntityCustom entityCustom19;
        EntityCaientity02.EntityCustom entityCustom20;
        EntitySanXiu0302.EntityCustom entityCustom21;
        EntitySanXiu0302.EntityCustom entityCustom22;
        EntitySanXiu03.EntityCustom entityCustom23;
        EntitySanXiu03.EntityCustom entityCustom24;
        EntityCaientity02.EntityCustom entityCustom25;
        EntityCaientity02.EntityCustom entityCustom26;
        EntityCaientity11.EntityCustom entityCustom27;
        EntityCaientity11.EntityCustom entityCustom28;
        EntityCaientity10.EntityCustom entityCustom29;
        EntityCaientity10.EntityCustom entityCustom30;
        EntityLinHaiShouHuang05.EntityCustom entityCustom31;
        EntityLinHaiShouHuang05.EntityCustom entityCustom32;
        EntityLeiBanLu05.EntityCustom entityCustom33;
        EntityLeiBanLu05.EntityCustom entityCustom34;
        EntityYingXiao05.EntityCustom entityCustom35;
        EntityYingXiao05.EntityCustom entityCustom36;
        EntityJunEYi05.EntityCustom entityCustom37;
        EntityJunEYi05.EntityCustom entityCustom38;
        EntityLeiYuanJuE04.EntityCustom entityCustom39;
        EntityLeiYuanJuE04.EntityCustom entityCustom40;
        EntityLinHaiShouHuang04.EntityCustom entityCustom41;
        EntityLinHaiShouHuang04.EntityCustom entityCustom42;
        EntityLeiBanLu04.EntityCustom entityCustom43;
        EntityLeiBanLu04.EntityCustom entityCustom44;
        EntityJunEYi04.EntityCustom entityCustom45;
        EntityJunEYi04.EntityCustom entityCustom46;
        EntityYingXiao04.EntityCustom entityCustom47;
        EntityYingXiao04.EntityCustom entityCustom48;
        EntityShiFengTuo04.EntityCustom entityCustom49;
        EntityShiFengTuo04.EntityCustom entityCustom50;
        EntityYingXiao03.EntityCustom entityCustom51;
        EntityYingXiao03.EntityCustom entityCustom52;
        EntityLeiBanLu03.EntityCustom entityCustom53;
        EntityLeiBanLu03.EntityCustom entityCustom54;
        EntityCaientity04.EntityCustom entityCustom55;
        EntityCaientity04.EntityCustom entityCustom56;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        int CheckNum = 0;
        if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum6.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("群系检测") == 114 && ((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("plains"))) {
            entity.getEntityData().func_74757_a("群系检测", true);
        }
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuxiuzhen:shengtai1")) && entity.getEntityData().func_74767_n("实体生成处露天")) {
            for (int index0 = 0; index0 < Config.PuNiaoNumMax; index0++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.PuNiaoOdds && !world.field_72995_K && (entityCustom56 = new EntityCaientity04.EntityCustom(world)) != null) {
                    entityCustom56.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom56);
                }
                if (CheckNum >= Config.PuNiaoNumMax - 1) {
                    if (Config.PuNiaoNumMin > 0) {
                        for (int index1 = 0; index1 < Config.PuNiaoNumMin; index1++) {
                            if (!world.field_72995_K && (entityCustom55 = new EntityCaientity04.EntityCustom(world)) != null) {
                                entityCustom55.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom55);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index2 = 0; index2 < Config.LeiBanLuNumMax; index2++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.LeiBanLuOdds && !world.field_72995_K && (entityCustom54 = new EntityLeiBanLu03.EntityCustom(world)) != null) {
                    entityCustom54.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom54);
                }
                if (CheckNum >= Config.LeiBanLuNumMax - 1) {
                    if (Config.LeiBanLuNumMin > 0) {
                        for (int index3 = 0; index3 < Config.LeiBanLuNumMin; index3++) {
                            if (!world.field_72995_K && (entityCustom53 = new EntityLeiBanLu03.EntityCustom(world)) != null) {
                                entityCustom53.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom53);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index4 = 0; index4 < Config.YingXiao2NumMax; index4++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.YingXiao2Odds && !world.field_72995_K && (entityCustom52 = new EntityYingXiao03.EntityCustom(world)) != null) {
                    entityCustom52.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom52);
                }
                if (CheckNum >= Config.YingXiao2NumMax - 1) {
                    if (Config.YingXiao2NumMin > 0) {
                        for (int index5 = 0; index5 < Config.YingXiao2NumMin; index5++) {
                            if (!world.field_72995_K && (entityCustom51 = new EntityYingXiao03.EntityCustom(world)) != null) {
                                entityCustom51.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom51);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index6 = 0; index6 < Config.ShiFengTuoNumMax; index6++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.ShiFengTuoOdds && !world.field_72995_K && (entityCustom50 = new EntityShiFengTuo04.EntityCustom(world)) != null) {
                    entityCustom50.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom50);
                }
                if (CheckNum >= Config.ShiFengTuoNumMax - 1) {
                    if (Config.ShiFengTuoNumMin > 0) {
                        for (int index7 = 0; index7 < Config.ShiFengTuoNumMin; index7++) {
                            if (!world.field_72995_K && (entityCustom49 = new EntityShiFengTuo04.EntityCustom(world)) != null) {
                                entityCustom49.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom49);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index8 = 0; index8 < Config.YingXiao3NumMax; index8++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.YingXiao3Odds && !world.field_72995_K && (entityCustom48 = new EntityYingXiao04.EntityCustom(world)) != null) {
                    entityCustom48.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom48);
                }
                if (CheckNum >= Config.YingXiao3NumMax - 1) {
                    if (Config.YingXiao3NumMin > 0) {
                        for (int index9 = 0; index9 < Config.YingXiao3NumMin; index9++) {
                            if (!world.field_72995_K && (entityCustom47 = new EntityYingXiao04.EntityCustom(world)) != null) {
                                entityCustom47.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom47);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index10 = 0; index10 < Config.JunEYi3NumMax; index10++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.JunEYi3Odds && !world.field_72995_K && (entityCustom46 = new EntityJunEYi04.EntityCustom(world)) != null) {
                    entityCustom46.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom46);
                }
                if (CheckNum >= Config.JunEYi3NumMax - 1) {
                    if (Config.JunEYi3NumMin > 0) {
                        for (int index11 = 0; index11 < Config.JunEYi3NumMin; index11++) {
                            if (!world.field_72995_K && (entityCustom45 = new EntityJunEYi04.EntityCustom(world)) != null) {
                                entityCustom45.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom45);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index12 = 0; index12 < Config.LeiBanLu2NumMax; index12++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.LeiBanLu2Odds && !world.field_72995_K && (entityCustom44 = new EntityLeiBanLu04.EntityCustom(world)) != null) {
                    entityCustom44.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom44);
                }
                if (CheckNum >= Config.LeiBanLu2NumMax - 1) {
                    if (Config.LeiBanLu2NumMin > 0) {
                        for (int index13 = 0; index13 < Config.LeiBanLu2NumMin; index13++) {
                            if (!world.field_72995_K && (entityCustom43 = new EntityLeiBanLu04.EntityCustom(world)) != null) {
                                entityCustom43.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom43);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index14 = 0; index14 < Config.LinHaiShouHuangNumMax; index14++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.LinHaiShouHuangOdds && !world.field_72995_K && (entityCustom42 = new EntityLinHaiShouHuang04.EntityCustom(world)) != null) {
                    entityCustom42.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom42);
                }
                if (CheckNum >= Config.LinHaiShouHuangNumMax - 1) {
                    if (Config.LinHaiShouHuangNumMin > 0) {
                        for (int index15 = 0; index15 < Config.LinHaiShouHuangNumMin; index15++) {
                            if (!world.field_72995_K && (entityCustom41 = new EntityLinHaiShouHuang04.EntityCustom(world)) != null) {
                                entityCustom41.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom41);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index16 = 0; index16 < Config.LeiYuanJuENumMax; index16++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.LeiYuanJuEOdds && !world.field_72995_K && (entityCustom40 = new EntityLeiYuanJuE04.EntityCustom(world)) != null) {
                    entityCustom40.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom40);
                }
                if (CheckNum >= Config.LeiYuanJuENumMax - 1) {
                    if (Config.LeiYuanJuENumMin > 0) {
                        for (int index17 = 0; index17 < Config.LeiYuanJuENumMin; index17++) {
                            if (!world.field_72995_K && (entityCustom39 = new EntityLeiYuanJuE04.EntityCustom(world)) != null) {
                                entityCustom39.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom39);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index18 = 0; index18 < Config.JunEYi4NumMax; index18++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.JunEYi4Odds && !world.field_72995_K && (entityCustom38 = new EntityJunEYi05.EntityCustom(world)) != null) {
                    entityCustom38.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom38);
                }
                if (CheckNum >= Config.JunEYi4NumMax - 1) {
                    if (Config.JunEYi4NumMin > 0) {
                        for (int index19 = 0; index19 < Config.JunEYi4NumMin; index19++) {
                            if (!world.field_72995_K && (entityCustom37 = new EntityJunEYi05.EntityCustom(world)) != null) {
                                entityCustom37.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom37);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index20 = 0; index20 < Config.YingXiao4NumMax; index20++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.YingXiao4Odds && !world.field_72995_K && (entityCustom36 = new EntityYingXiao05.EntityCustom(world)) != null) {
                    entityCustom36.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom36);
                }
                if (CheckNum >= Config.YingXiao4NumMax - 1) {
                    if (Config.YingXiao4NumMin > 0) {
                        for (int index21 = 0; index21 < Config.YingXiao4NumMin; index21++) {
                            if (!world.field_72995_K && (entityCustom35 = new EntityYingXiao05.EntityCustom(world)) != null) {
                                entityCustom35.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom35);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index22 = 0; index22 < Config.LeiBanLu3NumMax; index22++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.LeiBanLu3Odds && !world.field_72995_K && (entityCustom34 = new EntityLeiBanLu05.EntityCustom(world)) != null) {
                    entityCustom34.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom34);
                }
                if (CheckNum >= Config.LeiBanLu3NumMax - 1) {
                    if (Config.LeiBanLu3NumMin > 0) {
                        for (int index23 = 0; index23 < Config.LeiBanLu3NumMin; index23++) {
                            if (!world.field_72995_K && (entityCustom33 = new EntityLeiBanLu05.EntityCustom(world)) != null) {
                                entityCustom33.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom33);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index24 = 0; index24 < Config.LinHaiShouHuang2NumMax; index24++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.LinHaiShouHuang2Odds && !world.field_72995_K && (entityCustom32 = new EntityLinHaiShouHuang05.EntityCustom(world)) != null) {
                    entityCustom32.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom32);
                }
                if (CheckNum >= Config.LinHaiShouHuang2NumMax - 1) {
                    if (Config.LinHaiShouHuang2NumMin > 0) {
                        for (int index25 = 0; index25 < Config.LinHaiShouHuang2NumMin; index25++) {
                            if (!world.field_72995_K && (entityCustom31 = new EntityLinHaiShouHuang05.EntityCustom(world)) != null) {
                                entityCustom31.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom31);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index26 = 0; index26 < Config.BaiZeNumMax; index26++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.BaiZeOdds && !world.field_72995_K && (entityCustom30 = new EntityCaientity10.EntityCustom(world)) != null) {
                    entityCustom30.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom30);
                }
                if (CheckNum >= Config.BaiZeNumMax - 1) {
                    if (Config.BaiZeNumMin > 0) {
                        for (int index27 = 0; index27 < Config.BaiZeNumMin; index27++) {
                            if (!world.field_72995_K && (entityCustom29 = new EntityCaientity10.EntityCustom(world)) != null) {
                                entityCustom29.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom29);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index28 = 0; index28 < Config.JiuWeiHuoHuNumMax; index28++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.JiuWeiHuoHuOdds && !world.field_72995_K && (entityCustom28 = new EntityCaientity11.EntityCustom(world)) != null) {
                    entityCustom28.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom28);
                }
                if (CheckNum >= Config.JiuWeiHuoHuNumMax - 1) {
                    if (Config.JiuWeiHuoHuNumMin > 0) {
                        for (int index29 = 0; index29 < Config.JiuWeiHuoHuNumMin; index29++) {
                            if (!world.field_72995_K && (entityCustom27 = new EntityCaientity11.EntityCustom(world)) != null) {
                                entityCustom27.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom27);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index30 = 0; index30 < Config.QiLinNumMax; index30++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.QiLinOdds && !world.field_72995_K && (entityCustom26 = new EntityCaientity02.EntityCustom(world)) != null) {
                    entityCustom26.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom26);
                }
                if (CheckNum >= Config.QiLinNumMax - 1) {
                    if (Config.QiLinNumMin > 0) {
                        for (int index31 = 0; index31 < Config.QiLinNumMin; index31++) {
                            if (!world.field_72995_K && (entityCustom25 = new EntityCaientity02.EntityCustom(world)) != null) {
                                entityCustom25.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom25);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum6.2
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SumLimit2") < Config.AllXiuShiNumMax) {
                for (int index32 = 0; index32 < Config.SanXiu3NumMax; index32++) {
                    if (new Random().nextInt(100) <= Config.SanXiu3Odds) {
                        if (!world.field_72995_K && (entityCustom24 = new EntitySanXiu03.EntityCustom(world)) != null) {
                            entityCustom24.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom24);
                        }
                    } else if (new Random().nextInt(100) <= Config.SanXiu3Odds && !world.field_72995_K && (entityCustom21 = new EntitySanXiu0302.EntityCustom(world)) != null) {
                        entityCustom21.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom21);
                    }
                    if (CheckNum >= Config.SanXiu3NumMax - 1 && Config.SanXiu3NumMin > 0) {
                        for (int index33 = 0; index33 < Config.SanXiu3NumMin; index33++) {
                            if (new Random().nextInt(100) <= Config.SanXiu3Odds) {
                                if (!world.field_72995_K && (entityCustom23 = new EntitySanXiu03.EntityCustom(world)) != null) {
                                    entityCustom23.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom23);
                                }
                            } else if (!world.field_72995_K && (entityCustom22 = new EntitySanXiu0302.EntityCustom(world)) != null) {
                                entityCustom22.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom22);
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index34 = 0; index34 < Config.MoXiu3NumMax; index34++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.MoXiu3Odds) {
                        if (!world.field_72995_K && (entityCustom20 = new EntityCaientity02.EntityCustom(world)) != null) {
                            entityCustom20.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom20);
                        }
                    } else if (new Random().nextInt(100) <= Config.MoXiu3Odds && !world.field_72995_K && (entityCustom17 = new EntityMoXiu0302.EntityCustom(world)) != null) {
                        entityCustom17.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom17);
                    }
                    if (CheckNum >= Config.MoXiu3NumMax - 1 && Config.MoXiu3NumMin > 0) {
                        for (int index35 = 0; index35 < Config.MoXiu3NumMin; index35++) {
                            if (new Random().nextInt(100) <= Config.MoXiu3Odds) {
                                if (!world.field_72995_K && (entityCustom19 = new EntityMoXiu03.EntityCustom(world)) != null) {
                                    entityCustom19.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom19);
                                }
                            } else if (!world.field_72995_K && (entityCustom18 = new EntityMoXiu0302.EntityCustom(world)) != null) {
                                entityCustom18.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom18);
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index36 = 0; index36 < Config.SanXiu4NumMax; index36++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.SanXiu4Odds) {
                        if (!world.field_72995_K && (entityCustom16 = new EntitySanXiu04.EntityCustom(world)) != null) {
                            entityCustom16.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom16);
                        }
                    } else if (new Random().nextInt(100) <= Config.SanXiu4Odds && !world.field_72995_K && (entityCustom13 = new EntitySanXiu0402.EntityCustom(world)) != null) {
                        entityCustom13.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom13);
                    }
                    if (CheckNum >= Config.SanXiu4NumMax - 1) {
                        if (Config.SanXiu4NumMin > 0) {
                            for (int index37 = 0; index37 < Config.SanXiu4NumMin; index37++) {
                                if (new Random().nextInt(100) <= Config.SanXiu4Odds) {
                                    if (!world.field_72995_K && (entityCustom15 = new EntitySanXiu04.EntityCustom(world)) != null) {
                                        entityCustom15.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom15);
                                    }
                                } else if (!world.field_72995_K && (entityCustom14 = new EntitySanXiu0402.EntityCustom(world)) != null) {
                                    entityCustom14.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom14);
                                }
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index38 = 0; index38 < Config.MoXiu4NumMax; index38++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.MoXiu4Odds) {
                        if (!world.field_72995_K && (entityCustom12 = new EntityMoXiu04.EntityCustom(world)) != null) {
                            entityCustom12.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom12);
                        }
                    } else if (new Random().nextInt(100) <= Config.MoXiu4Odds && !world.field_72995_K && (entityCustom9 = new EntityMoXiu0402.EntityCustom(world)) != null) {
                        entityCustom9.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom9);
                    }
                    if (CheckNum >= Config.MoXiu4NumMax - 1) {
                        if (Config.MoXiu4NumMin > 0) {
                            for (int index39 = 0; index39 < Config.MoXiu4NumMin; index39++) {
                                if (new Random().nextInt(100) <= Config.MoXiu4Odds) {
                                    if (!world.field_72995_K && (entityCustom11 = new EntityMoXiu04.EntityCustom(world)) != null) {
                                        entityCustom11.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom11);
                                    }
                                } else if (!world.field_72995_K && (entityCustom10 = new EntityMoXiu0402.EntityCustom(world)) != null) {
                                    entityCustom10.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom10);
                                }
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index40 = 0; index40 < Config.SanXiu5NumMax; index40++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.SanXiu5Odds) {
                        if (!world.field_72995_K && (entityCustom8 = new EntitySanXiu05.EntityCustom(world)) != null) {
                            entityCustom8.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom8);
                        }
                    } else if (new Random().nextInt(100) <= Config.SanXiu5Odds && !world.field_72995_K && (entityCustom5 = new EntitySanXiu0502.EntityCustom(world)) != null) {
                        entityCustom5.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom5);
                    }
                    if (CheckNum >= Config.SanXiu5NumMax - 1) {
                        if (Config.SanXiu5NumMin > 0) {
                            for (int index41 = 0; index41 < Config.SanXiu5NumMin; index41++) {
                                if (new Random().nextInt(100) <= Config.SanXiu5Odds) {
                                    if (!world.field_72995_K && (entityCustom7 = new EntitySanXiu05.EntityCustom(world)) != null) {
                                        entityCustom7.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom7);
                                    }
                                } else if (!world.field_72995_K && (entityCustom6 = new EntitySanXiu0502.EntityCustom(world)) != null) {
                                    entityCustom6.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom6);
                                }
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index42 = 0; index42 < Config.MoXiu5NumMax; index42++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.MoXiu5Odds) {
                        if (!world.field_72995_K && (entityCustom4 = new EntityMoXiu05.EntityCustom(world)) != null) {
                            entityCustom4.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom4);
                        }
                    } else if (new Random().nextInt(100) <= Config.MoXiu5Odds && !world.field_72995_K && (entityCustom = new EntityMoXiu0502.EntityCustom(world)) != null) {
                        entityCustom.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom);
                    }
                    if (CheckNum >= Config.MoXiu5NumMax - 1) {
                        if (Config.MoXiu5NumMin > 0) {
                            for (int index43 = 0; index43 < Config.MoXiu5NumMin; index43++) {
                                if (new Random().nextInt(100) <= Config.MoXiu5Odds) {
                                    if (!world.field_72995_K && (entityCustom3 = new EntityMoXiu05.EntityCustom(world)) != null) {
                                        entityCustom3.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom3);
                                    }
                                } else if (!world.field_72995_K && (entityCustom2 = new EntityMoXiu0502.EntityCustom(world)) != null) {
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
}
