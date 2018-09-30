package com.cicinnus.spring.design.pattern.singleton.eager;

/**
 * 饿汉式单例
 * @author roger
 * @date 2018/9/25
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
