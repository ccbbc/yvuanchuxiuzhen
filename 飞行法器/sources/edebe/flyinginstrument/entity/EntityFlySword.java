package edebe.flyinginstrument.entity;

import com.google.common.base.Optional;
import edebe.flyinginstrument.item.IFlyingInstrumentItem;
import edebe.flyinginstrument.key.ModKeys;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ParametersAreNonnullByDefault
/* loaded from: 飞行法器-mc1.12.2-1.9.0.jar:edebe/flyinginstrument/entity/EntityFlySword.class */
public class EntityFlySword extends EntityLiving implements IFlyingInstrumentEntity {
    private static final String NBT_KEY_ITEMSTACK = "ItemStack";
    private static final String NBT_KEY_OWNER_UUID = "OwnerUniqueID";
    private static final DataParameter<ItemStack> SWORD_ITEM_STACK = EntityDataManager.func_187226_a(EntityFlySword.class, DataSerializers.field_187196_f);
    private static final DataParameter<Byte> CONTROL_STATE = EntityDataManager.func_187226_a(EntityFlySword.class, DataSerializers.field_187191_a);
    protected static final DataParameter<Optional<UUID>> OWNER_UNIQUE_ID = EntityDataManager.func_187226_a(EntityFlySword.class, DataSerializers.field_187203_m);
    protected double mountedYOffset;
    protected boolean shouldRiderSit;

    public EntityFlySword(World worldIn) {
        super(worldIn);
        func_184224_h(true);
    }

    public EntityFlySword(World worldIn, ItemStack stackIn, EntityPlayer playerIn) {
        this(worldIn);
        setItemStack(stackIn);
        setOwnerID(playerIn.func_110124_au());
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(6.0d);
    }

    protected void func_70088_a() {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(SWORD_ITEM_STACK, ItemStack.field_190927_a);
        this.field_70180_af.func_187214_a(CONTROL_STATE, (byte) 0);
        this.field_70180_af.func_187214_a(OWNER_UNIQUE_ID, Optional.absent());
    }

    public void func_70037_a(NBTTagCompound compound) {
        super.func_70037_a(compound);
        if (compound.func_150297_b(NBT_KEY_ITEMSTACK, 10)) {
            setItemStack(new ItemStack(compound.func_74775_l(NBT_KEY_ITEMSTACK)));
        }
        if (compound.func_74764_b(NBT_KEY_OWNER_UUID)) {
            setOwnerID(compound.func_186857_a(NBT_KEY_OWNER_UUID));
        }
    }

    public void func_70014_b(NBTTagCompound compound) {
        super.func_70014_b(compound);
        if (!getItemStack().func_190926_b()) {
            compound.func_74782_a(NBT_KEY_ITEMSTACK, getItemStack().func_77955_b(new NBTTagCompound()));
        }
        if (getOwnerID() != null) {
            compound.func_186854_a(NBT_KEY_OWNER_UUID, getOwnerID());
        }
    }

    public double func_70042_X() {
        return this.mountedYOffset;
    }

    public boolean shouldRiderSit() {
        return this.shouldRiderSit;
    }

