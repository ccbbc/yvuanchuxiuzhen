package net.mcreator.infinite_storage.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.infinite_storage.Config;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.mcreator.infinite_storage.gui.GuiInfiniteBagGui;
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

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureInfiniteBagGuiOpenUpdate.class */
public class ProcedureInfiniteBagGuiOpenUpdate extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureInfiniteBagGuiOpenUpdate(ElementsInfiniteStorageMod instance) {
        super(instance, 26);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate$4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate$5] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate$6] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((entityPlayer instanceof EntityPlayer) && (entityPlayer.field_71070_bA instanceof GuiInfiniteBagGui.GuiContainerMod)) {
            if (entityPlayer.getEntityData().func_74769_h("InfiniteBagTipClear") == 0.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate.1
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
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
                    }, "scoreboard objectives setdisplay sidebar.team.black InfiniteBagPage");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate.2
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
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
                    }, "scoreboard objectives setdisplay sidebar.team.blue InfiniteBagLv");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate.3
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
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
                    }, "scoreboard objectives setdisplay sidebar.team.green BagNeedLevel");
                }
                entityPlayer.getEntityData().func_74757_a("bagState", Config.bagState);
                entityPlayer.getEntityData().func_74757_a("doubleOn", Config.doubleOn);
                entityPlayer.getEntityData().func_74780_a("needLevel", Config.needLevel);
                entityPlayer.getEntityData().func_74780_a("doubleBase", Config.doubleBase);
                if (!entityPlayer.getEntityData().func_74767_n("doubleOn")) {
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc = entityPlayer.func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("BagNeedLevel");
                        if (_so == null) {
                            _so = _sc.func_96535_a("BagNeedLevel", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        _scr.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("needLevel"));
                    }
                } else if (entityPlayer.getEntityData().func_74767_n("doubleOn") && (entityPlayer instanceof EntityPlayer)) {
                    Scoreboard _sc2 = entityPlayer.func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("BagNeedLevel");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("BagNeedLevel", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("needLevel") * entityPlayer.getEntityData().func_74769_h("doubleBase")));
                }
            }
            entityPlayer.getEntityData().func_74780_a("InfiniteBagPage", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate.4
                public int getScore(String score) {
                    Scoreboard _sc3;
                    ScoreObjective _so3;
                    if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                        return _scr3.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("InfiniteBagPage"));
            entityPlayer.getEntityData().func_74780_a("InfiniteBagLevel", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate.5
                public int getScore(String score) {
                    Scoreboard _sc3;
                    ScoreObjective _so3;
                    if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                        return _scr3.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("InfiniteBagLv"));
            entityPlayer.getEntityData().func_74780_a("BagNeedLevel", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagGuiOpenUpdate.6
                public int getScore(String score) {
                    Scoreboard _sc3;
                    ScoreObjective _so3;
                    if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                        return _scr3.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("BagNeedLevel"));
            entityPlayer.getEntityData().func_74780_a("InfiniteBagTipClear", entityPlayer.getEntityData().func_74769_h("InfiniteBagTipClear") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("InfiniteBagTipClear") >= 40.0d) {
                entityPlayer.getEntityData().func_74778_a("InfiniteBagTip", "");
                entityPlayer.getEntityData().func_74780_a("InfiniteBagTipClear", 0.0d);
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

    @Override // net.mcreator.infinite_storage.ElementsInfiniteStorageMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
