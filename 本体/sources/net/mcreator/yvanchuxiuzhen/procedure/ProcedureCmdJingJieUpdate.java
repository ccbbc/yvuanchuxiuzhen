package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureCmdJingJieUpdate.class */
public class ProcedureCmdJingJieUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCmdJingJieUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 319);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureCmdJingJieUpdate$1] */
    /* JADX WARN: Type inference failed for: r1v10, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureCmdJingJieUpdate$3] */
    /* JADX WARN: Type inference failed for: r1v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureCmdJingJieUpdate$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74767_n("TuPoLimit") && (entityPlayer instanceof EntityPlayer)) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("JingJieUpdate");
            if (_so == null) {
                _so = _sc.func_96535_a("JingJieUpdate", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(0);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureCmdJingJieUpdate.1
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore("JingJieUpdate") > 0) {
            entityPlayer.getEntityData().func_74780_a("JingJieUpdateNum", entityPlayer.getEntityData().func_74769_h("JingJieUpdateNum") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("JingJieUpdateNum") >= 5.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") < new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureCmdJingJieUpdate.2
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("JingJieUpdate")) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieName.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74780_a("境界提升属性更新计时", 0.0d);
                entityPlayer.getEntityData().func_74780_a("JingJieUpdateNum", 0.0d);
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureCmdJingJieUpdate.3
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("JingJieUpdate")) {
                entityPlayer.getEntityData().func_74780_a("境界提升属性更新计时", 0.0d);
                entityPlayer.getEntityData().func_74780_a("JingJieUpdateNum", 0.0d);
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc2 = entityPlayer.func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("JingJieUpdate");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("JingJieUpdate", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c(0);
                }
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("PowerMax"));
                entityPlayer.getEntityData().func_74780_a("JingJieLevelUpNum", 0.0d);
                entityPlayer.getEntityData().func_74780_a("Base", 0.0d);
                entityPlayer.getEntityData().func_74757_a("境界提升属性更新", true);
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureCmdJingJieUpdate.4
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return entityPlayer.field_70170_p;
                        }

                        public MinecraftServer func_184102_h() {
                            return entityPlayer.field_70170_p.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return entityPlayer.func_180425_c();
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                        }

                        public Entity func_174793_f() {
                            return entityPlayer;
                        }
                    }, "title @s title {\"text\":\"§6§l境界突破\"}");
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
