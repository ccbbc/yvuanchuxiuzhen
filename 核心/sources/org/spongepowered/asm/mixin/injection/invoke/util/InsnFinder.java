package org.spongepowered.asm.mixin.injection.invoke.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.Interpreter;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.injection.struct.Target;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/util/InsnFinder.class */
public class InsnFinder {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/util/InsnFinder$AnalyzerState.class */
    public enum AnalyzerState {
        SEARCH,
        ANALYSE,
        COMPLETE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/util/InsnFinder$AnalysisResultException.class */
    public static class AnalysisResultException extends RuntimeException {
        private static final long serialVersionUID = 1;
        private AbstractInsnNode result;

        public AnalysisResultException(AbstractInsnNode popNode) {
            this.result = popNode;
        }

        public AbstractInsnNode getResult() {
            return this.result;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/util/InsnFinder$PopAnalyzer.class */
    public static class PopAnalyzer extends Analyzer<BasicValue> {
        protected final AbstractInsnNode node;

        /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/util/InsnFinder$PopAnalyzer$PopFrame.class */
        class PopFrame extends Frame<BasicValue> {
            private AbstractInsnNode current;
            private AnalyzerState state;
            private int depth;

            public PopFrame(int locals, int stack) {
                super(locals, stack);
                this.state = AnalyzerState.SEARCH;
                this.depth = 0;
            }

            public void execute(AbstractInsnNode insn, Interpreter<BasicValue> interpreter) throws AnalyzerException {
                this.current = insn;
                super.execute(insn, interpreter);
            }

            public void push(BasicValue value) throws IndexOutOfBoundsException {
                if (this.current == PopAnalyzer.this.node && this.state == AnalyzerState.SEARCH) {
                    this.state = AnalyzerState.ANALYSE;
                    this.depth++;
                } else if (this.state == AnalyzerState.ANALYSE) {
                    this.depth++;
                }
                super.push(value);
            }

            /* renamed from: pop */
            public BasicValue m40pop() throws IndexOutOfBoundsException {
                if (this.state == AnalyzerState.ANALYSE) {
                    int i = this.depth - 1;
                    this.depth = i;
                    if (i == 0) {
                        this.state = AnalyzerState.COMPLETE;
                        throw new AnalysisResultException(this.current);
                    }
                }
                return super.pop();
            }
        }

        public PopAnalyzer(AbstractInsnNode node) {
            super(new BasicInterpreter());
            this.node = node;
        }

        protected Frame<BasicValue> newFrame(int locals, int stack) {
            return new PopFrame(locals, stack);
        }
    }

    public AbstractInsnNode findPopInsn(Target target, AbstractInsnNode node) {
        try {
            new PopAnalyzer(node).analyze(target.classNode.name, target.method);
            return null;
        } catch (AnalyzerException ex) {
            if (ex.getCause() instanceof AnalysisResultException) {
                return ((AnalysisResultException) ex.getCause()).getResult();
            }
            logger.catching(ex);
            return null;
        }
    }
}
