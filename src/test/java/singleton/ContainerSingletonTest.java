package singleton;

import singleton.register.ContainerSingleton;

public class ContainerSingletonTest {

    public static void main(String[] args) {


        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {

                public void handler() {
                    Object obj = ContainerSingleton.getBean("singleton.Hoge");
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
