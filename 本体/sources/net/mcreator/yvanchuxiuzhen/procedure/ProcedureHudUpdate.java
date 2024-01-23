package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHudUpdate.class */
public class ProcedureHudUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHudUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 340);
    }

    /* JADX WARN: Type inference failed for: r2v84, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHudUpdate$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) && !entityPlayer.func_184218_aH()) {
            entityPlayer.getEntityData().func_74757_a("FaQiFly", false);
        }
        if (entityPlayer.getEntityData().func_74769_h("Base") > 0.0d) {
            entityPlayer.getEntityData().func_74778_a("ZhenYuanNumShow", "§6" + new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h("Base") / entityPlayer.getEntityData().func_74769_h("NiangJiu30")) * 100.0d) + "%");
        } else {
            entityPlayer.getEntityData().func_74778_a("ZhenYuanNumShow", "§60%");
        }
        if (entityPlayer.getEntityData().func_74769_h("Power") > 0.0d) {
            entityPlayer.getEntityData().func_74778_a("LingQiNumShow", "§b" + new DecimalFormat("0").format((entityPlayer.getEntityData().func_74769_h("Power") / entityPlayer.getEntityData().func_74769_h("PowerMax")) * 100.0d) + "%");
        } else {
            entityPlayer.getEntityData().func_74778_a("LingQiNumShow", "§b0%");
        }
        entityPlayer.getEntityData().func_74780_a("BaseStripUpdate", (entityPlayer.getEntityData().func_74769_h("Base") / entityPlayer.getEntityData().func_74769_h("NiangJiu30")) * 77.0d);
        entityPlayer.getEntityData().func_74780_a("PowerFontMove", (entityPlayer.getEntityData().func_74779_i("LingQiNumShow").length() - 2) * 3);
        entityPlayer.getEntityData().func_74780_a("PowerStripUpdate", (entityPlayer.getEntityData().func_74769_h("Power") / entityPlayer.getEntityData().func_74769_h("PowerMax")) * 77.0d);
        entityPlayer.getEntityData().func_74780_a("BaseNumTempSave", (entityPlayer.getEntityData().func_74769_h("Base") / entityPlayer.getEntityData().func_74769_h("NiangJiu30")) * 20.0d);
        if (entityPlayer.getEntityData().func_74769_h("BaseNumTempSave") == 20.0d) {
            entityPlayer.getEntityData().func_74780_a("BaseStripMoveNum", 0.0d);
        } else {
            entityPlayer.getEntityData().func_74780_a("BaseStripMoveNum", 78.0d - (entityPlayer.getEntityData().func_74769_h("BaseNumTempSave") * 3.85d));
        }
        entityPlayer.getEntityData().func_74780_a("HealthStripUpdate", ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) / (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f)) * 77.0f);
        entityPlayer.getEntityData().func_74778_a("HealthNumShow", "§a" + new DecimalFormat("0").format(((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) / (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f)) * 100.0f) + "%");
        entityPlayer.getEntityData().func_74780_a("HealthFontMove", (entityPlayer.getEntityData().func_74779_i("HealthNumShow").length() - 2) * 3);
        entityPlayer.getEntityData().func_74780_a("FoodNumTempSave", entityPlayer instanceof EntityPlayer ? entityPlayer.func_71024_bL().func_75116_a() : 0);
        if (entityPlayer.getEntityData().func_74769_h("FoodNumTempSave") == 20.0d) {
            entityPlayer.getEntityData().func_74780_a("FoodStripMoveNum", 0.0d);
        } else {
            entityPlayer.getEntityData().func_74780_a("FoodStripMoveNum", 78.0d - (entityPlayer.getEntityData().func_74769_h("FoodNumTempSave") * 3.85d));
        }
        entityPlayer.getEntityData().func_74778_a("FoodNumShow", "§e" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("FoodNumTempSave")));
        entityPlayer.getEntityData().func_74780_a("FoodStripUpdate", (entityPlayer.getEntityData().func_74769_h("FoodNumTempSave") / 20.0d) * 77.0d);
        entityPlayer.getEntityData().func_74780_a("ArmorNumSaveTemp", entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_70658_aO() : 0);
        entityPlayer.getEntityData().func_74778_a("ArmorNumShow", "§d" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("ArmorNumSaveTemp")));
        entityPlayer.getEntityData().func_74780_a("ArmorStripUpdate", (entityPlayer.getEntityData().func_74769_h("ArmorNumSaveTemp") / 20.0d) * 77.0d);
        if (entityPlayer.getEntityData().func_74769_h("ArmorStripUpdate") > 77.0d) {
            entityPlayer.getEntityData().func_74780_a("ArmorStripUpdate", 77.0d);
        }
        entityPlayer.getEntityData().func_74780_a("ArmorFontMove", (entityPlayer.getEntityData().func_74779_i("ArmorNumShow").length() - 2) * 2.5d);
        entityPlayer.getEntityData().func_74780_a("BreathNumSaveTemp", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHudUpdate.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("BreathNumTemp"));
        if (entityPlayer.getEntityData().func_74769_h("BreathNumSaveTemp") == 300.0d) {
            entityPlayer.getEntityData().func_74780_a("BreathStripMoveUpdate", 0.0d);
        } else {
            entityPlayer.getEntityData().func_74780_a("BreathStripMoveUpdate", 78.0d - ((entityPlayer.getEntityData().func_74769_h("BreathNumSaveTemp") / 15.0d) * 3.85d));
        }
        entityPlayer.getEntityData().func_74778_a("BreathNumShow", "§b" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("BreathNumSaveTemp") / 3.0d) + "%");
        entityPlayer.getEntityData().func_74780_a("BreathStripUpdate", (entityPlayer.getEntityData().func_74769_h("BreathNumSaveTemp") / 300.0d) * 77.0d);
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
