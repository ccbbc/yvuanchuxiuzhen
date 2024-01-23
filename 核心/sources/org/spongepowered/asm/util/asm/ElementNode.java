package org.spongepowered.asm.util.asm;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/asm/ElementNode.class */
public abstract class ElementNode<TNode> {
    private final ClassNode owner;

    public abstract String getName();

    public abstract String getDesc();

    public abstract String getSignature();

    public abstract TNode get();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/asm/ElementNode$ElementNodeMethod.class */
    public static class ElementNodeMethod extends ElementNode<MethodNode> {
        private MethodNode method;

        ElementNodeMethod(ClassNode owner, MethodNode method) {
            super(owner);
            this.method = method;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public boolean isMethod() {
            return true;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public MethodNode getMethod() {
            return this.method;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public String getName() {
            return this.method.name;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public String getDesc() {
            return this.method.desc;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public String getSignature() {
            return this.method.signature;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.spongepowered.asm.util.asm.ElementNode
        public MethodNode get() {
            return this.method;
        }

        public String toString() {
            return String.format("MethodElement[%s%s]", this.method.name, this.method.desc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/asm/ElementNode$ElementNodeField.class */
    public static class ElementNodeField extends ElementNode<FieldNode> {
        private FieldNode field;

        ElementNodeField(ClassNode owner, FieldNode field) {
            super(owner);
            this.field = field;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public boolean isField() {
            return true;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public FieldNode getField() {
            return this.field;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public String getName() {
            return this.field.name;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public String getDesc() {
            return this.field.desc;
        }

        @Override // org.spongepowered.asm.util.asm.ElementNode
        public String getSignature() {
            return this.field.signature;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.spongepowered.asm.util.asm.ElementNode
        public FieldNode get() {
            return this.field;
        }

        public String toString() {
            return String.format("FieldElement[%s:%s]", this.field.name, this.field.desc);
        }
    }

    protected ElementNode(ClassNode owner) {
        this.owner = owner;
    }

    public boolean isMethod() {
        return false;
    }

    public boolean isField() {
        return false;
    }

    public MethodNode getMethod() {
        return null;
    }

    public FieldNode getField() {
        return null;
    }

    public ClassNode getOwner() {
        return this.owner;
    }

    public String getOwnerName() {
        if (this.owner != null) {
            return this.owner.name;
        }
        return null;
    }

    public static ElementNode<MethodNode> of(ClassNode owner, MethodNode method) {
        return new ElementNodeMethod(owner, method);
    }

    public static ElementNode<FieldNode> of(ClassNode owner, FieldNode field) {
        return new ElementNodeField(owner, field);
    }

    public static <TNode> ElementNode<TNode> of(ClassNode owner, TNode node) {
        if (node instanceof MethodNode) {
            return new ElementNodeMethod(owner, (MethodNode) node);
        }
        if (node instanceof FieldNode) {
            return new ElementNodeField(owner, (FieldNode) node);
        }
        throw new IllegalArgumentException("Could not create ElementNode for unknown node type: " + node.getClass().getName());
    }

    public static <TNode> List<ElementNode<TNode>> listOf(ClassNode owner, List<TNode> list) {
        List<ElementNode<TNode>> nodes = new ArrayList<>();
        for (TNode node : list) {
            nodes.add(of(owner, node));
        }
        return nodes;
    }

    public static List<ElementNode<FieldNode>> fieldList(ClassNode owner) {
        List<ElementNode<FieldNode>> fields = new ArrayList<>();
        for (FieldNode field : owner.fields) {
            fields.add(new ElementNodeField(owner, field));
        }
        return fields;
    }

    public static List<ElementNode<MethodNode>> methodList(ClassNode owner) {
        List<ElementNode<MethodNode>> methods = new ArrayList<>();
        for (MethodNode method : owner.methods) {
            methods.add(new ElementNodeMethod(owner, method));
        }
        return methods;
    }
}
