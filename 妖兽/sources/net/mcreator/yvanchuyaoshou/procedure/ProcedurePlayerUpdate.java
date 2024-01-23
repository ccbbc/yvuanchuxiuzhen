package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.Config;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.item.ItemAirArmor;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
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

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedurePlayerUpdate.class */
public class ProcedurePlayerUpdate extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayerUpdate(ElementsYvanchuyaoshouMod instance) {
        super(instance, 291);
    }

    /* JADX WARN: Type inference failed for: r0v167, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate$11] */
    /* JADX WARN: Type inference failed for: r0v212, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate$3] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate$1] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate$9] */
    /* JADX WARN: Type inference failed for: r1v110, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate$2] */
    /* JADX WARN: Type inference failed for: r2v11, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate$10] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate$4] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74767_n("已中毒1") && world.func_72820_D() % 1200 == 0) {
            entityPlayer.getEntityData().func_74757_a("已中毒1", false);
        }
        if (world.func_72820_D() % 20 == 0) {
            if ((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(ItemAirArmor.boots, 1)) && (entityPlayer instanceof EntityPlayer)) {
                entityPlayer.field_71071_by.func_174925_a(new ItemStack(ItemAirArmor.boots, 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
            if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SumLimit3") > 0) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("SumLimit4");
                    if (_so == null) {
                        _so = _sc.func_96535_a("SumLimit4", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(10);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc2 = entityPlayer.func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("SumLimit6");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("SumLimit6", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c(20);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc3 = entityPlayer.func_96123_co();
                    ScoreObjective _so3 = _sc3.func_96518_b("SumLimit5");
                    if (_so3 == null) {
                        _so3 = _sc3.func_96535_a("SumLimit5", ScoreCriteria.field_96641_b);
                    }
                    Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                    _scr3.func_96647_c(new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.2
                        public int getScore(String score) {
                            Scoreboard _sc4;
                            ScoreObjective _so4;
                            if ((entityPlayer instanceof EntityPlayer) && (_so4 = (_sc4 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
                                return _scr4.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("SumLimit5") + 1);
                }
                if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.3
                    public int getScore(String score) {
                        Scoreboard _sc4;
                        ScoreObjective _so4;
                        if ((entityPlayer instanceof EntityPlayer) && (_so4 = (_sc4 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
                            return _scr4.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("SumLimit5") >= 5) {
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc4 = entityPlayer.func_96123_co();
                        ScoreObjective _so4 = _sc4.func_96518_b("SumLimit3");
                        if (_so4 == null) {
                            _so4 = _sc4.func_96535_a("SumLimit3", ScoreCriteria.field_96641_b);
                        }
                        Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
                        _scr4.func_96647_c(0);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc5 = entityPlayer.func_96123_co();
                        ScoreObjective _so5 = _sc5.func_96518_b("SumLimit4");
                        if (_so5 == null) {
                            _so5 = _sc5.func_96535_a("SumLimit4", ScoreCriteria.field_96641_b);
                        }
                        Score _scr5 = _sc5.func_96529_a(entityPlayer.func_146103_bH().getName(), _so5);
                        _scr5.func_96647_c(0);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc6 = entityPlayer.func_96123_co();
                        ScoreObjective _so6 = _sc6.func_96518_b("SumLimit5");
                        if (_so6 == null) {
                            _so6 = _sc6.func_96535_a("SumLimit5", ScoreCriteria.field_96641_b);
                        }
                        Score _scr6 = _sc6.func_96529_a(entityPlayer.func_146103_bH().getName(), _so6);
                        _scr6.func_96647_c(0);
                    }
                }
            }
            entityPlayer.getEntityData().func_74780_a("实体生成计时", entityPlayer.getEntityData().func_74769_h("实体生成计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("实体生成计时") >= 60 - new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.4
                public int getScore(String score) {
                    Scoreboard _sc7;
                    ScoreObjective _so7;
                    if ((entityPlayer instanceof EntityPlayer) && (_so7 = (_sc7 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr7 = _sc7.func_96529_a(entityPlayer.func_146103_bH().getName(), _so7);
                        return _scr7.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SumLimit6")) {
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.5
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
                    }, "scoreboard players reset @s SumLimit");
                }
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.6
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
                    }, "execute @e[r=" + Config.CheckR + ",tag=xiuxianmobs] ~ ~ ~ scoreboard players add " + entityPlayer.func_145748_c_().func_150260_c() + " SumLimit 1");
                }
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.7
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
                    }, "scoreboard players reset @s SumLimit2");
                }
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.8
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
                    }, "execute @e[r=" + Config.CheckR + ",tag=xiushi] ~ ~ ~ scoreboard players add " + entityPlayer.func_145748_c_().func_150260_c() + " SumLimit2 1");
                }
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("world", world);
                ProcedureShiTiSumReset.executeProcedure($_dependencies);
                if (entityPlayer.getEntityData().func_74767_n("实体允许生成")) {
                    if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.9
                        public int getScore(String score) {
                            Scoreboard _sc7;
                            ScoreObjective _so7;
                            if ((entityPlayer instanceof EntityPlayer) && (_so7 = (_sc7 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr7 = _sc7.func_96529_a(entityPlayer.func_146103_bH().getName(), _so7);
                                return _scr7.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("SumLimit") < Config.AllMobsNumMax + new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.10
                        public int getScore(String score) {
                            Scoreboard _sc7;
                            ScoreObjective _so7;
                            if ((entityPlayer instanceof EntityPlayer) && (_so7 = (_sc7 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr7 = _sc7.func_96529_a(entityPlayer.func_146103_bH().getName(), _so7);
                                return _scr7.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("SumLimit3")) {
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum1.executeProcedure($_dependencies);
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum2.executeProcedure($_dependencies);
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum3.executeProcedure($_dependencies);
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum4.executeProcedure($_dependencies);
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum5.executeProcedure($_dependencies);
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum6.executeProcedure($_dependencies);
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum7.executeProcedure($_dependencies);
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureShiTiSum8.executeProcedure($_dependencies);
                        if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedurePlayerUpdate.11
                            public int getScore(String score) {
                                Scoreboard _sc7;
                                ScoreObjective _so7;
                                if ((entityPlayer instanceof EntityPlayer) && (_so7 = (_sc7 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                    Score _scr7 = _sc7.func_96529_a(entityPlayer.func_146103_bH().getName(), _so7);
                                    return _scr7.func_96652_c();
                                }
                                return 0;
                            }
                        }.getScore("SumLimit2") < Config.AllXiuShiNumMax) {
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("world", world);
                            ProcedureShiTiSum9.executeProcedure($_dependencies);
                        }
                    }
                    entityPlayer.getEntityData().func_74757_a("实体允许生成", false);
                    entityPlayer.getEntityData().func_74757_a("实体生成处露天", false);
                    entityPlayer.getEntityData().func_74757_a("实体生成处黑暗", false);
                }
                entityPlayer.getEntityData().func_74780_a("实体生成计时", 0.0d);
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

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
