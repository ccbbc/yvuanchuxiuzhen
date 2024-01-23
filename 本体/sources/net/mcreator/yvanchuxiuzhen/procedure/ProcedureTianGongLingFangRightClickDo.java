package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.world.WorldWeimian02;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Teleporter;
import net.minecraftforge.common.DimensionManager;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureTianGongLingFangRightClickDo.class */
public class ProcedureTianGongLingFangRightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTianGongLingFangRightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 476);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((entityPlayerMP.getEntityData().func_74769_h("Power") >= 3456.0d && entityPlayerMP.getEntityData().func_74769_h("JingJieNum") >= 5.0d) || (((entityPlayerMP instanceof EntityPlayer) && ((EntityPlayer) entityPlayerMP).field_71075_bZ.field_75098_d) || entityPlayerMP.getEntityData().func_74767_n("伪令使用者1"))) {
            entityPlayerMP.getEntityData().func_74780_a("Power", entityPlayerMP.getEntityData().func_74769_h("Power") - 3456.0d);
            if (((Entity) entityPlayerMP).field_71093_bK != WorldWeimian02.DIMID) {
                if (!((Entity) entityPlayerMP).field_70170_p.field_72995_K && !entityPlayerMP.func_184218_aH() && !entityPlayerMP.func_184207_aI() && (entityPlayerMP instanceof EntityPlayerMP)) {
                    int dimensionID = WorldWeimian02.DIMID;
                    EntityPlayerMP _player = entityPlayerMP;
                    _player.field_71133_b.func_184103_al().transferPlayerToDimension(_player, dimensionID, new Teleporter(_player.func_71121_q()) { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureTianGongLingFangRightClickDo.1TeleporterDirect
                        public void func_180266_a(Entity entity, float yawrotation) {
                        }

                        public boolean func_180620_b(Entity entity, float yawrotation) {
                            return true;
                        }

                        public boolean func_85188_a(Entity entity) {
                            return true;
                        }
                    });
                    _player.field_71135_a.func_147364_a(DimensionManager.getWorld(dimensionID).func_175694_M().func_177958_n(), DimensionManager.getWorld(dimensionID).func_175694_M().func_177956_o() + 1, DimensionManager.getWorld(dimensionID).func_175694_M().func_177952_p(), _player.field_70177_z, _player.field_70125_A);
                }
                entityPlayerMP.func_70634_a(29.0d, 90.0d, 44.0d);
            } else if (((Entity) entityPlayerMP).field_71093_bK == WorldWeimian02.DIMID) {
                if (!((Entity) entityPlayerMP).field_70170_p.field_72995_K && !entityPlayerMP.func_184218_aH() && !entityPlayerMP.func_184207_aI() && (entityPlayerMP instanceof EntityPlayerMP)) {
                    EntityPlayerMP _player2 = entityPlayerMP;
                    _player2.field_71133_b.func_184103_al().transferPlayerToDimension(_player2, 0, new Teleporter(_player2.func_71121_q()) { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureTianGongLingFangRightClickDo.2TeleporterDirect
                        public void func_180266_a(Entity entity, float yawrotation) {
                        }

                        public boolean func_180620_b(Entity entity, float yawrotation) {
                            return true;
                        }

                        public boolean func_85188_a(Entity entity) {
                            return true;
                        }
                    });
                    _player2.field_71135_a.func_147364_a(DimensionManager.getWorld(0).func_175694_M().func_177958_n(), DimensionManager.getWorld(0).func_175694_M().func_177956_o() + 1, DimensionManager.getWorld(0).func_175694_M().func_177952_p(), _player2.field_70177_z, _player2.field_70125_A);
                }
                entityPlayerMP.func_70634_a(0.0d, 80.0d, 0.0d);
            }
            itemstack.func_190918_g(1);
        } else if (entityPlayerMP.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
            if ((entityPlayerMP instanceof EntityPlayer) && !((Entity) entityPlayerMP).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityPlayerMP).func_146105_b(new TextComponentString("当前境界未达到化神，无法使用天宫令"), false);
            }
        } else if ((entityPlayerMP instanceof EntityPlayer) && !((Entity) entityPlayerMP).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityPlayerMP).func_146105_b(new TextComponentString("灵气不足3456，无法激活天宫令进行传送"), false);
        }
    }
}
