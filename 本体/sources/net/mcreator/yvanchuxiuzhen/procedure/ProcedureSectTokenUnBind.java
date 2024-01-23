package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionSectBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumHand;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectTokenUnBind.class */
public class ProcedureSectTokenUnBind extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectTokenUnBind(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 527);
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectTokenUnBind$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        Calendar cal = Calendar.getInstance();
        if (entityLivingBase.getEntityData().func_74769_h("SectLevel") != 0.0d) {
            String ItemIdTemp = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString();
            if (entityLivingBase instanceof EntityLivingBase) {
                ItemStack _setstack = new ItemStack(Item.func_111206_d(ItemIdTemp), 1);
                _setstack.func_190920_e(1);
                entityLivingBase.func_184611_a(EnumHand.MAIN_HAND, _setstack);
                if (entityLivingBase instanceof EntityPlayerMP) {
                    ((EntityPlayerMP) entityLivingBase).field_71071_by.func_70296_d();
                }
            }
            entityLivingBase.getEntityData().func_74780_a("SectLevel", 0.0d);
            entityLivingBase.getEntityData().func_74778_a("SxlGuiTip", "§2§l解绑成功");
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_184589_d(PotionSectBuff.potion);
            }
            ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
            if (!_stack.func_77942_o()) {
                _stack.func_77982_d(new NBTTagCompound());
            }
            _stack.func_77978_p().func_74757_a("SectJobGetCool", true);
            ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
            if (!_stack2.func_77942_o()) {
                _stack2.func_77982_d(new NBTTagCompound());
            }
            _stack2.func_77978_p().func_74780_a("SectJobGetCoolTime", cal.get(5));
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectTokenUnBind.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("SectJobUn") == 1) {
                ItemStack _stack3 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74757_a("SectJobGetCool", false);
                if (entityLivingBase instanceof EntityPlayer) {
                    Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("SectJobUn");
                    if (_so == null) {
                        _so = _sc.func_96535_a("SectJobUn", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                    _scr.func_96647_c(0);
                    return;
                }
                return;
            }
            return;
        }
        entityLivingBase.getEntityData().func_74778_a("SxlGuiTip", "§4§l尚未绑定");
    }
}
