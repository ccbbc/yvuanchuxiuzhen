package by.ts.fanrenxiuxian.command;

import by.ts.fanrenxiuxian.FanRenXiuXianMod;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/command/AttributeCommand.class */
public class AttributeCommand extends FRCommand {
    public static final Map<String, Wrapper> ATTRIBUTES = ImmutableMap.builder().put("MAX_HEALTH", new Wrapper(SharedMonsterAttributes.field_111267_a, UUID.fromString("2EAB36F8-1D7A-43E6-53FD-A6052C1FD6F4"))).put("FOLLOW_RANGE", new Wrapper(SharedMonsterAttributes.field_111265_b, UUID.fromString("C7B28765-21BA-53FF-2504-2B1594A75A90"))).put("KNOCKBACK_RESISTANCE", new Wrapper(SharedMonsterAttributes.field_111266_c, UUID.fromString("6C244AC2-2D98-3CF2-B057-910F455EE890"))).put("MOVEMENT_SPEED", new Wrapper(SharedMonsterAttributes.field_111263_d, UUID.fromString("ED615E96-1B64-7FEE-D95A-620FEE8D656A"))).put("FLYING_SPEED", new Wrapper(SharedMonsterAttributes.field_193334_e, UUID.fromString("37A1E980-DFFB-5426-17A0-9457516FFF5C"))).put("ATTACK_DAMAGE", new Wrapper(SharedMonsterAttributes.field_111264_e, UUID.fromString("AC4D001D-D141-9769-A1F0-1682979D4D01"))).put("ATTACK_SPEED", new Wrapper(SharedMonsterAttributes.field_188790_f, UUID.fromString("1332BB5F-6A04-74D8-3E01-C29673DE8CEC"))).put("ARMOR", new Wrapper(SharedMonsterAttributes.field_188791_g, UUID.fromString("F1D1B478-DCFD-884D-EF0A-C945F2798209"))).put("ARMOR_TOUGHNESS", new Wrapper(SharedMonsterAttributes.field_189429_h, UUID.fromString("C35458CB-646A-AF09-A8D3-C99BB0E1EA3F"))).put("LUCK", new Wrapper(SharedMonsterAttributes.field_188792_h, UUID.fromString("B9E9ACE5-0B93-3BED-DBC9-B3521A7EDA6D"))).build();

    public AttributeCommand() {
        super("attribute");
    }

    private static void applyAttr(EntityLivingBase living, IAttribute attr, UUID modifierUuid, String attrName, double amount, int operation, boolean saved) {
        IAttributeInstance attrIns = living.func_110148_a(attr);
        if (attrIns != null) {
            attrIns.func_111127_a(modifierUuid);
            attrIns.func_188479_b(modifierUuid);
            AttributeModifier newModifier = new AttributeModifier(modifierUuid, attrName, amount, operation).func_111168_a(saved);
            attrIns.func_111121_a(newModifier);
        }
    }

    public void func_184881_a(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        World[] worldArr;
        if (args.length == 3) {
            String attrName = args[0];
            String livingName = args[1];
            double value = Double.parseDouble(args[2]);
            for (World world : server.field_71305_c) {
                world.field_72996_f.stream().forEach(e -> {
                    if ((e instanceof EntityLivingBase) && e.func_70005_c_().equals(livingName)) {
                        Wrapper w = ATTRIBUTES.get(attrName);
                        applyAttr((EntityLivingBase) e, w.attribute, w.uuid, attrName, value, 0, true);
                    }
                });
            }
            return;
        }
        FanRenXiuXianMod.logger.error("命令错误");
    }

    public int func_82362_a() {
        return 2;
    }

    public List<String> func_184883_a(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        List<String> result = new ArrayList<>();
        int currentArgsIndex = args.length - 1;
        if (currentArgsIndex == 0) {
            result.addAll(CommandBase.func_175762_a(args, ATTRIBUTES.keySet()));
        } else if (currentArgsIndex == 1) {
            String entityName = args[currentArgsIndex];
            Set<String> names = getEntityNameSet(server, entityName);
            result.addAll(CommandBase.func_175762_a(args, names));
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/command/AttributeCommand$Wrapper.class */
    public static class Wrapper {
        private IAttribute attribute;
        private UUID uuid;

        public Wrapper(IAttribute attribute, UUID uuid) {
            this.attribute = attribute;
            this.uuid = uuid;
        }
    }
}
