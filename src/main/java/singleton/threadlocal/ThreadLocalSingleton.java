package singleton.threadlocal;

public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> local =
            new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return local.get();
    }
}
