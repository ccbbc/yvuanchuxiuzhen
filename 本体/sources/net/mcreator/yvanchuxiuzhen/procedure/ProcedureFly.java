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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureFly.class */
public class ProcedureFly extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFly(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 323);
    }

    /* JADX WARN: Type inference failed for: r1v55, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureFly$2] */
    /* JADX WARN: Type inference failed for: r2v17, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureFly$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
            if (!entityPlayer.func_70003_b(4, "") || entityPlayer.getEntityData().func_74767_n("LingQiFly")) {
                if ((entityPlayer.getEntityData().func_74769_h("JingJieNum") > 2.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") <= 9.0d) || entityPlayer.getEntityData().func_74769_h("LayerNum") >= 500.0d) {
                    if (!entityPlayer.getEntityData().func_74767_n("Fly") && entityPlayer.getEntityData().func_74769_h("Power") >= 6.0d) {
                        if (entityPlayer instanceof EntityPlayer) {
                            entityPlayer.field_71075_bZ.field_75101_c = entityPlayer.getEntityData().func_74769_h("Power") >= 6.0d;
                            entityPlayer.func_71016_p();
                        }
                        entityPlayer.getEntityData().func_74757_a("Fly", true);
                    } else if (entityPlayer.getEntityData().func_74767_n("Fly") && entityPlayer.getEntityData().func_74769_h("Power") < 6.0d) {
                        if (entityPlayer instanceof EntityPlayer) {
                            entityPlayer.field_71075_bZ.field_75101_c = entityPlayer.getEntityData().func_74769_h("Power") >= 6.0d;
                            entityPlayer.func_71016_p();
                        }
                        if (entityPlayer instanceof EntityPlayer) {
                            entityPlayer.field_71075_bZ.field_75100_b = entityPlayer.getEntityData().func_74769_h("Power") >= 6.0d;
                            entityPlayer.func_71016_p();
                        }
                        entityPlayer.getEntityData().func_74757_a("Fly", false);
                    }
                    if (((Entity) entityPlayer).field_70181_x >= 0.0d) {
                        if (entityPlayer.getEntityData().func_74769_h("BeMagicAttack") > 0.0d || entityPlayer.getEntityData().func_74769_h("BeThunderAttack") > 0.0d || entityPlayer.getEntityData().func_74769_h("BeFireAttack") > 0.0d || entityPlayer.getEntityData().func_74769_h("BePosionAttack") > 0.0d) {
                            entityPlayer.getEntityData().func_74757_a("Fly2", true);
                        }
                        entityPlayer.getEntityData().func_74780_a("飞行计时", entityPlayer.getEntityData().func_74769_h("飞行计时") + 1.0d);
                        if (entityPlayer.getEntityData().func_74769_h("飞行计时") >= 20.0d) {
                            if (worldServer instanceof WorldServer) {
                                worldServer.func_175739_a(EnumParticleTypes.CLOUD, x, y, z, 30, 1.0d, 0.0d, 1.0d, 0.0d, new int[0]);
                            }
                            if (entityPlayer instanceof EntityPlayer) {
                                Scoreboard _sc = entityPlayer.func_96123_co();
                                ScoreObjective _so = _sc.func_96518_b("Power");
                                if (_so == null) {
                                    _so = _sc.func_96535_a("Power", ScoreCriteria.field_96641_b);
                                }
                                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                                _scr.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("Power"));
                            }
                            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureFly.1
                                    public String func_70005_c_() {
                                        return "";
                                    }

                                    public boolean func_70003_b(int permission, String command) {
                                        return true;
                                    }

                                    public World func_130014_f_() {
                                        return worldServer;
                                    }

                                    public MinecraftServer func_184102_h() {
                                        return worldServer.func_73046_m();
                                    }

                                    public boolean func_174792_t_() {
                                        return false;
                                    }

                                    public BlockPos func_180425_c() {
                                        return new BlockPos(x, y, z);
                                    }

                                    public Vec3d func_174791_d() {
                                        return new Vec3d(x, y, z);
                                    }
                                }, "scoreboard objectives setdisplay sidebar.team.dark_blue Power");
                            }
                            if (entityPlayer instanceof EntityPlayer) {
                                Scoreboard _sc2 = entityPlayer.func_96123_co();
                                ScoreObjective _so2 = _sc2.func_96518_b("Power");
                                if (_so2 == null) {
                                    _so2 = _sc2.func_96535_a("Power", ScoreCriteria.field_96641_b);
                                }
                                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                                _scr2.func_96647_c(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureFly.2
                                    public int getScore(String score) {
                                        Scoreboard _sc3;
                                        ScoreObjective _so3;
                                        if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                            Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                                            return _scr3.func_96652_c();
                                        }
                                        return 0;
                                    }
                                }.getScore("Power") - 6);
                            }
                            entityPlayer.getEntityData().func_74780_a("Power", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureFly.3
                                public int getScore(String score) {
                                    Scoreboard _sc3;
                                    ScoreObjective _so3;
                                    if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                        Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                                        return _scr3.func_96652_c();
                                    }
                                    return 0;
                                }
                            }.getScore("Power"));
                            entityPlayer.getEntityData().func_74780_a("飞行计时", 0.0d);
                            entityPlayer.getEntityData().func_74780_a("Fly2Clear", 2.0d);
                            return;
                        }
                        return;
                    }
                    entityPlayer.getEntityData().func_74757_a("Fly", false);
                    entityPlayer.getEntityData().func_74780_a("飞行计时", 0.0d);
                    if (entityPlayer.getEntityData().func_74769_h("Fly2Clear") > 0.0d) {
                        entityPlayer.getEntityData().func_74780_a("Fly2Clear", entityPlayer.getEntityData().func_74769_h("Fly2Clear") - 1.0d);
                    }
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
