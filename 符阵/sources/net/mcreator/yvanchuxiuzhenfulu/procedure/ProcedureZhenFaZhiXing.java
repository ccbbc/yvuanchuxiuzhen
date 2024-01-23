package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaZhiXing.class */
public class ProcedureZhenFaZhiXing extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaZhiXing(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 389);
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$335] */
    /* JADX WARN: Type inference failed for: r0v108, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$337] */
    /* JADX WARN: Type inference failed for: r0v167, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$240] */
    /* JADX WARN: Type inference failed for: r0v170, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$255] */
    /* JADX WARN: Type inference failed for: r0v176, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$272] */
    /* JADX WARN: Type inference failed for: r0v182, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$288] */
    /* JADX WARN: Type inference failed for: r0v188, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$304] */
    /* JADX WARN: Type inference failed for: r0v200, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$319] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$1] */
    /* JADX WARN: Type inference failed for: r0v232, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$303] */
    /* JADX WARN: Type inference failed for: r0v264, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$287] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$339] */
    /* JADX WARN: Type inference failed for: r0v290, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$256] */
    /* JADX WARN: Type inference failed for: r0v299, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$271] */
    /* JADX WARN: Type inference failed for: r0v344, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$164] */
    /* JADX WARN: Type inference failed for: r0v347, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$178] */
    /* JADX WARN: Type inference failed for: r0v353, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$194] */
    /* JADX WARN: Type inference failed for: r0v359, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$209] */
    /* JADX WARN: Type inference failed for: r0v365, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$224] */
    /* JADX WARN: Type inference failed for: r0v377, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$238] */
    /* JADX WARN: Type inference failed for: r0v409, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$223] */
    /* JADX WARN: Type inference failed for: r0v441, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$208] */
    /* JADX WARN: Type inference failed for: r0v467, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$179] */
    /* JADX WARN: Type inference failed for: r0v476, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$193] */
    /* JADX WARN: Type inference failed for: r0v527, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$132] */
    /* JADX WARN: Type inference failed for: r0v530, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$147] */
    /* JADX WARN: Type inference failed for: r0v533, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$162] */
    /* JADX WARN: Type inference failed for: r0v589, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$133] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$2] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$37] */
    /* JADX WARN: Type inference failed for: r0v642, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$125] */
    /* JADX WARN: Type inference failed for: r0v645, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$127] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$55] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$73] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$91] */
    /* JADX WARN: Type inference failed for: r0v710, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$107] */
    /* JADX WARN: Type inference failed for: r0v713, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$109] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$110] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$128] */
    /* JADX WARN: Type inference failed for: r0v778, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$88] */
    /* JADX WARN: Type inference failed for: r0v781, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$90] */
    /* JADX WARN: Type inference failed for: r0v80, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$163] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$239] */
    /* JADX WARN: Type inference failed for: r0v846, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$70] */
    /* JADX WARN: Type inference failed for: r0v849, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$72] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$320] */
    /* JADX WARN: Type inference failed for: r0v914, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$52] */
    /* JADX WARN: Type inference failed for: r0v917, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$54] */
    /* JADX WARN: Type inference failed for: r0v982, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$6] */
    /* JADX WARN: Type inference failed for: r0v985, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$19] */
    /* JADX WARN: Type inference failed for: r0v988, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$33] */
    /* JADX WARN: Type inference failed for: r0v991, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$36] */
    /* JADX WARN: Type inference failed for: r2v1000, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$35] */
    /* JADX WARN: Type inference failed for: r2v1005, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$34] */
    /* JADX WARN: Type inference failed for: r2v1093, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$5] */
    /* JADX WARN: Type inference failed for: r2v1098, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$4] */
    /* JADX WARN: Type inference failed for: r2v1103, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$3] */
    /* JADX WARN: Type inference failed for: r2v112, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$322] */
    /* JADX WARN: Type inference failed for: r2v117, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$321] */
    /* JADX WARN: Type inference failed for: r2v15, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$338] */
    /* JADX WARN: Type inference failed for: r2v355, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$241] */
    /* JADX WARN: Type inference failed for: r2v542, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$177] */
    /* JADX WARN: Type inference failed for: r2v621, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$149] */
    /* JADX WARN: Type inference failed for: r2v626, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$148] */
    /* JADX WARN: Type inference failed for: r2v672, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$131] */
    /* JADX WARN: Type inference failed for: r2v677, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$130] */
    /* JADX WARN: Type inference failed for: r2v682, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$129] */
    /* JADX WARN: Type inference failed for: r2v700, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$126] */
    /* JADX WARN: Type inference failed for: r2v735, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$112] */
    /* JADX WARN: Type inference failed for: r2v740, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$111] */
    /* JADX WARN: Type inference failed for: r2v758, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$108] */
    /* JADX WARN: Type inference failed for: r2v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$336] */
    /* JADX WARN: Type inference failed for: r2v797, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$93] */
    /* JADX WARN: Type inference failed for: r2v802, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$92] */
    /* JADX WARN: Type inference failed for: r2v820, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$89] */
    /* JADX WARN: Type inference failed for: r2v855, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$75] */
    /* JADX WARN: Type inference failed for: r2v860, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$74] */
    /* JADX WARN: Type inference failed for: r2v878, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$71] */
    /* JADX WARN: Type inference failed for: r2v913, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$57] */
    /* JADX WARN: Type inference failed for: r2v918, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$56] */
    /* JADX WARN: Type inference failed for: r2v936, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$53] */
    /* JADX WARN: Type inference failed for: r2v971, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$39] */
    /* JADX WARN: Type inference failed for: r2v976, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$38] */
    /* JADX WARN: Type inference failed for: r3v1008, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$136] */
    /* JADX WARN: Type inference failed for: r3v1013, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$137] */
    /* JADX WARN: Type inference failed for: r3v1021, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$139] */
    /* JADX WARN: Type inference failed for: r3v1029, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$141] */
    /* JADX WARN: Type inference failed for: r3v1037, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$143] */
    /* JADX WARN: Type inference failed for: r3v1045, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$145] */
    /* JADX WARN: Type inference failed for: r3v1052, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$146] */
    /* JADX WARN: Type inference failed for: r3v1056, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$144] */
    /* JADX WARN: Type inference failed for: r3v1060, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$142] */
    /* JADX WARN: Type inference failed for: r3v1064, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$140] */
    /* JADX WARN: Type inference failed for: r3v1068, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$138] */
    /* JADX WARN: Type inference failed for: r3v1101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$114] */
    /* JADX WARN: Type inference failed for: r3v1106, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$115] */
    /* JADX WARN: Type inference failed for: r3v1114, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$117] */
    /* JADX WARN: Type inference failed for: r3v1122, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$119] */
    /* JADX WARN: Type inference failed for: r3v1130, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$121] */
    /* JADX WARN: Type inference failed for: r3v1138, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$123] */
    /* JADX WARN: Type inference failed for: r3v1145, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$124] */
    /* JADX WARN: Type inference failed for: r3v1149, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$122] */
    /* JADX WARN: Type inference failed for: r3v1153, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$120] */
    /* JADX WARN: Type inference failed for: r3v1157, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$118] */
    /* JADX WARN: Type inference failed for: r3v1161, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$116] */
    /* JADX WARN: Type inference failed for: r3v1192, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$96] */
    /* JADX WARN: Type inference failed for: r3v1197, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$97] */
    /* JADX WARN: Type inference failed for: r3v1205, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$99] */
    /* JADX WARN: Type inference failed for: r3v121, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$308] */
    /* JADX WARN: Type inference failed for: r3v1213, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$101] */
    /* JADX WARN: Type inference failed for: r3v1221, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$103] */
    /* JADX WARN: Type inference failed for: r3v1229, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$105] */
    /* JADX WARN: Type inference failed for: r3v1236, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$106] */
    /* JADX WARN: Type inference failed for: r3v1240, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$104] */
    /* JADX WARN: Type inference failed for: r3v1244, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$102] */
    /* JADX WARN: Type inference failed for: r3v1248, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$100] */
    /* JADX WARN: Type inference failed for: r3v1252, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$98] */
    /* JADX WARN: Type inference failed for: r3v126, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$309] */
    /* JADX WARN: Type inference failed for: r3v1278, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$77] */
    /* JADX WARN: Type inference failed for: r3v1283, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$78] */
    /* JADX WARN: Type inference failed for: r3v1291, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$80] */
    /* JADX WARN: Type inference failed for: r3v1299, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$82] */
    /* JADX WARN: Type inference failed for: r3v1307, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$84] */
    /* JADX WARN: Type inference failed for: r3v1315, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$86] */
    /* JADX WARN: Type inference failed for: r3v1322, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$87] */
    /* JADX WARN: Type inference failed for: r3v1326, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$85] */
    /* JADX WARN: Type inference failed for: r3v1330, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$83] */
    /* JADX WARN: Type inference failed for: r3v1334, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$81] */
    /* JADX WARN: Type inference failed for: r3v1338, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$79] */
    /* JADX WARN: Type inference failed for: r3v134, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$311] */
    /* JADX WARN: Type inference failed for: r3v1364, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$59] */
    /* JADX WARN: Type inference failed for: r3v1369, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$60] */
    /* JADX WARN: Type inference failed for: r3v1377, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$62] */
    /* JADX WARN: Type inference failed for: r3v1385, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$64] */
    /* JADX WARN: Type inference failed for: r3v1393, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$66] */
    /* JADX WARN: Type inference failed for: r3v1401, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$68] */
    /* JADX WARN: Type inference failed for: r3v1408, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$69] */
    /* JADX WARN: Type inference failed for: r3v1412, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$67] */
    /* JADX WARN: Type inference failed for: r3v1416, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$65] */
    /* JADX WARN: Type inference failed for: r3v142, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$313] */
    /* JADX WARN: Type inference failed for: r3v1420, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$63] */
    /* JADX WARN: Type inference failed for: r3v1424, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$61] */
    /* JADX WARN: Type inference failed for: r3v1450, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$41] */
    /* JADX WARN: Type inference failed for: r3v1455, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$42] */
    /* JADX WARN: Type inference failed for: r3v1463, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$44] */
    /* JADX WARN: Type inference failed for: r3v1471, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$46] */
    /* JADX WARN: Type inference failed for: r3v1479, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$48] */
    /* JADX WARN: Type inference failed for: r3v1487, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$50] */
    /* JADX WARN: Type inference failed for: r3v1494, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$51] */
    /* JADX WARN: Type inference failed for: r3v1498, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$49] */
    /* JADX WARN: Type inference failed for: r3v150, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$315] */
    /* JADX WARN: Type inference failed for: r3v1502, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$47] */
    /* JADX WARN: Type inference failed for: r3v1506, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$45] */
    /* JADX WARN: Type inference failed for: r3v1510, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$43] */
    /* JADX WARN: Type inference failed for: r3v1548, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$22] */
    /* JADX WARN: Type inference failed for: r3v1553, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$23] */
    /* JADX WARN: Type inference failed for: r3v1561, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$25] */
    /* JADX WARN: Type inference failed for: r3v1569, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$27] */
    /* JADX WARN: Type inference failed for: r3v1577, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$29] */
    /* JADX WARN: Type inference failed for: r3v158, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$317] */
    /* JADX WARN: Type inference failed for: r3v1585, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$31] */
    /* JADX WARN: Type inference failed for: r3v1592, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$32] */
    /* JADX WARN: Type inference failed for: r3v1596, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$30] */
    /* JADX WARN: Type inference failed for: r3v1600, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$28] */
    /* JADX WARN: Type inference failed for: r3v1604, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$26] */
    /* JADX WARN: Type inference failed for: r3v1608, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$24] */
    /* JADX WARN: Type inference failed for: r3v1629, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$8] */
    /* JADX WARN: Type inference failed for: r3v1634, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$9] */
    /* JADX WARN: Type inference failed for: r3v1642, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$11] */
    /* JADX WARN: Type inference failed for: r3v165, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$318] */
    /* JADX WARN: Type inference failed for: r3v1650, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$13] */
    /* JADX WARN: Type inference failed for: r3v1658, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$15] */
    /* JADX WARN: Type inference failed for: r3v1666, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$17] */
    /* JADX WARN: Type inference failed for: r3v1673, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$18] */
    /* JADX WARN: Type inference failed for: r3v1677, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$16] */
    /* JADX WARN: Type inference failed for: r3v1681, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$14] */
    /* JADX WARN: Type inference failed for: r3v1685, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$12] */
    /* JADX WARN: Type inference failed for: r3v1689, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$10] */
    /* JADX WARN: Type inference failed for: r3v169, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$316] */
    /* JADX WARN: Type inference failed for: r3v173, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$314] */
    /* JADX WARN: Type inference failed for: r3v177, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$312] */
    /* JADX WARN: Type inference failed for: r3v181, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$310] */
    /* JADX WARN: Type inference failed for: r3v204, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$292] */
    /* JADX WARN: Type inference failed for: r3v209, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$293] */
    /* JADX WARN: Type inference failed for: r3v217, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$295] */
    /* JADX WARN: Type inference failed for: r3v225, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$297] */
    /* JADX WARN: Type inference failed for: r3v233, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$299] */
    /* JADX WARN: Type inference failed for: r3v241, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$301] */
    /* JADX WARN: Type inference failed for: r3v248, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$302] */
    /* JADX WARN: Type inference failed for: r3v252, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$300] */
    /* JADX WARN: Type inference failed for: r3v256, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$298] */
    /* JADX WARN: Type inference failed for: r3v260, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$296] */
    /* JADX WARN: Type inference failed for: r3v264, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$294] */
    /* JADX WARN: Type inference failed for: r3v289, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$276] */
    /* JADX WARN: Type inference failed for: r3v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$324] */
    /* JADX WARN: Type inference failed for: r3v294, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$277] */
    /* JADX WARN: Type inference failed for: r3v302, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$279] */
    /* JADX WARN: Type inference failed for: r3v310, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$281] */
    /* JADX WARN: Type inference failed for: r3v318, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$283] */
    /* JADX WARN: Type inference failed for: r3v326, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$285] */
    /* JADX WARN: Type inference failed for: r3v333, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$286] */
    /* JADX WARN: Type inference failed for: r3v337, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$284] */
    /* JADX WARN: Type inference failed for: r3v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$325] */
    /* JADX WARN: Type inference failed for: r3v341, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$282] */
    /* JADX WARN: Type inference failed for: r3v345, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$280] */
    /* JADX WARN: Type inference failed for: r3v349, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$278] */
    /* JADX WARN: Type inference failed for: r3v371, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$260] */
    /* JADX WARN: Type inference failed for: r3v376, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$261] */
    /* JADX WARN: Type inference failed for: r3v384, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$263] */
    /* JADX WARN: Type inference failed for: r3v392, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$265] */
    /* JADX WARN: Type inference failed for: r3v400, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$267] */
    /* JADX WARN: Type inference failed for: r3v408, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$269] */
    /* JADX WARN: Type inference failed for: r3v415, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$270] */
    /* JADX WARN: Type inference failed for: r3v419, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$268] */
    /* JADX WARN: Type inference failed for: r3v42, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$327] */
    /* JADX WARN: Type inference failed for: r3v423, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$266] */
    /* JADX WARN: Type inference failed for: r3v427, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$264] */
    /* JADX WARN: Type inference failed for: r3v431, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$262] */
    /* JADX WARN: Type inference failed for: r3v453, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$244] */
    /* JADX WARN: Type inference failed for: r3v458, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$245] */
    /* JADX WARN: Type inference failed for: r3v466, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$247] */
    /* JADX WARN: Type inference failed for: r3v474, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$249] */
    /* JADX WARN: Type inference failed for: r3v482, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$251] */
    /* JADX WARN: Type inference failed for: r3v490, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$253] */
    /* JADX WARN: Type inference failed for: r3v497, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$254] */
    /* JADX WARN: Type inference failed for: r3v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$329] */
    /* JADX WARN: Type inference failed for: r3v501, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$252] */
    /* JADX WARN: Type inference failed for: r3v505, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$250] */
    /* JADX WARN: Type inference failed for: r3v509, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$248] */
    /* JADX WARN: Type inference failed for: r3v513, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$246] */
    /* JADX WARN: Type inference failed for: r3v533, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$227] */
    /* JADX WARN: Type inference failed for: r3v542, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$228] */
    /* JADX WARN: Type inference failed for: r3v550, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$230] */
    /* JADX WARN: Type inference failed for: r3v558, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$232] */
    /* JADX WARN: Type inference failed for: r3v566, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$234] */
    /* JADX WARN: Type inference failed for: r3v574, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$236] */
    /* JADX WARN: Type inference failed for: r3v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$331] */
    /* JADX WARN: Type inference failed for: r3v581, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$237] */
    /* JADX WARN: Type inference failed for: r3v585, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$235] */
    /* JADX WARN: Type inference failed for: r3v589, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$233] */
    /* JADX WARN: Type inference failed for: r3v593, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$231] */
    /* JADX WARN: Type inference failed for: r3v597, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$229] */
    /* JADX WARN: Type inference failed for: r3v611, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$212] */
    /* JADX WARN: Type inference failed for: r3v620, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$213] */
    /* JADX WARN: Type inference failed for: r3v628, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$215] */
    /* JADX WARN: Type inference failed for: r3v636, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$217] */
    /* JADX WARN: Type inference failed for: r3v644, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$219] */
    /* JADX WARN: Type inference failed for: r3v652, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$221] */
    /* JADX WARN: Type inference failed for: r3v659, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$222] */
    /* JADX WARN: Type inference failed for: r3v66, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$333] */
    /* JADX WARN: Type inference failed for: r3v663, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$220] */
    /* JADX WARN: Type inference failed for: r3v667, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$218] */
    /* JADX WARN: Type inference failed for: r3v671, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$216] */
    /* JADX WARN: Type inference failed for: r3v675, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$214] */
    /* JADX WARN: Type inference failed for: r3v689, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$197] */
    /* JADX WARN: Type inference failed for: r3v698, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$198] */
    /* JADX WARN: Type inference failed for: r3v706, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$200] */
    /* JADX WARN: Type inference failed for: r3v714, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$202] */
    /* JADX WARN: Type inference failed for: r3v722, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$204] */
    /* JADX WARN: Type inference failed for: r3v73, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$334] */
    /* JADX WARN: Type inference failed for: r3v730, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$206] */
    /* JADX WARN: Type inference failed for: r3v737, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$207] */
    /* JADX WARN: Type inference failed for: r3v741, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$205] */
    /* JADX WARN: Type inference failed for: r3v745, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$203] */
    /* JADX WARN: Type inference failed for: r3v749, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$201] */
    /* JADX WARN: Type inference failed for: r3v753, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$199] */
    /* JADX WARN: Type inference failed for: r3v768, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$182] */
    /* JADX WARN: Type inference failed for: r3v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$332] */
    /* JADX WARN: Type inference failed for: r3v777, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$183] */
    /* JADX WARN: Type inference failed for: r3v785, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$185] */
    /* JADX WARN: Type inference failed for: r3v793, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$187] */
    /* JADX WARN: Type inference failed for: r3v801, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$189] */
    /* JADX WARN: Type inference failed for: r3v809, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$191] */
    /* JADX WARN: Type inference failed for: r3v81, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$330] */
    /* JADX WARN: Type inference failed for: r3v816, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$192] */
    /* JADX WARN: Type inference failed for: r3v820, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$190] */
    /* JADX WARN: Type inference failed for: r3v824, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$188] */
    /* JADX WARN: Type inference failed for: r3v828, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$186] */
    /* JADX WARN: Type inference failed for: r3v832, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$184] */
    /* JADX WARN: Type inference failed for: r3v848, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$166] */
    /* JADX WARN: Type inference failed for: r3v85, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$328] */
    /* JADX WARN: Type inference failed for: r3v857, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$167] */
    /* JADX WARN: Type inference failed for: r3v865, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$169] */
    /* JADX WARN: Type inference failed for: r3v873, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$171] */
    /* JADX WARN: Type inference failed for: r3v881, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$173] */
    /* JADX WARN: Type inference failed for: r3v889, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$175] */
    /* JADX WARN: Type inference failed for: r3v89, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$326] */
    /* JADX WARN: Type inference failed for: r3v896, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$176] */
    /* JADX WARN: Type inference failed for: r3v900, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$174] */
    /* JADX WARN: Type inference failed for: r3v904, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$172] */
    /* JADX WARN: Type inference failed for: r3v908, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$170] */
    /* JADX WARN: Type inference failed for: r3v912, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$168] */
    /* JADX WARN: Type inference failed for: r3v922, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$151] */
    /* JADX WARN: Type inference failed for: r3v927, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$152] */
    /* JADX WARN: Type inference failed for: r3v935, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$154] */
    /* JADX WARN: Type inference failed for: r3v943, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$156] */
    /* JADX WARN: Type inference failed for: r3v951, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$158] */
    /* JADX WARN: Type inference failed for: r3v959, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$160] */
    /* JADX WARN: Type inference failed for: r3v966, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$161] */
    /* JADX WARN: Type inference failed for: r3v970, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$159] */
    /* JADX WARN: Type inference failed for: r3v974, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$157] */
    /* JADX WARN: Type inference failed for: r3v978, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$155] */
    /* JADX WARN: Type inference failed for: r3v982, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$153] */
    /* JADX WARN: Type inference failed for: r4v105, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$305] */
    /* JADX WARN: Type inference failed for: r4v110, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$291] */
    /* JADX WARN: Type inference failed for: r4v143, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$289] */
    /* JADX WARN: Type inference failed for: r4v150, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$275] */
    /* JADX WARN: Type inference failed for: r4v181, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$273] */
    /* JADX WARN: Type inference failed for: r4v187, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$259] */
    /* JADX WARN: Type inference failed for: r4v220, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$257] */
    /* JADX WARN: Type inference failed for: r4v224, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$243] */
    /* JADX WARN: Type inference failed for: r4v296, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$225] */
    /* JADX WARN: Type inference failed for: r4v331, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$210] */
    /* JADX WARN: Type inference failed for: r4v366, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$195] */
    /* JADX WARN: Type inference failed for: r4v402, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$180] */
    /* JADX WARN: Type inference failed for: r4v483, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$135] */
    /* JADX WARN: Type inference failed for: r4v587, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$95] */
    /* JADX WARN: Type inference failed for: r4v72, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$307] */
    /* JADX WARN: Type inference failed for: r4v785, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing$21] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "阵法开关")) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureZhenFaRenNum.executeProcedure($_dependencies);
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 1.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("阵法间隔", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.4
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔") + 1.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.5
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.6
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔2") <= 5.0d && !world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.7
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfatp " + x + " " + y + " " + z + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.8
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.9
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.10
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.11
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.12
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.13
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.14
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.15
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.16
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.17
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.18
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.19
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("阵法间隔", 0.0d);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.20
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfashanghai a2 " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.21
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "ThunderAttack")) + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.22
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.23
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.24
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.25
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.26
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.27
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.28
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.29
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.30
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.31
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.32
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    Map<String, Object> $_dependencies2 = new HashMap<>();
                    $_dependencies2.put("x", Integer.valueOf(x));
                    $_dependencies2.put("y", Integer.valueOf(y));
                    $_dependencies2.put("z", Integer.valueOf(z));
                    $_dependencies2.put("world", world);
                    ProcedureLuoLeiZhen01.executeProcedure($_dependencies2);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.33
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.34
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp7 = new BlockPos(x, y, z);
                        TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                        IBlockState _bs7 = world.func_180495_p(_bp7);
                        if (_tileEntity7 != null) {
                            _tileEntity7.getTileData().func_74780_a("阵法间隔2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.35
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法间隔2") + 1.0d);
                        }
                        world.func_184138_a(_bp7, _bs7, _bs7, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.36
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies3 = new HashMap<>();
                    $_dependencies3.put("x", Integer.valueOf(x));
                    $_dependencies3.put("y", Integer.valueOf(y));
                    $_dependencies3.put("z", Integer.valueOf(z));
                    $_dependencies3.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies3);
                    return;
                }
                return;
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.37
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 2.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.38
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.39
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.40
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=9] ~ ~ ~ liekongzhen 1 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.41
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.42
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.43
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.44
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.45
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.46
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.47
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.48
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.49
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.50
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.51
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.52
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp10 = new BlockPos(x, y, z);
                        TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                        IBlockState _bs10 = world.func_180495_p(_bp10);
                        if (_tileEntity10 != null) {
                            _tileEntity10.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp10, _bs10, _bs10, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp11 = new BlockPos(x, y, z);
                        TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                        IBlockState _bs11 = world.func_180495_p(_bp11);
                        if (_tileEntity11 != null) {
                            _tileEntity11.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.53
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp11, _bs11, _bs11, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.54
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies4 = new HashMap<>();
                    $_dependencies4.put("x", Integer.valueOf(x));
                    $_dependencies4.put("y", Integer.valueOf(y));
                    $_dependencies4.put("z", Integer.valueOf(z));
                    $_dependencies4.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies4);
                    return;
                }
                return;
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.55
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 3.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.56
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.57
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.58
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=9] ~ ~ ~ chenhuizhen 1 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.59
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.60
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.61
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.62
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.63
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.64
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.65
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.66
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.67
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.68
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.69
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.70
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp14 = new BlockPos(x, y, z);
                        TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                        IBlockState _bs14 = world.func_180495_p(_bp14);
                        if (_tileEntity14 != null) {
                            _tileEntity14.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp14, _bs14, _bs14, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp15 = new BlockPos(x, y, z);
                        TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                        IBlockState _bs15 = world.func_180495_p(_bp15);
                        if (_tileEntity15 != null) {
                            _tileEntity15.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.71
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp15, _bs15, _bs15, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.72
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies5 = new HashMap<>();
                    $_dependencies5.put("x", Integer.valueOf(x));
                    $_dependencies5.put("y", Integer.valueOf(y));
                    $_dependencies5.put("z", Integer.valueOf(z));
                    $_dependencies5.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies5);
                    return;
                }
                return;
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.73
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 4.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.74
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.75
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.76
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=9] ~ ~ ~ huilingzhen 1 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.77
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.78
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.79
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.80
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.81
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.82
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.83
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.84
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.85
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.86
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.87
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.88
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp18 = new BlockPos(x, y, z);
                        TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                        IBlockState _bs18 = world.func_180495_p(_bp18);
                        if (_tileEntity18 != null) {
                            _tileEntity18.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp18, _bs18, _bs18, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp19 = new BlockPos(x, y, z);
                        TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                        IBlockState _bs19 = world.func_180495_p(_bp19);
                        if (_tileEntity19 != null) {
                            _tileEntity19.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.89
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp19, _bs19, _bs19, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.90
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies6 = new HashMap<>();
                    $_dependencies6.put("x", Integer.valueOf(x));
                    $_dependencies6.put("y", Integer.valueOf(y));
                    $_dependencies6.put("z", Integer.valueOf(z));
                    $_dependencies6.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies6);
                    return;
                }
                return;
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.91
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 5.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.92
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                    IBlockState _bs21 = world.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.93
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.94
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=9] ~ ~ ~ mizongzhen " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.95
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "PoisonAttack")) + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.96
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.97
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.98
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.99
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.100
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.101
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.102
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.103
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.104
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.105
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.106
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.107
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp22 = new BlockPos(x, y, z);
                        TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                        IBlockState _bs22 = world.func_180495_p(_bp22);
                        if (_tileEntity22 != null) {
                            _tileEntity22.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp22, _bs22, _bs22, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp23 = new BlockPos(x, y, z);
                        TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                        IBlockState _bs23 = world.func_180495_p(_bp23);
                        if (_tileEntity23 != null) {
                            _tileEntity23.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.108
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp23, _bs23, _bs23, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.109
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies7 = new HashMap<>();
                    $_dependencies7.put("x", Integer.valueOf(x));
                    $_dependencies7.put("y", Integer.valueOf(y));
                    $_dependencies7.put("z", Integer.valueOf(z));
                    $_dependencies7.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies7);
                    return;
                }
                return;
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.110
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 6.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.111
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp25 = new BlockPos(x, y, z);
                    TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                    IBlockState _bs25 = world.func_180495_p(_bp25);
                    if (_tileEntity25 != null) {
                        _tileEntity25.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.112
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp25, _bs25, _bs25, 3);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.113
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=9] ~ ~ ~ tianhuzhen 1 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.114
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.115
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.116
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.117
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.118
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.119
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.120
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.121
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.122
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.123
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.124
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.125
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp26 = new BlockPos(x, y, z);
                        TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                        IBlockState _bs26 = world.func_180495_p(_bp26);
                        if (_tileEntity26 != null) {
                            _tileEntity26.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp26, _bs26, _bs26, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp27 = new BlockPos(x, y, z);
                        TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                        IBlockState _bs27 = world.func_180495_p(_bp27);
                        if (_tileEntity27 != null) {
                            _tileEntity27.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.126
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp27, _bs27, _bs27, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.127
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies8 = new HashMap<>();
                    $_dependencies8.put("x", Integer.valueOf(x));
                    $_dependencies8.put("y", Integer.valueOf(y));
                    $_dependencies8.put("z", Integer.valueOf(z));
                    $_dependencies8.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies8);
                    return;
                }
                return;
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.128
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 7.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                    IBlockState _bs28 = world.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.129
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp28, _bs28, _bs28, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp29 = new BlockPos(x, y, z);
                    TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                    IBlockState _bs29 = world.func_180495_p(_bp29);
                    if (_tileEntity29 != null) {
                        _tileEntity29.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.130
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp29, _bs29, _bs29, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp30 = new BlockPos(x, y, z);
                    TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                    IBlockState _bs30 = world.func_180495_p(_bp30);
                    if (_tileEntity30 != null) {
                        _tileEntity30.getTileData().func_74780_a("阵法间隔2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.131
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔2") + 1.0d);
                    }
                    world.func_184138_a(_bp30, _bs30, _bs30, 3);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.132
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔2") >= 2.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp31 = new BlockPos(x, y, z);
                        TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                        IBlockState _bs31 = world.func_180495_p(_bp31);
                        if (_tileEntity31 != null) {
                            _tileEntity31.getTileData().func_74780_a("阵法间隔2", 0.0d);
                        }
                        world.func_184138_a(_bp31, _bs31, _bs31, 3);
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.133
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间2") < 5.0d && !world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.134
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
                        }, ((Object) null) + "" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.135
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "Attack")) + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.136
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.137
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.138
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.139
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.140
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.141
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.142
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.143
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.144
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.145
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.146
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.147
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp32 = new BlockPos(x, y, z);
                        TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                        IBlockState _bs32 = world.func_180495_p(_bp32);
                        if (_tileEntity32 != null) {
                            _tileEntity32.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp32, _bs32, _bs32, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp33 = new BlockPos(x, y, z);
                        TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                        IBlockState _bs33 = world.func_180495_p(_bp33);
                        if (_tileEntity33 != null) {
                            _tileEntity33.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.148
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp33, _bs33, _bs33, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp34 = new BlockPos(x, y, z);
                        TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                        IBlockState _bs34 = world.func_180495_p(_bp34);
                        if (_tileEntity34 != null) {
                            _tileEntity34.getTileData().func_74780_a("阵法时间2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.149
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间2") + 1.0d);
                        }
                        world.func_184138_a(_bp34, _bs34, _bs34, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.150
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfashanghai a1 0 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.151
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.152
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.153
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.154
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.155
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.156
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.157
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.158
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.159
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.160
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.161
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.162
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies9 = new HashMap<>();
                    $_dependencies9.put("x", Integer.valueOf(x));
                    $_dependencies9.put("y", Integer.valueOf(y));
                    $_dependencies9.put("z", Integer.valueOf(z));
                    $_dependencies9.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies9);
                    return;
                }
                return;
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.163
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 8.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.164
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "修炼阵Time") > 0.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.165
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ xiulianzhen true " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.166
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " null " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.167
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.168
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.169
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.170
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.171
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.172
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.173
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.174
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.175
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.176
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp35 = new BlockPos(x, y, z);
                        TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                        IBlockState _bs35 = world.func_180495_p(_bp35);
                        if (_tileEntity35 != null) {
                            _tileEntity35.getTileData().func_74780_a("修炼阵Time", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.177
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "修炼阵Time") - 1.0d);
                        }
                        world.func_184138_a(_bp35, _bs35, _bs35, 3);
                        return;
                    }
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.178
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.179
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_190916_E() >= 3) {
                    if (!world.field_72995_K) {
                        BlockPos _bp36 = new BlockPos(x, y, z);
                        TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                        IBlockState _bs36 = world.func_180495_p(_bp36);
                        if (_tileEntity36 != null) {
                            _tileEntity36.getTileData().func_74780_a("修炼阵Time", 240.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.180
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp36, _bs36, _bs36, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.181
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ xiulianzhen true " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.182
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " one " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.183
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.184
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.185
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.186
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.187
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.188
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.189
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.190
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.191
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.192
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp37 = new BlockPos(x, y, z);
                        TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                        IBlockState _bs37 = world.func_180495_p(_bp37);
                        if (_tileEntity37 != null) {
                            _tileEntity37.getTileData().func_74780_a("LingShi", 1.0d);
                        }
                        world.func_184138_a(_bp37, _bs37, _bs37, 3);
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.193
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(3);
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.194
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_1")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp38 = new BlockPos(x, y, z);
                        TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                        IBlockState _bs38 = world.func_180495_p(_bp38);
                        if (_tileEntity38 != null) {
                            _tileEntity38.getTileData().func_74780_a("修炼阵Time", 2160.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.195
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp38, _bs38, _bs38, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.196
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ xiulianzhen true " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.197
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " one " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.198
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.199
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.200
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.201
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.202
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.203
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.204
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.205
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.206
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.207
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp39 = new BlockPos(x, y, z);
                        TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                        IBlockState _bs39 = world.func_180495_p(_bp39);
                        if (_tileEntity39 != null) {
                            _tileEntity39.getTileData().func_74780_a("LingShi", 1.0d);
                        }
                        world.func_184138_a(_bp39, _bs39, _bs39, 3);
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.208
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(1);
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.209
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp40 = new BlockPos(x, y, z);
                        TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                        IBlockState _bs40 = world.func_180495_p(_bp40);
                        if (_tileEntity40 != null) {
                            _tileEntity40.getTileData().func_74780_a("修炼阵Time", 240.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.210
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp40, _bs40, _bs40, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.211
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ xiulianzhen true " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.212
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " two " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.213
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.214
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.215
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.216
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.217
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.218
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.219
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.220
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.221
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.222
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp41 = new BlockPos(x, y, z);
                        TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                        IBlockState _bs41 = world.func_180495_p(_bp41);
                        if (_tileEntity41 != null) {
                            _tileEntity41.getTileData().func_74780_a("LingShi", 2.0d);
                        }
                        world.func_184138_a(_bp41, _bs41, _bs41, 3);
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.223
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(1);
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.224
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_2")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp42 = new BlockPos(x, y, z);
                        TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                        IBlockState _bs42 = world.func_180495_p(_bp42);
                        if (_tileEntity42 != null) {
                            _tileEntity42.getTileData().func_74780_a("修炼阵Time", 2160.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.225
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp42, _bs42, _bs42, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.226
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ xiulianzhen true " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.227
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " two " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.228
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.229
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.230
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.231
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.232
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.233
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.234
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.235
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.236
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.237
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp43 = new BlockPos(x, y, z);
                        TileEntity _tileEntity43 = world.func_175625_s(_bp43);
                        IBlockState _bs43 = world.func_180495_p(_bp43);
                        if (_tileEntity43 != null) {
                            _tileEntity43.getTileData().func_74780_a("LingShi", 2.0d);
                        }
                        world.func_184138_a(_bp43, _bs43, _bs43, 3);
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.238
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(1);
                    return;
                } else {
                    return;
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.239
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 9.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.240
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "修炼阵Time") > 0.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp44 = new BlockPos(x, y, z);
                        TileEntity _tileEntity44 = world.func_175625_s(_bp44);
                        IBlockState _bs44 = world.func_180495_p(_bp44);
                        if (_tileEntity44 != null) {
                            _tileEntity44.getTileData().func_74780_a("修炼阵Time", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.241
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "修炼阵Time") - 1.0d);
                        }
                        world.func_184138_a(_bp44, _bs44, _bs44, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.242
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ daxiulianzhen true " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.243
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "LingShi")) + " three " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.244
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.245
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.246
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.247
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.248
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.249
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.250
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.251
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.252
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.253
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.254
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                        return;
                    }
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.255
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.256
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_190916_E() >= 2) {
                    if (!world.field_72995_K) {
                        BlockPos _bp45 = new BlockPos(x, y, z);
                        TileEntity _tileEntity45 = world.func_175625_s(_bp45);
                        IBlockState _bs45 = world.func_180495_p(_bp45);
                        if (_tileEntity45 != null) {
                            _tileEntity45.getTileData().func_74780_a("修炼阵Time", 240.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.257
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp45, _bs45, _bs45, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp46 = new BlockPos(x, y, z);
                        TileEntity _tileEntity46 = world.func_175625_s(_bp46);
                        IBlockState _bs46 = world.func_180495_p(_bp46);
                        if (_tileEntity46 != null) {
                            _tileEntity46.getTileData().func_74780_a("LingShi", 1.0d);
                        }
                        world.func_184138_a(_bp46, _bs46, _bs46, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.258
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ daxiulianzhen true " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.259
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "LingShi")) + " one " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.260
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.261
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.262
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.263
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.264
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.265
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.266
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.267
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.268
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.269
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.270
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.271
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(2);
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.272
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_1")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp47 = new BlockPos(x, y, z);
                        TileEntity _tileEntity47 = world.func_175625_s(_bp47);
                        IBlockState _bs47 = world.func_180495_p(_bp47);
                        if (_tileEntity47 != null) {
                            _tileEntity47.getTileData().func_74780_a("修炼阵Time", 2160.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.273
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp47, _bs47, _bs47, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.274
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ daxiulianzhen true " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.275
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "LingShi")) + " one " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.276
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.277
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.278
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.279
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.280
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.281
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.282
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.283
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.284
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.285
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.286
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp48 = new BlockPos(x, y, z);
                        TileEntity _tileEntity48 = world.func_175625_s(_bp48);
                        IBlockState _bs48 = world.func_180495_p(_bp48);
                        if (_tileEntity48 != null) {
                            _tileEntity48.getTileData().func_74780_a("LingShi", 1.0d);
                        }
                        world.func_184138_a(_bp48, _bs48, _bs48, 3);
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.287
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(1);
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.288
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp49 = new BlockPos(x, y, z);
                        TileEntity _tileEntity49 = world.func_175625_s(_bp49);
                        IBlockState _bs49 = world.func_180495_p(_bp49);
                        if (_tileEntity49 != null) {
                            _tileEntity49.getTileData().func_74780_a("修炼阵Time", 240.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.289
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp49, _bs49, _bs49, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp50 = new BlockPos(x, y, z);
                        TileEntity _tileEntity50 = world.func_175625_s(_bp50);
                        IBlockState _bs50 = world.func_180495_p(_bp50);
                        if (_tileEntity50 != null) {
                            _tileEntity50.getTileData().func_74780_a("LingShi", 2.0d);
                        }
                        world.func_184138_a(_bp50, _bs50, _bs50, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.290
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ daxiulianzhen true " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.291
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "LingShi")) + " two " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.292
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.293
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.294
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.295
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.296
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.297
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.298
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.299
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.300
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.301
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.302
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.303
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(1);
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.304
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_2")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp51 = new BlockPos(x, y, z);
                        TileEntity _tileEntity51 = world.func_175625_s(_bp51);
                        IBlockState _bs51 = world.func_180495_p(_bp51);
                        if (_tileEntity51 != null) {
                            _tileEntity51.getTileData().func_74780_a("修炼阵Time", 2160.0d - (20.0d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.305
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法人数")));
                        }
                        world.func_184138_a(_bp51, _bs51, _bs51, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp52 = new BlockPos(x, y, z);
                        TileEntity _tileEntity52 = world.func_175625_s(_bp52);
                        IBlockState _bs52 = world.func_180495_p(_bp52);
                        if (_tileEntity52 != null) {
                            _tileEntity52.getTileData().func_74780_a("LingShi", 2.0d);
                        }
                        world.func_184138_a(_bp52, _bs52, _bs52, 3);
                    }
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.306
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
                        }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ daxiulianzhen true " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.307
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "LingShi")) + " two " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.308
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.309
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.310
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.311
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.312
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.313
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.314
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.315
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.316
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.317
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.318
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                    }
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.319
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_190918_g(1);
                    return;
                } else {
                    return;
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.320
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 10.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp53 = new BlockPos(x, y, z);
                    TileEntity _tileEntity53 = world.func_175625_s(_bp53);
                    IBlockState _bs53 = world.func_180495_p(_bp53);
                    if (_tileEntity53 != null) {
                        _tileEntity53.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.321
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                    }
                    world.func_184138_a(_bp53, _bs53, _bs53, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp54 = new BlockPos(x, y, z);
                    TileEntity _tileEntity54 = world.func_175625_s(_bp54);
                    IBlockState _bs54 = world.func_180495_p(_bp54);
                    if (_tileEntity54 != null) {
                        _tileEntity54.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.322
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                    }
                    world.func_184138_a(_bp54, _bs54, _bs54, 3);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.323
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=50] ~ ~ ~ shoujiazhen " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.324
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.325
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.326
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.327
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.328
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.329
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.330
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.331
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.332
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.333
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.334
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.335
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp55 = new BlockPos(x, y, z);
                        TileEntity _tileEntity55 = world.func_175625_s(_bp55);
                        IBlockState _bs55 = world.func_180495_p(_bp55);
                        if (_tileEntity55 != null) {
                            _tileEntity55.getTileData().func_74780_a("阵法间隔1", 0.0d);
                        }
                        world.func_184138_a(_bp55, _bs55, _bs55, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp56 = new BlockPos(x, y, z);
                        TileEntity _tileEntity56 = world.func_175625_s(_bp56);
                        IBlockState _bs56 = world.func_180495_p(_bp56);
                        if (_tileEntity56 != null) {
                            _tileEntity56.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.336
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                        }
                        world.func_184138_a(_bp56, _bs56, _bs56, 3);
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.337
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                    Map<String, Object> $_dependencies10 = new HashMap<>();
                    $_dependencies10.put("x", Integer.valueOf(x));
                    $_dependencies10.put("y", Integer.valueOf(y));
                    $_dependencies10.put("z", Integer.valueOf(z));
                    $_dependencies10.put("world", world);
                    ProcedureZhenFaYanXu.executeProcedure($_dependencies10);
                    return;
                }
                return;
            } else {
                Map<String, Object> $_dependencies11 = new HashMap<>();
                $_dependencies11.put("x", Integer.valueOf(x));
                $_dependencies11.put("y", Integer.valueOf(y));
                $_dependencies11.put("z", Integer.valueOf(z));
                $_dependencies11.put("world", world);
                ProcedureZhenFaZhiXing2.executeProcedure($_dependencies11);
                return;
            }
        }
        if (!world.field_72995_K) {
            BlockPos _bp57 = new BlockPos(x, y, z);
            TileEntity _tileEntity57 = world.func_175625_s(_bp57);
            IBlockState _bs57 = world.func_180495_p(_bp57);
            if (_tileEntity57 != null) {
                _tileEntity57.getTileData().func_74780_a("阵法闲置", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.338
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法闲置") + 1.0d);
            }
            world.func_184138_a(_bp57, _bs57, _bs57, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing.339
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法闲置") >= 6000.0d) {
            Map<String, Object> $_dependencies12 = new HashMap<>();
            $_dependencies12.put("x", Integer.valueOf(x));
            $_dependencies12.put("y", Integer.valueOf(y));
            $_dependencies12.put("z", Integer.valueOf(z));
            $_dependencies12.put("world", world);
            ProcedureZhenFaYiChu.executeProcedure($_dependencies12);
        }
    }
}
