package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFanxiuDangMingLingBeiZhiXingShi.class */
public class ProcedureFanxiuDangMingLingBeiZhiXingShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFanxiuDangMingLingBeiZhiXingShi(ElementsFabaokuozhanMod instance) {
        super(instance, 478);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFanxiuDangMingLingBeiZhiXingShi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFanxiuDangMingLingBeiZhiXingShi.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("explosion") && entityPlayer.func_70003_b(4, "")) {
            if (world.func_180495_p(new BlockPos(0, 0, 0)).func_177230_c() == Blocks.field_150378_br.func_176223_P().func_177230_c()) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已开启当前世界部分特殊物品的爆炸效果"), false);
                }
                world.func_180501_a(new BlockPos(0, 0, 0), Blocks.field_150357_h.func_176223_P(), 3);
                return;
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已关闭当前世界部分特殊物品的爆炸效果"), false);
            }
            world.func_180501_a(new BlockPos(0, 0, 0), Blocks.field_150378_br.func_176223_P(), 3);
        }
    }
}
