package singleton.lazy;

public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){
    }

    public  static final LazyDoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == instance) {
                instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
