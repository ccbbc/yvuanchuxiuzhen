package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCuiLianTips.class */
public class ProcedureCuiLianTips extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCuiLianTips(ElementsFabaokuozhanMod instance) {
        super(instance, 561);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("-- -- -- -- -- -- 淬炼说明 -- -- -- -- -- --"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("一个法宝在一个阶段只能淬炼一次,并且需要选择淬炼威能还是普攻"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("例:一个筑基法器可以使用二级淬炼材料进行淬炼,淬炼后需要三级淬炼材料才能进行下一次淬炼"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("注意:淬炼需要按级进行淬炼,所有法宝都需要从第二级材料开始淬炼,不可以淬炼二级后直接淬炼四级(没有一级材料所以一个法宝最多淬炼4次)"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("法宝淬炼后增益属性取决于法宝的主要属性,比如物攻法宝就会增益物伤"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("部分法宝不可淬炼比如霹雳弹,将法宝放置于主手后再放入炼器鼎尝试淬炼,如果提示不支持则该法宝无法淬炼"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("部分法宝不可淬炼比如霹雳弹,将法宝放置于主手后再放入炼器鼎尝试淬炼,如果提示不支持则该法宝无法淬炼"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§b关于淬炼材料获取,再器格内放入法宝,物格空置,点击淬炼会提示法宝当前阶段需要什么材料淬炼"), false);
        }
        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("-- -- -- -- -- -- 淬炼说明 -- -- -- -- -- --"), false);
        }
    }
}
