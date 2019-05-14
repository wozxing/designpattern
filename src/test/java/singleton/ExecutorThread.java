package singleton;

import singleton.lazy.LazyInnerClassSingleton;

public class ExecutorThread implements Runnable {

    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "," + instance);
    }
}
