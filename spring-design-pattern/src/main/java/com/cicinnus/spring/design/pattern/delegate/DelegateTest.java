package com.cicinnus.spring.design.pattern.delegate;

/**
 * 委派模式,
 * 调用方无需考虑被委派对象的所有功能和方法,只需要考虑使用委派对象.
 * 只关心结果,不关心过程.
 * 委派对象和被委派对象之间只存在组合关系,不存在继承和实现关系
 * @author roger
 * @date 2018/9/25
 */
public class DelegateTest {
    public static void main(String[] args) {
        DelegateObj delegateObj = new DelegateObj();
        delegateObj.method1();
        delegateObj.method2();
    }
}
