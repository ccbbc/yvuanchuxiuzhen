package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectJobLevelNameSet.class */
public class ProcedureSectJobLevelNameSet extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectJobLevelNameSet(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 528);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$1] */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$2] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$8] */
    /* JADX WARN: Type inference failed for: r1v17, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$4] */
    /* JADX WARN: Type inference failed for: r2v34, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$11] */
    /* JADX WARN: Type inference failed for: r2v43, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$6] */
    /* JADX WARN: Type inference failed for: r3v18, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$12] */
    /* JADX WARN: Type inference failed for: r3v21, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$14] */
    /* JADX WARN: Type inference failed for: r3v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$9] */
    /* JADX WARN: Type inference failed for: r3v36, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$5] */
    /* JADX WARN: Type inference failed for: r4v9, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$7] */
    /* JADX WARN: Type inference failed for: r5v4, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$3] */
    /* JADX WARN: Type inference failed for: r6v16, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$10] */
    /* JADX WARN: Type inference failed for: r7v7, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet$13] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entity.getEntityData().func_74769_h("SectJobLevel") < 6.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74778_a("SectGuiTip", "§4§l权限不足");
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_82833_r().contains("(可修改)")) {
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74778_a("SectGuiTip", "§4§l命名错误");
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_82833_r().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.4
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectJobLevel"))))) {
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74778_a("SectGuiTip", "§4§l不可同名");
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
        } else {
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74778_a("SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobLevel")), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.6
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_82833_r());
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.8
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel"))).contains("&") && !world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74778_a("SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobLevel")), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.11
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.10
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobLevel"))).replace("&", "§"));
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74778_a("SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobLevel")), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.14
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelNameSet.13
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobLevel"))) + "§f");
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74778_a("SectGuiTip", "§2§l修改成功");
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
        }
        $_dependencies.put("world", world);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureSectJobUpdate.executeProcedure($_dependencies);
    }
}
