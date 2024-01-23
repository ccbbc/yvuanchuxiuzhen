package net.mcreator.fabaokuozhan.procedure;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureJinGuBang2.class */
public class ProcedureJinGuBang2 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJinGuBang2(ElementsFabaokuozhanMod instance) {
        super(instance, 426);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [net.mcreator.fabaokuozhan.procedure.ProcedureJinGuBang2$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase2 = (Entity) dependencies.get("sourceentity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityLivingBase2.getEntityData().func_74769_h("金箍棒威能") <= 0.0d) {
            entityLivingBase2.getEntityData().func_74780_a("Power", entityLivingBase2.getEntityData().func_74769_h("Power") - 125.0d);
            return;
        }
        if (entityLivingBase2 instanceof EntityLivingBase) {
            entityLivingBase2.func_70691_i((float) (((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) - (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f)) * 0.01d));
        }
        if (Math.random() <= 0.75d) {
            List<Entity> _entfound = (List) world.func_175647_a(Entity.class, new AxisAlignedBB(x - 5.0d, y - 5.0d, z - 5.0d, x + 5.0d, y + 5.0d, z + 5.0d), (Predicate) null).stream().sorted(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureJinGuBang2.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparing(_entcnd -> {
                        return Double.valueOf(_entcnd.func_70092_e(_x, _y, _z));
                    });
                }
            }.compareDistOf(x, y, z)).collect(Collectors.toList());
            for (Entity entityiterator : _entfound) {
                if (!entityiterator.func_145748_c_().func_150260_c().equals(entityLivingBase2.func_145748_c_().func_150260_c())) {
                    entityiterator.getEntityData().func_74757_a("金箍棒连击", true);
                }
            }
        }
    }
}
