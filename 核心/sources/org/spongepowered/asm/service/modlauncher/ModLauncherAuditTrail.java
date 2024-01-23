package org.spongepowered.asm.service.modlauncher;

import java.util.function.Consumer;
import org.spongepowered.asm.service.IMixinAuditTrail;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/modlauncher/ModLauncherAuditTrail.class */
public class ModLauncherAuditTrail implements IMixinAuditTrail {
    private static final String APPLY_MIXIN_ACTIVITY = "APP";
    private static final String POST_PROCESS_ACTIVITY = "DEC";
    private static final String GENERATE_ACTIVITY = "GEN";
    private String currentClass;
    private Consumer<String[]> consumer;

    public void setConsumer(String className, Consumer<String[]> consumer) {
        this.currentClass = className;
        this.consumer = consumer;
    }

    @Override // org.spongepowered.asm.service.IMixinAuditTrail
    public void onApply(String className, String mixinName) {
        writeActivity(className, APPLY_MIXIN_ACTIVITY, mixinName);
    }

    @Override // org.spongepowered.asm.service.IMixinAuditTrail
    public void onPostProcess(String className) {
        writeActivity(className, POST_PROCESS_ACTIVITY);
    }

    @Override // org.spongepowered.asm.service.IMixinAuditTrail
    public void onGenerate(String className, String generatorName) {
        writeActivity(className, GENERATE_ACTIVITY);
    }

    private void writeActivity(String className, String... activity) {
        if (this.consumer != null && className.equals(this.currentClass)) {
            this.consumer.accept(activity);
        }
    }
}
