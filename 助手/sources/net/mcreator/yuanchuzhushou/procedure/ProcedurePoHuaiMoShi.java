package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedurePoHuaiMoShi.class */
public class ProcedurePoHuaiMoShi extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedurePoHuaiMoShi(ElementsYuanchuzhushouMod instance) {
        super(instance, 53);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yuanchuzhushou.procedure.ProcedurePoHuaiMoShi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedurePoHuaiMoShi.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("RiskFunction") == 1) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("破坏模式")) {
                    ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    _stack.func_77978_p().func_74757_a("破坏模式", false);
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已关闭破坏模式"), false);
                        return;
                    }
                    return;
                }
            }
            ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
            if (!_stack2.func_77942_o()) {
                _stack2.func_77982_d(new NBTTagCompound());
            }
            _stack2.func_77978_p().func_74757_a("破坏模式", true);
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("----------------------"), false);
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已开启破坏模式"), false);
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("使用说明:主手持有助手,副手持有一种方块,然后蹲下右键,将助手探测方块设置为你副手方块,将副手方块取下来,主手依旧持有助手对着方块右键会大范围破坏目标方向方块并保留设定的方块,你可以副手持有[木棍]然后蹲下右键将助手切换为正常模式"), false);
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§c注意你如果不关闭助手的破坏模式那么你将无法使用助手的其他功能"), false);
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§4Tips:你可以副手持有[骨头]然后蹲下右键可开启/关闭方块掉落模式,过量的方块这会导致你的客户端/服务端造成卡顿！！！"), false);
            }
        } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("红色按钮已被禁用,如想启用请将配置文件中RiskFunction的属性设置为true"), false);
        }
    }
}
