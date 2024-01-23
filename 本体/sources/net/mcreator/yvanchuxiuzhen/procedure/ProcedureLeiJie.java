package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureLeiJie.class */
public class ProcedureLeiJie extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLeiJie(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 314);
    }

    /* JADX WARN: Type inference failed for: r2v45, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureLeiJie$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74767_n("LeiJie")) {
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x, y + 18, z, 100, 10.0d, 1.0d, 10.0d, 0.0d, new int[0]);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.CLOUD, x, y + 19, z, 100, 10.0d, 1.0d, 10.0d, 0.0d, new int[0]);
            }
            entityPlayer.getEntityData().func_74780_a("LeiJieTime", entityPlayer.getEntityData().func_74769_h("LeiJieTime") + 1.0d);
            entityPlayer.getEntityData().func_74780_a("LeiJieTime2", entityPlayer.getEntityData().func_74769_h("LeiJieTime2") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("LeiJieTime2") >= 40.0d) {
                if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                    ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureLeiJie.1
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
                    }, "playsound minecraft:entity.lightning.thunder player @s");
                }
                entityPlayer.getEntityData().func_74780_a("LeiJieTime2", 0.0d);
                entityPlayer.getEntityData().func_74780_a("增加雷劫数", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureLeiJie.2
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("ShaQi") / 200.0d)));
                entityPlayer.getEntityData().func_74780_a("LeiJieNum", (9.0d + entityPlayer.getEntityData().func_74769_h("增加雷劫数")) - entityPlayer.getEntityData().func_74769_h("LeiJieTime3"));
            }
            if (entityPlayer.getEntityData().func_74769_h("LeiJieTime") >= 180.0d) {
                worldServer.func_72942_c(new EntityLightningBolt(worldServer, x, y, z, true));
                if (Math.random() <= 0.5d) {
                    worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x + (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), true));
                }
                if (Math.random() <= 0.5d) {
                    worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x + (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), true));
                }
                if (Math.random() <= 0.5d) {
                    worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x + (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), true));
                }
                if (Math.random() <= 0.5d) {
                    worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x + (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), true));
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("逆天而行，必受天击！天雷对你造成" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("LeiJieAttack")) + "物理伤害+" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("LeiJieThunderAttack")) + "雷电伤害！"), false);
                }
                if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:thunder_repelling_charm"), 1))) {
                    entityPlayer.getEntityData().func_74757_a("BePlayerAttack2", true);
                    entityPlayer.getEntityData().func_74780_a("BeThunderAttack", entityPlayer.getEntityData().func_74769_h("BeThunderAttack") + entityPlayer.getEntityData().func_74769_h("LeiJieThunderAttack"));
                    entityPlayer.func_70097_a(DamageSource.field_76380_i, (float) (entityPlayer.getEntityData().func_74769_h("BeAttack") + entityPlayer.getEntityData().func_74769_h("LeiJieAttack")));
                }
                entityPlayer.getEntityData().func_74780_a("LeiJieTime", 0.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieTime3", entityPlayer.getEntityData().func_74769_h("LeiJieTime3") + 1.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("LeiJieTime3") >= 9.0d + entityPlayer.getEntityData().func_74769_h("增加雷劫数")) {
                entityPlayer.getEntityData().func_74780_a("LeiJieTime3", 0.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieAttack", 0.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieNum", 0.0d);
                entityPlayer.getEntityData().func_74780_a("LeiJieThunderAttack", 0.0d);
                entityPlayer.getEntityData().func_74780_a("境界突破附加概率", 0.0d);
                entityPlayer.getEntityData().func_74780_a("突破失败增加概率", 0.0d);
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
                entityPlayer.getEntityData().func_74757_a("境界概率更新", true);
                entityPlayer.getEntityData().func_74757_a("LeiJie", false);
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieName.executeProcedure($_dependencies);
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
