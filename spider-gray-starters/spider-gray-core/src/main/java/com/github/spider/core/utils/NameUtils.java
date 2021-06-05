package com.github.spider.core.utils;

/**
 *
 * 借鉴spring-cloud-gateway中的过滤器工厂(GatewayFilterFactory中的方法)
 * @Author: lettger
 * @Date: 2021/5/27 1:26 下午
 */
public class NameUtils {

    private NameUtils() {
        throw new AssertionError("Must not instantiate utility class.");
    }

    /**
     * Generated name prefix.
     */
    public static final String GENERATED_NAME_PREFIX = "_genkey_";

    public static String generateName(int i) {
        return GENERATED_NAME_PREFIX + i;
    }

    public static <T> String normalizeName(Class<? extends T> clazz, Class<T> cls) {
        return removeGarbage(clazz.getSimpleName().replace(cls.getSimpleName(), ""));
    }

    private static String removeGarbage(String s) {
        int garbageIdx = s.indexOf("$Mockito");
        if (garbageIdx > 0) {
            return s.substring(0, garbageIdx);
        }
        return s;
    }

}
