package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity02;
import net.mcreator.yvanchuyaoshou.entity.EntityHeiZhu;
import net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou02;
import net.mcreator.yvanchuyaoshou.entity.EntityJiHunXie02;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi02;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi03;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu02;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0202;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu03;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0302;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu02;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0202;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu03;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0302;
import net.mcreator.yvanchuyaoshou.entity.EntityShouGuanYinBing02;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao02;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao03;
import net.mcreator.yvanchuyaoshou.entity.EntityYuWa2;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSum4.class */
public class ProcedureShiTiSum4 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSum4(ElementsYvanchuyaoshouMod instance) {
        super(instance, 345);
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum4$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        EntitySanXiu0302.EntityCustom entityCustom;
        EntitySanXiu0302.EntityCustom entityCustom2;
        EntitySanXiu03.EntityCustom entityCustom3;
        EntitySanXiu03.EntityCustom entityCustom4;
        EntityMoXiu0302.EntityCustom entityCustom5;
        EntityMoXiu0302.EntityCustom entityCustom6;
        EntityMoXiu03.EntityCustom entityCustom7;
        EntityCaientity02.EntityCustom entityCustom8;
        EntitySanXiu0202.EntityCustom entityCustom9;
        EntitySanXiu0202.EntityCustom entityCustom10;
        EntitySanXiu02.EntityCustom entityCustom11;
        EntitySanXiu02.EntityCustom entityCustom12;
        EntityMoXiu0202.EntityCustom entityCustom13;
        EntityMoXiu0202.EntityCustom entityCustom14;
        EntityMoXiu02.EntityCustom entityCustom15;
        EntityMoXiu02.EntityCustom entityCustom16;
        EntityJunEYi03.EntityCustom entityCustom17;
        EntityJunEYi03.EntityCustom entityCustom18;
        EntityYingXiao03.EntityCustom entityCustom19;
        EntityYingXiao03.EntityCustom entityCustom20;
        EntityYuWa2.EntityCustom entityCustom21;
        EntityYuWa2.EntityCustom entityCustom22;
        EntityJiHunXie02.EntityCustom entityCustom23;
        EntityJiHunXie02.EntityCustom entityCustom24;
        EntityHeiZhu.EntityCustom entityCustom25;
        EntityHeiZhu.EntityCustom entityCustom26;
        EntityHunTieShou02.EntityCustom entityCustom27;
        EntityHunTieShou02.EntityCustom entityCustom28;
        EntityJunEYi02.EntityCustom entityCustom29;
        EntityJunEYi02.EntityCustom entityCustom30;
        EntityYingXiao02.EntityCustom entityCustom31;
        EntityYingXiao02.EntityCustom entityCustom32;
        EntityShouGuanYinBing02.EntityCustom entityCustom33;
        EntityShouGuanYinBing02.EntityCustom entityCustom34;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        int CheckNum = 0;
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("hell"))) {
            for (int index0 = 0; index0 < Config.ShouGuanYinBingNumMax; index0++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.ShouGuanYinBingOdds && !world.field_72995_K && (entityCustom34 = new EntityShouGuanYinBing02.EntityCustom(world)) != null) {
                    entityCustom34.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom34);
                }
                if (CheckNum >= Config.ShouGuanYinBingNumMax - 1) {
                    if (Config.ShouGuanYinBingNumMin > 0) {
                        for (int index1 = 0; index1 < Config.ShouGuanYinBingNumMin; index1++) {
                            if (!world.field_72995_K && (entityCustom33 = new EntityShouGuanYinBing02.EntityCustom(world)) != null) {
                                entityCustom33.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom33);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index2 = 0; index2 < Config.YingXiaoNumMax; index2++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.YingXiaoOdds && !world.field_72995_K && (entityCustom32 = new EntityYingXiao02.EntityCustom(world)) != null) {
                    entityCustom32.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom32);
                }
                if (CheckNum >= Config.YingXiaoNumMax - 1) {
                    if (Config.YingXiaoNumMin > 0) {
                        for (int index3 = 0; index3 < Config.YingXiaoNumMin; index3++) {
                            if (!world.field_72995_K && (entityCustom31 = new EntityYingXiao02.EntityCustom(world)) != null) {
                                entityCustom31.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom31);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index4 = 0; index4 < Config.JunEYiNumMax; index4++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.JunEYiOdds && !world.field_72995_K && (entityCustom30 = new EntityJunEYi02.EntityCustom(world)) != null) {
                    entityCustom30.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom30);
                }
                if (CheckNum >= Config.JunEYiNumMax - 1) {
                    if (Config.JunEYiNumMin > 0) {
                        for (int index5 = 0; index5 < Config.JunEYiNumMin; index5++) {
                            if (!world.field_72995_K && (entityCustom29 = new EntityJunEYi02.EntityCustom(world)) != null) {
                                entityCustom29.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom29);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index6 = 0; index6 < Config.HunTieShou2NumMax; index6++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.HunTieShou2Odds && !world.field_72995_K && (entityCustom28 = new EntityHunTieShou02.EntityCustom(world)) != null) {
                    entityCustom28.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom28);
                }
                if (CheckNum >= Config.HunTieShou2NumMax - 1) {
                    if (Config.HunTieShou2NumMin > 0) {
                        for (int index7 = 0; index7 < Config.HunTieShou2NumMin; index7++) {
                            if (!world.field_72995_K && (entityCustom27 = new EntityHunTieShou02.EntityCustom(world)) != null) {
                                entityCustom27.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom27);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index8 = 0; index8 < Config.HeiZhuNumMax; index8++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.HeiZhuOdds && !world.field_72995_K && (entityCustom26 = new EntityHeiZhu.EntityCustom(world)) != null) {
                    entityCustom26.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom26);
                }
                if (CheckNum >= Config.HeiZhuNumMax - 1) {
                    if (Config.HeiZhuNumMin > 0) {
                        for (int index9 = 0; index9 < Config.HeiZhuNumMin; index9++) {
                            if (!world.field_72995_K && (entityCustom25 = new EntityHeiZhu.EntityCustom(world)) != null) {
                                entityCustom25.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom25);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index10 = 0; index10 < Config.JiHunXie2NumMax; index10++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.JiHunXie2Odds && !world.field_72995_K && (entityCustom24 = new EntityJiHunXie02.EntityCustom(world)) != null) {
                    entityCustom24.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom24);
                }
                if (CheckNum >= Config.JiHunXie2NumMax - 1) {
                    if (Config.JiHunXie2NumMin > 0) {
                        for (int index11 = 0; index11 < Config.JiHunXie2NumMin; index11++) {
                            if (!world.field_72995_K && (entityCustom23 = new EntityJiHunXie02.EntityCustom(world)) != null) {
                                entityCustom23.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom23);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index12 = 0; index12 < Config.YuWa2NumMax; index12++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.YuWa2Odds && !world.field_72995_K && (entityCustom22 = new EntityYuWa2.EntityCustom(world)) != null) {
                    entityCustom22.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom22);
                }
                if (CheckNum >= Config.YuWa2NumMax - 1) {
                    if (Config.YuWa2NumMin > 0) {
                        for (int index13 = 0; index13 < Config.YuWa2NumMin; index13++) {
                            if (!world.field_72995_K && (entityCustom21 = new EntityYuWa2.EntityCustom(world)) != null) {
                                entityCustom21.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom21);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index14 = 0; index14 < Config.YingXiao2NumMax; index14++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.YingXiao2Odds && !world.field_72995_K && (entityCustom20 = new EntityYingXiao03.EntityCustom(world)) != null) {
                    entityCustom20.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom20);
                }
                if (CheckNum >= Config.YingXiao2NumMax - 1) {
                    if (Config.YingXiao2NumMin > 0) {
                        for (int index15 = 0; index15 < Config.YingXiao2NumMin; index15++) {
                            if (!world.field_72995_K && (entityCustom19 = new EntityYingXiao03.EntityCustom(world)) != null) {
                                entityCustom19.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom19);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index16 = 0; index16 < Config.JunEYi2NumMax; index16++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.JunEYi2Odds && !world.field_72995_K && (entityCustom18 = new EntityJunEYi03.EntityCustom(world)) != null) {
                    entityCustom18.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom18);
                }
                if (CheckNum >= Config.JunEYi2NumMax - 1) {
                    if (Config.JunEYi2NumMin > 0) {
                        for (int index17 = 0; index17 < Config.JunEYi2NumMin; index17++) {
                            if (!world.field_72995_K && (entityCustom17 = new EntityJunEYi03.EntityCustom(world)) != null) {
                                entityCustom17.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom17);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum4.1
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
                for (int index18 = 0; index18 < Config.MoXiu2NumMax; index18++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.MoXiu2Odds) {
                        if (!world.field_72995_K && (entityCustom16 = new EntityMoXiu02.EntityCustom(world)) != null) {
                            entityCustom16.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom16);
                        }
                    } else if (new Random().nextInt(100) <= Config.MoXiu2Odds && !world.field_72995_K && (entityCustom13 = new EntityMoXiu0202.EntityCustom(world)) != null) {
                        entityCustom13.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom13);
                    }
                    if (CheckNum >= Config.MoXiu2NumMax - 1) {
                        if (Config.MoXiu2NumMin > 0) {
                            for (int index19 = 0; index19 < Config.MoXiu2NumMin; index19++) {
                                if (new Random().nextInt(100) <= Config.MoXiu2Odds) {
                                    if (!world.field_72995_K && (entityCustom15 = new EntityMoXiu02.EntityCustom(world)) != null) {
                                        entityCustom15.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom15);
                                    }
                                } else if (!world.field_72995_K && (entityCustom14 = new EntityMoXiu0202.EntityCustom(world)) != null) {
                                    entityCustom14.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom14);
                                }
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index20 = 0; index20 < Config.SanXiu2NumMax; index20++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.SanXiu2Odds) {
                        if (!world.field_72995_K && (entityCustom12 = new EntitySanXiu02.EntityCustom(world)) != null) {
                            entityCustom12.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom12);
                        }
                    } else if (new Random().nextInt(100) <= Config.SanXiu2Odds && !world.field_72995_K && (entityCustom9 = new EntitySanXiu0202.EntityCustom(world)) != null) {
                        entityCustom9.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom9);
                    }
                    if (CheckNum >= Config.SanXiu2NumMax - 1) {
                        if (Config.SanXiu2NumMin > 0) {
                            for (int index21 = 0; index21 < Config.SanXiu2NumMin; index21++) {
                                if (new Random().nextInt(100) <= Config.SanXiu2Odds) {
                                    if (!world.field_72995_K && (entityCustom11 = new EntitySanXiu02.EntityCustom(world)) != null) {
                                        entityCustom11.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                        world.func_72838_d(entityCustom11);
                                    }
                                } else if (!world.field_72995_K && (entityCustom10 = new EntitySanXiu0202.EntityCustom(world)) != null) {
                                    entityCustom10.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom10);
                                }
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index22 = 0; index22 < Config.MoXiu3NumMax; index22++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.MoXiu3Odds) {
                        if (!world.field_72995_K && (entityCustom8 = new EntityCaientity02.EntityCustom(world)) != null) {
                            entityCustom8.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom8);
                        }
                    } else if (new Random().nextInt(100) <= Config.MoXiu3Odds && !world.field_72995_K && (entityCustom5 = new EntityMoXiu0302.EntityCustom(world)) != null) {
                        entityCustom5.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom5);
                    }
                    if (CheckNum >= Config.MoXiu3NumMax - 1 && Config.MoXiu3NumMin > 0) {
                        for (int index23 = 0; index23 < Config.MoXiu3NumMin; index23++) {
                            if (new Random().nextInt(100) <= Config.MoXiu3Odds) {
                                if (!world.field_72995_K && (entityCustom7 = new EntityMoXiu03.EntityCustom(world)) != null) {
                                    entityCustom7.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom7);
                                }
                            } else if (!world.field_72995_K && (entityCustom6 = new EntityMoXiu0302.EntityCustom(world)) != null) {
                                entityCustom6.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom6);
                            }
                        }
                        CheckNum = 0;
                    }
                }
                for (int index24 = 0; index24 < Config.SanXiu3NumMax; index24++) {
                    if (new Random().nextInt(100) <= Config.SanXiu3Odds) {
                        if (!world.field_72995_K && (entityCustom4 = new EntitySanXiu03.EntityCustom(world)) != null) {
                            entityCustom4.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                            world.func_72838_d(entityCustom4);
                        }
                    } else if (new Random().nextInt(100) <= Config.SanXiu3Odds && !world.field_72995_K && (entityCustom = new EntitySanXiu0302.EntityCustom(world)) != null) {
                        entityCustom.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom);
                    }
                    if (CheckNum >= Config.SanXiu3NumMax - 1 && Config.SanXiu3NumMin > 0) {
                        for (int index25 = 0; index25 < Config.SanXiu3NumMin; index25++) {
                            if (new Random().nextInt(100) <= Config.SanXiu3Odds) {
                                if (!world.field_72995_K && (entityCustom3 = new EntitySanXiu03.EntityCustom(world)) != null) {
                                    entityCustom3.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                    world.func_72838_d(entityCustom3);
                                }
                            } else if (!world.field_72995_K && (entityCustom2 = new EntitySanXiu0302.EntityCustom(world)) != null) {
                                entityCustom2.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom2);
                            }
                        }
                        CheckNum = 0;
                    }
                }
            }
        }
    }
}
