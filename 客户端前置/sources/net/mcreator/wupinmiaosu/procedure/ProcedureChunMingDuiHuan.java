package net.mcreator.wupinmiaosu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
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
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureChunMingDuiHuan.class */
public class ProcedureChunMingDuiHuan extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureChunMingDuiHuan(ElementsWupinmiaosuMod instance) {
        super(instance, 89);
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
        if (entity instanceof EntityVillager) {
            if (!entity.func_145748_c_().func_150260_c().equals("炼器师") && !entity.getEntityData().func_74767_n("加载2")) {
                entity.getEntityData().func_74757_a("加载2", true);
                if (Math.random() < 0.05d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureChunMingDuiHuan.1
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
                        }, "summon minecraft:villager ~ ~1 ~ {CustomName:\"炼器师\",Health:17210,Attributes:[{Name:\"generic.maxHealth\",Base:17210}],Offers:{Recipes:[{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(14) + 15) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_02\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(7) + 7) + "b,Damage:0s},sell:{id:\"fabaokuozhan:po_shan\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(14) + 13) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao13\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(9) + 37) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao15\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + "b,Damage:0s},sell:{id:\"yvanchuxiuzhen:ming_fu_ling_fang\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 3) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao19\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 3) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao18\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 2) + "b,Damage:0s},sell:{id:\"yvanchuxiuzhen:tian_gong_ling_fang\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:gold_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:wood_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:water_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:fire_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:soil_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:leaf\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:gourd\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:shan_he_tu\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 5) + "b,Damage:0s},sell:{id:\"flyinginstrument:boat\",Count:1b,Damage:0s}}]}}");
                    }
                    if (dependencies.get("event") != null) {
                        Object _obj = dependencies.get("event");
                        if (_obj instanceof Event) {
                            Event _evt = (Event) _obj;
                            if (_evt.isCancelable()) {
                                _evt.setCanceled(true);
                            }
                        }
                    }
                }
            }
            if (!entity.func_145748_c_().func_150260_c().equals("炼丹师") && !entity.getEntityData().func_74767_n("加载3")) {
                entity.getEntityData().func_74757_a("加载3", true);
                if (Math.random() < 0.05d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.wupinmiaosu.procedure.ProcedureChunMingDuiHuan.2
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
                        }, "summon minecraft:villager ~ ~1 ~ {CustomName:\"炼丹师\",Health:17210,Attributes:[{Name:\"generic.maxHealth\",Base:17210}],Offers:{Recipes:[{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_32\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 4) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_33\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(19) + 21) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_05\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(25) + 40) + "b,Damage:0s},buyB:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_08\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(5) + 3) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_11\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao18\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(10) + 4) + "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao_1801\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(10) + 4) + "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao_1802\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(4) + 1) + "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao3\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(13) + 7) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_201\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_202\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(5) + 2) + "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao25\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new DecimalFormat("0").format(new Random().nextInt(17) + 17) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_601\",Count:1b,Damage:0s}}]}}");
                    }
                    if (dependencies.get("event") != null) {
                        Object _obj2 = dependencies.get("event");
                        if (_obj2 instanceof Event) {
                            Event _evt2 = (Event) _obj2;
                            if (_evt2.isCancelable()) {
                                _evt2.setCanceled(true);
                            }
                        }
                    }
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

    @Override // net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
