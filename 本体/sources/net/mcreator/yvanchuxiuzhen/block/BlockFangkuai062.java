package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFangkuai062EntityWalksOnTheBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai062.class */
public class BlockFangkuai062 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fangkuai062")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockFangkuai062(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 17);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai062");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:fangkuai062", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai062$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("fangkuai062");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 1);
            func_149711_c(10.0f);
            func_149752_b(50.0f);
            func_149715_a(0.0f);
            func_149713_g(255);
            func_149647_a(TabFenlei01.tab);
        }

        public void func_176199_a(World world, BlockPos pos, Entity entity) {
            super.func_176199_a(world, pos, entity);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockFangkuai062.$_dependencies.put("entity", entity);
            BlockFangkuai062.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai062.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai062.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai062.$_dependencies.put("world", world);
            ProcedureFangkuai062EntityWalksOnTheBlock.executeProcedure(BlockFangkuai062.$_dependencies);
        }
    }
}
