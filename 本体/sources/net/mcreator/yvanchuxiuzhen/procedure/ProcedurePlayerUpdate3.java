package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedurePlayerUpdate3.class */
public class ProcedurePlayerUpdate3 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayerUpdate3(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 355);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerUpdate3$1] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerUpdate3$3] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerUpdate3$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("XiaoJingJieNumTemp") != entityLivingBase.getEntityData().func_74769_h("XiaoJingJieNum")) {
            $_dependencies.put("entity", entityLivingBase);
            ProcedureJingJieGaiLv.executeProcedure($_dependencies);
            entityLivingBase.getEntityData().func_74780_a("XiaoJingJieNumTemp", entityLivingBase.getEntityData().func_74769_h("XiaoJingJieNum"));
        }
        entityLivingBase.getEntityData().func_74778_a("境界突破总概率", new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("TuPoGaiLv") * 100.0d) + "%§a+" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("境界突破附加概率") * 100.0d) + "%§5+" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("功法概率增加") * 100.0d) + "%");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerUpdate3.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("JingJieUpdate") == 0) {
            entityLivingBase.getEntityData().func_74780_a("玩家属性更新计时", entityLivingBase.getEntityData().func_74769_h("玩家属性更新计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("玩家属性更新计时") >= 20.0d) {
                entityLivingBase.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a((float) entityLivingBase.getEntityData().func_74769_h("HealthMax"));
                entityLivingBase.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a((float) (entityLivingBase.getEntityData().func_74769_h("Attack") + entityLivingBase.getEntityData().func_74769_h("ShaQiAdd")));
                entityLivingBase.getEntityData().func_74780_a("玩家属性更新计时", 0.0d);
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerUpdate3.2
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("移动维度") == 2) {
            entityLivingBase.getEntityData().func_74780_a("属性返回计时", entityLivingBase.getEntityData().func_74769_h("属性返回计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("属性返回计时") >= 20.0d) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureSaveAttribute.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74780_a("属性返回计时", 0.0d);
                entityLivingBase.getEntityData().func_74757_a("血量回复", true);
                if (entityLivingBase instanceof EntityPlayer) {
                    Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("移动维度");
                    if (_so == null) {
                        _so = _sc.func_96535_a("移动维度", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                    _scr.func_96647_c(1);
                }
            }
        } else {
            entityLivingBase.getEntityData().func_74780_a("属性返回计时", 0.0d);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerUpdate3.3
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityLivingBase instanceof EntityPlayer) && (_so2 = (_sc2 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore("LingQiFly") == 1 && !entityLivingBase.getEntityData().func_74767_n("LingQiFly")) {
            entityLivingBase.getEntityData().func_74757_a("LingQiFly", true);
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc2 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("LingQiFly");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("LingQiFly", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so2);
                _scr2.func_96647_c(0);
            }
        }
        if (entityLivingBase.getEntityData().func_74767_n("重生无敌")) {
            entityLivingBase.getEntityData().func_74780_a("重生无敌计时", entityLivingBase.getEntityData().func_74769_h("重生无敌计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("重生无敌计时") >= 60.0d) {
                entityLivingBase.getEntityData().func_74757_a("重生无敌", false);
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).field_71075_bZ.field_75102_a = entityLivingBase.getEntityData().func_74767_n("重生无敌");
                    ((EntityPlayer) entityLivingBase).func_71016_p();
                }
            }
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
