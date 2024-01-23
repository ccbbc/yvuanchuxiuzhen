package net.mcreator.yvanchuxiuzhen.procedure;

import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionDingShengBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionDuoSheBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanShenChuTiBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanYingChuQiaoBuff;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureQuKeBeRightClickDo.class */
public class ProcedureQuKeBeRightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQuKeBeRightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 408);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$6] */
    /* JADX WARN: Type inference failed for: r0v108, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$7] */
    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$8] */
    /* JADX WARN: Type inference failed for: r0v112, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$9] */
    /* JADX WARN: Type inference failed for: r0v114, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$10] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$1] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$19] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$2] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$3] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$17] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$5] */
    /* JADX WARN: Type inference failed for: r2v15, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$4] */
    /* JADX WARN: Type inference failed for: r3v72, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$12] */
    /* JADX WARN: Type inference failed for: r3v77, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$13] */
    /* JADX WARN: Type inference failed for: r3v86, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$14] */
    /* JADX WARN: Type inference failed for: r3v91, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$15] */
    /* JADX WARN: Type inference failed for: r4v10, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$18] */
    /* JADX WARN: Type inference failed for: r4v44, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo$16] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "进行夺舍") && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.2
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "初始化") && !new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.3
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "防腐")) {
            if ((((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71075_bZ.field_75098_d) || entityPlayer.getEntityData().func_74769_h("Power") >= entityPlayer.getEntityData().func_74769_h("PowerMax") * new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "所需灵气数")) && !entityPlayer.getEntityData().func_74767_n("修炼") && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.5
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "夺舍人").equals("")) {
                if (((EntityLivingBase) entityPlayer).func_70644_a(PotionYuanShenChuTiBuff.potion) || entityPlayer.getEntityData().func_74767_n("YuanShenUp")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp = new BlockPos(x, y, z);
                        TileEntity _tileEntity = world.func_175625_s(_bp);
                        IBlockState _bs = world.func_180495_p(_bp);
                        if (_tileEntity != null) {
                            _tileEntity.getTileData().func_74757_a("进行夺舍", true);
                        }
                        world.func_184138_a(_bp, _bs, _bs, 3);
                    }
                } else if (((EntityLivingBase) entityPlayer).func_70644_a(PotionYuanYingChuQiaoBuff.potion) || entityPlayer.getEntityData().func_74767_n("YuanYingUp")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp2 = new BlockPos(x, y, z);
                        TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                        IBlockState _bs2 = world.func_180495_p(_bp2);
                        if (_tileEntity2 != null) {
                            _tileEntity2.getTileData().func_74757_a("进行夺舍", true);
                        }
                        world.func_184138_a(_bp2, _bs2, _bs2, 3);
                    }
                } else if ((!((EntityLivingBase) entityPlayer).func_70644_a(PotionYuanYingChuQiaoBuff.potion) || !entityPlayer.getEntityData().func_74767_n("YuanYingUp") || !((EntityLivingBase) entityPlayer).func_70644_a(PotionYuanShenChuTiBuff.potion) || !entityPlayer.getEntityData().func_74767_n("YuanShenUp")) && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("非重伤不可使用"), false);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.6
                    public boolean getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74767_n(tag);
                        }
                        return false;
                    }
                }.getValue(new BlockPos(x, y, z), "进行夺舍")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp3 = new BlockPos(x, y, z);
                        TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                        IBlockState _bs3 = world.func_180495_p(_bp3);
                        if (_tileEntity3 != null) {
                            _tileEntity3.getTileData().func_74778_a("夺舍人", entityPlayer.func_145748_c_().func_150260_c());
                        }
                        world.func_184138_a(_bp3, _bs3, _bs3, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74778_a("X", "" + x);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74778_a("Z", "" + z);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.7
                        public EnumFacing getEnumFacing(BlockPos pos) {
                            try {
                                IBlockState _bs6 = world.func_180495_p(pos);
                                UnmodifiableIterator it = _bs6.func_177228_b().keySet().iterator();
                                while (it.hasNext()) {
                                    PropertyDirection propertyDirection = (IProperty) it.next();
                                    if (propertyDirection.func_177701_a().equals("facing")) {
                                        return _bs6.func_177229_b(propertyDirection);
                                    }
                                }
                                return EnumFacing.NORTH;
                            } catch (Exception e) {
                                return EnumFacing.NORTH;
                            }
                        }
                    }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.NORTH) {
                        if (!world.field_72995_K) {
                            BlockPos _bp6 = new BlockPos(x, y, z);
                            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                            IBlockState _bs6 = world.func_180495_p(_bp6);
                            if (_tileEntity6 != null) {
                                _tileEntity6.getTileData().func_74778_a("方向", "-180");
                            }
                            world.func_184138_a(_bp6, _bs6, _bs6, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp7 = new BlockPos(x, y, z);
                            TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                            IBlockState _bs7 = world.func_180495_p(_bp7);
                            if (_tileEntity7 != null) {
                                _tileEntity7.getTileData().func_74778_a("Z", "" + (z - 2));
                            }
                            world.func_184138_a(_bp7, _bs7, _bs7, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp8 = new BlockPos(x, y, z);
                            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                            IBlockState _bs8 = world.func_180495_p(_bp8);
                            if (_tileEntity8 != null) {
                                _tileEntity8.getTileData().func_74778_a("方向2", "-360");
                            }
                            world.func_184138_a(_bp8, _bs8, _bs8, 3);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.8
                        public EnumFacing getEnumFacing(BlockPos pos) {
                            try {
                                IBlockState _bs9 = world.func_180495_p(pos);
                                UnmodifiableIterator it = _bs9.func_177228_b().keySet().iterator();
                                while (it.hasNext()) {
                                    PropertyDirection propertyDirection = (IProperty) it.next();
                                    if (propertyDirection.func_177701_a().equals("facing")) {
                                        return _bs9.func_177229_b(propertyDirection);
                                    }
                                }
                                return EnumFacing.NORTH;
                            } catch (Exception e) {
                                return EnumFacing.NORTH;
                            }
                        }
                    }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.SOUTH) {
                        if (!world.field_72995_K) {
                            BlockPos _bp9 = new BlockPos(x, y, z);
                            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                            IBlockState _bs9 = world.func_180495_p(_bp9);
                            if (_tileEntity9 != null) {
                                _tileEntity9.getTileData().func_74778_a("方向", "-360");
                            }
                            world.func_184138_a(_bp9, _bs9, _bs9, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp10 = new BlockPos(x, y, z);
                            TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                            IBlockState _bs10 = world.func_180495_p(_bp10);
                            if (_tileEntity10 != null) {
                                _tileEntity10.getTileData().func_74778_a("Z", "" + (z + 2));
                            }
                            world.func_184138_a(_bp10, _bs10, _bs10, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp11 = new BlockPos(x, y, z);
                            TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                            IBlockState _bs11 = world.func_180495_p(_bp11);
                            if (_tileEntity11 != null) {
                                _tileEntity11.getTileData().func_74778_a("方向2", "-180");
                            }
                            world.func_184138_a(_bp11, _bs11, _bs11, 3);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.9
                        public EnumFacing getEnumFacing(BlockPos pos) {
                            try {
                                IBlockState _bs12 = world.func_180495_p(pos);
                                UnmodifiableIterator it = _bs12.func_177228_b().keySet().iterator();
                                while (it.hasNext()) {
                                    PropertyDirection propertyDirection = (IProperty) it.next();
                                    if (propertyDirection.func_177701_a().equals("facing")) {
                                        return _bs12.func_177229_b(propertyDirection);
                                    }
                                }
                                return EnumFacing.NORTH;
                            } catch (Exception e) {
                                return EnumFacing.NORTH;
                            }
                        }
                    }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.WEST) {
                        if (!world.field_72995_K) {
                            BlockPos _bp12 = new BlockPos(x, y, z);
                            TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                            IBlockState _bs12 = world.func_180495_p(_bp12);
                            if (_tileEntity12 != null) {
                                _tileEntity12.getTileData().func_74778_a("方向", "-270");
                            }
                            world.func_184138_a(_bp12, _bs12, _bs12, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp13 = new BlockPos(x, y, z);
                            TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                            IBlockState _bs13 = world.func_180495_p(_bp13);
                            if (_tileEntity13 != null) {
                                _tileEntity13.getTileData().func_74778_a("X", "" + (x - 2));
                            }
                            world.func_184138_a(_bp13, _bs13, _bs13, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp14 = new BlockPos(x, y, z);
                            TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                            IBlockState _bs14 = world.func_180495_p(_bp14);
                            if (_tileEntity14 != null) {
                                _tileEntity14.getTileData().func_74778_a("方向2", "-90");
                            }
                            world.func_184138_a(_bp14, _bs14, _bs14, 3);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.10
                        public EnumFacing getEnumFacing(BlockPos pos) {
                            try {
                                IBlockState _bs15 = world.func_180495_p(pos);
                                UnmodifiableIterator it = _bs15.func_177228_b().keySet().iterator();
                                while (it.hasNext()) {
                                    PropertyDirection propertyDirection = (IProperty) it.next();
                                    if (propertyDirection.func_177701_a().equals("facing")) {
                                        return _bs15.func_177229_b(propertyDirection);
                                    }
                                }
                                return EnumFacing.NORTH;
                            } catch (Exception e) {
                                return EnumFacing.NORTH;
                            }
                        }
                    }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.EAST) {
                        if (!world.field_72995_K) {
                            BlockPos _bp15 = new BlockPos(x, y, z);
                            TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                            IBlockState _bs15 = world.func_180495_p(_bp15);
                            if (_tileEntity15 != null) {
                                _tileEntity15.getTileData().func_74778_a("方向", "-90");
                            }
                            world.func_184138_a(_bp15, _bs15, _bs15, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp16 = new BlockPos(x, y, z);
                            TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                            IBlockState _bs16 = world.func_180495_p(_bp16);
                            if (_tileEntity16 != null) {
                                _tileEntity16.getTileData().func_74778_a("X", "" + (x + 2));
                            }
                            world.func_184138_a(_bp16, _bs16, _bs16, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp17 = new BlockPos(x, y, z);
                            TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                            IBlockState _bs17 = world.func_180495_p(_bp17);
                            if (_tileEntity17 != null) {
                                _tileEntity17.getTileData().func_74778_a("方向2", "-270");
                            }
                            world.func_184138_a(_bp17, _bs17, _bs17, 3);
                        }
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.11
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
                        }, "tp " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.12
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "夺舍人") + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.13
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "X") + " " + y + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.14
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "Z") + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.15
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "方向2") + " 0");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp18 = new BlockPos(x, y, z);
                        TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                        IBlockState _bs18 = world.func_180495_p(_bp18);
                        if (_tileEntity18 != null) {
                            _tileEntity18.getTileData().func_74757_a("夺舍进行", true);
                        }
                        world.func_184138_a(_bp18, _bs18, _bs18, 3);
                    }
                    entityPlayer.getEntityData().func_74757_a("夺舍进行", true);
                    entityPlayer.getEntityData().func_74780_a("躯壳清除计时", 0.0d);
                    entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (entityPlayer.getEntityData().func_74769_h("PowerMax") * new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.16
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "所需灵气数")));
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76437_t, 120, 255, false, false));
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76419_f, 120, 255, false, false));
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76439_r, 120, 255, false, false));
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76429_m, 120, 255, false, false));
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76424_c, 120, 0, false, false));
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(PotionDingShengBuff.potion, 120, 0, false, false));
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(PotionDuoSheBuff.potion, 120, 0, false, false));
                    }
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("进行夺舍！"), false);
                    }
                }
            } else if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.17
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "夺舍人").equals("")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("此躯壳正在被夺舍"), false);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("Power") < entityPlayer.getEntityData().func_74769_h("PowerMax") * 0.15d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足总体的" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.18
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所需灵气") + "%，不可使用"), false);
                }
            } else if (entityPlayer.getEntityData().func_74767_n("修炼") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("修炼时不可使用"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBeRightClickDo.19
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "防腐") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("此体已失去活性，无法夺舍"), false);
        }
    }
}
