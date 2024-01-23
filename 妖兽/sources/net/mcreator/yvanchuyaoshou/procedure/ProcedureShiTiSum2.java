package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity04;
import net.mcreator.yvanchuyaoshou.entity.EntityYuWa;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiTiSum2.class */
public class ProcedureShiTiSum2 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiTiSum2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 343);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum2$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityCaientity04.EntityCustom entityCustom;
        EntityCaientity04.EntityCustom entityCustom2;
        EntityYuWa2.EntityCustom entityCustom3;
        EntityYuWa2.EntityCustom entityCustom4;
        EntityYuWa.EntityCustom entityCustom5;
        EntityYuWa.EntityCustom entityCustom6;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        int CheckNum = 0;
        if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureShiTiSum2.1
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
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuxiuzhenfulu:shengtai16")) && entity.getEntityData().func_74767_n("实体生成处露天")) {
            for (int index0 = 0; index0 < Config.YuWaNumMax; index0++) {
                if (new Random().nextInt(100) <= Config.YuWaOdds) {
                    CheckNum++;
                    if (!world.field_72995_K && (entityCustom6 = new EntityYuWa.EntityCustom(world)) != null) {
                        entityCustom6.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom6);
                    }
                }
                if (CheckNum >= Config.YuWaNumMax - 1) {
                    if (Config.YuWaNumMin > 0) {
                        for (int index1 = 0; index1 < Config.YuWaNumMin; index1++) {
                            if (!world.field_72995_K && (entityCustom5 = new EntityYuWa.EntityCustom(world)) != null) {
                                entityCustom5.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom5);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            for (int index2 = 0; index2 < Config.YuWa2NumMax; index2++) {
                CheckNum++;
                if (new Random().nextInt(100) <= Config.YuWa2Odds && !world.field_72995_K && (entityCustom4 = new EntityYuWa2.EntityCustom(world)) != null) {
                    entityCustom4.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom4);
                }
                if (CheckNum >= Config.YuWa2NumMax - 1) {
                    if (Config.YuWa2NumMin > 0) {
                        for (int index3 = 0; index3 < Config.YuWa2NumMin; index3++) {
                            if (!world.field_72995_K && (entityCustom3 = new EntityYuWa2.EntityCustom(world)) != null) {
                                entityCustom3.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                                world.func_72838_d(entityCustom3);
                            }
                        }
                    }
                    CheckNum = 0;
                }
            }
            if (entity.getEntityData().func_74769_h("生成坐标Y") <= 80.0d) {
                for (int index4 = 0; index4 < Config.PuNiaoNumMax; index4++) {
                    CheckNum++;
                    if (new Random().nextInt(100) <= Config.PuNiaoOdds && !world.field_72995_K && (entityCustom2 = new EntityCaientity04.EntityCustom(world)) != null) {
                        entityCustom2.func_70012_b(entity.getEntityData().func_74769_h("生成坐标X"), entity.getEntityData().func_74769_h("生成坐标Y"), entity.getEntityData().func_74769_h("生成坐标Z"), world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                        world.func_72838_d(entityCustom2);
                    }
                    if (CheckNum >= Config.PuNiaoNumMax - 1) {
                        if (Config.PuNiaoNumMin > 0) {
                            for (int index5 = 0; index5 < Config.PuNiaoNumMin; index5++) {
                                if (!world.field_72995_K && (entityCustom = new EntityCaientity04.EntityCustom(world)) != null) {
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
