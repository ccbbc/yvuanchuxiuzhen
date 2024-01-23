package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedurePlayerMoveWorld.class */
public class ProcedurePlayerMoveWorld extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayerMoveWorld(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 393);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerMoveWorld$1] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerMoveWorld$2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerMoveWorld$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
            if (entityLivingBase instanceof EntityPlayer) {
                Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("血量回复");
                if (_so == null) {
                    _so = _sc.func_96535_a("血量回复", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                _scr.func_96647_c((int) (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f));
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerMoveWorld.1
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so2 = (_sc2 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("移动维度") == 0) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureSaveAttribute.executeProcedure($_dependencies);
                if (entityLivingBase instanceof EntityPlayer) {
                    Scoreboard _sc2 = ((EntityPlayer) entityLivingBase).func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("移动维度");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("移动维度", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c(1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerMoveWorld.2
                public int getScore(String score) {
                    Scoreboard _sc3;
                    ScoreObjective _so3;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so3 = (_sc3 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr3 = _sc3.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so3);
                        return _scr3.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("移动维度") == 1 && (entityLivingBase instanceof EntityPlayer)) {
                Scoreboard _sc3 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("移动维度");
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("移动维度", ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so3);
                _scr3.func_96647_c(2);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerMoveWorld.3
                public int getScore(String score) {
                    Scoreboard _sc4;
                    ScoreObjective _so4;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so4 = (_sc4 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr4 = _sc4.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so4);
                        return _scr4.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("已重伤") == 1 && (entityLivingBase instanceof EntityPlayer)) {
                Scoreboard _sc4 = ((EntityPlayer) entityLivingBase).func_96123_co();
                ScoreObjective _so4 = _sc4.func_96518_b("已重伤");
                if (_so4 == null) {
                    _so4 = _sc4.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
                }
                Score _scr4 = _sc4.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so4);
                _scr4.func_96647_c(2);
            }
        }
    }

    @SubscribeEvent
    public void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
        int dimension = event.getDimension();
        Entity entity = event.getEntity();
        Object world = entity.field_70170_p;
        int i = (int) entity.field_70165_t;
        int j = (int) entity.field_70163_u;
        int k = (int) entity.field_70161_v;
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("dimension", Integer.valueOf(dimension));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
