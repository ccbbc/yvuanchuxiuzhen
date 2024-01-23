package org.spongepowered.tools.obfuscation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/ObfuscationDataProvider.class */
public class ObfuscationDataProvider implements IObfuscationDataProvider {
    private final IMixinAnnotationProcessor ap;
    private final List<ObfuscationEnvironment> environments;

    public ObfuscationDataProvider(IMixinAnnotationProcessor ap, List<ObfuscationEnvironment> environments) {
        this.ap = ap;
        this.environments = environments;
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public <T> ObfuscationData<T> getObfEntryRecursive(ITargetSelectorRemappable targetMember) {
        ObfuscationData<String> obfTargetNames = getObfClass(targetMember.getOwner());
        ObfuscationData<T> obfData = getObfEntry(targetMember);
        try {
            if (obfData.isEmpty()) {
                obfData = getObfEntryRecursive(targetMember, new HashSet());
            }
            if (!obfData.isEmpty()) {
                return applyParents(obfTargetNames, obfData);
            }
            return obfData;
        } catch (Exception ex) {
            ex.printStackTrace();
            return getObfEntry(targetMember);
        }
    }

    private <T> ObfuscationData<T> getObfEntryRecursive(ITargetSelectorRemappable targetMember, Set<String> visited) {
        TypeHandle targetType = this.ap.getTypeProvider().getTypeHandle(targetMember.getOwner());
        if (targetType == null || !visited.add(targetType.toString())) {
            return new ObfuscationData<>();
        }
        TypeHandle superClass = targetType.getSuperclass();
        for (TypeHandle iface : targetType.getInterfaces()) {
            ObfuscationData<T> obfData = getObfEntryUsing(targetMember, iface);
            if (!obfData.isEmpty()) {
                return obfData;
            }
            ObfuscationData<T> obfData2 = getObfEntryRecursive(targetMember.move(iface.getName()), visited);
            if (!obfData2.isEmpty()) {
                return obfData2;
            }
        }
        if (superClass != null) {
            ObfuscationData<T> obfData3 = getObfEntryUsing(targetMember, superClass);
            if (!obfData3.isEmpty()) {
                return obfData3;
            }
            return getObfEntryRecursive(targetMember.move(superClass.getName()), visited);
        }
        return new ObfuscationData<>();
    }

    private <T> ObfuscationData<T> getObfEntryUsing(ITargetSelectorRemappable targetMember, TypeHandle targetClass) {
        return targetClass == null ? new ObfuscationData<>() : getObfEntry(targetMember.move(targetClass.getName()));
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public <T> ObfuscationData<T> getObfEntry(ITargetSelectorRemappable targetMember) {
        if (targetMember.isField()) {
            return (ObfuscationData<T>) getObfField(targetMember);
        }
        return (ObfuscationData<T>) getObfMethod(targetMember.asMethodMapping());
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public <T> ObfuscationData<T> getObfEntry(IMapping<T> mapping) {
        if (mapping != null) {
            if (mapping.getType() == IMapping.Type.FIELD) {
                return (ObfuscationData<T>) getObfField((MappingField) mapping);
            }
            if (mapping.getType() == IMapping.Type.METHOD) {
                return (ObfuscationData<T>) getObfMethod((MappingMethod) mapping);
            }
        }
        return new ObfuscationData<>();
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingMethod> getObfMethodRecursive(ITargetSelectorRemappable targetMember) {
        return getObfEntryRecursive(targetMember);
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingMethod> getObfMethod(ITargetSelectorRemappable method) {
        return getRemappedMethod(method, method.isConstructor());
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingMethod> getRemappedMethod(ITargetSelectorRemappable method) {
        return getRemappedMethod(method, true);
    }

    private ObfuscationData<MappingMethod> getRemappedMethod(ITargetSelectorRemappable method, boolean remapDescriptor) {
        ObfuscationData<MappingMethod> data = new ObfuscationData<>();
        for (ObfuscationEnvironment env : this.environments) {
            MappingMethod obfMethod = env.getObfMethod(method);
            if (obfMethod != null) {
                data.put(env.getType(), obfMethod);
            }
        }
        if (!data.isEmpty() || !remapDescriptor) {
            return data;
        }
        return remapDescriptor(data, method);
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingMethod> getObfMethod(MappingMethod method) {
        return getRemappedMethod(method, method.isConstructor());
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingMethod> getRemappedMethod(MappingMethod method) {
        return getRemappedMethod(method, true);
    }

    private ObfuscationData<MappingMethod> getRemappedMethod(MappingMethod method, boolean remapDescriptor) {
        ObfuscationData<MappingMethod> data = new ObfuscationData<>();
        for (ObfuscationEnvironment env : this.environments) {
            MappingMethod obfMethod = env.getObfMethod(method);
            if (obfMethod != null) {
                data.put(env.getType(), obfMethod);
            }
        }
        if (!data.isEmpty() || !remapDescriptor) {
            return data;
        }
        return remapDescriptor(data, new MemberInfo(method));
    }

    public ObfuscationData<MappingMethod> remapDescriptor(ObfuscationData<MappingMethod> data, ITargetSelectorRemappable method) {
        for (ObfuscationEnvironment env : this.environments) {
            ITargetSelectorRemappable obfMethod = env.remapDescriptor(method);
            if (obfMethod != null) {
                data.put(env.getType(), obfMethod.asMethodMapping());
            }
        }
        return data;
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingField> getObfFieldRecursive(ITargetSelectorRemappable targetMember) {
        return getObfEntryRecursive(targetMember);
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingField> getObfField(ITargetSelectorRemappable field) {
        return getObfField(field.asFieldMapping());
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<MappingField> getObfField(MappingField field) {
        ObfuscationData<MappingField> data = new ObfuscationData<>();
        for (ObfuscationEnvironment env : this.environments) {
            MappingField obfField = env.getObfField(field);
            if (obfField != null) {
                if (obfField.getDesc() == null && field.getDesc() != null) {
                    obfField = obfField.transform(env.remapDescriptor(field.getDesc()));
                }
                data.put(env.getType(), obfField);
            }
        }
        return data;
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<String> getObfClass(TypeHandle type) {
        return getObfClass(type.getName());
    }

    @Override // org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider
    public ObfuscationData<String> getObfClass(String className) {
        ObfuscationData<String> data = new ObfuscationData<>(className);
        for (ObfuscationEnvironment env : this.environments) {
            String obfClass = env.getObfClass(className);
            if (obfClass != null) {
                data.put(env.getType(), obfClass);
            }
        }
        return data;
    }

    private static <T> ObfuscationData<T> applyParents(ObfuscationData<String> parents, ObfuscationData<T> members) {
        Iterator<ObfuscationType> it = members.iterator();
        while (it.hasNext()) {
            ObfuscationType type = it.next();
            String obfClass = parents.get(type);
            T obfMember = members.get(type);
            members.put(type, MemberInfo.fromMapping((IMapping) obfMember).move(obfClass).asMapping());
        }
        return members;
    }
}
