package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBenMingJinJie4.class */
public class ProcedureBenMingJinJie4 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBenMingJinJie4(ElementsFabaokuozhanMod instance) {
        super(instance, 507);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$4] */
    /* JADX WARN: Type inference failed for: r0v107, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$5] */
    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$6] */
    /* JADX WARN: Type inference failed for: r0v119, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$7] */
    /* JADX WARN: Type inference failed for: r0v125, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$8] */
    /* JADX WARN: Type inference failed for: r0v131, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$9] */
    /* JADX WARN: Type inference failed for: r0v137, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$10] */
    /* JADX WARN: Type inference failed for: r0v143, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$11] */
    /* JADX WARN: Type inference failed for: r0v149, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$12] */
    /* JADX WARN: Type inference failed for: r0v165, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$2] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$1] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$13] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$15] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$16] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$17] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$18] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$19] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$20] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$21] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$22] */
    /* JADX WARN: Type inference failed for: r0v91, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$14] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("本命阶段") : -1.0d) != 1.0d) {
            if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.13
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("本命阶段") : -1.0d) == 2.0d) {
                ItemStack _stack = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.15
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74780_a("附加法攻", 2484.0d);
                ItemStack _stack2 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.16
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                _stack2.func_77978_p().func_74780_a("法攻增幅", 0.2d);
                ItemStack _stack3 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74780_a("灵力消耗", 4650.0d);
                ItemStack _stack4 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.18
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                _stack4.func_77978_p().func_74780_a("真元消耗", 231.0d);
                ItemStack _stack5 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.19
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack5.func_77942_o()) {
                    _stack5.func_77982_d(new NBTTagCompound());
                }
                _stack5.func_77978_p().func_74780_a("威能伤害", 14475.0d);
                ItemStack _stack6 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.20
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack6.func_77942_o()) {
                    _stack6.func_77982_d(new NBTTagCompound());
                }
                _stack6.func_77978_p().func_74780_a("普攻灵力", 516.0d);
                ItemStack _stack7 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.21
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack7.func_77942_o()) {
                    _stack7.func_77982_d(new NBTTagCompound());
                }
                _stack7.func_77978_p().func_74778_a("境界", "§d化神期本命法宝");
                ItemStack _stack8 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.22
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (!_stack8.func_77942_o()) {
                    _stack8.func_77982_d(new NBTTagCompound());
                }
                _stack8.func_77978_p().func_74780_a("普攻真元", 102.0d);
                return;
            }
            return;
        }
        ItemStack _stack9 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack9.func_77942_o()) {
            _stack9.func_77982_d(new NBTTagCompound());
        }
        _stack9.func_77978_p().func_74780_a("附加法攻", 825.0d);
        ItemStack _stack10 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack10.func_77942_o()) {
            _stack10.func_77982_d(new NBTTagCompound());
        }
        _stack10.func_77978_p().func_74780_a("法攻增幅", 0.15d);
        ItemStack _stack11 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack11.func_77942_o()) {
            _stack11.func_77982_d(new NBTTagCompound());
        }
        _stack11.func_77978_p().func_74780_a("灵力消耗", 2675.0d);
        ItemStack _stack12 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.6
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack12.func_77942_o()) {
            _stack12.func_77982_d(new NBTTagCompound());
        }
        _stack12.func_77978_p().func_74780_a("真元消耗", 132.0d);
        ItemStack _stack13 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack13.func_77942_o()) {
            _stack13.func_77982_d(new NBTTagCompound());
        }
        _stack13.func_77978_p().func_74780_a("威能伤害", 5390.0d);
        ItemStack _stack14 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.8
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack14.func_77942_o()) {
            _stack14.func_77982_d(new NBTTagCompound());
        }
        _stack14.func_77978_p().func_74780_a("普攻灵力", 171.0d);
        ItemStack _stack15 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack15.func_77942_o()) {
            _stack15.func_77982_d(new NBTTagCompound());
        }
        _stack15.func_77978_p().func_74780_a("普攻真元", 25.0d);
        ItemStack _stack16 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack16.func_77942_o()) {
            _stack16.func_77982_d(new NBTTagCompound());
        }
        _stack16.func_77978_p().func_74778_a("材料", "寒潭精铁");
        ItemStack _stack17 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.11
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack17.func_77942_o()) {
            _stack17.func_77982_d(new NBTTagCompound());
        }
        _stack17.func_77978_p().func_74778_a("境界", "§d元婴期本命法宝");
        ItemStack _stack18 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie4.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0);
        if (!_stack18.func_77942_o()) {
            _stack18.func_77982_d(new NBTTagCompound());
        }
        _stack18.func_77978_p().func_74780_a("材料数量", 9.0d);
    }
}
