package org.spongepowered.asm.mixin.injection.code;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.throwables.InvalidSliceException;
import org.spongepowered.asm.util.Annotations;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/code/MethodSlices.class */
public final class MethodSlices {
    private final InjectionInfo info;
    private final Map<String, MethodSlice> slices = new HashMap(4);

    private MethodSlices(InjectionInfo info) {
        this.info = info;
    }

    private void add(MethodSlice slice) {
        String id = this.info.getSliceId(slice.getId());
        if (this.slices.containsKey(id)) {
            throw new InvalidSliceException(this.info, slice + " has a duplicate id, '" + id + "' was already defined");
        }
        this.slices.put(id, slice);
    }

    public MethodSlice get(String id) {
        return this.slices.get(id);
    }

    public String toString() {
        return String.format("MethodSlices%s", this.slices.keySet());
    }

    public static MethodSlices parse(InjectionInfo info) {
        MethodSlices slices = new MethodSlices(info);
        AnnotationNode annotation = info.getAnnotation();
        if (annotation != null) {
            for (AnnotationNode node : Annotations.getValue(annotation, "slice", true)) {
                MethodSlice slice = MethodSlice.parse(info, node);
                slices.add(slice);
            }
        }
        return slices;
    }
}
