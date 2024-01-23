package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureCunMingDuiHuan.class */
public class ProcedureCunMingDuiHuan extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureCunMingDuiHuan(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 313);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((entity instanceof EntityVillager) && !entity.func_145748_c_().func_150260_c().equals("老者") && !entity.getEntityData().func_74767_n("加载")) {
            entity.getEntityData().func_74757_a("加载", true);
            if (Math.random() < 0.2d) {
                entity.field_70170_p.func_72900_e(entity);
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureCunMingDuiHuan.1
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
                    }, "summon minecraft:villager ~ ~1 ~ {CustomName:\"老者\",Health:180,Attributes:[{Name:\"generic.maxHealth\",Base:180}],Offers:{Recipes:[{uses:0,buy:{id:\"minecraft:water_bucket\",Count:1b,Damage:0s},buyB:{id:\"minecraft:book\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 2) + "b,Damage:0s},sell:{id:\"yvanchujiguan:gong_fa_3\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"minecraft:gold_ingot\",Count:" + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + "b,Damage:0s},buyB:{id:\"minecraft:book\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 2) + "b,Damage:0s},sell:{id:\"yvanchujiguan:gong_fa_1\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"minecraft:log\",Count:" + new DecimalFormat("0").format(new Random().nextInt(12) + 5) + "b,Damage:0s},buyB:{id:\"minecraft:book\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 2) + "b,Damage:0s},sell:{id:\"yvanchujiguan:gong_fa_2\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"minecraft:lava_bucket\",Count:1b,Damage:0s},buyB:{id:\"minecraft:book\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 2) + "b,Damage:0s},sell:{id:\"yvanchujiguan:gong_fa_4\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"minecraft:dirt\",Count:" + new DecimalFormat("0").format(new Random().nextInt(23) + 10) + "b,Damage:0s},buyB:{id:\"minecraft:book\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 2) + "b,Damage:0s},sell:{id:\"yvanchujiguan:gong_fa_5\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"minecraft:apple\",Count:1b,Damage:0s},buyB:{id:\"minecraft:book\",Count:1b,Damage:0s},sell:{id:\"yvanchuxiuzhenfulu:xin_de\",Count:1b,Damage:0s}}]}}");
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntitySpawned(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        int i = (int) entity.field_70165_t;
        int j = (int) entity.field_70163_u;
        int k = (int) entity.field_70161_v;
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
