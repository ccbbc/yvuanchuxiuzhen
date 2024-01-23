package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao18;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureRightClick.class */
public class ProcedureRightClick extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureRightClick(ElementsYvanchuliandanMod instance) {
        super(instance, 898);
    }

    /* JADX WARN: Type inference failed for: r0v171, types: [net.mcreator.yvanchuliandan.procedure.ProcedureRightClick$1] */
    public static ActionResult<ItemStack> executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return new ActionResult<>(EnumActionResult.FAIL, ItemStack.field_190927_a);
        }
        if (dependencies.get("itemstack") == null) {
            return new ActionResult<>(EnumActionResult.FAIL, ItemStack.field_190927_a);
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (itemstack.func_77973_b() == new ItemStack(ItemDanYao18.block, 1).func_77973_b() && !entityPlayer.getEntityData().func_74779_i("TiZhi").equals("龙吟之体")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("非龙吟体质者，不可食用"), false);
            }
            return new ActionResult<>(EnumActionResult.FAIL, itemstack);
        } else if (itemstack.func_77973_b() == new ItemStack(ItemDanYao18.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureRightClick.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("紫阴丸计数") >= 5) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("该丹药服用过多，已无药效"), false);
            }
            return new ActionResult<>(EnumActionResult.FAIL, itemstack);
        } else {
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") != 1.0d) {
                entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", 9.0d);
                for (int index0 = 0; index0 < 10; index0++) {
                    entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1") + 1.0d);
                    if (entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1") != 18.0d && itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1")))) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("非炼气期无法服用"), false);
                        }
                        return new ActionResult<>(EnumActionResult.FAIL, itemstack);
                    }
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") != 2.0d) {
                entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", 22.0d);
                for (int index1 = 0; index1 < 8; index1++) {
                    entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1") + 1.0d);
                    if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1")))) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("非筑基期无法服用"), false);
                        }
                        return new ActionResult<>(EnumActionResult.FAIL, itemstack);
                    }
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") != 3.0d) {
                entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", 33.0d);
                for (int index2 = 0; index2 < 9; index2++) {
                    entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1") + 1.0d);
                    if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1")))) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("非结丹期无法服用"), false);
                        }
                        return new ActionResult<>(EnumActionResult.FAIL, itemstack);
                    }
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") != 4.0d) {
                entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", 45.0d);
                for (int index3 = 0; index3 < 9; index3++) {
                    entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1") + 1.0d);
                    if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1")))) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("非元婴期无法服用"), false);
                        }
                        return new ActionResult<>(EnumActionResult.FAIL, itemstack);
                    }
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") != 5.0d) {
                entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", 57.0d);
                for (int index4 = 0; index4 < 9; index4++) {
                    entityPlayer.getEntityData().func_74780_a("DanYaoNumTemp1", entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1") + 1.0d);
                    if (itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("DanYaoNumTemp1")))) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("非化神期无法服用"), false);
                        }
                        return new ActionResult<>(EnumActionResult.FAIL, itemstack);
                    }
                }
            }
            if ((itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_9") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_22") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_33") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_45") || itemstack.func_77973_b().getRegistryName().toString().contains("yvanchuliandan:dan_yao_57")) && entityPlayer.getEntityData().func_74769_h("Base") >= entityPlayer.getEntityData().func_74769_h("BaseMax")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("真元已满无法服用"), false);
                }
                return new ActionResult<>(EnumActionResult.FAIL, itemstack);
            }
            return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
        }
    }
}
