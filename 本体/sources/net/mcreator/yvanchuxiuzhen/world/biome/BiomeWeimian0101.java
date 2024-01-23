package net.mcreator.yvanchuxiuzhen.world.biome;

import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.entity.EntityYouhun;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/biome/BiomeWeimian0101.class */
public class BiomeWeimian0101 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:weimian0101")
    public static final BiomeGenCustom biome = null;

    public BiomeWeimian0101(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 181);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.biomes.add(() -> {
            return new BiomeGenCustom();
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void init(FMLInitializationEvent event) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/biome/BiomeWeimian0101$BiomeGenCustom.class */
    public static class BiomeGenCustom extends Biome {
        public BiomeGenCustom() {
            super(new Biome.BiomeProperties("阎罗地狱").func_185395_b(0.0f).func_185398_c(0.1f).func_185402_a(-11908534).func_185400_d(0.02f).func_185410_a(0.0f));
            setRegistryName("weimian0101");
            this.field_76752_A = Blocks.field_150425_aM.func_176223_P();
            this.field_76753_B = Blocks.field_150425_aM.func_176223_P();
            this.field_76760_I.field_76832_z = 0;
            this.field_76760_I.field_76802_A = 4;
            this.field_76760_I.field_76803_B = 4;
            this.field_76760_I.field_76798_D = 0;
            this.field_76760_I.field_76807_J = 0;
            this.field_76760_I.field_76799_E = 0;
            this.field_76760_I.field_76800_F = 0;
            this.field_76760_I.field_76805_H = 0;
            this.field_76760_I.field_76801_G = 0;
            this.field_76761_J.clear();
            this.field_76762_K.clear();
            this.field_76755_L.clear();
            this.field_82914_M.clear();
            this.field_76762_K.add(new Biome.SpawnListEntry(EntityYouhun.EntityCustom.class, 15, 1, 15));
        }

        @SideOnly(Side.CLIENT)
        public int func_180627_b(BlockPos pos) {
            return -16448251;
        }

        @SideOnly(Side.CLIENT)
        public int func_180625_c(BlockPos pos) {
            return -16448251;
        }

        @SideOnly(Side.CLIENT)
        public int func_76731_a(float currentTemperature) {
            return -15330543;
        }

        public WorldGenAbstractTree func_150567_a(Random rand) {
            return super.func_150567_a(rand);
        }
    }
}
