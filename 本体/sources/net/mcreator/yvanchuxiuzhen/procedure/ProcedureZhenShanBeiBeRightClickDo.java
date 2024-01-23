package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemSectToken1;
import net.mcreator.yvanchuxiuzhen.item.ItemSectToken2;
import net.mcreator.yvanchuxiuzhen.item.ItemSectToken3;
import net.mcreator.yvanchuxiuzhen.item.ItemSectToken4;
import net.mcreator.yvanchuxiuzhen.item.ItemSectToken5;
import net.mcreator.yvanchuxiuzhen.item.ItemSectToken6;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhenShanBeiBeRightClickDo.class */
public class ProcedureZhenShanBeiBeRightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhenShanBeiBeRightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 525);
    }

    /* JADX WARN: Type inference failed for: r0v143, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo$1] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo$2] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo$3] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo$5] */
    /* JADX WARN: Type inference failed for: r1v22, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo$4] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        String SectMaster = "";
        boolean Close = false;
        boolean BreakFor = false;
        InventoryPlayer inventoryPlayer = entityPlayer.field_71071_by;
        for (int slotIndex = 0; slotIndex < inventoryPlayer.func_70302_i_(); slotIndex++) {
            try {
                ItemStack itemstackiterator = inventoryPlayer.func_70301_a(slotIndex);
                if (!itemstackiterator.func_190926_b()) {
                    if ((itemstackiterator.func_77973_b() == new ItemStack(ItemSectToken1.block, 1).func_77973_b() || itemstackiterator.func_77973_b() == new ItemStack(ItemSectToken2.block, 1).func_77973_b() || itemstackiterator.func_77973_b() == new ItemStack(ItemSectToken3.block, 1).func_77973_b() || itemstackiterator.func_77973_b() == new ItemStack(ItemSectToken4.block, 1).func_77973_b() || itemstackiterator.func_77973_b() == new ItemStack(ItemSectToken5.block, 1).func_77973_b() || itemstackiterator.func_77973_b() == new ItemStack(ItemSectToken6.block, 1).func_77973_b()) && !BreakFor) {
                        if ((itemstackiterator.func_77942_o() ? itemstackiterator.func_77978_p().func_74779_i("Master") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
                            String func_74779_i = itemstackiterator.func_77942_o() ? itemstackiterator.func_77978_p().func_74779_i("Master") : "";
                            SectMaster = itemstackiterator.func_77942_o() ? itemstackiterator.func_77978_p().func_74779_i("SectMaster") : "";
                            double func_74769_h = itemstackiterator.func_77942_o() ? itemstackiterator.func_77978_p().func_74769_h("SectLevel") : -1.0d;
                            double func_74769_h2 = itemstackiterator.func_77942_o() ? itemstackiterator.func_77978_p().func_74769_h("SectJobLevel") : -1.0d;
                            BreakFor = true;
                            Close = false;
                        } else if (!BreakFor) {
                            Close = true;
                        }
                    } else if (!BreakFor) {
                        Close = true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") > 0.0d) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_71053_j();
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c§l已入散仙"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("SectJobLevel") > 0.0d && !new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJob6").equals(SectMaster)) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_71053_j();
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c§l非汝之宗门"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo.2
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "Open")) {
            entityPlayer.getEntityData().func_74757_a("OpenZSBGui", true);
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_71053_j();
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c§l已有人使用"), false);
            }
        } else if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo.3
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJob6").equals("") && entityPlayer.getEntityData().func_74769_h("SectJobLevel") < 3.0d) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_71053_j();
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c§l权限不足"), false);
            }
        } else if (Close) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_71053_j();
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c§l未有你的宗门令牌"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_71053_j();
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c§l境界不足，无法激活镇山碑"), false);
            }
        } else if (!SectMaster.equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo.4
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJob6")) && !new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiBeRightClickDo.5
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJob6").equals("")) {
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_71053_j();
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c§l非汝之宗门"), false);
            }
        } else {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74757_a("Open", true);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureSectJobUpdate.executeProcedure($_dependencies);
        }
    }
}
