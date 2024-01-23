package org.spongepowered.tools.agent;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.transformer.IMixinTransformer;
import org.spongepowered.asm.mixin.transformer.ext.IHotSwap;
import org.spongepowered.asm.mixin.transformer.throwables.MixinReloadException;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.asm.ASM;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/agent/MixinAgent.class */
public class MixinAgent implements IHotSwap {
    public static final byte[] ERROR_BYTECODE = {1};
    static final MixinAgentClassLoader classLoader = new MixinAgentClassLoader();
    static final Logger logger = LogManager.getLogger("mixin.agent");
    static Instrumentation instrumentation = null;
    private static List<MixinAgent> agents = new ArrayList();
    final IMixinTransformer classTransformer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/agent/MixinAgent$Transformer.class */
    public class Transformer implements ClassFileTransformer {
        Transformer() {
        }

        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain domain, byte[] classfileBuffer) throws IllegalClassFormatException {
            if (classBeingRedefined == null) {
                return null;
            }
            byte[] mixinBytecode = MixinAgent.classLoader.getFakeMixinBytecode(classBeingRedefined);
            if (mixinBytecode != null) {
                ClassNode classNode = new ClassNode(ASM.API_VERSION);
                ClassReader cr = new ClassReader(classfileBuffer);
                cr.accept(classNode, 8);
                List<String> targets = reloadMixin(className, classNode);
                if (targets == null || !reApplyMixins(targets)) {
                    return MixinAgent.ERROR_BYTECODE;
                }
                return mixinBytecode;
            }
            try {
                MixinAgent.logger.info("Redefining class " + className);
                return MixinAgent.this.classTransformer.transformClassBytes(null, className, classfileBuffer);
            } catch (Throwable th) {
                MixinAgent.logger.error("Error while re-transforming class " + className, th);
                return MixinAgent.ERROR_BYTECODE;
            }
        }

        private List<String> reloadMixin(String className, ClassNode classNode) {
            MixinAgent.logger.info("Redefining mixin {}", new Object[]{className});
            try {
                return MixinAgent.this.classTransformer.reload(className.replace('/', '.'), classNode);
            } catch (MixinReloadException e) {
                MixinAgent.logger.error("Mixin {} cannot be reloaded, needs a restart to be applied: {} ", new Object[]{e.getMixinInfo(), e.getMessage()});
                return null;
            } catch (Throwable th) {
                MixinAgent.logger.error("Error while finding targets for mixin " + className, th);
                return null;
            }
        }

        private boolean reApplyMixins(List<String> targets) {
            IMixinService service = MixinService.getService();
            for (String target : targets) {
                String targetName = target.replace('/', '.');
                MixinAgent.logger.debug("Re-transforming target class {}", new Object[]{target});
                try {
                    Class<?> targetClass = service.getClassProvider().findClass(targetName);
                    byte[] targetBytecode = MixinAgent.classLoader.getOriginalTargetBytecode(targetName);
                    if (targetBytecode == null) {
                        MixinAgent.logger.error("Target class {} bytecode is not registered", new Object[]{targetName});
                        return false;
                    }
                    MixinAgent.instrumentation.redefineClasses(new ClassDefinition[]{new ClassDefinition(targetClass, MixinAgent.this.classTransformer.transformClassBytes(null, targetName, targetBytecode))});
                } catch (Throwable th) {
                    MixinAgent.logger.error("Error while re-transforming target class " + target, th);
                    return false;
                }
            }
            return true;
        }
    }

    public MixinAgent(IMixinTransformer classTransformer) {
        this.classTransformer = classTransformer;
        agents.add(this);
        if (instrumentation != null) {
            initTransformer();
        }
    }

    private void initTransformer() {
        instrumentation.addTransformer(new Transformer(), true);
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IHotSwap
    public void registerMixinClass(String name) {
        classLoader.addMixinClass(name);
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IHotSwap
    public void registerTargetClass(String name, ClassNode classNode) {
        classLoader.addTargetClass(name, classNode);
    }

    public static void init(Instrumentation instrumentation2) {
        instrumentation = instrumentation2;
        if (!instrumentation.isRedefineClassesSupported()) {
            logger.error("The instrumentation doesn't support re-definition of classes");
        }
        for (MixinAgent agent : agents) {
            agent.initTransformer();
        }
    }

    public static void premain(String arg, Instrumentation instrumentation2) {
        System.setProperty("mixin.hotSwap", "true");
        init(instrumentation2);
    }

    public static void agentmain(String arg, Instrumentation instrumentation2) {
        init(instrumentation2);
    }
}
