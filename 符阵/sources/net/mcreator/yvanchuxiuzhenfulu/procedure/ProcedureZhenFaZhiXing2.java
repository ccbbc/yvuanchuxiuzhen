package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockInvertCore;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaZhiXing2.class */
public class ProcedureZhenFaZhiXing2 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaZhiXing2(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 562);
    }

    /* JADX WARN: Type inference failed for: r0v162, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$77] */
    /* JADX WARN: Type inference failed for: r0v165, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$90] */
    /* JADX WARN: Type inference failed for: r0v168, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$104] */
    /* JADX WARN: Type inference failed for: r0v171, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$107] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$19] */
    /* JADX WARN: Type inference failed for: r0v277, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$70] */
    /* JADX WARN: Type inference failed for: r0v280, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$72] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$37] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$55] */
    /* JADX WARN: Type inference failed for: r0v345, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$52] */
    /* JADX WARN: Type inference failed for: r0v348, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$54] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$73] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$108] */
    /* JADX WARN: Type inference failed for: r0v413, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$34] */
    /* JADX WARN: Type inference failed for: r0v416, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$36] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$112] */
    /* JADX WARN: Type inference failed for: r0v475, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$143] */
    /* JADX WARN: Type inference failed for: r0v478, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$144] */
    /* JADX WARN: Type inference failed for: r0v488, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$149] */
    /* JADX WARN: Type inference failed for: r0v491, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$151] */
    /* JADX WARN: Type inference failed for: r0v494, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$153] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$125] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$139] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$142] */
    /* JADX WARN: Type inference failed for: r0v662, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$16] */
    /* JADX WARN: Type inference failed for: r0v665, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$18] */
    /* JADX WARN: Type inference failed for: r2v125, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$111] */
    /* JADX WARN: Type inference failed for: r2v130, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$110] */
    /* JADX WARN: Type inference failed for: r2v135, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$109] */
    /* JADX WARN: Type inference failed for: r2v159, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$106] */
    /* JADX WARN: Type inference failed for: r2v164, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$105] */
    /* JADX WARN: Type inference failed for: r2v245, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$76] */
    /* JADX WARN: Type inference failed for: r2v250, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$75] */
    /* JADX WARN: Type inference failed for: r2v255, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$74] */
    /* JADX WARN: Type inference failed for: r2v273, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$71] */
    /* JADX WARN: Type inference failed for: r2v308, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$57] */
    /* JADX WARN: Type inference failed for: r2v313, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$56] */
    /* JADX WARN: Type inference failed for: r2v331, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$53] */
    /* JADX WARN: Type inference failed for: r2v366, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$39] */
    /* JADX WARN: Type inference failed for: r2v371, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$38] */
    /* JADX WARN: Type inference failed for: r2v389, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$35] */
    /* JADX WARN: Type inference failed for: r2v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$141] */
    /* JADX WARN: Type inference failed for: r2v424, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$21] */
    /* JADX WARN: Type inference failed for: r2v429, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$20] */
    /* JADX WARN: Type inference failed for: r2v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$140] */
    /* JADX WARN: Type inference failed for: r2v456, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$152] */
    /* JADX WARN: Type inference failed for: r2v466, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$148] */
    /* JADX WARN: Type inference failed for: r2v471, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$147] */
    /* JADX WARN: Type inference failed for: r2v476, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$146] */
    /* JADX WARN: Type inference failed for: r2v481, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$145] */
    /* JADX WARN: Type inference failed for: r2v528, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$17] */
    /* JADX WARN: Type inference failed for: r2v563, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$3] */
    /* JADX WARN: Type inference failed for: r2v568, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$2] */
    /* JADX WARN: Type inference failed for: r3v111, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$114] */
    /* JADX WARN: Type inference failed for: r3v116, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$115] */
    /* JADX WARN: Type inference failed for: r3v124, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$117] */
    /* JADX WARN: Type inference failed for: r3v132, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$119] */
    /* JADX WARN: Type inference failed for: r3v140, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$121] */
    /* JADX WARN: Type inference failed for: r3v148, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$123] */
    /* JADX WARN: Type inference failed for: r3v155, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$124] */
    /* JADX WARN: Type inference failed for: r3v159, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$122] */
    /* JADX WARN: Type inference failed for: r3v163, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$120] */
    /* JADX WARN: Type inference failed for: r3v167, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$118] */
    /* JADX WARN: Type inference failed for: r3v171, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$116] */
    /* JADX WARN: Type inference failed for: r3v214, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$93] */
    /* JADX WARN: Type inference failed for: r3v219, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$94] */
    /* JADX WARN: Type inference failed for: r3v227, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$96] */
    /* JADX WARN: Type inference failed for: r3v235, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$98] */
    /* JADX WARN: Type inference failed for: r3v243, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$100] */
    /* JADX WARN: Type inference failed for: r3v251, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$102] */
    /* JADX WARN: Type inference failed for: r3v258, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$103] */
    /* JADX WARN: Type inference failed for: r3v262, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$101] */
    /* JADX WARN: Type inference failed for: r3v266, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$99] */
    /* JADX WARN: Type inference failed for: r3v270, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$97] */
    /* JADX WARN: Type inference failed for: r3v274, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$95] */
    /* JADX WARN: Type inference failed for: r3v295, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$79] */
    /* JADX WARN: Type inference failed for: r3v30, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$128] */
    /* JADX WARN: Type inference failed for: r3v300, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$80] */
    /* JADX WARN: Type inference failed for: r3v308, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$82] */
    /* JADX WARN: Type inference failed for: r3v316, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$84] */
    /* JADX WARN: Type inference failed for: r3v324, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$86] */
    /* JADX WARN: Type inference failed for: r3v332, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$88] */
    /* JADX WARN: Type inference failed for: r3v339, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$89] */
    /* JADX WARN: Type inference failed for: r3v343, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$87] */
    /* JADX WARN: Type inference failed for: r3v347, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$85] */
    /* JADX WARN: Type inference failed for: r3v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$129] */
    /* JADX WARN: Type inference failed for: r3v351, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$83] */
    /* JADX WARN: Type inference failed for: r3v355, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$81] */
    /* JADX WARN: Type inference failed for: r3v386, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$59] */
    /* JADX WARN: Type inference failed for: r3v391, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$60] */
    /* JADX WARN: Type inference failed for: r3v399, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$62] */
    /* JADX WARN: Type inference failed for: r3v407, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$64] */
    /* JADX WARN: Type inference failed for: r3v415, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$66] */
    /* JADX WARN: Type inference failed for: r3v423, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$68] */
    /* JADX WARN: Type inference failed for: r3v43, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$131] */
    /* JADX WARN: Type inference failed for: r3v430, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$69] */
    /* JADX WARN: Type inference failed for: r3v434, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$67] */
    /* JADX WARN: Type inference failed for: r3v438, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$65] */
    /* JADX WARN: Type inference failed for: r3v442, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$63] */
    /* JADX WARN: Type inference failed for: r3v446, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$61] */
    /* JADX WARN: Type inference failed for: r3v472, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$41] */
    /* JADX WARN: Type inference failed for: r3v477, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$42] */
    /* JADX WARN: Type inference failed for: r3v485, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$44] */
    /* JADX WARN: Type inference failed for: r3v493, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$46] */
    /* JADX WARN: Type inference failed for: r3v501, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$48] */
    /* JADX WARN: Type inference failed for: r3v509, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$50] */
    /* JADX WARN: Type inference failed for: r3v51, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$133] */
    /* JADX WARN: Type inference failed for: r3v516, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$51] */
    /* JADX WARN: Type inference failed for: r3v520, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$49] */
    /* JADX WARN: Type inference failed for: r3v524, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$47] */
    /* JADX WARN: Type inference failed for: r3v528, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$45] */
    /* JADX WARN: Type inference failed for: r3v532, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$43] */
    /* JADX WARN: Type inference failed for: r3v558, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$23] */
    /* JADX WARN: Type inference failed for: r3v563, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$24] */
    /* JADX WARN: Type inference failed for: r3v571, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$26] */
    /* JADX WARN: Type inference failed for: r3v579, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$28] */
    /* JADX WARN: Type inference failed for: r3v587, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$30] */
    /* JADX WARN: Type inference failed for: r3v59, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$135] */
    /* JADX WARN: Type inference failed for: r3v595, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$32] */
    /* JADX WARN: Type inference failed for: r3v602, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$33] */
    /* JADX WARN: Type inference failed for: r3v606, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$31] */
    /* JADX WARN: Type inference failed for: r3v610, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$29] */
    /* JADX WARN: Type inference failed for: r3v614, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$27] */
    /* JADX WARN: Type inference failed for: r3v618, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$25] */
    /* JADX WARN: Type inference failed for: r3v67, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$137] */
    /* JADX WARN: Type inference failed for: r3v702, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$5] */
    /* JADX WARN: Type inference failed for: r3v707, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$6] */
    /* JADX WARN: Type inference failed for: r3v715, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$8] */
    /* JADX WARN: Type inference failed for: r3v723, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$10] */
    /* JADX WARN: Type inference failed for: r3v731, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$12] */
    /* JADX WARN: Type inference failed for: r3v739, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$14] */
    /* JADX WARN: Type inference failed for: r3v74, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$138] */
    /* JADX WARN: Type inference failed for: r3v746, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$15] */
    /* JADX WARN: Type inference failed for: r3v750, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$13] */
    /* JADX WARN: Type inference failed for: r3v754, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$11] */
    /* JADX WARN: Type inference failed for: r3v758, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$9] */
    /* JADX WARN: Type inference failed for: r3v762, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$7] */
    /* JADX WARN: Type inference failed for: r3v78, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$136] */
    /* JADX WARN: Type inference failed for: r3v82, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$134] */
    /* JADX WARN: Type inference failed for: r3v86, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$132] */
    /* JADX WARN: Type inference failed for: r3v90, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$130] */
    /* JADX WARN: Type inference failed for: r4v116, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$92] */
    /* JADX WARN: Type inference failed for: r4v24, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2$127] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        Template template;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.1
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
                    _tileEntity.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.2
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
                    _tileEntity2.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.3
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
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.4
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ tianhuzhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.5
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.7
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.8
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.9
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.10
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.11
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.12
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.13
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.14
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.15
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.16
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
                        _tileEntity4.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.17
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.18
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
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.19
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
                    _tileEntity5.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.20
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
                    _tileEntity6.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.21
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
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.22
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ liekongzhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.23
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.24
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.25
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.26
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.27
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.28
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.29
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.30
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.31
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.32
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.33
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.34
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
                        _tileEntity8.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.35
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.36
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
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.37
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
                    _tileEntity9.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.38
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
                    _tileEntity10.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.39
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
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.40
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ chenhuizhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.41
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.42
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.43
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.44
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.45
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.46
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.47
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.48
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.49
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.50
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.51
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.52
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
                        _tileEntity12.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.53
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.54
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
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.55
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
                    _tileEntity13.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.56
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
                    _tileEntity14.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.57
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
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.58
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ huilingzhen 2 " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.59
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.60
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.61
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.62
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.63
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.64
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.65
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.66
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.67
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.68
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.69
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.70
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
                        _tileEntity16.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.71
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.72
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
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.73
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
                    _tileEntity17.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.74
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
                    _tileEntity18.getTileData().func_74780_a("阵法间隔", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.75
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
                    _tileEntity19.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.76
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.77
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔2") <= 2.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.78
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfatp " + x + " " + y + " " + z + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.79
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.80
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.81
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.82
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.83
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.84
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.85
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.86
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.87
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.88
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.89
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.90
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
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.91
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfashanghai a3 " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.92
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "MagicAttack")) + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.93
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.94
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.95
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.96
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.97
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.98
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.99
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.100
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.101
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.102
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.103
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.104
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
                        _tileEntity22.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.105
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
                        _tileEntity23.getTileData().func_74780_a("阵法间隔2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.106
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.107
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
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.108
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
                    _tileEntity24.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.109
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
                    _tileEntity25.getTileData().func_74780_a("阵法间隔", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.110
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
                    _tileEntity26.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.111
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.112
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔2") <= 3.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.113
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
                }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfatp " + x + " " + y + " " + z + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.114
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.115
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.116
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.117
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.118
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.119
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.120
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.121
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.122
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.123
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.124
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74779_i("所有者") : "") + "\",CustomNameVisible:0b}");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.125
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
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.126
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
                    }, "summon yvanchuxiuzhenfulu:zhen_fa_zhi_xing_yuan ~ ~1 ~ {CustomName:\"execute @e[r=12] ~ ~ ~ zhenfashanghai a4 " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.127
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "FireAttack")) + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.128
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "所有者") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.129
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.130
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.131
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.132
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.133
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.134
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.135
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.136
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77978_p().func_74779_i("所有者") : "") + " " + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.137
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = worldServer.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.138
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
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.139
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = worldServer.func_175625_s(_bp28);
                    IBlockState _bs28 = worldServer.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp28, _bs28, _bs28, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp29 = new BlockPos(x, y, z);
                    TileEntity _tileEntity29 = worldServer.func_175625_s(_bp29);
                    IBlockState _bs29 = worldServer.func_180495_p(_bp29);
                    if (_tileEntity29 != null) {
                        _tileEntity29.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.140
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp29, _bs29, _bs29, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp30 = new BlockPos(x, y, z);
                    TileEntity _tileEntity30 = worldServer.func_175625_s(_bp30);
                    IBlockState _bs30 = worldServer.func_180495_p(_bp30);
                    if (_tileEntity30 != null) {
                        _tileEntity30.getTileData().func_74780_a("阵法间隔2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.141
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法间隔2") + 1.0d);
                    }
                    worldServer.func_184138_a(_bp30, _bs30, _bs30, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.142
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
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.143
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 17.0d) {
            if (!new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.144
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "结构生成")) {
                if (worldServer.func_180495_p(new BlockPos(0, 238, 0)).func_177230_c() != BlockInvertCore.block.func_176223_P().func_177230_c()) {
                    if (!((World) worldServer).field_72995_K && (template = worldServer.func_184163_y().func_186237_a(worldServer.func_73046_m(), new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "dian_dao_wu_xing_zhen"))) != null) {
                        BlockPos spawnTo = new BlockPos(-15, 223, -15);
                        IBlockState iblockstate = worldServer.func_180495_p(spawnTo);
                        worldServer.func_184138_a(spawnTo, iblockstate, iblockstate, 3);
                        template.func_186260_a(worldServer, spawnTo, new PlacementSettings().func_186220_a(Rotation.NONE).func_186214_a(Mirror.NONE).func_186218_a((ChunkPos) null).func_186225_a((Block) null).func_186226_b(false).func_186222_a(false));
                    }
                    worldServer.func_180501_a(new BlockPos(0, 238, 0), BlockInvertCore.block.func_176223_P(), 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp31 = new BlockPos(0, 238, 0);
                    TileEntity _tileEntity31 = worldServer.func_175625_s(_bp31);
                    IBlockState _bs31 = worldServer.func_180495_p(_bp31);
                    if (_tileEntity31 != null) {
                        _tileEntity31.getTileData().func_74780_a("time", 30.0d);
                    }
                    worldServer.func_184138_a(_bp31, _bs31, _bs31, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp32 = new BlockPos(0, 238, 0);
                    TileEntity _tileEntity32 = worldServer.func_175625_s(_bp32);
                    IBlockState _bs32 = worldServer.func_180495_p(_bp32);
                    if (_tileEntity32 != null) {
                        _tileEntity32.getTileData().func_74780_a("x", x);
                    }
                    worldServer.func_184138_a(_bp32, _bs32, _bs32, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp33 = new BlockPos(0, 238, 0);
                    TileEntity _tileEntity33 = worldServer.func_175625_s(_bp33);
                    IBlockState _bs33 = worldServer.func_180495_p(_bp33);
                    if (_tileEntity33 != null) {
                        _tileEntity33.getTileData().func_74780_a("y", y);
                    }
                    worldServer.func_184138_a(_bp33, _bs33, _bs33, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp34 = new BlockPos(0, 238, 0);
                    TileEntity _tileEntity34 = worldServer.func_175625_s(_bp34);
                    IBlockState _bs34 = worldServer.func_180495_p(_bp34);
                    if (_tileEntity34 != null) {
                        _tileEntity34.getTileData().func_74780_a("z", z);
                    }
                    worldServer.func_184138_a(_bp34, _bs34, _bs34, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp35 = new BlockPos(x, y, z);
                    TileEntity _tileEntity35 = worldServer.func_175625_s(_bp35);
                    IBlockState _bs35 = worldServer.func_180495_p(_bp35);
                    if (_tileEntity35 != null) {
                        _tileEntity35.getTileData().func_74757_a("结构生成", true);
                    }
                    worldServer.func_184138_a(_bp35, _bs35, _bs35, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp36 = new BlockPos(0, 238, 0);
                    TileEntity _tileEntity36 = worldServer.func_175625_s(_bp36);
                    IBlockState _bs36 = worldServer.func_180495_p(_bp36);
                    if (_tileEntity36 != null) {
                        _tileEntity36.getTileData().func_74757_a("启动", true);
                    }
                    worldServer.func_184138_a(_bp36, _bs36, _bs36, 3);
                }
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp37 = new BlockPos(x, y, z);
                TileEntity _tileEntity37 = worldServer.func_175625_s(_bp37);
                IBlockState _bs37 = worldServer.func_180495_p(_bp37);
                if (_tileEntity37 != null) {
                    _tileEntity37.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.145
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法时间") - 1.0d);
                }
                worldServer.func_184138_a(_bp37, _bs37, _bs37, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp38 = new BlockPos(x, y, z);
                TileEntity _tileEntity38 = worldServer.func_175625_s(_bp38);
                IBlockState _bs38 = worldServer.func_180495_p(_bp38);
                if (_tileEntity38 != null) {
                    _tileEntity38.getTileData().func_74780_a("阵法间隔", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.146
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔") + 1.0d);
                }
                worldServer.func_184138_a(_bp38, _bs38, _bs38, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp39 = new BlockPos(x, y, z);
                TileEntity _tileEntity39 = worldServer.func_175625_s(_bp39);
                IBlockState _bs39 = worldServer.func_180495_p(_bp39);
                if (_tileEntity39 != null) {
                    _tileEntity39.getTileData().func_74780_a("阵法间隔1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.147
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔1") + 1.0d);
                }
                worldServer.func_184138_a(_bp39, _bs39, _bs39, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp40 = new BlockPos(x, y, z);
                TileEntity _tileEntity40 = worldServer.func_175625_s(_bp40);
                IBlockState _bs40 = worldServer.func_180495_p(_bp40);
                if (_tileEntity40 != null) {
                    _tileEntity40.getTileData().func_74780_a("阵法间隔2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.148
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "阵法间隔2") + 1.0d);
                }
                worldServer.func_184138_a(_bp40, _bs40, _bs40, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.149
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔2") >= 4.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.150
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
                }, "tp @a[r=10] 0 234 0");
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.151
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法间隔1") >= 20.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp41 = new BlockPos(x, y, z);
                    TileEntity _tileEntity41 = worldServer.func_175625_s(_bp41);
                    IBlockState _bs41 = worldServer.func_180495_p(_bp41);
                    if (_tileEntity41 != null) {
                        _tileEntity41.getTileData().func_74780_a("阵法间隔1", 0.0d);
                    }
                    worldServer.func_184138_a(_bp41, _bs41, _bs41, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp42 = new BlockPos(x, y, z);
                    TileEntity _tileEntity42 = worldServer.func_175625_s(_bp42);
                    IBlockState _bs42 = worldServer.func_180495_p(_bp42);
                    if (_tileEntity42 != null) {
                        _tileEntity42.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.152
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") - 1.0d);
                    }
                    worldServer.func_184138_a(_bp42, _bs42, _bs42, 3);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaZhiXing2.153
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
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
                $_dependencies7.put("world", worldServer);
                ProcedureZhenFaYanXu.executeProcedure($_dependencies7);
            }
        }
    }
}
