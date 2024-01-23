package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.block.BlockFangkuai107;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity14;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu03;
import net.mcreator.yvanchuyaoshou.item.ItemYaodan0203;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedurePlayerRightClick.class */
public class ProcedurePlayerRightClick extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayerRightClick(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu03.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityCaientity14.EntityCustom entityCustom;
        EntityCaientity14.EntityCustom entityCustom2;
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemYaodan0203.block, 1).func_77973_b()) {
            if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 2, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y, z - 1)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y, z + 1)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 1, z - 2)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 1, z + 2)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 2, z - 2)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 2, z + 2)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c()) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.VILLAGER_HAPPY, x + 0.5d, y, z + 0.5d, 20, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                if (!((World) worldServer).field_72995_K && (entityCustom2 = new EntityCaientity14.EntityCustom(worldServer)) != null) {
                    entityCustom2.func_70012_b(x + 0.5d, y, z + 0.5d, ((World) worldServer).field_73012_v.nextFloat() * 360.0f, 0.0f);
                    worldServer.func_72838_d(entityCustom2);
                }
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                worldServer.func_175698_g(new BlockPos(x, y, z));
                worldServer.func_175698_g(new BlockPos(x, y - 1, z));
                worldServer.func_175698_g(new BlockPos(x, y - 2, z));
                worldServer.func_175698_g(new BlockPos(x, y, z - 1));
                worldServer.func_175698_g(new BlockPos(x, y, z + 1));
                worldServer.func_175698_g(new BlockPos(x, y - 1, z - 2));
                worldServer.func_175698_g(new BlockPos(x, y - 1, z + 2));
                worldServer.func_175698_g(new BlockPos(x, y - 2, z - 2));
                worldServer.func_175698_g(new BlockPos(x, y - 2, z + 2));
            } else if (worldServer.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x, y - 2, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 1, y, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 1, y, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y - 1, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y - 1, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x - 2, y - 2, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos(x + 2, y - 2, z)).func_177230_c() == BlockFangkuai107.block.func_176223_P().func_177230_c()) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.VILLAGER_HAPPY, x + 0.5d, y, z + 0.5d, 20, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                if (!((World) worldServer).field_72995_K && (entityCustom = new EntityCaientity14.EntityCustom(worldServer)) != null) {
                    entityCustom.func_70012_b(x + 0.5d, y, z + 0.5d, ((World) worldServer).field_73012_v.nextFloat() * 360.0f, 0.0f);
                    worldServer.func_72838_d(entityCustom);
                }
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                worldServer.func_175698_g(new BlockPos(x, y, z));
                worldServer.func_175698_g(new BlockPos(x, y - 1, z));
                worldServer.func_175698_g(new BlockPos(x, y - 2, z));
                worldServer.func_175698_g(new BlockPos(x - 1, y, z));
                worldServer.func_175698_g(new BlockPos(x + 1, y, z));
                worldServer.func_175698_g(new BlockPos(x - 2, y - 1, z));
                worldServer.func_175698_g(new BlockPos(x + 2, y - 1, z));
                worldServer.func_175698_g(new BlockPos(x - 2, y - 2, z));
                worldServer.func_175698_g(new BlockPos(x + 2, y - 2, z));
            }
        }
    }

    @SubscribeEvent
    public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Object entity = event.getEntityPlayer();
        int i = event.getPos().func_177958_n();
        int j = event.getPos().func_177956_o();
        int k = event.getPos().func_177952_p();
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
