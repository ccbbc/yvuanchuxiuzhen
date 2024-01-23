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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaZhiXing1.class */
public class ProcedureZhenFaZhiXing1 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaZhiXing1(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 547);
    }

    /* JADX WARN: Type inference failed for: r0v201, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$77] */
    /* JADX WARN: Type inference failed for: r0v204, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$90] */
    /* JADX WARN: Type inference failed for: r0v207, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$104] */
    /* JADX WARN: Type inference failed for: r0v210, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$107] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$19] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$37] */
    /* JADX WARN: Type inference failed for: r0v316, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$70] */
    /* JADX WARN: Type inference failed for: r0v319, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$72] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$55] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$73] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$108] */
    /* JADX WARN: Type inference failed for: r0v384, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$52] */
    /* JADX WARN: Type inference failed for: r0v387, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$54] */
    /* JADX WARN: Type inference failed for: r0v452, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$34] */
    /* JADX WARN: Type inference failed for: r0v455, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$36] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$112] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$125] */
    /* JADX WARN: Type inference failed for: r0v520, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$16] */
    /* JADX WARN: Type inference failed for: r0v523, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$18] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$142] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$145] */
    /* JADX WARN: Type inference failed for: r2v139, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$111] */
    /* JADX WARN: Type inference failed for: r2v144, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$110] */
    /* JADX WARN: Type inference failed for: r2v149, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$109] */
    /* JADX WARN: Type inference failed for: r2v173, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$106] */
    /* JADX WARN: Type inference failed for: r2v178, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$105] */
    /* JADX WARN: Type inference failed for: r2v259, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$76] */
    /* JADX WARN: Type inference failed for: r2v264, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$75] */
    /* JADX WARN: Type inference failed for: r2v269, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$74] */
    /* JADX WARN: Type inference failed for: r2v287, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$71] */
    /* JADX WARN: Type inference failed for: r2v322, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$57] */
    /* JADX WARN: Type inference failed for: r2v327, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$56] */
    /* JADX WARN: Type inference failed for: r2v345, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$53] */
    /* JADX WARN: Type inference failed for: r2v380, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$39] */
    /* JADX WARN: Type inference failed for: r2v385, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$38] */
    /* JADX WARN: Type inference failed for: r2v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$144] */
    /* JADX WARN: Type inference failed for: r2v403, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$35] */
    /* JADX WARN: Type inference failed for: r2v438, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$21] */
    /* JADX WARN: Type inference failed for: r2v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$143] */
    /* JADX WARN: Type inference failed for: r2v443, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$20] */
    /* JADX WARN: Type inference failed for: r2v461, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$17] */
    /* JADX WARN: Type inference failed for: r2v496, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$3] */
    /* JADX WARN: Type inference failed for: r2v501, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$2] */
    /* JADX WARN: Type inference failed for: r2v55, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$139] */
    /* JADX WARN: Type inference failed for: r3v101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$132] */
    /* JADX WARN: Type inference failed for: r3v105, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$130] */
    /* JADX WARN: Type inference failed for: r3v126, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$114] */
    /* JADX WARN: Type inference failed for: r3v131, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$115] */
    /* JADX WARN: Type inference failed for: r3v139, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$117] */
    /* JADX WARN: Type inference failed for: r3v147, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$119] */
    /* JADX WARN: Type inference failed for: r3v155, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$121] */
    /* JADX WARN: Type inference failed for: r3v163, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$123] */
    /* JADX WARN: Type inference failed for: r3v170, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$124] */
    /* JADX WARN: Type inference failed for: r3v174, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$122] */
    /* JADX WARN: Type inference failed for: r3v178, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$120] */
    /* JADX WARN: Type inference failed for: r3v182, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$118] */
    /* JADX WARN: Type inference failed for: r3v186, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$116] */
    /* JADX WARN: Type inference failed for: r3v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$140] */
    /* JADX WARN: Type inference failed for: r3v229, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$93] */
    /* JADX WARN: Type inference failed for: r3v234, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$94] */
    /* JADX WARN: Type inference failed for: r3v242, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$96] */
    /* JADX WARN: Type inference failed for: r3v250, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$98] */
    /* JADX WARN: Type inference failed for: r3v258, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$100] */
    /* JADX WARN: Type inference failed for: r3v266, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$102] */
    /* JADX WARN: Type inference failed for: r3v273, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$103] */
    /* JADX WARN: Type inference failed for: r3v277, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$101] */
    /* JADX WARN: Type inference failed for: r3v281, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$99] */
    /* JADX WARN: Type inference failed for: r3v285, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$97] */
    /* JADX WARN: Type inference failed for: r3v289, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$95] */
    /* JADX WARN: Type inference failed for: r3v310, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$79] */
    /* JADX WARN: Type inference failed for: r3v315, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$80] */
    /* JADX WARN: Type inference failed for: r3v323, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$82] */
    /* JADX WARN: Type inference failed for: r3v331, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$84] */
    /* JADX WARN: Type inference failed for: r3v339, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$86] */
    /* JADX WARN: Type inference failed for: r3v347, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$88] */
    /* JADX WARN: Type inference failed for: r3v354, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$89] */
    /* JADX WARN: Type inference failed for: r3v358, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$87] */
    /* JADX WARN: Type inference failed for: r3v362, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$85] */
    /* JADX WARN: Type inference failed for: r3v366, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$83] */
    /* JADX WARN: Type inference failed for: r3v370, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$81] */
    /* JADX WARN: Type inference failed for: r3v401, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$59] */
    /* JADX WARN: Type inference failed for: r3v406, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$60] */
    /* JADX WARN: Type inference failed for: r3v414, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$62] */
    /* JADX WARN: Type inference failed for: r3v422, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$64] */
    /* JADX WARN: Type inference failed for: r3v430, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$66] */
    /* JADX WARN: Type inference failed for: r3v438, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$68] */
    /* JADX WARN: Type inference failed for: r3v445, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$69] */
    /* JADX WARN: Type inference failed for: r3v449, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$67] */
    /* JADX WARN: Type inference failed for: r3v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$128] */
    /* JADX WARN: Type inference failed for: r3v453, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$65] */
    /* JADX WARN: Type inference failed for: r3v457, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$63] */
    /* JADX WARN: Type inference failed for: r3v461, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$61] */
    /* JADX WARN: Type inference failed for: r3v487, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$41] */
    /* JADX WARN: Type inference failed for: r3v492, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$42] */
    /* JADX WARN: Type inference failed for: r3v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$129] */
    /* JADX WARN: Type inference failed for: r3v500, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$44] */
    /* JADX WARN: Type inference failed for: r3v508, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$46] */
    /* JADX WARN: Type inference failed for: r3v516, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$48] */
    /* JADX WARN: Type inference failed for: r3v524, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$50] */
    /* JADX WARN: Type inference failed for: r3v531, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$51] */
    /* JADX WARN: Type inference failed for: r3v535, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$49] */
    /* JADX WARN: Type inference failed for: r3v539, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$47] */
    /* JADX WARN: Type inference failed for: r3v543, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$45] */
    /* JADX WARN: Type inference failed for: r3v547, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$43] */
    /* JADX WARN: Type inference failed for: r3v573, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$23] */
    /* JADX WARN: Type inference failed for: r3v578, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$24] */
    /* JADX WARN: Type inference failed for: r3v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$131] */
    /* JADX WARN: Type inference failed for: r3v586, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$26] */
    /* JADX WARN: Type inference failed for: r3v594, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$28] */
    /* JADX WARN: Type inference failed for: r3v602, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$30] */
    /* JADX WARN: Type inference failed for: r3v610, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$32] */
    /* JADX WARN: Type inference failed for: r3v617, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$33] */
    /* JADX WARN: Type inference failed for: r3v621, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$31] */
    /* JADX WARN: Type inference failed for: r3v625, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$29] */
    /* JADX WARN: Type inference failed for: r3v629, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$27] */
    /* JADX WARN: Type inference failed for: r3v633, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$25] */
    /* JADX WARN: Type inference failed for: r3v659, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$5] */
    /* JADX WARN: Type inference failed for: r3v66, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$133] */
    /* JADX WARN: Type inference failed for: r3v664, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$6] */
    /* JADX WARN: Type inference failed for: r3v672, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$8] */
    /* JADX WARN: Type inference failed for: r3v680, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$10] */
    /* JADX WARN: Type inference failed for: r3v688, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$12] */
    /* JADX WARN: Type inference failed for: r3v696, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$14] */
    /* JADX WARN: Type inference failed for: r3v703, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$15] */
    /* JADX WARN: Type inference failed for: r3v707, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$13] */
    /* JADX WARN: Type inference failed for: r3v711, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$11] */
    /* JADX WARN: Type inference failed for: r3v715, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$9] */
    /* JADX WARN: Type inference failed for: r3v719, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$7] */
    /* JADX WARN: Type inference failed for: r3v74, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$135] */
    /* JADX WARN: Type inference failed for: r3v82, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$137] */
    /* JADX WARN: Type inference failed for: r3v89, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$138] */
    /* JADX WARN: Type inference failed for: r3v93, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$136] */
    /* JADX WARN: Type inference failed for: r3v97, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$134] */
    /* JADX WARN: Type inference failed for: r4v131, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$92] */
    /* JADX WARN: Type inference failed for: r4v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$127] */
    /* JADX WARN: Type inference failed for: r5v15, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1$141] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 11.0d) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                IBlockState _bs = worldServer.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.2
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                }
                worldServer.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                }
                worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.4
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ tianhuzhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.5
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.7
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.8
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.9
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.10
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.11
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.12
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.13
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.14
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.15
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                    IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                    IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.17
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", worldServer);
                ProcedureZhenFaYanXu.executeProcedure($_dependencies);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.19
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 12.0d) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.20
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                }
                worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = worldServer.func_175625_s(_bp6);
                IBlockState _bs6 = worldServer.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.21
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                }
                worldServer.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.22
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ liekongzhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.23
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.24
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.25
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.26
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.27
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.28
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.29
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.30
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.31
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.32
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.33
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.34
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = worldServer.func_175625_s(_bp7);
                    IBlockState _bs7 = worldServer.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = worldServer.func_175625_s(_bp8);
                    IBlockState _bs8 = worldServer.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.35
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法时间") <= 1.0d) {
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", worldServer);
                ProcedureZhenFaYanXu.executeProcedure($_dependencies2);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.37
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 13.0d) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = worldServer.func_175625_s(_bp9);
                IBlockState _bs9 = worldServer.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.38
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                }
                worldServer.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = worldServer.func_175625_s(_bp10);
                IBlockState _bs10 = worldServer.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.39
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                }
                worldServer.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.40
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ chenhuizhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.41
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.42
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.43
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.44
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.45
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.46
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.47
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.48
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.49
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.50
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.51
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.52
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = worldServer.func_175625_s(_bp11);
                    IBlockState _bs11 = worldServer.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = worldServer.func_175625_s(_bp12);
                    IBlockState _bs12 = worldServer.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.53
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.54
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
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
                $_dependencies3.put("world", worldServer);
                ProcedureZhenFaYanXu.executeProcedure($_dependencies3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.55
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 14.0d) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = worldServer.func_175625_s(_bp13);
                IBlockState _bs13 = worldServer.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.56
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                }
                worldServer.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = worldServer.func_175625_s(_bp14);
                IBlockState _bs14 = worldServer.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.57
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                }
                worldServer.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.58
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ huilingzhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.59
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.60
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.61
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.62
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.63
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.64
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.65
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.66
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.67
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.68
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.69
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.70
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = worldServer.func_175625_s(_bp15);
                    IBlockState _bs15 = worldServer.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = worldServer.func_175625_s(_bp16);
                    IBlockState _bs16 = worldServer.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.71
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.72
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
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
                $_dependencies4.put("world", worldServer);
                ProcedureZhenFaYanXu.executeProcedure($_dependencies4);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.73
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 15.0d) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = worldServer.func_175625_s(_bp17);
                IBlockState _bs17 = worldServer.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.74
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                }
                worldServer.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = worldServer.func_175625_s(_bp18);
                IBlockState _bs18 = worldServer.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74780_a("阵法间隔", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.75
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔") + 1.0d);
                }
                worldServer.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = worldServer.func_175625_s(_bp19);
                IBlockState _bs19 = worldServer.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.76
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                }
                worldServer.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.77
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔2") <= 2.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.78
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfatp " + x + " " + y + " " + z + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.79
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.80
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.81
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.82
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.83
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.84
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.85
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.86
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.87
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.88
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.89
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.90
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = worldServer.func_175625_s(_bp20);
                    IBlockState _bs20 = worldServer.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("阵法间隔", 0.0d);
                    }
                    worldServer.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.91
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return worldServer;
                        }

                        public MinecraftServer func_184102_h() {
                            return worldServer.func_73046_m();
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfashanghai a3 " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.92
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "MagicAttack")) + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.93
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.94
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.95
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.96
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.97
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.98
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.99
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.100
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.101
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.102
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.103
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.104
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = worldServer.func_175625_s(_bp21);
                    IBlockState _bs21 = worldServer.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = worldServer.func_175625_s(_bp22);
                    IBlockState _bs22 = worldServer.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.105
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = worldServer.func_175625_s(_bp23);
                    IBlockState _bs23 = worldServer.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("阵法间隔2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.106
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔2") + 1.0d);
                    }
                    worldServer.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.107
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
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
                $_dependencies5.put("world", worldServer);
                ProcedureZhenFaYanXu.executeProcedure($_dependencies5);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.108
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 16.0d) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp24 = new BlockPos(x, y, z);
                TileEntity _tileEntity24 = worldServer.func_175625_s(_bp24);
                IBlockState _bs24 = worldServer.func_180495_p(_bp24);
                if (_tileEntity24 != null) {
                    _tileEntity24.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.109
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                }
                worldServer.func_184138_a(_bp24, _bs24, _bs24, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp25 = new BlockPos(x, y, z);
                TileEntity _tileEntity25 = worldServer.func_175625_s(_bp25);
                IBlockState _bs25 = worldServer.func_180495_p(_bp25);
                if (_tileEntity25 != null) {
                    _tileEntity25.getTileData().func_74780_a("阵法间隔", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.110
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔") + 1.0d);
                }
                worldServer.func_184138_a(_bp25, _bs25, _bs25, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp26 = new BlockPos(x, y, z);
                TileEntity _tileEntity26 = worldServer.func_175625_s(_bp26);
                IBlockState _bs26 = worldServer.func_180495_p(_bp26);
                if (_tileEntity26 != null) {
                    _tileEntity26.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.111
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                }
                worldServer.func_184138_a(_bp26, _bs26, _bs26, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.112
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔2") <= 3.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.113
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return worldServer;
                    }

                    public MinecraftServer func_184102_h() {
                        return worldServer.func_73046_m();
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfatp " + x + " " + y + " " + z + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.114
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.115
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.116
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.117
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.118
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.119
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.120
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.121
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.122
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.123
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.124
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.125
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp27 = new BlockPos(x, y, z);
                    TileEntity _tileEntity27 = worldServer.func_175625_s(_bp27);
                    IBlockState _bs27 = worldServer.func_180495_p(_bp27);
                    if (_tileEntity27 != null) {
                        _tileEntity27.getTileData().func_74780_a("阵法间隔", 0.0d);
                    }
                    worldServer.func_184138_a(_bp27, _bs27, _bs27, 3);
                }
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.126
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return worldServer;
                        }

                        public MinecraftServer func_184102_h() {
                            return worldServer.func_73046_m();
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfashanghai a4 " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.127
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "FireAttack")) + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.128
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.129
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.130
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.131
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.132
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.133
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.134
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.135
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.136
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.137
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.138
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = worldServer.func_175625_s(_bp28);
                    IBlockState _bs28 = worldServer.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("ZhenFa16Tick", 0.0d);
                    }
                    worldServer.func_184138_a(_bp28, _bs28, _bs28, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp29 = new BlockPos(x, y, z);
                    TileEntity _tileEntity29 = worldServer.func_175625_s(_bp29);
                    IBlockState _bs29 = worldServer.func_180495_p(_bp29);
                    if (_tileEntity29 != null) {
                        _tileEntity29.getTileData().func_74780_a("ZhenFa16Du", 0.0d);
                    }
                    worldServer.func_184138_a(_bp29, _bs29, _bs29, 3);
                }
                for (int index0 = 0; index0 < 360; index0++) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp30 = new BlockPos(x, y, z);
                        TileEntity _tileEntity30 = worldServer.func_175625_s(_bp30);
                        IBlockState _bs30 = worldServer.func_180495_p(_bp30);
                        if (_tileEntity30 != null) {
                            _tileEntity30.getTileData().func_74780_a("ZhenFa16Du", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.139
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "ZhenFa16Du") + 1.0d);
                        }
                        worldServer.func_184138_a(_bp30, _bs30, _bs30, 3);
                    }
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x + (Math.sin(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.140
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "ZhenFa16Du")) * 12.0d), y, z + (Math.cos(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.141
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "ZhenFa16Du")) * 12.0d), 2, 0.0d, 0.0d, 0.0d, 0.1d, new int[0]);
                    }
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.142
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp31 = new BlockPos(x, y, z);
                    TileEntity _tileEntity31 = worldServer.func_175625_s(_bp31);
                    IBlockState _bs31 = worldServer.func_180495_p(_bp31);
                    if (_tileEntity31 != null) {
                        _tileEntity31.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp31, _bs31, _bs31, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp32 = new BlockPos(x, y, z);
                    TileEntity _tileEntity32 = worldServer.func_175625_s(_bp32);
                    IBlockState _bs32 = worldServer.func_180495_p(_bp32);
                    if (_tileEntity32 != null) {
                        _tileEntity32.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.143
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp32, _bs32, _bs32, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp33 = new BlockPos(x, y, z);
                    TileEntity _tileEntity33 = worldServer.func_175625_s(_bp33);
                    IBlockState _bs33 = worldServer.func_180495_p(_bp33);
                    if (_tileEntity33 != null) {
                        _tileEntity33.getTileData().func_74780_a("阵法间隔2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.144
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔2") + 1.0d);
                    }
                    worldServer.func_184138_a(_bp33, _bs33, _bs33, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing1.145
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
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
                $_dependencies6.put("world", worldServer);
                ProcedureZhenFaYanXu.executeProcedure($_dependencies6);
            }
        }
    }
}
