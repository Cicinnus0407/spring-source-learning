package com.cicinnus.spring.design.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 中介/代理人
 *
 * @author roger
 * @date 2018/9/22
 */
public class Agent implements InvocationHandler {

    private Renter renter;

    /**
     * 获取租客的信息
     *
     * @param targetRenter 被代理对象
     * @return
     */
    public Object getInstance(Renter targetRenter) {
        this.renter = targetRenter;
        Class renterClass = targetRenter.getClass();

        System.out.println("被代理对象====" + renterClass);

        return Proxy.newProxyInstance(renterClass.getClassLoader(), renterClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理查询合适的房子");
        String name = renter.getName();
        Double budget = renter.budget();
        System.out.println("租客是: " + name);
        System.out.println("预算是: " + budget);
        System.out.println("--------------");

        method.invoke(renter, args);
        System.out.println("--------------");
        System.out.println("合适就签约");
        return null;
    }
}
