package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan05;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan12;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan13;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan14;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureDanHuoSumDown.class */
public class ProcedureDanHuoSumDown extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDanHuoSumDown(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 326);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("练气期无法生成丹火"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            if (entityPlayer.getEntityData().func_74769_h("Power") >= 224.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn = new EntityItem(world, x, y + 1, z, new ItemStack(ItemHuoyan12.block, 1));
                    entityToSpawn.func_174867_a(10);
                    world.func_72838_d(entityToSpawn);
                }
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 224.0d);
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("灵力不足224，无法生成丹火"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            if (entityPlayer.getEntityData().func_74769_h("Power") >= 576.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn2 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemHuoyan13.block, 1));
                    entityToSpawn2.func_174867_a(10);
                    world.func_72838_d(entityToSpawn2);
                }
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 576.0d);
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("灵力不足576，无法生成丹火"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            if (entityPlayer.getEntityData().func_74769_h("Power") >= 1440.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn3 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemHuoyan14.block, 1));
                    entityToSpawn3.func_174867_a(10);
                    world.func_72838_d(entityToSpawn3);
                }
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1440.0d);
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("灵力不足1440，无法生成丹火"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            if (entityPlayer.getEntityData().func_74769_h("Power") >= 4320.0d) {
                if (!world.field_72995_K) {
                    EntityItem entityToSpawn4 = new EntityItem(world, x, y + 1, z, new ItemStack(ItemHuoyan05.block, 1));
                    entityToSpawn4.func_174867_a(10);
                    world.func_72838_d(entityToSpawn4);
                }
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 4320.0d);
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("灵力不足4320，无法生成丹火"), false);
            }
        }
    }
}
