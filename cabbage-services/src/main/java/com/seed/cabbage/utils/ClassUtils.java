package com.seed.cabbage.utils;

public class ClassUtils {

    public static Class<?>  getClass(ClassLoader classLoader, String className) throws ClassNotFoundException {
        return classLoader.loadClass(className);
    }

    public static Class<?> getClass(String className) throws ClassNotFoundException {
        return getClass(ClassUtils.class.getClassLoader(), className);
    }

    public static  Class<?> classForName(String className)throws ClassNotFoundException  {
        return Class.forName(className);
    }
}