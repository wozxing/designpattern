package singleton;

import singleton.enumsingleton.EnumSingleton;

import java.io.*;

public class EnumSingletonTest {

    public static void main(String[] args) {

        EnumSingleton e1 = null;
        EnumSingleton e2 = EnumSingleton.getInstance();
        e2.setData(new Object());

        FileOutputStream fos = null;
        FileInputStream fis = null;

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            fos = new FileOutputStream("enumsingleton.obj");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(e2);
            oos.flush();


            fis = new FileInputStream("enumsingleton.obj");
            ois = new ObjectInputStream(fis);
            e1 = (EnumSingleton) ois.readObject();


            System.out.println(e1.getData());
            System.out.println(e2.getData());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
