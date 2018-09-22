package com.cicinnus.spring.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 黄牛,动态代理对象
 *
 * @author roger
 * @date 2018/9/22
 */
public class TicketScalper implements MethodInterceptor {

    public Object getInstnce(String className) throws ClassNotFoundException {
        Enhancer enhancer = new Enhancer();
        Class<?> aClass = Class.forName(className);
        enhancer.setSuperclass(aClass);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    /**
     * 字节码重组
     * 对于API使用者来说无感知,不需要创建接口
     *
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("黄牛买票----");
        System.out.println("加价200");

        proxy.invokeSuper(obj, args);
        System.out.println("成交");
        return null;
    }
}
