package com.cicinnus.spring.design.pattern.proxy.cglib;

/**
 * @author roger
 * @date 2018/9/22
 */
public class CglibProxtTest {

    public static void main(String[] args) {
        //找黄牛买票
        try {

            Buyer buyer = (Buyer) new TicketScalper().getInstnce("com.cicinnus.spring.design.pattern.proxy.cglib.Buyer");

            buyer.buyTicket();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //JDK中Proxy的动态代理是通过接口强制转换的
        //生成之后的代理对象可以强转为接口

        //cglib的动态代理是通过生成被代理对象子类,重写父类方法
        //生成之后的代理对象可以强转为代理对象,子类引用赋值给父类[多态]

    }
}
