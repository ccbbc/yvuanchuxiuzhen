package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao1;
import net.mcreator.yvanchuliandan.item.ItemDanYao10;
import net.mcreator.yvanchuliandan.item.ItemDanYao11;
import net.mcreator.yvanchuliandan.item.ItemDanYao12;
import net.mcreator.yvanchuliandan.item.ItemDanYao13;
import net.mcreator.yvanchuliandan.item.ItemDanYao14;
import net.mcreator.yvanchuliandan.item.ItemDanYao15;
import net.mcreator.yvanchuliandan.item.ItemDanYao16;
import net.mcreator.yvanchuliandan.item.ItemDanYao17;
import net.mcreator.yvanchuliandan.item.ItemDanYao18;
import net.mcreator.yvanchuliandan.item.ItemDanYao19;
import net.mcreator.yvanchuliandan.item.ItemDanYao2;
import net.mcreator.yvanchuliandan.item.ItemDanYao20;
import net.mcreator.yvanchuliandan.item.ItemDanYao21;
import net.mcreator.yvanchuliandan.item.ItemDanYao23;
import net.mcreator.yvanchuliandan.item.ItemDanYao24;
import net.mcreator.yvanchuliandan.item.ItemDanYao25;
import net.mcreator.yvanchuliandan.item.ItemDanYao26;
import net.mcreator.yvanchuliandan.item.ItemDanYao27;
import net.mcreator.yvanchuliandan.item.ItemDanYao28;
import net.mcreator.yvanchuliandan.item.ItemDanYao29;
import net.mcreator.yvanchuliandan.item.ItemDanYao3;
import net.mcreator.yvanchuliandan.item.ItemDanYao30a;
import net.mcreator.yvanchuliandan.item.ItemDanYao30b;
import net.mcreator.yvanchuliandan.item.ItemDanYao31;
import net.mcreator.yvanchuliandan.item.ItemDanYao32;
import net.mcreator.yvanchuliandan.item.ItemDanYao34;
import net.mcreator.yvanchuliandan.item.ItemDanYao35;
import net.mcreator.yvanchuliandan.item.ItemDanYao36;
import net.mcreator.yvanchuliandan.item.ItemDanYao37;
import net.mcreator.yvanchuliandan.item.ItemDanYao38;
import net.mcreator.yvanchuliandan.item.ItemDanYao39;
import net.mcreator.yvanchuliandan.item.ItemDanYao4;
import net.mcreator.yvanchuliandan.item.ItemDanYao40;
import net.mcreator.yvanchuliandan.item.ItemDanYao41;
import net.mcreator.yvanchuliandan.item.ItemDanYao42;
import net.mcreator.yvanchuliandan.item.ItemDanYao43;
import net.mcreator.yvanchuliandan.item.ItemDanYao44;
import net.mcreator.yvanchuliandan.item.ItemDanYao46;
import net.mcreator.yvanchuliandan.item.ItemDanYao47;
import net.mcreator.yvanchuliandan.item.ItemDanYao48;
import net.mcreator.yvanchuliandan.item.ItemDanYao49;
import net.mcreator.yvanchuliandan.item.ItemDanYao5;
import net.mcreator.yvanchuliandan.item.ItemDanYao50;
import net.mcreator.yvanchuliandan.item.ItemDanYao51;
import net.mcreator.yvanchuliandan.item.ItemDanYao52;
import net.mcreator.yvanchuliandan.item.ItemDanYao53;
import net.mcreator.yvanchuliandan.item.ItemDanYao54;
import net.mcreator.yvanchuliandan.item.ItemDanYao55;
import net.mcreator.yvanchuliandan.item.ItemDanYao56;
import net.mcreator.yvanchuliandan.item.ItemDanYao58;
import net.mcreator.yvanchuliandan.item.ItemDanYao59;
import net.mcreator.yvanchuliandan.item.ItemDanYao6;
import net.mcreator.yvanchuliandan.item.ItemDanYao60;
import net.mcreator.yvanchuliandan.item.ItemDanYao61;
import net.mcreator.yvanchuliandan.item.ItemDanYao62;
import net.mcreator.yvanchuliandan.item.ItemDanYao63;
import net.mcreator.yvanchuliandan.item.ItemDanYao64;
import net.mcreator.yvanchuliandan.item.ItemDanYao65;
import net.mcreator.yvanchuliandan.item.ItemDanYao66;
import net.mcreator.yvanchuliandan.item.ItemDanYao67;
import net.mcreator.yvanchuliandan.item.ItemDanYao68;
import net.mcreator.yvanchuliandan.item.ItemDanYao69;
import net.mcreator.yvanchuliandan.item.ItemDanYao7;
import net.mcreator.yvanchuliandan.item.ItemDanYao70;
import net.mcreator.yvanchuliandan.item.ItemDanYao71;
import net.mcreator.yvanchuliandan.item.ItemDanYao8;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSect1;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils04;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils06;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils07;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils08;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils09;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLianDanJingYan.class */
public class ProcedureLianDanJingYan extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianDanJingYan(ElementsYvanchuliandanMod instance) {
        super(instance, 544);
    }

    /* JADX WARN: Type inference failed for: r0v126, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$4] */
    /* JADX WARN: Type inference failed for: r0v132, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$5] */
    /* JADX WARN: Type inference failed for: r0v138, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$6] */
    /* JADX WARN: Type inference failed for: r0v144, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$7] */
    /* JADX WARN: Type inference failed for: r0v150, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$8] */
    /* JADX WARN: Type inference failed for: r0v169, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$123] */
    /* JADX WARN: Type inference failed for: r0v172, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$128] */
    /* JADX WARN: Type inference failed for: r0v175, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$133] */
    /* JADX WARN: Type inference failed for: r0v178, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$138] */
    /* JADX WARN: Type inference failed for: r0v181, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$143] */
    /* JADX WARN: Type inference failed for: r0v184, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$148] */
    /* JADX WARN: Type inference failed for: r0v187, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$149] */
    /* JADX WARN: Type inference failed for: r0v193, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$153] */
    /* JADX WARN: Type inference failed for: r0v199, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$157] */
    /* JADX WARN: Type inference failed for: r0v205, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$161] */
    /* JADX WARN: Type inference failed for: r0v219, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$162] */
    /* JADX WARN: Type inference failed for: r0v231, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$158] */
    /* JADX WARN: Type inference failed for: r0v243, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$154] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$3] */
    /* JADX WARN: Type inference failed for: r0v255, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$150] */
    /* JADX WARN: Type inference failed for: r0v339, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$9] */
    /* JADX WARN: Type inference failed for: r0v342, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$14] */
    /* JADX WARN: Type inference failed for: r0v361, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$15] */
    /* JADX WARN: Type inference failed for: r0v364, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$16] */
    /* JADX WARN: Type inference failed for: r0v367, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$17] */
    /* JADX WARN: Type inference failed for: r0v370, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$18] */
    /* JADX WARN: Type inference failed for: r0v373, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$19] */
    /* JADX WARN: Type inference failed for: r0v376, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$20] */
    /* JADX WARN: Type inference failed for: r0v379, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$21] */
    /* JADX WARN: Type inference failed for: r0v382, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$26] */
    /* JADX WARN: Type inference failed for: r0v401, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$27] */
    /* JADX WARN: Type inference failed for: r0v404, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$28] */
    /* JADX WARN: Type inference failed for: r0v407, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$29] */
    /* JADX WARN: Type inference failed for: r0v410, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$30] */
    /* JADX WARN: Type inference failed for: r0v413, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$31] */
    /* JADX WARN: Type inference failed for: r0v416, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$32] */
    /* JADX WARN: Type inference failed for: r0v419, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$33] */
    /* JADX WARN: Type inference failed for: r0v422, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$34] */
    /* JADX WARN: Type inference failed for: r0v425, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$39] */
    /* JADX WARN: Type inference failed for: r0v444, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$40] */
    /* JADX WARN: Type inference failed for: r0v447, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$41] */
    /* JADX WARN: Type inference failed for: r0v450, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$46] */
    /* JADX WARN: Type inference failed for: r0v469, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$47] */
    /* JADX WARN: Type inference failed for: r0v472, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$48] */
    /* JADX WARN: Type inference failed for: r0v475, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$49] */
    /* JADX WARN: Type inference failed for: r0v478, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$50] */
    /* JADX WARN: Type inference failed for: r0v481, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$51] */
    /* JADX WARN: Type inference failed for: r0v484, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$52] */
    /* JADX WARN: Type inference failed for: r0v487, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$57] */
    /* JADX WARN: Type inference failed for: r0v506, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$58] */
    /* JADX WARN: Type inference failed for: r0v509, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$59] */
    /* JADX WARN: Type inference failed for: r0v512, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$60] */
    /* JADX WARN: Type inference failed for: r0v515, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$65] */
    /* JADX WARN: Type inference failed for: r0v534, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$66] */
    /* JADX WARN: Type inference failed for: r0v537, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$67] */
    /* JADX WARN: Type inference failed for: r0v540, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$68] */
    /* JADX WARN: Type inference failed for: r0v543, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$69] */
    /* JADX WARN: Type inference failed for: r0v546, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$70] */
    /* JADX WARN: Type inference failed for: r0v549, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$71] */
    /* JADX WARN: Type inference failed for: r0v552, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$72] */
    /* JADX WARN: Type inference failed for: r0v555, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$77] */
    /* JADX WARN: Type inference failed for: r0v574, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$78] */
    /* JADX WARN: Type inference failed for: r0v577, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$79] */
    /* JADX WARN: Type inference failed for: r0v580, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$80] */
    /* JADX WARN: Type inference failed for: r0v583, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$85] */
    /* JADX WARN: Type inference failed for: r0v602, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$86] */
    /* JADX WARN: Type inference failed for: r0v605, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$87] */
    /* JADX WARN: Type inference failed for: r0v608, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$88] */
    /* JADX WARN: Type inference failed for: r0v611, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$89] */
    /* JADX WARN: Type inference failed for: r0v614, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$90] */
    /* JADX WARN: Type inference failed for: r0v617, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$91] */
    /* JADX WARN: Type inference failed for: r0v620, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$92] */
    /* JADX WARN: Type inference failed for: r0v623, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$97] */
    /* JADX WARN: Type inference failed for: r0v642, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$98] */
    /* JADX WARN: Type inference failed for: r0v645, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$99] */
    /* JADX WARN: Type inference failed for: r0v648, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$100] */
    /* JADX WARN: Type inference failed for: r0v651, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$105] */
    /* JADX WARN: Type inference failed for: r0v670, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$106] */
    /* JADX WARN: Type inference failed for: r0v673, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$107] */
    /* JADX WARN: Type inference failed for: r0v676, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$108] */
    /* JADX WARN: Type inference failed for: r0v679, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$109] */
    /* JADX WARN: Type inference failed for: r0v682, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$110] */
    /* JADX WARN: Type inference failed for: r0v685, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$115] */
    /* JADX WARN: Type inference failed for: r0v704, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$116] */
    /* JADX WARN: Type inference failed for: r0v707, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$117] */
    /* JADX WARN: Type inference failed for: r0v710, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$118] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$165] */
    /* JADX WARN: Type inference failed for: r1v16, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$170] */
    /* JADX WARN: Type inference failed for: r1v20, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$175] */
    /* JADX WARN: Type inference failed for: r1v24, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$180] */
    /* JADX WARN: Type inference failed for: r1v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$185] */
    /* JADX WARN: Type inference failed for: r3v102, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$167] */
    /* JADX WARN: Type inference failed for: r3v115, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$13] */
    /* JADX WARN: Type inference failed for: r3v126, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$11] */
    /* JADX WARN: Type inference failed for: r3v149, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$164] */
    /* JADX WARN: Type inference failed for: r3v161, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$160] */
    /* JADX WARN: Type inference failed for: r3v173, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$156] */
    /* JADX WARN: Type inference failed for: r3v185, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$152] */
    /* JADX WARN: Type inference failed for: r3v19, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$189] */
    /* JADX WARN: Type inference failed for: r3v197, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$147] */
    /* JADX WARN: Type inference failed for: r3v208, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$145] */
    /* JADX WARN: Type inference failed for: r3v215, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$142] */
    /* JADX WARN: Type inference failed for: r3v226, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$140] */
    /* JADX WARN: Type inference failed for: r3v233, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$137] */
    /* JADX WARN: Type inference failed for: r3v244, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$135] */
    /* JADX WARN: Type inference failed for: r3v251, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$132] */
    /* JADX WARN: Type inference failed for: r3v262, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$130] */
    /* JADX WARN: Type inference failed for: r3v269, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$127] */
    /* JADX WARN: Type inference failed for: r3v280, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$125] */
    /* JADX WARN: Type inference failed for: r3v291, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$25] */
    /* JADX WARN: Type inference failed for: r3v30, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$187] */
    /* JADX WARN: Type inference failed for: r3v302, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$23] */
    /* JADX WARN: Type inference failed for: r3v325, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$38] */
    /* JADX WARN: Type inference failed for: r3v336, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$36] */
    /* JADX WARN: Type inference failed for: r3v361, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$45] */
    /* JADX WARN: Type inference failed for: r3v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$184] */
    /* JADX WARN: Type inference failed for: r3v372, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$43] */
    /* JADX WARN: Type inference failed for: r3v385, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$56] */
    /* JADX WARN: Type inference failed for: r3v396, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$54] */
    /* JADX WARN: Type inference failed for: r3v417, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$64] */
    /* JADX WARN: Type inference failed for: r3v428, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$62] */
    /* JADX WARN: Type inference failed for: r3v443, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$76] */
    /* JADX WARN: Type inference failed for: r3v454, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$74] */
    /* JADX WARN: Type inference failed for: r3v477, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$84] */
    /* JADX WARN: Type inference failed for: r3v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$182] */
    /* JADX WARN: Type inference failed for: r3v488, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$82] */
    /* JADX WARN: Type inference failed for: r3v503, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$96] */
    /* JADX WARN: Type inference failed for: r3v514, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$94] */
    /* JADX WARN: Type inference failed for: r3v537, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$104] */
    /* JADX WARN: Type inference failed for: r3v548, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$102] */
    /* JADX WARN: Type inference failed for: r3v55, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$179] */
    /* JADX WARN: Type inference failed for: r3v563, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$114] */
    /* JADX WARN: Type inference failed for: r3v574, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$112] */
    /* JADX WARN: Type inference failed for: r3v593, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$122] */
    /* JADX WARN: Type inference failed for: r3v604, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$120] */
    /* JADX WARN: Type inference failed for: r3v617, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$2] */
    /* JADX WARN: Type inference failed for: r3v66, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$177] */
    /* JADX WARN: Type inference failed for: r3v73, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$174] */
    /* JADX WARN: Type inference failed for: r3v84, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$172] */
    /* JADX WARN: Type inference failed for: r3v91, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan$169] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.1
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
            }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.2
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者") + " 经验开关 1");
        }
        if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().contains("dan_yao_9") && !new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().contains("dan_yao_22") && !new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().contains("dan_yao_33") && !new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.6
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().contains("dan_yao_45") && !new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().contains("dan_yao_57")) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao19.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.9
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao30b.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.10
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.11
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.12
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.13
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 1\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao1.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.15
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao2.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.16
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao3.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.17
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao4.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.18
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao5.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.19
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao6.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.20
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao7.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.21
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao8.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.22
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.23
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.24
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.25
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 3\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.26
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao10.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.27
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao11.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.28
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao12.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.29
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao13.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.30
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao18.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.31
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao17.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.32
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao20.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.33
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao21.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.34
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao67.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.35
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.36
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.37
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.38
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 9\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.39
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao14.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.40
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao15.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.41
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao16.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.42
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.43
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.44
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.45
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 15\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.46
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao23.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.47
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao24.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.48
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao25.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.49
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao26.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.50
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao30a.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.51
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao31.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.52
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao32.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.53
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.54
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.55
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.56
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 27\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.57
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao27.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.58
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao28.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.59
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao29.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.60
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao68.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.61
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.62
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.63
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.64
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 45\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.65
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao34.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.66
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao35.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.67
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao36.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.68
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao37.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.69
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao38.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.70
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao42.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.71
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao43.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.72
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao44.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.73
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.74
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.75
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.76
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 81\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.77
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao39.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.78
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao40.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.79
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao41.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.80
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao69.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.81
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.82
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.83
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.84
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 135\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.85
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao46.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.86
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao47.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.87
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao48.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.88
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao49.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.89
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao50.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.90
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao54.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.91
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao55.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.92
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao56.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.93
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.94
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.95
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.96
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 273\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.97
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao51.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.98
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao52.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.99
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao53.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.100
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao70.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.101
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.102
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.103
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.104
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 405\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.105
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao58.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.106
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao59.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.107
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao60.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.108
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao61.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.109
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao62.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.110
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao66.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.111
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.112
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.113
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.114
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 819\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.115
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao63.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.116
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao64.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.117
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao65.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.118
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao71.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.119
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.120
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.121
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.122
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 1215\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.123
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYaoSpoils06.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.124
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.125
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.126
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.127
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 15\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.128
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYaoSpoils09.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.129
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.130
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.131
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.132
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 45\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.133
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYaoSpoils07.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.134
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.135
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.136
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.137
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 135\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.138
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYaoSpoils04.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.139
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.140
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.141
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.142
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 405\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.143
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYaoSpoils08.block, 1).func_77973_b()) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.144
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
                    }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.145
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
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.146
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.147
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 1215\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.148
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYaoSect1.block, 1).func_77973_b()) {
                if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.149
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.150
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74769_h("级别") : -1.0d) == 2.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.151
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
                        }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.152
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 45\",CustomNameVisible:0b}");
                        return;
                    }
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.153
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.154
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74769_h("级别") : -1.0d) == 3.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.155
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
                        }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.156
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 135\",CustomNameVisible:0b}");
                        return;
                    }
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.157
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.158
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74769_h("级别") : -1.0d) == 4.0d) {
                    if (!world.field_72995_K && world.func_73046_m() != null) {
                        world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.159
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
                        }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.160
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 405\",CustomNameVisible:0b}");
                        return;
                    }
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.161
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.162
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74769_h("级别") : -1.0d) == 5.0d && !world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.163
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.164
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 1215\",CustomNameVisible:0b}");
                }
            }
        } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.165
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang")).contains("90")) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.166
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
                }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.167
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
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.168
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.169
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 3\",CustomNameVisible:0b}");
            }
        } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.170
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang")).contains("22")) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.171
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
                }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.172
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
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.173
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.174
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 9\",CustomNameVisible:0b}");
            }
        } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.175
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang")).contains("33")) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.176
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
                }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.177
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
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.178
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.179
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 27\",CustomNameVisible:0b}");
            }
        } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.180
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang")).contains("45")) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.181
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
                }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.182
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
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.183
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.184
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 81\",CustomNameVisible:0b}");
            }
        } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.185
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang")).contains("57")) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.186
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
                }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.187
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
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.188
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
                }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanJingYan.189
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp liandan 273\",CustomNameVisible:0b}");
            }
        }
    }
}
