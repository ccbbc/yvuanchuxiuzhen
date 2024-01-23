package net.mcreator.yuanchujianzhu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureBaoXiangSet1.class */
public class ProcedureBaoXiangSet1 extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureBaoXiangSet1(ElementsYuanchujianzhuMod instance) {
        super(instance, 128);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$49] */
    /* JADX WARN: Type inference failed for: r0v1030, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$22] */
    /* JADX WARN: Type inference failed for: r0v1033, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$23] */
    /* JADX WARN: Type inference failed for: r0v105, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$56] */
    /* JADX WARN: Type inference failed for: r0v1064, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$15] */
    /* JADX WARN: Type inference failed for: r0v1067, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$16] */
    /* JADX WARN: Type inference failed for: r0v1098, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$8] */
    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$63] */
    /* JADX WARN: Type inference failed for: r0v1101, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$9] */
    /* JADX WARN: Type inference failed for: r0v115, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$70] */
    /* JADX WARN: Type inference failed for: r0v120, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$77] */
    /* JADX WARN: Type inference failed for: r0v125, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$84] */
    /* JADX WARN: Type inference failed for: r0v130, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$91] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$98] */
    /* JADX WARN: Type inference failed for: r0v140, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$105] */
    /* JADX WARN: Type inference failed for: r0v145, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$112] */
    /* JADX WARN: Type inference failed for: r0v150, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$119] */
    /* JADX WARN: Type inference failed for: r0v155, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$126] */
    /* JADX WARN: Type inference failed for: r0v160, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$133] */
    /* JADX WARN: Type inference failed for: r0v165, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$140] */
    /* JADX WARN: Type inference failed for: r0v170, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$147] */
    /* JADX WARN: Type inference failed for: r0v175, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$154] */
    /* JADX WARN: Type inference failed for: r0v180, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$161] */
    /* JADX WARN: Type inference failed for: r0v185, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$168] */
    /* JADX WARN: Type inference failed for: r0v190, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$175] */
    /* JADX WARN: Type inference failed for: r0v195, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$182] */
    /* JADX WARN: Type inference failed for: r0v200, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$189] */
    /* JADX WARN: Type inference failed for: r0v214, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$190] */
    /* JADX WARN: Type inference failed for: r0v217, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$191] */
    /* JADX WARN: Type inference failed for: r0v248, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$183] */
    /* JADX WARN: Type inference failed for: r0v251, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$184] */
    /* JADX WARN: Type inference failed for: r0v282, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$176] */
    /* JADX WARN: Type inference failed for: r0v285, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$177] */
    /* JADX WARN: Type inference failed for: r0v316, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$169] */
    /* JADX WARN: Type inference failed for: r0v319, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$170] */
    /* JADX WARN: Type inference failed for: r0v350, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$162] */
    /* JADX WARN: Type inference failed for: r0v353, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$163] */
    /* JADX WARN: Type inference failed for: r0v384, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$155] */
    /* JADX WARN: Type inference failed for: r0v387, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$156] */
    /* JADX WARN: Type inference failed for: r0v418, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$148] */
    /* JADX WARN: Type inference failed for: r0v421, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$149] */
    /* JADX WARN: Type inference failed for: r0v452, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$141] */
    /* JADX WARN: Type inference failed for: r0v455, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$142] */
    /* JADX WARN: Type inference failed for: r0v486, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$134] */
    /* JADX WARN: Type inference failed for: r0v489, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$135] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$1] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$2] */
    /* JADX WARN: Type inference failed for: r0v520, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$127] */
    /* JADX WARN: Type inference failed for: r0v523, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$128] */
    /* JADX WARN: Type inference failed for: r0v554, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$120] */
    /* JADX WARN: Type inference failed for: r0v557, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$121] */
    /* JADX WARN: Type inference failed for: r0v588, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$113] */
    /* JADX WARN: Type inference failed for: r0v591, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$114] */
    /* JADX WARN: Type inference failed for: r0v622, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$106] */
    /* JADX WARN: Type inference failed for: r0v625, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$107] */
    /* JADX WARN: Type inference failed for: r0v656, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$99] */
    /* JADX WARN: Type inference failed for: r0v659, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$100] */
    /* JADX WARN: Type inference failed for: r0v690, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$92] */
    /* JADX WARN: Type inference failed for: r0v693, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$93] */
    /* JADX WARN: Type inference failed for: r0v70, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$7] */
    /* JADX WARN: Type inference failed for: r0v724, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$85] */
    /* JADX WARN: Type inference failed for: r0v727, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$86] */
    /* JADX WARN: Type inference failed for: r0v75, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$14] */
    /* JADX WARN: Type inference failed for: r0v758, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$78] */
    /* JADX WARN: Type inference failed for: r0v761, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$79] */
    /* JADX WARN: Type inference failed for: r0v792, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$71] */
    /* JADX WARN: Type inference failed for: r0v795, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$72] */
    /* JADX WARN: Type inference failed for: r0v80, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$21] */
    /* JADX WARN: Type inference failed for: r0v826, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$64] */
    /* JADX WARN: Type inference failed for: r0v829, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$65] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$28] */
    /* JADX WARN: Type inference failed for: r0v860, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$57] */
    /* JADX WARN: Type inference failed for: r0v863, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$58] */
    /* JADX WARN: Type inference failed for: r0v894, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$50] */
    /* JADX WARN: Type inference failed for: r0v897, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$51] */
    /* JADX WARN: Type inference failed for: r0v90, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$35] */
    /* JADX WARN: Type inference failed for: r0v928, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$43] */
    /* JADX WARN: Type inference failed for: r0v931, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$44] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$42] */
    /* JADX WARN: Type inference failed for: r0v962, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$36] */
    /* JADX WARN: Type inference failed for: r0v965, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$37] */
    /* JADX WARN: Type inference failed for: r0v996, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$29] */
    /* JADX WARN: Type inference failed for: r0v999, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$30] */
    /* JADX WARN: Type inference failed for: r2v1012, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$13] */
    /* JADX WARN: Type inference failed for: r2v1023, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$12] */
    /* JADX WARN: Type inference failed for: r2v1072, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$6] */
    /* JADX WARN: Type inference failed for: r2v1077, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$5] */
    /* JADX WARN: Type inference failed for: r2v113, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$194] */
    /* JADX WARN: Type inference failed for: r2v137, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$188] */
    /* JADX WARN: Type inference failed for: r2v148, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$187] */
    /* JADX WARN: Type inference failed for: r2v172, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$181] */
    /* JADX WARN: Type inference failed for: r2v183, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$180] */
    /* JADX WARN: Type inference failed for: r2v207, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$174] */
    /* JADX WARN: Type inference failed for: r2v218, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$173] */
    /* JADX WARN: Type inference failed for: r2v242, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$167] */
    /* JADX WARN: Type inference failed for: r2v253, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$166] */
    /* JADX WARN: Type inference failed for: r2v277, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$160] */
    /* JADX WARN: Type inference failed for: r2v288, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$159] */
    /* JADX WARN: Type inference failed for: r2v312, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$153] */
    /* JADX WARN: Type inference failed for: r2v323, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$152] */
    /* JADX WARN: Type inference failed for: r2v347, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$146] */
    /* JADX WARN: Type inference failed for: r2v358, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$145] */
    /* JADX WARN: Type inference failed for: r2v382, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$139] */
    /* JADX WARN: Type inference failed for: r2v393, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$138] */
    /* JADX WARN: Type inference failed for: r2v417, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$132] */
    /* JADX WARN: Type inference failed for: r2v428, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$131] */
    /* JADX WARN: Type inference failed for: r2v452, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$125] */
    /* JADX WARN: Type inference failed for: r2v463, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$124] */
    /* JADX WARN: Type inference failed for: r2v487, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$118] */
    /* JADX WARN: Type inference failed for: r2v498, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$117] */
    /* JADX WARN: Type inference failed for: r2v522, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$111] */
    /* JADX WARN: Type inference failed for: r2v533, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$110] */
    /* JADX WARN: Type inference failed for: r2v557, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$104] */
    /* JADX WARN: Type inference failed for: r2v568, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$103] */
    /* JADX WARN: Type inference failed for: r2v592, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$97] */
    /* JADX WARN: Type inference failed for: r2v603, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$96] */
    /* JADX WARN: Type inference failed for: r2v627, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$90] */
    /* JADX WARN: Type inference failed for: r2v638, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$89] */
    /* JADX WARN: Type inference failed for: r2v662, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$83] */
    /* JADX WARN: Type inference failed for: r2v673, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$82] */
    /* JADX WARN: Type inference failed for: r2v697, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$76] */
    /* JADX WARN: Type inference failed for: r2v708, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$75] */
    /* JADX WARN: Type inference failed for: r2v732, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$69] */
    /* JADX WARN: Type inference failed for: r2v743, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$68] */
    /* JADX WARN: Type inference failed for: r2v767, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$62] */
    /* JADX WARN: Type inference failed for: r2v778, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$61] */
    /* JADX WARN: Type inference failed for: r2v802, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$55] */
    /* JADX WARN: Type inference failed for: r2v813, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$54] */
    /* JADX WARN: Type inference failed for: r2v837, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$48] */
    /* JADX WARN: Type inference failed for: r2v848, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$47] */
    /* JADX WARN: Type inference failed for: r2v872, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$41] */
    /* JADX WARN: Type inference failed for: r2v883, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$40] */
    /* JADX WARN: Type inference failed for: r2v907, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$34] */
    /* JADX WARN: Type inference failed for: r2v918, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$33] */
    /* JADX WARN: Type inference failed for: r2v942, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$27] */
    /* JADX WARN: Type inference failed for: r2v953, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$26] */
    /* JADX WARN: Type inference failed for: r2v977, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$20] */
    /* JADX WARN: Type inference failed for: r2v988, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$19] */
    /* JADX WARN: Type inference failed for: r4v104, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$165] */
    /* JADX WARN: Type inference failed for: r4v120, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$158] */
    /* JADX WARN: Type inference failed for: r4v136, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$151] */
    /* JADX WARN: Type inference failed for: r4v152, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$144] */
    /* JADX WARN: Type inference failed for: r4v168, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$137] */
    /* JADX WARN: Type inference failed for: r4v184, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$130] */
    /* JADX WARN: Type inference failed for: r4v200, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$123] */
    /* JADX WARN: Type inference failed for: r4v216, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$116] */
    /* JADX WARN: Type inference failed for: r4v232, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$109] */
    /* JADX WARN: Type inference failed for: r4v248, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$102] */
    /* JADX WARN: Type inference failed for: r4v264, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$95] */
    /* JADX WARN: Type inference failed for: r4v280, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$88] */
    /* JADX WARN: Type inference failed for: r4v296, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$81] */
    /* JADX WARN: Type inference failed for: r4v317, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$74] */
    /* JADX WARN: Type inference failed for: r4v335, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$67] */
    /* JADX WARN: Type inference failed for: r4v356, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$60] */
    /* JADX WARN: Type inference failed for: r4v372, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$53] */
    /* JADX WARN: Type inference failed for: r4v388, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$46] */
    /* JADX WARN: Type inference failed for: r4v40, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$193] */
    /* JADX WARN: Type inference failed for: r4v404, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$39] */
    /* JADX WARN: Type inference failed for: r4v425, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$32] */
    /* JADX WARN: Type inference failed for: r4v441, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$25] */
    /* JADX WARN: Type inference failed for: r4v457, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$18] */
    /* JADX WARN: Type inference failed for: r4v473, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$11] */
    /* JADX WARN: Type inference failed for: r4v497, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$4] */
    /* JADX WARN: Type inference failed for: r4v56, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$186] */
    /* JADX WARN: Type inference failed for: r4v72, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$179] */
    /* JADX WARN: Type inference failed for: r4v88, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1$172] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Object entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        Map<String, Object> $_dependencies = new HashMap<>();
        $_dependencies.put("world", world);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureSetBlockLingGen.executeProcedure($_dependencies);
        Map<String, Object> $_dependencies2 = new HashMap<>();
        $_dependencies2.put("entity", entity);
        $_dependencies2.put("world", world);
        $_dependencies2.put("x", Integer.valueOf(x));
        $_dependencies2.put("y", Integer.valueOf(y));
        $_dependencies2.put("z", Integer.valueOf(z));
        ProcedureOpenGuiTiaoJian.executeProcedure($_dependencies2);
        if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "打开") && !new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.2
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "初始化")) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.3
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhen:cailiaolingshi03 " + new DecimalFormat("0").format(new Random().nextInt(6) + 1) + " 0");
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("概率1", new Random().nextInt(51));
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("概率2", new Random().nextInt(51));
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("概率3", new Random().nextInt(51));
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("概率4", new Random().nextInt(61));
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("概率5", new Random().nextInt(61));
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") >= 0.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") <= 9.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.10
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_9 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.12
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.13
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") >= 10.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") <= 19.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.17
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.18
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_31 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.19
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.20
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.21
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.22
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") >= 20.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.23
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") <= 29.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.24
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.25
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhen:huoyan01 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.27
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.29
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") >= 30.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.30
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") <= 39.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.31
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.32
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:fabao1501 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.33
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp15 = new BlockPos(x, y, z);
                TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                IBlockState _bs15 = world.func_180495_p(_bp15);
                if (_tileEntity15 != null) {
                    _tileEntity15.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.34
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp15, _bs15, _bs15, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.35
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") >= 40.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.37
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率1") <= 49.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.38
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.39
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuyaoshou:yaodan0201 " + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.40
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                IBlockState _bs17 = world.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.41
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.42
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.43
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") >= 0.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.44
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") <= 9.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.45
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.46
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_18 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.47
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.48
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.49
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.50
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") >= 10.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.51
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") <= 19.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.52
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.53
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_19 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.54
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp21 = new BlockPos(x, y, z);
                TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                IBlockState _bs21 = world.func_180495_p(_bp21);
                if (_tileEntity21 != null) {
                    _tileEntity21.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.55
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp21, _bs21, _bs21, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.56
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.57
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") >= 20.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.58
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") <= 29.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.59
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.60
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_17 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                    IBlockState _bs22 = world.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.61
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp23 = new BlockPos(x, y, z);
                TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                IBlockState _bs23 = world.func_180495_p(_bp23);
                if (_tileEntity23 != null) {
                    _tileEntity23.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.62
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp23, _bs23, _bs23, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.63
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.64
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") >= 30.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.65
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") <= 39.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.66
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.67
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_9b " + new DecimalFormat("0").format(new Random().nextInt(3) + 1) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.68
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp25 = new BlockPos(x, y, z);
                TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                IBlockState _bs25 = world.func_180495_p(_bp25);
                if (_tileEntity25 != null) {
                    _tileEntity25.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.69
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp25, _bs25, _bs25, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.70
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.71
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") >= 40.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.72
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率2") <= 49.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.73
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.74
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:cui_ti_dan_lu " + new DecimalFormat("0").format(1L) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp26 = new BlockPos(x, y, z);
                    TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                    IBlockState _bs26 = world.func_180495_p(_bp26);
                    if (_tileEntity26 != null) {
                        _tileEntity26.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.75
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp26, _bs26, _bs26, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp27 = new BlockPos(x, y, z);
                TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                IBlockState _bs27 = world.func_180495_p(_bp27);
                if (_tileEntity27 != null) {
                    _tileEntity27.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.76
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp27, _bs27, _bs27, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.77
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.78
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") >= 0.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.79
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") <= 9.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.80
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.81
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:fu_lu_1 " + new DecimalFormat("0").format(new Random().nextInt(7) + 1) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                    IBlockState _bs28 = world.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.82
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp28, _bs28, _bs28, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp29 = new BlockPos(x, y, z);
                TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                IBlockState _bs29 = world.func_180495_p(_bp29);
                if (_tileEntity29 != null) {
                    _tileEntity29.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.83
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp29, _bs29, _bs29, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.84
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.85
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") >= 10.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.86
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") <= 19.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.87
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.88
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:fu_lu_da_quan 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp30 = new BlockPos(x, y, z);
                    TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                    IBlockState _bs30 = world.func_180495_p(_bp30);
                    if (_tileEntity30 != null) {
                        _tileEntity30.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.89
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp30, _bs30, _bs30, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp31 = new BlockPos(x, y, z);
                TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                IBlockState _bs31 = world.func_180495_p(_bp31);
                if (_tileEntity31 != null) {
                    _tileEntity31.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.90
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp31, _bs31, _bs31, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.91
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.92
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") >= 20.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.93
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") <= 29.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.94
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.95
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:qi_lu_1 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp32 = new BlockPos(x, y, z);
                    TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                    IBlockState _bs32 = world.func_180495_p(_bp32);
                    if (_tileEntity32 != null) {
                        _tileEntity32.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.96
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp32, _bs32, _bs32, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp33 = new BlockPos(x, y, z);
                TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                IBlockState _bs33 = world.func_180495_p(_bp33);
                if (_tileEntity33 != null) {
                    _tileEntity33.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.97
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp33, _bs33, _bs33, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.98
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.99
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") >= 30.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.100
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") <= 39.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.101
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.102
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:fei_jian_fu 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp34 = new BlockPos(x, y, z);
                    TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                    IBlockState _bs34 = world.func_180495_p(_bp34);
                    if (_tileEntity34 != null) {
                        _tileEntity34.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.103
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp34, _bs34, _bs34, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp35 = new BlockPos(x, y, z);
                TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                IBlockState _bs35 = world.func_180495_p(_bp35);
                if (_tileEntity35 != null) {
                    _tileEntity35.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.104
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp35, _bs35, _bs35, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.105
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.106
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") >= 40.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.107
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率3") <= 49.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.108
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.109
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:huo_dan_fu 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp36 = new BlockPos(x, y, z);
                    TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                    IBlockState _bs36 = world.func_180495_p(_bp36);
                    if (_tileEntity36 != null) {
                        _tileEntity36.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.110
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp36, _bs36, _bs36, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp37 = new BlockPos(x, y, z);
                TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                IBlockState _bs37 = world.func_180495_p(_bp37);
                if (_tileEntity37 != null) {
                    _tileEntity37.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.111
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp37, _bs37, _bs37, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.112
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.113
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") >= 0.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.114
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") <= 9.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.115
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.116
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_3 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp38 = new BlockPos(x, y, z);
                    TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                    IBlockState _bs38 = world.func_180495_p(_bp38);
                    if (_tileEntity38 != null) {
                        _tileEntity38.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.117
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp38, _bs38, _bs38, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp39 = new BlockPos(x, y, z);
                TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                IBlockState _bs39 = world.func_180495_p(_bp39);
                if (_tileEntity39 != null) {
                    _tileEntity39.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.118
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp39, _bs39, _bs39, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.119
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.120
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") >= 10.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.121
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") <= 19.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.122
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.123
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:zhao_ming_fu 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp40 = new BlockPos(x, y, z);
                    TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                    IBlockState _bs40 = world.func_180495_p(_bp40);
                    if (_tileEntity40 != null) {
                        _tileEntity40.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.124
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp40, _bs40, _bs40, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp41 = new BlockPos(x, y, z);
                TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                IBlockState _bs41 = world.func_180495_p(_bp41);
                if (_tileEntity41 != null) {
                    _tileEntity41.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.125
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp41, _bs41, _bs41, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.126
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.127
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") >= 20.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.128
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") <= 29.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.129
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.130
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:fu_bi_1 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp42 = new BlockPos(x, y, z);
                    TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                    IBlockState _bs42 = world.func_180495_p(_bp42);
                    if (_tileEntity42 != null) {
                        _tileEntity42.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.131
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp42, _bs42, _bs42, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp43 = new BlockPos(x, y, z);
                TileEntity _tileEntity43 = world.func_175625_s(_bp43);
                IBlockState _bs43 = world.func_180495_p(_bp43);
                if (_tileEntity43 != null) {
                    _tileEntity43.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.132
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp43, _bs43, _bs43, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.133
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.134
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") >= 30.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.135
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") <= 39.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.136
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.137
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:wan_xiang_fu_jing 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp44 = new BlockPos(x, y, z);
                    TileEntity _tileEntity44 = world.func_175625_s(_bp44);
                    IBlockState _bs44 = world.func_180495_p(_bp44);
                    if (_tileEntity44 != null) {
                        _tileEntity44.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.138
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp44, _bs44, _bs44, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp45 = new BlockPos(x, y, z);
                TileEntity _tileEntity45 = world.func_175625_s(_bp45);
                IBlockState _bs45 = world.func_180495_p(_bp45);
                if (_tileEntity45 != null) {
                    _tileEntity45.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.139
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp45, _bs45, _bs45, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.140
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.141
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") >= 40.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.142
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") <= 49.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.143
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.144
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_1 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp46 = new BlockPos(x, y, z);
                    TileEntity _tileEntity46 = world.func_175625_s(_bp46);
                    IBlockState _bs46 = world.func_180495_p(_bp46);
                    if (_tileEntity46 != null) {
                        _tileEntity46.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.145
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp46, _bs46, _bs46, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp47 = new BlockPos(x, y, z);
                TileEntity _tileEntity47 = world.func_175625_s(_bp47);
                IBlockState _bs47 = world.func_180495_p(_bp47);
                if (_tileEntity47 != null) {
                    _tileEntity47.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.146
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp47, _bs47, _bs47, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.147
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.148
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") >= 50.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.149
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率4") <= 59.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.150
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.151
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_4 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp48 = new BlockPos(x, y, z);
                    TileEntity _tileEntity48 = world.func_175625_s(_bp48);
                    IBlockState _bs48 = world.func_180495_p(_bp48);
                    if (_tileEntity48 != null) {
                        _tileEntity48.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.152
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp48, _bs48, _bs48, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp49 = new BlockPos(x, y, z);
                TileEntity _tileEntity49 = world.func_175625_s(_bp49);
                IBlockState _bs49 = world.func_180495_p(_bp49);
                if (_tileEntity49 != null) {
                    _tileEntity49.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.153
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp49, _bs49, _bs49, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.154
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.155
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") >= 0.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.156
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") <= 9.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.157
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.158
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " fabaokuozhan:qi_lu_2 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp50 = new BlockPos(x, y, z);
                    TileEntity _tileEntity50 = world.func_175625_s(_bp50);
                    IBlockState _bs50 = world.func_180495_p(_bp50);
                    if (_tileEntity50 != null) {
                        _tileEntity50.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.159
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp50, _bs50, _bs50, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp51 = new BlockPos(x, y, z);
                TileEntity _tileEntity51 = world.func_175625_s(_bp51);
                IBlockState _bs51 = world.func_180495_p(_bp51);
                if (_tileEntity51 != null) {
                    _tileEntity51.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.160
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp51, _bs51, _bs51, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.161
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.162
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") >= 10.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.163
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") <= 19.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.164
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.165
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_fang_101 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp52 = new BlockPos(x, y, z);
                    TileEntity _tileEntity52 = world.func_175625_s(_bp52);
                    IBlockState _bs52 = world.func_180495_p(_bp52);
                    if (_tileEntity52 != null) {
                        _tileEntity52.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.166
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp52, _bs52, _bs52, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp53 = new BlockPos(x, y, z);
                TileEntity _tileEntity53 = world.func_175625_s(_bp53);
                IBlockState _bs53 = world.func_180495_p(_bp53);
                if (_tileEntity53 != null) {
                    _tileEntity53.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.167
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp53, _bs53, _bs53, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.168
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.169
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") >= 20.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.170
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") <= 29.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.171
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.172
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_dao_17 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp54 = new BlockPos(x, y, z);
                    TileEntity _tileEntity54 = world.func_175625_s(_bp54);
                    IBlockState _bs54 = world.func_180495_p(_bp54);
                    if (_tileEntity54 != null) {
                        _tileEntity54.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.173
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp54, _bs54, _bs54, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp55 = new BlockPos(x, y, z);
                TileEntity _tileEntity55 = world.func_175625_s(_bp55);
                IBlockState _bs55 = world.func_180495_p(_bp55);
                if (_tileEntity55 != null) {
                    _tileEntity55.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.174
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp55, _bs55, _bs55, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.175
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.176
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") >= 30.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.177
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") <= 39.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.178
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.179
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:fulu03 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp56 = new BlockPos(x, y, z);
                    TileEntity _tileEntity56 = world.func_175625_s(_bp56);
                    IBlockState _bs56 = world.func_180495_p(_bp56);
                    if (_tileEntity56 != null) {
                        _tileEntity56.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.180
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp56, _bs56, _bs56, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp57 = new BlockPos(x, y, z);
                TileEntity _tileEntity57 = world.func_175625_s(_bp57);
                IBlockState _bs57 = world.func_180495_p(_bp57);
                if (_tileEntity57 != null) {
                    _tileEntity57.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.181
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp57, _bs57, _bs57, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.182
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.183
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") >= 40.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.184
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") <= 49.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.185
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.186
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuxiuzhenfulu:fulu04 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp58 = new BlockPos(x, y, z);
                    TileEntity _tileEntity58 = world.func_175625_s(_bp58);
                    IBlockState _bs58 = world.func_180495_p(_bp58);
                    if (_tileEntity58 != null) {
                        _tileEntity58.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.187
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp58, _bs58, _bs58, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp59 = new BlockPos(x, y, z);
                TileEntity _tileEntity59 = world.func_175625_s(_bp59);
                IBlockState _bs59 = world.func_180495_p(_bp59);
                if (_tileEntity59 != null) {
                    _tileEntity59.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.188
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp59, _bs59, _bs59, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.189
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 6.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.190
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") >= 50.0d && new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.191
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "概率5") <= 59.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.192
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
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.193
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchujiguan:gong_fa_10 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp60 = new BlockPos(x, y, z);
                    TileEntity _tileEntity60 = world.func_175625_s(_bp60);
                    IBlockState _bs60 = world.func_180495_p(_bp60);
                    if (_tileEntity60 != null) {
                        _tileEntity60.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureBaoXiangSet1.194
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp60, _bs60, _bs60, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp61 = new BlockPos(x, y, z);
                TileEntity _tileEntity61 = world.func_175625_s(_bp61);
                IBlockState _bs61 = world.func_180495_p(_bp61);
                if (_tileEntity61 != null) {
                    _tileEntity61.getTileData().func_74757_a("初始化", true);
                }
                world.func_184138_a(_bp61, _bs61, _bs61, 3);
            }
        }
    }
}
