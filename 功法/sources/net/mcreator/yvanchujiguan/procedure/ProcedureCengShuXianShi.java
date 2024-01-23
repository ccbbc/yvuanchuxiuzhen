package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureCengShuXianShi.class */
public class ProcedureCengShuXianShi extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCengShuXianShi(ElementsYvanchujiguanMod instance) {
        super(instance, 218);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!entity.getEntityData().func_74779_i("GongFaShow1").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa32") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi1a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa1")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi1").equals(entity.getEntityData().func_74779_i("CengShuXianShi1a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi1", entity.getEntityData().func_74779_i("CengShuXianShi1a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa17") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi1a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa17")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi1").equals(entity.getEntityData().func_74779_i("CengShuXianShi1a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi1", entity.getEntityData().func_74779_i("CengShuXianShi1a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa17") == 6.0d || entity.getEntityData().func_74769_h("GongFa32") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi1", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow2").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa7") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi2a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa7")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi2").equals(entity.getEntityData().func_74779_i("CengShuXianShi2a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi2", entity.getEntityData().func_74779_i("CengShuXianShi2a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa9") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi2a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa9")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi2").equals(entity.getEntityData().func_74779_i("CengShuXianShi2a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi2", entity.getEntityData().func_74779_i("CengShuXianShi2a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa7") == 6.0d || entity.getEntityData().func_74769_h("GongFa9") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi2", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow3").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa10") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi3a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa10")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi3").equals(entity.getEntityData().func_74779_i("CengShuXianShi3a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi3", entity.getEntityData().func_74779_i("CengShuXianShi3a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa11") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi3a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa11")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi3").equals(entity.getEntityData().func_74779_i("CengShuXianShi3a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi3", entity.getEntityData().func_74779_i("CengShuXianShi3a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa10") == 6.0d || entity.getEntityData().func_74769_h("GongFa11") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi3", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow4").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa12") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi4a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa12")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi4").equals(entity.getEntityData().func_74779_i("CengShuXianShi4a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi4", entity.getEntityData().func_74779_i("CengShuXianShi4a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa13") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi4a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa13")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi4").equals(entity.getEntityData().func_74779_i("CengShuXianShi4a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi4", entity.getEntityData().func_74779_i("CengShuXianShi4a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa14") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi4a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa14")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi4").equals(entity.getEntityData().func_74779_i("CengShuXianShi4a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi4", entity.getEntityData().func_74779_i("CengShuXianShi4a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa15") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi4a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa15")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi4").equals(entity.getEntityData().func_74779_i("CengShuXianShi4a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi4", entity.getEntityData().func_74779_i("CengShuXianShi4a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa16") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi4a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa16")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi4").equals(entity.getEntityData().func_74779_i("CengShuXianShi4a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi4", entity.getEntityData().func_74779_i("CengShuXianShi4a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa12") == 6.0d || entity.getEntityData().func_74769_h("GongFa13") == 6.0d || entity.getEntityData().func_74769_h("GongFa14") == 6.0d || entity.getEntityData().func_74769_h("GongFa15") == 6.0d || entity.getEntityData().func_74769_h("GongFa16") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi4", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow5").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa33") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi5a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa33")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi5").equals(entity.getEntityData().func_74779_i("CengShuXianShi5a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi5", entity.getEntityData().func_74779_i("CengShuXianShi5a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa20") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi5a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa20")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi5").equals(entity.getEntityData().func_74779_i("CengShuXianShi5a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi5", entity.getEntityData().func_74779_i("CengShuXianShi5a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa33") == 6.0d || entity.getEntityData().func_74769_h("GongFa20") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi5", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow6").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa25") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi6a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa25")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi6").equals(entity.getEntityData().func_74779_i("CengShuXianShi6a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi6", entity.getEntityData().func_74779_i("CengShuXianShi6a"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa26") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi6a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa26")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi6").equals(entity.getEntityData().func_74779_i("CengShuXianShi6a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi6", entity.getEntityData().func_74779_i("CengShuXianShi6a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa25") == 6.0d || entity.getEntityData().func_74769_h("GongFa26") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi6", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow7").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa22") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi7a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa22")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi7").equals(entity.getEntityData().func_74779_i("CengShuXianShi7a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi7", entity.getEntityData().func_74779_i("CengShuXianShi7a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa22") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi7", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow8").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa18") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi8a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa18")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi8").equals(entity.getEntityData().func_74779_i("CengShuXianShi8a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi8", entity.getEntityData().func_74779_i("CengShuXianShi8a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa18") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi8", "圆满");
            }
        } else if (!entity.getEntityData().func_74779_i("GongFaShow9").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa19") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi9a", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa19")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi9").equals(entity.getEntityData().func_74779_i("CengShuXianShi9a"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi9", entity.getEntityData().func_74779_i("CengShuXianShi9a"));
                }
            }
            if (entity.getEntityData().func_74769_h("GongFa19") == 6.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi9", "圆满");
            }
        }
        if (!entity.getEntityData().func_74779_i("GongFaShow").equals("")) {
            if (entity.getEntityData().func_74769_h("GongFa1") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa1")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa2") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa2")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa3") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa3")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa4") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa4")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa5") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa5")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa6") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa6")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa8") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa8")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa21") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa21")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa31") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa31")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa23") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa23")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa24") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa24")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa29") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa29")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa30") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa30")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else if (entity.getEntityData().func_74769_h("GongFa28") > 0.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShia", "第" + new DecimalFormat("0").format(entity.getEntityData().func_74769_h("GongFa28")) + "层");
                if (!entity.getEntityData().func_74779_i("CengShuXianShi").equals(entity.getEntityData().func_74779_i("CengShuXianShia"))) {
                    entity.getEntityData().func_74778_a("CengShuXianShi", entity.getEntityData().func_74779_i("CengShuXianShia"));
                }
            } else {
                entity.getEntityData().func_74778_a("CengShuXianShi", "");
            }
            if (entity.getEntityData().func_74769_h("GongFa1") == 4.0d || entity.getEntityData().func_74769_h("GongFa2") == 4.0d || entity.getEntityData().func_74769_h("GongFa3") == 4.0d || entity.getEntityData().func_74769_h("GongFa4") == 4.0d || entity.getEntityData().func_74769_h("GongFa5") == 4.0d || entity.getEntityData().func_74769_h("GongFa6") == 14.0d || entity.getEntityData().func_74769_h("GongFa8") == 14.0d || entity.getEntityData().func_74769_h("GongFa21") == 14.0d || entity.getEntityData().func_74769_h("GongFa28") == 14.0d || entity.getEntityData().func_74769_h("GongFa29") == 14.0d || entity.getEntityData().func_74769_h("GongFa30") == 14.0d || entity.getEntityData().func_74769_h("GongFa31") == 14.0d || entity.getEntityData().func_74769_h("GongFa24") == 14.0d || entity.getEntityData().func_74769_h("GongFa23") == 14.0d) {
                entity.getEntityData().func_74778_a("CengShuXianShi", "圆满");
            }
        }
        if (entity.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entity.getEntityData().func_74779_i("GongFaShow").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow1").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi1", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow2").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi2", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow3").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi3", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow4").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi4", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow5").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi5", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow6").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi6", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow7").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi7", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow8").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi8", "");
            } else if (entity.getEntityData().func_74779_i("GongFaShow9").equals("")) {
                entity.getEntityData().func_74778_a("CengShuXianShi9", "");
            }
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
