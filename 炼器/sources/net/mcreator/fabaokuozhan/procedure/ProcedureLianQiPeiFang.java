package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianQiPeiFang.class */
public class ProcedureLianQiPeiFang extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianQiPeiFang(ElementsFabaokuozhanMod instance) {
        super(instance, 565);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang$2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang$3] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang$4] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang$5] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang$6] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 1.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianQiPeiFang1.executeProcedure($_dependencies);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 2.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianQiPeiFang2.executeProcedure($_dependencies);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 3.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianQiPeiFang3.executeProcedure($_dependencies);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 4.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianQiPeiFang4.executeProcedure($_dependencies);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 5.0d && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianQiPeiFang5.executeProcedure($_dependencies);
        }
        if (!new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang.6
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "kaishi") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("请检查境界/炼器鼎/材料是否满足炼制条件"), false);
        }
    }
}
