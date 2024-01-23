package net.mcreator.fabaokuozhan.procedure;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureXueTaoMuWeiNeng.class */
public class ProcedureXueTaoMuWeiNeng extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXueTaoMuWeiNeng(ElementsFabaokuozhanMod instance) {
        super(instance, 527);
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [net.mcreator.fabaokuozhan.procedure.ProcedureXueTaoMuWeiNeng$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("境界") : -1.0d)) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("境界不足以使用"), false);
                return;
            }
            return;
        }
        if (entityPlayer.getEntityData().func_74769_h("Power") >= (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d)) {
            List<Entity> _entfound = (List) worldServer.func_175647_a(Entity.class, new AxisAlignedBB(x - 6.0d, y - 6.0d, z - 6.0d, x + 6.0d, y + 6.0d, z + 6.0d), (Predicate) null).stream().sorted(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureXueTaoMuWeiNeng.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparing(_entcnd -> {
                        return Double.valueOf(_entcnd.func_70092_e(_x, _y, _z));
                    });
                }
            }.compareDistOf(x, y, z)).collect(Collectors.toList());
            for (Entity entityiterator : _entfound) {
                if (!entityPlayer.func_145748_c_().func_150260_c().equals(entityiterator.func_145748_c_().func_150260_c()) && !(entityPlayer instanceof EntityItem)) {
                    entityiterator.getEntityData().func_74780_a("BeMagicAttack", entityPlayer.getEntityData().func_74769_h("BeMagicAttack") + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("淬炼威能") : -1.0d) + (entityPlayer.getEntityData().func_74769_h("MagicAttack") * 1.5d));
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.FLAME, entityiterator.field_70165_t, entityiterator.field_70163_u + 2.1d, entityiterator.field_70161_v, 15, 0.2d, 0.0d, 0.2d, 0.0d, new int[0]);
                    }
                }
            }
            entityPlayer.getEntityData().func_74780_a("Base", entityPlayer.getEntityData().func_74769_h("Base") + 2.0d);
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d));
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 20);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("灵力不足以使用"), false);
        }
    }
}
