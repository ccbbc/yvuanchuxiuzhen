package net.mcreator.yvanchuxiuzhen.world;

import com.google.common.cache.LoadingCache;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.block.BlockFangkuai001;
import net.mcreator.yvanchuxiuzhen.item.ItemWeimian02;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureWeimian02DangWanJiaJinRuWeiDuShi;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.NoiseGeneratorSimplex;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02.class */
public class WorldWeimian02 extends ElementsYvanchuxiuzhenMod.ModElement {
    public static final boolean NETHER_TYPE = false;
    public static DimensionType dtype;
    public static int DIMID = 5;
    static Map<String, Object> $_dependencies = new HashMap();
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:weimian02_portal")
    public static final BlockCustomPortal portal = null;

    public WorldWeimian02(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 26);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustomPortal();
        });
        this.elements.items.add(() -> {
            return new ItemBlock(portal).setRegistryName(portal.getRegistryName());
        });
        this.elements.items.add(() -> {
            return new ItemWeimian02().func_77655_b("weimian02").setRegistryName("weimian02");
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        if (DimensionManager.isDimensionRegistered(DIMID)) {
            DIMID = DimensionManager.getNextFreeDimId();
            System.err.println("Dimension ID for dimension weimian02 is already registered. Falling back to ID: " + DIMID);
        }
        dtype = DimensionType.register("weimian02", "_weimian02", DIMID, WorldProviderMod.class, true);
        DimensionManager.registerDimension(DIMID, dtype);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ItemWeimian02.block, 0, new ModelResourceLocation("yvanchuxiuzhen:weimian02", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02$WorldProviderMod.class */
    public static class WorldProviderMod extends WorldProvider {
        public void func_76572_b() {
            this.field_76578_c = new BiomeProviderCustom(this.field_76579_a.func_72905_C());
            this.field_76576_e = false;
        }

        public void calculateInitialWeather() {
        }

        public void updateWeather() {
        }

        public boolean canDoLightning(Chunk chunk) {
            return false;
        }

        public boolean canDoRainSnowIce(Chunk chunk) {
            return false;
        }

        public DimensionType func_186058_p() {
            return WorldWeimian02.dtype;
        }

        @SideOnly(Side.CLIENT)
        public Vec3d func_76562_b(float par1, float par2) {
            return new Vec3d(0.753000020980835d, 0.847000002861023d, 1.0d);
        }

        public IChunkGenerator func_186060_c() {
            return new ChunkProviderModded(this.field_76579_a, this.field_76579_a.func_72905_C() - WorldWeimian02.DIMID);
        }

        public boolean func_76569_d() {
            return false;
        }

        public boolean func_76567_e() {
            return false;
        }

        @SideOnly(Side.CLIENT)
        public boolean func_76568_b(int par1, int par2) {
            return false;
        }

        public WorldProvider.WorldSleepResult canSleepAt(EntityPlayer player, BlockPos pos) {
            return WorldProvider.WorldSleepResult.ALLOW;
        }

        protected void func_76556_a() {
            for (int i = 0; i <= 15; i++) {
                float f1 = 1.0f - (i / 15.0f);
                this.field_76573_f[i] = (((1.0f - f1) / ((f1 * 3.0f) + 1.0f)) * (1.0f - 0.5f)) + 0.5f;
            }
        }

        public boolean func_177500_n() {
            return false;
        }

        public void func_186061_a(EntityPlayerMP entity) {
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            WorldWeimian02.$_dependencies.put("entity", entity);
            ProcedureWeimian02DangWanJiaJinRuWeiDuShi.executeProcedure(WorldWeimian02.$_dependencies);
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02$TeleporterDimensionMod.class */
    public static class TeleporterDimensionMod extends Teleporter {
        private Vec3d lastPortalVec;
        private EnumFacing teleportDirection;

        public TeleporterDimensionMod(WorldServer worldServer, Vec3d lastPortalVec, EnumFacing teleportDirection) {
            super(worldServer);
            this.lastPortalVec = lastPortalVec;
            this.teleportDirection = teleportDirection;
        }

        public boolean func_85188_a(Entity entityIn) {
            int j11;
            int l4;
            double d0 = -1.0d;
            int j = MathHelper.func_76128_c(entityIn.field_70165_t);
            int k = MathHelper.func_76128_c(entityIn.field_70163_u);
            int l = MathHelper.func_76128_c(entityIn.field_70161_v);
            int i1 = j;
            int j1 = k;
            int k1 = l;
            int l1 = 0;
            int i2 = this.field_77187_a.nextInt(4);
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
            for (int j2 = j - 16; j2 <= j + 16; j2++) {
                double d1 = (j2 + 0.5d) - entityIn.field_70165_t;
                for (int l2 = l - 16; l2 <= l + 16; l2++) {
                    double d2 = (l2 + 0.5d) - entityIn.field_70161_v;
                    int j3 = this.field_85192_a.func_72940_L() - 1;
                    while (j3 >= 0) {
                        if (this.field_85192_a.func_175623_d(blockpos$mutableblockpos.func_181079_c(j2, j3, l2))) {
                            while (j3 > 0 && this.field_85192_a.func_175623_d(blockpos$mutableblockpos.func_181079_c(j2, j3 - 1, l2))) {
                                j3--;
                            }
                            for (int k3 = i2; k3 < i2 + 4; k3++) {
                                int l3 = k3 % 2;
                                int i4 = 1 - l3;
                                if (k3 % 4 >= 2) {
                                    l3 = -l3;
                                    i4 = -i4;
                                }
                                for (int j4 = 0; j4 < 3; j4++) {
                                    for (int k4 = 0; k4 < 4; k4++) {
                                        for (l4 = -1; l4 < 4; l4 = l4 + 1) {
                                            int i5 = j2 + ((k4 - 1) * l3) + (j4 * i4);
                                            int j5 = j3 + l4;
                                            int k5 = (l2 + ((k4 - 1) * i4)) - (j4 * l3);
                                            blockpos$mutableblockpos.func_181079_c(i5, j5, k5);
                                            l4 = ((l4 >= 0 || this.field_85192_a.func_180495_p(blockpos$mutableblockpos).func_185904_a().func_76220_a()) && (l4 < 0 || this.field_85192_a.func_175623_d(blockpos$mutableblockpos))) ? l4 + 1 : -1;
                                        }
                                    }
                                }
                                double d5 = (j3 + 0.5d) - entityIn.field_70163_u;
                                double d7 = (d1 * d1) + (d5 * d5) + (d2 * d2);
                                if (d0 < 0.0d || d7 < d0) {
                                    d0 = d7;
                                    i1 = j2;
                                    j1 = j3;
                                    k1 = l2;
                                    l1 = k3 % 4;
                                }
                            }
                        }
                        j3--;
                    }
                }
            }
            if (d0 < 0.0d) {
                for (int l5 = j - 16; l5 <= j + 16; l5++) {
                    double d3 = (l5 + 0.5d) - entityIn.field_70165_t;
                    for (int j6 = l - 16; j6 <= l + 16; j6++) {
                        double d4 = (j6 + 0.5d) - entityIn.field_70161_v;
                        int i7 = this.field_85192_a.func_72940_L() - 1;
                        while (i7 >= 0) {
                            if (this.field_85192_a.func_175623_d(blockpos$mutableblockpos.func_181079_c(l5, i7, j6))) {
                                while (i7 > 0 && this.field_85192_a.func_175623_d(blockpos$mutableblockpos.func_181079_c(l5, i7 - 1, j6))) {
                                    i7--;
                                }
                                for (int k7 = i2; k7 < i2 + 2; k7++) {
                                    int j8 = k7 % 2;
                                    int j9 = 1 - j8;
                                    for (int j10 = 0; j10 < 4; j10++) {
                                        for (j11 = -1; j11 < 4; j11 = j11 + 1) {
                                            int j12 = l5 + ((j10 - 1) * j8);
                                            int i13 = i7 + j11;
                                            int j13 = j6 + ((j10 - 1) * j9);
                                            blockpos$mutableblockpos.func_181079_c(j12, i13, j13);
                                            j11 = ((j11 >= 0 || this.field_85192_a.func_180495_p(blockpos$mutableblockpos).func_185904_a().func_76220_a()) && (j11 < 0 || this.field_85192_a.func_175623_d(blockpos$mutableblockpos))) ? j11 + 1 : -1;
                                        }
                                    }
                                    double d6 = (i7 + 0.5d) - entityIn.field_70163_u;
                                    double d8 = (d3 * d3) + (d6 * d6) + (d4 * d4);
                                    if (d0 < 0.0d || d8 < d0) {
                                        d0 = d8;
                                        i1 = l5;
                                        j1 = i7;
                                        k1 = j6;
                                        l1 = k7 % 2;
                                    }
                                }
                            }
                            i7--;
                        }
                    }
                }
            }
            int i6 = i1;
            int k2 = j1;
            int k6 = k1;
            int l6 = l1 % 2;
            int i3 = 1 - l6;
            if (l1 % 4 >= 2) {
                l6 = -l6;
                i3 = -i3;
            }
            if (d0 < 0.0d) {
                k2 = MathHelper.func_76125_a(j1, 70, this.field_85192_a.func_72940_L() - 10);
                for (int j7 = -1; j7 <= 1; j7++) {
                    for (int l7 = 1; l7 < 3; l7++) {
                        int k8 = -1;
                        while (k8 < 3) {
                            int k9 = i6 + ((l7 - 1) * l6) + (j7 * i3);
                            int k10 = k2 + k8;
                            int k11 = (k6 + ((l7 - 1) * i3)) - (j7 * l6);
                            boolean flag = k8 < 0;
                            this.field_85192_a.func_175656_a(new BlockPos(k9, k10, k11), flag ? Blocks.field_150340_R.func_176223_P().func_177230_c().func_176223_P() : Blocks.field_150350_a.func_176223_P());
                            k8++;
                        }
                    }
                }
            }
            IBlockState iblockstate = WorldWeimian02.portal.func_176223_P().func_177226_a(BlockPortal.field_176550_a, l6 == 0 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
            for (int i8 = 0; i8 < 4; i8++) {
                int l8 = 0;
                while (l8 < 4) {
                    int l9 = -1;
                    while (l9 < 4) {
                        int l10 = i6 + ((l8 - 1) * l6);
                        int l11 = k2 + l9;
                        int k12 = k6 + ((l8 - 1) * i3);
                        boolean flag1 = l8 == 0 || l8 == 3 || l9 == -1 || l9 == 3;
                        this.field_85192_a.func_180501_a(new BlockPos(l10, l11, k12), flag1 ? Blocks.field_150340_R.func_176223_P().func_177230_c().func_176223_P() : iblockstate, 2);
                        l9++;
                    }
                    l8++;
                }
                for (int i9 = 0; i9 < 4; i9++) {
                    for (int i10 = -1; i10 < 4; i10++) {
                        int i11 = i6 + ((i9 - 1) * l6);
                        int i12 = k2 + i10;
                        int l12 = k6 + ((i9 - 1) * i3);
                        BlockPos blockpos = new BlockPos(i11, i12, l12);
                        this.field_85192_a.func_175685_c(blockpos, this.field_85192_a.func_180495_p(blockpos).func_177230_c(), false);
                    }
                }
            }
            return true;
        }

        public void func_180266_a(Entity entityIn, float rotationYaw) {
            if (this.field_85192_a.field_73011_w.func_186058_p().func_186068_a() != 1) {
                if (!func_180620_b(entityIn, rotationYaw)) {
                    func_85188_a(entityIn);
                    func_180620_b(entityIn, rotationYaw);
                    return;
                }
                return;
            }
            int i = MathHelper.func_76128_c(entityIn.field_70165_t);
            int j = MathHelper.func_76128_c(entityIn.field_70163_u) - 1;
            int k = MathHelper.func_76128_c(entityIn.field_70161_v);
            for (int j1 = -2; j1 <= 2; j1++) {
                for (int k1 = -2; k1 <= 2; k1++) {
                    int l1 = -1;
                    while (l1 < 3) {
                        int i2 = i + (k1 * 1) + (j1 * 0);
                        int j2 = j + l1;
                        int k2 = (k + (k1 * 0)) - (j1 * 1);
                        boolean flag = l1 < 0;
                        this.field_85192_a.func_175656_a(new BlockPos(i2, j2, k2), flag ? Blocks.field_150340_R.func_176223_P().func_177230_c().func_176223_P() : Blocks.field_150350_a.func_176223_P());
                        l1++;
                    }
                }
            }
            entityIn.func_70012_b(i, j, k, entityIn.field_70177_z, 0.0f);
            entityIn.field_70159_w = 0.0d;
            entityIn.field_70181_x = 0.0d;
            entityIn.field_70179_y = 0.0d;
        }

        public boolean func_180620_b(Entity entityIn, float rotationYaw) {
            double func_177958_n;
            double d0 = -1.0d;
            int j = MathHelper.func_76128_c(entityIn.field_70165_t);
            int k = MathHelper.func_76128_c(entityIn.field_70161_v);
            boolean flag = true;
            BlockPos blockpos = BlockPos.field_177992_a;
            long l = ChunkPos.func_77272_a(j, k);
            if (this.field_85191_c.containsKey(l)) {
                BlockPos blockPos = (Teleporter.PortalPosition) this.field_85191_c.get(l);
                d0 = 0.0d;
                blockpos = blockPos;
                ((Teleporter.PortalPosition) blockPos).field_85087_d = this.field_85192_a.func_82737_E();
                flag = false;
            } else {
                BlockPos blockpos3 = new BlockPos(entityIn);
                for (int i1 = -128; i1 <= 128; i1++) {
                    for (int j1 = -128; j1 <= 128; j1++) {
                        BlockPos func_177982_a = blockpos3.func_177982_a(i1, (this.field_85192_a.func_72940_L() - 1) - blockpos3.func_177956_o(), j1);
                        while (true) {
                            BlockPos blockpos1 = func_177982_a;
                            if (blockpos1.func_177956_o() >= 0) {
                                BlockPos blockpos2 = blockpos1.func_177977_b();
                                if (this.field_85192_a.func_180495_p(blockpos1).func_177230_c() == WorldWeimian02.portal) {
                                    BlockPos func_177977_b = blockpos1.func_177977_b();
                                    while (true) {
                                        blockpos2 = func_177977_b;
                                        if (this.field_85192_a.func_180495_p(blockpos2).func_177230_c() != WorldWeimian02.portal) {
                                            break;
                                        }
                                        blockpos1 = blockpos2;
                                        func_177977_b = blockpos2.func_177977_b();
                                    }
                                    double d1 = blockpos1.func_177951_i(blockpos3);
                                    if (d0 < 0.0d || d1 < d0) {
                                        d0 = d1;
                                        blockpos = blockpos1;
                                    }
                                }
                                func_177982_a = blockpos2;
                            }
                        }
                    }
                }
            }
            if (d0 >= 0.0d) {
                if (flag) {
                    this.field_85191_c.put(l, new Teleporter.PortalPosition(this, blockpos, this.field_85192_a.func_82737_E()));
                }
                double d5 = blockpos.func_177958_n() + 0.5d;
                double d7 = blockpos.func_177952_p() + 0.5d;
                BlockPattern.PatternHelper blockpattern$patternhelper = WorldWeimian02.portal.func_181089_f(this.field_85192_a, blockpos);
                boolean flag1 = blockpattern$patternhelper.func_177669_b().func_176746_e().func_176743_c() == EnumFacing.AxisDirection.NEGATIVE;
                if (blockpattern$patternhelper.func_177669_b().func_176740_k() == EnumFacing.Axis.X) {
                    func_177958_n = blockpattern$patternhelper.func_181117_a().func_177952_p();
                } else {
                    func_177958_n = blockpattern$patternhelper.func_181117_a().func_177958_n();
                }
                double d2 = func_177958_n;
                double d6 = (blockpattern$patternhelper.func_181117_a().func_177956_o() + 1) - (this.lastPortalVec.field_72448_b * blockpattern$patternhelper.func_181119_e());
                if (flag1) {
                    d2 += 1.0d;
                }
                if (blockpattern$patternhelper.func_177669_b().func_176740_k() == EnumFacing.Axis.X) {
                    d7 = d2 + ((1.0d - this.lastPortalVec.field_72450_a) * blockpattern$patternhelper.func_181118_d() * blockpattern$patternhelper.func_177669_b().func_176746_e().func_176743_c().func_179524_a());
                } else {
                    d5 = d2 + ((1.0d - this.lastPortalVec.field_72450_a) * blockpattern$patternhelper.func_181118_d() * blockpattern$patternhelper.func_177669_b().func_176746_e().func_176743_c().func_179524_a());
                }
                float f = 0.0f;
                float f1 = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                if (blockpattern$patternhelper.func_177669_b().func_176734_d() == this.teleportDirection) {
                    f = 1.0f;
                    f1 = 1.0f;
                } else if (blockpattern$patternhelper.func_177669_b().func_176734_d() == this.teleportDirection.func_176734_d()) {
                    f = -1.0f;
                    f1 = -1.0f;
                } else if (blockpattern$patternhelper.func_177669_b().func_176734_d() == this.teleportDirection.func_176746_e()) {
                    f2 = 1.0f;
                    f3 = -1.0f;
                } else {
                    f2 = -1.0f;
                    f3 = 1.0f;
                }
                double d3 = entityIn.field_70159_w;
                double d4 = entityIn.field_70179_y;
                entityIn.field_70159_w = (d3 * f) + (d4 * f3);
                entityIn.field_70179_y = (d3 * f2) + (d4 * f1);
                entityIn.field_70177_z = (rotationYaw - (this.teleportDirection.func_176734_d().func_176736_b() * 90)) + (blockpattern$patternhelper.func_177669_b().func_176736_b() * 90);
                if (entityIn instanceof EntityPlayerMP) {
                    ((EntityPlayerMP) entityIn).field_71135_a.func_147364_a(d5, d6, d7, entityIn.field_70177_z, entityIn.field_70125_A);
                    return true;
                }
                entityIn.func_70012_b(d5, d6, d7, entityIn.field_70177_z, entityIn.field_70125_A);
                return true;
            }
            return false;
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02$BlockCustomPortal.class */
    public static class BlockCustomPortal extends BlockPortal {
        public BlockCustomPortal() {
            func_149711_c(-1.0f);
            func_149663_c("weimian02_portal");
            setRegistryName("weimian02_portal");
            func_149715_a(0.0f);
        }

        public void func_180650_b(World world, BlockPos pos, IBlockState state, Random random) {
        }

        public void portalSpawn(World worldIn, BlockPos pos) {
            Size portalsize = new Size(worldIn, pos, EnumFacing.Axis.X);
            if (portalsize.isValid() && portalsize.portalBlockCount == 0) {
                portalsize.placePortalBlocks();
                return;
            }
            Size portalsize2 = new Size(worldIn, pos, EnumFacing.Axis.Z);
            if (portalsize2.isValid() && portalsize2.portalBlockCount == 0) {
                portalsize2.placePortalBlocks();
            }
        }

        public BlockPattern.PatternHelper func_181089_f(World worldIn, BlockPos p_181089_2_) {
            EnumFacing.AxisDirection[] values;
            EnumFacing.Axis enumfacing$axis = EnumFacing.Axis.Z;
            Size blockportal$size = new Size(worldIn, p_181089_2_, EnumFacing.Axis.X);
            LoadingCache<BlockPos, BlockWorldState> loadingcache = BlockPattern.func_181627_a(worldIn, true);
            if (!blockportal$size.isValid()) {
                enumfacing$axis = EnumFacing.Axis.X;
                blockportal$size = new Size(worldIn, p_181089_2_, EnumFacing.Axis.Z);
            }
            if (!blockportal$size.isValid()) {
                return new BlockPattern.PatternHelper(p_181089_2_, EnumFacing.NORTH, EnumFacing.UP, loadingcache, 1, 1, 1);
            }
            int[] aint = new int[EnumFacing.AxisDirection.values().length];
            EnumFacing enumfacing = blockportal$size.rightDir.func_176735_f();
            BlockPos blockpos = blockportal$size.bottomLeft.func_177981_b(blockportal$size.getHeight() - 1);
            EnumFacing.AxisDirection[] values2 = EnumFacing.AxisDirection.values();
            int length = values2.length;
            for (int i = 0; i < length; i++) {
                EnumFacing.AxisDirection enumfacing$axisdirection = values2[i];
                BlockPattern.PatternHelper blockpattern$patternhelper = new BlockPattern.PatternHelper(enumfacing.func_176743_c() == enumfacing$axisdirection ? blockpos : blockpos.func_177967_a(blockportal$size.rightDir, blockportal$size.getWidth() - 1), EnumFacing.func_181076_a(enumfacing$axisdirection, enumfacing$axis), EnumFacing.UP, loadingcache, blockportal$size.getWidth(), blockportal$size.getHeight(), 1);
                for (int i2 = 0; i2 < blockportal$size.getWidth(); i2++) {
                    for (int j = 0; j < blockportal$size.getHeight(); j++) {
                        BlockWorldState blockworldstate = blockpattern$patternhelper.func_177670_a(i2, j, 1);
                        if (blockworldstate.func_177509_a() != null && blockworldstate.func_177509_a().func_185904_a() != Material.field_151579_a) {
                            int ordinal = enumfacing$axisdirection.ordinal();
                            aint[ordinal] = aint[ordinal] + 1;
                        }
                    }
                }
            }
            EnumFacing.AxisDirection enumfacing$axisdirection1 = EnumFacing.AxisDirection.POSITIVE;
            for (EnumFacing.AxisDirection enumfacing$axisdirection2 : EnumFacing.AxisDirection.values()) {
                if (aint[enumfacing$axisdirection2.ordinal()] < aint[enumfacing$axisdirection1.ordinal()]) {
                    enumfacing$axisdirection1 = enumfacing$axisdirection2;
                }
            }
            return new BlockPattern.PatternHelper(enumfacing.func_176743_c() == enumfacing$axisdirection1 ? blockpos : blockpos.func_177967_a(blockportal$size.rightDir, blockportal$size.getWidth() - 1), EnumFacing.func_181076_a(enumfacing$axisdirection1, enumfacing$axis), EnumFacing.UP, loadingcache, blockportal$size.getWidth(), blockportal$size.getHeight(), 1);
        }

        public void func_189540_a(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
            EnumFacing.Axis enumfacing$axis = state.func_177229_b(field_176550_a);
            if (enumfacing$axis == EnumFacing.Axis.X) {
                Size blockportal$size = new Size(worldIn, pos, EnumFacing.Axis.X);
                if (!blockportal$size.isValid() || blockportal$size.portalBlockCount < blockportal$size.width * blockportal$size.height) {
                    worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
                }
            } else if (enumfacing$axis == EnumFacing.Axis.Z) {
                Size blockportal$size1 = new Size(worldIn, pos, EnumFacing.Axis.Z);
                if (!blockportal$size1.isValid() || blockportal$size1.portalBlockCount < blockportal$size1.width * blockportal$size1.height) {
                    worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
                }
            }
        }

        @SideOnly(Side.CLIENT)
        public void func_180655_c(IBlockState state, World world, BlockPos pos, Random random) {
            for (int i = 0; i < 4; i++) {
                double px = pos.func_177958_n() + random.nextFloat();
                double py = pos.func_177956_o() + random.nextFloat();
                double pz = pos.func_177952_p() + random.nextFloat();
                double vx = (random.nextFloat() - 0.5d) / 2.0d;
                double vy = (random.nextFloat() - 0.5d) / 2.0d;
                double vz = (random.nextFloat() - 0.5d) / 2.0d;
                int j = random.nextInt(4) - 1;
                if (world.func_180495_p(pos.func_177976_e()).func_177230_c() != this && world.func_180495_p(pos.func_177974_f()).func_177230_c() != this) {
                    px = pos.func_177958_n() + 0.5d + (0.25d * j);
                    vx = random.nextFloat() * 2.0f * j;
                } else {
                    pz = pos.func_177952_p() + 0.5d + (0.25d * j);
                    vz = random.nextFloat() * 2.0f * j;
                }
                world.func_175688_a(EnumParticleTypes.PORTAL, px, py, pz, vx, vy, vz, new int[0]);
            }
            if (random.nextInt(110) == 0) {
                world.func_184134_a(pos.func_177958_n() + 0.5d, pos.func_177956_o() + 0.5d, pos.func_177952_p() + 0.5d, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("block.portal.ambient")), SoundCategory.BLOCKS, 0.5f, (random.nextFloat() * 0.4f) + 0.8f, false);
            }
        }

        public void func_180634_a(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
            if (!worldIn.field_72995_K && !entityIn.func_184218_aH() && !entityIn.func_184207_aI() && (entityIn instanceof EntityPlayerMP)) {
                EntityPlayerMP thePlayer = (EntityPlayerMP) entityIn;
                if (thePlayer.field_71088_bW > 0) {
                    thePlayer.field_71088_bW = 10;
                } else if (thePlayer.field_71093_bK != WorldWeimian02.DIMID) {
                    thePlayer.field_71088_bW = 10;
                    ReflectionHelper.setPrivateValue(EntityPlayerMP.class, thePlayer, true, "invulnerableDimensionChange", "field_184851_cj");
                    thePlayer.field_71133_b.func_184103_al().transferPlayerToDimension(thePlayer, WorldWeimian02.DIMID, getTeleporterForDimension(thePlayer, pos, WorldWeimian02.DIMID));
                } else {
                    thePlayer.field_71088_bW = 10;
                    ReflectionHelper.setPrivateValue(EntityPlayerMP.class, thePlayer, true, "invulnerableDimensionChange", "field_184851_cj");
                    thePlayer.field_71133_b.func_184103_al().transferPlayerToDimension(thePlayer, 0, getTeleporterForDimension(thePlayer, pos, 0));
                }
            }
        }

        private TeleporterDimensionMod getTeleporterForDimension(Entity entity, BlockPos pos, int dimid) {
            double func_177958_n;
            BlockPattern.PatternHelper bph = WorldWeimian02.portal.func_181089_f(entity.field_70170_p, new BlockPos(pos));
            if (bph.func_177669_b().func_176740_k() == EnumFacing.Axis.X) {
                func_177958_n = bph.func_181117_a().func_177952_p();
            } else {
                func_177958_n = bph.func_181117_a().func_177958_n();
            }
            double d0 = func_177958_n;
            double d1 = bph.func_177669_b().func_176740_k() == EnumFacing.Axis.X ? entity.field_70161_v : entity.field_70165_t;
            double d12 = Math.abs(MathHelper.func_181160_c(d1 - (bph.func_177669_b().func_176746_e().func_176743_c() == EnumFacing.AxisDirection.NEGATIVE ? 1 : 0), d0, d0 - bph.func_181118_d()));
            double d2 = MathHelper.func_181160_c(entity.field_70163_u - 1.0d, bph.func_181117_a().func_177956_o(), bph.func_181117_a().func_177956_o() - bph.func_181119_e());
            return new TeleporterDimensionMod(entity.func_184102_h().func_71218_a(dimid), new Vec3d(d12, d2, 0.0d), bph.func_177669_b());
        }

        /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02$BlockCustomPortal$Size.class */
        public static class Size {
            private final World world;
            private final EnumFacing.Axis axis;
            private final EnumFacing rightDir;
            private final EnumFacing leftDir;
            private int portalBlockCount;
            private BlockPos bottomLeft;
            private int height;
            private int width;

            public Size(World worldIn, BlockPos p_i45694_2_, EnumFacing.Axis p_i45694_3_) {
                this.world = worldIn;
                this.axis = p_i45694_3_;
                if (p_i45694_3_ == EnumFacing.Axis.X) {
                    this.leftDir = EnumFacing.EAST;
                    this.rightDir = EnumFacing.WEST;
                } else {
                    this.leftDir = EnumFacing.NORTH;
                    this.rightDir = EnumFacing.SOUTH;
                }
                while (p_i45694_2_.func_177956_o() > p_i45694_2_.func_177956_o() - 21 && p_i45694_2_.func_177956_o() > 0 && isEmptyBlock(worldIn.func_180495_p(p_i45694_2_.func_177977_b()).func_177230_c())) {
                    p_i45694_2_ = p_i45694_2_.func_177977_b();
                }
                int i = getDistanceUntilEdge(p_i45694_2_, this.leftDir) - 1;
                if (i >= 0) {
                    this.bottomLeft = p_i45694_2_.func_177967_a(this.leftDir, i);
                    this.width = getDistanceUntilEdge(this.bottomLeft, this.rightDir);
                    if (this.width < 2 || this.width > 21) {
                        this.bottomLeft = null;
                        this.width = 0;
                    }
                }
                if (this.bottomLeft != null) {
                    this.height = calculatePortalHeight();
                }
            }

            protected int getDistanceUntilEdge(BlockPos p_180120_1_, EnumFacing p_180120_2_) {
                int i = 0;
                while (i < 22) {
                    BlockPos blockpos = p_180120_1_.func_177967_a(p_180120_2_, i);
                    if (!isEmptyBlock(this.world.func_180495_p(blockpos).func_177230_c()) || this.world.func_180495_p(blockpos.func_177977_b()).func_177230_c() != Blocks.field_150340_R.func_176223_P().func_177230_c()) {
                        break;
                    }
                    i++;
                }
                Block block = this.world.func_180495_p(p_180120_1_.func_177967_a(p_180120_2_, i)).func_177230_c();
                if (block == Blocks.field_150340_R.func_176223_P().func_177230_c()) {
                    return i;
                }
                return 0;
            }

            public int getHeight() {
                return this.height;
            }

            public int getWidth() {
                return this.width;
            }

            protected int calculatePortalHeight() {
                this.height = 0;
                loop0: while (this.height < 21) {
                    for (int i = 0; i < this.width; i++) {
                        BlockPos blockpos = this.bottomLeft.func_177967_a(this.rightDir, i).func_177981_b(this.height);
                        BlockCustomPortal func_177230_c = this.world.func_180495_p(blockpos).func_177230_c();
                        if (!isEmptyBlock(func_177230_c)) {
                            break loop0;
                        }
                        if (func_177230_c == WorldWeimian02.portal) {
                            this.portalBlockCount++;
                        }
                        if (i == 0) {
                            Block block = this.world.func_180495_p(blockpos.func_177972_a(this.leftDir)).func_177230_c();
                            if (block != Blocks.field_150340_R.func_176223_P().func_177230_c()) {
                                break loop0;
                            }
                        } else {
                            if (i == this.width - 1) {
                                Block block2 = this.world.func_180495_p(blockpos.func_177972_a(this.rightDir)).func_177230_c();
                                if (block2 != Blocks.field_150340_R.func_176223_P().func_177230_c()) {
                                    break loop0;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    this.height++;
                }
                int j = 0;
                while (true) {
                    if (j < this.width) {
                        if (this.world.func_180495_p(this.bottomLeft.func_177967_a(this.rightDir, j).func_177981_b(this.height)).func_177230_c() == Blocks.field_150340_R.func_176223_P().func_177230_c()) {
                            j++;
                        } else {
                            this.height = 0;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (this.height <= 21 && this.height >= 3) {
                    return this.height;
                }
                this.bottomLeft = null;
                this.width = 0;
                this.height = 0;
                return 0;
            }

            protected boolean isEmptyBlock(Block blockIn) {
                return blockIn.func_176223_P().func_185904_a() == Material.field_151579_a || blockIn == Blocks.field_150480_ab || blockIn == WorldWeimian02.portal;
            }

            public boolean isValid() {
                return this.bottomLeft != null && this.width >= 2 && this.width <= 21 && this.height >= 3 && this.height <= 21;
            }

            public void placePortalBlocks() {
                for (int i = 0; i < this.width; i++) {
                    BlockPos blockpos = this.bottomLeft.func_177967_a(this.rightDir, i);
                    for (int j = 0; j < this.height; j++) {
                        this.world.func_180501_a(blockpos.func_177981_b(j), WorldWeimian02.portal.func_176223_P().func_177226_a(BlockPortal.field_176550_a, this.axis), 2);
                    }
                }
            }
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02$ChunkProviderModded.class */
    public static class ChunkProviderModded implements IChunkGenerator {
        private static final IBlockState STONE = BlockFangkuai001.block.func_176223_P();
        private static final IBlockState AIR = Blocks.field_150350_a.func_176223_P();
        private static final int SEALEVEL = 63;
        private final World world;
        private Random random;
        private final NoiseGeneratorSimplex islandNoise;
        private final NoiseGeneratorOctaves perlinnoise1;
        private final NoiseGeneratorOctaves perlinnoise2;
        private final NoiseGeneratorOctaves perlinnoise3;
        private final NoiseGeneratorPerlin height;
        private Biome[] biomesForGeneration;
        private double[] buffer;
        private double[] pnr;
        private double[] ar;
        private double[] br;
        private double[] depthbuff = new double[256];
        private WorldGenerator islandGen;

        public ChunkProviderModded(World worldIn, long seed) {
            worldIn.func_181544_b((int) SEALEVEL);
            this.world = worldIn;
            this.random = new Random(seed);
            this.perlinnoise1 = new NoiseGeneratorOctaves(this.random, 16);
            this.perlinnoise2 = new NoiseGeneratorOctaves(this.random, 16);
            this.perlinnoise3 = new NoiseGeneratorOctaves(this.random, 8);
            this.height = new NoiseGeneratorPerlin(this.random, 4);
            this.islandNoise = new NoiseGeneratorSimplex(this.random);
            this.islandGen = new WorldGenerator() { // from class: net.mcreator.yvanchuxiuzhen.world.WorldWeimian02.ChunkProviderModded.1
                public boolean func_180709_b(World worldIn2, Random rand, BlockPos position) {
                    float f = rand.nextInt(4) + 5;
                    int i = 0;
                    while (f > 1.5f) {
                        for (int j = MathHelper.func_76141_d(-f); j <= MathHelper.func_76123_f(f); j++) {
                            for (int k = MathHelper.func_76141_d(-f); k <= MathHelper.func_76123_f(f); k++) {
                                if ((j * j) + (k * k) <= (f + 1.0f) * (f + 1.0f)) {
                                    func_175903_a(worldIn2, position.func_177982_a(j, i, k), ChunkProviderModded.STONE);
                                }
                            }
                        }
                        f = (float) (f - (rand.nextInt(2) + 0.5d));
                        i--;
                    }
                    return true;
                }
            };
        }

        public Chunk func_185932_a(int x, int z) {
            this.random.setSeed((x * 535358712) + (z * 347539041));
            ChunkPrimer chunkprimer = new ChunkPrimer();
            setBlocksInChunk(x, z, chunkprimer);
            this.biomesForGeneration = this.world.func_72959_q().func_76937_a(this.biomesForGeneration, x * 16, z * 16, 16, 16);
            replaceBiomeBlocks(x, z, chunkprimer, this.biomesForGeneration);
            Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
            byte[] abyte = chunk.func_76605_m();
            for (int i = 0; i < abyte.length; i++) {
                abyte[i] = (byte) Biome.func_185362_a(this.biomesForGeneration[i]);
            }
            chunk.func_76603_b();
            return chunk;
        }

        public void func_185931_b(int x, int z) {
            BlockFalling.field_149832_M = true;
            ForgeEventFactory.onChunkPopulate(true, this, this.world, this.random, x, z, false);
            int i = x * 16;
            int j = z * 16;
            BlockPos blockpos = new BlockPos(i, 0, j);
            float f = getIslandHeightValue(x, z, 1, 1);
            if (f < -10.0f && this.random.nextInt(6) == 0) {
                this.islandGen.func_180709_b(this.world, this.random, blockpos.func_177982_a(this.random.nextInt(16) + 8, 55 + this.random.nextInt(16), this.random.nextInt(16) + 8));
                if (this.random.nextInt(4) == 0) {
                    this.islandGen.func_180709_b(this.world, this.random, blockpos.func_177982_a(this.random.nextInt(16) + 8, 55 + this.random.nextInt(16), this.random.nextInt(16) + 8));
                }
            }
            Biome biome = this.world.func_180494_b(blockpos.func_177982_a(16, 0, 16));
            MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(this.world, this.random, blockpos));
            biome.func_180624_a(this.world, this.random, new BlockPos(i, 0, j));
            MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.world, this.random, blockpos));
            if (TerrainGen.populate(this, this.world, this.random, x, z, false, PopulateChunkEvent.Populate.EventType.ANIMALS)) {
                WorldEntitySpawner.func_77191_a(this.world, biome, i + 8, j + 8, 16, 16, this.random);
            }
            ForgeEventFactory.onChunkPopulate(false, this, this.world, this.random, x, z, false);
            BlockFalling.field_149832_M = false;
        }

        public List<Biome.SpawnListEntry> func_177458_a(EnumCreatureType creatureType, BlockPos pos) {
            return this.world.func_180494_b(pos).func_76747_a(creatureType);
        }

        public void func_180514_a(Chunk chunkIn, int x, int z) {
        }

        public boolean func_193414_a(World worldIn, String structureName, BlockPos pos) {
            return false;
        }

        public BlockPos func_180513_a(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
            return null;
        }

        public boolean func_185933_a(Chunk chunkIn, int x, int z) {
            return false;
        }

        private double[] getHeights(double[] p_185963_1_, int p_185963_2_, int p_185963_3_, int p_185963_4_, int p_185963_5_, int p_185963_6_, int p_185963_7_) {
            double d4;
            ChunkGeneratorEvent.InitNoiseField event = new ChunkGeneratorEvent.InitNoiseField(this, p_185963_1_, p_185963_2_, p_185963_3_, p_185963_4_, p_185963_5_, p_185963_6_, p_185963_7_);
            MinecraftForge.EVENT_BUS.post(event);
            if (event.getResult() == Event.Result.DENY) {
                return event.getNoisefield();
            }
            if (p_185963_1_ == null) {
                p_185963_1_ = new double[p_185963_5_ * p_185963_6_ * p_185963_7_];
            }
            double d0 = 684.412d * 2.0d;
            this.pnr = this.perlinnoise3.func_76304_a(this.pnr, p_185963_2_, p_185963_3_, p_185963_4_, p_185963_5_, p_185963_6_, p_185963_7_, d0 / 80.0d, 4.277575000000001d, d0 / 80.0d);
            this.ar = this.perlinnoise1.func_76304_a(this.ar, p_185963_2_, p_185963_3_, p_185963_4_, p_185963_5_, p_185963_6_, p_185963_7_, d0, 684.412d, d0);
            this.br = this.perlinnoise2.func_76304_a(this.br, p_185963_2_, p_185963_3_, p_185963_4_, p_185963_5_, p_185963_6_, p_185963_7_, d0, 684.412d, d0);
            int i = p_185963_2_ / 2;
            int j = p_185963_4_ / 2;
            int k = 0;
            for (int l = 0; l < p_185963_5_; l++) {
                for (int i1 = 0; i1 < p_185963_7_; i1++) {
                    float f = getIslandHeightValue(i, j, l, i1);
                    for (int j1 = 0; j1 < p_185963_6_; j1++) {
                        double d2 = this.ar[k] / 512.0d;
                        double d3 = this.br[k] / 512.0d;
                        double d5 = ((this.pnr[k] / 10.0d) + 1.0d) / 2.0d;
                        if (d5 < 0.0d) {
                            d4 = d2;
                        } else if (d5 > 1.0d) {
                            d4 = d3;
                        } else {
                            d4 = d2 + ((d3 - d2) * d5);
                        }
                        double d42 = (d4 - 8.0d) + f;
                        if (j1 > (p_185963_6_ / 2) - 2) {
                            double d6 = MathHelper.func_151237_a((j1 - ((p_185963_6_ / 2) - 2)) / 64.0f, 0.0d, 1.0d);
                            d42 = (d42 * (1.0d - d6)) + ((-3000.0d) * d6);
                        }
                        if (j1 < 8) {
                            double d7 = (8 - j1) / (8 - 1.0f);
                            d42 = (d42 * (1.0d - d7)) + ((-30.0d) * d7);
                        }
                        p_185963_1_[k] = d42;
                        k++;
                    }
                }
            }
            return p_185963_1_;
        }

        private float getIslandHeightValue(int p_185960_1_, int p_185960_2_, int p_185960_3_, int p_185960_4_) {
            float f = (p_185960_1_ * 2) + p_185960_3_;
            float f1 = (p_185960_2_ * 2) + p_185960_4_;
            float f2 = 100.0f - (MathHelper.func_76129_c((f * f) + (f1 * f1)) * 8.0f);
            if (f2 > 80.0f) {
                f2 = 80.0f;
            }
            if (f2 < -100.0f) {
                f2 = -100.0f;
            }
            for (int i = -12; i <= 12; i++) {
                for (int j = -12; j <= 12; j++) {
                    long k = p_185960_1_ + i;
                    long l = p_185960_2_ + j;
                    if ((k * k) + (l * l) > 4096 && this.islandNoise.func_151605_a(k, l) < -0.8999999761581421d) {
                        float f3 = (((MathHelper.func_76135_e((float) k) * 3439.0f) + (MathHelper.func_76135_e((float) l) * 147.0f)) % 13.0f) + 9.0f;
                        float f4 = p_185960_3_ - (i * 2);
                        float f12 = p_185960_4_ - (j * 2);
                        float f42 = 100.0f - (MathHelper.func_76129_c((f4 * f4) + (f12 * f12)) * f3);
                        if (f42 > 80.0f) {
                            f42 = 80.0f;
                        }
                        if (f42 < -100.0f) {
                            f42 = -100.0f;
                        }
                        if (f42 > f2) {
                            f2 = f42;
                        }
                    }
                }
            }
            return f2;
        }

        public void setBlocksInChunk(int x, int z, ChunkPrimer primer) {
            this.buffer = getHeights(this.buffer, x * 2, 0, z * 2, 3, 33, 3);
            for (int i1 = 0; i1 < 2; i1++) {
                for (int j1 = 0; j1 < 2; j1++) {
                    for (int k1 = 0; k1 < 32; k1++) {
                        double d1 = this.buffer[((((i1 + 0) * 3) + j1 + 0) * 33) + k1 + 0];
                        double d2 = this.buffer[((((i1 + 0) * 3) + j1 + 1) * 33) + k1 + 0];
                        double d3 = this.buffer[((((i1 + 1) * 3) + j1 + 0) * 33) + k1 + 0];
                        double d4 = this.buffer[((((i1 + 1) * 3) + j1 + 1) * 33) + k1 + 0];
                        double d5 = (this.buffer[((((((i1 + 0) * 3) + j1) + 0) * 33) + k1) + 1] - d1) * 0.25d;
                        double d6 = (this.buffer[((((((i1 + 0) * 3) + j1) + 1) * 33) + k1) + 1] - d2) * 0.25d;
                        double d7 = (this.buffer[((((((i1 + 1) * 3) + j1) + 0) * 33) + k1) + 1] - d3) * 0.25d;
                        double d8 = (this.buffer[((((((i1 + 1) * 3) + j1) + 1) * 33) + k1) + 1] - d4) * 0.25d;
                        for (int l1 = 0; l1 < 4; l1++) {
                            double d10 = d1;
                            double d11 = d2;
                            double d12 = (d3 - d1) * 0.125d;
                            double d13 = (d4 - d2) * 0.125d;
                            for (int i2 = 0; i2 < 8; i2++) {
                                double d15 = d10;
                                double d16 = (d11 - d10) * 0.125d;
                                for (int j2 = 0; j2 < 8; j2++) {
                                    IBlockState iblockstate = AIR;
                                    if (d15 > 0.0d) {
                                        iblockstate = STONE;
                                    }
                                    int k2 = i2 + (i1 * 8);
                                    int l2 = l1 + (k1 * 4);
                                    int i3 = j2 + (j1 * 8);
                                    primer.func_177855_a(k2, l2, i3, iblockstate);
                                    d15 += d16;
                                }
                                d10 += d12;
                                d11 += d13;
                            }
                            d1 += d5;
                            d2 += d6;
                            d3 += d7;
                            d4 += d8;
                        }
                    }
                }
            }
        }

        private void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, Biome[] biomesIn) {
            this.depthbuff = this.height.func_151599_a(this.depthbuff, x * 16, z * 16, 16, 16, 0.0625d, 0.0625d, 1.0d);
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 16; j++) {
                    generateBiomeTerrain(this.world, this.random, primer, (x * 16) + i, (z * 16) + j, this.depthbuff[j + (i * 16)], biomesIn[j + (i * 16)]);
                }
            }
        }

        private void generateBiomeTerrain(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal, Biome biome) {
            IBlockState iblockstate = biome.field_76752_A;
            IBlockState iblockstate1 = biome.field_76753_B;
            int j = -1;
            int k = (int) ((noiseVal / 3.0d) + 3.0d + (rand.nextDouble() / 4.0d));
            int l = x & 15;
            int i1 = z & 15;
            for (int j1 = 255; j1 >= 0; j1--) {
                IBlockState iblockstate2 = chunkPrimerIn.func_177856_a(i1, j1, l);
                if (iblockstate2.func_185904_a() == Material.field_151579_a) {
                    j = -1;
                } else if (iblockstate2.func_177230_c() == STONE.func_177230_c()) {
                    if (j == -1) {
                        if (k <= 0) {
                            iblockstate = AIR;
                            iblockstate1 = STONE;
                        }
                        j = k;
                        if (j1 < SEALEVEL - 1) {
                            if (j1 < (SEALEVEL - 7) - k) {
                                iblockstate1 = STONE;
                            } else {
                                chunkPrimerIn.func_177855_a(i1, j1, l, iblockstate1);
                            }
                        } else {
                            chunkPrimerIn.func_177855_a(i1, j1, l, iblockstate);
                        }
                    } else if (j > 0) {
                        j--;
                        chunkPrimerIn.func_177855_a(i1, j1, l, iblockstate1);
                    }
                }
            }
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02$GenLayerBiomesCustom.class */
    public static class GenLayerBiomesCustom extends GenLayer {
        private Biome[] allowedBiomes;

        public GenLayerBiomesCustom(long seed) {
            super(seed);
            this.allowedBiomes = new Biome[]{(Biome) Biome.field_185377_q.func_82594_a(new ResourceLocation("yvanchuxiuzhen:shengtai1"))};
        }

        public int[] func_75904_a(int x, int z, int width, int depth) {
            int[] dest = IntCache.func_76445_a(width * depth);
            for (int dz = 0; dz < depth; dz++) {
                for (int dx = 0; dx < width; dx++) {
                    func_75903_a(dx + x, dz + z);
                    dest[dx + (dz * width)] = Biome.func_185362_a(this.allowedBiomes[func_75902_a(this.allowedBiomes.length)]);
                }
            }
            return dest;
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/world/WorldWeimian02$BiomeProviderCustom.class */
    public static class BiomeProviderCustom extends BiomeProvider {
        private GenLayer genBiomes;
        private GenLayer biomeIndexLayer;
        private BiomeCache biomeCache;

        public BiomeProviderCustom() {
            this.biomeCache = new BiomeCache(this);
        }

        public BiomeProviderCustom(long seed) {
            this.biomeCache = new BiomeCache(this);
            GenLayer[] agenlayer = makeTheWorld(seed);
            this.genBiomes = agenlayer[0];
            this.biomeIndexLayer = agenlayer[1];
        }

        private GenLayer[] makeTheWorld(long seed) {
            GenLayer biomes = new GenLayerZoom(1005L, new GenLayerZoom(1004L, new GenLayerZoom(1003L, new GenLayerZoom(1002L, new GenLayerZoom(1001L, new GenLayerZoom(1000L, new GenLayerBiomesCustom(1L)))))));
            GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
            biomes.func_75905_a(seed);
            genlayervoronoizoom.func_75905_a(seed);
            return new GenLayer[]{biomes, genlayervoronoizoom};
        }

        public BiomeProviderCustom(World world) {
            this(world.func_72905_C());
        }

        public void func_76938_b() {
            this.biomeCache.func_76838_a();
        }

        public Biome func_180631_a(BlockPos pos) {
            return func_180300_a(pos, null);
        }

        public Biome func_180300_a(BlockPos pos, Biome defaultBiome) {
            return this.biomeCache.func_180284_a(pos.func_177958_n(), pos.func_177952_p(), defaultBiome);
        }

        public Biome[] func_76933_b(Biome[] oldBiomeList, int x, int z, int width, int depth) {
            return func_76931_a(oldBiomeList, x, z, width, depth, true);
        }

        public Biome[] func_76937_a(Biome[] biomes, int x, int z, int width, int height) {
            IntCache.func_76446_a();
            if (biomes == null || biomes.length < width * height) {
                biomes = new Biome[width * height];
            }
            int[] aint = this.genBiomes.func_75904_a(x, z, width, height);
            for (int i = 0; i < width * height; i++) {
                try {
                    biomes[i] = Biome.func_180276_a(aint[i], Biomes.field_180279_ad);
                } catch (Throwable throwable) {
                    CrashReport crashreport = CrashReport.func_85055_a(throwable, "Invalid Biome id");
                    CrashReportCategory crashreportcategory = crashreport.func_85058_a("RawBiomeBlock");
                    crashreportcategory.func_71507_a("biomes[] size", Integer.valueOf(biomes.length));
                    crashreportcategory.func_71507_a("x", Integer.valueOf(x));
                    crashreportcategory.func_71507_a("z", Integer.valueOf(z));
                    crashreportcategory.func_71507_a("w", Integer.valueOf(width));
                    crashreportcategory.func_71507_a("h", Integer.valueOf(height));
                    throw new ReportedException(crashreport);
                }
            }
            return biomes;
        }

        public Biome[] func_76931_a(@Nullable Biome[] listToReuse, int x, int z, int width, int length, boolean cacheFlag) {
            IntCache.func_76446_a();
            if (listToReuse == null || listToReuse.length < width * length) {
                listToReuse = new Biome[width * length];
            }
            if (cacheFlag && width == 16 && length == 16 && (x & 15) == 0 && (z & 15) == 0) {
                Biome[] abiome = this.biomeCache.func_76839_e(x, z);
                System.arraycopy(abiome, 0, listToReuse, 0, width * length);
                return listToReuse;
            }
            int[] aint = this.biomeIndexLayer.func_75904_a(x, z, width, length);
            for (int i = 0; i < width * length; i++) {
                listToReuse[i] = Biome.func_180276_a(aint[i], Biomes.field_180279_ad);
            }
            return listToReuse;
        }

        public boolean func_76940_a(int x, int z, int radius, List<Biome> allowed) {
            IntCache.func_76446_a();
            int i = (x - radius) >> 2;
            int j = (z - radius) >> 2;
            int k = (x + radius) >> 2;
            int l = (z + radius) >> 2;
            int i1 = (k - i) + 1;
            int j1 = (l - j) + 1;
            int[] aint = this.genBiomes.func_75904_a(i, j, i1, j1);
            for (int k1 = 0; k1 < i1 * j1; k1++) {
                try {
                    Biome biome = Biome.func_150568_d(aint[k1]);
                    if (!allowed.contains(biome)) {
                        return false;
                    }
                } catch (Throwable throwable) {
                    CrashReport crashreport = CrashReport.func_85055_a(throwable, "Invalid Biome id");
                    CrashReportCategory crashreportcategory = crashreport.func_85058_a("Layer");
                    crashreportcategory.func_71507_a("Layer", this.genBiomes.toString());
                    crashreportcategory.func_71507_a("x", Integer.valueOf(x));
                    crashreportcategory.func_71507_a("z", Integer.valueOf(z));
                    crashreportcategory.func_71507_a("radius", Integer.valueOf(radius));
                    crashreportcategory.func_71507_a("allowed", allowed);
                    throw new ReportedException(crashreport);
                }
            }
            return true;
        }

        @Nullable
        public BlockPos func_180630_a(int x, int z, int range, List<Biome> biomes, Random random) {
            IntCache.func_76446_a();
            int i = (x - range) >> 2;
            int j = (z - range) >> 2;
            int k = (x + range) >> 2;
            int l = (z + range) >> 2;
            int i1 = (k - i) + 1;
            int j1 = (l - j) + 1;
            int[] aint = this.genBiomes.func_75904_a(i, j, i1, j1);
            BlockPos blockpos = null;
            int k1 = 0;
            for (int l1 = 0; l1 < i1 * j1; l1++) {
                int i2 = (i + (l1 % i1)) << 2;
                int j2 = (j + (l1 / i1)) << 2;
                Biome biome = Biome.func_150568_d(aint[l1]);
                if (biomes.contains(biome) && (blockpos == null || random.nextInt(k1 + 1) == 0)) {
                    blockpos = new BlockPos(i2, 0, j2);
                    k1++;
                }
            }
            return blockpos;
        }
    }
}
