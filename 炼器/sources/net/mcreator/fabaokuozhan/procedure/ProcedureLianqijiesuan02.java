package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCangYunFeiHuo;
import net.mcreator.fabaokuozhan.item.ItemFaBao33;
import net.mcreator.fabaokuozhan.item.ItemFabao0101;
import net.mcreator.fabaokuozhan.item.ItemFabao0301;
import net.mcreator.fabaokuozhan.item.ItemFabao0302;
import net.mcreator.fabaokuozhan.item.ItemFabao04;
import net.mcreator.fabaokuozhan.item.ItemFabao0501;
import net.mcreator.fabaokuozhan.item.ItemFabao0701;
import net.mcreator.fabaokuozhan.item.ItemFabao0801;
import net.mcreator.fabaokuozhan.item.ItemFabao13;
import net.mcreator.fabaokuozhan.item.ItemFabao1401;
import net.mcreator.fabaokuozhan.item.ItemFabao1501;
import net.mcreator.fabaokuozhan.item.ItemFabao17;
import net.mcreator.fabaokuozhan.item.ItemFabao21;
import net.mcreator.fabaokuozhan.item.ItemFabao22;
import net.mcreator.fabaokuozhan.item.ItemFabao31;
import net.mcreator.fabaokuozhan.item.ItemFabao32;
import net.mcreator.fabaokuozhan.item.ItemFuHuoHuLu;
import net.mcreator.fabaokuozhan.item.ItemLeiJiMuJian;
import net.mcreator.fabaokuozhan.item.ItemQiYinXiao;
import net.mcreator.fabaokuozhan.item.ItemQingZuFengYunJian;
import net.mcreator.fabaokuozhan.item.ItemSuppressMonsterSword2;
import net.mcreator.fabaokuozhan.item.ItemSuppressMonsterSword3;
import net.mcreator.fabaokuozhan.item.ItemSuppressMonsterSword4;
import net.mcreator.fabaokuozhan.item.ItemSuppressMonsterSword5;
import net.mcreator.fabaokuozhan.item.ItemXingDuDuanDAo;
import net.mcreator.fabaokuozhan.item.ItemYuanCiShenShan;
import net.mcreator.fabaokuozhan.item.ItemZhuQueHuan;
import net.mcreator.fabaokuozhan.item.ItemZhuiHunZhen;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianqijiesuan02.class */
public class ProcedureLianqijiesuan02 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianqijiesuan02(ElementsFabaokuozhanMod instance) {
        super(instance, 166);
    }

    /* JADX WARN: Type inference failed for: r0v1000, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$34] */
    /* JADX WARN: Type inference failed for: r0v1006, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$36] */
    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$92] */
    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$95] */
    /* JADX WARN: Type inference failed for: r0v1045, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$30] */
    /* JADX WARN: Type inference failed for: r0v1051, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$32] */
    /* JADX WARN: Type inference failed for: r0v107, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$98] */
    /* JADX WARN: Type inference failed for: r0v1090, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$26] */
    /* JADX WARN: Type inference failed for: r0v1096, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$28] */
    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$101] */
    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$104] */
    /* JADX WARN: Type inference failed for: r0v1135, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$22] */
    /* JADX WARN: Type inference failed for: r0v1141, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$24] */
    /* JADX WARN: Type inference failed for: r0v116, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$107] */
    /* JADX WARN: Type inference failed for: r0v1180, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$18] */
    /* JADX WARN: Type inference failed for: r0v1186, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$20] */
    /* JADX WARN: Type inference failed for: r0v1225, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$14] */
    /* JADX WARN: Type inference failed for: r0v1231, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$16] */
    /* JADX WARN: Type inference failed for: r0v1270, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$10] */
    /* JADX WARN: Type inference failed for: r0v1276, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$11] */
    /* JADX WARN: Type inference failed for: r0v1315, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$6] */
    /* JADX WARN: Type inference failed for: r0v1321, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$8] */
    /* JADX WARN: Type inference failed for: r0v1360, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$2] */
    /* JADX WARN: Type inference failed for: r0v1366, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$4] */
    /* JADX WARN: Type inference failed for: r0v142, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$105] */
    /* JADX WARN: Type inference failed for: r0v180, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$102] */
    /* JADX WARN: Type inference failed for: r0v218, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$99] */
    /* JADX WARN: Type inference failed for: r0v256, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$96] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$1] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$5] */
    /* JADX WARN: Type inference failed for: r0v294, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$93] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$9] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$13] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$17] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$21] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$25] */
    /* JADX WARN: Type inference failed for: r0v455, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$85] */
    /* JADX WARN: Type inference failed for: r0v461, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$87] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$29] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$33] */
    /* JADX WARN: Type inference failed for: r0v500, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$80] */
    /* JADX WARN: Type inference failed for: r0v506, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$82] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$37] */
    /* JADX WARN: Type inference failed for: r0v545, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$76] */
    /* JADX WARN: Type inference failed for: r0v551, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$78] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$41] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$45] */
    /* JADX WARN: Type inference failed for: r0v590, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$72] */
    /* JADX WARN: Type inference failed for: r0v596, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$74] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$49] */
    /* JADX WARN: Type inference failed for: r0v635, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$68] */
    /* JADX WARN: Type inference failed for: r0v641, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$70] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$53] */
    /* JADX WARN: Type inference failed for: r0v673, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$62] */
    /* JADX WARN: Type inference failed for: r0v676, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$63] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$57] */
    /* JADX WARN: Type inference failed for: r0v682, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$64] */
    /* JADX WARN: Type inference failed for: r0v688, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$66] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$61] */
    /* JADX WARN: Type inference failed for: r0v730, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$58] */
    /* JADX WARN: Type inference failed for: r0v736, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$60] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$67] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$71] */
    /* JADX WARN: Type inference failed for: r0v775, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$54] */
    /* JADX WARN: Type inference failed for: r0v781, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$56] */
    /* JADX WARN: Type inference failed for: r0v80, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$75] */
    /* JADX WARN: Type inference failed for: r0v820, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$50] */
    /* JADX WARN: Type inference failed for: r0v826, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$52] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$79] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$83] */
    /* JADX WARN: Type inference failed for: r0v865, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$46] */
    /* JADX WARN: Type inference failed for: r0v871, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$48] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$88] */
    /* JADX WARN: Type inference failed for: r0v910, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$42] */
    /* JADX WARN: Type inference failed for: r0v916, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$44] */
    /* JADX WARN: Type inference failed for: r0v92, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$89] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$90] */
    /* JADX WARN: Type inference failed for: r0v955, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$38] */
    /* JADX WARN: Type inference failed for: r0v961, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$40] */
    /* JADX WARN: Type inference failed for: r0v98, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$91] */
    /* JADX WARN: Type inference failed for: r2v117, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$106] */
    /* JADX WARN: Type inference failed for: r2v132, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$103] */
    /* JADX WARN: Type inference failed for: r2v147, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$100] */
    /* JADX WARN: Type inference failed for: r2v162, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$97] */
    /* JADX WARN: Type inference failed for: r2v177, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$94] */
    /* JADX WARN: Type inference failed for: r2v227, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$86] */
    /* JADX WARN: Type inference failed for: r2v247, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$81] */
    /* JADX WARN: Type inference failed for: r2v267, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$77] */
    /* JADX WARN: Type inference failed for: r2v287, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$73] */
    /* JADX WARN: Type inference failed for: r2v307, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$69] */
    /* JADX WARN: Type inference failed for: r2v333, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$65] */
    /* JADX WARN: Type inference failed for: r2v354, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$59] */
    /* JADX WARN: Type inference failed for: r2v374, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$55] */
    /* JADX WARN: Type inference failed for: r2v394, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$51] */
    /* JADX WARN: Type inference failed for: r2v414, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$47] */
    /* JADX WARN: Type inference failed for: r2v434, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$43] */
    /* JADX WARN: Type inference failed for: r2v454, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$39] */
    /* JADX WARN: Type inference failed for: r2v474, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$35] */
    /* JADX WARN: Type inference failed for: r2v494, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$31] */
    /* JADX WARN: Type inference failed for: r2v514, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$27] */
    /* JADX WARN: Type inference failed for: r2v534, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$23] */
    /* JADX WARN: Type inference failed for: r2v554, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$19] */
    /* JADX WARN: Type inference failed for: r2v574, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$15] */
    /* JADX WARN: Type inference failed for: r2v598, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$12] */
    /* JADX WARN: Type inference failed for: r2v614, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$7] */
    /* JADX WARN: Type inference failed for: r2v634, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$3] */
    /* JADX WARN: Type inference failed for: r3v35, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$111] */
    /* JADX WARN: Type inference failed for: r3v47, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$109] */
    /* JADX WARN: Type inference failed for: r4v36, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02$112] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        ItemStack itemStack = ItemStack.field_190927_a;
        world.func_152378_a(world.func_175625_s(new BlockPos(x, y, z)).getTileData().func_186857_a("thisPlayerUniqueId"));
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 1.0d) {
            TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
                ItemStack _setstack = new ItemStack(ItemFabao0101.block, 1);
                _setstack.func_190920_e(1);
                func_175625_s.func_70299_a(6, _setstack);
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            ItemStack _stack = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                    if (func_175625_s2 instanceof TileEntityLockableLoot) {
                        return func_175625_s2.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack.func_77942_o()) {
                _stack.func_77982_d(new NBTTagCompound());
            }
            _stack.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.3
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack2 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.4
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                    if (func_175625_s2 instanceof TileEntityLockableLoot) {
                        return func_175625_s2.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack2.func_77942_o()) {
                _stack2.func_77982_d(new NBTTagCompound());
            }
            _stack2.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 2.0d) {
            TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s2 != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack2 = new ItemStack(ItemFabao0302.block, 1);
                _setstack2.func_190920_e(1);
                func_175625_s2.func_70299_a(6, _setstack2);
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            ItemStack _stack3 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.6
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                        return func_175625_s3.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack3.func_77942_o()) {
                _stack3.func_77982_d(new NBTTagCompound());
            }
            _stack3.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.7
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack4 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                        return func_175625_s3.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack4.func_77942_o()) {
                _stack4.func_77982_d(new NBTTagCompound());
            }
            _stack4.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 3.0d) {
            TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s3 != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack3 = new ItemStack(ItemFabao0301.block, 1);
                _setstack3.func_190920_e(1);
                func_175625_s3.func_70299_a(6, _setstack3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("leixing", 2.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            ItemStack _stack5 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.10
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                    if (func_175625_s4 instanceof TileEntityLockableLoot) {
                        return func_175625_s4.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack5.func_77942_o()) {
                _stack5.func_77982_d(new NBTTagCompound());
            }
            _stack5.func_77978_p().func_74780_a("HideFlags", 2.0d);
            ItemStack _stack6 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                    if (func_175625_s4 instanceof TileEntityLockableLoot) {
                        return func_175625_s4.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack6.func_77942_o()) {
                _stack6.func_77982_d(new NBTTagCompound());
            }
            _stack6.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.12
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 4.0d) {
            TileEntityLockableLoot func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s4 != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack4 = new ItemStack(ItemFabao04.block, 1);
                _setstack4.func_190920_e(1);
                func_175625_s4.func_70299_a(6, _setstack4);
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
            ItemStack _stack7 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s5 = world.func_175625_s(pos);
                    if (func_175625_s5 instanceof TileEntityLockableLoot) {
                        return func_175625_s5.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack7.func_77942_o()) {
                _stack7.func_77982_d(new NBTTagCompound());
            }
            _stack7.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.15
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack8 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.16
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s5 = world.func_175625_s(pos);
                    if (func_175625_s5 instanceof TileEntityLockableLoot) {
                        return func_175625_s5.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack8.func_77942_o()) {
                _stack8.func_77982_d(new NBTTagCompound());
            }
            _stack8.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.17
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 5.0d) {
            TileEntityLockableLoot func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s5 != null && (func_175625_s5 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack5 = new ItemStack(ItemFabao0501.block, 1);
                _setstack5.func_190920_e(1);
                func_175625_s5.func_70299_a(6, _setstack5);
            }
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            ItemStack _stack9 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.18
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s6 = world.func_175625_s(pos);
                    if (func_175625_s6 instanceof TileEntityLockableLoot) {
                        return func_175625_s6.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack9.func_77942_o()) {
                _stack9.func_77982_d(new NBTTagCompound());
            }
            _stack9.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.19
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack10 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.20
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s6 = world.func_175625_s(pos);
                    if (func_175625_s6 instanceof TileEntityLockableLoot) {
                        return func_175625_s6.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack10.func_77942_o()) {
                _stack10.func_77982_d(new NBTTagCompound());
            }
            _stack10.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.21
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 6.0d) {
            TileEntityLockableLoot func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s6 != null && (func_175625_s6 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack6 = new ItemStack(ItemFuHuoHuLu.block, 1);
                _setstack6.func_190920_e(1);
                func_175625_s6.func_70299_a(6, _setstack6);
            }
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
            ItemStack _stack11 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.22
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                    if (func_175625_s7 instanceof TileEntityLockableLoot) {
                        return func_175625_s7.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack11.func_77942_o()) {
                _stack11.func_77982_d(new NBTTagCompound());
            }
            _stack11.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.23
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack12 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.24
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                    if (func_175625_s7 instanceof TileEntityLockableLoot) {
                        return func_175625_s7.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack12.func_77942_o()) {
                _stack12.func_77982_d(new NBTTagCompound());
            }
            _stack12.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 10.0d) {
            TileEntityLockableLoot func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s7 != null && (func_175625_s7 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack7 = new ItemStack(ItemFabao13.block, 1);
                _setstack7.func_190920_e(1);
                func_175625_s7.func_70299_a(6, _setstack7);
            }
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
            ItemStack _stack13 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.26
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s8 = world.func_175625_s(pos);
                    if (func_175625_s8 instanceof TileEntityLockableLoot) {
                        return func_175625_s8.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack13.func_77942_o()) {
                _stack13.func_77982_d(new NBTTagCompound());
            }
            _stack13.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.27
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack14 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.28
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s8 = world.func_175625_s(pos);
                    if (func_175625_s8 instanceof TileEntityLockableLoot) {
                        return func_175625_s8.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack14.func_77942_o()) {
                _stack14.func_77982_d(new NBTTagCompound());
            }
            _stack14.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.29
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 11.0d) {
            TileEntityLockableLoot func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s8 != null && (func_175625_s8 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack8 = new ItemStack(ItemFabao1401.block, 1);
                _setstack8.func_190920_e(1);
                func_175625_s8.func_70299_a(6, _setstack8);
            }
            if (!world.field_72995_K) {
                BlockPos _bp15 = new BlockPos(x, y, z);
                TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                IBlockState _bs15 = world.func_180495_p(_bp15);
                if (_tileEntity15 != null) {
                    _tileEntity15.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp15, _bs15, _bs15, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
            ItemStack _stack15 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.30
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                    if (func_175625_s9 instanceof TileEntityLockableLoot) {
                        return func_175625_s9.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack15.func_77942_o()) {
                _stack15.func_77982_d(new NBTTagCompound());
            }
            _stack15.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.31
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack16 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.32
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                    if (func_175625_s9 instanceof TileEntityLockableLoot) {
                        return func_175625_s9.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack16.func_77942_o()) {
                _stack16.func_77982_d(new NBTTagCompound());
            }
            _stack16.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.33
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 12.0d) {
            TileEntityLockableLoot func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s9 != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack9 = new ItemStack(ItemFabao1501.block, 1);
                _setstack9.func_190920_e(1);
                func_175625_s9.func_70299_a(6, _setstack9);
            }
            if (!world.field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                IBlockState _bs17 = world.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                IBlockState _bs18 = world.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
            ItemStack _stack17 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.34
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s10 = world.func_175625_s(pos);
                    if (func_175625_s10 instanceof TileEntityLockableLoot) {
                        return func_175625_s10.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack17.func_77942_o()) {
                _stack17.func_77982_d(new NBTTagCompound());
            }
            _stack17.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.35
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack18 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.36
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s10 = world.func_175625_s(pos);
                    if (func_175625_s10 instanceof TileEntityLockableLoot) {
                        return func_175625_s10.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack18.func_77942_o()) {
                _stack18.func_77982_d(new NBTTagCompound());
            }
            _stack18.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.37
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 13.0d) {
            TileEntityLockableLoot func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s10 != null && (func_175625_s10 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack10 = new ItemStack(ItemFabao17.block, 1);
                _setstack10.func_190920_e(1);
                func_175625_s10.func_70299_a(6, _setstack10);
            }
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp20 = new BlockPos(x, y, z);
                TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                IBlockState _bs20 = world.func_180495_p(_bp20);
                if (_tileEntity20 != null) {
                    _tileEntity20.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp20, _bs20, _bs20, 3);
            }
            ItemStack _stack19 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.38
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s11 = world.func_175625_s(pos);
                    if (func_175625_s11 instanceof TileEntityLockableLoot) {
                        return func_175625_s11.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack19.func_77942_o()) {
                _stack19.func_77982_d(new NBTTagCompound());
            }
            _stack19.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.39
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack20 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.40
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s11 = world.func_175625_s(pos);
                    if (func_175625_s11 instanceof TileEntityLockableLoot) {
                        return func_175625_s11.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack20.func_77942_o()) {
                _stack20.func_77982_d(new NBTTagCompound());
            }
            _stack20.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.41
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 15.0d) {
            TileEntityLockableLoot func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s11 != null && (func_175625_s11 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack11 = new ItemStack(ItemFabao22.block, 1);
                _setstack11.func_190920_e(1);
                func_175625_s11.func_70299_a(6, _setstack11);
            }
            if (!world.field_72995_K) {
                BlockPos _bp21 = new BlockPos(x, y, z);
                TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                IBlockState _bs21 = world.func_180495_p(_bp21);
                if (_tileEntity21 != null) {
                    _tileEntity21.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp21, _bs21, _bs21, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp22 = new BlockPos(x, y, z);
                TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                IBlockState _bs22 = world.func_180495_p(_bp22);
                if (_tileEntity22 != null) {
                    _tileEntity22.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp22, _bs22, _bs22, 3);
            }
            ItemStack _stack21 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.42
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s12 = world.func_175625_s(pos);
                    if (func_175625_s12 instanceof TileEntityLockableLoot) {
                        return func_175625_s12.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack21.func_77942_o()) {
                _stack21.func_77982_d(new NBTTagCompound());
            }
            _stack21.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.43
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack22 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.44
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s12 = world.func_175625_s(pos);
                    if (func_175625_s12 instanceof TileEntityLockableLoot) {
                        return func_175625_s12.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack22.func_77942_o()) {
                _stack22.func_77982_d(new NBTTagCompound());
            }
            _stack22.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.45
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 16.0d) {
            TileEntityLockableLoot func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s12 != null && (func_175625_s12 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack12 = new ItemStack(ItemLeiJiMuJian.block, 1);
                _setstack12.func_190920_e(1);
                func_175625_s12.func_70299_a(6, _setstack12);
            }
            if (!world.field_72995_K) {
                BlockPos _bp23 = new BlockPos(x, y, z);
                TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                IBlockState _bs23 = world.func_180495_p(_bp23);
                if (_tileEntity23 != null) {
                    _tileEntity23.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp23, _bs23, _bs23, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp24 = new BlockPos(x, y, z);
                TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                IBlockState _bs24 = world.func_180495_p(_bp24);
                if (_tileEntity24 != null) {
                    _tileEntity24.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp24, _bs24, _bs24, 3);
            }
            ItemStack _stack23 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.46
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s13 = world.func_175625_s(pos);
                    if (func_175625_s13 instanceof TileEntityLockableLoot) {
                        return func_175625_s13.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack23.func_77942_o()) {
                _stack23.func_77982_d(new NBTTagCompound());
            }
            _stack23.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.47
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack24 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.48
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s13 = world.func_175625_s(pos);
                    if (func_175625_s13 instanceof TileEntityLockableLoot) {
                        return func_175625_s13.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack24.func_77942_o()) {
                _stack24.func_77982_d(new NBTTagCompound());
            }
            _stack24.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.49
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 20.0d) {
            TileEntityLockableLoot func_175625_s13 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s13 != null && (func_175625_s13 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack13 = new ItemStack(ItemFabao32.block, 1);
                _setstack13.func_190920_e(1);
                func_175625_s13.func_70299_a(6, _setstack13);
            }
            if (!world.field_72995_K) {
                BlockPos _bp25 = new BlockPos(x, y, z);
                TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                IBlockState _bs25 = world.func_180495_p(_bp25);
                if (_tileEntity25 != null) {
                    _tileEntity25.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp25, _bs25, _bs25, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp26 = new BlockPos(x, y, z);
                TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                IBlockState _bs26 = world.func_180495_p(_bp26);
                if (_tileEntity26 != null) {
                    _tileEntity26.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp26, _bs26, _bs26, 3);
            }
            ItemStack _stack25 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.50
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s14 = world.func_175625_s(pos);
                    if (func_175625_s14 instanceof TileEntityLockableLoot) {
                        return func_175625_s14.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack25.func_77942_o()) {
                _stack25.func_77982_d(new NBTTagCompound());
            }
            _stack25.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.51
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack26 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.52
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s14 = world.func_175625_s(pos);
                    if (func_175625_s14 instanceof TileEntityLockableLoot) {
                        return func_175625_s14.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack26.func_77942_o()) {
                _stack26.func_77982_d(new NBTTagCompound());
            }
            _stack26.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.53
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 21.0d) {
            TileEntityLockableLoot func_175625_s14 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s14 != null && (func_175625_s14 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack14 = new ItemStack(ItemFaBao33.block, 1);
                _setstack14.func_190920_e(1);
                func_175625_s14.func_70299_a(6, _setstack14);
            }
            if (!world.field_72995_K) {
                BlockPos _bp27 = new BlockPos(x, y, z);
                TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                IBlockState _bs27 = world.func_180495_p(_bp27);
                if (_tileEntity27 != null) {
                    _tileEntity27.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp27, _bs27, _bs27, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp28 = new BlockPos(x, y, z);
                TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                IBlockState _bs28 = world.func_180495_p(_bp28);
                if (_tileEntity28 != null) {
                    _tileEntity28.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp28, _bs28, _bs28, 3);
            }
            ItemStack _stack27 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.54
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s15 = world.func_175625_s(pos);
                    if (func_175625_s15 instanceof TileEntityLockableLoot) {
                        return func_175625_s15.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack27.func_77942_o()) {
                _stack27.func_77982_d(new NBTTagCompound());
            }
            _stack27.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.55
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack28 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.56
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s15 = world.func_175625_s(pos);
                    if (func_175625_s15 instanceof TileEntityLockableLoot) {
                        return func_175625_s15.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack28.func_77942_o()) {
                _stack28.func_77982_d(new NBTTagCompound());
            }
            _stack28.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.57
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 22.0d) {
            TileEntityLockableLoot func_175625_s15 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s15 != null && (func_175625_s15 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack15 = new ItemStack(ItemFabao21.block, 1);
                _setstack15.func_190920_e(1);
                func_175625_s15.func_70299_a(6, _setstack15);
            }
            if (!world.field_72995_K) {
                BlockPos _bp29 = new BlockPos(x, y, z);
                TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                IBlockState _bs29 = world.func_180495_p(_bp29);
                if (_tileEntity29 != null) {
                    _tileEntity29.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp29, _bs29, _bs29, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp30 = new BlockPos(x, y, z);
                TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                IBlockState _bs30 = world.func_180495_p(_bp30);
                if (_tileEntity30 != null) {
                    _tileEntity30.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp30, _bs30, _bs30, 3);
            }
            ItemStack _stack29 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.58
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s16 = world.func_175625_s(pos);
                    if (func_175625_s16 instanceof TileEntityLockableLoot) {
                        return func_175625_s16.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack29.func_77942_o()) {
                _stack29.func_77982_d(new NBTTagCompound());
            }
            _stack29.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.59
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack30 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.60
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s16 = world.func_175625_s(pos);
                    if (func_175625_s16 instanceof TileEntityLockableLoot) {
                        return func_175625_s16.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack30.func_77942_o()) {
                _stack30.func_77982_d(new NBTTagCompound());
            }
            _stack30.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.61
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 23.0d) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.62
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s16 = world.func_175625_s(pos);
                    if (func_175625_s16 instanceof TileEntityLockableLoot) {
                        return func_175625_s16.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s16 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s16 != null && (func_175625_s16 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack16 = new ItemStack(ItemFabao31.block, 1);
                    _setstack16.func_190920_e(1);
                    func_175625_s16.func_70299_a(6, _setstack16);
                }
            } else {
                new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.63
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                        if (func_175625_s17 instanceof TileEntityLockableLoot) {
                            return func_175625_s17.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
            if (!world.field_72995_K) {
                BlockPos _bp31 = new BlockPos(x, y, z);
                TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                IBlockState _bs31 = world.func_180495_p(_bp31);
                if (_tileEntity31 != null) {
                    _tileEntity31.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp31, _bs31, _bs31, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp32 = new BlockPos(x, y, z);
                TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                IBlockState _bs32 = world.func_180495_p(_bp32);
                if (_tileEntity32 != null) {
                    _tileEntity32.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp32, _bs32, _bs32, 3);
            }
            ItemStack _stack31 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.64
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                    if (func_175625_s17 instanceof TileEntityLockableLoot) {
                        return func_175625_s17.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack31.func_77942_o()) {
                _stack31.func_77982_d(new NBTTagCompound());
            }
            _stack31.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.65
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack32 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.66
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                    if (func_175625_s17 instanceof TileEntityLockableLoot) {
                        return func_175625_s17.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack32.func_77942_o()) {
                _stack32.func_77982_d(new NBTTagCompound());
            }
            _stack32.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.67
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 24.0d) {
            TileEntityLockableLoot func_175625_s17 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s17 != null && (func_175625_s17 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack17 = new ItemStack(ItemFabao0801.block, 1);
                _setstack17.func_190920_e(1);
                func_175625_s17.func_70299_a(6, _setstack17);
            }
            if (!world.field_72995_K) {
                BlockPos _bp33 = new BlockPos(x, y, z);
                TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                IBlockState _bs33 = world.func_180495_p(_bp33);
                if (_tileEntity33 != null) {
                    _tileEntity33.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp33, _bs33, _bs33, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp34 = new BlockPos(x, y, z);
                TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                IBlockState _bs34 = world.func_180495_p(_bp34);
                if (_tileEntity34 != null) {
                    _tileEntity34.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp34, _bs34, _bs34, 3);
            }
            ItemStack _stack33 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.68
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s18 = world.func_175625_s(pos);
                    if (func_175625_s18 instanceof TileEntityLockableLoot) {
                        return func_175625_s18.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack33.func_77942_o()) {
                _stack33.func_77982_d(new NBTTagCompound());
            }
            _stack33.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.69
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack34 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.70
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s18 = world.func_175625_s(pos);
                    if (func_175625_s18 instanceof TileEntityLockableLoot) {
                        return func_175625_s18.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack34.func_77942_o()) {
                _stack34.func_77982_d(new NBTTagCompound());
            }
            _stack34.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.71
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 25.0d) {
            TileEntityLockableLoot func_175625_s18 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s18 != null && (func_175625_s18 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack18 = new ItemStack(ItemXingDuDuanDAo.block, 1);
                _setstack18.func_190920_e(1);
                func_175625_s18.func_70299_a(6, _setstack18);
            }
            if (!world.field_72995_K) {
                BlockPos _bp35 = new BlockPos(x, y, z);
                TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                IBlockState _bs35 = world.func_180495_p(_bp35);
                if (_tileEntity35 != null) {
                    _tileEntity35.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp35, _bs35, _bs35, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp36 = new BlockPos(x, y, z);
                TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                IBlockState _bs36 = world.func_180495_p(_bp36);
                if (_tileEntity36 != null) {
                    _tileEntity36.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp36, _bs36, _bs36, 3);
            }
            ItemStack _stack35 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.72
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack35.func_77942_o()) {
                _stack35.func_77982_d(new NBTTagCompound());
            }
            _stack35.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.73
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack36 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.74
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack36.func_77942_o()) {
                _stack36.func_77982_d(new NBTTagCompound());
            }
            _stack36.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.75
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 26.0d) {
            TileEntityLockableLoot func_175625_s19 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s19 != null && (func_175625_s19 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack19 = new ItemStack(ItemFabao0701.block, 1);
                _setstack19.func_190920_e(1);
                func_175625_s19.func_70299_a(6, _setstack19);
            }
            if (!world.field_72995_K) {
                BlockPos _bp37 = new BlockPos(x, y, z);
                TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                IBlockState _bs37 = world.func_180495_p(_bp37);
                if (_tileEntity37 != null) {
                    _tileEntity37.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp37, _bs37, _bs37, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp38 = new BlockPos(x, y, z);
                TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                IBlockState _bs38 = world.func_180495_p(_bp38);
                if (_tileEntity38 != null) {
                    _tileEntity38.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp38, _bs38, _bs38, 3);
            }
            ItemStack _stack37 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.76
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s20 = world.func_175625_s(pos);
                    if (func_175625_s20 instanceof TileEntityLockableLoot) {
                        return func_175625_s20.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack37.func_77942_o()) {
                _stack37.func_77982_d(new NBTTagCompound());
            }
            _stack37.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.77
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack38 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.78
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s20 = world.func_175625_s(pos);
                    if (func_175625_s20 instanceof TileEntityLockableLoot) {
                        return func_175625_s20.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack38.func_77942_o()) {
                _stack38.func_77982_d(new NBTTagCompound());
            }
            _stack38.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.79
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 27.0d) {
            TileEntityLockableLoot func_175625_s20 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s20 != null && (func_175625_s20 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack20 = new ItemStack(ItemZhuiHunZhen.block, 1);
                _setstack20.func_190920_e(1);
                func_175625_s20.func_70299_a(6, _setstack20);
            }
            if (!world.field_72995_K) {
                BlockPos _bp39 = new BlockPos(x, y, z);
                TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                IBlockState _bs39 = world.func_180495_p(_bp39);
                if (_tileEntity39 != null) {
                    _tileEntity39.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp39, _bs39, _bs39, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp40 = new BlockPos(x, y, z);
                TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                IBlockState _bs40 = world.func_180495_p(_bp40);
                if (_tileEntity40 != null) {
                    _tileEntity40.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp40, _bs40, _bs40, 3);
            }
            ItemStack _stack39 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.80
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                    if (func_175625_s21 instanceof TileEntityLockableLoot) {
                        return func_175625_s21.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack39.func_77942_o()) {
                _stack39.func_77982_d(new NBTTagCompound());
            }
            _stack39.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.81
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack40 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.82
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                    if (func_175625_s21 instanceof TileEntityLockableLoot) {
                        return func_175625_s21.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack40.func_77942_o()) {
                _stack40.func_77982_d(new NBTTagCompound());
            }
            _stack40.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.83
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 29.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.84
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
                }, "replaceitem block ~ ~ ~ slot.container.6 flyinginstrument:blue_point_sword 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp41 = new BlockPos(x, y, z);
                TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                IBlockState _bs41 = world.func_180495_p(_bp41);
                if (_tileEntity41 != null) {
                    _tileEntity41.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp41, _bs41, _bs41, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp42 = new BlockPos(x, y, z);
                TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                IBlockState _bs42 = world.func_180495_p(_bp42);
                if (_tileEntity42 != null) {
                    _tileEntity42.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp42, _bs42, _bs42, 3);
            }
            ItemStack _stack41 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.85
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                    if (func_175625_s21 instanceof TileEntityLockableLoot) {
                        return func_175625_s21.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack41.func_77942_o()) {
                _stack41.func_77982_d(new NBTTagCompound());
            }
            _stack41.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.86
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
            ItemStack _stack42 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.87
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                    if (func_175625_s21 instanceof TileEntityLockableLoot) {
                        return func_175625_s21.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack42.func_77942_o()) {
                _stack42.func_77982_d(new NBTTagCompound());
            }
            _stack42.func_77978_p().func_74780_a("HideFlags", 2.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.88
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 33.0d) {
            TileEntityLockableLoot func_175625_s21 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s21 != null && (func_175625_s21 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack21 = new ItemStack(ItemSuppressMonsterSword2.block, 1);
                _setstack21.func_190920_e(1);
                func_175625_s21.func_70299_a(6, _setstack21);
            }
            if (!world.field_72995_K) {
                BlockPos _bp43 = new BlockPos(x, y, z);
                TileEntity _tileEntity43 = world.func_175625_s(_bp43);
                IBlockState _bs43 = world.func_180495_p(_bp43);
                if (_tileEntity43 != null) {
                    _tileEntity43.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp43, _bs43, _bs43, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp44 = new BlockPos(x, y, z);
                TileEntity _tileEntity44 = world.func_175625_s(_bp44);
                IBlockState _bs44 = world.func_180495_p(_bp44);
                if (_tileEntity44 != null) {
                    _tileEntity44.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp44, _bs44, _bs44, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.89
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 34.0d) {
            TileEntityLockableLoot func_175625_s22 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s22 != null && (func_175625_s22 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack22 = new ItemStack(ItemSuppressMonsterSword3.block, 1);
                _setstack22.func_190920_e(1);
                func_175625_s22.func_70299_a(6, _setstack22);
            }
            if (!world.field_72995_K) {
                BlockPos _bp45 = new BlockPos(x, y, z);
                TileEntity _tileEntity45 = world.func_175625_s(_bp45);
                IBlockState _bs45 = world.func_180495_p(_bp45);
                if (_tileEntity45 != null) {
                    _tileEntity45.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp45, _bs45, _bs45, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp46 = new BlockPos(x, y, z);
                TileEntity _tileEntity46 = world.func_175625_s(_bp46);
                IBlockState _bs46 = world.func_180495_p(_bp46);
                if (_tileEntity46 != null) {
                    _tileEntity46.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp46, _bs46, _bs46, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.90
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 35.0d) {
            TileEntityLockableLoot func_175625_s23 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s23 != null && (func_175625_s23 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack23 = new ItemStack(ItemSuppressMonsterSword4.block, 1);
                _setstack23.func_190920_e(1);
                func_175625_s23.func_70299_a(6, _setstack23);
            }
            if (!world.field_72995_K) {
                BlockPos _bp47 = new BlockPos(x, y, z);
                TileEntity _tileEntity47 = world.func_175625_s(_bp47);
                IBlockState _bs47 = world.func_180495_p(_bp47);
                if (_tileEntity47 != null) {
                    _tileEntity47.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp47, _bs47, _bs47, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp48 = new BlockPos(x, y, z);
                TileEntity _tileEntity48 = world.func_175625_s(_bp48);
                IBlockState _bs48 = world.func_180495_p(_bp48);
                if (_tileEntity48 != null) {
                    _tileEntity48.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp48, _bs48, _bs48, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.91
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 36.0d) {
            TileEntityLockableLoot func_175625_s24 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s24 != null && (func_175625_s24 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack24 = new ItemStack(ItemSuppressMonsterSword5.block, 1);
                _setstack24.func_190920_e(1);
                func_175625_s24.func_70299_a(6, _setstack24);
            }
            if (!world.field_72995_K) {
                BlockPos _bp49 = new BlockPos(x, y, z);
                TileEntity _tileEntity49 = world.func_175625_s(_bp49);
                IBlockState _bs49 = world.func_180495_p(_bp49);
                if (_tileEntity49 != null) {
                    _tileEntity49.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp49, _bs49, _bs49, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp50 = new BlockPos(x, y, z);
                TileEntity _tileEntity50 = world.func_175625_s(_bp50);
                IBlockState _bs50 = world.func_180495_p(_bp50);
                if (_tileEntity50 != null) {
                    _tileEntity50.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp50, _bs50, _bs50, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.92
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 37.0d) {
            TileEntityLockableLoot func_175625_s25 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s25 != null && (func_175625_s25 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack25 = new ItemStack(ItemZhuQueHuan.block, 1);
                _setstack25.func_190920_e(1);
                func_175625_s25.func_70299_a(6, _setstack25);
            }
            if (!world.field_72995_K) {
                BlockPos _bp51 = new BlockPos(x, y, z);
                TileEntity _tileEntity51 = world.func_175625_s(_bp51);
                IBlockState _bs51 = world.func_180495_p(_bp51);
                if (_tileEntity51 != null) {
                    _tileEntity51.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp51, _bs51, _bs51, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp52 = new BlockPos(x, y, z);
                TileEntity _tileEntity52 = world.func_175625_s(_bp52);
                IBlockState _bs52 = world.func_180495_p(_bp52);
                if (_tileEntity52 != null) {
                    _tileEntity52.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp52, _bs52, _bs52, 3);
            }
            ItemStack _stack43 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.93
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s26 = world.func_175625_s(pos);
                    if (func_175625_s26 instanceof TileEntityLockableLoot) {
                        return func_175625_s26.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack43.func_77942_o()) {
                _stack43.func_77982_d(new NBTTagCompound());
            }
            _stack43.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.94
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.95
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 38.0d) {
            TileEntityLockableLoot func_175625_s26 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s26 != null && (func_175625_s26 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack26 = new ItemStack(ItemQingZuFengYunJian.block, 1);
                _setstack26.func_190920_e(1);
                func_175625_s26.func_70299_a(6, _setstack26);
            }
            if (!world.field_72995_K) {
                BlockPos _bp53 = new BlockPos(x, y, z);
                TileEntity _tileEntity53 = world.func_175625_s(_bp53);
                IBlockState _bs53 = world.func_180495_p(_bp53);
                if (_tileEntity53 != null) {
                    _tileEntity53.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp53, _bs53, _bs53, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp54 = new BlockPos(x, y, z);
                TileEntity _tileEntity54 = world.func_175625_s(_bp54);
                IBlockState _bs54 = world.func_180495_p(_bp54);
                if (_tileEntity54 != null) {
                    _tileEntity54.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp54, _bs54, _bs54, 3);
            }
            ItemStack _stack44 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.96
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s27 = world.func_175625_s(pos);
                    if (func_175625_s27 instanceof TileEntityLockableLoot) {
                        return func_175625_s27.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack44.func_77942_o()) {
                _stack44.func_77982_d(new NBTTagCompound());
            }
            _stack44.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.97
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.98
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 39.0d) {
            TileEntityLockableLoot func_175625_s27 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s27 != null && (func_175625_s27 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack27 = new ItemStack(ItemQiYinXiao.block, 1);
                _setstack27.func_190920_e(1);
                func_175625_s27.func_70299_a(6, _setstack27);
            }
            if (!world.field_72995_K) {
                BlockPos _bp55 = new BlockPos(x, y, z);
                TileEntity _tileEntity55 = world.func_175625_s(_bp55);
                IBlockState _bs55 = world.func_180495_p(_bp55);
                if (_tileEntity55 != null) {
                    _tileEntity55.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp55, _bs55, _bs55, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp56 = new BlockPos(x, y, z);
                TileEntity _tileEntity56 = world.func_175625_s(_bp56);
                IBlockState _bs56 = world.func_180495_p(_bp56);
                if (_tileEntity56 != null) {
                    _tileEntity56.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp56, _bs56, _bs56, 3);
            }
            ItemStack _stack45 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.99
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s28 = world.func_175625_s(pos);
                    if (func_175625_s28 instanceof TileEntityLockableLoot) {
                        return func_175625_s28.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack45.func_77942_o()) {
                _stack45.func_77982_d(new NBTTagCompound());
            }
            _stack45.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.100
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.101
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 40.0d) {
            TileEntityLockableLoot func_175625_s28 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s28 != null && (func_175625_s28 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack28 = new ItemStack(ItemYuanCiShenShan.block, 1);
                _setstack28.func_190920_e(1);
                func_175625_s28.func_70299_a(6, _setstack28);
            }
            if (!world.field_72995_K) {
                BlockPos _bp57 = new BlockPos(x, y, z);
                TileEntity _tileEntity57 = world.func_175625_s(_bp57);
                IBlockState _bs57 = world.func_180495_p(_bp57);
                if (_tileEntity57 != null) {
                    _tileEntity57.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp57, _bs57, _bs57, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp58 = new BlockPos(x, y, z);
                TileEntity _tileEntity58 = world.func_175625_s(_bp58);
                IBlockState _bs58 = world.func_180495_p(_bp58);
                if (_tileEntity58 != null) {
                    _tileEntity58.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp58, _bs58, _bs58, 3);
            }
            ItemStack _stack46 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.102
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s29 = world.func_175625_s(pos);
                    if (func_175625_s29 instanceof TileEntityLockableLoot) {
                        return func_175625_s29.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack46.func_77942_o()) {
                _stack46.func_77982_d(new NBTTagCompound());
            }
            _stack46.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.103
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.104
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 41.0d) {
            TileEntityLockableLoot func_175625_s29 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s29 != null && (func_175625_s29 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack29 = new ItemStack(ItemCangYunFeiHuo.block, 1);
                _setstack29.func_190920_e(1);
                func_175625_s29.func_70299_a(6, _setstack29);
            }
            if (!world.field_72995_K) {
                BlockPos _bp59 = new BlockPos(x, y, z);
                TileEntity _tileEntity59 = world.func_175625_s(_bp59);
                IBlockState _bs59 = world.func_180495_p(_bp59);
                if (_tileEntity59 != null) {
                    _tileEntity59.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp59, _bs59, _bs59, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp60 = new BlockPos(x, y, z);
                TileEntity _tileEntity60 = world.func_175625_s(_bp60);
                IBlockState _bs60 = world.func_180495_p(_bp60);
                if (_tileEntity60 != null) {
                    _tileEntity60.getTileData().func_74780_a("leixing", 0.0d);
                }
                world.func_184138_a(_bp60, _bs60, _bs60, 3);
            }
            ItemStack _stack47 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.105
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s30 = world.func_175625_s(pos);
                    if (func_175625_s30 instanceof TileEntityLockableLoot) {
                        return func_175625_s30.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6);
            if (!_stack47.func_77942_o()) {
                _stack47.func_77982_d(new NBTTagCompound());
            }
            _stack47.func_77978_p().func_74778_a("炼制者", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.106
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者"));
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.107
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") != 2.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.108
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
                }, "scoreboard players set " + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.109
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + " 经验开关 1");
            }
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.110
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.111
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp lianqi " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan02.112
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqijingyan") * 3.0d) + "\",CustomNameVisible:0b}");
            }
        }
    }
}
