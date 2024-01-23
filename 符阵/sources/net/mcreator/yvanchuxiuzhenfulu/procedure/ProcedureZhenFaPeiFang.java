package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFangkuai101;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCailiao32;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCailiao35;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi01;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi02;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi04;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi05;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaPeiFang.class */
public class ProcedureZhenFaPeiFang extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhenFaPeiFang(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 388);
    }

    /* JADX WARN: Type inference failed for: r0v1005, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$104] */
    /* JADX WARN: Type inference failed for: r0v1007, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$105] */
    /* JADX WARN: Type inference failed for: r0v1009, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$106] */
    /* JADX WARN: Type inference failed for: r0v107, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$153] */
    /* JADX WARN: Type inference failed for: r0v1099, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$96] */
    /* JADX WARN: Type inference failed for: r0v1105, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$97] */
    /* JADX WARN: Type inference failed for: r0v1111, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$98] */
    /* JADX WARN: Type inference failed for: r0v1113, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$99] */
    /* JADX WARN: Type inference failed for: r0v1115, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$100] */
    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$154] */
    /* JADX WARN: Type inference failed for: r0v116, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$155] */
    /* JADX WARN: Type inference failed for: r0v118, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$156] */
    /* JADX WARN: Type inference failed for: r0v120, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$157] */
    /* JADX WARN: Type inference failed for: r0v1205, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$90] */
    /* JADX WARN: Type inference failed for: r0v1211, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$91] */
    /* JADX WARN: Type inference failed for: r0v1217, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$92] */
    /* JADX WARN: Type inference failed for: r0v1219, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$93] */
    /* JADX WARN: Type inference failed for: r0v1221, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$94] */
    /* JADX WARN: Type inference failed for: r0v1300, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$70] */
    /* JADX WARN: Type inference failed for: r0v1306, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$76] */
    /* JADX WARN: Type inference failed for: r0v1312, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$82] */
    /* JADX WARN: Type inference failed for: r0v1325, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$83] */
    /* JADX WARN: Type inference failed for: r0v1331, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$84] */
    /* JADX WARN: Type inference failed for: r0v1337, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$85] */
    /* JADX WARN: Type inference failed for: r0v1339, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$86] */
    /* JADX WARN: Type inference failed for: r0v1341, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$87] */
    /* JADX WARN: Type inference failed for: r0v1431, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$77] */
    /* JADX WARN: Type inference failed for: r0v1437, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$78] */
    /* JADX WARN: Type inference failed for: r0v1443, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$79] */
    /* JADX WARN: Type inference failed for: r0v1445, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$80] */
    /* JADX WARN: Type inference failed for: r0v1447, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$81] */
    /* JADX WARN: Type inference failed for: r0v1537, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$71] */
    /* JADX WARN: Type inference failed for: r0v1543, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$72] */
    /* JADX WARN: Type inference failed for: r0v1549, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$73] */
    /* JADX WARN: Type inference failed for: r0v1551, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$74] */
    /* JADX WARN: Type inference failed for: r0v1553, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$75] */
    /* JADX WARN: Type inference failed for: r0v1632, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$51] */
    /* JADX WARN: Type inference failed for: r0v1638, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$57] */
    /* JADX WARN: Type inference failed for: r0v1644, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$63] */
    /* JADX WARN: Type inference failed for: r0v1657, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$64] */
    /* JADX WARN: Type inference failed for: r0v1663, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$65] */
    /* JADX WARN: Type inference failed for: r0v1669, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$66] */
    /* JADX WARN: Type inference failed for: r0v1671, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$67] */
    /* JADX WARN: Type inference failed for: r0v1673, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$68] */
    /* JADX WARN: Type inference failed for: r0v1763, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$58] */
    /* JADX WARN: Type inference failed for: r0v1769, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$59] */
    /* JADX WARN: Type inference failed for: r0v1775, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$60] */
    /* JADX WARN: Type inference failed for: r0v1777, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$61] */
    /* JADX WARN: Type inference failed for: r0v1779, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$62] */
    /* JADX WARN: Type inference failed for: r0v1869, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$52] */
    /* JADX WARN: Type inference failed for: r0v1875, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$53] */
    /* JADX WARN: Type inference failed for: r0v1881, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$54] */
    /* JADX WARN: Type inference failed for: r0v1883, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$55] */
    /* JADX WARN: Type inference failed for: r0v1885, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$56] */
    /* JADX WARN: Type inference failed for: r0v1964, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$38] */
    /* JADX WARN: Type inference failed for: r0v1970, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$44] */
    /* JADX WARN: Type inference failed for: r0v1983, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$45] */
    /* JADX WARN: Type inference failed for: r0v1989, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$46] */
    /* JADX WARN: Type inference failed for: r0v1995, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$47] */
    /* JADX WARN: Type inference failed for: r0v1997, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$48] */
    /* JADX WARN: Type inference failed for: r0v1999, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$49] */
    /* JADX WARN: Type inference failed for: r0v2089, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$39] */
    /* JADX WARN: Type inference failed for: r0v2095, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$40] */
    /* JADX WARN: Type inference failed for: r0v210, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$108] */
    /* JADX WARN: Type inference failed for: r0v2101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$41] */
    /* JADX WARN: Type inference failed for: r0v2103, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$42] */
    /* JADX WARN: Type inference failed for: r0v2105, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$43] */
    /* JADX WARN: Type inference failed for: r0v216, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$114] */
    /* JADX WARN: Type inference failed for: r0v2184, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$30] */
    /* JADX WARN: Type inference failed for: r0v2186, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$31] */
    /* JADX WARN: Type inference failed for: r0v2199, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$32] */
    /* JADX WARN: Type inference failed for: r0v2205, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$33] */
    /* JADX WARN: Type inference failed for: r0v2208, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$34] */
    /* JADX WARN: Type inference failed for: r0v2210, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$35] */
    /* JADX WARN: Type inference failed for: r0v2212, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$36] */
    /* JADX WARN: Type inference failed for: r0v222, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$120] */
    /* JADX WARN: Type inference failed for: r0v228, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$126] */
    /* JADX WARN: Type inference failed for: r0v2291, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$20] */
    /* JADX WARN: Type inference failed for: r0v2304, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$21] */
    /* JADX WARN: Type inference failed for: r0v2317, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$22] */
    /* JADX WARN: Type inference failed for: r0v2330, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$23] */
    /* JADX WARN: Type inference failed for: r0v2339, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$24] */
    /* JADX WARN: Type inference failed for: r0v234, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$132] */
    /* JADX WARN: Type inference failed for: r0v2341, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$25] */
    /* JADX WARN: Type inference failed for: r0v2343, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$26] */
    /* JADX WARN: Type inference failed for: r0v240, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$138] */
    /* JADX WARN: Type inference failed for: r0v2433, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$2] */
    /* JADX WARN: Type inference failed for: r0v2446, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$3] */
    /* JADX WARN: Type inference failed for: r0v2459, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$4] */
    /* JADX WARN: Type inference failed for: r0v246, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$144] */
    /* JADX WARN: Type inference failed for: r0v2465, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$7] */
    /* JADX WARN: Type inference failed for: r0v2468, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$10] */
    /* JADX WARN: Type inference failed for: r0v2471, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$13] */
    /* JADX WARN: Type inference failed for: r0v2477, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$16] */
    /* JADX WARN: Type inference failed for: r0v2487, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$17] */
    /* JADX WARN: Type inference failed for: r0v2567, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$18] */
    /* JADX WARN: Type inference failed for: r0v2577, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$14] */
    /* JADX WARN: Type inference failed for: r0v259, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$145] */
    /* JADX WARN: Type inference failed for: r0v265, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$146] */
    /* JADX WARN: Type inference failed for: r0v2657, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$15] */
    /* JADX WARN: Type inference failed for: r0v2667, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$11] */
    /* JADX WARN: Type inference failed for: r0v271, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$147] */
    /* JADX WARN: Type inference failed for: r0v273, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$148] */
    /* JADX WARN: Type inference failed for: r0v2747, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$12] */
    /* JADX WARN: Type inference failed for: r0v275, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$149] */
    /* JADX WARN: Type inference failed for: r0v2757, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$8] */
    /* JADX WARN: Type inference failed for: r0v2837, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$9] */
    /* JADX WARN: Type inference failed for: r0v2847, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$5] */
    /* JADX WARN: Type inference failed for: r0v2927, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$6] */
    /* JADX WARN: Type inference failed for: r0v365, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$139] */
    /* JADX WARN: Type inference failed for: r0v371, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$140] */
    /* JADX WARN: Type inference failed for: r0v377, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$141] */
    /* JADX WARN: Type inference failed for: r0v379, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$142] */
    /* JADX WARN: Type inference failed for: r0v381, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$143] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$1] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$19] */
    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$27] */
    /* JADX WARN: Type inference failed for: r0v471, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$133] */
    /* JADX WARN: Type inference failed for: r0v477, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$134] */
    /* JADX WARN: Type inference failed for: r0v48, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$28] */
    /* JADX WARN: Type inference failed for: r0v483, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$135] */
    /* JADX WARN: Type inference failed for: r0v485, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$136] */
    /* JADX WARN: Type inference failed for: r0v487, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$137] */
    /* JADX WARN: Type inference failed for: r0v577, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$127] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$29] */
    /* JADX WARN: Type inference failed for: r0v583, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$128] */
    /* JADX WARN: Type inference failed for: r0v589, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$129] */
    /* JADX WARN: Type inference failed for: r0v591, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$130] */
    /* JADX WARN: Type inference failed for: r0v593, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$131] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$37] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$50] */
    /* JADX WARN: Type inference failed for: r0v672, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$121] */
    /* JADX WARN: Type inference failed for: r0v678, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$122] */
    /* JADX WARN: Type inference failed for: r0v684, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$123] */
    /* JADX WARN: Type inference failed for: r0v686, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$124] */
    /* JADX WARN: Type inference failed for: r0v688, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$125] */
    /* JADX WARN: Type inference failed for: r0v70, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$69] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$88] */
    /* JADX WARN: Type inference failed for: r0v76, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$107] */
    /* JADX WARN: Type inference failed for: r0v767, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$115] */
    /* JADX WARN: Type inference failed for: r0v773, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$116] */
    /* JADX WARN: Type inference failed for: r0v779, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$117] */
    /* JADX WARN: Type inference failed for: r0v781, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$118] */
    /* JADX WARN: Type inference failed for: r0v783, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$119] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$150] */
    /* JADX WARN: Type inference failed for: r0v873, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$109] */
    /* JADX WARN: Type inference failed for: r0v879, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$110] */
    /* JADX WARN: Type inference failed for: r0v885, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$111] */
    /* JADX WARN: Type inference failed for: r0v887, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$112] */
    /* JADX WARN: Type inference failed for: r0v889, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$113] */
    /* JADX WARN: Type inference failed for: r0v92, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$151] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$152] */
    /* JADX WARN: Type inference failed for: r0v968, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$89] */
    /* JADX WARN: Type inference failed for: r0v974, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$95] */
    /* JADX WARN: Type inference failed for: r0v980, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$101] */
    /* JADX WARN: Type inference failed for: r0v993, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$102] */
    /* JADX WARN: Type inference failed for: r0v999, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang$103] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.1
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao32.block, 1).func_77973_b()) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.2
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:caiitem07")) {
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.3
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:caiitem04")) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.4
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:cailiao11")) {
                            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.5
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemZhenQi04.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.6
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp = new BlockPos(x, y, z);
                                    TileEntity _tileEntity = world.func_175625_s(_bp);
                                    IBlockState _bs = world.func_180495_p(_bp);
                                    if (_tileEntity != null) {
                                        _tileEntity.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp, _bs, _bs, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp2 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                                    IBlockState _bs2 = world.func_180495_p(_bp2);
                                    if (_tileEntity2 != null) {
                                        _tileEntity2.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp3 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                                    IBlockState _bs3 = world.func_180495_p(_bp3);
                                    if (_tileEntity3 != null) {
                                        _tileEntity3.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp4 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                                    IBlockState _bs4 = world.func_180495_p(_bp4);
                                    if (_tileEntity4 != null) {
                                        _tileEntity4.getTileData().func_74780_a("gezi4", 1.0d);
                                    }
                                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp5 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                                    IBlockState _bs5 = world.func_180495_p(_bp5);
                                    if (_tileEntity5 != null) {
                                        _tileEntity5.getTileData().func_74780_a("类型", 1.0d);
                                    }
                                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp6 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                                    IBlockState _bs6 = world.func_180495_p(_bp6);
                                    if (_tileEntity6 != null) {
                                        _tileEntity6.getTileData().func_74780_a("扣除灵力", 16.0d);
                                    }
                                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("阵旗制作失败:没有多余的格子可以存放新的阵旗"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.7
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao35.block, 1).func_77973_b()) {
                            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.8
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemZhenQi03.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.9
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp7 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                                    IBlockState _bs7 = world.func_180495_p(_bp7);
                                    if (_tileEntity7 != null) {
                                        _tileEntity7.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp8 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                                    IBlockState _bs8 = world.func_180495_p(_bp8);
                                    if (_tileEntity8 != null) {
                                        _tileEntity8.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp9 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                                    IBlockState _bs9 = world.func_180495_p(_bp9);
                                    if (_tileEntity9 != null) {
                                        _tileEntity9.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp10 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                                    IBlockState _bs10 = world.func_180495_p(_bp10);
                                    if (_tileEntity10 != null) {
                                        _tileEntity10.getTileData().func_74780_a("gezi4", 1.0d);
                                    }
                                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp11 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                                    IBlockState _bs11 = world.func_180495_p(_bp11);
                                    if (_tileEntity11 != null) {
                                        _tileEntity11.getTileData().func_74780_a("类型", 2.0d);
                                    }
                                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp12 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                                    IBlockState _bs12 = world.func_180495_p(_bp12);
                                    if (_tileEntity12 != null) {
                                        _tileEntity12.getTileData().func_74780_a("扣除灵力", 16.0d);
                                    }
                                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("阵旗制作失败:没有多余的格子可以存放新的阵旗"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.10
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Items.field_151131_as, 1).func_77973_b()) {
                            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.11
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemZhenQi02.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.12
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp13 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                                    IBlockState _bs13 = world.func_180495_p(_bp13);
                                    if (_tileEntity13 != null) {
                                        _tileEntity13.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp14 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                                    IBlockState _bs14 = world.func_180495_p(_bp14);
                                    if (_tileEntity14 != null) {
                                        _tileEntity14.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp15 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                                    IBlockState _bs15 = world.func_180495_p(_bp15);
                                    if (_tileEntity15 != null) {
                                        _tileEntity15.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp16 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                                    IBlockState _bs16 = world.func_180495_p(_bp16);
                                    if (_tileEntity16 != null) {
                                        _tileEntity16.getTileData().func_74780_a("gezi4", 1.0d);
                                    }
                                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp17 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                                    IBlockState _bs17 = world.func_180495_p(_bp17);
                                    if (_tileEntity17 != null) {
                                        _tileEntity17.getTileData().func_74780_a("类型", 3.0d);
                                    }
                                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp18 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                                    IBlockState _bs18 = world.func_180495_p(_bp18);
                                    if (_tileEntity18 != null) {
                                        _tileEntity18.getTileData().func_74780_a("扣除灵力", 16.0d);
                                    }
                                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("阵旗制作失败:没有多余的格子可以存放新的阵旗"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.13
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:cailiao9101")) {
                            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.14
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemZhenQi01.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.15
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp19 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                                    IBlockState _bs19 = world.func_180495_p(_bp19);
                                    if (_tileEntity19 != null) {
                                        _tileEntity19.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp20 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                                    IBlockState _bs20 = world.func_180495_p(_bp20);
                                    if (_tileEntity20 != null) {
                                        _tileEntity20.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp21 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                                    IBlockState _bs21 = world.func_180495_p(_bp21);
                                    if (_tileEntity21 != null) {
                                        _tileEntity21.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp22 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                                    IBlockState _bs22 = world.func_180495_p(_bp22);
                                    if (_tileEntity22 != null) {
                                        _tileEntity22.getTileData().func_74780_a("gezi4", 1.0d);
                                    }
                                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp23 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                                    IBlockState _bs23 = world.func_180495_p(_bp23);
                                    if (_tileEntity23 != null) {
                                        _tileEntity23.getTileData().func_74780_a("类型", 4.0d);
                                    }
                                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp24 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                                    IBlockState _bs24 = world.func_180495_p(_bp24);
                                    if (_tileEntity24 != null) {
                                        _tileEntity24.getTileData().func_74780_a("扣除灵力", 32.0d);
                                    }
                                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("阵旗制作失败:没有多余的格子可以存放新的阵旗"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.16
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(BlockFangkuai101.block, 1).func_77973_b()) {
                            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.17
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemZhenQi05.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.18
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp25 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                                    IBlockState _bs25 = world.func_180495_p(_bp25);
                                    if (_tileEntity25 != null) {
                                        _tileEntity25.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp25, _bs25, _bs25, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp26 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                                    IBlockState _bs26 = world.func_180495_p(_bp26);
                                    if (_tileEntity26 != null) {
                                        _tileEntity26.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp26, _bs26, _bs26, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp27 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                                    IBlockState _bs27 = world.func_180495_p(_bp27);
                                    if (_tileEntity27 != null) {
                                        _tileEntity27.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp27, _bs27, _bs27, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp28 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                                    IBlockState _bs28 = world.func_180495_p(_bp28);
                                    if (_tileEntity28 != null) {
                                        _tileEntity28.getTileData().func_74780_a("gezi4", 1.0d);
                                    }
                                    world.func_184138_a(_bp28, _bs28, _bs28, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp29 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                                    IBlockState _bs29 = world.func_180495_p(_bp29);
                                    if (_tileEntity29 != null) {
                                        _tileEntity29.getTileData().func_74780_a("类型", 5.0d);
                                    }
                                    world.func_184138_a(_bp29, _bs29, _bs29, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp30 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                                    IBlockState _bs30 = world.func_180495_p(_bp30);
                                    if (_tileEntity30 != null) {
                                        _tileEntity30.getTileData().func_74780_a("扣除灵力", 16.0d);
                                    }
                                    world.func_184138_a(_bp30, _bs30, _bs30, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("阵旗制作失败:没有多余的格子可以存放新的阵旗"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵旗辅材2错误"), false);
                        }
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("欲制作阵旗缺少精血"), false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("欲制作阵旗缺少云缕布"), false);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.19
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(Blocks.field_150347_e, 1).func_77973_b()) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.20
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().contains("minecraft:wool")) {
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.21
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03")) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.22
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:caiitem04")) {
                            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.23
                                public int getAmount(BlockPos pos, int sltid) {
                                    ItemStack stack;
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                        return stack.func_190916_E();
                                    }
                                    return 0;
                                }
                            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.24
                                public int getAmount(BlockPos pos, int sltid) {
                                    ItemStack stack;
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                        return stack.func_190916_E();
                                    }
                                    return 0;
                                }
                            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.25
                                public int getAmount(BlockPos pos, int sltid) {
                                    ItemStack stack;
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                        return stack.func_190916_E();
                                    }
                                    return 0;
                                }
                            }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.26
                                public int getAmount(BlockPos pos, int sltid) {
                                    ItemStack stack;
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                        return stack.func_190916_E();
                                    }
                                    return 0;
                                }
                            }.getAmount(new BlockPos(x, y, z), 3) >= 1) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp31 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                                    IBlockState _bs31 = world.func_180495_p(_bp31);
                                    if (_tileEntity31 != null) {
                                        _tileEntity31.getTileData().func_74780_a("gezi1", 3.0d);
                                    }
                                    world.func_184138_a(_bp31, _bs31, _bs31, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp32 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                                    IBlockState _bs32 = world.func_180495_p(_bp32);
                                    if (_tileEntity32 != null) {
                                        _tileEntity32.getTileData().func_74780_a("gezi2", 2.0d);
                                    }
                                    world.func_184138_a(_bp32, _bs32, _bs32, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp33 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                                    IBlockState _bs33 = world.func_180495_p(_bp33);
                                    if (_tileEntity33 != null) {
                                        _tileEntity33.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp33, _bs33, _bs33, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp34 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                                    IBlockState _bs34 = world.func_180495_p(_bp34);
                                    if (_tileEntity34 != null) {
                                        _tileEntity34.getTileData().func_74780_a("gezi4", 1.0d);
                                    }
                                    world.func_184138_a(_bp34, _bs34, _bs34, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp35 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                                    IBlockState _bs35 = world.func_180495_p(_bp35);
                                    if (_tileEntity35 != null) {
                                        _tileEntity35.getTileData().func_74780_a("类型", 6.0d);
                                    }
                                    world.func_184138_a(_bp35, _bs35, _bs35, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp36 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                                    IBlockState _bs36 = world.func_180495_p(_bp36);
                                    if (_tileEntity36 != null) {
                                        _tileEntity36.getTileData().func_74780_a("扣除灵力", 16.0d);
                                    }
                                    world.func_184138_a(_bp36, _bs36, _bs36, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵源:材料数量不符"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵元:缺少精血"), false);
                        }
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("欲制作阵元:缺少灵石"), false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("欲制作阵元:缺少羊毛"), false);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.27
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() != new ItemStack(ItemCailiao32.block, 1).func_77973_b()) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.28
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.29
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:yaodan0202") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.30
                        public int getAmount(BlockPos pos, int sltid) {
                            ItemStack stack;
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                return stack.func_190916_E();
                            }
                            return 0;
                        }
                    }.getAmount(new BlockPos(x, y, z), 0) >= 3) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.31
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().contains("minecraft:wool") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.32
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().contains("minecraft:wool") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.33
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(Blocks.field_150347_e, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.34
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 7 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.35
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 7 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.36
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 5) {
                            if (!world.field_72995_K) {
                                BlockPos _bp37 = new BlockPos(x, y, z);
                                TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                                IBlockState _bs37 = world.func_180495_p(_bp37);
                                if (_tileEntity37 != null) {
                                    _tileEntity37.getTileData().func_74780_a("gezi1", 3.0d);
                                }
                                world.func_184138_a(_bp37, _bs37, _bs37, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp38 = new BlockPos(x, y, z);
                                TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                                IBlockState _bs38 = world.func_180495_p(_bp38);
                                if (_tileEntity38 != null) {
                                    _tileEntity38.getTileData().func_74780_a("gezi2", 7.0d);
                                }
                                world.func_184138_a(_bp38, _bs38, _bs38, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp39 = new BlockPos(x, y, z);
                                TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                                IBlockState _bs39 = world.func_180495_p(_bp39);
                                if (_tileEntity39 != null) {
                                    _tileEntity39.getTileData().func_74780_a("gezi3", 7.0d);
                                }
                                world.func_184138_a(_bp39, _bs39, _bs39, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp40 = new BlockPos(x, y, z);
                                TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                                IBlockState _bs40 = world.func_180495_p(_bp40);
                                if (_tileEntity40 != null) {
                                    _tileEntity40.getTileData().func_74780_a("gezi4", 5.0d);
                                }
                                world.func_184138_a(_bp40, _bs40, _bs40, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp41 = new BlockPos(x, y, z);
                                TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                                IBlockState _bs41 = world.func_180495_p(_bp41);
                                if (_tileEntity41 != null) {
                                    _tileEntity41.getTileData().func_74780_a("类型", 11.0d);
                                }
                                world.func_184138_a(_bp41, _bs41, _bs41, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp42 = new BlockPos(x, y, z);
                                TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                                IBlockState _bs42 = world.func_180495_p(_bp42);
                                if (_tileEntity42 != null) {
                                    _tileEntity42.getTileData().func_74780_a("扣除灵力", 60.0d);
                                }
                                world.func_184138_a(_bp42, _bs42, _bs42, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:材料数量不符或材料错误"), false);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.37
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemZhenQi04.block, 1).func_77973_b()) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.38
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cao_yao_401") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.39
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:caoyao22") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.40
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.41
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.42
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.43
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (!world.field_72995_K) {
                                BlockPos _bp43 = new BlockPos(x, y, z);
                                TileEntity _tileEntity43 = world.func_175625_s(_bp43);
                                IBlockState _bs43 = world.func_180495_p(_bp43);
                                if (_tileEntity43 != null) {
                                    _tileEntity43.getTileData().func_74780_a("gezi1", 1.0d);
                                }
                                world.func_184138_a(_bp43, _bs43, _bs43, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp44 = new BlockPos(x, y, z);
                                TileEntity _tileEntity44 = world.func_175625_s(_bp44);
                                IBlockState _bs44 = world.func_180495_p(_bp44);
                                if (_tileEntity44 != null) {
                                    _tileEntity44.getTileData().func_74780_a("gezi2", 1.0d);
                                }
                                world.func_184138_a(_bp44, _bs44, _bs44, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp45 = new BlockPos(x, y, z);
                                TileEntity _tileEntity45 = world.func_175625_s(_bp45);
                                IBlockState _bs45 = world.func_180495_p(_bp45);
                                if (_tileEntity45 != null) {
                                    _tileEntity45.getTileData().func_74780_a("gezi3", 1.0d);
                                }
                                world.func_184138_a(_bp45, _bs45, _bs45, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp46 = new BlockPos(x, y, z);
                                TileEntity _tileEntity46 = world.func_175625_s(_bp46);
                                IBlockState _bs46 = world.func_180495_p(_bp46);
                                if (_tileEntity46 != null) {
                                    _tileEntity46.getTileData().func_74780_a("gezi4", 3.0d);
                                }
                                world.func_184138_a(_bp46, _bs46, _bs46, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp47 = new BlockPos(x, y, z);
                                TileEntity _tileEntity47 = world.func_175625_s(_bp47);
                                IBlockState _bs47 = world.func_180495_p(_bp47);
                                if (_tileEntity47 != null) {
                                    _tileEntity47.getTileData().func_74780_a("类型", 12.0d);
                                }
                                world.func_184138_a(_bp47, _bs47, _bs47, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp48 = new BlockPos(x, y, z);
                                TileEntity _tileEntity48 = world.func_175625_s(_bp48);
                                IBlockState _bs48 = world.func_180495_p(_bp48);
                                if (_tileEntity48 != null) {
                                    _tileEntity48.getTileData().func_74780_a("扣除灵力", 32.0d);
                                }
                                world.func_184138_a(_bp48, _bs48, _bs48, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.44
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cao_yao_1101") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.45
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_10") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.46
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.47
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.48
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.49
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp49 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity49 = world.func_175625_s(_bp49);
                                    IBlockState _bs49 = world.func_180495_p(_bp49);
                                    if (_tileEntity49 != null) {
                                        _tileEntity49.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp49, _bs49, _bs49, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp50 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity50 = world.func_175625_s(_bp50);
                                    IBlockState _bs50 = world.func_180495_p(_bp50);
                                    if (_tileEntity50 != null) {
                                        _tileEntity50.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp50, _bs50, _bs50, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp51 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity51 = world.func_175625_s(_bp51);
                                    IBlockState _bs51 = world.func_180495_p(_bp51);
                                    if (_tileEntity51 != null) {
                                        _tileEntity51.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp51, _bs51, _bs51, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp52 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity52 = world.func_175625_s(_bp52);
                                    IBlockState _bs52 = world.func_180495_p(_bp52);
                                    if (_tileEntity52 != null) {
                                        _tileEntity52.getTileData().func_74780_a("gezi4", 3.0d);
                                    }
                                    world.func_184138_a(_bp52, _bs52, _bs52, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp53 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity53 = world.func_175625_s(_bp53);
                                    IBlockState _bs53 = world.func_180495_p(_bp53);
                                    if (_tileEntity53 != null) {
                                        _tileEntity53.getTileData().func_74780_a("类型", 22.0d);
                                    }
                                    world.func_184138_a(_bp53, _bs53, _bs53, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp54 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity54 = world.func_175625_s(_bp54);
                                    IBlockState _bs54 = world.func_180495_p(_bp54);
                                    if (_tileEntity54 != null) {
                                        _tileEntity54.getTileData().func_74780_a("扣除灵力", 288.0d);
                                    }
                                    world.func_184138_a(_bp54, _bs54, _bs54, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界不足无法制作"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:材料数量不符或材料错误"), false);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.50
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemZhenQi03.block, 1).func_77973_b()) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.51
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cao_yao_501") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.52
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:caoyao24") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.53
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.54
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.55
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.56
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (!world.field_72995_K) {
                                BlockPos _bp55 = new BlockPos(x, y, z);
                                TileEntity _tileEntity55 = world.func_175625_s(_bp55);
                                IBlockState _bs55 = world.func_180495_p(_bp55);
                                if (_tileEntity55 != null) {
                                    _tileEntity55.getTileData().func_74780_a("gezi1", 1.0d);
                                }
                                world.func_184138_a(_bp55, _bs55, _bs55, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp56 = new BlockPos(x, y, z);
                                TileEntity _tileEntity56 = world.func_175625_s(_bp56);
                                IBlockState _bs56 = world.func_180495_p(_bp56);
                                if (_tileEntity56 != null) {
                                    _tileEntity56.getTileData().func_74780_a("gezi2", 1.0d);
                                }
                                world.func_184138_a(_bp56, _bs56, _bs56, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp57 = new BlockPos(x, y, z);
                                TileEntity _tileEntity57 = world.func_175625_s(_bp57);
                                IBlockState _bs57 = world.func_180495_p(_bp57);
                                if (_tileEntity57 != null) {
                                    _tileEntity57.getTileData().func_74780_a("gezi3", 1.0d);
                                }
                                world.func_184138_a(_bp57, _bs57, _bs57, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp58 = new BlockPos(x, y, z);
                                TileEntity _tileEntity58 = world.func_175625_s(_bp58);
                                IBlockState _bs58 = world.func_180495_p(_bp58);
                                if (_tileEntity58 != null) {
                                    _tileEntity58.getTileData().func_74780_a("gezi4", 3.0d);
                                }
                                world.func_184138_a(_bp58, _bs58, _bs58, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp59 = new BlockPos(x, y, z);
                                TileEntity _tileEntity59 = world.func_175625_s(_bp59);
                                IBlockState _bs59 = world.func_180495_p(_bp59);
                                if (_tileEntity59 != null) {
                                    _tileEntity59.getTileData().func_74780_a("类型", 13.0d);
                                }
                                world.func_184138_a(_bp59, _bs59, _bs59, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp60 = new BlockPos(x, y, z);
                                TileEntity _tileEntity60 = world.func_175625_s(_bp60);
                                IBlockState _bs60 = world.func_180495_p(_bp60);
                                if (_tileEntity60 != null) {
                                    _tileEntity60.getTileData().func_74780_a("扣除灵力", 32.0d);
                                }
                                world.func_184138_a(_bp60, _bs60, _bs60, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.57
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao37") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.58
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.59
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.60
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.61
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 5 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.62
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp61 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity61 = world.func_175625_s(_bp61);
                                    IBlockState _bs61 = world.func_180495_p(_bp61);
                                    if (_tileEntity61 != null) {
                                        _tileEntity61.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp61, _bs61, _bs61, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp62 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity62 = world.func_175625_s(_bp62);
                                    IBlockState _bs62 = world.func_180495_p(_bp62);
                                    if (_tileEntity62 != null) {
                                        _tileEntity62.getTileData().func_74780_a("gezi2", 3.0d);
                                    }
                                    world.func_184138_a(_bp62, _bs62, _bs62, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp63 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity63 = world.func_175625_s(_bp63);
                                    IBlockState _bs63 = world.func_180495_p(_bp63);
                                    if (_tileEntity63 != null) {
                                        _tileEntity63.getTileData().func_74780_a("gezi3", 5.0d);
                                    }
                                    world.func_184138_a(_bp63, _bs63, _bs63, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp64 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity64 = world.func_175625_s(_bp64);
                                    IBlockState _bs64 = world.func_180495_p(_bp64);
                                    if (_tileEntity64 != null) {
                                        _tileEntity64.getTileData().func_74780_a("gezi4", 3.0d);
                                    }
                                    world.func_184138_a(_bp64, _bs64, _bs64, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp65 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity65 = world.func_175625_s(_bp65);
                                    IBlockState _bs65 = world.func_180495_p(_bp65);
                                    if (_tileEntity65 != null) {
                                        _tileEntity65.getTileData().func_74780_a("类型", 18.0d);
                                    }
                                    world.func_184138_a(_bp65, _bs65, _bs65, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp66 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity66 = world.func_175625_s(_bp66);
                                    IBlockState _bs66 = world.func_180495_p(_bp66);
                                    if (_tileEntity66 != null) {
                                        _tileEntity66.getTileData().func_74780_a("扣除灵力", 288.0d);
                                    }
                                    world.func_184138_a(_bp66, _bs66, _bs66, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界不足无法制作"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.63
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cao_yao_1301") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.64
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_10") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.65
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.66
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.67
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.68
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp67 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity67 = world.func_175625_s(_bp67);
                                    IBlockState _bs67 = world.func_180495_p(_bp67);
                                    if (_tileEntity67 != null) {
                                        _tileEntity67.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp67, _bs67, _bs67, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp68 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity68 = world.func_175625_s(_bp68);
                                    IBlockState _bs68 = world.func_180495_p(_bp68);
                                    if (_tileEntity68 != null) {
                                        _tileEntity68.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp68, _bs68, _bs68, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp69 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity69 = world.func_175625_s(_bp69);
                                    IBlockState _bs69 = world.func_180495_p(_bp69);
                                    if (_tileEntity69 != null) {
                                        _tileEntity69.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp69, _bs69, _bs69, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp70 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity70 = world.func_175625_s(_bp70);
                                    IBlockState _bs70 = world.func_180495_p(_bp70);
                                    if (_tileEntity70 != null) {
                                        _tileEntity70.getTileData().func_74780_a("gezi4", 3.0d);
                                    }
                                    world.func_184138_a(_bp70, _bs70, _bs70, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp71 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity71 = world.func_175625_s(_bp71);
                                    IBlockState _bs71 = world.func_180495_p(_bp71);
                                    if (_tileEntity71 != null) {
                                        _tileEntity71.getTileData().func_74780_a("类型", 23.0d);
                                    }
                                    world.func_184138_a(_bp71, _bs71, _bs71, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp72 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity72 = world.func_175625_s(_bp72);
                                    IBlockState _bs72 = world.func_180495_p(_bp72);
                                    if (_tileEntity72 != null) {
                                        _tileEntity72.getTileData().func_74780_a("扣除灵力", 288.0d);
                                    }
                                    world.func_184138_a(_bp72, _bs72, _bs72, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界不足无法制作"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:材料数量不符或材料错误"), false);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.69
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemZhenQi02.block, 1).func_77973_b()) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.70
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cao_yao_601") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.71
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:caoyao25") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.72
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.73
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.74
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.75
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (!world.field_72995_K) {
                                BlockPos _bp73 = new BlockPos(x, y, z);
                                TileEntity _tileEntity73 = world.func_175625_s(_bp73);
                                IBlockState _bs73 = world.func_180495_p(_bp73);
                                if (_tileEntity73 != null) {
                                    _tileEntity73.getTileData().func_74780_a("gezi1", 1.0d);
                                }
                                world.func_184138_a(_bp73, _bs73, _bs73, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp74 = new BlockPos(x, y, z);
                                TileEntity _tileEntity74 = world.func_175625_s(_bp74);
                                IBlockState _bs74 = world.func_180495_p(_bp74);
                                if (_tileEntity74 != null) {
                                    _tileEntity74.getTileData().func_74780_a("gezi2", 1.0d);
                                }
                                world.func_184138_a(_bp74, _bs74, _bs74, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp75 = new BlockPos(x, y, z);
                                TileEntity _tileEntity75 = world.func_175625_s(_bp75);
                                IBlockState _bs75 = world.func_180495_p(_bp75);
                                if (_tileEntity75 != null) {
                                    _tileEntity75.getTileData().func_74780_a("gezi3", 1.0d);
                                }
                                world.func_184138_a(_bp75, _bs75, _bs75, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp76 = new BlockPos(x, y, z);
                                TileEntity _tileEntity76 = world.func_175625_s(_bp76);
                                IBlockState _bs76 = world.func_180495_p(_bp76);
                                if (_tileEntity76 != null) {
                                    _tileEntity76.getTileData().func_74780_a("gezi4", 3.0d);
                                }
                                world.func_184138_a(_bp76, _bs76, _bs76, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp77 = new BlockPos(x, y, z);
                                TileEntity _tileEntity77 = world.func_175625_s(_bp77);
                                IBlockState _bs77 = world.func_180495_p(_bp77);
                                if (_tileEntity77 != null) {
                                    _tileEntity77.getTileData().func_74780_a("类型", 14.0d);
                                }
                                world.func_184138_a(_bp77, _bs77, _bs77, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp78 = new BlockPos(x, y, z);
                                TileEntity _tileEntity78 = world.func_175625_s(_bp78);
                                IBlockState _bs78 = world.func_180495_p(_bp78);
                                if (_tileEntity78 != null) {
                                    _tileEntity78.getTileData().func_74780_a("扣除灵力", 32.0d);
                                }
                                world.func_184138_a(_bp78, _bs78, _bs78, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.76
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cao_yao_901") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.77
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:shou_huang_jing_xue") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.78
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.79
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.80
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.81
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp79 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity79 = world.func_175625_s(_bp79);
                                    IBlockState _bs79 = world.func_180495_p(_bp79);
                                    if (_tileEntity79 != null) {
                                        _tileEntity79.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp79, _bs79, _bs79, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp80 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity80 = world.func_175625_s(_bp80);
                                    IBlockState _bs80 = world.func_180495_p(_bp80);
                                    if (_tileEntity80 != null) {
                                        _tileEntity80.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp80, _bs80, _bs80, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp81 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity81 = world.func_175625_s(_bp81);
                                    IBlockState _bs81 = world.func_180495_p(_bp81);
                                    if (_tileEntity81 != null) {
                                        _tileEntity81.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp81, _bs81, _bs81, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp82 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity82 = world.func_175625_s(_bp82);
                                    IBlockState _bs82 = world.func_180495_p(_bp82);
                                    if (_tileEntity82 != null) {
                                        _tileEntity82.getTileData().func_74780_a("gezi4", 3.0d);
                                    }
                                    world.func_184138_a(_bp82, _bs82, _bs82, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp83 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity83 = world.func_175625_s(_bp83);
                                    IBlockState _bs83 = world.func_180495_p(_bp83);
                                    if (_tileEntity83 != null) {
                                        _tileEntity83.getTileData().func_74780_a("类型", 20.0d);
                                    }
                                    world.func_184138_a(_bp83, _bs83, _bs83, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp84 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity84 = world.func_175625_s(_bp84);
                                    IBlockState _bs84 = world.func_180495_p(_bp84);
                                    if (_tileEntity84 != null) {
                                        _tileEntity84.getTileData().func_74780_a("扣除灵力", 288.0d);
                                    }
                                    world.func_184138_a(_bp84, _bs84, _bs84, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到元婴期"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.82
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:bai_po") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.83
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:pi_xie_jia_dan") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.84
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.85
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.86
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 2 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.87
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 4) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp85 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity85 = world.func_175625_s(_bp85);
                                    IBlockState _bs85 = world.func_180495_p(_bp85);
                                    if (_tileEntity85 != null) {
                                        _tileEntity85.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp85, _bs85, _bs85, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp86 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity86 = world.func_175625_s(_bp86);
                                    IBlockState _bs86 = world.func_180495_p(_bp86);
                                    if (_tileEntity86 != null) {
                                        _tileEntity86.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp86, _bs86, _bs86, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp87 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity87 = world.func_175625_s(_bp87);
                                    IBlockState _bs87 = world.func_180495_p(_bp87);
                                    if (_tileEntity87 != null) {
                                        _tileEntity87.getTileData().func_74780_a("gezi3", 2.0d);
                                    }
                                    world.func_184138_a(_bp87, _bs87, _bs87, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp88 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity88 = world.func_175625_s(_bp88);
                                    IBlockState _bs88 = world.func_180495_p(_bp88);
                                    if (_tileEntity88 != null) {
                                        _tileEntity88.getTileData().func_74780_a("gezi4", 4.0d);
                                    }
                                    world.func_184138_a(_bp88, _bs88, _bs88, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp89 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity89 = world.func_175625_s(_bp89);
                                    IBlockState _bs89 = world.func_180495_p(_bp89);
                                    if (_tileEntity89 != null) {
                                        _tileEntity89.getTileData().func_74780_a("类型", 24.0d);
                                    }
                                    world.func_184138_a(_bp89, _bs89, _bs89, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp90 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity90 = world.func_175625_s(_bp90);
                                    IBlockState _bs90 = world.func_180495_p(_bp90);
                                    if (_tileEntity90 != null) {
                                        _tileEntity90.getTileData().func_74780_a("扣除灵力", 576.0d);
                                    }
                                    world.func_184138_a(_bp90, _bs90, _bs90, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到化神期"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:材料数量不符或材料错误"), false);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.88
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemZhenQi01.block, 1).func_77973_b()) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.89
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cao_yao_301") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.90
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:caoyao23") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.91
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.92
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.93
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.94
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (!world.field_72995_K) {
                                BlockPos _bp91 = new BlockPos(x, y, z);
                                TileEntity _tileEntity91 = world.func_175625_s(_bp91);
                                IBlockState _bs91 = world.func_180495_p(_bp91);
                                if (_tileEntity91 != null) {
                                    _tileEntity91.getTileData().func_74780_a("gezi1", 1.0d);
                                }
                                world.func_184138_a(_bp91, _bs91, _bs91, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp92 = new BlockPos(x, y, z);
                                TileEntity _tileEntity92 = world.func_175625_s(_bp92);
                                IBlockState _bs92 = world.func_180495_p(_bp92);
                                if (_tileEntity92 != null) {
                                    _tileEntity92.getTileData().func_74780_a("gezi2", 1.0d);
                                }
                                world.func_184138_a(_bp92, _bs92, _bs92, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp93 = new BlockPos(x, y, z);
                                TileEntity _tileEntity93 = world.func_175625_s(_bp93);
                                IBlockState _bs93 = world.func_180495_p(_bp93);
                                if (_tileEntity93 != null) {
                                    _tileEntity93.getTileData().func_74780_a("gezi3", 1.0d);
                                }
                                world.func_184138_a(_bp93, _bs93, _bs93, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp94 = new BlockPos(x, y, z);
                                TileEntity _tileEntity94 = world.func_175625_s(_bp94);
                                IBlockState _bs94 = world.func_180495_p(_bp94);
                                if (_tileEntity94 != null) {
                                    _tileEntity94.getTileData().func_74780_a("gezi4", 3.0d);
                                }
                                world.func_184138_a(_bp94, _bs94, _bs94, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp95 = new BlockPos(x, y, z);
                                TileEntity _tileEntity95 = world.func_175625_s(_bp95);
                                IBlockState _bs95 = world.func_180495_p(_bp95);
                                if (_tileEntity95 != null) {
                                    _tileEntity95.getTileData().func_74780_a("类型", 15.0d);
                                }
                                world.func_184138_a(_bp95, _bs95, _bs95, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp96 = new BlockPos(x, y, z);
                                TileEntity _tileEntity96 = world.func_175625_s(_bp96);
                                IBlockState _bs96 = world.func_180495_p(_bp96);
                                if (_tileEntity96 != null) {
                                    _tileEntity96.getTileData().func_74780_a("扣除灵力", 32.0d);
                                }
                                world.func_184138_a(_bp96, _bs96, _bs96, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.95
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:caoyao_1001") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.96
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:shou_huang_jing_xue") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.97
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.98
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.99
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.100
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 3) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp97 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity97 = world.func_175625_s(_bp97);
                                    IBlockState _bs97 = world.func_180495_p(_bp97);
                                    if (_tileEntity97 != null) {
                                        _tileEntity97.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp97, _bs97, _bs97, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp98 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity98 = world.func_175625_s(_bp98);
                                    IBlockState _bs98 = world.func_180495_p(_bp98);
                                    if (_tileEntity98 != null) {
                                        _tileEntity98.getTileData().func_74780_a("gezi2", 1.0d);
                                    }
                                    world.func_184138_a(_bp98, _bs98, _bs98, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp99 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity99 = world.func_175625_s(_bp99);
                                    IBlockState _bs99 = world.func_180495_p(_bp99);
                                    if (_tileEntity99 != null) {
                                        _tileEntity99.getTileData().func_74780_a("gezi3", 1.0d);
                                    }
                                    world.func_184138_a(_bp99, _bs99, _bs99, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp100 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity100 = world.func_175625_s(_bp100);
                                    IBlockState _bs100 = world.func_180495_p(_bp100);
                                    if (_tileEntity100 != null) {
                                        _tileEntity100.getTileData().func_74780_a("gezi4", 3.0d);
                                    }
                                    world.func_184138_a(_bp100, _bs100, _bs100, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp101 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity101 = world.func_175625_s(_bp101);
                                    IBlockState _bs101 = world.func_180495_p(_bp101);
                                    if (_tileEntity101 != null) {
                                        _tileEntity101.getTileData().func_74780_a("类型", 21.0d);
                                    }
                                    world.func_184138_a(_bp101, _bs101, _bs101, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp102 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity102 = world.func_175625_s(_bp102);
                                    IBlockState _bs102 = world.func_180495_p(_bp102);
                                    if (_tileEntity102 != null) {
                                        _tileEntity102.getTileData().func_74780_a("扣除灵力", 288.0d);
                                    }
                                    world.func_184138_a(_bp102, _bs102, _bs102, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到元婴期"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.101
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:cailiao17") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.102
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:xiao_huo") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.103
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.104
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.105
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 5 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.106
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 5) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp103 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity103 = world.func_175625_s(_bp103);
                                    IBlockState _bs103 = world.func_180495_p(_bp103);
                                    if (_tileEntity103 != null) {
                                        _tileEntity103.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp103, _bs103, _bs103, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp104 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity104 = world.func_175625_s(_bp104);
                                    IBlockState _bs104 = world.func_180495_p(_bp104);
                                    if (_tileEntity104 != null) {
                                        _tileEntity104.getTileData().func_74780_a("gezi2", 3.0d);
                                    }
                                    world.func_184138_a(_bp104, _bs104, _bs104, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp105 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity105 = world.func_175625_s(_bp105);
                                    IBlockState _bs105 = world.func_180495_p(_bp105);
                                    if (_tileEntity105 != null) {
                                        _tileEntity105.getTileData().func_74780_a("gezi3", 5.0d);
                                    }
                                    world.func_184138_a(_bp105, _bs105, _bs105, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp106 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity106 = world.func_175625_s(_bp106);
                                    IBlockState _bs106 = world.func_180495_p(_bp106);
                                    if (_tileEntity106 != null) {
                                        _tileEntity106.getTileData().func_74780_a("gezi4", 5.0d);
                                    }
                                    world.func_184138_a(_bp106, _bs106, _bs106, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp107 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity107 = world.func_175625_s(_bp107);
                                    IBlockState _bs107 = world.func_180495_p(_bp107);
                                    if (_tileEntity107 != null) {
                                        _tileEntity107.getTileData().func_74780_a("类型", 25.0d);
                                    }
                                    world.func_184138_a(_bp107, _bs107, _bs107, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp108 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity108 = world.func_175625_s(_bp108);
                                    IBlockState _bs108 = world.func_180495_p(_bp108);
                                    if (_tileEntity108 != null) {
                                        _tileEntity108.getTileData().func_74780_a("扣除灵力", 288.0d);
                                    }
                                    world.func_184138_a(_bp108, _bs108, _bs108, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到元婴期"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:材料数量不符或材料错误"), false);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.107
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemZhenQi05.block, 1).func_77973_b()) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.108
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:ju_du_hei_ye") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.109
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("minecraft:dirt") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.110
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.111
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.112
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 8 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.113
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 5) {
                            if (!world.field_72995_K) {
                                BlockPos _bp109 = new BlockPos(x, y, z);
                                TileEntity _tileEntity109 = world.func_175625_s(_bp109);
                                IBlockState _bs109 = world.func_180495_p(_bp109);
                                if (_tileEntity109 != null) {
                                    _tileEntity109.getTileData().func_74780_a("gezi1", 1.0d);
                                }
                                world.func_184138_a(_bp109, _bs109, _bs109, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp110 = new BlockPos(x, y, z);
                                TileEntity _tileEntity110 = world.func_175625_s(_bp110);
                                IBlockState _bs110 = world.func_180495_p(_bp110);
                                if (_tileEntity110 != null) {
                                    _tileEntity110.getTileData().func_74780_a("gezi2", 2.0d);
                                }
                                world.func_184138_a(_bp110, _bs110, _bs110, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp111 = new BlockPos(x, y, z);
                                TileEntity _tileEntity111 = world.func_175625_s(_bp111);
                                IBlockState _bs111 = world.func_180495_p(_bp111);
                                if (_tileEntity111 != null) {
                                    _tileEntity111.getTileData().func_74780_a("gezi3", 8.0d);
                                }
                                world.func_184138_a(_bp111, _bs111, _bs111, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp112 = new BlockPos(x, y, z);
                                TileEntity _tileEntity112 = world.func_175625_s(_bp112);
                                IBlockState _bs112 = world.func_180495_p(_bp112);
                                if (_tileEntity112 != null) {
                                    _tileEntity112.getTileData().func_74780_a("gezi4", 5.0d);
                                }
                                world.func_184138_a(_bp112, _bs112, _bs112, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp113 = new BlockPos(x, y, z);
                                TileEntity _tileEntity113 = world.func_175625_s(_bp113);
                                IBlockState _bs113 = world.func_180495_p(_bp113);
                                if (_tileEntity113 != null) {
                                    _tileEntity113.getTileData().func_74780_a("类型", 16.0d);
                                }
                                world.func_184138_a(_bp113, _bs113, _bs113, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp114 = new BlockPos(x, y, z);
                                TileEntity _tileEntity114 = world.func_175625_s(_bp114);
                                IBlockState _bs114 = world.func_180495_p(_bp114);
                                if (_tileEntity114 != null) {
                                    _tileEntity114.getTileData().func_74780_a("扣除灵力", 32.0d);
                                }
                                world.func_184138_a(_bp114, _bs114, _bs114, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.114
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:cailiao12") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.115
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.116
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.117
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 4 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.118
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.119
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 7) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp115 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity115 = world.func_175625_s(_bp115);
                                    IBlockState _bs115 = world.func_180495_p(_bp115);
                                    if (_tileEntity115 != null) {
                                        _tileEntity115.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp115, _bs115, _bs115, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp116 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity116 = world.func_175625_s(_bp116);
                                    IBlockState _bs116 = world.func_180495_p(_bp116);
                                    if (_tileEntity116 != null) {
                                        _tileEntity116.getTileData().func_74780_a("gezi2", 4.0d);
                                    }
                                    world.func_184138_a(_bp116, _bs116, _bs116, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp117 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity117 = world.func_175625_s(_bp117);
                                    IBlockState _bs117 = world.func_180495_p(_bp117);
                                    if (_tileEntity117 != null) {
                                        _tileEntity117.getTileData().func_74780_a("gezi3", 3.0d);
                                    }
                                    world.func_184138_a(_bp117, _bs117, _bs117, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp118 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity118 = world.func_175625_s(_bp118);
                                    IBlockState _bs118 = world.func_180495_p(_bp118);
                                    if (_tileEntity118 != null) {
                                        _tileEntity118.getTileData().func_74780_a("gezi4", 7.0d);
                                    }
                                    world.func_184138_a(_bp118, _bs118, _bs118, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp119 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity119 = world.func_175625_s(_bp119);
                                    IBlockState _bs119 = world.func_180495_p(_bp119);
                                    if (_tileEntity119 != null) {
                                        _tileEntity119.getTileData().func_74780_a("类型", 17.0d);
                                    }
                                    world.func_184138_a(_bp119, _bs119, _bs119, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp120 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity120 = world.func_175625_s(_bp120);
                                    IBlockState _bs120 = world.func_180495_p(_bp120);
                                    if (_tileEntity120 != null) {
                                        _tileEntity120.getTileData().func_74780_a("扣除灵力", 96.0d);
                                    }
                                    world.func_184138_a(_bp120, _bs120, _bs120, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到结丹期"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.120
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_02") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.121
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:hun_tie") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.122
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.123
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.124
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.125
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 9) {
                            if (!world.field_72995_K) {
                                BlockPos _bp121 = new BlockPos(x, y, z);
                                TileEntity _tileEntity121 = world.func_175625_s(_bp121);
                                IBlockState _bs121 = world.func_180495_p(_bp121);
                                if (_tileEntity121 != null) {
                                    _tileEntity121.getTileData().func_74780_a("gezi1", 1.0d);
                                }
                                world.func_184138_a(_bp121, _bs121, _bs121, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp122 = new BlockPos(x, y, z);
                                TileEntity _tileEntity122 = world.func_175625_s(_bp122);
                                IBlockState _bs122 = world.func_180495_p(_bp122);
                                if (_tileEntity122 != null) {
                                    _tileEntity122.getTileData().func_74780_a("gezi2", 5.0d);
                                }
                                world.func_184138_a(_bp122, _bs122, _bs122, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp123 = new BlockPos(x, y, z);
                                TileEntity _tileEntity123 = world.func_175625_s(_bp123);
                                IBlockState _bs123 = world.func_180495_p(_bp123);
                                if (_tileEntity123 != null) {
                                    _tileEntity123.getTileData().func_74780_a("gezi3", 3.0d);
                                }
                                world.func_184138_a(_bp123, _bs123, _bs123, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp124 = new BlockPos(x, y, z);
                                TileEntity _tileEntity124 = world.func_175625_s(_bp124);
                                IBlockState _bs124 = world.func_180495_p(_bp124);
                                if (_tileEntity124 != null) {
                                    _tileEntity124.getTileData().func_74780_a("gezi4", 9.0d);
                                }
                                world.func_184138_a(_bp124, _bs124, _bs124, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp125 = new BlockPos(x, y, z);
                                TileEntity _tileEntity125 = world.func_175625_s(_bp125);
                                IBlockState _bs125 = world.func_180495_p(_bp125);
                                if (_tileEntity125 != null) {
                                    _tileEntity125.getTileData().func_74780_a("类型", 101.0d);
                                }
                                world.func_184138_a(_bp125, _bs125, _bs125, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp126 = new BlockPos(x, y, z);
                                TileEntity _tileEntity126 = world.func_175625_s(_bp126);
                                IBlockState _bs126 = world.func_180495_p(_bp126);
                                if (_tileEntity126 != null) {
                                    _tileEntity126.getTileData().func_74780_a("扣除灵力", 32.0d);
                                }
                                world.func_184138_a(_bp126, _bs126, _bs126, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.126
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:hu_xin_shi") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.127
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:qing_zhu") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.128
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.129
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.130
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.131
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 18) {
                            if (!world.field_72995_K) {
                                BlockPos _bp127 = new BlockPos(x, y, z);
                                TileEntity _tileEntity127 = world.func_175625_s(_bp127);
                                IBlockState _bs127 = world.func_180495_p(_bp127);
                                if (_tileEntity127 != null) {
                                    _tileEntity127.getTileData().func_74780_a("gezi1", 1.0d);
                                }
                                world.func_184138_a(_bp127, _bs127, _bs127, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp128 = new BlockPos(x, y, z);
                                TileEntity _tileEntity128 = world.func_175625_s(_bp128);
                                IBlockState _bs128 = world.func_180495_p(_bp128);
                                if (_tileEntity128 != null) {
                                    _tileEntity128.getTileData().func_74780_a("gezi2", 5.0d);
                                }
                                world.func_184138_a(_bp128, _bs128, _bs128, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp129 = new BlockPos(x, y, z);
                                TileEntity _tileEntity129 = world.func_175625_s(_bp129);
                                IBlockState _bs129 = world.func_180495_p(_bp129);
                                if (_tileEntity129 != null) {
                                    _tileEntity129.getTileData().func_74780_a("gezi3", 3.0d);
                                }
                                world.func_184138_a(_bp129, _bs129, _bs129, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp130 = new BlockPos(x, y, z);
                                TileEntity _tileEntity130 = world.func_175625_s(_bp130);
                                IBlockState _bs130 = world.func_180495_p(_bp130);
                                if (_tileEntity130 != null) {
                                    _tileEntity130.getTileData().func_74780_a("gezi4", 18.0d);
                                }
                                world.func_184138_a(_bp130, _bs130, _bs130, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp131 = new BlockPos(x, y, z);
                                TileEntity _tileEntity131 = world.func_175625_s(_bp131);
                                IBlockState _bs131 = world.func_180495_p(_bp131);
                                if (_tileEntity131 != null) {
                                    _tileEntity131.getTileData().func_74780_a("类型", 102.0d);
                                }
                                world.func_184138_a(_bp131, _bs131, _bs131, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp132 = new BlockPos(x, y, z);
                                TileEntity _tileEntity132 = world.func_175625_s(_bp132);
                                IBlockState _bs132 = world.func_180495_p(_bp132);
                                if (_tileEntity132 != null) {
                                    _tileEntity132.getTileData().func_74780_a("扣除灵力", 64.0d);
                                }
                                world.func_184138_a(_bp132, _bs132, _bs132, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut2.executeProcedure($_dependencies);
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.132
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fu_ling_shi_yuan") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.133
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.134
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.135
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.136
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.137
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 36) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp133 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity133 = world.func_175625_s(_bp133);
                                    IBlockState _bs133 = world.func_180495_p(_bp133);
                                    if (_tileEntity133 != null) {
                                        _tileEntity133.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp133, _bs133, _bs133, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp134 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity134 = world.func_175625_s(_bp134);
                                    IBlockState _bs134 = world.func_180495_p(_bp134);
                                    if (_tileEntity134 != null) {
                                        _tileEntity134.getTileData().func_74780_a("gezi2", 5.0d);
                                    }
                                    world.func_184138_a(_bp134, _bs134, _bs134, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp135 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity135 = world.func_175625_s(_bp135);
                                    IBlockState _bs135 = world.func_180495_p(_bp135);
                                    if (_tileEntity135 != null) {
                                        _tileEntity135.getTileData().func_74780_a("gezi3", 3.0d);
                                    }
                                    world.func_184138_a(_bp135, _bs135, _bs135, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp136 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity136 = world.func_175625_s(_bp136);
                                    IBlockState _bs136 = world.func_180495_p(_bp136);
                                    if (_tileEntity136 != null) {
                                        _tileEntity136.getTileData().func_74780_a("gezi4", 36.0d);
                                    }
                                    world.func_184138_a(_bp136, _bs136, _bs136, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp137 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity137 = world.func_175625_s(_bp137);
                                    IBlockState _bs137 = world.func_180495_p(_bp137);
                                    if (_tileEntity137 != null) {
                                        _tileEntity137.getTileData().func_74780_a("类型", 103.0d);
                                    }
                                    world.func_184138_a(_bp137, _bs137, _bs137, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp138 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity138 = world.func_175625_s(_bp138);
                                    IBlockState _bs138 = world.func_180495_p(_bp138);
                                    if (_tileEntity138 != null) {
                                        _tileEntity138.getTileData().func_74780_a("扣除灵力", 96.0d);
                                    }
                                    world.func_184138_a(_bp138, _bs138, _bs138, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到结丹期"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.138
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:dian_guang_zhi_xin") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.139
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:dian_guang_zhi_xin") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.140
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.141
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 4 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.142
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.143
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 9) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp139 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity139 = world.func_175625_s(_bp139);
                                    IBlockState _bs139 = world.func_180495_p(_bp139);
                                    if (_tileEntity139 != null) {
                                        _tileEntity139.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp139, _bs139, _bs139, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp140 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity140 = world.func_175625_s(_bp140);
                                    IBlockState _bs140 = world.func_180495_p(_bp140);
                                    if (_tileEntity140 != null) {
                                        _tileEntity140.getTileData().func_74780_a("gezi2", 4.0d);
                                    }
                                    world.func_184138_a(_bp140, _bs140, _bs140, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp141 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity141 = world.func_175625_s(_bp141);
                                    IBlockState _bs141 = world.func_180495_p(_bp141);
                                    if (_tileEntity141 != null) {
                                        _tileEntity141.getTileData().func_74780_a("gezi3", 3.0d);
                                    }
                                    world.func_184138_a(_bp141, _bs141, _bs141, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp142 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity142 = world.func_175625_s(_bp142);
                                    IBlockState _bs142 = world.func_180495_p(_bp142);
                                    if (_tileEntity142 != null) {
                                        _tileEntity142.getTileData().func_74780_a("gezi4", 9.0d);
                                    }
                                    world.func_184138_a(_bp142, _bs142, _bs142, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp143 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity143 = world.func_175625_s(_bp143);
                                    IBlockState _bs143 = world.func_180495_p(_bp143);
                                    if (_tileEntity143 != null) {
                                        _tileEntity143.getTileData().func_74780_a("类型", 104.0d);
                                    }
                                    world.func_184138_a(_bp143, _bs143, _bs143, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp144 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity144 = world.func_175625_s(_bp144);
                                    IBlockState _bs144 = world.func_180495_p(_bp144);
                                    if (_tileEntity144 != null) {
                                        _tileEntity144.getTileData().func_74780_a("扣除灵力", 288.0d);
                                    }
                                    world.func_184138_a(_bp144, _bs144, _bs144, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到元婴期"), false);
                            }
                        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.144
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:hun_dun_jia_dan") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.145
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_13") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.146
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.147
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.148
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.149
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 18) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp145 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity145 = world.func_175625_s(_bp145);
                                    IBlockState _bs145 = world.func_180495_p(_bp145);
                                    if (_tileEntity145 != null) {
                                        _tileEntity145.getTileData().func_74780_a("gezi1", 1.0d);
                                    }
                                    world.func_184138_a(_bp145, _bs145, _bs145, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp146 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity146 = world.func_175625_s(_bp146);
                                    IBlockState _bs146 = world.func_180495_p(_bp146);
                                    if (_tileEntity146 != null) {
                                        _tileEntity146.getTileData().func_74780_a("gezi2", 5.0d);
                                    }
                                    world.func_184138_a(_bp146, _bs146, _bs146, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp147 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity147 = world.func_175625_s(_bp147);
                                    IBlockState _bs147 = world.func_180495_p(_bp147);
                                    if (_tileEntity147 != null) {
                                        _tileEntity147.getTileData().func_74780_a("gezi3", 3.0d);
                                    }
                                    world.func_184138_a(_bp147, _bs147, _bs147, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp148 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity148 = world.func_175625_s(_bp148);
                                    IBlockState _bs148 = world.func_180495_p(_bp148);
                                    if (_tileEntity148 != null) {
                                        _tileEntity148.getTileData().func_74780_a("gezi4", 18.0d);
                                    }
                                    world.func_184138_a(_bp148, _bs148, _bs148, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp149 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity149 = world.func_175625_s(_bp149);
                                    IBlockState _bs149 = world.func_180495_p(_bp149);
                                    if (_tileEntity149 != null) {
                                        _tileEntity149.getTileData().func_74780_a("类型", 105.0d);
                                    }
                                    world.func_184138_a(_bp149, _bs149, _bs149, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp150 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity150 = world.func_175625_s(_bp150);
                                    IBlockState _bs150 = world.func_180495_p(_bp150);
                                    if (_tileEntity150 != null) {
                                        _tileEntity150.getTileData().func_74780_a("扣除灵力", 576.0d);
                                    }
                                    world.func_184138_a(_bp150, _bs150, _bs150, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到化神期"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:材料数量不符或材料错误"), false);
                        }
                    } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.150
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:yaodan0204") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.151
                        public int getAmount(BlockPos pos, int sltid) {
                            ItemStack stack;
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                return stack.func_190916_E();
                            }
                            return 0;
                        }
                    }.getAmount(new BlockPos(x, y, z), 0) >= 3) {
                        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.152
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().contains("minecraft:wool") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.153
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().contains("minecraft:wool") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.154
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(Blocks.field_150347_e, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.155
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 1) >= 7 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.156
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 2) >= 7 && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaPeiFang.157
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3) >= 5) {
                            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                                if (!world.field_72995_K) {
                                    BlockPos _bp151 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity151 = world.func_175625_s(_bp151);
                                    IBlockState _bs151 = world.func_180495_p(_bp151);
                                    if (_tileEntity151 != null) {
                                        _tileEntity151.getTileData().func_74780_a("gezi1", 3.0d);
                                    }
                                    world.func_184138_a(_bp151, _bs151, _bs151, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp152 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity152 = world.func_175625_s(_bp152);
                                    IBlockState _bs152 = world.func_180495_p(_bp152);
                                    if (_tileEntity152 != null) {
                                        _tileEntity152.getTileData().func_74780_a("gezi2", 7.0d);
                                    }
                                    world.func_184138_a(_bp152, _bs152, _bs152, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp153 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity153 = world.func_175625_s(_bp153);
                                    IBlockState _bs153 = world.func_180495_p(_bp153);
                                    if (_tileEntity153 != null) {
                                        _tileEntity153.getTileData().func_74780_a("gezi3", 7.0d);
                                    }
                                    world.func_184138_a(_bp153, _bs153, _bs153, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp154 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity154 = world.func_175625_s(_bp154);
                                    IBlockState _bs154 = world.func_180495_p(_bp154);
                                    if (_tileEntity154 != null) {
                                        _tileEntity154.getTileData().func_74780_a("gezi4", 5.0d);
                                    }
                                    world.func_184138_a(_bp154, _bs154, _bs154, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp155 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity155 = world.func_175625_s(_bp155);
                                    IBlockState _bs155 = world.func_180495_p(_bp155);
                                    if (_tileEntity155 != null) {
                                        _tileEntity155.getTileData().func_74780_a("类型", 19.0d);
                                    }
                                    world.func_184138_a(_bp155, _bs155, _bs155, 3);
                                }
                                if (!world.field_72995_K) {
                                    BlockPos _bp156 = new BlockPos(x, y, z);
                                    TileEntity _tileEntity156 = world.func_175625_s(_bp156);
                                    IBlockState _bs156 = world.func_180495_p(_bp156);
                                    if (_tileEntity156 != null) {
                                        _tileEntity156.getTileData().func_74780_a("扣除灵力", 860.0d);
                                    }
                                    world.func_184138_a(_bp156, _bs156, _bs156, 3);
                                }
                                $_dependencies.put("entity", entityPlayer);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                $_dependencies.put("world", world);
                                ProcedureLingLiCut2.executeProcedure($_dependencies);
                            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:境界未到元婴期"), false);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:材料数量不符或材料错误"), false);
                        }
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("欲制作阵法:主材错误或数量不符"), false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("制作新阵法需先取走以制作完成的阵旗/阵法"), false);
                }
            }
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureWuXingDianDaoPeiFang.executeProcedure($_dependencies);
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("未达到筑基期无法制作任何阵法"), false);
        }
    }
}
