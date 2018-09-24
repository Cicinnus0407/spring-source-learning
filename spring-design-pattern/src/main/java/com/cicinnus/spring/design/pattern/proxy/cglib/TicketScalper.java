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
        //通过全路径类名反射获取类
        Class<?> aClass = Class.forName(className);
        //设置生成子类的的父类
        enhancer.setSuperclass(aClass);
        //回调
        enhancer.setCallback(this);
        //1.生成源代码
        //2.编译成class字节码
        //3.动态加载到JVM,并返回代理对象
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
        //cglib不会直接持有被代理对象的引用
        //这里的obj对象实际上是被代理对象的子类,而子类在实例化的时候会优先实例化父类,
        //所以就间接持有了被代理对象的引用
        //cglib生成的子类会重写父类的所有方法
        proxy.invokeSuper(obj, args);
        System.out.println("成交");
        return null;
    }
}
