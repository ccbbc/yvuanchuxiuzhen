package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureAttributeBack.class */
public class ProcedureAttributeBack extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureAttributeBack(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 297);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("死亡") > 0 && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.2
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("ShouYuan") > 0) {
                entity.getEntityData().func_74780_a("HealthMax", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.3
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("HealthMax"));
                entity.getEntityData().func_74780_a("GongFa", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.4
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("GongFa"));
                entity.getEntityData().func_74780_a("GongFaShow", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.5
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("GongFaShow"));
                entity.getEntityData().func_74780_a("Attack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.6
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("Attack"));
                entity.getEntityData().func_74780_a("MagicAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.7
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("MagicAttack"));
                entity.getEntityData().func_74780_a("ThunderAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.8
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ThunderAttack"));
                entity.getEntityData().func_74780_a("FireAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.9
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("FireAttack"));
                entity.getEntityData().func_74780_a("PoisonAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.10
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("PoisonAttack"));
                entity.getEntityData().func_74780_a("ShaQi", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.11
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ShaQi"));
                entity.getEntityData().func_74780_a("Defense", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.12
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("Defense"));
                entity.getEntityData().func_74780_a("MagicDefense", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.13
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("MagicDefense"));
                entity.getEntityData().func_74780_a("ThunderDefense", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.14
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ThunderDefense"));
                entity.getEntityData().func_74780_a("FireDefense", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.15
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ThunderDefense"));
                entity.getEntityData().func_74780_a("PosionDefense", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.16
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("PosionDefense"));
                entity.getEntityData().func_74780_a("DaoLing", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.17
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("DaoLing"));
                entity.getEntityData().func_74780_a("ShouYuan", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.18
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ShouYuan"));
                entity.getEntityData().func_74780_a("Base", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.19
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("Base"));
                entity.getEntityData().func_74780_a("BaseMax", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.20
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("BaseMax"));
                entity.getEntityData().func_74780_a("Power", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.21
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("Power"));
                entity.getEntityData().func_74780_a("PowerReply", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.22
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("PowerReply"));
                entity.getEntityData().func_74780_a("PowerMax", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.23
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("PowerMax"));
                entity.getEntityData().func_74780_a("JingJieNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.24
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("JingJieNum"));
                entity.getEntityData().func_74780_a("XiaoJingJieNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.25
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.26
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("XiaoJingJieNumS"));
                entity.getEntityData().func_74780_a("LayerNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.27
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LayerNum"));
                entity.getEntityData().func_74780_a("LingGenNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.28
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LingGenNum"));
                entity.getEntityData().func_74780_a("TiZhiNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.29
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("TiZhiNum"));
                entity.getEntityData().func_74780_a("LianQi", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.30
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LianQi"));
                entity.getEntityData().func_74780_a("LianQiXp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.31
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LianQiXp"));
                entity.getEntityData().func_74780_a("LianDan", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.32
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LianDan"));
                entity.getEntityData().func_74780_a("LianDanXp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.33
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LianDanXp"));
                entity.getEntityData().func_74780_a("FuLu", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.34
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("FuLu"));
                entity.getEntityData().func_74780_a("FuLuXp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.35
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("FuLuXp"));
                entity.getEntityData().func_74780_a("ZhiLi", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.36
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ZhiLi"));
                entity.getEntityData().func_74780_a("ZhiLiXp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.37
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ZhiLiXp"));
                entity.getEntityData().func_74780_a("突破失败增加概率", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.38
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("突破失败增加概率"));
                entity.getEntityData().func_74780_a("境界突破附加概率", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.39
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("境界突破附加概率"));
                entity.getEntityData().func_74780_a("功法增加概率", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.40
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("功法增加概率"));
                entity.getEntityData().func_74780_a("TuPoGaiLv", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.41
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("TuPoGaiLv"));
                entity.getEntityData().func_74780_a("ZhenFa", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.42
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ZhenFa"));
                entity.getEntityData().func_74780_a("ZhenFaXp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.43
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ZhenFaXp"));
                entity.getEntityData().func_74780_a("SouXun", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.44
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("SouXun"));
                entity.getEntityData().func_74780_a("SouXunXp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.45
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("SouXunXp"));
                entity.getEntityData().func_74780_a("ShaQiAddMax", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.46
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ShaQiAddMax"));
                entity.getEntityData().func_74780_a("YuanCi", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.47
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("YuanCi"));
                entity.getEntityData().func_74780_a("ShenShi", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.48
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ShenShi"));
                entity.getEntityData().func_74780_a("XingShang", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.49
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("XingShang"));
                entity.getEntityData().func_74780_a("XingShangXp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.50
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("XingShangXp"));
                entity.getEntityData().func_74780_a("JingPaiYuan", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.51
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("JingPaiYuan"));
                entity.getEntityData().func_74780_a("DanYaoBreach1", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.52
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("DanYaoBreach1"));
                entity.getEntityData().func_74780_a("DanYaoBreach2", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.53
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("DanYaoBreach2"));
                entity.getEntityData().func_74780_a("DanYaoBreach3", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.54
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("DanYaoBreach3"));
                entity.getEntityData().func_74757_a("YuanShenUp", false);
                entity.getEntityData().func_74757_a("YuanYingUp", false);
                entity.getEntityData().func_74778_a("LingGen", "");
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.55
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("JinLingGen") == 1) {
                    entity.getEntityData().func_74757_a("JinLingGen", true);
                    if (entity instanceof EntityPlayer) {
                        Scoreboard _sc = ((EntityPlayer) entity).func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("JinLingGen");
                        if (_so == null) {
                            _so = _sc.func_96535_a("JinLingGen", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so);
                        _scr.func_96647_c(0);
                    }
                    entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "金");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.56
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entity instanceof EntityPlayer) && (_so2 = (_sc2 = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entity.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("MuLingGen") == 1) {
                    entity.getEntityData().func_74757_a("MuLingGen", true);
                    if (entity instanceof EntityPlayer) {
                        Scoreboard _sc2 = ((EntityPlayer) entity).func_96123_co();
                        ScoreObjective _so2 = _sc2.func_96518_b("MuLingGen");
                        if (_so2 == null) {
                            _so2 = _sc2.func_96535_a("MuLingGen", ScoreCriteria.field_96641_b);
                        }
                        Score _scr2 = _sc2.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so2);
                        _scr2.func_96647_c(0);
                    }
                    entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "木");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.57
                    public int getScore(String score) {
                        Scoreboard _sc3;
                        ScoreObjective _so3;
                        if ((entity instanceof EntityPlayer) && (_so3 = (_sc3 = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr3 = _sc3.func_96529_a(entity.func_146103_bH().getName(), _so3);
                            return _scr3.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ShuiLingGen") == 1) {
                    entity.getEntityData().func_74757_a("ShuiLingGen", true);
                    if (entity instanceof EntityPlayer) {
                        Scoreboard _sc3 = ((EntityPlayer) entity).func_96123_co();
                        ScoreObjective _so3 = _sc3.func_96518_b("ShuiLingGen");
                        if (_so3 == null) {
                            _so3 = _sc3.func_96535_a("ShuiLingGen", ScoreCriteria.field_96641_b);
                        }
                        Score _scr3 = _sc3.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so3);
                        _scr3.func_96647_c(0);
                    }
                    entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "水");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.58
                    public int getScore(String score) {
                        Scoreboard _sc4;
                        ScoreObjective _so4;
                        if ((entity instanceof EntityPlayer) && (_so4 = (_sc4 = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr4 = _sc4.func_96529_a(entity.func_146103_bH().getName(), _so4);
                            return _scr4.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("HuoLingGen") == 1) {
                    entity.getEntityData().func_74757_a("HuoLingGen", true);
                    if (entity instanceof EntityPlayer) {
                        Scoreboard _sc4 = ((EntityPlayer) entity).func_96123_co();
                        ScoreObjective _so4 = _sc4.func_96518_b("HuoLingGen");
                        if (_so4 == null) {
                            _so4 = _sc4.func_96535_a("HuoLingGen", ScoreCriteria.field_96641_b);
                        }
                        Score _scr4 = _sc4.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so4);
                        _scr4.func_96647_c(0);
                    }
                    entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "火");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.59
                    public int getScore(String score) {
                        Scoreboard _sc5;
                        ScoreObjective _so5;
                        if ((entity instanceof EntityPlayer) && (_so5 = (_sc5 = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr5 = _sc5.func_96529_a(entity.func_146103_bH().getName(), _so5);
                            return _scr5.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("TuLingGen") == 1) {
                    entity.getEntityData().func_74757_a("TuLingGen", true);
                    if (entity instanceof EntityPlayer) {
                        Scoreboard _sc5 = ((EntityPlayer) entity).func_96123_co();
                        ScoreObjective _so5 = _sc5.func_96518_b("TuLingGen");
                        if (_so5 == null) {
                            _so5 = _sc5.func_96535_a("TuLingGen", ScoreCriteria.field_96641_b);
                        }
                        Score _scr5 = _sc5.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so5);
                        _scr5.func_96647_c(0);
                    }
                    entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "土");
                }
                $_dependencies.put("entity", entity);
                ProcedureAttributeBack2.executeProcedure($_dependencies);
                entity.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
                for (int index0 = 0; index0 < 30; index0++) {
                    entity.getEntityData().func_74780_a("功法顺序暂存", entity.getEntityData().func_74769_h("功法顺序暂存") + 1.0d);
                    entity.getEntityData().func_74778_a("功法名暂存", "GongFa" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
                    entity.getEntityData().func_74778_a("酿酒名暂存", "NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")));
                    entity.getEntityData().func_74778_a("功法熟练度名暂存", "GongFa" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("功法顺序暂存")) + "熟练度");
                    entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("功法名暂存"), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.60
                        public int getScore(String score) {
                            Scoreboard _sc6;
                            ScoreObjective _so6;
                            if ((entity instanceof EntityPlayer) && (_so6 = (_sc6 = entity.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr6 = _sc6.func_96529_a(entity.func_146103_bH().getName(), _so6);
                                return _scr6.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore(entity.getEntityData().func_74779_i("功法名暂存")));
                    entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("功法熟练度名暂存"), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.61
                        public int getScore(String score) {
                            Scoreboard _sc6;
                            ScoreObjective _so6;
                            if ((entity instanceof EntityPlayer) && (_so6 = (_sc6 = entity.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr6 = _sc6.func_96529_a(entity.func_146103_bH().getName(), _so6);
                                return _scr6.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore(entity.getEntityData().func_74779_i("功法熟练度名暂存")));
                    entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("酿酒名暂存"), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.62
                        public int getScore(String score) {
                            Scoreboard _sc6;
                            ScoreObjective _so6;
                            if ((entity instanceof EntityPlayer) && (_so6 = (_sc6 = entity.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr6 = _sc6.func_96529_a(entity.func_146103_bH().getName(), _so6);
                                return _scr6.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore(entity.getEntityData().func_74779_i("酿酒名暂存")));
                }
                entity.getEntityData().func_74780_a("无极培元Buff顺序", 0.0d);
                for (int index1 = 0; index1 < 13; index1++) {
                    entity.getEntityData().func_74780_a("无极培元Buff顺序", entity.getEntityData().func_74769_h("无极培元Buff顺序") + 1.0d);
                    entity.getEntityData().func_74778_a("无极培元Buff", "GongFa" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("无极培元Buff顺序")));
                    entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("无极培元Buff"), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.63
                        public int getScore(String score) {
                            Scoreboard _sc6;
                            ScoreObjective _so6;
                            if ((entity instanceof EntityPlayer) && (_so6 = (_sc6 = entity.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr6 = _sc6.func_96529_a(entity.func_146103_bH().getName(), _so6);
                                return _scr6.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore(entity.getEntityData().func_74779_i("无极培元Buff")));
                }
                entity.getEntityData().func_74780_a("无极培元Buff顺序", 0.0d);
                entity.getEntityData().func_74780_a("功法顺序暂存", 0.0d);
                $_dependencies.put("entity", entity);
                ProcedureGongFaXianShiDuQu.executeProcedure($_dependencies);
                entity.getEntityData().func_74780_a("LingYuZhi", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.64
                    public int getScore(String score) {
                        Scoreboard _sc6;
                        ScoreObjective _so6;
                        if ((entity instanceof EntityPlayer) && (_so6 = (_sc6 = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr6 = _sc6.func_96529_a(entity.func_146103_bH().getName(), _so6);
                            return _scr6.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("LingYuZhi"));
                entity.getEntityData().func_74780_a("灵裕值增加计时", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.65
                    public int getScore(String score) {
                        Scoreboard _sc6;
                        ScoreObjective _so6;
                        if ((entity instanceof EntityPlayer) && (_so6 = (_sc6 = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr6 = _sc6.func_96529_a(entity.func_146103_bH().getName(), _so6);
                            return _scr6.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("灵裕值增加计时"));
                if (entity instanceof EntityPlayer) {
                    Scoreboard _sc6 = ((EntityPlayer) entity).func_96123_co();
                    ScoreObjective _so6 = _sc6.func_96518_b("死亡");
                    if (_so6 == null) {
                        _so6 = _sc6.func_96535_a("死亡", ScoreCriteria.field_96641_b);
                    }
                    Score _scr6 = _sc6.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so6);
                    _scr6.func_96647_c(0);
                }
                $_dependencies.put("entity", entity);
                ProcedureJingJieGaiLv.executeProcedure($_dependencies);
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.66
                public int getScore(String score) {
                    Scoreboard _sc7;
                    ScoreObjective _so7;
                    if ((entity instanceof EntityPlayer) && (_so7 = (_sc7 = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr7 = _sc7.func_96529_a(entity.func_146103_bH().getName(), _so7);
                        return _scr7.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("死亡") == 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.67
                public int getScore(String score) {
                    Scoreboard _sc7;
                    ScoreObjective _so7;
                    if ((entity instanceof EntityPlayer) && (_so7 = (_sc7 = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr7 = _sc7.func_96529_a(entity.func_146103_bH().getName(), _so7);
                        return _scr7.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("ShouYuan") <= 0) {
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureBanPlay.executeProcedure($_dependencies);
                if (entity instanceof EntityPlayer) {
                    Scoreboard _sc7 = ((EntityPlayer) entity).func_96123_co();
                    ScoreObjective _so7 = _sc7.func_96518_b("死亡");
                    if (_so7 == null) {
                        _so7 = _sc7.func_96535_a("死亡", ScoreCriteria.field_96641_b);
                    }
                    Score _scr7 = _sc7.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so7);
                    _scr7.func_96647_c(0);
                }
                entity.getEntityData().func_74757_a("DataReset", true);
                if (entity instanceof EntityPlayer) {
                    Scoreboard _sc8 = ((EntityPlayer) entity).func_96123_co();
                    ScoreObjective _so8 = _sc8.func_96518_b("已重伤");
                    if (_so8 == null) {
                        _so8 = _sc8.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
                    }
                    Score _scr8 = _sc8.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so8);
                    _scr8.func_96647_c(0);
                }
                entity.getEntityData().func_74780_a("酿酒重置计数", 0.0d);
                for (int index2 = 0; index2 < 30; index2++) {
                    entity.getEntityData().func_74780_a("酿酒重置计数", entity.getEntityData().func_74769_h("酿酒重置计数") + 1.0d);
                    if (entity instanceof EntityPlayer) {
                        Scoreboard _sc9 = ((EntityPlayer) entity).func_96123_co();
                        ScoreObjective _so9 = _sc9.func_96518_b("NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("酿酒重置计数")));
                        if (_so9 == null) {
                            _so9 = _sc9.func_96535_a("NiangJiu" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("酿酒重置计数")), ScoreCriteria.field_96641_b);
                        }
                        Score _scr9 = _sc9.func_96529_a(((EntityPlayer) entity).func_146103_bH().getName(), _so9);
                        _scr9.func_96647_c(0);
                    }
                }
                $_dependencies.put("entity", entity);
                ProcedureDanYaoReset.executeProcedure($_dependencies);
            }
            entity.getEntityData().func_74757_a("重生无敌", true);
            if (entity instanceof EntityPlayer) {
                ((EntityPlayer) entity).field_71075_bZ.field_75102_a = entity.getEntityData().func_74767_n("重生无敌");
                ((EntityPlayer) entity).func_71016_p();
            }
            entity.getEntityData().func_74780_a("重生无敌计时", 0.0d);
            entity.getEntityData().func_74780_a("属性返回计时", 0.0d);
            entity.getEntityData().func_74757_a("TuPoLimit", false);
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeBack.68
                public int getScore(String score) {
                    Scoreboard _sc10;
                    ScoreObjective _so10;
                    if ((entity instanceof EntityPlayer) && (_so10 = (_sc10 = entity.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr10 = _sc10.func_96529_a(entity.func_146103_bH().getName(), _so10);
                        return _scr10.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("JingJieNum") == 0) {
                entity.getEntityData().func_74778_a("境界突破总概率", "100");
            }
        }, 100L, TimeUnit.MILLISECONDS);
    }

    @SubscribeEvent
    public void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
        EntityPlayer entityPlayer = event.player;
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf((int) ((Entity) entityPlayer).field_70165_t));
        dependencies.put("y", Integer.valueOf((int) ((Entity) entityPlayer).field_70163_u));
        dependencies.put("z", Integer.valueOf((int) ((Entity) entityPlayer).field_70161_v));
        dependencies.put("world", ((Entity) entityPlayer).field_70170_p);
        dependencies.put("entity", entityPlayer);
        dependencies.put("endconquered", Boolean.valueOf(event.isEndConquered()));
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
