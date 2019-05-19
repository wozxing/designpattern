package singleton;

import singleton.seriable.SeriableSingleton;

import java.io.*;

public class SeriableSingletonTest {

    public static void main(String[] args) {

        SeriableSingleton instance1 = SeriableSingleton.getInstance();
        SeriableSingleton instance2 = null;


        try {
            FileOutputStream fos = new FileOutputStream("seriablesingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(instance1);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("seriablesingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);

            instance2 = (SeriableSingleton) ois.readObject();

            System.out.println(instance1);
            System.out.println(instance2);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
