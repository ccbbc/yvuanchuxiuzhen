package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockCaoyaocong01;
import net.mcreator.yvanchuliandan.block.BlockCaoyaocong02;
import net.mcreator.yvanchuliandan.block.BlockCaoyaocong03;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi.class */
public class ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi(ElementsYvanchuliandanMod instance) {
        super(instance, 540);
    }

    /* JADX WARN: Type inference failed for: r0v130, types: [net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi$4] */
    /* JADX WARN: Type inference failed for: r0v240, types: [net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi$2] */
    /* JADX WARN: Type inference failed for: r0v242, types: [net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi$3] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi$1] */
    /* JADX WARN: Type inference failed for: r3v18, types: [net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi$5] */
    /* JADX WARN: Type inference failed for: r3v20, types: [net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi$6] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("MoShiNum") == 1 || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi.2
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("MoShiNum") == 2 || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi.3
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("ActiveCapability") == 1) {
            if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCaoyaocong01.block.func_176223_P().func_177230_c()) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", worldServer);
                ProcedureCaoyaocong01PlantDestroyedByPlayer.executeProcedure($_dependencies);
                $_dependencies.clear();
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("entity", entityPlayer);
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", worldServer);
                ProcedureCaoyaocong01PlantDestroyedByPlayer.executeProcedure($_dependencies2);
                $_dependencies2.clear();
                Map<String, Object> $_dependencies3 = new HashMap<>();
                $_dependencies3.put("entity", entityPlayer);
                $_dependencies3.put("x", Integer.valueOf(x));
                $_dependencies3.put("y", Integer.valueOf(y));
                $_dependencies3.put("z", Integer.valueOf(z));
                $_dependencies3.put("world", worldServer);
                ProcedureCaoyaocong01PlantDestroyedByPlayer.executeProcedure($_dependencies3);
                $_dependencies3.clear();
                entityPlayer.getEntityData().func_74780_a("ZhongZhiXp", entityPlayer.getEntityData().func_74769_h("ZhongZhiXp") + 1.0d);
                worldServer.func_175698_g(new BlockPos(x, y, z));
            } else if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCaoyaocong02.block.func_176223_P().func_177230_c()) {
                entityPlayer.getEntityData().func_74780_a("ZhongZhiXp", entityPlayer.getEntityData().func_74769_h("ZhongZhiXp") + 2.0d);
                Map<String, Object> $_dependencies4 = new HashMap<>();
                $_dependencies4.put("entity", entityPlayer);
                $_dependencies4.put("x", Integer.valueOf(x));
                $_dependencies4.put("y", Integer.valueOf(y));
                $_dependencies4.put("z", Integer.valueOf(z));
                $_dependencies4.put("world", worldServer);
                ProcedureCaoyaocong02PlantDestroyedByPlayer.executeProcedure($_dependencies4);
                $_dependencies4.clear();
                Map<String, Object> $_dependencies5 = new HashMap<>();
                $_dependencies5.put("entity", entityPlayer);
                $_dependencies5.put("x", Integer.valueOf(x));
                $_dependencies5.put("y", Integer.valueOf(y));
                $_dependencies5.put("z", Integer.valueOf(z));
                $_dependencies5.put("world", worldServer);
                ProcedureCaoyaocong02PlantDestroyedByPlayer.executeProcedure($_dependencies5);
                $_dependencies5.clear();
                Map<String, Object> $_dependencies6 = new HashMap<>();
                $_dependencies6.put("entity", entityPlayer);
                $_dependencies6.put("x", Integer.valueOf(x));
                $_dependencies6.put("y", Integer.valueOf(y));
                $_dependencies6.put("z", Integer.valueOf(z));
                $_dependencies6.put("world", worldServer);
                ProcedureCaoyaocong02PlantDestroyedByPlayer.executeProcedure($_dependencies6);
                $_dependencies6.clear();
                worldServer.func_175698_g(new BlockPos(x, y, z));
            } else if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockCaoyaocong03.block.func_176223_P().func_177230_c()) {
                entityPlayer.getEntityData().func_74780_a("ZhongZhiXp", entityPlayer.getEntityData().func_74769_h("ZhongZhiXp") + 3.0d);
                Map<String, Object> $_dependencies7 = new HashMap<>();
                $_dependencies7.put("entity", entityPlayer);
                $_dependencies7.put("x", Integer.valueOf(x));
                $_dependencies7.put("y", Integer.valueOf(y));
                $_dependencies7.put("z", Integer.valueOf(z));
                $_dependencies7.put("world", worldServer);
                ProcedureCaoyaocong03PlantDestroyedByPlayer.executeProcedure($_dependencies7);
                $_dependencies7.clear();
                Map<String, Object> $_dependencies8 = new HashMap<>();
                $_dependencies8.put("entity", entityPlayer);
                $_dependencies8.put("x", Integer.valueOf(x));
                $_dependencies8.put("y", Integer.valueOf(y));
                $_dependencies8.put("z", Integer.valueOf(z));
                $_dependencies8.put("world", worldServer);
                ProcedureCaoyaocong03PlantDestroyedByPlayer.executeProcedure($_dependencies8);
                $_dependencies8.clear();
                Map<String, Object> $_dependencies9 = new HashMap<>();
                $_dependencies9.put("entity", entityPlayer);
                $_dependencies9.put("x", Integer.valueOf(x));
                $_dependencies9.put("y", Integer.valueOf(y));
                $_dependencies9.put("z", Integer.valueOf(z));
                $_dependencies9.put("world", worldServer);
                ProcedureCaoyaocong03PlantDestroyedByPlayer.executeProcedure($_dependencies9);
                $_dependencies9.clear();
                worldServer.func_175698_g(new BlockPos(x, y, z));
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") >= 1.0d) {
                if (entityPlayer.getEntityData().func_74767_n("小绿瓶冷却结束")) {
                    if (!itemstack.func_77942_o()) {
                        itemstack.func_77982_d(new NBTTagCompound());
                    }
                    itemstack.func_77978_p().func_74780_a("小绿瓶使用次数", 0.0d);
                    entityPlayer.getEntityData().func_74757_a("小绿瓶冷却结束", false);
                }
                if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("小绿瓶使用次数") : -1.0d) < 20.0d) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp = new BlockPos(x, y, z);
                        TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                        IBlockState _bs = worldServer.func_180495_p(_bp);
                        if (_tileEntity != null) {
                            _tileEntity.getTileData().func_74780_a("Time", (0.5d * new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi.5
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "随机值")) + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureXiaoLvPingDangYouJianDianJiFangKuaiShi.6
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "Time"));
                        }
                        worldServer.func_184138_a(_bp, _bs, _bs, 3);
                    }
                    if (!itemstack.func_77942_o()) {
                        itemstack.func_77982_d(new NBTTagCompound());
                    }
                    itemstack.func_77978_p().func_74780_a("小绿瓶使用次数", (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("小绿瓶使用次数") : -1.0d) + 1.0d);
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.VILLAGER_HAPPY, x, y, z, 10, 0.1d, 0.1d, 0.1d, 0.1d, new int[0]);
                    }
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("小绿瓶使用次数") : -1.0d) >= 20.0d) {
                        entityPlayer.getEntityData().func_74780_a("小绿瓶CD", 1200.0d);
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("小绿瓶灵力消耗殆尽,需要一个日夜的时间进行回复"), false);
                        }
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("小绿瓶还需冷却"), false);
                }
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§4已禁用非简单和普通模式下玩家使用主动能力"), false);
        }
    }
}
