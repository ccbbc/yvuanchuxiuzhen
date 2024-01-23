package net.mcreator.yuanchujianzhu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureOpenGuiTiaoJian.class */
public class ProcedureOpenGuiTiaoJian extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureOpenGuiTiaoJian(ElementsYuanchujianzhuMod instance) {
        super(instance, 169);
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$1] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$7] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$8] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$9] */
    /* JADX WARN: Type inference failed for: r0v76, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$2] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$3] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$4] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$5] */
    /* JADX WARN: Type inference failed for: r0v88, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian$6] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74757_a("打开", true);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.1
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "神识")) {
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "灵根需求") == 1.0d && !entityPlayer.getEntityData().func_74767_n("HuoLingGen")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("沾染金灵气的宝箱，需修有火灵气之人方可开启,若强行打开则可能导致宝物损毁！"), false);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_71053_j();
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp2 = new BlockPos(x, y, z);
                        TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                        IBlockState _bs2 = world.func_180495_p(_bp2);
                        if (_tileEntity2 != null) {
                            _tileEntity2.getTileData().func_74757_a("打开", false);
                        }
                        world.func_184138_a(_bp2, _bs2, _bs2, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.3
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "灵根需求") == 2.0d && !entityPlayer.getEntityData().func_74767_n("JinLingGen")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("沾染木灵气的宝箱，需修有金灵气之人方可开启,若强行打开则可能导致宝物损毁！"), false);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_71053_j();
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp3 = new BlockPos(x, y, z);
                        TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                        IBlockState _bs3 = world.func_180495_p(_bp3);
                        if (_tileEntity3 != null) {
                            _tileEntity3.getTileData().func_74757_a("打开", false);
                        }
                        world.func_184138_a(_bp3, _bs3, _bs3, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "灵根需求") == 3.0d && !entityPlayer.getEntityData().func_74767_n("TuLingGen")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("沾染水灵气的宝箱，需修有土灵气之人方可开启,若强行打开则可能导致宝物损毁！"), false);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_71053_j();
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74757_a("打开", false);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "灵根需求") == 4.0d && !entityPlayer.getEntityData().func_74767_n("ShuiLingGen")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("沾染火灵气的宝箱，需修有水灵气之人方可开启,若强行打开则可能导致宝物损毁！"), false);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_71053_j();
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74757_a("打开", false);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.6
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "灵根需求") == 5.0d && !entityPlayer.getEntityData().func_74767_n("MuLingGen")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("沾染土灵气的宝箱，需修有木灵气之人方可开启,若强行打开则可能导致宝物损毁！"), false);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_71053_j();
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74757_a("打开", false);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                }
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.7
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "提示") && !new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.8
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "打开") && !new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureOpenGuiTiaoJian.9
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "神识")) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureTreasureChestForcedOpen.executeProcedure($_dependencies);
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74757_a("提示", true);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
                return;
            }
            return;
        }
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.func_71053_j();
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("未修灵气的凡人无法打开此箱"), false);
        }
    }
}
