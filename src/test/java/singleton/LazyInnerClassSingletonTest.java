package singleton;

import singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            LazyInnerClassSingleton instance1 = (LazyInnerClassSingleton)c.newInstance();
            LazyInnerClassSingleton instance2 = LazyInnerClassSingleton.getInstance();

            System.out.println(instance1 == instance2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
