package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFa30RightClickDoing.class */
public class ProcedureGongFa30RightClickDoing extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFa30RightClickDoing(ElementsYvanchujiguanMod instance) {
        super(instance, 134);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (entityPlayer.func_70093_af()) {
            return;
        }
        if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("b") : "").equals("")) {
            if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("a") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
                if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("b") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("非此物主人，勿要触碰。"), false);
                        return;
                    }
                    return;
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("GongFa30") != 0.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修炼功法已切换至 " + itemstack.func_82833_r()), false);
                }
                entityPlayer.getEntityData().func_74780_a("GongFa", 30.0d);
                entityPlayer.getEntityData().func_74778_a("GongFaShow", "双剑九龙诀");
                entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
                return;
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("经转世轮回，已物是人非，前世痕迹已尽散除"), false);
                return;
            } else {
                return;
            }
        }
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("a") : "").equals("")) {
            if (!entityPlayer.func_70093_af()) {
                if (entityPlayer.getEntityData().func_74779_i("DaoLv").equals("") && entityPlayer.getEntityData().func_74769_h("GongFa30") != 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("GongFa", 30.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa30", 1.0d);
                    entityPlayer.getEntityData().func_74778_a("GongFaShow", "双剑九龙诀");
                    entityPlayer.getEntityData().func_74778_a("GongFaShow15", "双剑九龙诀");
                    if (!itemstack.func_77942_o()) {
                        itemstack.func_77982_d(new NBTTagCompound());
                    }
                    itemstack.func_77978_p().func_74778_a("a", entityPlayer.func_145748_c_().func_150260_c());
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("已学习" + itemstack.func_82833_r() + "§f需要寻求伴侣并一起打坐研习才能掌握功法。"), false);
                    }
                    entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
                    return;
                } else if (entityPlayer.getEntityData().func_74769_h("GongFaCut") == 0.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("该功法与你已修习的功法有冲突"), false);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("a") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
            if (entityPlayer.getEntityData().func_74779_i("GongFaShow").equals("")) {
                if (!entityPlayer.func_70093_af()) {
                    if (entityPlayer.getEntityData().func_74779_i("DaoLv").equals("")) {
                        entityPlayer.getEntityData().func_74780_a("GongFa", 30.0d);
                        entityPlayer.getEntityData().func_74780_a("GongFa30", 1.0d);
                        entityPlayer.getEntityData().func_74778_a("GongFaShow", "阴阳合欢功");
                        entityPlayer.getEntityData().func_74778_a("DaoLv", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("a") : "");
                        if (!itemstack.func_77942_o()) {
                            itemstack.func_77982_d(new NBTTagCompound());
                        }
                        itemstack.func_77978_p().func_74778_a("b", entityPlayer.func_145748_c_().func_150260_c());
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("已学习" + itemstack.func_82833_r() + "§f需要寻求伴侣并一起打坐研习才能掌握功法。"), false);
                        }
                        if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                            ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureGongFa30RightClickDoing.1
                                public String func_70005_c_() {
                                    return "";
                                }

                                public boolean func_70003_b(int permission, String command) {
                                    return true;
                                }

                                public World func_130014_f_() {
                                    return entityPlayer.field_70170_p;
                                }

                                public MinecraftServer func_184102_h() {
                                    return entityPlayer.field_70170_p.func_73046_m();
                                }

                                public boolean func_174792_t_() {
                                    return false;
                                }

                                public BlockPos func_180425_c() {
                                    return entityPlayer.func_180425_c();
                                }

                                public Vec3d func_174791_d() {
                                    return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                                }

                                public Entity func_174793_f() {
                                    return entityPlayer;
                                }
                            }, "execute " + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("a") : "") + " ~ ~ ~ wifigongfa daolvshezhi " + entityPlayer.func_145748_c_().func_150260_c());
                        }
                        entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
                    } else if (entityPlayer.getEntityData().func_74769_h("GongFaCut") == 0.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("该功法与你已修习的功法有冲突"), false);
                    }
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("你已经有所学的主修功法了，请先散功后再学习"), false);
            }
        }
    }
}