    @Nullable
    public Entity func_184179_bs() {
        List<Entity> list = func_184188_bt();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void func_184232_k(@Nonnull Entity passenger) {
        super.func_184232_k(passenger);
        if (passenger instanceof EntityLiving) {
            EntityLiving entityliving = (EntityLiving) passenger;
            entityliving.func_184210_p();
        }
    }

    protected void func_184225_p(Entity entity) {
        super.func_184225_p(entity);
        if (entity.func_110124_au().equals(getOwnerID())) {
            putAwaySword((EntityPlayer) entity);
        }
    }

    public boolean func_82171_bF() {
        return func_184179_bs() instanceof EntityLivingBase;
    }

    public void func_180430_e(float distance, float damageMultiplier) {
        super.func_180430_e(distance, 0.0f);
    }

    public boolean func_70097_a(DamageSource source, float amount) {
        EntityPlayer player = getControllingPlayer();
        if (player != null || source.func_76346_g() == null || !isOwner(source.func_76346_g())) {
            return false;
        }
        putAwaySword((EntityPlayer) source.func_76346_g());
        return false;
    }

    private void updateElytra() {
        boolean flag;
        boolean flag2 = func_70083_f(7);
        if (flag2 && !this.field_70122_E && !func_184218_aH()) {
            ItemStack itemstack = func_184582_a(EntityEquipmentSlot.CHEST);
            if (itemstack.func_77973_b() == Items.field_185160_cR && ItemElytra.func_185069_d(itemstack)) {
                flag = true;
                if (!this.field_70170_p.field_72995_K && (this.field_184629_bo + 1) % 20 == 0) {
                    itemstack.func_77972_a(1, this);
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        if (!this.field_70170_p.field_72995_K) {
            func_70052_a(7, flag);
        }
    }

    public void func_70071_h_() {
        this.field_70170_p.field_72984_F.func_76319_b();
        this.field_70170_p.field_72984_F.func_76320_a("travel");
        this.field_70702_br *= 0.98f;
        this.field_191988_bg *= 0.98f;
        this.field_70704_bt *= 0.9f;
        updateElytra();
        func_191986_a(this.field_70702_br, this.field_70701_bs, this.field_191988_bg);
        IFlyingInstrumentItem func_77973_b = getItemStack().func_77973_b();
        if (func_77973_b instanceof IFlyingInstrumentItem) {
            IFlyingInstrumentItem flyingInstrument = func_77973_b;
            func_70105_a(flyingInstrument.getWidth(), flyingInstrument.getHeight());
            this.mountedYOffset = flyingInstrument.getMountedYOffset();
            this.field_70138_W = flyingInstrument.getStepHeight();
            this.shouldRiderSit = flyingInstrument.shouldRiderSit();
        }
        EntityPlayer player = getControllingPlayer();
        if (!this.field_70170_p.field_72995_K && player != null && player.func_70093_af()) {
            putAwaySword(player);
        } else if (!this.field_70170_p.field_72995_K && player == null) {
            func_70106_y();
        } else {
            super.func_70071_h_();
            if (this.field_70170_p.field_72995_K) {
                updateClientControls();
            }
            if (player != null) {
                NBTTagCompound data = player.getEntityData();
                if (data.func_74764_b("Power") && data.func_74769_h("Power") > 0.0d) {
                    if (getItemStack().func_77973_b() instanceof IFlyingInstrumentItem) {
                        data.func_74757_a("FaQiFly", true);
                        if (data.func_74764_b("JingJieNum")) {
                            data.func_74780_a("FlySowrdTime", data.func_74769_h("FlySowrdTime") + 1.0d);
                            if (data.func_74769_h("FlySowrdTime") >= 20.0d) {
                                data.func_74780_a("FlySowrdTime", 0.0d);
                                if (data.func_74769_h("JingJieNum") >= 1.0d && data.func_74769_h("JingJieNum") <= 2.0d) {
                                    data.func_74780_a("Power", data.func_74769_h("Power") - 3.0d);
                                    return;
                                } else {
                                    data.func_74780_a("Power", data.func_74769_h("Power") - 6.0d);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                data.func_74757_a("FaQiFly", false);
                putAwaySword(player);
            }
        }
    }

    protected void func_180429_a(BlockPos pos, Block blockIn) {
    }

    public void func_191986_a(float strafe, float vertical, float forward) {
        EntityPlayer player;
        if (func_184207_aI() && (player = getControllingPlayer()) != null) {
            if (down()) {
                this.field_70181_x -= 0.029999999329447746d;
            }
            if (up()) {
                this.field_70181_x += 0.029999999329447746d;
            }
            this.field_70177_z = player.field_70177_z;
            this.field_70126_B = this.field_70177_z;
            this.field_70125_A = player.field_70125_A * 0.5f;
            func_70101_b(this.field_70177_z, this.field_70125_A);
            this.field_70761_aq = this.field_70177_z;
            this.field_70759_as = this.field_70761_aq;
            float strafe2 = player.field_70702_br * 0.5f;
            float forward2 = player.field_191988_bg;
            if (forward2 <= 0.0f) {
                forward2 *= 0.25f;
            }
            this.field_70747_aH = func_70689_ay() * 0.1f;
            if (func_184186_bw()) {
                func_70659_e(player.func_70689_ay() * 2.0f);
                doTravel(strafe2, vertical, forward2);
            } else {
                this.field_70159_w = 0.0d;
                this.field_70181_x = 0.0d;
                this.field_70179_y = 0.0d;
            }
            this.field_184618_aE = this.field_70721_aZ;
            double d1 = this.field_70165_t - this.field_70169_q;
            double d0 = this.field_70161_v - this.field_70166_s;
            float f2 = MathHelper.func_76133_a((d1 * d1) + (d0 * d0)) * 4.0f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            this.field_70721_aZ += (f2 - this.field_70721_aZ) * 0.4f;
            this.field_184619_aG += this.field_70721_aZ;
            return;
        }
        this.field_70159_w = 0.0d;
        this.field_70181_x = 0.0d;
        this.field_70179_y = 0.0d;
        this.field_70747_aH = 0.02f;
        doTravel(strafe, vertical, forward);
    }

    private void doTravel(float strafe, float vertical, float forward) {
        func_191958_b(strafe, vertical, forward, this.field_70747_aH);
        func_70091_d(MoverType.SELF, this.field_70159_w, this.field_70181_x, this.field_70179_y);
    }

    protected void setItemStack(ItemStack itemStack) {
        this.field_70180_af.func_187227_b(SWORD_ITEM_STACK, itemStack);
    }

    public ItemStack getItemStack() {
        return (ItemStack) this.field_70180_af.func_187225_a(SWORD_ITEM_STACK);
    }

    public UUID getOwnerID() {
        return (UUID) ((Optional) this.field_70180_af.func_187225_a(OWNER_UNIQUE_ID)).orNull();
    }

    protected void setOwnerID(@Nullable UUID uniqueID) {
        this.field_70180_af.func_187227_b(OWNER_UNIQUE_ID, Optional.fromNullable(uniqueID));
    }

    public EntityPlayer getOwner() {
        try {
            UUID uuid = getOwnerID();
            if (uuid == null) {
                return null;
            }
            return this.field_70170_p.func_152378_a(uuid);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public boolean isOwner(Entity entityIn) {
        return (entityIn instanceof EntityPlayer) && entityIn == getOwner();
    }

    public EntityPlayer getControllingPlayer() {
        EntityPlayer func_184179_bs = func_184179_bs();
        if (func_184179_bs instanceof EntityPlayer) {
            return func_184179_bs;
        }
        return null;
    }

    @Override // edebe.flyinginstrument.entity.IFlyingInstrumentEntity
    public void putAwaySword(EntityPlayer player) {
        if (!this.field_70170_p.field_72995_K) {
            ItemStack sword = getItemStack();
            if (!player.func_191521_c(sword)) {
                func_70099_a(sword, 0.0f);
            }
        }
        this.field_70170_p.func_72900_e(this);
    }

    @SideOnly(Side.CLIENT)
    protected void updateClientControls() {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (isRidingPlayer(minecraft.field_71439_g)) {
            up(minecraft.field_71474_y.field_74314_A.func_151470_d());
            down(ModKeys.FLYING_INSTRUMENT_DOWN.func_151470_d());
        }
    }

    private boolean up() {
        return (((Byte) this.field_70180_af.func_187225_a(CONTROL_STATE)).byteValue() & 1) == 1;
    }

    private boolean down() {
        return ((((Byte) this.field_70180_af.func_187225_a(CONTROL_STATE)).byteValue() >> 1) & 1) == 1;
    }

    private void up(boolean up) {
        setStateField(0, up);
    }

    private void down(boolean down) {
        setStateField(1, down);
    }

    private void setStateField(int i, boolean newState) {
        byte prevState = ((Byte) this.field_70180_af.func_187225_a(CONTROL_STATE)).byteValue();
        if (!newState) {
            this.field_70180_af.func_187227_b(CONTROL_STATE, Byte.valueOf((byte) (prevState & ((1 << i) ^ (-1)))));
        } else {
            this.field_70180_af.func_187227_b(CONTROL_STATE, Byte.valueOf((byte) (prevState | (1 << i))));
        }
    }

    private boolean isRidingPlayer(EntityPlayer player) {
        return func_184207_aI() && func_184179_bs() == player;
    }
}
