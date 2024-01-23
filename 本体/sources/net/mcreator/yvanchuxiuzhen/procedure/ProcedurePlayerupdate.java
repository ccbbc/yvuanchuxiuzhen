package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedurePlayerupdate.class */
public class ProcedurePlayerupdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayerupdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 103);
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerupdate$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("xiulianTick") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("xiulianTick", entityPlayer.getEntityData().func_74769_h("xiulianTick") - 1.0d);
        }
        entityPlayer.getEntityData().func_74780_a("PlayerTime", entityPlayer.getEntityData().func_74769_h("PlayerTime") + 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("PlayerTime") >= 20.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerupdate.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("作弊初始化") == 0) {
                entityPlayer.getEntityData().func_74757_a("LingQiFly", true);
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("作弊初始化");
                    if (_so == null) {
                        _so = _sc.func_96535_a("作弊初始化", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(1);
                }
            }
            entityPlayer.getEntityData().func_74780_a("PlayerTime5", entityPlayer.getEntityData().func_74769_h("PlayerTime5") + 1.0d);
            $_dependencies.put("entity", entityPlayer);
            ProcedureZhiYeXpAdd.executeProcedure($_dependencies);
            $_dependencies.put("entity", entityPlayer);
            ProcedureLiandan.executeProcedure($_dependencies);
            $_dependencies.put("entity", entityPlayer);
            ProcedureZhifu.executeProcedure($_dependencies);
            $_dependencies.put("entity", entityPlayer);
            ProcedureShengHuoZhiYe.executeProcedure($_dependencies);
            if (entityPlayer.getEntityData().func_74769_h("LingGenNum") == 0.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureLinggen.executeProcedure($_dependencies);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") > 0.0d && entityPlayer.getEntityData().func_74769_h("Power") < entityPlayer.getEntityData().func_74769_h("PowerMax")) {
                $_dependencies.put("entity", entityPlayer);
                ProcedurePower.executeProcedure($_dependencies);
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") > 0.0d && entityPlayer.getEntityData().func_74769_h("Power") > entityPlayer.getEntityData().func_74769_h("PowerMax") * 1.3d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_HUGE, x + 0.5d, y, z + 0.5d, 5, 2.0d, 2.0d, 2.0d, 1.0d, new int[0]);
                }
                worldServer.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuxiuzhen:baozha")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
                entityPlayer.func_70097_a(DamageSource.field_76380_i, (float) (entityPlayer.getEntityData().func_74769_h("healthMax") * 0.7d));
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("PowerMax"));
            } else if (entityPlayer.getEntityData().func_74769_h("Power") > entityPlayer.getEntityData().func_74769_h("PowerMax")) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.CLOUD, x + 0.5d, y, z + 0.5d, 20, 0.5d, 0.5d, 0.5d, 0.0d, new int[0]);
                }
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("PowerMax"));
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") > 0.0d && entityPlayer.getEntityData().func_74769_h("Power") <= 0.0d && (entityPlayer instanceof EntityLivingBase)) {
                ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 1, true, true));
            }
            if (entityPlayer.getEntityData().func_74767_n("mianyi") && entityPlayer.getEntityData().func_74769_h("mianyitick") > 0.0d) {
                entityPlayer.getEntityData().func_74780_a("mianyitick", entityPlayer.getEntityData().func_74769_h("mianyitick") - 1.0d);
            } else if (entityPlayer.getEntityData().func_74767_n("mianyi") && entityPlayer.getEntityData().func_74769_h("mianyitick") == 0.0d) {
                entityPlayer.getEntityData().func_74757_a("mianyi", false);
            }
            if (entityPlayer.getEntityData().func_74769_h("PlayerTime5") >= 5.0d) {
                entityPlayer.getEntityData().func_74780_a("PlayerTime5", 0.0d);
            }
            entityPlayer.getEntityData().func_74780_a("PlayerTime", 0.0d);
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
