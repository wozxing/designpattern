package singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if(null != InstanceCreator.INSTANCE) {
            throw new RuntimeException("不可以创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return InstanceCreator.INSTANCE;
    }

    private static final class InstanceCreator {

        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
