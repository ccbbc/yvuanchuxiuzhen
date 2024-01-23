package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
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
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureAttributeSave.class */
public class ProcedureAttributeSave extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureAttributeSave(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 296);
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeSave$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        MinecraftServer mcserv;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.getEntityData().func_74780_a("LeiJieNum", 0.0d);
            entityPlayer.getEntityData().func_74780_a("LeiJieTime", 0.0d);
            entityPlayer.getEntityData().func_74780_a("LeiJieTime2", 0.0d);
            entityPlayer.getEntityData().func_74780_a("LeiJieTime3", 0.0d);
            entityPlayer.getEntityData().func_74757_a("LeiJie", false);
            entityPlayer.getEntityData().func_74757_a("Fly", false);
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.field_71075_bZ.field_75101_c = entityPlayer.getEntityData().func_74767_n("Fly");
                entityPlayer.func_71016_p();
            }
            entityPlayer.getEntityData().func_74780_a("重伤赋予计时", 0.0d);
            if (entityPlayer.getEntityData().func_74767_n("LingQiFly")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("LingQiFly");
                    if (_so == null) {
                        _so = _sc.func_96535_a("LingQiFly", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(1);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeSave.1
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
                    }, "scoreboard objectives setdisplay sidebar.team.dark_aqua LingQiFly");
                }
            }
            $_dependencies.put("entity", entityPlayer);
            ProcedureShouYuanCut.executeProcedure($_dependencies);
            $_dependencies.put("entity", entityPlayer);
            ProcedureSaveAttribute.executeProcedure($_dependencies);
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureAttributeSave.2
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("ShouYuan") <= 0 && (mcserv = FMLCommonHandler.instance().getMinecraftServerInstance()) != null) {
                mcserv.func_184103_al().func_148539_a(new TextComponentString("于某界坐标 X:" + new DecimalFormat("0").format(((Entity) entityPlayer).field_70165_t) + " Y:xx Z:" + new DecimalFormat("0").format(((Entity) entityPlayer).field_70161_v) + " " + entityPlayer.func_145748_c_().func_150260_c() + " 寿元已尽，归还于天地。"));
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") > 0.0d && (entityPlayer instanceof EntityPlayer)) {
                Scoreboard _sc2 = entityPlayer.func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("已重伤");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                _scr2.func_96647_c(2);
            }
        }
    }

    @SubscribeEvent
    public void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
