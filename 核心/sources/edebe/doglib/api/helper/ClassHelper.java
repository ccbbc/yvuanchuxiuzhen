package edebe.doglib.api.helper;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:edebe/doglib/api/helper/ClassHelper.class */
public interface ClassHelper {
    static Class<?> getGenericSuperclass(Object object) {
        Type type = object.getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            System.out.println(parameterizedType.getActualTypeArguments()[0]);
            return (Class) parameterizedType.getActualTypeArguments()[0];
        }
        throw new RuntimeException();
    }
}
