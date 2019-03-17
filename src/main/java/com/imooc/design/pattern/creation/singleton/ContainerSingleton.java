package com.imooc.design.pattern.creation.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ContainerSingleton {
    private ContainerSingleton() {

    }

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (!key.isEmpty() && Objects.nonNull(instance)) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
