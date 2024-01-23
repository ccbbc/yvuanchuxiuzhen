package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoXianZhi.class */
public class ProcedureDanYaoXianZhi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoXianZhi(ElementsYvanchuliandanMod instance) {
        super(instance, 908);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0319, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_03") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03c5, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_03") != false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x046d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_04") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_01") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0515, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_05") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05bb, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_06") != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0663, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_07") != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x070b, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_09") != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x07b3, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_08") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x085d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_04") != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0907, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_06") != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x09b1, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_07") != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0a5b, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_08") != false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0b05, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_09") != false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_01") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0bae, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_03") != false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0c9e, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_8") != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d93, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_21") != false) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0e88, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_32") != false) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0f7d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_44") != false) goto L758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x1072, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_56") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x110a, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_67") != false) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x1118, code lost:
        if (r0.getEntityData().func_74769_h("JingJieNum") != 1.0d) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x111f, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x1122, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x112c, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x113d, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_68") != false) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x1144, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x1147, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x1151, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x1162, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_68") == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x1172, code lost:
        if (r0.getEntityData().func_74769_h("JingJieNum") != 2.0d) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x1179, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x117c, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x1186, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x1197, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_69") != false) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x119e, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x11a1, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x11ab, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x11bc, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_69") == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x11cc, code lost:
        if (r0.getEntityData().func_74769_h("JingJieNum") != 3.0d) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x11d3, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x11d6, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x11e0, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c6, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_02") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x11f1, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_70") != false) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x11f8, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x11fb, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1205, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1216, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_70") == false) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x1226, code lost:
        if (r0.getEntityData().func_74769_h("JingJieNum") != 4.0d) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x122d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1230, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x123a, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x124b, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_71") != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x1252, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x1255, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x125f, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x1270, code lost:
        if (r0.func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_71") == false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x1280, code lost:
        if (r0.getEntityData().func_74769_h("JingJieNum") == 5.0d) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x128b, code lost:
        if (r5.get("event") == null) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x128e, code lost:
        r0 = r5.get("event");
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x129b, code lost:
        if ((r0 instanceof net.minecraftforge.fml.common.eventhandler.Event) == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x129e, code lost:
        r0 = (net.minecraftforge.fml.common.eventhandler.Event) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x12a7, code lost:
        if (r0.isCancelable() == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x12aa, code lost:
        r0.setCanceled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x12b3, code lost:
        if ((r0 instanceof net.minecraft.entity.player.EntityPlayer) == false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x12bd, code lost:
        if (((net.minecraft.entity.Entity) r0).field_70170_p.field_72995_K != false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x12c0, code lost:
        ((net.minecraft.entity.player.EntityPlayer) r0).func_146105_b(new net.minecraft.util.text.TextComponentString("该丹药已对你无用或药性过强，无法服用"), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x12d5, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x12d8, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x12e2, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x12f3, code lost:
        if (r0.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_sect_") != false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x12fa, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x12fd, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1307, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x1318, code lost:
        if (r0.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_sect_") == false) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x131f, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x1322, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x132c, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x133d, code lost:
        if (r0.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_sect_") == false) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x1344, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x1347, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x1351, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1357, code lost:
        if (r0.func_77942_o() == false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x135e, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1361, code lost:
        r0 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x136b, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x136e, code lost:
        r0 = r0.func_77978_p().func_74769_h("级别");
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x137a, code lost:
        r0 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x137f, code lost:
        if (r0 <= 0.0d) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x1382, code lost:
        r0 = r0.getEntityData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x138d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x1390, code lost:
        r2 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x139a, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x13a0, code lost:
        if (r2.func_77942_o() == false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x13a7, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x13aa, code lost:
        r2 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x13b4, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x13b7, code lost:
        r2 = r2.func_77978_p().func_74769_h("级别");
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x13c3, code lost:
        r2 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x13c6, code lost:
        r0.func_74780_a("宗门丹药级别", r2);
        r0 = r0.getEntityData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x13d4, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x13d7, code lost:
        r2 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x13e1, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x13e7, code lost:
        if (r2.func_77942_o() == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x13ee, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x13f1, code lost:
        r2 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x13fb, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x13fe, code lost:
        r2 = r2.func_77978_p().func_74769_h("数值");
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x140a, code lost:
        r2 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x140d, code lost:
        r0.func_74780_a("宗门丹药数值", r2);
        r0 = r0.getEntityData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x141b, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x141e, code lost:
        r2 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x1428, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x142e, code lost:
        if (r2.func_77942_o() == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x1435, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x1438, code lost:
        r2 = r0.func_184614_ca();
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1442, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x1445, code lost:
        r2 = r2.func_77978_p().func_74779_i("数值类型");
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x1451, code lost:
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x1454, code lost:
        r0.func_74778_a("宗门丹药数值类型", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x145e, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x1461, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x146b, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x147c, code lost:
        if (r0.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_sect_") == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x1483, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x1486, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x1490, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x1496, code lost:
        if (r0.func_77942_o() == false) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x149d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x14a0, code lost:
        r0 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x14aa, code lost:
        r0 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x14ad, code lost:
        r0 = r0.func_77978_p().func_74769_h("级别");
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x14b9, code lost:
        r0 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x14be, code lost:
        if (r0 <= 0.0d) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x14c1, code lost:
        r0 = r0.getEntityData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x14cc, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x14cf, code lost:
        r2 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x14d9, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x14df, code lost:
        if (r2.func_77942_o() == false) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x14e6, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x14e9, code lost:
        r2 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x14f3, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x14f6, code lost:
        r2 = r2.func_77978_p().func_74769_h("级别");
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x1502, code lost:
        r2 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x1505, code lost:
        r0.func_74780_a("宗门丹药级别", r2);
        r0 = r0.getEntityData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x1513, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x1516, code lost:
        r2 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x1520, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x1526, code lost:
        if (r2.func_77942_o() == false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x152d, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x1530, code lost:
        r2 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x153a, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x153d, code lost:
        r2 = r2.func_77978_p().func_74769_h("数值");
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x1549, code lost:
        r2 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x154c, code lost:
        r0.func_74780_a("宗门丹药数值", r2);
        r0 = r0.getEntityData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x155a, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x155d, code lost:
        r2 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x1567, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x156d, code lost:
        if (r2.func_77942_o() == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x1574, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase) == false) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x1577, code lost:
        r2 = r0.func_184592_cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x1581, code lost:
        r2 = net.minecraft.item.ItemStack.field_190927_a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x1584, code lost:
        r2 = r2.func_77978_p().func_74779_i("数值类型");
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x1590, code lost:
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x1593, code lost:
        r0.func_74778_a("宗门丹药数值类型", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x15aa, code lost:
        if (r0.getEntityData().func_74769_h("JingJieNum") >= r0.getEntityData().func_74769_h("宗门丹药级别")) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x15b5, code lost:
        if (r5.get("event") == null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x15b8, code lost:
        r0 = r5.get("event");
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x15c5, code lost:
        if ((r0 instanceof net.minecraftforge.fml.common.eventhandler.Event) == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x15c8, code lost:
        r0 = (net.minecraftforge.fml.common.eventhandler.Event) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x15d1, code lost:
        if (r0.isCancelable() == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x15d4, code lost:
        r0.setCanceled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x15dd, code lost:
        if ((r0 instanceof net.minecraft.entity.player.EntityPlayer) == false) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x15e7, code lost:
        if (((net.minecraft.entity.Entity) r0).field_70170_p.field_72995_K != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x15ea, code lost:
        ((net.minecraft.entity.player.EntityPlayer) r0).func_146105_b(new net.minecraft.util.text.TextComponentString("境界过低,无法服用"), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x15fb, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0271, code lost:
        if ((r0 instanceof net.minecraft.entity.EntityLivingBase ? r0.func_184592_cb() : net.minecraft.item.ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:dan_yao_spoils_02") != false) goto L850;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0df7  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0eec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x10ca  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x10d4  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x10e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022a  */
    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$3] */
    /* JADX WARN: Type inference failed for: r0v167, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$4] */
    /* JADX WARN: Type inference failed for: r0v169, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$5] */
    /* JADX WARN: Type inference failed for: r0v171, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$6] */
    /* JADX WARN: Type inference failed for: r0v173, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$7] */
    /* JADX WARN: Type inference failed for: r0v175, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$8] */
    /* JADX WARN: Type inference failed for: r0v177, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$9] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$1] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi$2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void executeProcedure(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            Method dump skipped, instructions count: 5628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoXianZhi.executeProcedure(java.util.Map):void");
    }

    @SubscribeEvent
    public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Object entity = event.getEntityPlayer();
        int i = event.getPos().func_177958_n();
        int j = event.getPos().func_177956_o();
        int k = event.getPos().func_177952_p();
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
