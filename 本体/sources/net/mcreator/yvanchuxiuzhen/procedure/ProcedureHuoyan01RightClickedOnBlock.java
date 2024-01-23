package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenModVariables;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock01;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock02;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock03;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock04;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock05;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock06;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock07;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock08;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock09;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock11;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock12;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock13;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock14;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock15;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock16;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock17;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock18;
import net.mcreator.yvanchuxiuzhen.block.BlockHuoyanblock19;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan01;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan02;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan03;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan04;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan05;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan06;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan07;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan08;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan09;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan11;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan12;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan13;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan14;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan15;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan16;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan17;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan18;
import net.mcreator.yvanchuxiuzhen.item.ItemHuoyan19;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyan01RightClickedOnBlock.class */
public class ProcedureHuoyan01RightClickedOnBlock extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyan01RightClickedOnBlock(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 133);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("direction") == null || dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EnumFacing direction = (EnumFacing) dependencies.get("direction");
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (direction == EnumFacing.UP && world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() && entityPlayer.func_70093_af()) {
            if (entityPlayer.getEntityData().func_74769_h("功法被动2") == 1.0d) {
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan01.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock01.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack = new ItemStack(BlockHuoyanblock01.block, 1);
                        _setstack.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan02.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock02.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack2 = new ItemStack(BlockHuoyanblock02.block, 1);
                        _setstack2.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack2);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan03.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock03.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack3 = new ItemStack(BlockHuoyanblock03.block, 1);
                        _setstack3.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack3);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan04.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock04.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack4 = new ItemStack(BlockHuoyanblock04.block, 1);
                        _setstack4.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack4);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan05.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock05.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack5 = new ItemStack(BlockHuoyanblock05.block, 1);
                        _setstack5.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack5);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan06.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock06.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack6 = new ItemStack(BlockHuoyanblock06.block, 1);
                        _setstack6.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack6);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan07.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock07.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack7 = new ItemStack(BlockHuoyanblock07.block, 1);
                        _setstack7.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack7);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan08.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock08.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack8 = new ItemStack(BlockHuoyanblock08.block, 1);
                        _setstack8.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack8);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan09.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock09.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack9 = new ItemStack(BlockHuoyanblock09.block, 1);
                        _setstack9.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack9);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan11.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock11.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack10 = new ItemStack(BlockHuoyanblock11.block, 1);
                        _setstack10.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack10);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan12.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock12.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack11 = new ItemStack(BlockHuoyanblock12.block, 1);
                        _setstack11.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack11);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan13.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock13.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack12 = new ItemStack(BlockHuoyanblock13.block, 1);
                        _setstack12.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack12);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan14.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock14.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack13 = new ItemStack(BlockHuoyanblock14.block, 1);
                        _setstack13.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack13);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan15.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock15.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack14 = new ItemStack(BlockHuoyanblock15.block, 1);
                        _setstack14.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack14);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan16.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock16.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack15 = new ItemStack(BlockHuoyanblock16.block, 1);
                        _setstack15.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack15);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan17.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock17.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack16 = new ItemStack(BlockHuoyanblock17.block, 1);
                        _setstack16.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack16);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan18.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock18.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack17 = new ItemStack(BlockHuoyanblock18.block, 1);
                        _setstack17.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack17);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemHuoyan19.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock19.block.func_176223_P(), 3);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire && (entityPlayer instanceof EntityPlayer)) {
                        ItemStack _setstack18 = new ItemStack(BlockHuoyanblock19.block, 1);
                        _setstack18.func_190920_e(1);
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack18);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
            } else {
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 32.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan01.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock01.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 32.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack19 = new ItemStack(BlockHuoyanblock01.block, 1);
                            _setstack19.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack19);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 32.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 30.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan01.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足30点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 64.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan02.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock02.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 64.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack20 = new ItemStack(BlockHuoyanblock02.block, 1);
                            _setstack20.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack20);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 64.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 110.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan02.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足110点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 192.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan03.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock03.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 192.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack21 = new ItemStack(BlockHuoyanblock03.block, 1);
                            _setstack21.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack21);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 192.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 350.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan03.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足350点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 576.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan04.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock04.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 576.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack22 = new ItemStack(BlockHuoyanblock04.block, 1);
                            _setstack22.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack22);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 576.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 1070.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan04.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足1070点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 2074.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan05.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock05.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 2074.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack23 = new ItemStack(BlockHuoyanblock05.block, 1);
                            _setstack23.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack23);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 2074.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 640.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan06.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock06.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 640.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack24 = new ItemStack(BlockHuoyanblock06.block, 1);
                            _setstack24.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack24);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 640.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 640.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan06.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足640点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 1280.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan07.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock07.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1280.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack25 = new ItemStack(BlockHuoyanblock07.block, 1);
                            _setstack25.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack25);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1280.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 1280.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan07.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足1280点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 2560.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan08.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock08.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 2560.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack26 = new ItemStack(BlockHuoyanblock08.block, 1);
                            _setstack26.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack26);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 2560.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 2560.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan08.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足2560点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 5120.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan09.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock09.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 5120.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack27 = new ItemStack(BlockHuoyanblock09.block, 1);
                            _setstack27.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack27);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 5120.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 5120.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan09.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足5120点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 64.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan11.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock11.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 64.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack28 = new ItemStack(BlockHuoyanblock11.block, 1);
                            _setstack28.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack28);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 64.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 115.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan12.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock12.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 115.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack29 = new ItemStack(BlockHuoyanblock12.block, 1);
                            _setstack29.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack29);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 115.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 307.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan13.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock13.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 307.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack30 = new ItemStack(BlockHuoyanblock13.block, 1);
                            _setstack30.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack30);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 307.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 806.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan14.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock14.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 806.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack31 = new ItemStack(BlockHuoyanblock14.block, 1);
                            _setstack31.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack31);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 806.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 1728.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan15.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock15.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1728.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack32 = new ItemStack(BlockHuoyanblock15.block, 1);
                            _setstack32.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack32);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1728.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 3230.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan15.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足320点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 640.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan16.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock16.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 640.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack33 = new ItemStack(BlockHuoyanblock16.block, 1);
                            _setstack33.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack33);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 640.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 640.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan16.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足640点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 1280.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan17.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock17.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1280.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack34 = new ItemStack(BlockHuoyanblock17.block, 1);
                            _setstack34.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack34);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 1280.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 1280.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan17.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足1280点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 2560.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan18.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock18.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 2560.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack35 = new ItemStack(BlockHuoyanblock18.block, 1);
                            _setstack35.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack35);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 2560.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 2560.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan18.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足2560点，无法释放火焰"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= 5120.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan19.block, 1).func_77973_b()) {
                    if (!YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        world.func_180501_a(new BlockPos(x, y + 1, z), BlockHuoyanblock19.block.func_176223_P(), 3);
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 5120.0d);
                    } else if (YvanchuxiuzhenModVariables.MapVariables.get(world).firefirefire) {
                        if (entityPlayer instanceof EntityPlayer) {
                            ItemStack _setstack36 = new ItemStack(BlockHuoyanblock19.block, 1);
                            _setstack36.func_190920_e(1);
                            ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack36);
                        }
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 5120.0d);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 200);
                    }
                } else if (entityPlayer.getEntityData().func_74769_h("Power") < 5120.0d && itemstack.func_77973_b() == new ItemStack(ItemHuoyan19.block, 1).func_77973_b() && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("灵力不足5120点，无法释放火焰"), false);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y + 1, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74778_a("name", entityPlayer.func_145748_c_().func_150260_c());
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (itemstack.func_96631_a(1, new Random(), (EntityPlayerMP) null)) {
                itemstack.func_190918_g(1);
                itemstack.func_77964_b(0);
            }
        }
    }
}
