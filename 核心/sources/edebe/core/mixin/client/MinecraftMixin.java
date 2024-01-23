package edebe.core.mixin.client;

import edebe.doglib.api.event.KeyboardEvent;
import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.ReportedException;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({Minecraft.class})
/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/core/mixin/client/MinecraftMixin.class */
public abstract class MinecraftMixin {
    @Shadow
    public GameSettings field_71474_y;
    @Shadow
    private boolean field_184129_aV;
    @Shadow
    @Nullable
    public GuiScreen field_71462_r;
    @Shadow
    public EntityRenderer field_71460_t;
    @Shadow
    private long field_83002_am;

    @Shadow
    protected abstract void func_184117_aA();

    @Shadow
    protected abstract void func_71383_b(int i);

    @Shadow
    public abstract void func_71385_j();

    @Shadow
    protected abstract boolean func_184122_c(int i);

    @Shadow
    public abstract void func_152348_aa();

    @Shadow
    public static long func_71386_F() {
        throw new ExceptionInInitializerError();
    }

    @Overwrite
    private void func_184118_az() throws IOException {
        while (Keyboard.next()) {
            if (!MinecraftForge.EVENT_BUS.post(new KeyboardEvent.Pre())) {
                int i = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
                if (this.field_83002_am > 0) {
                    if (func_71386_F() - this.field_83002_am >= 6000) {
                        throw new ReportedException(new CrashReport("Manually triggered debug crash", new Throwable()));
                    }
                    if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                        this.field_83002_am = -1L;
                    }
                } else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
                    this.field_184129_aV = true;
                    this.field_83002_am = func_71386_F();
                }
                func_152348_aa();
                if (this.field_71462_r != null) {
                    this.field_71462_r.func_146282_l();
                }
                boolean flag = Keyboard.getEventKeyState();
                if (flag) {
                    if (i == 62 && this.field_71460_t != null) {
                        this.field_71460_t.func_175071_c();
                    }
                    boolean flag1 = false;
                    if (this.field_71462_r == null) {
                        if (i == 1) {
                            func_71385_j();
                        }
                        flag1 = Keyboard.isKeyDown(61) && func_184122_c(i);
                        this.field_184129_aV |= flag1;
                        if (i == 59) {
                            this.field_71474_y.field_74319_N = !this.field_71474_y.field_74319_N;
                        }
                    }
                    if (flag1) {
                        KeyBinding.func_74510_a(i, false);
                    } else {
                        KeyBinding.func_74510_a(i, true);
                        KeyBinding.func_74507_a(i);
                    }
                    if (this.field_71474_y.field_74329_Q) {
                        if (i == 11) {
                            func_71383_b(0);
                        }
                        for (int j = 0; j < 9; j++) {
                            if (i == 2 + j) {
                                func_71383_b(j + 1);
                            }
                        }
                    }
                } else {
                    KeyBinding.func_74510_a(i, false);
                    if (i == 61) {
                        if (this.field_184129_aV) {
                            this.field_184129_aV = false;
                        } else {
                            this.field_71474_y.field_74330_P = !this.field_71474_y.field_74330_P;
                            this.field_71474_y.field_74329_Q = this.field_71474_y.field_74330_P && GuiScreen.func_146272_n();
                            this.field_71474_y.field_181657_aC = this.field_71474_y.field_74330_P && GuiScreen.func_175283_s();
                        }
                    }
                }
            }
            FMLCommonHandler.instance().fireKeyInput();
        }
        if (!MinecraftForge.EVENT_BUS.post(new KeyboardEvent())) {
            func_184117_aA();
        }
    }
}
