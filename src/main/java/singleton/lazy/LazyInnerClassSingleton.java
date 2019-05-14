package singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
    }

    public static final LazyInnerClassSingleton getInstance() {
        return InstanceCreator.INSTANCE;
    }

    private static final class InstanceCreator {

        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
