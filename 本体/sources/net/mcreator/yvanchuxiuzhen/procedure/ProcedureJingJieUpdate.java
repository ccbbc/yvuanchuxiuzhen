package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanShenChuTiBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanYingChuQiaoBuff;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
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
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureJingJieUpdate.class */
public class ProcedureJingJieUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJingJieUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 271);
    }

    /* JADX WARN: Type inference failed for: r0v133, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate$5] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate$1] */
    /* JADX WARN: Type inference failed for: r0v238, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate$4] */
    /* JADX WARN: Type inference failed for: r0v281, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if ((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 0.0d || entityPlayer.getEntityData().func_74767_n("突破")) && entityPlayer.getEntityData().func_74769_h("NiangJiu30") > 0.0d && entityPlayer.getEntityData().func_74769_h("Base") >= entityPlayer.getEntityData().func_74769_h("NiangJiu30") && !entityPlayer.getEntityData().func_74767_n("YuanShenUp") && !entityPlayer.getEntityData().func_74767_n("YuanYingUp") && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("已重伤") == 0 && !entityPlayer.getEntityData().func_74767_n("TuPoLimit")) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 0.0d || ((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71075_bZ.field_75098_d)) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieName.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74780_a("境界突破附加概率", 0.0d);
                entityPlayer.getEntityData().func_74780_a("DanYaoBreach1", 0.0d);
                entityPlayer.getEntityData().func_74780_a("DanYaoBreach2", 0.0d);
                entityPlayer.getEntityData().func_74780_a("DanYaoBreach3", 0.0d);
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
                entityPlayer.getEntityData().func_74780_a("YaoXing", 0.0d);
                entityPlayer.getEntityData().func_74780_a("PingJin", 0.0d);
                entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
                entityPlayer.getEntityData().func_74757_a("突破", false);
            } else {
                $_dependencies.put("entity", entityPlayer);
                ProcedureDuJieQian.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74780_a("YaoXing", 0.0d);
                entityPlayer.getEntityData().func_74780_a("PingJin", 0.0d);
                entityPlayer.getEntityData().func_74757_a("突破", false);
            }
        } else if (entityPlayer.getEntityData().func_74767_n("突破") && !entityPlayer.getEntityData().func_74767_n("TuPoLimit")) {
            entityPlayer.getEntityData().func_74757_a("突破", false);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("真元未满或元神出窍导致目前暂时无法突破"), false);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") >= 4.0d && entityPlayer.getEntityData().func_74769_h("Base") > entityPlayer.getEntityData().func_74769_h("NiangJiu30") * 0.9d) {
            entityPlayer.getEntityData().func_74757_a("TuPoLimit", true);
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("JingJieUpdate");
                if (_so == null) {
                    _so = _sc.func_96535_a("JingJieUpdate", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(0);
            }
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("NiangJiu30") * 0.9d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("天地间，冥冥之中有一股力量限制了境界进程"), false);
            }
        }
        if (entityPlayer.getEntityData().func_74767_n("境界提升属性更新") && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate.2
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore("JingJieUpdate") == 0) {
            entityPlayer.getEntityData().func_74780_a("境界提升属性更新计时", entityPlayer.getEntityData().func_74769_h("境界提升属性更新计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("境界提升属性更新计时") == 21.0d && entityPlayer.getEntityData().func_74767_n("境界突破血量回复")) {
                if (entityPlayer instanceof EntityLivingBase) {
                    ((EntityLivingBase) entityPlayer).func_70691_i(entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f);
                }
                entityPlayer.getEntityData().func_74757_a("境界突破血量回复", false);
            }
            if (entityPlayer.getEntityData().func_74769_h("境界提升属性更新计时") >= 60.0d) {
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate.3
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
                    }, "title @s title {\"text\":\"§6§l" + entityPlayer.getEntityData().func_74779_i("JingJie") + "" + entityPlayer.getEntityData().func_74779_i("XiaoJingJie") + "" + entityPlayer.getEntityData().func_74779_i("Layer") + "\"}");
                }
                entityPlayer.getEntityData().func_74780_a("境界提升属性更新计时", 0.0d);
                entityPlayer.getEntityData().func_74757_a("境界提升属性更新", false);
            }
        }
        if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) > 0.0f && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate.4
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore("已重伤") == 2) {
            entityPlayer.getEntityData().func_74780_a("重伤赋予计时", entityPlayer.getEntityData().func_74769_h("重伤赋予计时") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("重伤赋予计时") >= 40.0d) {
                $_dependencies.put("entity", entityPlayer);
                ProcedureGDown.executeProcedure($_dependencies);
                if (entityPlayer.getEntityData().func_74767_n("YuanShenUp")) {
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(PotionYuanShenChuTiBuff.potion, 9999999, 1, false, false));
                    }
                } else if (entityPlayer.getEntityData().func_74767_n("YuanYingUp") && (entityPlayer instanceof EntityLivingBase)) {
                    ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(PotionYuanYingChuQiaoBuff.potion, 9999999, 1, false, false));
                }
                entityPlayer.getEntityData().func_74780_a("重伤赋予计时", 0.0d);
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc2 = entityPlayer.func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("已重伤");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c(1);
                }
            }
        }
        if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) > (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f) && (entityPlayer instanceof EntityLivingBase)) {
            ((EntityLivingBase) entityPlayer).func_70606_j(entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f);
        }
        if (entityPlayer.getEntityData().func_74769_h("Base") < 0.0d) {
            entityPlayer.getEntityData().func_74780_a("Base", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("Base") > entityPlayer.getEntityData().func_74769_h("NiangJiu30")) {
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("NiangJiu30"));
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("修为已至瓶颈，可进行突破了"), false);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("Power") < 0.0d) {
            entityPlayer.getEntityData().func_74780_a("Power", 0.0d);
        } else if (entityPlayer.getEntityData().func_74769_h("Power") > entityPlayer.getEntityData().func_74769_h("PowerMax")) {
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("PowerMax"));
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("你的灵力已满"), false);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("ShouYuan") < 0.0d) {
            entityPlayer.getEntityData().func_74780_a("ShouYuan", 0.0d);
        }
        entityPlayer.getEntityData().func_74778_a("HealthNumB", new DecimalFormat("0.##").format(entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f));
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") >= 21.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieUpdate.5
            public int getScore(String score) {
                Scoreboard _sc3;
                ScoreObjective _so3;
                if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                    return _scr3.func_96652_c();
                }
                return 0;
            }
        }.getScore("化神圆满提示") <= 0) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("此方天地有缺，道友的上限恐怕要止步于此了。"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("莫要担心，大道五十，天衍四九，必有转机。"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("人界之外，是否仍有天地?"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("天道转机，何时浮出水面？"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("至此，感谢道友对凡人修仙的支持！"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("我们将于明年初更新至灵界篇，给大家带来全新玩法。"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString(" "), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("凡人修仙开发组成员名单："), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("策划：琳琅、啵啵锦瑟、风泷"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("美术：白叶、FerLanDo"), false);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("程序：hxyzg、夏忆"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc3 = entityPlayer.func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("化神圆满提示");
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("化神圆满提示", ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                _scr3.func_96647_c(1);
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
