package com.cicinnus.spring.design.pattern.singleton.inner;

/**
 * 静态内部类单例
 *
 * @author roger
 * @date 2018/9/25
 */
public class StaticInnerClassSingleton {


    private StaticInnerClassSingleton() {
    }

    private static class InnerHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static final StaticInnerClassSingleton instance() {
        return InnerHolder.INSTANCE;
    }
}
