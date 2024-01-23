package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionSanXianBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionSectBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSxlAndSectPlayerUpdate.class */
public class ProcedureSxlAndSectPlayerUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSxlAndSectPlayerUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 506);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate$5] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate$2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate$1] */
    /* JADX WARN: Type inference failed for: r1v36, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate$4] */
    /* JADX WARN: Type inference failed for: r3v6, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.getEntityData().func_74779_i("SxlGuiTip").equals("")) {
            entityLivingBase.getEntityData().func_74780_a("SxlTime1", entityLivingBase.getEntityData().func_74769_h("SxlTime1") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("SxlTime1") >= 20.0d) {
                entityLivingBase.getEntityData().func_74778_a("SxlGuiTip", "");
                entityLivingBase.getEntityData().func_74780_a("SxlTime1", 0.0d);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("SectJobUn") != 1) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate.2
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("状态恢复值") > 0) {
                entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate.3
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("状态恢复值"));
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70691_i(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate.4
                        public int getScore(String score) {
                            Scoreboard _sc;
                            ScoreObjective _so;
                            if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                                return _scr.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("状态恢复值"));
                }
                if (entityLivingBase instanceof EntityPlayer) {
                    Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("状态恢复值");
                    if (_so == null) {
                        _so = _sc.func_96535_a("状态恢复值", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                    _scr.func_96647_c(0);
                }
            }
            entityLivingBase.getEntityData().func_74780_a("SxlTime", entityLivingBase.getEntityData().func_74769_h("SxlTime") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("SxlTime") >= 20.0d) {
                if (entityLivingBase.getEntityData().func_74769_h("SanXianLingLevel") >= 1.0d && !entityLivingBase.func_70644_a(PotionSanXianBuff.potion)) {
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70690_d(new PotionEffect(PotionSanXianBuff.potion, 114514, 0, false, true));
                    }
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_184589_d(PotionSectBuff.potion);
                    }
                } else if (entityLivingBase.getEntityData().func_74769_h("SectLevel") >= 1.0d && !entityLivingBase.func_70644_a(PotionSectBuff.potion)) {
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70690_d(new PotionEffect(PotionSectBuff.potion, 114514, 0, false, true));
                    }
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_184589_d(PotionSanXianBuff.potion);
                    }
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSxlAndSectPlayerUpdate.5
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityLivingBase instanceof EntityPlayer) && (_so2 = (_sc2 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore("SectJobUn") == 1 && !entityLivingBase.getEntityData().func_74767_n("卸任消息")) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§c§l你已被宗门卸任"), false);
            }
            entityLivingBase.getEntityData().func_74757_a("卸任消息", true);
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
