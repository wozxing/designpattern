package singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton(){
    }

    public static LazySimpleSingleton getInstance() {
        if(null == instance) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
