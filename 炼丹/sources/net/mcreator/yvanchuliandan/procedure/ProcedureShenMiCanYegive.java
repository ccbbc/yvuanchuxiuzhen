package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemShenMiCanYe;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureShenMiCanYegive.class */
public class ProcedureShenMiCanYegive extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureShenMiCanYegive(ElementsYvanchuliandanMod instance) {
        super(instance, 548);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShenMiCanYegive$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        double NumberCycles = 0.0d;
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShenMiCanYegive.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("shenmicanye") == 0) {
            if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71071_by.func_70431_c(new ItemStack(ItemShenMiCanYe.block, 1))) && (entityPlayer instanceof EntityPlayer)) {
                ItemStack _setstack = new ItemStack(ItemShenMiCanYe.block, 1);
                _setstack.func_190920_e(1);
                ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("神秘残页里的线索可以帮助你成为修仙者，老者的心得可以帮助你了解如何更好的修炼，如果以上都不能帮助到你，我建议您到我们的模组百科里查看这个模组的详细资料来帮助你的游玩。"), false);
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShenMiCanYegive.2
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
                }, "tellraw @p [{\"text\":\"模组百科链接 \",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\" [https://www.mcmod.cn/class/8033.html]\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.mcmod.cn/class/8033.html\"}}]");
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("（欢迎那些足够了解模组的玩家补充模组的百科资料，这将能帮助到更多人。对那些参与编辑百科的人我们深表感谢！）"), false);
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShenMiCanYegive.3
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
                }, "give " + entityPlayer.func_145748_c_().func_150260_c() + " yvanchuxiuzhenfulu:kong_ti_fu 1 0 {\"第一次获取\":1b}");
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("shenmicanye");
                if (_so == null) {
                    _so = _sc.func_96535_a("shenmicanye", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(1);
            }
            entityPlayer.getEntityData().func_74778_a("临时UID", "");
            for (int index0 = 0; index0 < 16; index0++) {
                NumberCycles += 1.0d;
                entityPlayer.getEntityData().func_74780_a("BenMingUID2", new Random().nextInt(61) + 1);
                entityPlayer.getEntityData().func_74778_a("临时UID", entityPlayer.getEntityData().func_74779_i("临时UID") + "" + "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring((int) entityPlayer.getEntityData().func_74769_h("BenMingUID2"), (int) (entityPlayer.getEntityData().func_74769_h("BenMingUID2") + 1.0d)));
                if (new DecimalFormat("0.0").format(NumberCycles / 4.0d).contains(".0") && NumberCycles < 16.0d) {
                    entityPlayer.getEntityData().func_74778_a("临时UID", entityPlayer.getEntityData().func_74779_i("临时UID") + "-");
                }
            }
            entityPlayer.getEntityData().func_74778_a("ChaTan1", entityPlayer.getEntityData().func_74779_i("临时UID"));
        }
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        EntityPlayer entityPlayer = event.player;
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf((int) ((Entity) entityPlayer).field_70165_t));
        dependencies.put("y", Integer.valueOf((int) ((Entity) entityPlayer).field_70163_u));
        dependencies.put("z", Integer.valueOf((int) ((Entity) entityPlayer).field_70161_v));
        dependencies.put("world", ((Entity) entityPlayer).field_70170_p);
        dependencies.put("entity", entityPlayer);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
