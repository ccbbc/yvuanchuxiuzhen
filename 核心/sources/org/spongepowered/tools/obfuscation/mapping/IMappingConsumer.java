package org.spongepowered.tools.obfuscation.mapping;

import com.google.common.base.Objects;
import java.util.LinkedHashSet;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.ObfuscationType;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/IMappingConsumer.class */
public interface IMappingConsumer {
    void clear();

    void addFieldMapping(ObfuscationType obfuscationType, MappingField mappingField, MappingField mappingField2);

    void addMethodMapping(ObfuscationType obfuscationType, MappingMethod mappingMethod, MappingMethod mappingMethod2);

    MappingSet<MappingField> getFieldMappings(ObfuscationType obfuscationType);

    MappingSet<MappingMethod> getMethodMappings(ObfuscationType obfuscationType);

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/IMappingConsumer$MappingSet.class */
    public static class MappingSet<TMapping extends IMapping<TMapping>> extends LinkedHashSet<Pair<TMapping>> {
        private static final long serialVersionUID = 1;

        /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/IMappingConsumer$MappingSet$Pair.class */
        public static class Pair<TMapping extends IMapping<TMapping>> {
            public final TMapping from;
            public final TMapping to;

            public Pair(TMapping from, TMapping to) {
                this.from = from;
                this.to = to;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Pair)) {
                    return false;
                }
                Pair<TMapping> other = (Pair) obj;
                return Objects.equal(this.from, other.from) && Objects.equal(this.to, other.to);
            }

            public int hashCode() {
                return Objects.hashCode(new Object[]{this.from, this.to});
            }

            public String toString() {
                return String.format("%s -> %s", this.from, this.to);
            }
        }
    }
}
