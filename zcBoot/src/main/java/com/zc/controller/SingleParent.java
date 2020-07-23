package com.zc.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/22 17:50
 **/
public class SingleParent {
    private static Map<Class<? extends SingleParent>, SingleParent> INSTANCE_MAP = new HashMap(16);

    private SingleParent() {
    }

    public synchronized static <E extends SingleParent>SingleParent getInstance(Class<E> instanceClass) throws IllegalAccessException, InstantiationException {
        if (!INSTANCE_MAP.containsKey(instanceClass)) {
            SingleParent instance = instanceClass.newInstance();
            INSTANCE_MAP.put(instanceClass, instance);
        }
        return INSTANCE_MAP.get(instanceClass);
    }
}
  
   