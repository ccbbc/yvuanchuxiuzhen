package org.spongepowered.tools.obfuscation.interfaces;

import javax.lang.model.type.TypeMirror;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/interfaces/ITypeHandleProvider.class */
public interface ITypeHandleProvider {
    TypeHandle getTypeHandle(String str);

    TypeHandle getSimulatedHandle(String str, TypeMirror typeMirror);
}
