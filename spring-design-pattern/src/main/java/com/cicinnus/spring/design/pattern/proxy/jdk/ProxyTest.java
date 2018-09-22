package com.cicinnus.spring.design.pattern.proxy.jdk;

/**
 * 动态代理测试类
 *
 * @author roger
 * @date 2018/9/22
 */
public class ProxyTest {

    public static void main(String[] args) {
        Roger roger = new Roger("r09ger", 3000.0);
        Renter instance;
        try {
            Agent agent = new Agent();
            instance = (Renter) agent.getInstance(roger);
            System.out.println("真正调用对象===" + instance.getClass());
            instance.rentHouse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //动态代理的原理
        //1.拿到被代理对象的引用,获取代理对象的接口
        //2.JDK代理重新生成一个一个类,同时实现被代理对象的接口
        //3.获取到被代理对象的引用
        //4.动态生成Class字节码
        //5.编译

    }
}
