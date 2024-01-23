package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.world.Teleporter;
import net.minecraftforge.common.DimensionManager;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureTransferTokenUse.class */
public class ProcedureTransferTokenUse extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTransferTokenUse(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 584);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayerMP entityPlayerMP = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (((Entity) entityPlayerMP).field_71093_bK == 0) {
            if (!((Entity) entityPlayerMP).field_70170_p.field_72995_K && !entityPlayerMP.func_184218_aH() && !entityPlayerMP.func_184207_aI() && (entityPlayerMP instanceof EntityPlayerMP)) {
                EntityPlayerMP _player = entityPlayerMP;
                _player.field_71133_b.func_184103_al().transferPlayerToDimension(_player, -1, new Teleporter(_player.func_71121_q()) { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureTransferTokenUse.1TeleporterDirect
                    public void func_180266_a(Entity entity, float yawrotation) {
                    }

                    public boolean func_180620_b(Entity entity, float yawrotation) {
                        return true;
                    }

                    public boolean func_85188_a(Entity entity) {
                        return true;
                    }
                });
                _player.field_71135_a.func_147364_a(DimensionManager.getWorld(-1).func_175694_M().func_177958_n(), DimensionManager.getWorld(-1).func_175694_M().func_177956_o() + 1, DimensionManager.getWorld(-1).func_175694_M().func_177952_p(), _player.field_70177_z, _player.field_70125_A);
            }
        } else if (!((Entity) entityPlayerMP).field_70170_p.field_72995_K && !entityPlayerMP.func_184218_aH() && !entityPlayerMP.func_184207_aI() && (entityPlayerMP instanceof EntityPlayerMP)) {
            EntityPlayerMP _player2 = entityPlayerMP;
            _player2.field_71133_b.func_184103_al().transferPlayerToDimension(_player2, 0, new Teleporter(_player2.func_71121_q()) { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureTransferTokenUse.2TeleporterDirect
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
        itemstack.func_190918_g(1);
        if (entityPlayerMP instanceof EntityPlayer) {
            ((EntityPlayer) entityPlayerMP).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 100);
        }
    }
}
