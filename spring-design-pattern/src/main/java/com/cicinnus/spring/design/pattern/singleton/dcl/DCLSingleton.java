package com.cicinnus.spring.design.pattern.singleton.dcl;

/**
 * 双重锁校验单例
 *
 * @author roger
 * @date 2018/9/24
 */
public class DCLSingleton {
    private static volatile DCLSingleton instance = null;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
