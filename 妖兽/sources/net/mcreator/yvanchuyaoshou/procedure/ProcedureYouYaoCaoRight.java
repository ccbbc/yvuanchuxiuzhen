package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.block.BlockYouYaoCao;
import net.mcreator.yvanchuyaoshou.block.BlockYouYaoCao2;
import net.mcreator.yvanchuyaoshou.block.BlockYouYaoCao3;
import net.mcreator.yvanchuyaoshou.item.ItemYouYaoCao2Item;
import net.mcreator.yvanchuyaoshou.item.ItemYouYaoCao3Item;
import net.mcreator.yvanchuyaoshou.item.ItemYouYaoCaoItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYouYaoCaoRight.class */
public class ProcedureYouYaoCaoRight extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYouYaoCaoRight(ElementsYvanchuyaoshouMod instance) {
        super(instance, 357);
    }

    /* JADX WARN: Type inference failed for: r0v143, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYouYaoCaoRight$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("plains")) && new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYouYaoCaoRight.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("群系检测") == 114) {
            entityLivingBase.getEntityData().func_74757_a("群系检测", true);
        }
        if ((world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150346_d.func_176203_a(0).func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150349_c.func_176223_P().func_177230_c()) && world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemYouYaoCaoItem.block, 1).func_77973_b()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemYouYaoCaoItem.block, 1).func_77973_b()) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemYouYaoCao2Item.block, 1).func_77973_b()) {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemYouYaoCao2Item.block, 1).func_77973_b()) {
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemYouYaoCao3Item.block, 1).func_77973_b()) {
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() != new ItemStack(ItemYouYaoCao3Item.block, 1).func_77973_b()) {
                                    return;
                                }
                            }
                            world.func_180501_a(new BlockPos(x, y + 1, z), BlockYouYaoCao3.block.func_176223_P(), 3);
                            if (entityLivingBase instanceof EntityPlayer) {
                                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(new ItemStack(ItemYouYaoCao3Item.block, 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                                return;
                            }
                            return;
                        }
                    }
                    if (!((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuxiuzhen:shengtai1"))) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockYouYaoCao2.block.func_176223_P(), 3);
                        if (entityLivingBase instanceof EntityPlayer) {
                            ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(new ItemStack(ItemYouYaoCao2Item.block, 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                            return;
                        }
                        return;
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§c此草无法引诱此间妖兽，不如试试更高品质的？"), false);
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (!((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuxiuzhen:weimian0101")) && !((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuxiuzhen:weimian0102")) && !((ResourceLocation) Biome.field_185377_q.func_177774_c(world.func_180494_b(new BlockPos(x, y, z)))).equals(new ResourceLocation("yvanchuxiuzhen:shengtai1"))) {
                world.func_180501_a(new BlockPos(x, y + 1, z), BlockYouYaoCao.block.func_176223_P(), 3);
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(new ItemStack(ItemYouYaoCaoItem.block, 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
            } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("§c此草无法引诱此间妖兽，不如试试更高品质的？"), false);
            }
        }
    }
}
