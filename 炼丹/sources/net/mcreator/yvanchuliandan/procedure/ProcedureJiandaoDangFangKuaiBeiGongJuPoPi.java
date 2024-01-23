package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockCaoyaocong01;
import net.mcreator.yvanchuliandan.block.BlockCaoyaocong02;
import net.mcreator.yvanchuliandan.block.BlockCaoyaocong03;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureJiandaoDangFangKuaiBeiGongJuPoPi.class */
public class ProcedureJiandaoDangFangKuaiBeiGongJuPoPi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureJiandaoDangFangKuaiBeiGongJuPoPi(ElementsYvanchuliandanMod instance) {
        super(instance, 482);
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureJiandaoDangFangKuaiBeiGongJuPoPi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCaoyaocong01.block.func_176223_P().func_177230_c()) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureCaoyaocong01PlantDestroyedByPlayer.executeProcedure($_dependencies);
            entityPlayer.getEntityData().func_74780_a("ZhongZhiXp", entityPlayer.getEntityData().func_74769_h("ZhongZhiXp") + 1.0d);
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCaoyaocong02.block.func_176223_P().func_177230_c()) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("entity", entityPlayer);
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", world);
                ProcedureCaoyaocong02PlantDestroyedByPlayer.executeProcedure($_dependencies2);
                entityPlayer.getEntityData().func_74780_a("ZhongZhiXp", entityPlayer.getEntityData().func_74769_h("ZhongZhiXp") + 2.0d);
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前境界还无法采集该草药丛"), false);
            }
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCaoyaocong03.block.func_176223_P().func_177230_c()) {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                entityPlayer.getEntityData().func_74780_a("ZhongZhiXp", entityPlayer.getEntityData().func_74769_h("ZhongZhiXp") + 3.0d);
                Map<String, Object> $_dependencies3 = new HashMap<>();
                $_dependencies3.put("entity", entityPlayer);
                $_dependencies3.put("x", Integer.valueOf(x));
                $_dependencies3.put("y", Integer.valueOf(y));
                $_dependencies3.put("z", Integer.valueOf(z));
                $_dependencies3.put("world", world);
                ProcedureCaoyaocong03PlantDestroyedByPlayer.executeProcedure($_dependencies3);
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前境界还无法采集该草药丛"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureJiandaoDangFangKuaiBeiGongJuPoPi.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阶段") >= 0.0d) {
            Map<String, Object> $_dependencies4 = new HashMap<>();
            $_dependencies4.put("entity", entityPlayer);
            $_dependencies4.put("x", Integer.valueOf(x));
            $_dependencies4.put("y", Integer.valueOf(y));
            $_dependencies4.put("z", Integer.valueOf(z));
            $_dependencies4.put("world", world);
            ProcedureZhongZiShouHuo.executeProcedure($_dependencies4);
        }
    }
}
