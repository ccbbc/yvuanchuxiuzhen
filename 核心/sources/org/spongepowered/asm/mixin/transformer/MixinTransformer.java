package org.spongepowered.asm.mixin.transformer;

import java.util.List;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.IExtensionRegistry;
import org.spongepowered.asm.mixin.transformer.ext.IHotSwap;
import org.spongepowered.asm.transformers.TreeTransformer;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.asm.ASM;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinTransformer.class */
class MixinTransformer extends TreeTransformer implements IMixinTransformer {
    private static final String MIXIN_AGENT_CLASS = "org.spongepowered.tools.agent.MixinAgent";
    private final SyntheticClassRegistry syntheticClassRegistry;
    private final Extensions extensions;
    private final IHotSwap hotSwapper;
    private final MixinProcessor processor;
    private final MixinClassGenerator generator;

    public MixinTransformer() {
        MixinEnvironment environment = MixinEnvironment.getCurrentEnvironment();
        Object globalMixinTransformer = environment.getActiveTransformer();
        if (globalMixinTransformer instanceof IMixinTransformer) {
            throw new MixinException("Terminating MixinTransformer instance " + this);
        }
        environment.setActiveTransformer(this);
        this.syntheticClassRegistry = new SyntheticClassRegistry();
        this.extensions = new Extensions(this.syntheticClassRegistry);
        this.hotSwapper = initHotSwapper(environment);
        this.processor = new MixinProcessor(environment, this.extensions, this.hotSwapper);
        this.generator = new MixinClassGenerator(environment, this.extensions);
        DefaultExtensions.create(environment, this.extensions, this.syntheticClassRegistry);
    }

    private IHotSwap initHotSwapper(MixinEnvironment environment) {
        if (!environment.getOption(MixinEnvironment.Option.HOT_SWAP)) {
            return null;
        }
        try {
            MixinProcessor.logger.info("Attempting to load Hot-Swap agent");
            return (IHotSwap) Class.forName(MIXIN_AGENT_CLASS).getDeclaredConstructor(IMixinTransformer.class).newInstance(this);
        } catch (Throwable th) {
            MixinProcessor.logger.info("Hot-swap agent could not be loaded, hot swapping of mixins won't work. {}: {}", new Object[]{th.getClass().getSimpleName(), th.getMessage()});
            return null;
        }
    }

    @Override // org.spongepowered.asm.mixin.transformer.IMixinTransformer
    public IExtensionRegistry getExtensions() {
        return this.extensions;
    }

    @Override // org.spongepowered.asm.service.ITransformer
    public String getName() {
        return getClass().getName();
    }

    @Override // org.spongepowered.asm.service.ITransformer
    public boolean isDelegationExcluded() {
        return true;
    }

    @Override // org.spongepowered.asm.mixin.transformer.IMixinTransformer
    public void audit(MixinEnvironment environment) {
        this.processor.audit(environment);
    }

    @Override // org.spongepowered.asm.mixin.transformer.IMixinTransformer
    public List<String> reload(String mixinClass, ClassNode classNode) {
        return this.processor.reload(mixinClass, classNode);
    }

    @Override // org.spongepowered.asm.service.ILegacyClassTransformer, org.spongepowered.asm.mixin.transformer.IMixinTransformer
    public byte[] transformClassBytes(String name, String transformedName, byte[] basicClass) {
        if (transformedName == null) {
            return basicClass;
        }
        MixinEnvironment environment = MixinEnvironment.getCurrentEnvironment();
        if (basicClass == null) {
            return generateClass(environment, transformedName);
        }
        return transformClass(environment, transformedName, basicClass);
    }

    public boolean computeFramesForClass(MixinEnvironment environment, String name, ClassNode classNode) {
        return false;
    }

    public byte[] transformClass(MixinEnvironment environment, String name, byte[] classBytes) {
        ClassNode classNode = readClass(classBytes);
        if (this.processor.applyMixins(environment, name, classNode)) {
            return writeClass(classNode);
        }
        return classBytes;
    }

    public boolean transformClass(MixinEnvironment environment, String name, ClassNode classNode) {
        return this.processor.applyMixins(environment, name, classNode);
    }

    public byte[] generateClass(MixinEnvironment environment, String name) {
        ClassNode classNode = createEmptyClass(name);
        if (this.generator.generateClass(environment, name, classNode)) {
            return writeClass(classNode);
        }
        return null;
    }

    public boolean generateClass(MixinEnvironment environment, String name, ClassNode classNode) {
        return this.generator.generateClass(environment, name, classNode);
    }

    private static ClassNode createEmptyClass(String name) {
        ClassNode classNode = new ClassNode(ASM.API_VERSION);
        classNode.name = name.replace('.', '/');
        classNode.version = MixinEnvironment.getCompatibilityLevel().classVersion();
        classNode.superName = Constants.OBJECT;
        return classNode;
    }
}
