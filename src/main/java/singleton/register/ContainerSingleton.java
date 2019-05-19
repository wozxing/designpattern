package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static Map<String,Object> objMap = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {

    }


    public static final Object getBean(String clazzName) {
        synchronized (objMap) {
            if (null == clazzName) {
                throw new IllegalArgumentException("clazzName cannot be null");
            }
            if(objMap.containsKey(clazzName)) {
                return objMap.get(clazzName);
            }
            Object obj = null;
            try {
                obj = Class.forName(clazzName).newInstance();
                objMap.put(clazzName,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }
    }

}
