package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemBiHaiLingYuan;
import net.mcreator.fabaokuozhan.item.ItemCaiitem04;
import net.mcreator.fabaokuozhan.item.ItemCailiao11;
import net.mcreator.fabaokuozhan.item.ItemCailiao12;
import net.mcreator.fabaokuozhan.item.ItemCailiao16;
import net.mcreator.fabaokuozhan.item.ItemCailiao17;
import net.mcreator.fabaokuozhan.item.ItemCailiao18;
import net.mcreator.fabaokuozhan.item.ItemCailiao19;
import net.mcreator.fabaokuozhan.item.ItemCailiao9101;
import net.mcreator.fabaokuozhan.item.ItemDianGuangZhiXin;
import net.mcreator.fabaokuozhan.item.ItemFabao21;
import net.mcreator.fabaokuozhan.item.ItemFabao22;
import net.mcreator.fabaokuozhan.item.ItemFabao31;
import net.mcreator.fabaokuozhan.item.ItemHunTie;
import net.mcreator.fabaokuozhan.item.ItemJuDuHeiYe;
import net.mcreator.fabaokuozhan.item.ItemPiXieJiaDan;
import net.mcreator.fabaokuozhan.item.ItemQiLu1;
import net.mcreator.fabaokuozhan.item.ItemQiLu2;
import net.mcreator.fabaokuozhan.item.ItemQiLu3;
import net.mcreator.fabaokuozhan.item.ItemQiLu4;
import net.mcreator.fabaokuozhan.item.ItemShouHuangJingXue;
import net.mcreator.fabaokuozhan.item.ItemShouHuangZhenXue;
import net.mcreator.fabaokuozhan.item.ItemXiaoHuo;
import net.mcreator.fabaokuozhan.item.ItemYuJian13;
import net.mcreator.fabaokuozhan.item.ItemYuJian15;
import net.mcreator.fabaokuozhan.item.ItemYuJian16;
import net.mcreator.fabaokuozhan.item.ItemYuJian20;
import net.mcreator.fabaokuozhan.item.ItemYuJian21;
import net.mcreator.fabaokuozhan.item.ItemYuJian22;
import net.mcreator.fabaokuozhan.item.ItemYujian23;
import net.mcreator.fabaokuozhan.item.ItemYujian24;
import net.mcreator.fabaokuozhan.item.ItemYujian25;
import net.mcreator.fabaokuozhan.item.ItemYyujian26;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianqipeifang03.class */
public class ProcedureLianqipeifang03 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianqipeifang03(ElementsFabaokuozhanMod instance) {
        super(instance, 310);
    }

    /* JADX WARN: Type inference failed for: r0v1058, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$81] */
    /* JADX WARN: Type inference failed for: r0v1061, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$76] */
    /* JADX WARN: Type inference failed for: r0v1064, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$91] */
    /* JADX WARN: Type inference failed for: r0v1070, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$93] */
    /* JADX WARN: Type inference failed for: r0v1073, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$95] */
    /* JADX WARN: Type inference failed for: r0v1079, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$96] */
    /* JADX WARN: Type inference failed for: r0v1082, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$97] */
    /* JADX WARN: Type inference failed for: r0v1085, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$98] */
    /* JADX WARN: Type inference failed for: r0v1088, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$100] */
    /* JADX WARN: Type inference failed for: r0v1095, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$101] */
    /* JADX WARN: Type inference failed for: r0v1098, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$105] */
    /* JADX WARN: Type inference failed for: r0v1101, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$106] */
    /* JADX WARN: Type inference failed for: r0v1103, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$107] */
    /* JADX WARN: Type inference failed for: r0v1105, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$108] */
    /* JADX WARN: Type inference failed for: r0v1184, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$102] */
    /* JADX WARN: Type inference failed for: r0v1186, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$103] */
    /* JADX WARN: Type inference failed for: r0v1188, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$104] */
    /* JADX WARN: Type inference failed for: r0v1267, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$99] */
    /* JADX WARN: Type inference failed for: r0v1270, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$94] */
    /* JADX WARN: Type inference failed for: r0v1273, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$109] */
    /* JADX WARN: Type inference failed for: r0v1276, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$111] */
    /* JADX WARN: Type inference failed for: r0v1279, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$113] */
    /* JADX WARN: Type inference failed for: r0v1282, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$114] */
    /* JADX WARN: Type inference failed for: r0v1285, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$115] */
    /* JADX WARN: Type inference failed for: r0v1288, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$116] */
    /* JADX WARN: Type inference failed for: r0v1291, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$118] */
    /* JADX WARN: Type inference failed for: r0v1298, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$121] */
    /* JADX WARN: Type inference failed for: r0v1301, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$125] */
    /* JADX WARN: Type inference failed for: r0v1304, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$126] */
    /* JADX WARN: Type inference failed for: r0v1306, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$127] */
    /* JADX WARN: Type inference failed for: r0v1308, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$128] */
    /* JADX WARN: Type inference failed for: r0v1387, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$122] */
    /* JADX WARN: Type inference failed for: r0v1389, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$123] */
    /* JADX WARN: Type inference failed for: r0v1391, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$124] */
    /* JADX WARN: Type inference failed for: r0v142, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$12] */
    /* JADX WARN: Type inference failed for: r0v144, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$13] */
    /* JADX WARN: Type inference failed for: r0v146, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$14] */
    /* JADX WARN: Type inference failed for: r0v1470, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$119] */
    /* JADX WARN: Type inference failed for: r0v1473, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$120] */
    /* JADX WARN: Type inference failed for: r0v1475, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$117] */
    /* JADX WARN: Type inference failed for: r0v1478, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$112] */
    /* JADX WARN: Type inference failed for: r0v1481, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$129] */
    /* JADX WARN: Type inference failed for: r0v1487, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$131] */
    /* JADX WARN: Type inference failed for: r0v1490, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$133] */
    /* JADX WARN: Type inference failed for: r0v1493, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$134] */
    /* JADX WARN: Type inference failed for: r0v1496, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$135] */
    /* JADX WARN: Type inference failed for: r0v1499, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$136] */
    /* JADX WARN: Type inference failed for: r0v1502, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$138] */
    /* JADX WARN: Type inference failed for: r0v1509, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$139] */
    /* JADX WARN: Type inference failed for: r0v1512, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$143] */
    /* JADX WARN: Type inference failed for: r0v1515, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$144] */
    /* JADX WARN: Type inference failed for: r0v1517, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$145] */
    /* JADX WARN: Type inference failed for: r0v1519, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$146] */
    /* JADX WARN: Type inference failed for: r0v1598, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$140] */
    /* JADX WARN: Type inference failed for: r0v1600, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$141] */
    /* JADX WARN: Type inference failed for: r0v1602, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$142] */
    /* JADX WARN: Type inference failed for: r0v1681, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$137] */
    /* JADX WARN: Type inference failed for: r0v1684, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$132] */
    /* JADX WARN: Type inference failed for: r0v1687, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$147] */
    /* JADX WARN: Type inference failed for: r0v1690, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$149] */
    /* JADX WARN: Type inference failed for: r0v1693, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$151] */
    /* JADX WARN: Type inference failed for: r0v1696, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$152] */
    /* JADX WARN: Type inference failed for: r0v1699, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$153] */
    /* JADX WARN: Type inference failed for: r0v1702, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$154] */
    /* JADX WARN: Type inference failed for: r0v1705, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$156] */
    /* JADX WARN: Type inference failed for: r0v1712, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$157] */
    /* JADX WARN: Type inference failed for: r0v1715, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$161] */
    /* JADX WARN: Type inference failed for: r0v1718, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$162] */
    /* JADX WARN: Type inference failed for: r0v1720, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$163] */
    /* JADX WARN: Type inference failed for: r0v1722, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$164] */
    /* JADX WARN: Type inference failed for: r0v1801, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$158] */
    /* JADX WARN: Type inference failed for: r0v1803, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$159] */
    /* JADX WARN: Type inference failed for: r0v1805, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$160] */
    /* JADX WARN: Type inference failed for: r0v1884, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$155] */
    /* JADX WARN: Type inference failed for: r0v1887, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$150] */
    /* JADX WARN: Type inference failed for: r0v1890, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$165] */
    /* JADX WARN: Type inference failed for: r0v1896, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$167] */
    /* JADX WARN: Type inference failed for: r0v1899, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$169] */
    /* JADX WARN: Type inference failed for: r0v1905, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$170] */
    /* JADX WARN: Type inference failed for: r0v1908, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$171] */
    /* JADX WARN: Type inference failed for: r0v1911, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$172] */
    /* JADX WARN: Type inference failed for: r0v1914, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$174] */
    /* JADX WARN: Type inference failed for: r0v1921, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$175] */
    /* JADX WARN: Type inference failed for: r0v1924, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$179] */
    /* JADX WARN: Type inference failed for: r0v1927, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$180] */
    /* JADX WARN: Type inference failed for: r0v1929, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$181] */
    /* JADX WARN: Type inference failed for: r0v1931, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$182] */
    /* JADX WARN: Type inference failed for: r0v2010, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$176] */
    /* JADX WARN: Type inference failed for: r0v2012, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$177] */
    /* JADX WARN: Type inference failed for: r0v2014, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$178] */
    /* JADX WARN: Type inference failed for: r0v2093, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$173] */
    /* JADX WARN: Type inference failed for: r0v2096, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$168] */
    /* JADX WARN: Type inference failed for: r0v2110, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$166] */
    /* JADX WARN: Type inference failed for: r0v2116, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$148] */
    /* JADX WARN: Type inference failed for: r0v2119, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$130] */
    /* JADX WARN: Type inference failed for: r0v2125, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$110] */
    /* JADX WARN: Type inference failed for: r0v2128, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$92] */
    /* JADX WARN: Type inference failed for: r0v2134, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$74] */
    /* JADX WARN: Type inference failed for: r0v2140, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$56] */
    /* JADX WARN: Type inference failed for: r0v2143, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$38] */
    /* JADX WARN: Type inference failed for: r0v2149, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$20] */
    /* JADX WARN: Type inference failed for: r0v2155, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$2] */
    /* JADX WARN: Type inference failed for: r0v225, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$9] */
    /* JADX WARN: Type inference failed for: r0v228, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$4] */
    /* JADX WARN: Type inference failed for: r0v231, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$19] */
    /* JADX WARN: Type inference failed for: r0v237, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$21] */
    /* JADX WARN: Type inference failed for: r0v243, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$23] */
    /* JADX WARN: Type inference failed for: r0v246, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$24] */
    /* JADX WARN: Type inference failed for: r0v249, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$25] */
    /* JADX WARN: Type inference failed for: r0v252, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$26] */
    /* JADX WARN: Type inference failed for: r0v255, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$28] */
    /* JADX WARN: Type inference failed for: r0v262, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$29] */
    /* JADX WARN: Type inference failed for: r0v268, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$33] */
    /* JADX WARN: Type inference failed for: r0v274, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$34] */
    /* JADX WARN: Type inference failed for: r0v276, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$35] */
    /* JADX WARN: Type inference failed for: r0v278, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$36] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$3] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$5] */
    /* JADX WARN: Type inference failed for: r0v357, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$30] */
    /* JADX WARN: Type inference failed for: r0v359, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$31] */
    /* JADX WARN: Type inference failed for: r0v361, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$32] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$6] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$7] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$8] */
    /* JADX WARN: Type inference failed for: r0v440, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$27] */
    /* JADX WARN: Type inference failed for: r0v443, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$22] */
    /* JADX WARN: Type inference failed for: r0v449, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$37] */
    /* JADX WARN: Type inference failed for: r0v455, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$39] */
    /* JADX WARN: Type inference failed for: r0v458, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$41] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$10] */
    /* JADX WARN: Type inference failed for: r0v461, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$42] */
    /* JADX WARN: Type inference failed for: r0v464, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$43] */
    /* JADX WARN: Type inference failed for: r0v467, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$44] */
    /* JADX WARN: Type inference failed for: r0v470, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$46] */
    /* JADX WARN: Type inference failed for: r0v477, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$47] */
    /* JADX WARN: Type inference failed for: r0v480, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$51] */
    /* JADX WARN: Type inference failed for: r0v483, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$52] */
    /* JADX WARN: Type inference failed for: r0v485, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$53] */
    /* JADX WARN: Type inference failed for: r0v487, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$54] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$11] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$15] */
    /* JADX WARN: Type inference failed for: r0v566, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$48] */
    /* JADX WARN: Type inference failed for: r0v568, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$49] */
    /* JADX WARN: Type inference failed for: r0v570, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$50] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$16] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$17] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$18] */
    /* JADX WARN: Type inference failed for: r0v649, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$45] */
    /* JADX WARN: Type inference failed for: r0v652, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$40] */
    /* JADX WARN: Type inference failed for: r0v655, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$55] */
    /* JADX WARN: Type inference failed for: r0v658, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$57] */
    /* JADX WARN: Type inference failed for: r0v661, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$59] */
    /* JADX WARN: Type inference failed for: r0v664, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$60] */
    /* JADX WARN: Type inference failed for: r0v667, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$61] */
    /* JADX WARN: Type inference failed for: r0v670, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$62] */
    /* JADX WARN: Type inference failed for: r0v673, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$64] */
    /* JADX WARN: Type inference failed for: r0v680, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$65] */
    /* JADX WARN: Type inference failed for: r0v683, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$69] */
    /* JADX WARN: Type inference failed for: r0v686, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$70] */
    /* JADX WARN: Type inference failed for: r0v688, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$71] */
    /* JADX WARN: Type inference failed for: r0v690, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$72] */
    /* JADX WARN: Type inference failed for: r0v769, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$66] */
    /* JADX WARN: Type inference failed for: r0v771, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$67] */
    /* JADX WARN: Type inference failed for: r0v773, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$68] */
    /* JADX WARN: Type inference failed for: r0v852, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$63] */
    /* JADX WARN: Type inference failed for: r0v855, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$58] */
    /* JADX WARN: Type inference failed for: r0v858, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$73] */
    /* JADX WARN: Type inference failed for: r0v864, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$75] */
    /* JADX WARN: Type inference failed for: r0v867, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$77] */
    /* JADX WARN: Type inference failed for: r0v870, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$78] */
    /* JADX WARN: Type inference failed for: r0v873, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$79] */
    /* JADX WARN: Type inference failed for: r0v876, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$80] */
    /* JADX WARN: Type inference failed for: r0v879, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$82] */
    /* JADX WARN: Type inference failed for: r0v886, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$83] */
    /* JADX WARN: Type inference failed for: r0v889, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$87] */
    /* JADX WARN: Type inference failed for: r0v892, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$88] */
    /* JADX WARN: Type inference failed for: r0v894, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$89] */
    /* JADX WARN: Type inference failed for: r0v896, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$90] */
    /* JADX WARN: Type inference failed for: r0v975, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$84] */
    /* JADX WARN: Type inference failed for: r0v977, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$85] */
    /* JADX WARN: Type inference failed for: r0v979, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03$86] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemShouHuangZhenXue.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemShouHuangZhenXue.block, 1).func_77973_b()) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao16.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao16.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao19.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 5.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 5.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.8
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu3.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYuJian13.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 5.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemShouHuangZhenXue.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.12
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.13
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.14
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("shuliang1", 2.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("shuliang2", 2.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("leixing", 13.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("扣除灵力", 3500.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("lianqijingyan", 625.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.15
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemShouHuangZhenXue.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.16
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.17
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.18
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2) {
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("shuliang1", 2.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("shuliang2", 2.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("leixing", 13.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("扣除灵力", 3500.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("lianqijingyan", 625.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.19
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao36") || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.20
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao36")) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.21
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07") || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.22
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07")) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.23
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFabao21.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.24
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 3.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 3.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.26
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu1.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.27
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYuJian15.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.28
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 3.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.29
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao36") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.30
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.31
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.32
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3) {
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("leixing", 15.0d);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.33
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao36") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.34
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.35
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.36
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3) {
                if (!world.field_72995_K) {
                    BlockPos _bp19 = new BlockPos(x, y, z);
                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                    IBlockState _bs19 = world.func_180495_p(_bp19);
                    if (_tileEntity19 != null) {
                        _tileEntity19.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                    IBlockState _bs21 = world.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                    IBlockState _bs22 = world.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("leixing", 15.0d);
                    }
                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                    IBlockState _bs23 = world.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.37
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao37") || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.38
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao37")) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.39
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemDianGuangZhiXin.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.40
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemDianGuangZhiXin.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.41
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFabao22.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.42
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 5.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.43
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 5.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.44
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu1.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.45
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYuJian16.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.46
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 5.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.47
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemDianGuangZhiXin.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.48
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.49
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.50
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 4) {
                if (!world.field_72995_K) {
                    BlockPos _bp25 = new BlockPos(x, y, z);
                    TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                    IBlockState _bs25 = world.func_180495_p(_bp25);
                    if (_tileEntity25 != null) {
                        _tileEntity25.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp25, _bs25, _bs25, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp26 = new BlockPos(x, y, z);
                    TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                    IBlockState _bs26 = world.func_180495_p(_bp26);
                    if (_tileEntity26 != null) {
                        _tileEntity26.getTileData().func_74780_a("shuliang1", 5.0d);
                    }
                    world.func_184138_a(_bp26, _bs26, _bs26, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp27 = new BlockPos(x, y, z);
                    TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                    IBlockState _bs27 = world.func_180495_p(_bp27);
                    if (_tileEntity27 != null) {
                        _tileEntity27.getTileData().func_74780_a("shuliang2", 4.0d);
                    }
                    world.func_184138_a(_bp27, _bs27, _bs27, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                    IBlockState _bs28 = world.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("leixing", 16.0d);
                    }
                    world.func_184138_a(_bp28, _bs28, _bs28, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp29 = new BlockPos(x, y, z);
                    TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                    IBlockState _bs29 = world.func_180495_p(_bp29);
                    if (_tileEntity29 != null) {
                        _tileEntity29.getTileData().func_74780_a("扣除灵力", 3500.0d);
                    }
                    world.func_184138_a(_bp29, _bs29, _bs29, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp30 = new BlockPos(x, y, z);
                    TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                    IBlockState _bs30 = world.func_180495_p(_bp30);
                    if (_tileEntity30 != null) {
                        _tileEntity30.getTileData().func_74780_a("lianqijingyan", 625.0d);
                    }
                    world.func_184138_a(_bp30, _bs30, _bs30, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.51
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemDianGuangZhiXin.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.52
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.53
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.54
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 5) {
                if (!world.field_72995_K) {
                    BlockPos _bp31 = new BlockPos(x, y, z);
                    TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                    IBlockState _bs31 = world.func_180495_p(_bp31);
                    if (_tileEntity31 != null) {
                        _tileEntity31.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp31, _bs31, _bs31, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp32 = new BlockPos(x, y, z);
                    TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                    IBlockState _bs32 = world.func_180495_p(_bp32);
                    if (_tileEntity32 != null) {
                        _tileEntity32.getTileData().func_74780_a("shuliang1", 4.0d);
                    }
                    world.func_184138_a(_bp32, _bs32, _bs32, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp33 = new BlockPos(x, y, z);
                    TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                    IBlockState _bs33 = world.func_180495_p(_bp33);
                    if (_tileEntity33 != null) {
                        _tileEntity33.getTileData().func_74780_a("shuliang2", 5.0d);
                    }
                    world.func_184138_a(_bp33, _bs33, _bs33, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp34 = new BlockPos(x, y, z);
                    TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                    IBlockState _bs34 = world.func_180495_p(_bp34);
                    if (_tileEntity34 != null) {
                        _tileEntity34.getTileData().func_74780_a("leixing", 16.0d);
                    }
                    world.func_184138_a(_bp34, _bs34, _bs34, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp35 = new BlockPos(x, y, z);
                    TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                    IBlockState _bs35 = world.func_180495_p(_bp35);
                    if (_tileEntity35 != null) {
                        _tileEntity35.getTileData().func_74780_a("扣除灵力", 3500.0d);
                    }
                    world.func_184138_a(_bp35, _bs35, _bs35, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp36 = new BlockPos(x, y, z);
                    TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                    IBlockState _bs36 = world.func_180495_p(_bp36);
                    if (_tileEntity36 != null) {
                        _tileEntity36.getTileData().func_74780_a("lianqijingyan", 625.0d);
                    }
                    world.func_184138_a(_bp36, _bs36, _bs36, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.55
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemPiXieJiaDan.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.56
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemPiXieJiaDan.block, 1).func_77973_b()) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.57
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemBiHaiLingYuan.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.58
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemBiHaiLingYuan.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.59
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao18.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.60
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 5.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.61
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 5.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.62
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu4.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.63
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYuJian20.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.64
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 5.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.65
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemPiXieJiaDan.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.66
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.67
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.68
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2) {
                if (!world.field_72995_K) {
                    BlockPos _bp37 = new BlockPos(x, y, z);
                    TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                    IBlockState _bs37 = world.func_180495_p(_bp37);
                    if (_tileEntity37 != null) {
                        _tileEntity37.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp37, _bs37, _bs37, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp38 = new BlockPos(x, y, z);
                    TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                    IBlockState _bs38 = world.func_180495_p(_bp38);
                    if (_tileEntity38 != null) {
                        _tileEntity38.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp38, _bs38, _bs38, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp39 = new BlockPos(x, y, z);
                    TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                    IBlockState _bs39 = world.func_180495_p(_bp39);
                    if (_tileEntity39 != null) {
                        _tileEntity39.getTileData().func_74780_a("shuliang2", 2.0d);
                    }
                    world.func_184138_a(_bp39, _bs39, _bs39, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp40 = new BlockPos(x, y, z);
                    TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                    IBlockState _bs40 = world.func_180495_p(_bp40);
                    if (_tileEntity40 != null) {
                        _tileEntity40.getTileData().func_74780_a("leixing", 20.0d);
                    }
                    world.func_184138_a(_bp40, _bs40, _bs40, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp41 = new BlockPos(x, y, z);
                    TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                    IBlockState _bs41 = world.func_180495_p(_bp41);
                    if (_tileEntity41 != null) {
                        _tileEntity41.getTileData().func_74780_a("扣除灵力", 3500.0d);
                    }
                    world.func_184138_a(_bp41, _bs41, _bs41, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp42 = new BlockPos(x, y, z);
                    TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                    IBlockState _bs42 = world.func_180495_p(_bp42);
                    if (_tileEntity42 != null) {
                        _tileEntity42.getTileData().func_74780_a("lianqijingyan", 625.0d);
                    }
                    world.func_184138_a(_bp42, _bs42, _bs42, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.69
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemPiXieJiaDan.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.70
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.71
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.72
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3) {
                if (!world.field_72995_K) {
                    BlockPos _bp43 = new BlockPos(x, y, z);
                    TileEntity _tileEntity43 = world.func_175625_s(_bp43);
                    IBlockState _bs43 = world.func_180495_p(_bp43);
                    if (_tileEntity43 != null) {
                        _tileEntity43.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp43, _bs43, _bs43, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp44 = new BlockPos(x, y, z);
                    TileEntity _tileEntity44 = world.func_175625_s(_bp44);
                    IBlockState _bs44 = world.func_180495_p(_bp44);
                    if (_tileEntity44 != null) {
                        _tileEntity44.getTileData().func_74780_a("shuliang1", 2.0d);
                    }
                    world.func_184138_a(_bp44, _bs44, _bs44, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp45 = new BlockPos(x, y, z);
                    TileEntity _tileEntity45 = world.func_175625_s(_bp45);
                    IBlockState _bs45 = world.func_180495_p(_bp45);
                    if (_tileEntity45 != null) {
                        _tileEntity45.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp45, _bs45, _bs45, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp46 = new BlockPos(x, y, z);
                    TileEntity _tileEntity46 = world.func_175625_s(_bp46);
                    IBlockState _bs46 = world.func_180495_p(_bp46);
                    if (_tileEntity46 != null) {
                        _tileEntity46.getTileData().func_74780_a("leixing", 20.0d);
                    }
                    world.func_184138_a(_bp46, _bs46, _bs46, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp47 = new BlockPos(x, y, z);
                    TileEntity _tileEntity47 = world.func_175625_s(_bp47);
                    IBlockState _bs47 = world.func_180495_p(_bp47);
                    if (_tileEntity47 != null) {
                        _tileEntity47.getTileData().func_74780_a("扣除灵力", 3500.0d);
                    }
                    world.func_184138_a(_bp47, _bs47, _bs47, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp48 = new BlockPos(x, y, z);
                    TileEntity _tileEntity48 = world.func_175625_s(_bp48);
                    IBlockState _bs48 = world.func_180495_p(_bp48);
                    if (_tileEntity48 != null) {
                        _tileEntity48.getTileData().func_74780_a("lianqijingyan", 625.0d);
                    }
                    world.func_184138_a(_bp48, _bs48, _bs48, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.73
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:huoyan04") || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.74
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:huoyan04")) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.75
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemShouHuangJingXue.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.76
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemShouHuangJingXue.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.77
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.78
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 4.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.79
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 4.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.80
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu3.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.81
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYuJian21.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.82
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 4.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.83
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemShouHuangJingXue.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.84
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.85
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.86
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 1) {
                if (!world.field_72995_K) {
                    BlockPos _bp49 = new BlockPos(x, y, z);
                    TileEntity _tileEntity49 = world.func_175625_s(_bp49);
                    IBlockState _bs49 = world.func_180495_p(_bp49);
                    if (_tileEntity49 != null) {
                        _tileEntity49.getTileData().func_74780_a("shuliang0", 5.0d);
                    }
                    world.func_184138_a(_bp49, _bs49, _bs49, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp50 = new BlockPos(x, y, z);
                    TileEntity _tileEntity50 = world.func_175625_s(_bp50);
                    IBlockState _bs50 = world.func_180495_p(_bp50);
                    if (_tileEntity50 != null) {
                        _tileEntity50.getTileData().func_74780_a("shuliang1", 4.0d);
                    }
                    world.func_184138_a(_bp50, _bs50, _bs50, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp51 = new BlockPos(x, y, z);
                    TileEntity _tileEntity51 = world.func_175625_s(_bp51);
                    IBlockState _bs51 = world.func_180495_p(_bp51);
                    if (_tileEntity51 != null) {
                        _tileEntity51.getTileData().func_74780_a("shuliang2", 1.0d);
                    }
                    world.func_184138_a(_bp51, _bs51, _bs51, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp52 = new BlockPos(x, y, z);
                    TileEntity _tileEntity52 = world.func_175625_s(_bp52);
                    IBlockState _bs52 = world.func_180495_p(_bp52);
                    if (_tileEntity52 != null) {
                        _tileEntity52.getTileData().func_74780_a("leixing", 21.0d);
                    }
                    world.func_184138_a(_bp52, _bs52, _bs52, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp53 = new BlockPos(x, y, z);
                    TileEntity _tileEntity53 = world.func_175625_s(_bp53);
                    IBlockState _bs53 = world.func_180495_p(_bp53);
                    if (_tileEntity53 != null) {
                        _tileEntity53.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp53, _bs53, _bs53, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp54 = new BlockPos(x, y, z);
                    TileEntity _tileEntity54 = world.func_175625_s(_bp54);
                    IBlockState _bs54 = world.func_180495_p(_bp54);
                    if (_tileEntity54 != null) {
                        _tileEntity54.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp54, _bs54, _bs54, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.87
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemShouHuangJingXue.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.88
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.89
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.90
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 4) {
                if (!world.field_72995_K) {
                    BlockPos _bp55 = new BlockPos(x, y, z);
                    TileEntity _tileEntity55 = world.func_175625_s(_bp55);
                    IBlockState _bs55 = world.func_180495_p(_bp55);
                    if (_tileEntity55 != null) {
                        _tileEntity55.getTileData().func_74780_a("shuliang0", 5.0d);
                    }
                    world.func_184138_a(_bp55, _bs55, _bs55, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp56 = new BlockPos(x, y, z);
                    TileEntity _tileEntity56 = world.func_175625_s(_bp56);
                    IBlockState _bs56 = world.func_180495_p(_bp56);
                    if (_tileEntity56 != null) {
                        _tileEntity56.getTileData().func_74780_a("shuliang1", 1.0d);
                    }
                    world.func_184138_a(_bp56, _bs56, _bs56, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp57 = new BlockPos(x, y, z);
                    TileEntity _tileEntity57 = world.func_175625_s(_bp57);
                    IBlockState _bs57 = world.func_180495_p(_bp57);
                    if (_tileEntity57 != null) {
                        _tileEntity57.getTileData().func_74780_a("shuliang2", 4.0d);
                    }
                    world.func_184138_a(_bp57, _bs57, _bs57, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp58 = new BlockPos(x, y, z);
                    TileEntity _tileEntity58 = world.func_175625_s(_bp58);
                    IBlockState _bs58 = world.func_180495_p(_bp58);
                    if (_tileEntity58 != null) {
                        _tileEntity58.getTileData().func_74780_a("leixing", 21.0d);
                    }
                    world.func_184138_a(_bp58, _bs58, _bs58, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp59 = new BlockPos(x, y, z);
                    TileEntity _tileEntity59 = world.func_175625_s(_bp59);
                    IBlockState _bs59 = world.func_180495_p(_bp59);
                    if (_tileEntity59 != null) {
                        _tileEntity59.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp59, _bs59, _bs59, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp60 = new BlockPos(x, y, z);
                    TileEntity _tileEntity60 = world.func_175625_s(_bp60);
                    IBlockState _bs60 = world.func_180495_p(_bp60);
                    if (_tileEntity60 != null) {
                        _tileEntity60.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp60, _bs60, _bs60, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.91
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_02") || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.92
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_02")) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.93
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.94
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.95
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao35") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.96
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 1.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.97
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 1.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.98
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu1.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.99
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYuJian22.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.100
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 1.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.101
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.102
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.103
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.104
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3) {
                if (!world.field_72995_K) {
                    BlockPos _bp61 = new BlockPos(x, y, z);
                    TileEntity _tileEntity61 = world.func_175625_s(_bp61);
                    IBlockState _bs61 = world.func_180495_p(_bp61);
                    if (_tileEntity61 != null) {
                        _tileEntity61.getTileData().func_74780_a("shuliang0", 4.0d);
                    }
                    world.func_184138_a(_bp61, _bs61, _bs61, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp62 = new BlockPos(x, y, z);
                    TileEntity _tileEntity62 = world.func_175625_s(_bp62);
                    IBlockState _bs62 = world.func_180495_p(_bp62);
                    if (_tileEntity62 != null) {
                        _tileEntity62.getTileData().func_74780_a("shuliang1", 1.0d);
                    }
                    world.func_184138_a(_bp62, _bs62, _bs62, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp63 = new BlockPos(x, y, z);
                    TileEntity _tileEntity63 = world.func_175625_s(_bp63);
                    IBlockState _bs63 = world.func_180495_p(_bp63);
                    if (_tileEntity63 != null) {
                        _tileEntity63.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp63, _bs63, _bs63, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp64 = new BlockPos(x, y, z);
                    TileEntity _tileEntity64 = world.func_175625_s(_bp64);
                    IBlockState _bs64 = world.func_180495_p(_bp64);
                    if (_tileEntity64 != null) {
                        _tileEntity64.getTileData().func_74780_a("leixing", 22.0d);
                    }
                    world.func_184138_a(_bp64, _bs64, _bs64, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp65 = new BlockPos(x, y, z);
                    TileEntity _tileEntity65 = world.func_175625_s(_bp65);
                    IBlockState _bs65 = world.func_180495_p(_bp65);
                    if (_tileEntity65 != null) {
                        _tileEntity65.getTileData().func_74780_a("扣除灵力", 75.0d);
                    }
                    world.func_184138_a(_bp65, _bs65, _bs65, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp66 = new BlockPos(x, y, z);
                    TileEntity _tileEntity66 = world.func_175625_s(_bp66);
                    IBlockState _bs66 = world.func_180495_p(_bp66);
                    if (_tileEntity66 != null) {
                        _tileEntity66.getTileData().func_74780_a("lianqijingyan", 1.0d);
                    }
                    world.func_184138_a(_bp66, _bs66, _bs66, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.105
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.106
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.107
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.108
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 1) {
                if (!world.field_72995_K) {
                    BlockPos _bp67 = new BlockPos(x, y, z);
                    TileEntity _tileEntity67 = world.func_175625_s(_bp67);
                    IBlockState _bs67 = world.func_180495_p(_bp67);
                    if (_tileEntity67 != null) {
                        _tileEntity67.getTileData().func_74780_a("shuliang0", 4.0d);
                    }
                    world.func_184138_a(_bp67, _bs67, _bs67, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp68 = new BlockPos(x, y, z);
                    TileEntity _tileEntity68 = world.func_175625_s(_bp68);
                    IBlockState _bs68 = world.func_180495_p(_bp68);
                    if (_tileEntity68 != null) {
                        _tileEntity68.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp68, _bs68, _bs68, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp69 = new BlockPos(x, y, z);
                    TileEntity _tileEntity69 = world.func_175625_s(_bp69);
                    IBlockState _bs69 = world.func_180495_p(_bp69);
                    if (_tileEntity69 != null) {
                        _tileEntity69.getTileData().func_74780_a("shuliang2", 1.0d);
                    }
                    world.func_184138_a(_bp69, _bs69, _bs69, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp70 = new BlockPos(x, y, z);
                    TileEntity _tileEntity70 = world.func_175625_s(_bp70);
                    IBlockState _bs70 = world.func_180495_p(_bp70);
                    if (_tileEntity70 != null) {
                        _tileEntity70.getTileData().func_74780_a("leixing", 22.0d);
                    }
                    world.func_184138_a(_bp70, _bs70, _bs70, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp71 = new BlockPos(x, y, z);
                    TileEntity _tileEntity71 = world.func_175625_s(_bp71);
                    IBlockState _bs71 = world.func_180495_p(_bp71);
                    if (_tileEntity71 != null) {
                        _tileEntity71.getTileData().func_74780_a("扣除灵力", 75.0d);
                    }
                    world.func_184138_a(_bp71, _bs71, _bs71, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp72 = new BlockPos(x, y, z);
                    TileEntity _tileEntity72 = world.func_175625_s(_bp72);
                    IBlockState _bs72 = world.func_180495_p(_bp72);
                    if (_tileEntity72 != null) {
                        _tileEntity72.getTileData().func_74780_a("lianqijingyan", 1.0d);
                    }
                    world.func_184138_a(_bp72, _bs72, _bs72, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.109
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao9101.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.110
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao9101.block, 1).func_77973_b()) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.111
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemXiaoHuo.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.112
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemXiaoHuo.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.113
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(Items.field_151016_H, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.114
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 2.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.115
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 2.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.116
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu1.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.117
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYujian23.block, 1).func_77973_b()) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.118
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.119
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFabao31.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.120
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 6) < 16)) && entity.getEntityData().func_74769_h("JingJieNum") >= 2.0d)))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.121
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao9101.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.122
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.123
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.124
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3) {
                if (!world.field_72995_K) {
                    BlockPos _bp73 = new BlockPos(x, y, z);
                    TileEntity _tileEntity73 = world.func_175625_s(_bp73);
                    IBlockState _bs73 = world.func_180495_p(_bp73);
                    if (_tileEntity73 != null) {
                        _tileEntity73.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp73, _bs73, _bs73, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp74 = new BlockPos(x, y, z);
                    TileEntity _tileEntity74 = world.func_175625_s(_bp74);
                    IBlockState _bs74 = world.func_180495_p(_bp74);
                    if (_tileEntity74 != null) {
                        _tileEntity74.getTileData().func_74780_a("shuliang1", 1.0d);
                    }
                    world.func_184138_a(_bp74, _bs74, _bs74, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp75 = new BlockPos(x, y, z);
                    TileEntity _tileEntity75 = world.func_175625_s(_bp75);
                    IBlockState _bs75 = world.func_180495_p(_bp75);
                    if (_tileEntity75 != null) {
                        _tileEntity75.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp75, _bs75, _bs75, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp76 = new BlockPos(x, y, z);
                    TileEntity _tileEntity76 = world.func_175625_s(_bp76);
                    IBlockState _bs76 = world.func_180495_p(_bp76);
                    if (_tileEntity76 != null) {
                        _tileEntity76.getTileData().func_74780_a("leixing", 23.0d);
                    }
                    world.func_184138_a(_bp76, _bs76, _bs76, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp77 = new BlockPos(x, y, z);
                    TileEntity _tileEntity77 = world.func_175625_s(_bp77);
                    IBlockState _bs77 = world.func_180495_p(_bp77);
                    if (_tileEntity77 != null) {
                        _tileEntity77.getTileData().func_74780_a("扣除灵力", 160.0d);
                    }
                    world.func_184138_a(_bp77, _bs77, _bs77, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp78 = new BlockPos(x, y, z);
                    TileEntity _tileEntity78 = world.func_175625_s(_bp78);
                    IBlockState _bs78 = world.func_180495_p(_bp78);
                    if (_tileEntity78 != null) {
                        _tileEntity78.getTileData().func_74780_a("lianqijingyan", 5.0d);
                    }
                    world.func_184138_a(_bp78, _bs78, _bs78, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.125
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao9101.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.126
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.127
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.128
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 1) {
                if (!world.field_72995_K) {
                    BlockPos _bp79 = new BlockPos(x, y, z);
                    TileEntity _tileEntity79 = world.func_175625_s(_bp79);
                    IBlockState _bs79 = world.func_180495_p(_bp79);
                    if (_tileEntity79 != null) {
                        _tileEntity79.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp79, _bs79, _bs79, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp80 = new BlockPos(x, y, z);
                    TileEntity _tileEntity80 = world.func_175625_s(_bp80);
                    IBlockState _bs80 = world.func_180495_p(_bp80);
                    if (_tileEntity80 != null) {
                        _tileEntity80.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp80, _bs80, _bs80, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp81 = new BlockPos(x, y, z);
                    TileEntity _tileEntity81 = world.func_175625_s(_bp81);
                    IBlockState _bs81 = world.func_180495_p(_bp81);
                    if (_tileEntity81 != null) {
                        _tileEntity81.getTileData().func_74780_a("shuliang2", 1.0d);
                    }
                    world.func_184138_a(_bp81, _bs81, _bs81, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp82 = new BlockPos(x, y, z);
                    TileEntity _tileEntity82 = world.func_175625_s(_bp82);
                    IBlockState _bs82 = world.func_180495_p(_bp82);
                    if (_tileEntity82 != null) {
                        _tileEntity82.getTileData().func_74780_a("leixing", 23.0d);
                    }
                    world.func_184138_a(_bp82, _bs82, _bs82, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp83 = new BlockPos(x, y, z);
                    TileEntity _tileEntity83 = world.func_175625_s(_bp83);
                    IBlockState _bs83 = world.func_180495_p(_bp83);
                    if (_tileEntity83 != null) {
                        _tileEntity83.getTileData().func_74780_a("扣除灵力", 160.0d);
                    }
                    world.func_184138_a(_bp83, _bs83, _bs83, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp84 = new BlockPos(x, y, z);
                    TileEntity _tileEntity84 = world.func_175625_s(_bp84);
                    IBlockState _bs84 = world.func_180495_p(_bp84);
                    if (_tileEntity84 != null) {
                        _tileEntity84.getTileData().func_74780_a("lianqijingyan", 5.0d);
                    }
                    world.func_184138_a(_bp84, _bs84, _bs84, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.129
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao32") || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.130
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao32")) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.131
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemHunTie.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.132
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemHunTie.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.133
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao12.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.134
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 2.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.135
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 2.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.136
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu2.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.137
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYujian24.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.138
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 2.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.139
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemHunTie.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.140
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.141
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.142
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2) {
                if (!world.field_72995_K) {
                    BlockPos _bp85 = new BlockPos(x, y, z);
                    TileEntity _tileEntity85 = world.func_175625_s(_bp85);
                    IBlockState _bs85 = world.func_180495_p(_bp85);
                    if (_tileEntity85 != null) {
                        _tileEntity85.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp85, _bs85, _bs85, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp86 = new BlockPos(x, y, z);
                    TileEntity _tileEntity86 = world.func_175625_s(_bp86);
                    IBlockState _bs86 = world.func_180495_p(_bp86);
                    if (_tileEntity86 != null) {
                        _tileEntity86.getTileData().func_74780_a("shuliang1", 2.0d);
                    }
                    world.func_184138_a(_bp86, _bs86, _bs86, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp87 = new BlockPos(x, y, z);
                    TileEntity _tileEntity87 = world.func_175625_s(_bp87);
                    IBlockState _bs87 = world.func_180495_p(_bp87);
                    if (_tileEntity87 != null) {
                        _tileEntity87.getTileData().func_74780_a("shuliang2", 2.0d);
                    }
                    world.func_184138_a(_bp87, _bs87, _bs87, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp88 = new BlockPos(x, y, z);
                    TileEntity _tileEntity88 = world.func_175625_s(_bp88);
                    IBlockState _bs88 = world.func_180495_p(_bp88);
                    if (_tileEntity88 != null) {
                        _tileEntity88.getTileData().func_74780_a("leixing", 24.0d);
                    }
                    world.func_184138_a(_bp88, _bs88, _bs88, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp89 = new BlockPos(x, y, z);
                    TileEntity _tileEntity89 = world.func_175625_s(_bp89);
                    IBlockState _bs89 = world.func_180495_p(_bp89);
                    if (_tileEntity89 != null) {
                        _tileEntity89.getTileData().func_74780_a("扣除灵力", 160.0d);
                    }
                    world.func_184138_a(_bp89, _bs89, _bs89, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp90 = new BlockPos(x, y, z);
                    TileEntity _tileEntity90 = world.func_175625_s(_bp90);
                    IBlockState _bs90 = world.func_180495_p(_bp90);
                    if (_tileEntity90 != null) {
                        _tileEntity90.getTileData().func_74780_a("lianqijingyan", 5.0d);
                    }
                    world.func_184138_a(_bp90, _bs90, _bs90, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.143
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemHunTie.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.144
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.145
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.146
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2) {
                if (!world.field_72995_K) {
                    BlockPos _bp91 = new BlockPos(x, y, z);
                    TileEntity _tileEntity91 = world.func_175625_s(_bp91);
                    IBlockState _bs91 = world.func_180495_p(_bp91);
                    if (_tileEntity91 != null) {
                        _tileEntity91.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp91, _bs91, _bs91, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp92 = new BlockPos(x, y, z);
                    TileEntity _tileEntity92 = world.func_175625_s(_bp92);
                    IBlockState _bs92 = world.func_180495_p(_bp92);
                    if (_tileEntity92 != null) {
                        _tileEntity92.getTileData().func_74780_a("shuliang1", 2.0d);
                    }
                    world.func_184138_a(_bp92, _bs92, _bs92, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp93 = new BlockPos(x, y, z);
                    TileEntity _tileEntity93 = world.func_175625_s(_bp93);
                    IBlockState _bs93 = world.func_180495_p(_bp93);
                    if (_tileEntity93 != null) {
                        _tileEntity93.getTileData().func_74780_a("shuliang2", 2.0d);
                    }
                    world.func_184138_a(_bp93, _bs93, _bs93, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp94 = new BlockPos(x, y, z);
                    TileEntity _tileEntity94 = world.func_175625_s(_bp94);
                    IBlockState _bs94 = world.func_180495_p(_bp94);
                    if (_tileEntity94 != null) {
                        _tileEntity94.getTileData().func_74780_a("leixing", 24.0d);
                    }
                    world.func_184138_a(_bp94, _bs94, _bs94, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp95 = new BlockPos(x, y, z);
                    TileEntity _tileEntity95 = world.func_175625_s(_bp95);
                    IBlockState _bs95 = world.func_180495_p(_bp95);
                    if (_tileEntity95 != null) {
                        _tileEntity95.getTileData().func_74780_a("扣除灵力", 160.0d);
                    }
                    world.func_184138_a(_bp95, _bs95, _bs95, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp96 = new BlockPos(x, y, z);
                    TileEntity _tileEntity96 = world.func_175625_s(_bp96);
                    IBlockState _bs96 = world.func_180495_p(_bp96);
                    if (_tileEntity96 != null) {
                        _tileEntity96.getTileData().func_74780_a("lianqijingyan", 5.0d);
                    }
                    world.func_184138_a(_bp96, _bs96, _bs96, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.147
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao11.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.148
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao11.block, 1).func_77973_b()) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.149
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemJuDuHeiYe.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.150
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemJuDuHeiYe.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.151
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao12.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.152
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 2.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.153
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 2.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.154
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYujian25.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.155
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu2.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.156
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 2.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.157
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao11.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.158
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.159
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.160
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 5) {
                if (!world.field_72995_K) {
                    BlockPos _bp97 = new BlockPos(x, y, z);
                    TileEntity _tileEntity97 = world.func_175625_s(_bp97);
                    IBlockState _bs97 = world.func_180495_p(_bp97);
                    if (_tileEntity97 != null) {
                        _tileEntity97.getTileData().func_74780_a("shuliang0", 2.0d);
                    }
                    world.func_184138_a(_bp97, _bs97, _bs97, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp98 = new BlockPos(x, y, z);
                    TileEntity _tileEntity98 = world.func_175625_s(_bp98);
                    IBlockState _bs98 = world.func_180495_p(_bp98);
                    if (_tileEntity98 != null) {
                        _tileEntity98.getTileData().func_74780_a("shuliang1", 1.0d);
                    }
                    world.func_184138_a(_bp98, _bs98, _bs98, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp99 = new BlockPos(x, y, z);
                    TileEntity _tileEntity99 = world.func_175625_s(_bp99);
                    IBlockState _bs99 = world.func_180495_p(_bp99);
                    if (_tileEntity99 != null) {
                        _tileEntity99.getTileData().func_74780_a("shuliang2", 5.0d);
                    }
                    world.func_184138_a(_bp99, _bs99, _bs99, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp100 = new BlockPos(x, y, z);
                    TileEntity _tileEntity100 = world.func_175625_s(_bp100);
                    IBlockState _bs100 = world.func_180495_p(_bp100);
                    if (_tileEntity100 != null) {
                        _tileEntity100.getTileData().func_74780_a("leixing", 25.0d);
                    }
                    world.func_184138_a(_bp100, _bs100, _bs100, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp101 = new BlockPos(x, y, z);
                    TileEntity _tileEntity101 = world.func_175625_s(_bp101);
                    IBlockState _bs101 = world.func_180495_p(_bp101);
                    if (_tileEntity101 != null) {
                        _tileEntity101.getTileData().func_74780_a("扣除灵力", 160.0d);
                    }
                    world.func_184138_a(_bp101, _bs101, _bs101, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp102 = new BlockPos(x, y, z);
                    TileEntity _tileEntity102 = world.func_175625_s(_bp102);
                    IBlockState _bs102 = world.func_180495_p(_bp102);
                    if (_tileEntity102 != null) {
                        _tileEntity102.getTileData().func_74780_a("lianqijingyan", 5.0d);
                    }
                    world.func_184138_a(_bp102, _bs102, _bs102, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.161
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao11.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.162
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.163
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.164
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 1) {
                if (!world.field_72995_K) {
                    BlockPos _bp103 = new BlockPos(x, y, z);
                    TileEntity _tileEntity103 = world.func_175625_s(_bp103);
                    IBlockState _bs103 = world.func_180495_p(_bp103);
                    if (_tileEntity103 != null) {
                        _tileEntity103.getTileData().func_74780_a("shuliang0", 2.0d);
                    }
                    world.func_184138_a(_bp103, _bs103, _bs103, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp104 = new BlockPos(x, y, z);
                    TileEntity _tileEntity104 = world.func_175625_s(_bp104);
                    IBlockState _bs104 = world.func_180495_p(_bp104);
                    if (_tileEntity104 != null) {
                        _tileEntity104.getTileData().func_74780_a("shuliang1", 5.0d);
                    }
                    world.func_184138_a(_bp104, _bs104, _bs104, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp105 = new BlockPos(x, y, z);
                    TileEntity _tileEntity105 = world.func_175625_s(_bp105);
                    IBlockState _bs105 = world.func_180495_p(_bp105);
                    if (_tileEntity105 != null) {
                        _tileEntity105.getTileData().func_74780_a("shuliang2", 1.0d);
                    }
                    world.func_184138_a(_bp105, _bs105, _bs105, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp106 = new BlockPos(x, y, z);
                    TileEntity _tileEntity106 = world.func_175625_s(_bp106);
                    IBlockState _bs106 = world.func_180495_p(_bp106);
                    if (_tileEntity106 != null) {
                        _tileEntity106.getTileData().func_74780_a("leixing", 25.0d);
                    }
                    world.func_184138_a(_bp106, _bs106, _bs106, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp107 = new BlockPos(x, y, z);
                    TileEntity _tileEntity107 = world.func_175625_s(_bp107);
                    IBlockState _bs107 = world.func_180495_p(_bp107);
                    if (_tileEntity107 != null) {
                        _tileEntity107.getTileData().func_74780_a("扣除灵力", 160.0d);
                    }
                    world.func_184138_a(_bp107, _bs107, _bs107, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp108 = new BlockPos(x, y, z);
                    TileEntity _tileEntity108 = world.func_175625_s(_bp108);
                    IBlockState _bs108 = world.func_180495_p(_bp108);
                    if (_tileEntity108 != null) {
                        _tileEntity108.getTileData().func_74780_a("lianqijingyan", 5.0d);
                    }
                    world.func_184138_a(_bp108, _bs108, _bs108, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.165
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:caientity0201") || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.166
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:caientity0201")) && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.167
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.168
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.169
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:huoyan04") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.170
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= 4.0d && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.171
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") >= 4.0d && ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.172
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemYyujian26.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.173
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemQiLu1.block, 1).func_77973_b()) && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.174
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && entity.getEntityData().func_74769_h("JingJieNum") >= 4.0d))) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.175
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.176
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.177
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.178
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2) {
                if (!world.field_72995_K) {
                    BlockPos _bp109 = new BlockPos(x, y, z);
                    TileEntity _tileEntity109 = world.func_175625_s(_bp109);
                    IBlockState _bs109 = world.func_180495_p(_bp109);
                    if (_tileEntity109 != null) {
                        _tileEntity109.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp109, _bs109, _bs109, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp110 = new BlockPos(x, y, z);
                    TileEntity _tileEntity110 = world.func_175625_s(_bp110);
                    IBlockState _bs110 = world.func_180495_p(_bp110);
                    if (_tileEntity110 != null) {
                        _tileEntity110.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp110, _bs110, _bs110, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp111 = new BlockPos(x, y, z);
                    TileEntity _tileEntity111 = world.func_175625_s(_bp111);
                    IBlockState _bs111 = world.func_180495_p(_bp111);
                    if (_tileEntity111 != null) {
                        _tileEntity111.getTileData().func_74780_a("shuliang2", 2.0d);
                    }
                    world.func_184138_a(_bp111, _bs111, _bs111, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp112 = new BlockPos(x, y, z);
                    TileEntity _tileEntity112 = world.func_175625_s(_bp112);
                    IBlockState _bs112 = world.func_180495_p(_bp112);
                    if (_tileEntity112 != null) {
                        _tileEntity112.getTileData().func_74780_a("leixing", 26.0d);
                    }
                    world.func_184138_a(_bp112, _bs112, _bs112, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp113 = new BlockPos(x, y, z);
                    TileEntity _tileEntity113 = world.func_175625_s(_bp113);
                    IBlockState _bs113 = world.func_180495_p(_bp113);
                    if (_tileEntity113 != null) {
                        _tileEntity113.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp113, _bs113, _bs113, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp114 = new BlockPos(x, y, z);
                    TileEntity _tileEntity114 = world.func_175625_s(_bp114);
                    IBlockState _bs114 = world.func_180495_p(_bp114);
                    if (_tileEntity114 != null) {
                        _tileEntity114.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp114, _bs114, _bs114, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.179
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.180
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.181
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipeifang03.182
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3) {
                if (!world.field_72995_K) {
                    BlockPos _bp115 = new BlockPos(x, y, z);
                    TileEntity _tileEntity115 = world.func_175625_s(_bp115);
                    IBlockState _bs115 = world.func_180495_p(_bp115);
                    if (_tileEntity115 != null) {
                        _tileEntity115.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp115, _bs115, _bs115, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp116 = new BlockPos(x, y, z);
                    TileEntity _tileEntity116 = world.func_175625_s(_bp116);
                    IBlockState _bs116 = world.func_180495_p(_bp116);
                    if (_tileEntity116 != null) {
                        _tileEntity116.getTileData().func_74780_a("shuliang1", 2.0d);
                    }
                    world.func_184138_a(_bp116, _bs116, _bs116, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp117 = new BlockPos(x, y, z);
                    TileEntity _tileEntity117 = world.func_175625_s(_bp117);
                    IBlockState _bs117 = world.func_180495_p(_bp117);
                    if (_tileEntity117 != null) {
                        _tileEntity117.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp117, _bs117, _bs117, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp118 = new BlockPos(x, y, z);
                    TileEntity _tileEntity118 = world.func_175625_s(_bp118);
                    IBlockState _bs118 = world.func_180495_p(_bp118);
                    if (_tileEntity118 != null) {
                        _tileEntity118.getTileData().func_74780_a("leixing", 26.0d);
                    }
                    world.func_184138_a(_bp118, _bs118, _bs118, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp119 = new BlockPos(x, y, z);
                    TileEntity _tileEntity119 = world.func_175625_s(_bp119);
                    IBlockState _bs119 = world.func_180495_p(_bp119);
                    if (_tileEntity119 != null) {
                        _tileEntity119.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp119, _bs119, _bs119, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp120 = new BlockPos(x, y, z);
                    TileEntity _tileEntity120 = world.func_175625_s(_bp120);
                    IBlockState _bs120 = world.func_180495_p(_bp120);
                    if (_tileEntity120 != null) {
                        _tileEntity120.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp120, _bs120, _bs120, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else {
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianQiPeiFang04.executeProcedure($_dependencies);
        }
    }
}
