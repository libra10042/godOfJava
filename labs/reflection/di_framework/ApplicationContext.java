package labs.reflection.di_framework;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;

public class ApplicationContext {

    public static <T> T getInstance(Class<T> clazz) throws Exception {
        T instance = createInstance(clazz); // 인스턴스 생성.
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            if(field.getAnnotation(Autowired.class) != null) {
                Object fieldInstance = createInstance(field.getType());
                field.setAccessible(true);
                field.set(instance, fieldInstance);
            }
        }
        return instance;
    }

    private static <T> T createInstance(Class<T> clazz) throws Exception {
        return clazz.getConstructor(null).newInstance();
    }
}
